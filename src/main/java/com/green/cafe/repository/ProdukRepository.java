package com.green.cafe.repository;

import com.green.cafe.entity.Produk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdukRepository extends JpaRepository<Produk, Long>{
}
