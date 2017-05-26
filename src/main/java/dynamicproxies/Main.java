package dynamicproxies;

import dynamicproxies.proxiables.Vegetable;
import dynamicproxies.proxiables.Potato;

public class Main {

    public static void main(String[] args) {
        Vegetable potato = VegetableProxyFactory.createProxy(new Potato());
        potato.bake();
        potato.eat();
    }
}
