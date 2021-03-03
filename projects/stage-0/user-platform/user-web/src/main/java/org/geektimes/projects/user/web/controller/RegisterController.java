package org.geektimes.projects.user.web.controller;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.service.UserService;
import org.geektimes.projects.user.service.impl.UserServiceImpl;
import org.geektimes.web.mvc.controller.PageController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * @className: RegisterController
 * @description: TODO 类描述
 * @author: YM
 * @date: 3/4/2021
 **/
@Path("/register")
public class RegisterController implements PageController {

    private UserService userService = new UserServiceImpl();

    @Override
    @POST
    @GET
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String user = request.getParameter("user");
        String password = request.getParameter("password");
        System.out.printf("user: %s, password: %s\n", user, password);
        if (user == null || password == null) {
            return "register.jsp";
        }

        if (userService.register(new User(user, password, "1", "1"))) {
            return "login.jsp";
        }
        return "failed.jsp";
    }
}
