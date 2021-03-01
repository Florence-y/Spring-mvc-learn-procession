package HellowworldTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HellowWorldTest {
    @Test
    public void testGetBean(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");
        Object bean = ioc.getBean("person9");
        System.out.println(bean);
    }
}
