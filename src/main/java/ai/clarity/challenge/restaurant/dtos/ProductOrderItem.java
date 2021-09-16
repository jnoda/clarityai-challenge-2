package ai.clarity.challenge.restaurant.dtos;

import java.util.UUID;

/**
 * An order item with a single product.
 */
public class ProductOrderItem extends OrderItem {
    /**
     * The product.
     */
    private final Product product;

    public ProductOrderItem(Product product) {
        this.product = product;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID getId() {
        return getProduct().getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return getProduct().getName();
    }

    // ---------------------------
    // TRIVIAL GETTERS AND SETTERS
    // ---------------------------

    public Product getProduct() {
        return product;
    }
}
