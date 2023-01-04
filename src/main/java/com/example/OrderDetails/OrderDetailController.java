package com.example.OrderDetails;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderDetailController {

    private final OrderDetailRepository orderDetailRepository;

    public OrderDetailController(OrderDetailRepository orderDetailRepository){
        this.orderDetailRepository = orderDetailRepository;
    }

    @GetMapping(value = "/{id}")
    public Optional<OrderDetail> getOrderDetail(@PathVariable int id){
        Optional<OrderDetail> orderDetail = orderDetailRepository.findById(id);
        return orderDetail;
    }

    @PostMapping (value = "/newOrder")
    public String addOrderDetail(@RequestBody OrderDetail orderDetail){
        orderDetailRepository.save(orderDetail);
        return "Successfully order placed" + orderDetail.getOrderDetailsId();
    }

    @DeleteMapping(value = "/delete")
    public String deleteOrder(@RequestParam int id){
        Optional<OrderDetail> orderDetail=orderDetailRepository.findById(id);
        orderDetailRepository.deleteById(id);
        return "order deleted" +orderDetail.get().toString();
    }

}
