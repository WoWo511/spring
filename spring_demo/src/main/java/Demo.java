import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class Demo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Demo.class);
		Object test = annotationConfigApplicationContext.getBean("test");
		System.out.println();
//		GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext();
//		genericXmlApplicationContext.load("");
//		genericXmlApplicationContext.refresh();
//		Object bean = genericXmlApplicationContext.getBean("");
	}
	@Bean
	public hh hh() {
		return new hh();
	}
	@Bean
	public test test() {
		return new test();
	}


}
