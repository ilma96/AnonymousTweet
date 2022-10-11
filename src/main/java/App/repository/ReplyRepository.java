package App.repository;

import App.model.Replies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReplyRepository extends JpaRepository<Replies, Integer> {
    /**
     *
     * @param comment_id
     * @return all the replies that correspond to that comment_id
     */
    @Query(value="Select * From replies r where r.comment_id = ?1", nativeQuery = true)
    public List<Replies> getRepliesByCommentId(int comment_id);
}
