package Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(HelloBeanConfig.class);
        Hello a= (Hello) context.getBean("hello");
        a.getMessage();
        context.close();
    }
}
