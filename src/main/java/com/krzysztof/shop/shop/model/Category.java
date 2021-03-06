package com.krzysztof.shop.shop.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Category {
    @Id
    @GeneratedValue
    private Long id;


    private String name;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    @OneToMany(mappedBy = "category" ,cascade = CascadeType.ALL,fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Category> categories = new ArrayList<>();

    @OneToMany(mappedBy = "category" , cascade = CascadeType.PERSIST,fetch = FetchType.LAZY,orphanRemoval = true)
    private List<Product> products = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    public Category(String name, Category category) {
        this.name = name;
        this.category = category;
    }


    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", categories=" + categories +
                '}';
    }
}
