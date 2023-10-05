package com.green.cafe.services;

import com.green.cafe.entity.Produk;
import com.green.cafe.repository.ProdukRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdukServices {

    private final ProdukRepository repository;

    public List<Produk> getAllProduk(){
        return repository.findAll();
    }
    public Produk createProduk(Produk request){
        return repository.save(request);
    }
}
