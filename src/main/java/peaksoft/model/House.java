package peaksoft.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10000)
    private String name;

    @Column(length = 10000)
    private String image;
    @Column(length = 10000)
    private int price;

    @Column(length = 10000)
    private String description;

    @Column(length = 10000)
    private String address;

    @Column(length = 10000)
    private int person;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "house")
    private List<Comment> comments;

    public void addComment(Comment comment){
        if(comments == null){
            comments = new ArrayList<>();
        }
        comments.add(comment);
    }
}
