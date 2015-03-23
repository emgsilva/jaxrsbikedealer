package net.emgsilva.jaxrsbikedealer;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/bikes")
public class BikeDealerService{

	@GET
	@Produces("application/json")
	public String helloBikes(){

		return "Hello from BikeDealer/bikes";

	}

	@POST
	@Path("/{userid}/bikes/{bikeid}")
	@Consumes("applicaiton/json")
	@Produces({ "applicaiton/json", "application/xml"})
	public Bike updateBike(@PathParam("userid") String userid,
			@PathParam("bikeid") int bikeid, Bike bike){

		bike.setPrice(bike.getPrice() * 0.5);

		return bike;

	}

}
