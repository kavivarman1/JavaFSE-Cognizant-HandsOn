package verifying_interations;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import verifying_interactions.ExternalApi;
import verifying_interactions.MyService;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Response");

        MyService service = new MyService(mockApi);

        String result = service.fetchData();

        assertEquals("Mock Response", result);

        verify(mockApi).getData();
    }
}
