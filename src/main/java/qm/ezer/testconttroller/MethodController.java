package qm.ezer.testconttroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MethodController {

		@RequestMapping("get-method")
		public String testGet() {
			return "Get Method";
		}
}
