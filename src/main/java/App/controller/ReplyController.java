package App.controller;

import App.model.Replies;
import App.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class ReplyController {
    ReplyService rs;
    @Autowired
    public ReplyController(ReplyService rs){
        this.rs = rs;
    }

    /**
     *
     * @return All replies
     */
    @GetMapping("replies")
    public List<Replies> getAllReplies(){
        return rs.getAllReplies();
    }

    /**
     *
     * @param id (commentId)
     * @return All replies by the commentId
     */
    @GetMapping("replies/{id}")
    public List<Replies> getAllRepliesByCommentId(@PathVariable("id") int id){
        return rs.getAllRepliesByCommentId(id);
    }

    /**
     *
     * @param id (commentId)
     * @param r (Replies Object)
     * @return the JSON body
     */
    @PostMapping("replies/{id}")
    public Replies addReply(@PathVariable("id") int id, @RequestBody Replies r){
        return rs.addReply(id, r);
    }
}
