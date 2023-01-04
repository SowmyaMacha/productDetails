package com.example.OrderDetails;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Table(name = "order_details")
public class OrderDetail {
    @Id
    @Column(name = "id_order_details", nullable = false)
    private Integer orderDetailsId;

    @Temporal(TemporalType.DATE)
    @Column(name = "order_details_order_date")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date orderDetailsOrderDate;

    @Column(name = "order_details_tracking_id", length = 15)
    private String orderDetailsTrackingID;

    @Column(name = "order_details_total_cost", precision = 10, scale = 2)
    private BigDecimal orderDetailsTotalCost;


    @Lob
    @Column(name = "order_details_currency")
    private String orderDetailsCurrency;

}