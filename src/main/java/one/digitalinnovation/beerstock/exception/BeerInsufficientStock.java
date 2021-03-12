package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.ACCEPTED)
public class BeerInsufficientStock extends Exception {
    public BeerInsufficientStock(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID to decrement informed exceeds the min stock capacity: %s", id, quantityToDecrement));
    }
}
