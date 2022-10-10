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
    @GetMapping("replies")
    public List<Replies> getAllReplies(){
        return rs.getAllReplies();
    }
    @GetMapping("replies/{id}")
    public List<Replies> getAllRepliesById(@PathVariable("id") int id){
        return rs.getAllRepliesById(id);
    }
    @PostMapping("replies/{id}")
    public Replies addReply(@PathVariable("id") int id, @RequestBody Replies r){
        return rs.addReply(id, r);
    }
}
