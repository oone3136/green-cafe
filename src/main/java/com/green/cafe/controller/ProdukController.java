package com.green.cafe.controller;

import com.green.cafe.entity.Produk;
import com.green.cafe.services.ProdukServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ProdukController {

    private final ProdukServices services;

    @GetMapping("/produks")
    public List<Produk> getAllProduk()
    {
        return services.getAllProduk();
    }
    @PostMapping("/produks")
    public Produk createProduk(@RequestBody Produk request){
        return services.createProduk(request);
    }

}
