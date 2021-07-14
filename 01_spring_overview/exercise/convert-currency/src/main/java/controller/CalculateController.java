package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculateController {
    @GetMapping("/")
    public String showCalculate() {
        return "index";
    }

    @GetMapping("/calculate")
    public String calculateController(@RequestParam int usdInput, Model model) {
        double usd = usdInput;
        double vnd = usd * 23000;
        model.addAttribute("usdInput", usdInput);
        model.addAttribute("vnd", vnd);
        return "index";
    }
}
