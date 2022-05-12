package egovframework;

import egovframework.com.config.EgovWebApplicationInitializer;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Import;

@ServletComponentScan
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@Import({EgovWebApplicationInitializer.class})
public class EgovBootApplication {
	public static void main(String[] args) {
		System.out.println("##### EgovBootApplication Start #####");

		SpringApplication springApplication = new SpringApplication(EgovBootApplication.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		//springApplication.setLogStartupInfo(false);
		springApplication.run(args);

		System.out.println("##### EgovBootApplication End #####");
	}

}
