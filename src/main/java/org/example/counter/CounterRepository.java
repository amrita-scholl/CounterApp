package org.example.counter;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CounterRepository extends JpaRepository<Counter, Long> {}
