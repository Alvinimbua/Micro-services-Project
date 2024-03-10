package com.imbuka.cards.mapper;

import com.imbuka.cards.dto.CardsDto;
import com.imbuka.cards.entity.Cards;

/**
 * A class to change Cards Entity to Cards Dto and vice versa
 */
public class CardsMapper {
    /**
     * It is going to map all data from Cards Entity to Cards Dto
     *
     * @param cards
     * @param cardsDto
     * @return
     */
    public static CardsDto mapToCardsDto(Cards cards, CardsDto cardsDto) {
        cardsDto.setCardNumber(cards.getCardNumber());
        cardsDto.setCardType(cards.getCardType());
        cardsDto.setMobileNumber(cards.getMobileNumber());
        cardsDto.setTotalLimit(cards.getTotalLimit());
        cardsDto.setAmountUsed(cards.getAmountUsed());
        cardsDto.setAvailableAmount(cards.getAvailableAmount());
        return cardsDto;
    }

    /**
     * It is going to map all data from Cards Dto to Cards Entity
     *
     * @param cardsDto
     * @param cards
     * @return
     */
    public static Cards mapToCards(CardsDto cardsDto, Cards cards) {
        cards.setCardNumber(cardsDto.getCardNumber());
        cards.setCardType(cardsDto.getCardType());
        cards.setMobileNumber(cardsDto.getMobileNumber());
        cards.setTotalLimit(cardsDto.getTotalLimit());
        cards.setAvailableAmount(cardsDto.getAvailableAmount());
        cards.setAmountUsed(cardsDto.getAmountUsed());
        return cards;
    }
}
