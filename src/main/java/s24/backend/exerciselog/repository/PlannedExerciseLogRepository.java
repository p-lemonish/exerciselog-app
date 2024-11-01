package s24.backend.exerciselog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import s24.backend.exerciselog.domain.entity.PlannedExerciseLog;
import s24.backend.exerciselog.domain.entity.User;

import java.util.*;


public interface PlannedExerciseLogRepository extends JpaRepository<PlannedExerciseLog, Long> {
    List<PlannedExerciseLog> findByUser(User user);
}
