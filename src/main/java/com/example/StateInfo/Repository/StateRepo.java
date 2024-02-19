package com.example.StateInfo.Repository;

import com.example.StateInfo.Entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StateRepo extends JpaRepository<State,Integer> {


    public List<State> findByName(String name);

    public List<State> findByGrade(String grade);

    public List<State> findByGdpBetween(Integer a,Integer b);

    public List<State> findByGradeBetween(String a,String b);
}
