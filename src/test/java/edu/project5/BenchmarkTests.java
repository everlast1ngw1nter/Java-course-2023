package edu.project5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class BenchmarkTests {

    @Test
    void benchmarkTest() {
        assertDoesNotThrow(ReflectionBenchmark::runBenchmark);
    }
}
