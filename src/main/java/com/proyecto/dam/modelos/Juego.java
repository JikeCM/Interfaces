package com.proyecto.dam.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "juegos")
public class Juego {

    @Id
    @Column(name = "rank")
    private Integer rank;

    @Column(length = 512)
    private String name;

    @Column(length = 512)
    private String platform;

    private Integer year;

    @Column(length = 512)
    private String genre;

    @Column(length = 512)
    private String publisher;

    @Column(name = "na_sales")
    private Double naSales;

    @Column(name = "eu_sales")
    private Double euSales;

    @Column(name = "jp_sales")
    private Double jpSales;

    @Column(name = "other_sales")
    private Double otherSales;

    @Column(name = "global_sales")
    private Double globalSales;

    // Getters y setters
    public Integer getRank() { return rank; }
    public void setRank(Integer rank) { this.rank = rank; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPlatform() { return platform; }
    public void setPlatform(String platform) { this.platform = platform; }

    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year = year; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    public Double getNaSales() { return naSales; }
    public void setNaSales(Double naSales) { this.naSales = naSales; }

    public Double getEuSales() { return euSales; }
    public void setEuSales(Double euSales) { this.euSales = euSales; }

    public Double getJpSales() { return jpSales; }
    public void setJpSales(Double jpSales) { this.jpSales = jpSales; }

    public Double getOtherSales() { return otherSales; }
    public void setOtherSales(Double otherSales) { this.otherSales = otherSales; }

    public Double getGlobalSales() { return globalSales; }
    public void setGlobalSales(Double globalSales) { this.globalSales = globalSales; }
}
