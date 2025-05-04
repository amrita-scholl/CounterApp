package org.example.counter;

import org.springframework.web.bind.annotation.*;

import jakarta.annotation.PostConstruct;

@RestController
@CrossOrigin
public class CounterController {

    private final CounterRepository repository;

    public CounterController(CounterRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void init() {
        // Initialize counter in DB if not present
        if (!repository.existsById(1L)) {
            repository.save(new Counter(0));
        }
    }

    @GetMapping("/api/counter")
    public int incrementCounter() {
        Counter counter = repository.findById(1L).orElse(new Counter(0));
        counter.setCount(counter.getCount() + 1);
        repository.save(counter);
        return counter.getCount();
    }
}
