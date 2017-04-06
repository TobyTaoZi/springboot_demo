package com.demo.services.impl;

import com.demo.mapper.ListingMapper;
import com.demo.model.Listing;
import com.demo.services.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by taojingjing on 2017/4/6.
 */
@Service
public class ListingServiceImpl implements ListingService {

    @Autowired
    private   ListingMapper listingMapper;

    @Override
    public Listing queryListing(Listing listing) {
        return  listingMapper.selectOne(listing);
    }
}
