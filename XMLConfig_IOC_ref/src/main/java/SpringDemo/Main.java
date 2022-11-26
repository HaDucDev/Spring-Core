package SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld a= (HelloWorld) context.getBean("hello");// phai ep kiêu vì nó trả ra có kiểu dữ liệu là Object
        a.hello();

    }
}
