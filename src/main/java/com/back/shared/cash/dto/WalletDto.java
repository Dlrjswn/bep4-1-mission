package com.back.shared.cash.dto;

import com.back.boundedContext.cash.domain.Wallet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class WalletDto {
    private int id;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
    private int holderId;
    private String holderName;
    private long balance;

}
