package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertMoneyController {
    @GetMapping("/home")
    public String home(){
        return "index";
    }
    @GetMapping("/converting")
    public String converting(@RequestParam String money, @RequestParam String rate, Model model){
        double moneyValue=Double.parseDouble(money);
        double rateValue=Double.parseDouble(rate);
        double convertValue=moneyValue*rateValue;
        model.addAttribute("convert",convertValue);

        return "index";
    }
}
