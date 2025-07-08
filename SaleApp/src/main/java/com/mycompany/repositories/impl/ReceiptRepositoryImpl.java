///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.repositories.impl;
//
//import com.mycompany.pojo.Cart;
//import com.mycompany.pojo.OrderDetail;
//import com.mycompany.pojo.SaleOrder;
//import com.mycompany.sale.HibernateUtils;
//import java.util.Date;
//import java.util.List;
//import org.hibernate.Session;
//
///**
// *
// * @author Quang Truong
// */
//public class ReceiptRepositoryImpl {
//
//    public void addReceipt(List<Cart> carts) {
//        if (carts != null) {
//            try (Session s = HibernateUtils.getFACTORY().openSession()) {
//                SaleOrder order = new SaleOrder();
//                order.setUserId(new UserRepositoryImpl().getUserByUsername("dhthanh"));
//                order.setCreatedDate(new Date());
//                s.persist(order);
//                for (var x:carts){
//                    OrderDetail d = new OrderDetail();
//                    d.setQuantity(x.getQuantity());
//                    d.setUnitPrice(x.getPrice());
//                    d.setProductId(new ProductRepositoryImpl().getProductById(x.getId()));
//                    d.setOrderId(order);
//                    
//                    s.persist(d);
//                }
//            }
//        }
//    }
//}
