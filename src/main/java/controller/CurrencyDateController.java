package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.CurrencyDateService;

@Controller
@RequestMapping("/currency-date")
public class CurrencyDateController {
    private final CurrencyDateService currencyDateService;

    public CurrencyDateController(CurrencyDateService currencyDateService) {
        this.currencyDateService = currencyDateService;
    }

    @PostMapping("/open-day")
    public ResponseEntity<String> openDay(){

        return null;
    }

    @GetMapping("/close-day")
    public ResponseEntity<String> closeDay(){

        return null;
    }

    @GetMapping("/list-report")
    public ResponseEntity<Void> listReport(){
        return null;
    }
}
