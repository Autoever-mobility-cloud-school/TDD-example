package com.example.tddexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestClass {
    @Test
    public void testMultiplication(){
        // 멱등성 테스트
        Dollar dollar = new Dollar(5);
        Dollar result1 = dollar.times(2);
        Dollar result2 = dollar.times(2);

        // 첫 호출과 두 번째 호출의 결과가 동일한지 확인
        assertEquals(result1.getAmount(), result2.getAmount());

        // 원래 객체가 변경되지 않았는지 확인 (불변 객체 여부 확인)
        assertEquals(5, dollar.getAmount());
    }

    @Test
    public void testEquality(){
        assertEquals(new Dollar(5), new Dollar(5)); // 동일한 금액
        assertNotEquals(new Dollar(5), new Dollar(10)); // 다른 금액
        assertEquals(new Dollar(5), new Dollar(5)); // 다시 동일성 확인
    }

    @Test
    public void testFrancMultiplication(){
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }


}

