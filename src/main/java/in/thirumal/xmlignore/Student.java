/**
 * 
 */
package in.thirumal.xmlignore;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Thirumal
 *
 */
@NoArgsConstructor@AllArgsConstructor
@Getter@Setter
@ToString@Builder
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5244843987735297299L;
	@XmlIgnore
	private Long id;
	private String name;
	private LocalDate dob;
}
