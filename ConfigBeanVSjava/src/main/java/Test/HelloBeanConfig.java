package Test;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class HelloBeanConfig {
    @Bean
    public Hello hello() {
        Hello a = new Hello();
        a.setMessage("ok roi chu");
        return a;
    }
}

