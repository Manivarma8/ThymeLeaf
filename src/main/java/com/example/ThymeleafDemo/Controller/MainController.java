package com.example.ThymeleafDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ThymeleafDemo.Model.Student;
import com.example.ThymeleafDemo.Service.ServiceUi;
@Controller
public class MainController {
	@Autowired
	private ServiceUi serve;
	public MainController() {};
	
	public MainController(ServiceUi serve) {
	this.serve = serve;
	}

	@GetMapping("/home")
	public String home(Model model) {
	
		return serve.sendRequest(model);
	}

	@PostMapping("/welcome")
	public String welcome(@ModelAttribute Student student, Model model) {
	
	return serve.receiveRequest(student,model);
		}
}
