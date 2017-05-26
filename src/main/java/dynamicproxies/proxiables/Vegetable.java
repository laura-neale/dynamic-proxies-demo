package dynamicproxies.proxiables;

import dynamicproxies.logging.Loggable;

public interface Vegetable {

    @Loggable
    void bake();

    void eat();

}
