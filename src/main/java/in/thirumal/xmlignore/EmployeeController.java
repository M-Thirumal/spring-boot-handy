/**
 * 
 */
package in.thirumal.xmlignore;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * @author Thirumal
 *
 */
@RestController
@RequestMapping("/xml-ignore")
public class EmployeeController {

	@GetMapping("/employee")
	public Employee getEmployeeJson() {
		return Employee.builder().id(1L).name("Thirumal").dob(LocalDate.now()).build();
	}
	
	@GetMapping("/generate")
	public String generateXMLUsingViews() throws JsonProcessingException {
		Employee employee = Employee.builder().id(1L).name("Thirumal").dob(LocalDate.now()).build();
		XmlMapper xmlMapper = new XmlMapper();
		//xmlMapper.setAnnotationIntrospector(new XmlAnnotationIntrospector());
		String xml = xmlMapper.writerWithView(Views.Default.class).withRootName("Emp")				
				.withDefaultPrettyPrinter().writeValueAsString(employee);
		System.out.println(xml);
		return xml;
	}
	
	@GetMapping("/generate-with-view")
	public String generateXMLWithViews() throws JsonProcessingException {
		Employee employee = Employee.builder().id(1L).name("Thirumal").dob(LocalDate.now()).build();
		XmlMapper xmlMapper = new XmlMapper();
		//xmlMapper.setAnnotationIntrospector(new XmlAnnotationIntrospector());
		String xml = xmlMapper.writerWithView(Views.Default.class).withRootName("Emp")				
				.withDefaultPrettyPrinter().writeValueAsString(employee);
		System.out.println(xml);
		return xml;
	}
	
	@GetMapping("/student")
	public Student getStudentJson() {
		return Student.builder().id(1L).name("Thirumal").dob(LocalDate.now()).build();
	}
	
	@GetMapping("/generate-with-xml-introspector")
	public String generateXMLWithIntrospector() throws JsonProcessingException {
		Student student = Student.builder().id(1L).name("Thirumal").dob(LocalDate.now()).build();
		XmlMapper xmlMapper = new XmlMapper();
		xmlMapper.setAnnotationIntrospector(new XmlAnnotationIntrospector());
		String xml = xmlMapper.writer().withRootName("Emp")				
				.withDefaultPrettyPrinter().writeValueAsString(student);
		System.out.println(xml);
		return xml;
	}
}

