package ai.clarity.challenge.restaurant.dtos;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

/**
 * Represents an item in an order.
 */
public abstract class OrderItem {
    /**
     * The id of the item.
     */
    public abstract UUID getId();

    /**
     * The name of the item.
     */
    public abstract String getName();

    /**
     * The price of the item, excluding tax.
     */
    private BigDecimal price;

    /**
     * The tax for the item.
     */
    private BigDecimal tax;

    /**
     * The total amount for the item, including tax.
     */
    private BigDecimal amount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(getId(), orderItem.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // ---------------------------
    // TRIVIAL GETTERS AND SETTERS
    // ---------------------------

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
