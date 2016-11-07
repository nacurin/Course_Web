package starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by Sunyh on 2016/11/6.
 */
@SpringBootApplication
public class test extends SpringBootServletInitializer {

    public static void main(String[] args){
        SpringApplication.run(test.class, args);
    }
}
