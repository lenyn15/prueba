package academic.system.academy.repository;

import academic.system.academy.entity.Grade;
import academic.system.academy.entity.Level;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Integer> {
    List<Grade> findByLevel( Level level );

    Grade findByName( String name );
}
