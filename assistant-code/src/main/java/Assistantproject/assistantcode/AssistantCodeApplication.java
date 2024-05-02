package Assistantproject.assistantcode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Assistantproject.assistantcode.Model.Assistant;
import Assistantproject.assistantcode.Repository.AssistantRepository;

@SpringBootApplication
public class AssistantCodeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AssistantCodeApplication.class, args);
	}

	@Autowired
	private AssistantRepository assistantRepository;
	@Override
	public void run(String... args) throws Exception {
     Assistant assistant=new Assistant();
     assistant.setId(1);
     assistant.setName("Darshan");
     assistant.setMobile(91108383);
     assistant.setEmail("darshan123@gmail.com");
     assistant.setSalary(50000);
     assistant.setCity("Davangere");
     assistant.setCountry("India");
     assistant.setDepartment("IT");
     assistant.setRole("development");
     assistantRepository.save(assistant);
	}

}
