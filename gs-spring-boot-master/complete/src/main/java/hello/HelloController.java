package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        // return "Greetings from Spring Boot, You Fine Woman You!";
        return "<iframe src='https://console.dialogflow.com/api-client/demo/embedded/2826f62d-5973-4ab8-b5c8-84a4d026e807'></iframe>";
    }
    
}
