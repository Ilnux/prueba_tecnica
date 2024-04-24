package org.example

class ConversionTemperatura {
    companion object{
        fun celsiusToFarenheit(gradosCelsius:Double):Double{
                return (gradosCelsius*1.8)+32
        }

        fun farenheitToCelsius(gradosFarenheit:Double):Double{
            return (gradosFarenheit-32)*5/9

        }
    }
}