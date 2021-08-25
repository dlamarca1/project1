package com.dio.project1.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class HoursBank {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class HoursBankId implements Serializable{
        private long idHoursBank;
        private long idMove;
        private long idUser;
    }
    @EmbeddedId
    private HoursBankId id;
    private LocalDateTime workedDate;
    private BigDecimal hoursAmount;
    private BigDecimal hoursBalance;
}
