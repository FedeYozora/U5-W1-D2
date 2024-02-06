package it.epicode.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OrderCommandLineRunner implements CommandLineRunner {
    @Autowired
    private AnnotationConfigApplicationContext ctx;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(ctx.getBean("order1"));
        System.out.println(ctx.getBean("menuCompleto"));
        ctx.close();
    }
}