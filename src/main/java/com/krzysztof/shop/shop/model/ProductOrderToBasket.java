package com.krzysztof.shop.shop.model;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProductOrderToBasket {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;


    private int quantity;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne()
    @JoinColumn(name = "basket_id")
    private Basket basket;

    private Double toPay;

    public ProductOrderToBasket(Person person, int quantity, Product product, Basket basket, Double toPay) {
        this.person = person;
        this.quantity = quantity;
        this.product = product;
        this.basket = basket;
        this.toPay = toPay;
    }

}
