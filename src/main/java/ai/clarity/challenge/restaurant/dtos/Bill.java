package ai.clarity.challenge.restaurant.dtos;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/**
 * Represents a bill, that pays one or more orders.
 */
public class Bill {
    /**
     * The id of the bill.
     */
    private UUID id;

    /**
     * The orders paid by this bill. Usually a bill pays only one order, but it might not be always the case.
     */
    private Set<Order> orders;

    /**
     * The amount actually paid. It should be equal or greater that the sum of order total amounts.
     */
    private BigDecimal amount;

    /**
     * The date and time the bill was created.
     */
    private OffsetDateTime creationDate;

    /**
     * The date and time the bill was paid.
     */
    private OffsetDateTime paymentDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bill bill = (Bill) o;
        return Objects.equals(id, bill.id);
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

    public Set<Order> getOrders() {
        return this.orders;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public OffsetDateTime getCreationDate() {
        return this.creationDate;
    }

    public OffsetDateTime getPaymentDate() {
        return this.paymentDate;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public void setPaymentDate(OffsetDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }
}
