package interfaces;

import other.*;

public interface Stand {
    public void stand(Entity smth, boolean neg);
    public void stand_where(Entity smth, Places place, boolean neg);
    //public void stand_where(Thing smth, boolean neg);
}
