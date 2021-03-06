package com.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by takahiro on 2016/12/22.
 */
@Entity
public class Question {
    @Id
    @GeneratedValue
    @Column(name = "questionId")
    private int id;
    @Column(nullable = false)
    private String question;
    @Column
    private String answer;
    @Column
    private int point;
    @Column
    private String chapter;
    @Column
    private int type;
    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE},
            fetch = FetchType.LAZY,
            mappedBy = "questionSet")
    private Set<Paper>papers;

    public Question(){}

    public Question(String question, String answer, int point,
                    String chapter, int type, Set<Paper> papers) {
        this.question = question;
        this.answer = answer;
        this.point = point;
        this.chapter = chapter;
        this.type = type;
        this.papers = papers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Set<Paper> getPapers() {
        return papers;
    }

    public void setPapers(Set<Paper> papers) {
        this.papers = papers;
    }
}
