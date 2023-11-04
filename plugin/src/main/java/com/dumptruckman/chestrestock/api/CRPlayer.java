package com.dumptruckman.chestrestock.api;

/**
 * An interface representing player specific data for a specific CRChest.
 */
public interface CRPlayer {

    /**
     * @return The number of times the player has caused the chest to restock.
     */
    int getLootCount();

    /**
     * @return The time at which the player last caused the chest to restock.
     */
    long getLastRestockTime();

    /**
     * Sets the number of times a player has caused the chest to restock.
     *
     * @param count The number of times a player has caused the chest to restock.
     */
    void setLootCount(int count);

    /**
     * Sets the time at which the player last caused the chest to restock.
     *
     * @param time The time at which the player last caused the chest to restock.
     */
    void setLastRestockTime(long time);
}
