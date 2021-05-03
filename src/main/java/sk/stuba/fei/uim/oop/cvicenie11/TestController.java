package sk.stuba.fei.uim.oop.cvicenie11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello world";
    }
}
