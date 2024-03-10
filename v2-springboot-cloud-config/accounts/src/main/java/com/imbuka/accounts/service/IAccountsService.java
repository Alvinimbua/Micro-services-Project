package com.imbuka.accounts.service;

import com.imbuka.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     *
     * @param customerDto - CustomerDtoObject
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input mobile Number
     * @return AccountDetails based on a given mobile Number
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDto - CustomerDtoObject
     * @return boolean indicating if the update of Account details is Successful or not.
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     * @param mobileNumber - Input mobile NUmber
     * @return boolean indicating if the delete of Account details is successful or not
     */
    boolean deleteAccount(String mobileNumber);
}
