package tengo.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping({ "/", "index" })
	public String index() {
		return "home_index";
	}

	@RequestMapping({ "about" })
	public String about() {
		return "home_about";
	}
}
