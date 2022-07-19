package com.furkan.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "tblSales")
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    long customerId;
    long salesDate;
    int price;
    int kdv;
    double totalPrice;

    public Sales() {
    }

    @Override
    public String toString() {
        return "Sales{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", salesDate=" + salesDate +
                ", price=" + price +
                ", kdv=" + kdv +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(long salesDate) {
        this.salesDate = salesDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getKdv() {
        return kdv;
    }

    public void setKdv(int kdv) {
        this.kdv = kdv;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Sales(long customerId, long salesDate, int price, int kdv, double totalPrice) {
        this.customerId = customerId;
        this.salesDate = salesDate;
        this.price = price;
        this.kdv = kdv;
        this.totalPrice = totalPrice;
    }

    public Sales(long id, long customerId, long salesDate, int price, int kdv, double totalPrice) {
        this.id = id;
        this.customerId = customerId;
        this.salesDate = salesDate;
        this.price = price;
        this.kdv = kdv;
        this.totalPrice = totalPrice;
    }
}
