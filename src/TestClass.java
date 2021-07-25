import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class TestClass {
    private String name;

    public TestClass() {
        name = "baobao";
    }

    public TestClass(int a) {

    }

    public TestClass(int a, String b) {
        name = b;
    }

    private TestClass(int a, double c) {
    }

    public static void main(String[] args) {
        TestClass r = new TestClass();
        Class temp = r.getClass();
        String className = temp.getName();

        try {
            Constructor[] theConstructors = temp.getDeclaredConstructors();
            for (Constructor theConstructor : theConstructors) {
                int mod = theConstructor.getModifiers();
                theConstructor.getParameterTypes();
                for (Parameter parameter : theConstructor.getParameters()) {
                    System.out.println(String.format("parameter:%s=%s", parameter.getName(), parameter.getType()));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
