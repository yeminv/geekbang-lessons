package org.geektimes.projects.user.web.controller;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.service.UserService;
import org.geektimes.projects.user.service.impl.UserServiceImpl;
import org.geektimes.web.mvc.controller.PageController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * @className: LoginController
 * @description: TODO 类描述
 * @author: YM
 * @date: 3/4/2021
 **/
@Path("/login")
public class LoginController implements PageController {

    private UserService userService = new UserServiceImpl();

    @Override
    @POST
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        User user = userService.queryUserByNameAndPassword(request.getParameter("user"), request.getParameter("password"));
        if (user != null) {
            return "index.jsp";
        }else {
            return "login-failed.jsp";
        }
    }
}
