package com.example.StateInfo.Service;

import com.example.StateInfo.Entity.State;

import java.util.List;

public interface StateService {

    public State saveStudent(State state);

    public State updateStudent(State state);

    public List<State> findAllStudents();

    public State findById(Integer id);

    public void deleteById(Integer id);

    public List<State> findByName(String name);

    public List<State> findByGrade(String grade);

    public List<State> findByGdpBetween(Integer a,Integer b);
}
