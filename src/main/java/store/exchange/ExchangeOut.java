package store.exchange;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;

@Builder
public record ExchangeOut(
    BigDecimal sell,
    BigDecimal buy,
    String date,
    @JsonProperty("id-account") String idAccount
) {
}
