package delft;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MyClassForTestingTest {

    @Test
    void getInput() {
        BufferedReader br = mock(BufferedReader.class);
        try {
            when(br.readLine()).thenReturn("1");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        MyClassForTesting myClassForTesting = new MyClassForTesting(br);
        assert(1==myClassForTesting.getInput());
    }
}