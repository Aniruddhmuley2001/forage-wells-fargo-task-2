package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne()
    @JoinColumn(name = "clientId")
    private Client client;

    @Column(nullable = false)
    private long creationDate;

    protected Portfolio() {

    }

    public Portfolio(Client client, long creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() { return portfolioId; }

    public Client getClientId() { return client; }

    public void setClient(Client client) { this.client = client; }

    public Long getCreationDate() { return creationDate; }

    public void setCreationDate(long creationDate) { this.creationDate = creationDate; }
}
