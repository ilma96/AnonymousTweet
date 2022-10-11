package App.controller;

import App.model.Comment;
import App.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController

public class CommentController {
    CommentService cs;
    @Autowired
    public CommentController(CommentService cs){
        this.cs = cs;
    }

    /**
     *
     * @return All comments
     */
    @GetMapping("comments")
    public List<Comment> getAllComments(){
        return cs.getAllComments();
    }

    /**
     *
     * @param c (Comment Object)
     * @return JSON body
     */
    @PostMapping("comments")
    public Comment addComment(@RequestBody Comment c){
        return cs.addComment(c);
    }
}
