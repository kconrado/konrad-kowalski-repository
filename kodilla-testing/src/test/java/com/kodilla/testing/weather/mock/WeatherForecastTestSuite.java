package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.mock;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastTestSuite() {
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //when
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //then
        Assert.assertEquals(5, quantityOfSensors);
    }

}
