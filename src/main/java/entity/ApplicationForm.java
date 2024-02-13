package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "application_form")
public class ApplicationForm {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Enumerated(EnumType.STRING)
    private Currency currencySale;
    @Enumerated(EnumType.STRING)
    private Currency Purchasecurrency;
    private double amount;
    private String number;
    @Enumerated(EnumType.STRING)
    private Status status;
}
