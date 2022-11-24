package Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String[] args) {
        //BeanFactory beanFactory= new XmlBeanFactory(new ClassPathResource("beans.xml"));

        // tao factory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // doc thong thong tin file cau hinh va gan no vo factory
        XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(new ClassPathResource("beans.xml"));

        Hello a = (Hello) beanFactory.getBean("helloWorld");
        a.getMessage();
    }
}
