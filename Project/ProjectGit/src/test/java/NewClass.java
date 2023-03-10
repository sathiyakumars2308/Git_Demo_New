
public class NewClass {

    private int a;
    private int b;

    public NewClass()
    {
        this.a=10;
        this.b=100;
    }

    public NewClass(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void add()
    {
        int c=a+b;
       System.out.println("Addition of the value is : "+c);

    }

    public void multiply()
    {
        int c=a*b;
        System.out.println("Multiplied value is : "+c);

    }

    public void subtract()
    {
        int c=a-b;
        System.out.println("subtraction of the value is : "+c);
    }
}
