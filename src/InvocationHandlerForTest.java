import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvocationHandlerForTest implements InvocationHandler {

    private Object target;

    public InvocationHandlerForTest(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("日志开始");
        Object result = method.invoke(target, args);
        System.out.println("日志结束");
        return result;
    }
}
