package com.example.project.domain.validators;

/* import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane; */

import java.sql.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateValidator implements ConstraintValidator<Datee, Date> {

    @Override
    public boolean isValid(Date value, ConstraintValidatorContext context) {
       
      Date hoje = new Date(0);
        int dias = 7*24*60*60*1000;

        Date limiteInferior = new Date(hoje.getTime() - dias);
        Date limiteSuperior = new Date( hoje.getTime() + dias);


       /*  for(int i=0;i<context.length;i++){
         System.out.println(data[i]);
      } */
       
        return value != null

            && value.getTime() >= limiteInferior.getTime()
            && value.getTime() <= limiteSuperior.getTime();

          //public boolean isValid(String value, ConstraintValidatorContext context) {
          //  return value != null && value.matches("[0-9]+") && value.length() > 7 && value.length() < 12;
        //}
    }

    /* public class TesteDeSplit {
      public static void main(String[] args) {
         String[] data = "13/07/2006".split("/");
         
         for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
         }
      } */

      /* Date data = null;
      String dataTexto = new String("10/30/2006");
      SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
      try {
         format.setLenient(false);
         data = (Date) format.parse(dataTexto);
      } catch (ParseException e) {
         JOptionPane.showMessageDialog(null,"O Mané escreveu a data Errada","AVISO",JOptionPane.WARNING_MESSAGE);
      } */
}
   
   
   
