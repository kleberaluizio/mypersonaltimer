package com.mypersonaltimer.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_task")
    private Integer id;
    @Column(name = "task_name", length = 70, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "tbl_product_id_project")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "tbl_user_id_user")
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
