## Dynamic Proxies

This project is a simple demonstration of dynamic proxies in java. Proxied objects are created using a factory. The Proxy intercepts calls made to the object and handles them using a `LoggingInvocationHandler`. This checks if the methods are annotated with the `Loggable` annotation. If they are, it logs it. In either case, the method is executed.