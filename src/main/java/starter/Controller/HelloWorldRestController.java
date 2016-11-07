package starter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sunyh on 2016/11/6.
 */
@RestController
public class HelloWorldRestController {

    @GetMapping("/")
    public String helloWorld(){
        return "Hello World";
    }
}
