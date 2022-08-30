package fr.m2i.tests;

import fr.m2i.domain.Calculatrice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatriceTest {

    private Calculatrice calc;

    @BeforeEach
    public void init() {
        calc = new Calculatrice();
    }

    @ParameterizedTest(name = "add : {0} + {1} equal {2}")
    @CsvSource({"3,4,7","-5, 2, -3"})
    public void addTest(int a, int b, int resultatAttendu) {
        int resutatObtenu = this.calc.add(a, b);
        assertThat(resutatObtenu).isEqualTo(resultatAttendu);
    }

    @ParameterizedTest(name = "soustraction : {0} - {1} equal {2}")
    @CsvSource({"3,4,-1","-5, 2, -7"})
    public void sousTest(int a, int b, int resultatAttendu) {
        int resutatObtenu = this.calc.sous(a, b);
        assertThat(resutatObtenu).isEqualTo(resultatAttendu);
    }

    @ParameterizedTest(name = "multiply : {0} * {1} equal {2}")
    @CsvSource({"3,4,12","-5, 2, -10"})
    public void multiplyTest(int a, int b, int resultatAttendu) {
        int resutatObtenu = this.calc.multiply(a, b);
        assertThat(resutatObtenu).isEqualTo(resultatAttendu);
    }

    @ParameterizedTest(name = "divise : {0} / {1} equal {2}")
    @CsvSource({"12,4,3","-10, 2, -5"})
    public void diviseTest(int a, int b, int resultatAttendu) {
        int resutatObtenu = this.calc.div(a, b);
        assertThat(resutatObtenu).isEqualTo(resultatAttendu);
    }

}
