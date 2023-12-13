package com.ssk.service;

import org.springframework.stereotype.Service;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class VisitorCounterService {

    private final AtomicLong counter = new AtomicLong(0);

    public long incrementAndGet() {
        return counter.incrementAndGet();
    }

    public long getCount() {
        return counter.get();
    }
}
