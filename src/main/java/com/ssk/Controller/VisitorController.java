package com.ssk.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssk.service.VisitorCounterService;

@RestController
@RequestMapping("/api/visitors")
@CrossOrigin("*")
public class VisitorController {

    @Autowired
    private VisitorCounterService visitorCounterService;

    @GetMapping
    public VisitorCountResponse getVisitorCount() {
        long count = visitorCounterService.incrementAndGet();
        return new VisitorCountResponse(count);
    }
    
    @PostMapping
    public VisitorCountResponse incrementVisitorCount() {
        return new VisitorCountResponse(visitorCounterService.incrementAndGet());
    }

    static class VisitorCountResponse {
        private final long count;

        public VisitorCountResponse(long count) {
            this.count = count;
        }

        public long getCount() {
            return count;
        }
    }
}

