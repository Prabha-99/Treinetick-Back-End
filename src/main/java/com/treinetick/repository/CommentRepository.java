package com.treinetick.repository;

import com.treinetick.model.ActivityLog;
import com.treinetick.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, String> {
//    Optional<User> findByProjectID(String projectID);
}
