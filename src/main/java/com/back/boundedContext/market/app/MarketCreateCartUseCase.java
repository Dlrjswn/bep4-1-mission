package com.back.boundedContext.market.app;

import com.back.boundedContext.market.domain.Cart;
import com.back.boundedContext.market.domain.MarketMember;
import com.back.boundedContext.market.out.CartRepository;
import com.back.boundedContext.market.out.MarketMemberRepository;
import com.back.global.rsData.RsData;
import com.back.shared.market.dto.MarketMemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MarketCreateCartUseCase {
    private final CartRepository cartRepository;
    private final MarketMemberRepository marketMemberRepository;

    public RsData<Cart> createCart(MarketMemberDto customer){
        MarketMember marketMember = marketMemberRepository.getReferenceById(customer.getId());

        Cart cart = new Cart(marketMember);

        cartRepository.save(cart);

        return new RsData<>(
                "201-1",
                "장바구니가 생성되었습니다."
                ,cart
        );
    }
}
