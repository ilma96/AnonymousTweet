package App.service;

import App.model.Comment;
import App.model.Replies;
import App.repository.ReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReplyService {
    CommentService cs;
    ReplyRepository rr;
    @Autowired
    public ReplyService(ReplyRepository rr, CommentService cs){
        this.rr = rr;
        this.cs = cs;
    }
    public List<Replies> getAllReplies(){
        return rr.findAll();
    }
    public List<Replies> getAllRepliesById(int id){
        return rr.findAllById(id);
    }
    public Replies addReply(int id, Replies r){
        Comment c = cs.getCommentId(id);
        r.setComments(c);
        return rr.save(r);
    }
}
