package com.example.StateInfo.ServiceImpl;

import com.example.StateInfo.Entity.State;
import com.example.StateInfo.Repository.StateRepo;
import com.example.StateInfo.Service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateServiceImpl implements StateService {

    @Autowired
    private StateRepo stateRepo;
    @Override
    public State saveStudent(State state) {
        return stateRepo.save(state);
    }

    @Override
    public State updateStudent(State state) {
        return stateRepo.save(state);
    }

    @Override
    public List<State> findAllStudents() {
        return stateRepo.findAll();
    }

    @Override
    public State findById(Integer id) {

   State state=      stateRepo.findById(id).get();
         return  state;
    }

    @Override
    public void deleteById(Integer id) {
        stateRepo.deleteById(id);

    }

    @Override
    public List<State> findByName(String name) {
        return stateRepo.findByName(name);
    }

    @Override
    public List<State> findByGrade(String grade) {
        return stateRepo.findByGrade(grade);
    }

    @Override
    public List<State> findByGdpBetween(Integer a, Integer b) {
        return stateRepo.findByGdpBetween(a,b);
    }

    @Override
    public List<State> findByGradeBetween(String a, String b) {
        return stateRepo.findByGradeBetween(a,b);
    }
}
