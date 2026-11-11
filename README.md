# exchange

Shared HTTP contract and data transfer objects for the Exchange API.

The API itself is implemented in Python by [exchange-service](https://github.com/organizacao-do-sucesso/exchange-service); this module only describes it for Java consumers.

| | |
|---|---|
| Endpoint | `GET /exchanges/{from}/{to}` (e.g. `/exchanges/USD/EUR`) |
| Header | `id-account` |
| Response | `sell`, `buy`, `date`, `id-account` |
| Errors | `404` unknown pair, `422` invalid currency code, `503` rates provider unavailable |
