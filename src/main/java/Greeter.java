public class Greeter {

    private String name = "Raluca";
    public Greeter (String name){
        this.name=name;
    }
    public String getName()

    {
        return name;

    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String sayHello()
    {
        if (name.equals(name))
        {
            return "Hello!";

        }

        else
        {
            return "Hello " + name + "!";

        }
    }
}