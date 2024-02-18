package com.example.StateInfo.Controller;

import com.example.StateInfo.Entity.State;
import com.example.StateInfo.Service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.naming.InsufficientResourcesException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/state")
public class StateController {

    @Autowired
    private StateService stateService;

    @PostMapping("/save")
    public ResponseEntity<State> saveState(@RequestBody State state)
    {
         stateService.saveStudent(state);
        return  new ResponseEntity<State>(state, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<State> updateState(@RequestBody State state)
    {
        stateService.saveStudent(state);
        return  new ResponseEntity<State>(state, HttpStatus.OK);
    }
    @GetMapping("/findAllStates")
    public ResponseEntity<List<State>> findAllState()
    {
        List<State> states = stateService.findAllStudents();
        return new ResponseEntity<>(states,HttpStatus.OK);
    }


    @GetMapping("/findById/{id}")
    public Optional<State> findById(@PathVariable("id") Integer id)
    {
        Optional<State> state = Optional.ofNullable(stateService.findById(id));
        return  state;
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id)
    {
        stateService.deleteById(id);
    }
@GetMapping("/findByName/{name}")
    public ResponseEntity<List<State>> findByName(@PathVariable("name") String name) {
    List<State> s= stateService.findByName(name);
  return new ResponseEntity<List<State>>(s,HttpStatus.OK);
    }
    @GetMapping("findByGrade/{grade}")
    public ResponseEntity< List<State>> findByGrade(@PathVariable("grade") String grade)
    {
        List<State> s = stateService.findByGrade(grade);
        return  new ResponseEntity<>(s,HttpStatus.OK);
    }
@GetMapping("findByGdpBetween/{a}/{b}")
    public ResponseEntity<List<State>> findByGdpBetween(@PathVariable Integer a,@PathVariable Integer b) {
        return new ResponseEntity<List<State>>( stateService.findByGdpBetween(a,b),HttpStatus.OK);
    }






}
