package aPackage;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class hey {
		
	@RequestMapping (method= RequestMethod.GET, path="/servlet")
	public String plus(String fname, String lname, String country) {
		return fname + " " + lname + " " + country;
	}
}
