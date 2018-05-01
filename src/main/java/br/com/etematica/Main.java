package br.com.etematica;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final Log LOGGER = LogFactory.getLog(Main.class);

    private Main(){
    }

    public static void main(String[] args) {
        final AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:META-INF/spring/integration/*.xml");
/*
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "/META-INF/spring/integration/pyramidTrd.xml");
*/
        context.registerShutdownHook();

        System.out.println("temp:" + System.getProperty("java.io.tmpdir"));
        while (true){

        }

    }
}
