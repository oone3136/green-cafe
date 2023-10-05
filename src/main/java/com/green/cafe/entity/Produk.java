package com.green.cafe.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "PRODUK")
public class Produk{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nama_produck")
    private String nama;
    @Column(name = "QTY")
    private Long qty;
    @Column(name = "harga")
    private BigDecimal harga;
    @Column(name = "deskripsi")
    private String deskripsi;
}
