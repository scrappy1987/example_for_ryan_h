package com.nationwide.individualproject.Repos;

import com.nationwide.individualproject.data.Speed;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface SpeedRepo extends JpaRepository<Speed, Integer> {
    ArrayList<Speed> findAll();
    ArrayList<Speed> findByTime(float T);
    ArrayList<Speed> findByTimeGreaterThan(float T);
    ArrayList<Speed> findByTimeGreaterThanEqual(float T);
    ArrayList<Speed> findByTimeLessThan(float T);
    ArrayList<Speed> findByTimeLessThanEqual(float T);
    ArrayList<Speed> findByTimeBetween(float T1, float T2);
    ArrayList<Speed> findByLocation(String L);
    ArrayList<Speed> findByClimber(String C);
}

