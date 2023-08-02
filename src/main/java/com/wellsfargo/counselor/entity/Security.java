package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne()
    @JoinColumn(name = "portfolioId")
    private Portfolio portfolio;

    @Column(nullable = false)
    private long purchasePrice;

    @Column(nullable = false)
    private long purchaseDate;

    @Column(nullable = false)
    private long quantity;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String name;

    protected Security() {

    }

    public Security(long securityId, Portfolio portfolio, long purchasePrice, long purchaseDate, long quantity, String category, String name) {
        this.securityId = securityId;
        this.portfolio = portfolio;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
        this.category = category;
        this.name = name;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Long getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Long purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
