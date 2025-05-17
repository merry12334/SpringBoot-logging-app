package in.ashokit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {
	
	private Logger logger= LoggerFactory.getLogger(AppRestController.class);

	@GetMapping("/greet")
	public String greetMsg() {

		logger.debug("this is debug msg from greet.....");
		logger.info("greetMsg() execution started...");
		String msg = "Good Morning...";
		syste.out.println("hii,how are yoyu")

		logger.warn("This is warning from greet method...");

		logger.info("greetMsg() execution ended...");
		return msg;
	}

}
