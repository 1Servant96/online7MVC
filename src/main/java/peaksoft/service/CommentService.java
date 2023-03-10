package peaksoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.model.Comment;
import peaksoft.repository.CommentRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CommentService {

    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void saveComment(Long id, Comment comment) {
        commentRepository.saveComment(id, comment);
    }

    public List<Comment> getAllComments(Long id) {

        return commentRepository.getAllComments(id);
    }

}
