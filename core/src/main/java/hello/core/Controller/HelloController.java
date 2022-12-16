package hello.core.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "World!!");
        return "hello";

    }
    @GetMapping("hello1")
    @ResponseBody
    public String hello1(Model model) {
        return "hello1 world!!";
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Product helloApi(
            @RequestParam("name") String name,
            @RequestParam("price") int price,
            @RequestParam("stock") int stock) {
        Product water = new Product();
        water.setName(name);
        water.setPrice(price);
        water.setStock(stock);

        return water;


    }
}
