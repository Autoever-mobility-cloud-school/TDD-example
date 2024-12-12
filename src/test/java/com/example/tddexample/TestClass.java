package com.example.tddexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {
    @Test
    public void testMultiplication(){
        // 멱등성 테스트
        Dollar dollar = new Dollar(5);
        Dollar result1 = dollar.times(2);
        Dollar result2 = dollar.times(2);

        // 첫 호출과 두 번째 호출의 결과가 동일한지 확인
        assertEquals(result1.amount, result2.amount);

        // 원래 객체가 변경되지 않았는지 확인 (불변 객체 여부 확인)
        assertEquals(5, dollar.amount);
    }
}

