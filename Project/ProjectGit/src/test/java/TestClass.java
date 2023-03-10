import org.junit.*;

public class TestClass {
    @Test
    public void add()
    {
    NewClass onc=new NewClass(10,10);
    onc.add();
    }

    @Test
    public void multiply()
    {
        NewClass onc=new NewClass(10,10);
        onc.multiply();
    }

    @Test
    public void subtract()
    {
        NewClass onc=new NewClass(10,10);
        onc.subtract();
    }

    @Test
    public void addOne()
    {
        NewClass onc=new NewClass(11,12);
        onc.add();
    }
}
