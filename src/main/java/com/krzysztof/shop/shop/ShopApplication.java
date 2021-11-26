package com.krzysztof.shop.shop;

import com.krzysztof.shop.shop.model.*;
import com.krzysztof.shop.shop.repository.UserReposiotry;
import com.krzysztof.shop.shop.security.ApplicationUserRole;
import com.krzysztof.shop.shop.service.*;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import java.util.List;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserReposiotry.class)
public class ShopApplication implements ApplicationRunner {


    private final AuthorService authorService;
    private final CategoryService categoryService;
    private final ProductService productService;
    private  final UserService userService;
    private  final BasketService basketService;
    private final ProductOrderToBasketService productOrderToBasketService;
    private final AddressService addressService;

    public ShopApplication(AuthorService authorService, CategoryService categoryService, ProductService productService, UserService userService, BasketService basketService, ProductOrderToBasketService productOrderToBasketService, AddressService addressService) {
        this.authorService = authorService;
        this.categoryService = categoryService;
        this.productService = productService;
        this.userService = userService;
        this.basketService = basketService;
        this.productOrderToBasketService = productOrderToBasketService;
        this.addressService = addressService;
    }

    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {


    }
}
