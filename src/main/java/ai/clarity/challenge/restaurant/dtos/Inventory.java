package ai.clarity.challenge.restaurant.dtos;

import java.util.Map;

/**
 * Represents the restaurant inventory.
 *
 * <p>Note sure if should be </p>
 */
public class Inventory {
    /**
     * The current stock of products.
     */
    private Map<Product, Long> stock;

    // ---------------------------
    // TRIVIAL GETTERS AND SETTERS
    // ---------------------------

    public Map<Product, Long> getStock() {
        return stock;
    }

    public void setStock(Map<Product, Long> stock) {
        this.stock = stock;
    }
}
