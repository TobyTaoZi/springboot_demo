package com.demo.controller;

import com.demo.model.Listing;
import com.demo.services.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by taojingjing on 2017/4/6.
 */
@RequestMapping("/listing")
@RestController
public class ListingController {

    @Autowired
    private ListingService  listingService;

    @RequestMapping("/getListing")
    public String queryListingOne(){
        Listing listing =  new Listing();
        listing.setListId(638500L);
        return  listingService.queryListing(listing).toString();
    }
}
