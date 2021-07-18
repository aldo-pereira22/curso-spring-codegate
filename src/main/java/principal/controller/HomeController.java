package principal.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String login(@AuthenticationPrincipal UserDetails userDetails) {
		
		System.out.println(userDetails);
		return "login";
	}
}
