package expecto_codum.k_t_d;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/* aqui falta hacer que cargue el home.html*/
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model) {


        return "Index"; //view
    }


}


