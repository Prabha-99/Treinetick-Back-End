package com.treinetick.repository;

import com.treinetick.model.ActivityLog;
import com.treinetick.model.Milestone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MilestoneRepository extends JpaRepository<Milestone, String> {
//    Optional<User> findByProjectID(String projectID);
}

