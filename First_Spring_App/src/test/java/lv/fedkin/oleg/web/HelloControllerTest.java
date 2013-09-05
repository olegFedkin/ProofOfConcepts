package lv.fedkin.oleg.web;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class HelloControllerTest {
    @Test
    public void testHandleRequestView() {
        HelloController controller = new HelloController();
        ModelAndView modelAndView = null;
        try {
            modelAndView = controller.handleRequest(null, null);
        } catch (ServletException | IOException ignored) {
        }
        assert modelAndView != null;
        assertEquals("hello.jsp", modelAndView.getViewName());
    }
}