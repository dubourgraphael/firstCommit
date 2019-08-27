package fr.formation.inti.beans;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
// il vient appliquer le Context et lui demande ce qu'il gerer comme Bean
      AbstractApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
// hello est l'id de applicationContext.xml
      HelloBeans hb = context.getBean("hello",HelloBeans.class);
      
      hb.hello();      
      context.close();
    }
    
}
