package Assistantproject.assistantcode.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Assistantproject.assistantcode.Model.Assistant;

@Repository
public interface AssistantRepository extends JpaRepository<Assistant, Integer>{
// all curd database methods
}
