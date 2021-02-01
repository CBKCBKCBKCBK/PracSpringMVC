package tw.com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class IndexController {
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("main/mainpage");

		return view;
	}

	@RequestMapping("/indexh")
	public ModelAndView indexHtml() {
		ModelAndView view = new ModelAndView("indexh");

		return view;
	}
}
