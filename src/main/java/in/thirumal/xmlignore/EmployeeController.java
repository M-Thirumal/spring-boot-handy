/**
 * 
 */
package in.thirumal.xmlignore;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Thirumal
 *
 */
@RestController
@RequestMapping("/xml-ignore")
public class EmployeeController {

	@GetMapping("")
	public Employee getEmployeeJson() {
		return Employee.builder().id(1L).name("Thirumal").dob(LocalDate.now()).build();
	}
	
}
