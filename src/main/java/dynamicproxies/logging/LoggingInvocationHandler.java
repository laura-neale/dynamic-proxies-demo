package dynamicproxies.logging;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingInvocationHandler implements InvocationHandler {

    private Object target;

    public LoggingInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getAnnotation(Loggable.class) != null || target.getClass().getAnnotation(Loggable.class) != null) {
            System.out.println(" >> Executing method: " + method.getName());
            Object result = method.invoke(target, args);
            System.out.println(" >> Method complete: " + method.getName());
            return result;
        } else {
            return method.invoke(target, args);
        }
    }
}
