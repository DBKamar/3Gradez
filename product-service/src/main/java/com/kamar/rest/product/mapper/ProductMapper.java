package com.kamar.rest.product.mapper;

import com.kamar.dao.product.Product;
import com.kamar.rest.product.dto.ProductDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product toModel(ProductDTO dto);

    ProductDTO toDto(Product product);

    List<ProductDTO> toDtoList(List<Product> products);
}
