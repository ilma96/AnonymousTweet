package App.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Replies {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(length=300)
    String body;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="commentId", nullable = false) // A reply SHOULD have a comment that it is joined with
    private Comment comments;
    // Many replies are in one comment
}
