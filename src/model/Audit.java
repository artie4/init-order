package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Audit extends Base {

    protected LocalDateTime createdAt = LocalDateTime.now();

    static {
        System.out.printf("[Audit] static init block; total=%d \r\n", total);
    }

    Audit() {
        System.out.println("[Audit] constructor \r\n");
    }

    {
        System.out.printf("[Audit] init block; id=%d; createdAt=%s \r\n", id, createdAt);
    }
}
