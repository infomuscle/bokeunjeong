package com.bokeunjeong.portfolio.model.entity;


import com.bokeunjeong.portfolio.model.composite.YearMonth;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Getter
@Entity
public class Project {

    @Id
    @Column(name = "project_id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "description")
    private String description;

    @Column(name = "client")
    private String client;

    @AttributeOverrides({
            @AttributeOverride(name = "year", column = @Column(name = "start_year")),
            @AttributeOverride(name = "month", column = @Column(name = "start_month"))
    })
    @Embedded
    private YearMonth startYearMonth;

    @AttributeOverrides({
            @AttributeOverride(name = "year", column = @Column(name = "end_year")),
            @AttributeOverride(name = "month", column = @Column(name = "end_month"))
    })
    @Embedded
    private YearMonth endYearMonth;

    @Column(name = "img")
    private String image;

    @Column(name = "url")
    private String url;

    @Column(name = "display")
    private Boolean display;

    @OneToMany(mappedBy = "project", fetch = FetchType.LAZY)
    private List<ProjectDetail> details;
}
