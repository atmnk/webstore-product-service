package product.dto;

import product.model.Product;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProductDTO implements Serializable {

    private Long id;

    private String name;

    private BigDecimal price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public ProductDTO(){

    }
    public ProductDTO(Product product){
        this.id=product.getId();
        this.name=product.getName();
        this.price=product.getPrice();
    }
}
