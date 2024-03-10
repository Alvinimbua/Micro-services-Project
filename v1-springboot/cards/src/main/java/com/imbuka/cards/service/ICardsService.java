package com.imbuka.cards.service;

import com.imbuka.cards.dto.CardsDto;

public interface ICardsService {
    /**
     * @param mobileNumber = Mobile Number of the Customer
     */
    void createCard(String mobileNumber);

    /**
     * @param mobileNumber - Input mobile Number
     * @return Cards Details based on a given number
     */
    CardsDto fetchCards(String mobileNumber);

    /**
     * @param cardsDto - CardsDtoObject
     * @return boolean indicating if the update of Card Details is Successful or Not
     */
    boolean updateCards(CardsDto cardsDto);

    /**
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the deletion of Cards Details is successful or not
     */
    boolean deleteCards(String mobileNumber);
}
