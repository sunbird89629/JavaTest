import java.lang.reflect.Proxy;

public class Class1 implements Class1Interface {
    @Override
    public void test() {
        System.out.println("this is test method......");
    }

    public static void main(String[] args) {
        Class1Interface target = new Class1();
        Class1Interface proxyTarget = (Class1Interface) Proxy.newProxyInstance(target.getClass().getClassLoader(), Class1.class.getInterfaces(), new InvocationHandlerForTest(target));
        proxyTarget.test();
    }
}
