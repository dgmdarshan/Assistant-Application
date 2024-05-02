package Assistantproject.assistantcode.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Assistantproject.assistantcode.Exception.ResourceNotFoundException;
import Assistantproject.assistantcode.Model.Assistant;
import Assistantproject.assistantcode.Repository.AssistantRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/assistants")
public class AssistantController {

	@Autowired
	private AssistantRepository assistantRepository; 
	
	
	@GetMapping()
	public List<Assistant> getALlAssistants(){	
		return assistantRepository.findAll();
	}
	//building rest apis for assistant
	
	//creating postmapping method to create new assistant data
	@PostMapping()
	public Assistant createAssistant(@RequestBody Assistant assistant) {
		return assistantRepository.save(assistant);
	}
	
	//build get assistant by id Rest APIs
	@GetMapping("{Id}")
	@ResponseBody
	public ResponseEntity<Assistant> getAssistantById(@PathVariable Integer Id){
		Assistant assistant=assistantRepository.findById(Id)
				.orElseThrow(()->new ResourceNotFoundException("Assistant not existt with id:"+Id));
				return ResponseEntity.ok(assistant);
	}
	//build update rest api using putmapping method
	@PutMapping("{Id}")
	public ResponseEntity<Assistant> updateAssistant(@PathVariable(value="Id") Integer Id, @RequestBody Assistant assistantDetails){
		Assistant updateAssistant=assistantRepository.findById(Id)
				.orElseThrow(()-> new ResourceNotFoundException("Assistant not exist with id:"+Id));
updateAssistant.setName(assistantDetails.getName());
updateAssistant.setMobile(assistantDetails.getMobile());
updateAssistant.setEmail(assistantDetails.getEmail());
updateAssistant.setSalary(assistantDetails.getSalary());	
updateAssistant.setCity(assistantDetails.getCity());
updateAssistant.setCountry(assistantDetails.getCountry());
updateAssistant.setDepartment(assistantDetails.getDepartment());
updateAssistant.setRole(assistantDetails.getRole());
assistantRepository.save(updateAssistant);
		return ResponseEntity.ok(updateAssistant);
	}
	//build delete rest api
	@DeleteMapping("{Id}")
	public ResponseEntity<HttpStatus> deleteAssistant(@PathVariable(value="Id") Integer Id){
		Assistant assistant=assistantRepository.findById(Id)
				.orElseThrow(()->new ResourceNotFoundException("Assistant not exist:"+Id));
		assistantRepository.deleteById(Id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
	}
	
}
