package org.example.calculator;

import controller.CalculModel;
import metier.CalculMetier;
import metier.CalculMetierImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calcul")
public class CalculServlet extends HttpServlet {
    private CalculMetier metier;

    public  CalculServlet(){
        super();
    }

    @Override
    public void init() throws ServletException {
        super.init();
        metier = new CalculMetierImpl();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("CalculModel",new CalculModel());
       req.getRequestDispatcher("calculVue.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String operation =  req.getParameter("operation");
        Double op1= Double.parseDouble(req.getParameter("Nombre1"));
        Double op2= Double.parseDouble(req.getParameter("Nombre2"));

        CalculModel model = new CalculModel();
        model.setOp1(op1);
        model.setOp2(op2);
        model.setOperation(operation);


         int result= (int) metier.calculer(op1,op2,operation);
         model.setResult(result);
         req.setAttribute("CalculModel",model);
         req.getRequestDispatcher("calculVue.jsp").forward(req,resp);

    }
}
