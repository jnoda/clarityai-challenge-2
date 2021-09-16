package ai.clarity.challenge.restaurant.dtos;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

/**
 * Represents a product that can be bought or sold.
 */
public class Product {
    /**
     * The id of the product.
     */
    private UUID id;

    /**
     * The name of the product.
     */
    private String name;

    /**
     * The cost of the product.
     */
    private BigDecimal cost;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // ---------------------------
    // TRIVIAL GETTERS AND SETTERS
    // ---------------------------

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCost() {
        return this.cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}
