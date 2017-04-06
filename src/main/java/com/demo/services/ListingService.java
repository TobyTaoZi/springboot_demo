package com.demo.services;

import com.demo.mapper.ListingMapper;
import com.demo.model.Listing;

/**
 * Created by taojingjing on 2017/4/6.
 */
public interface ListingService{

    Listing queryListing(Listing listing);
}
