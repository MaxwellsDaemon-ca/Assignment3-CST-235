package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.UserModel;

@ManagedBean
@ViewScoped
public class FormController {

	public String onSubmit() {
		
		FacesContext context = FacesContext.getCurrentInstance();
		UserModel userModel = context.getApplication().evaluateExpressionGet(context, "#{userModel}", UserModel.class);
		System.out.print("You clicked the submit button");
		System.out.print("The First Name is: " + userModel.getFirstName());
		System.out.print("The Last Name is: " + userModel.getLastName());
		
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("userModel", userModel);
		
		return "Response.xhtml";
	}
	
}
