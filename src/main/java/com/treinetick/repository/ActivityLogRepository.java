package com.treinetick.repository;

import com.treinetick.model.ActivityLog;
import com.treinetick.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ActivityLogRepository extends JpaRepository<ActivityLog, String> {
//    Optional<User> findByProjectID(String projectID);
}

