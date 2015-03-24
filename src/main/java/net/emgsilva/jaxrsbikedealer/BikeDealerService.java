package net.emgsilva.jaxrsbikedealer;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/bikes")
public class BikeDealerService{

	@PUT
	@Path("/{userid}/bikes/{bikeid}")
	@Consumes("application/json")
	@Produces({ "application/json", "application/xml"})
	public Bike updateBike(@PathParam("userid") String userid,
			@PathParam("bikeid") int bikeid, Bike bike){

		bike.setPrice(bike.getPrice() * 0.5);

		// TODO: implement persistency with DB

		return bike;

	}

	@GET
	@Produces({ "application/json", "application/xml"})
	public List<Bike> getBikes(@QueryParam("color") String color,
			@QueryParam("gender") String gender){

		System.out.println("Bikes filter:");
		System.out.println("> color: " + color);
		System.out.println("> gender: " + gender);

		List<Bike> listBikes = new ArrayList<Bike>();

		Bike bike1 = new Bike();
		bike1.setColor("blue");
		bike1.setGender("male");
		bike1.setPrice(100.0);
		listBikes.add(bike1);

		Bike bike2 = new Bike();
		bike2.setColor("blue");
		bike2.setGender("female");
		bike2.setPrice(150.0);
		listBikes.add(bike2);

		Bike bike3 = new Bike();
		bike3.setColor("black");
		bike3.setGender("male");
		bike3.setPrice(200.0);
		listBikes.add(bike3);

		List<Bike> filteredBikes = new ArrayList<Bike>();

		if(color != null)
			for(Bike bike : listBikes)
				if(bike.getColor().equals(color))
					filteredBikes.add(bike);

		if(gender != null)
			for(Bike bike : listBikes)
				if(bike.getGender().equals(gender))
					filteredBikes.add(bike);

		if(gender == null && color == null)
			filteredBikes = listBikes;

		return filteredBikes;

	}

}
