package qm.ezer.jsoncontroller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import qm.ezer.model.Student;

@Service
public class StudentService {

	private List<Student> students = new ArrayList<>(Arrays.asList(new Student("1", "Eshan", 23),
			new Student("2", "Dilmina", 23), new Student("3", "Wijesinghe", 23)));

	public List<Student> getAllStudents() {
		return students;
	}

	public Student getById(String id) {
		return students.stream().filter(s -> s.getId().equals(id)).findFirst().get();
	}

	public void add(Student student) {
		students.add(student);
	}

	public void update(String id, Student student) {
		for (int i = 0; i < students.size(); i++) {
			Student s = students.get(i);
			if (s.getId().equals(id)) {
			students.set(i,student);
			return;
			}
		}
	}

	public void delete(String id) {
		students.removeIf(s-> s.getId().equals(id));
	}
}
