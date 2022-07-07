package com.cg.ofr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ofr.entities.Flat;
import com.cg.ofr.entities.FlatBooking;
import com.cg.ofr.exception.FlatBookingNotFoundException;
import com.cg.ofr.service.FlatBookingService;

@RestController
public class FlatBookingController {
	
	@Autowired
	private FlatBookingService iflatbookingService;
	
	@PostMapping("/addFlatBooking")
	public String addFlatBooking(@RequestBody FlatBooking flat){
		
		return iflatbookingService.addFlatBooking(flat);
	}
	
	
	  @PutMapping("/updateFlatBooking/{id}/{newFlat}")
	 
	  public List<FlatBooking> updateFlatBooking(@PathVariable("bookingNo") int bookingNo, @PathVariable("newFlat") Flat flat)throws FlatBookingNotFoundException
	   { 
         return iflatbookingService.updateFlatBooking(bookingNo, flat); 
         }
	 
	  @DeleteMapping("/deleteFlatBooking/{id}/{deleteFlat}")
		 
	  public List<FlatBooking> deleteFlatBooking(@PathVariable("bookingNo") int bookingNo, @PathVariable("deleteFlat") Flat flat)throws FlatBookingNotFoundException
	   { 
         return iflatbookingService.deleteFlatBooking(bookingNo, flat); 
         }
	  
	  @GetMapping("/viewFlatBooking/{id}/{viewFlat}")
		 
	  public List<FlatBooking> viewFlatBooking(@PathVariable("bookingNo") int bookingNo, @PathVariable("viewFlat") Flat flat)throws FlatBookingNotFoundException
	   { 
         return iflatbookingService.viewFlatBooking(bookingNo, flat); 
         }
	  
	  @GetMapping("/viewAllFlatBooking")
		public List<FlatBooking> getAllProducts() {
			
			return iflatbookingService.viewAllFlatBooking();
		}
	  

	
		

	

}
