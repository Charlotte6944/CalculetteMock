package fr.m2i.tests;

import fr.m2i.domain.Calculatrice;
import fr.m2i.enumerator.OperationEnum;
import fr.m2i.models.CalculetteModel;
import fr.m2i.service.CalculetteServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class CalculetteServiceTest {

    @Mock
    Calculatrice calculatrice;

    CalculetteServiceImpl classUnderTest;

    @BeforeEach
    public void init() {
        classUnderTest = new CalculetteServiceImpl(calculatrice);
    }

    @Test
    public void ServiceAddTest() {
        CalculetteModel calculetteModel = new CalculetteModel(10, 32, OperationEnum.ADDITION);
        classUnderTest.setCalc(calculetteModel);
        when(calculatrice.add(10, 32)).thenReturn(42);
        classUnderTest.calcul();
        final int result = classUnderTest.getResult();
        verify(calculatrice).add(10, 32);
        assertThat(result).isEqualTo(42);
    }

}
