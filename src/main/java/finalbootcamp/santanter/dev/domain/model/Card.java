package finalbootcamp.santanter.dev.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity(name = "tb_card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String numberCard;
    @Column(name = "available_limit", scale = 2, precision = 13)
    private BigDecimal limitCard;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public BigDecimal getLimitCard() {
        return limitCard;
    }

    public void setLimitCard(BigDecimal limitCard) {
        this.limitCard = limitCard;
    }
}
