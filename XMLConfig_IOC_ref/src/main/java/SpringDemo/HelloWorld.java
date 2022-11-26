package SpringDemo;

public class HelloWorld {
    private  String name;
    private Laguage laguage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HelloWorld() {
    }

    public HelloWorld(String name) {
        this.name = name;
    }

    public SpringDemo.Laguage getLaguage() {
        return laguage;
    }

    public void setLaguage(Laguage laguage) {
        this.laguage = laguage;
    }

    public void hello(){
        System.out.printf("Hello %s + Language %s \n",this.name, this.laguage.getLang());
    }

    public HelloWorld(String name, Laguage laguage) {
        this.name = name;
        this.laguage = laguage;
    }
}
