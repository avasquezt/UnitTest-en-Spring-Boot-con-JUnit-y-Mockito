package com.tutorialesvip.tutorialunittest.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.*;

class DiferenciaEntreFechasTest {

    @Autowired
    private DiferenciaEntreFechas diferenciaEntreFechas;

    @Test
    void calculateYearsOfIndependency() {
        LocalDate today = LocalDate.now();

        diferenciaEntreFechas = new DiferenciaEntreFechas();
        String fechaIndependencia = "27/02/1844";

        Period resultado = diferenciaEntreFechas.calculateYearsOfIndependency(fechaIndependencia);

        Assertions.assertEquals(8,resultado.getMonths() );
        Assertions.assertEquals(8,resultado.getDays() );
        Assertions.assertEquals(178,resultado.getYears() );
    }
}