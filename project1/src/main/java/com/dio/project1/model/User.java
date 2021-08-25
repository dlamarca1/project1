package com.dio.project1.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class User {
    @Id
    private Long id;
    @ManyToOne
    private UserCategory userCategory;
    private String name;
    @ManyToOne
    private Enterprise enterprise;
    @ManyToOne
    private AccessLevel accessLevel;
    @ManyToOne
    private Workday workday;
    private BigDecimal tolerance;
    private LocalDateTime beginWorkday;
    private LocalDateTime endWorkday;
}
