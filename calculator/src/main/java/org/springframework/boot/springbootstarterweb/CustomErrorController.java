import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomErrorController implements ErrorController {

    @GetMapping("/error")
    public String handleError() {
        return "Sorry, an error occurred. Please try again later.";
    }

    public String getErrorPath() {
        return "/error";
    }
}