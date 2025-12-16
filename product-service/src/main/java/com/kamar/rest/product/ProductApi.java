package com.kamar.rest.product;

import com.kamar.rest.product.dto.ProductDTO;
import com.kamar.rest.product.mapper.ProductMapper;
import com.kamar.service.product.ProductService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductApi {

    private final ProductService service;
    private final ProductMapper mapper;

    public ProductApi(ProductService service, ProductMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @PostMapping
    public ProductDTO create(@RequestBody @Valid ProductDTO dto) {
        return mapper.toDto(
                service.create(mapper.toModel(dto))
        );
    }

    @GetMapping
    public List<ProductDTO> findAll() {
        return mapper.toDtoList(service.findAll());
    }

    @GetMapping("/{id}")
    public ProductDTO findById(@PathVariable Long id) {
        return mapper.toDto(service.findById(id));
    }

    @PutMapping("/{id}")
    public ProductDTO update(@PathVariable Long id,
                             @RequestBody @Valid ProductDTO dto) {
        return mapper.toDto(
                service.update(id, mapper.toModel(dto))
        );
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
