package com.example.ProductDetails;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Table(name = "product_details")
public class ProductDetail {
    @Id
    @Column(name = "id_product_details", nullable = false)
    private Integer id;

    @Column(name = "product_details_name", nullable = false, length = 45)
    private String productDetailsName;

    @Column(name = "product_details_description", length = 45)
    private String productDetailsDescription;

    @Column(name = "product_details_reviews", length = 45)
    private String productDetailsReviews;

    @Column(name = "product_details_cost", precision = 10, scale = 2)
    private BigDecimal productDetailsCost;


    @Lob
    @Column(name = "product_details_currency")
    private String productDetailsCurrency;

    @Lob
    @Column(name = "product_details_category")
    private String productDetailsCategory;

    @Lob
    @Column(name = "product_details_image")
    private String productDetailsImage;

}