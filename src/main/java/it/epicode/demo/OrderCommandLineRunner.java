package it.epicode.demo;

import it.epicode.demo.entities.Menu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OrderCommandLineRunner implements CommandLineRunner {
    private Menu menu;

    @Autowired
    public void FrontMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Menu: " + menu);
    }
}