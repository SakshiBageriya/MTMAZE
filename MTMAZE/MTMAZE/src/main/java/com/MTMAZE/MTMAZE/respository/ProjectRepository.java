package com.MTMAZE.MTMAZE.respository;

import com.MTMAZE.MTMAZE.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
    Project findByName(String name);
}
