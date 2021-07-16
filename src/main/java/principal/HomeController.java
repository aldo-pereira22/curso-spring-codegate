package principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/teste")
	public String homeApp(Model model) {
		
		model.addAttribute("mensagem", "Esta foi uma mensagem injetada  atraves do model");
		return "index";
	}
}
