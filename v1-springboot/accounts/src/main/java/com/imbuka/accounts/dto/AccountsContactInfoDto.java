package com.imbuka.accounts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/**
 * Records were created to act as Data carriers for POJO or DTO classes.
 * One can read data but not be able to change
 * Has getter methods without the setter methods
 * On the background it will make the fields final and generate getter methods
 */
@ConfigurationProperties(prefix = "accounts")
public record AccountsContactInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {
}
