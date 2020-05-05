package com.uca.capas.modelo.controller;

import com.uca.capas.domain.Producto;

import java.time.DayOfWeek;
import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TareaNo4Controller {
	
	@RequestMapping("/registrar")
	public ModelAndView registrar(@Valid @ModelAttribute Producto producto, BindingResult result) {
		ModelAndView mav = new ModelAndView();	
		if(result.hasErrors()) {
			mav.setViewName("commons/producto");
		}else {
			mav.addObject("nombre", producto.getNombre());
			mav.setViewName("commons/resultado");
		}
		return mav;
	}
	@RequestMapping("/producto")
	public String producto(Producto producto) {
		return "commons/producto";
	}
}
