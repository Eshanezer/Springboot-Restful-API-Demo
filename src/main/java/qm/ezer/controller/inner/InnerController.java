package qm.ezer.controller.inner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InnerController {
	@RequestMapping("inner-controller")
	public String innerController() {
		return "Inner Controller Working";
	}
}
