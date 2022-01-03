package ca.cmpt213.a4.client.model;

import java.time.LocalDateTime;

/**
 * Interface consisting of abstract methods
 * Extends to comparable
 */
public interface Consumable extends Comparable<Consumable> {
    String getName();

    String getNotes();

    double getPrice();

    double getSize();

    int getChoice();

    String getExpiryDate();

    long expiringDays();
}
