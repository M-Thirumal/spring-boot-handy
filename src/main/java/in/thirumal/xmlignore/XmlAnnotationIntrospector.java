package in.thirumal.xmlignore;

import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector;

public class XmlAnnotationIntrospector extends JacksonXmlAnnotationIntrospector {
    /**
	 * 
	 */
	private static final long serialVersionUID = 851961054555663800L;

	@Override
    public boolean hasIgnoreMarker(AnnotatedMember m) {
		if (m.hasAnnotation(XmlIgnore.class) || super.hasIgnoreMarker(m)) {
			System.out.println(m.getName());
			return true;
		} else if (m.getAllAnnotations().has(XmlIgnore.class)) {
			System.out.println(m.getName());
			return true;
		} else {
			m.getAllAnnotations().annotations().forEach(System.out::println);
			return false;
		}
      //  return m.hasAnnotation(XmlIgnore.class) || super.hasIgnoreMarker(m);
    }
}
