package ai.clarity.challenge.restaurant.dtos;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * Represents an order.
 */
public class Order {
    /**
     * The id of the order.
     */
    private UUID id;

    /**
     * The order items, with associated quantity.
     */
    private Map<OrderItem, Long> items;

    /**
     * The date and time the order was created.
     */
    private OffsetDateTime creationDate;

    /**
     * Whether the order is paid.
     */
    private boolean paid;

    /**
     * The total price of the order, excluding tax.
     */
    private BigDecimal getPrice() {
        return items.entrySet().stream()
                .map(entry -> entry.getKey().getPrice().multiply(BigDecimal.valueOf(entry.getValue())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    /**
     * The total tax of the order.
     */
    private BigDecimal getTax() {
        return items.entrySet().stream()
                .map(entry -> entry.getKey().getTax().multiply(BigDecimal.valueOf(entry.getValue())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    /**
     * The total amount of the order, including tax.
     */
    private BigDecimal getAmount() {
        return getPrice().add(getTax());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
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

    public OffsetDateTime getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isPaid() {
        return this.paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public Map<OrderItem, Long> getItems() {
        return items;
    }

    public void setItems(Map<OrderItem, Long> items) {
        this.items = items;
    }
}
