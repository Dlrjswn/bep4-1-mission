package com.back.shared.post.event;

import com.back.shared.payout.dto.PayoutDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PayoutCompletedEvent {
    private final PayoutDto payout;
}
