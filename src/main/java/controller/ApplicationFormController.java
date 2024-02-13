package controller;

import entity.ApplicationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ApplicationFormService;

@Controller
@RequestMapping("/application-form")
public class ApplicationFormController {
    private final ApplicationFormService applicationFormService;

    public ApplicationFormController(ApplicationFormService applicationFormService) {
        this.applicationFormService = applicationFormService;
    }

    @PostMapping("/create")
    public ResponseEntity<ApplicationForm> createApplicationForm(){
        return null;
    }

    @GetMapping("/confirmation")
    public ResponseEntity<String> applicationConfirmation(){
        return null;
    }

    @DeleteMapping
    public ResponseEntity<Void> removeApplicationForm(){
        return null;
    }


}
