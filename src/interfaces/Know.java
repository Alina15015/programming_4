package interfaces;

import classes.Entity;
import enums.Moves;

public interface Know {
    void know(Moves move, Entity smth, boolean neg);
}
