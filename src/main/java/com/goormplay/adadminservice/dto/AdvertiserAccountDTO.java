package com.goormplay.adadminservice.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdvertiserAccountDTO {
    private String advertiserId;
    private Long totalBudget;
    private Long currentBalance;
    private LocalDateTime createdAt;

}
