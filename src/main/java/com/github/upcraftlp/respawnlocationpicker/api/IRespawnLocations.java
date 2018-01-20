package com.github.upcraftlp.respawnlocationpicker.api;

import com.github.upcraftlp.respawnlocationpicker.util.TargetPoint4d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

/**
 * @author UpcraftLP
 */
public interface IRespawnLocations {

    List<TargetPoint4d> getRespawnLocations(int listLength);
    default void addRespawnLocation(BlockPos pos, int dimension, String name, boolean forced) {
        this.addRespawnLocation(new TargetPoint4d(pos, dimension, name, forced));
    }

    boolean addRespawnLocation(TargetPoint4d target);

    TargetPoint4d deleteRespawnLocation(int index);

    boolean deleteRespawnLocation(TargetPoint4d target);

    int getLocationCount();

    int clearRespawnLocations();

}