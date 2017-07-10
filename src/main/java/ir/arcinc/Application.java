package ir.arcinc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by tahae on 7/10/2017.
 */
@SpringBootApplication
public class Application implements CommandLineRunner{
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        String[] beans = ctx.getBeanDefinitionNames();
        Arrays.sort(beans, Comparator.comparing(String::toLowerCase));
        for (int i = 0; i < beans.length; i++)
            System.out.println(i + 1 + ") " + beans[i]);
    }

    @Override
    public void run(String... strings) throws Exception {

    }
}
