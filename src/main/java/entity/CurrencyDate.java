package entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "currency_date")
public class CurrencyDate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private float USD;
    private float EUR;
    private float sellingRate;
    private float buyingRate;
    private Date date;
}
