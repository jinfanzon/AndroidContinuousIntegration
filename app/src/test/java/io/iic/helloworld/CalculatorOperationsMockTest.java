package io.iic.helloworld;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class CalculatorOperationsMockTest {

    private Calculator calculator = null;
    private CalculatorService service = mock(CalculatorService.class);
    @Before
    public void setUp(){
        calculator = new Calculator(service);
    }
    @Test
    public void checkSum(){
        when(service.add(2,2)).thenReturn(4.0d);
        assertEquals(8.0d,calculator.execute(2,2),0);
        verify(service).add(2,2);
    }

}
