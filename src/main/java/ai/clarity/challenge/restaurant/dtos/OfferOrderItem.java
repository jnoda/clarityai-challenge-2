package ai.clarity.challenge.restaurant.dtos;

import java.util.List;
import java.util.UUID;

/**
 * Represents an offer.
 *
 * <p>Note that another solution could be to see {@link ProductOrderItem} as an offer with a single product.
 * This simplifies the amount of classes in the model, but deviates somehow from the "common sense".</p>
 */
public class OfferOrderItem extends OrderItem {
    /**
     * The id of the menu.
     */
    private UUID id;

    /**
     * The name of the menu.
     */
    private String name;

    /**
     * The products contained on the offer.
     */
    private List<Product> products;

    // ---------------------------
    // TRIVIAL GETTERS AND SETTERS
    // ---------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
