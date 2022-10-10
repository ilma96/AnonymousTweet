package App.repository;

import App.model.Replies;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReplyRepository extends JpaRepository<Replies, Integer> {
    List<Replies> findAllById(int id);
}
