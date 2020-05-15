package com.second.repository;
import org.springframework.data.repository.CrudRepository;
import com.second.objects.Product;

public interface ProductRepository extends CrudRepository<Product,Integer>{

}
