package store.exchange;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

// implemented by exchange-service (Python/FastAPI)
@FeignClient(
    name = "exchange",
    url = "http://exchange:8000"
)
public interface ExchangeController {

    @GetMapping("/exchanges/{from}/{to}")
    ResponseEntity<ExchangeOut> exchange(
        @PathVariable("from") String from,
        @PathVariable("to") String to,
        @RequestHeader("id-account") String idAccount
    );
}
