package hello.servlet.web.frontcontroller.v1;

import hello.servlet.web.frontcontroller.MyView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface ControllerV1 {

    MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}
