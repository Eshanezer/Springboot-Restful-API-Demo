package qm.ezer.jsoncontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import qm.ezer.model.Student;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/student")
	public List<Student> getStudentListJSON() {
		return studentService.getAllStudents(); 	
	}
	
	@RequestMapping("/student/{id}")
	public Student getById(@PathVariable String id) {
		return studentService.getById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/student")
	public void addStudent(@RequestBody Student student) {
		studentService.add(student);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/student/{id}")
	public void updateStudent(@RequestBody Student student,@PathVariable String id) {
		studentService.update(id,student);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/student/{id}")
	public void deleteStudent(@PathVariable String id) {
		studentService.delete(id);
	}
}
