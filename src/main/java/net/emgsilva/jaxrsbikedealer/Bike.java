package net.emgsilva.jaxrsbikedealer;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Bike{

	private String color;
	private Double price;
	private String gender;

	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}

	public Double getPrice(){
		return price;
	}

	public void setPrice(Double price){
		this.price = price;
	}

	public String getGender(){
		return gender;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

}
