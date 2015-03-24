# JAX-RS BikeDealer API

Simple RESTful API for a bike shopping service (BikeDealer) developed using JAX-RS (Jersey).

It implements two operations:

## get all bikes (net.emgsilva.jaxrsbikedealer.BikeDealerService.getBikes())
 
test 1: `curl -v -XGET -H "Accept:application/json" 'http://localhost:8080/jaxrsbikedealer/rest/bikes?color=blue'`

test 2: `curl -v -XGET -H "Accept:application/xml" 'http://localhost:8080/jaxrsbikedealer/rest/bikes?color=blue&gender=male'`

## update bike (net.emgsilva.jaxrsbikedealer.BikeDealerService.updateBike())

test 1: `curl -v -XPUT -H "Accept: application/json" -H "Content-Type: application/json" -d '{"price": "10", "color": "blue", "gender": "male"}' "http://localhost:8080/jaxrsbikedealer/rest/bikes/userid/bikes/1"`

test 2: `curl -v -XPUT -H "Accept: application/XML" -H "Content-Type: application/json" -d '{"price": "10", "color": "blue", "gender": "male"}' "http://localhost:8080/jaxrsbikedealer/rest/bikes/userid/bikes/1"`
