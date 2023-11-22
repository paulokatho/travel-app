package com.katho.travelorder;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("travelOrders")
public class TravelOrderResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TravelOrder> listAll() {
        return TravelOrder.listAll();
    }

    @GET
    @Path("findById")
    public TravelOrder findById(@QueryParam("id") long id) {
        return TravelOrder.findById(id);
    }

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public TravelOrder newTravelOrder(TravelOrder order) {
        order.id = null;
        order.persist();

        return order;
    }
}
