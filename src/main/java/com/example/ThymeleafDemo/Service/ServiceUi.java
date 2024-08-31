package com.example.ThymeleafDemo.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import com.example.ThymeleafDemo.Model.Student;
import com.example.ThymeleafDemo.repository.Repository;
@Service
public class ServiceUi {
	@Autowired
	private Repository rep;
	
public ServiceUi(Repository rep) {
	this.rep = rep;
}

	public String sendRequest(Model model) {
		Student student = new Student();
		model.addAttribute("students",student);
		return "home";
	}
	
	public String receiveRequest( Student student,Model model) {
		String text = "THE TOTAL OF THE NUMBER WHICH HAVE GIVEN BY YOU ";
		String Variable1 = student.getName1();
		String Variable2 = student.getName2();
	
		 String result1 = Variable1.substring(0, 1).toUpperCase() + Variable1.substring(1).toLowerCase();
		 String result2 = Variable2.substring(0, 1).toUpperCase() + Variable2.substring(1).toLowerCase();
	
	 
	  student.setName1(result1);
      student.setName2(result2);
     rep.save(student);
     model.addAttribute("name", result1 + " " + result2);
     model.addAttribute("texts", text);

	model.addAttribute("texts",text);
	System.out.println(result1 + result2);
		return "welcome";
	}

}
