package dynamicproxies;

import java.lang.reflect.Proxy;

import dynamicproxies.logging.LoggingInvocationHandler;
import dynamicproxies.proxiables.Vegetable;

public class VegetableProxyFactory {

    public static Vegetable createProxy(Vegetable target) {
        return (Vegetable) Proxy.newProxyInstance(
                Vegetable.class.getClassLoader(),
                new Class[] {Vegetable.class},
                new LoggingInvocationHandler(target));
    }
}
