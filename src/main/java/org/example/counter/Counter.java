package org.example.counter;

import jakarta.persistence.*;

@Entity
public class Counter {
    @Id
    private Long id = 1L;

    private int count;

    public Counter() {}

    public Counter(int count) {
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
