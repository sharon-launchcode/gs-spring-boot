package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        // return "Greetings from Spring Boot, You Fine Woman You!";
        return "<h1>Hello this time with an h1 tag</h1>";
    }
    
}
