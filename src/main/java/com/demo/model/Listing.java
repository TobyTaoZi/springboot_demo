package com.demo.model;

import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "LISTING")
public class Listing implements Serializable{

    private static final long serialVersionUID = 1393027357708703114L;

    private Long listId;

    private String listName;

    private Long merchantId;

    private String merchantName;

    private String storeName;

    private Long storeId;

    private Long prdId;

    private Long categoryId;

    private Long storeCls1;

    private Long storeCls2;

    private Long storeCls3;

    private Long brand;

    private Integer weight;

    private Long defItemId;

    private String defImgUrl;

    private Long storage;

    private Integer soldCount;

    private Integer createTime;

    private Integer updateTime;

    private Float minPrice;

    private Float maxPrice;

    private String reqVal1Ids;

    private String reqVal2Ids;

    private String attribute;

    private String listDesc;

    private String promotionIds;

    private String tag;

    private Boolean delFlag;

    private Integer starId;

    private Integer adId;

    private String dcCode;

    private String dcName;

    private String single;

    private Boolean limitWay;

    private Integer limitNum;

    private Float freight;

    private Float insurance;

    private Float oldPrice;

    private String promotionDesc;

    private Boolean deliveryType;

    private String serachTag;

    private Integer startShipmentDate;

    private Integer endShipmentDate;

    private Boolean colorDisplayType;

    private Long merchantStorage;

    private Integer arrivalDate;

    private Integer deliveryMinDay;

    private Integer deliveryMaxDay;

    private String listNumber;

    private Boolean priceApprovedState;

    private Integer operateStateTime;

    private Float tax;

    private Boolean listingSource;

    private Integer packageCount;

    private Short saleMode;

    private Boolean listingType;

    private Boolean listingFlag;

    private Boolean searchEngineFlag;

    private Boolean listingState;

    private String standardAttributeIds;

    private String labels;

    private Float purchasePrice;

    private Boolean settlementType;

    private Float settlementPoint;

    private Boolean shipmentType;

    private String nationalStandardNumber;

    private String imgUrls;

    private Integer priceApprovedTime;

    private Integer firstOnlineTime;

    private String listPackageName;

    private Boolean packageType;

    private Integer storeSortNum;

    private String listPromotionName;

    private Integer expiryValue;

    private Byte orginPlace;

    private Boolean searchOption;

    private String packageWeight;

    private Float netprofit;

    private String desPurprice;

    private Integer saleLimitnum;

    private Float priceSearchFactor;

    private Integer logisticsWay;

    private Float packageSize;

    private String packageSizeInfo;

    private Integer uleCardPay;

    private Double merchantFreightPay;

    private Integer prepareCargoTime;

    private Long otherListId;

    private Integer localSpecialty;

    private Long oldListId;

    private String sellUnit;

    private Boolean boxSell;

    private String sellUnitSingle;

    private Integer offlineCode;

    private Integer onlineableTime;

    private String remark;

    private Integer listBargaining;

    private Boolean priceCompare;

    private String generalFlag;

    private Integer saleChannelsId;

    private String saleChannelName;

    private Long directProvince;

    private Boolean allowChangePrice;

    private Boolean automateShelve;

    private Integer automateShelveHour;

    private Boolean zoneProposalFlag;

    private String jqListDesc;

    private Float agencyRate;

    private String md5Verify;

    private String promotionDescTwo;

    private Boolean isEmsFreight;

    private Boolean isReturnSevendays;

    private String listingTag;

    private String videoUrl;

    private Integer settlementPercent;

    private Boolean thirdPlatformId;

    private String thirdPrdId;

    private Long thirdProductId;

    private Float thirdProductPrice;

    private String takeWay;

    private String validPeriod;

    private Long cuzFreightTemplateId;

    private String paymentType;

    private Boolean storageState;

    public Listing(Long listId, String listName, Long merchantId, String merchantName, String storeName, Long storeId, Long prdId, Long categoryId, Long storeCls1, Long storeCls2, Long storeCls3, Long brand, Integer weight, Long defItemId, String defImgUrl, Long storage, Integer soldCount, Integer createTime, Integer updateTime, Float minPrice, Float maxPrice, String reqVal1Ids, String reqVal2Ids, String attribute, String listDesc, String promotionIds, String tag, Boolean delFlag, Integer starId, Integer adId, String dcCode, String dcName, String single, Boolean limitWay, Integer limitNum, Float freight, Float insurance, Float oldPrice, String promotionDesc, Boolean deliveryType, String serachTag, Integer startShipmentDate, Integer endShipmentDate, Boolean colorDisplayType, Long merchantStorage, Integer arrivalDate, Integer deliveryMinDay, Integer deliveryMaxDay, String listNumber, Boolean priceApprovedState, Integer operateStateTime, Float tax, Boolean listingSource, Integer packageCount, Short saleMode, Boolean listingType, Boolean listingFlag, Boolean searchEngineFlag, Boolean listingState, String standardAttributeIds, String labels, Float purchasePrice, Boolean settlementType, Float settlementPoint, Boolean shipmentType, String nationalStandardNumber, String imgUrls, Integer priceApprovedTime, Integer firstOnlineTime, String listPackageName, Boolean packageType, Integer storeSortNum, String listPromotionName, Integer expiryValue, Byte orginPlace, Boolean searchOption, String packageWeight, Float netprofit, String desPurprice, Integer saleLimitnum, Float priceSearchFactor, Integer logisticsWay, Float packageSize, String packageSizeInfo, Integer uleCardPay, Double merchantFreightPay, Integer prepareCargoTime, Long otherListId, Integer localSpecialty, Long oldListId, String sellUnit, Boolean boxSell, String sellUnitSingle, Integer offlineCode, Integer onlineableTime, String remark, Integer listBargaining, Boolean priceCompare, String generalFlag, Integer saleChannelsId, String saleChannelName, Long directProvince, Boolean allowChangePrice, Boolean automateShelve, Integer automateShelveHour, Boolean zoneProposalFlag, String jqListDesc, Float agencyRate, String md5Verify, String promotionDescTwo, Boolean isEmsFreight, Boolean isReturnSevendays, String listingTag, String videoUrl, Integer settlementPercent, Boolean thirdPlatformId, String thirdPrdId, Long thirdProductId, Float thirdProductPrice, String takeWay, String validPeriod, Long cuzFreightTemplateId, String paymentType, Boolean storageState) {
        this.listId = listId;
        this.listName = listName;
        this.merchantId = merchantId;
        this.merchantName = merchantName;
        this.storeName = storeName;
        this.storeId = storeId;
        this.prdId = prdId;
        this.categoryId = categoryId;
        this.storeCls1 = storeCls1;
        this.storeCls2 = storeCls2;
        this.storeCls3 = storeCls3;
        this.brand = brand;
        this.weight = weight;
        this.defItemId = defItemId;
        this.defImgUrl = defImgUrl;
        this.storage = storage;
        this.soldCount = soldCount;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.reqVal1Ids = reqVal1Ids;
        this.reqVal2Ids = reqVal2Ids;
        this.attribute = attribute;
        this.listDesc = listDesc;
        this.promotionIds = promotionIds;
        this.tag = tag;
        this.delFlag = delFlag;
        this.starId = starId;
        this.adId = adId;
        this.dcCode = dcCode;
        this.dcName = dcName;
        this.single = single;
        this.limitWay = limitWay;
        this.limitNum = limitNum;
        this.freight = freight;
        this.insurance = insurance;
        this.oldPrice = oldPrice;
        this.promotionDesc = promotionDesc;
        this.deliveryType = deliveryType;
        this.serachTag = serachTag;
        this.startShipmentDate = startShipmentDate;
        this.endShipmentDate = endShipmentDate;
        this.colorDisplayType = colorDisplayType;
        this.merchantStorage = merchantStorage;
        this.arrivalDate = arrivalDate;
        this.deliveryMinDay = deliveryMinDay;
        this.deliveryMaxDay = deliveryMaxDay;
        this.listNumber = listNumber;
        this.priceApprovedState = priceApprovedState;
        this.operateStateTime = operateStateTime;
        this.tax = tax;
        this.listingSource = listingSource;
        this.packageCount = packageCount;
        this.saleMode = saleMode;
        this.listingType = listingType;
        this.listingFlag = listingFlag;
        this.searchEngineFlag = searchEngineFlag;
        this.listingState = listingState;
        this.standardAttributeIds = standardAttributeIds;
        this.labels = labels;
        this.purchasePrice = purchasePrice;
        this.settlementType = settlementType;
        this.settlementPoint = settlementPoint;
        this.shipmentType = shipmentType;
        this.nationalStandardNumber = nationalStandardNumber;
        this.imgUrls = imgUrls;
        this.priceApprovedTime = priceApprovedTime;
        this.firstOnlineTime = firstOnlineTime;
        this.listPackageName = listPackageName;
        this.packageType = packageType;
        this.storeSortNum = storeSortNum;
        this.listPromotionName = listPromotionName;
        this.expiryValue = expiryValue;
        this.orginPlace = orginPlace;
        this.searchOption = searchOption;
        this.packageWeight = packageWeight;
        this.netprofit = netprofit;
        this.desPurprice = desPurprice;
        this.saleLimitnum = saleLimitnum;
        this.priceSearchFactor = priceSearchFactor;
        this.logisticsWay = logisticsWay;
        this.packageSize = packageSize;
        this.packageSizeInfo = packageSizeInfo;
        this.uleCardPay = uleCardPay;
        this.merchantFreightPay = merchantFreightPay;
        this.prepareCargoTime = prepareCargoTime;
        this.otherListId = otherListId;
        this.localSpecialty = localSpecialty;
        this.oldListId = oldListId;
        this.sellUnit = sellUnit;
        this.boxSell = boxSell;
        this.sellUnitSingle = sellUnitSingle;
        this.offlineCode = offlineCode;
        this.onlineableTime = onlineableTime;
        this.remark = remark;
        this.listBargaining = listBargaining;
        this.priceCompare = priceCompare;
        this.generalFlag = generalFlag;
        this.saleChannelsId = saleChannelsId;
        this.saleChannelName = saleChannelName;
        this.directProvince = directProvince;
        this.allowChangePrice = allowChangePrice;
        this.automateShelve = automateShelve;
        this.automateShelveHour = automateShelveHour;
        this.zoneProposalFlag = zoneProposalFlag;
        this.jqListDesc = jqListDesc;
        this.agencyRate = agencyRate;
        this.md5Verify = md5Verify;
        this.promotionDescTwo = promotionDescTwo;
        this.isEmsFreight = isEmsFreight;
        this.isReturnSevendays = isReturnSevendays;
        this.listingTag = listingTag;
        this.videoUrl = videoUrl;
        this.settlementPercent = settlementPercent;
        this.thirdPlatformId = thirdPlatformId;
        this.thirdPrdId = thirdPrdId;
        this.thirdProductId = thirdProductId;
        this.thirdProductPrice = thirdProductPrice;
        this.takeWay = takeWay;
        this.validPeriod = validPeriod;
        this.cuzFreightTemplateId = cuzFreightTemplateId;
        this.paymentType = paymentType;
        this.storageState = storageState;
    }

    public Listing() {
        super();
    }

    public Long getListId() {
        return listId;
    }

    public void setListId(Long listId) {
        this.listId = listId;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName == null ? null : listName.trim();
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getPrdId() {
        return prdId;
    }

    public void setPrdId(Long prdId) {
        this.prdId = prdId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getStoreCls1() {
        return storeCls1;
    }

    public void setStoreCls1(Long storeCls1) {
        this.storeCls1 = storeCls1;
    }

    public Long getStoreCls2() {
        return storeCls2;
    }

    public void setStoreCls2(Long storeCls2) {
        this.storeCls2 = storeCls2;
    }

    public Long getStoreCls3() {
        return storeCls3;
    }

    public void setStoreCls3(Long storeCls3) {
        this.storeCls3 = storeCls3;
    }

    public Long getBrand() {
        return brand;
    }

    public void setBrand(Long brand) {
        this.brand = brand;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Long getDefItemId() {
        return defItemId;
    }

    public void setDefItemId(Long defItemId) {
        this.defItemId = defItemId;
    }

    public String getDefImgUrl() {
        return defImgUrl;
    }

    public void setDefImgUrl(String defImgUrl) {
        this.defImgUrl = defImgUrl == null ? null : defImgUrl.trim();
    }

    public Long getStorage() {
        return storage;
    }

    public void setStorage(Long storage) {
        this.storage = storage;
    }

    public Integer getSoldCount() {
        return soldCount;
    }

    public void setSoldCount(Integer soldCount) {
        this.soldCount = soldCount;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public Float getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Float minPrice) {
        this.minPrice = minPrice;
    }

    public Float getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Float maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getReqVal1Ids() {
        return reqVal1Ids;
    }

    public void setReqVal1Ids(String reqVal1Ids) {
        this.reqVal1Ids = reqVal1Ids == null ? null : reqVal1Ids.trim();
    }

    public String getReqVal2Ids() {
        return reqVal2Ids;
    }

    public void setReqVal2Ids(String reqVal2Ids) {
        this.reqVal2Ids = reqVal2Ids == null ? null : reqVal2Ids.trim();
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute == null ? null : attribute.trim();
    }

    public String getListDesc() {
        return listDesc;
    }

    public void setListDesc(String listDesc) {
        this.listDesc = listDesc == null ? null : listDesc.trim();
    }

    public String getPromotionIds() {
        return promotionIds;
    }

    public void setPromotionIds(String promotionIds) {
        this.promotionIds = promotionIds == null ? null : promotionIds.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public Integer getStarId() {
        return starId;
    }

    public void setStarId(Integer starId) {
        this.starId = starId;
    }

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public String getDcCode() {
        return dcCode;
    }

    public void setDcCode(String dcCode) {
        this.dcCode = dcCode == null ? null : dcCode.trim();
    }

    public String getDcName() {
        return dcName;
    }

    public void setDcName(String dcName) {
        this.dcName = dcName == null ? null : dcName.trim();
    }

    public String getSingle() {
        return single;
    }

    public void setSingle(String single) {
        this.single = single == null ? null : single.trim();
    }

    public Boolean getLimitWay() {
        return limitWay;
    }

    public void setLimitWay(Boolean limitWay) {
        this.limitWay = limitWay;
    }

    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    public Float getFreight() {
        return freight;
    }

    public void setFreight(Float freight) {
        this.freight = freight;
    }

    public Float getInsurance() {
        return insurance;
    }

    public void setInsurance(Float insurance) {
        this.insurance = insurance;
    }

    public Float getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Float oldPrice) {
        this.oldPrice = oldPrice;
    }

    public String getPromotionDesc() {
        return promotionDesc;
    }

    public void setPromotionDesc(String promotionDesc) {
        this.promotionDesc = promotionDesc == null ? null : promotionDesc.trim();
    }

    public Boolean getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Boolean deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getSerachTag() {
        return serachTag;
    }

    public void setSerachTag(String serachTag) {
        this.serachTag = serachTag == null ? null : serachTag.trim();
    }

    public Integer getStartShipmentDate() {
        return startShipmentDate;
    }

    public void setStartShipmentDate(Integer startShipmentDate) {
        this.startShipmentDate = startShipmentDate;
    }

    public Integer getEndShipmentDate() {
        return endShipmentDate;
    }

    public void setEndShipmentDate(Integer endShipmentDate) {
        this.endShipmentDate = endShipmentDate;
    }

    public Boolean getColorDisplayType() {
        return colorDisplayType;
    }

    public void setColorDisplayType(Boolean colorDisplayType) {
        this.colorDisplayType = colorDisplayType;
    }

    public Long getMerchantStorage() {
        return merchantStorage;
    }

    public void setMerchantStorage(Long merchantStorage) {
        this.merchantStorage = merchantStorage;
    }

    public Integer getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Integer arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Integer getDeliveryMinDay() {
        return deliveryMinDay;
    }

    public void setDeliveryMinDay(Integer deliveryMinDay) {
        this.deliveryMinDay = deliveryMinDay;
    }

    public Integer getDeliveryMaxDay() {
        return deliveryMaxDay;
    }

    public void setDeliveryMaxDay(Integer deliveryMaxDay) {
        this.deliveryMaxDay = deliveryMaxDay;
    }

    public String getListNumber() {
        return listNumber;
    }

    public void setListNumber(String listNumber) {
        this.listNumber = listNumber == null ? null : listNumber.trim();
    }

    public Boolean getPriceApprovedState() {
        return priceApprovedState;
    }

    public void setPriceApprovedState(Boolean priceApprovedState) {
        this.priceApprovedState = priceApprovedState;
    }

    public Integer getOperateStateTime() {
        return operateStateTime;
    }

    public void setOperateStateTime(Integer operateStateTime) {
        this.operateStateTime = operateStateTime;
    }

    public Float getTax() {
        return tax;
    }

    public void setTax(Float tax) {
        this.tax = tax;
    }

    public Boolean getListingSource() {
        return listingSource;
    }

    public void setListingSource(Boolean listingSource) {
        this.listingSource = listingSource;
    }

    public Integer getPackageCount() {
        return packageCount;
    }

    public void setPackageCount(Integer packageCount) {
        this.packageCount = packageCount;
    }

    public Short getSaleMode() {
        return saleMode;
    }

    public void setSaleMode(Short saleMode) {
        this.saleMode = saleMode;
    }

    public Boolean getListingType() {
        return listingType;
    }

    public void setListingType(Boolean listingType) {
        this.listingType = listingType;
    }

    public Boolean getListingFlag() {
        return listingFlag;
    }

    public void setListingFlag(Boolean listingFlag) {
        this.listingFlag = listingFlag;
    }

    public Boolean getSearchEngineFlag() {
        return searchEngineFlag;
    }

    public void setSearchEngineFlag(Boolean searchEngineFlag) {
        this.searchEngineFlag = searchEngineFlag;
    }

    public Boolean getListingState() {
        return listingState;
    }

    public void setListingState(Boolean listingState) {
        this.listingState = listingState;
    }

    public String getStandardAttributeIds() {
        return standardAttributeIds;
    }

    public void setStandardAttributeIds(String standardAttributeIds) {
        this.standardAttributeIds = standardAttributeIds == null ? null : standardAttributeIds.trim();
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels == null ? null : labels.trim();
    }

    public Float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Boolean getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(Boolean settlementType) {
        this.settlementType = settlementType;
    }

    public Float getSettlementPoint() {
        return settlementPoint;
    }

    public void setSettlementPoint(Float settlementPoint) {
        this.settlementPoint = settlementPoint;
    }

    public Boolean getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(Boolean shipmentType) {
        this.shipmentType = shipmentType;
    }

    public String getNationalStandardNumber() {
        return nationalStandardNumber;
    }

    public void setNationalStandardNumber(String nationalStandardNumber) {
        this.nationalStandardNumber = nationalStandardNumber == null ? null : nationalStandardNumber.trim();
    }

    public String getImgUrls() {
        return imgUrls;
    }

    public void setImgUrls(String imgUrls) {
        this.imgUrls = imgUrls == null ? null : imgUrls.trim();
    }

    public Integer getPriceApprovedTime() {
        return priceApprovedTime;
    }

    public void setPriceApprovedTime(Integer priceApprovedTime) {
        this.priceApprovedTime = priceApprovedTime;
    }

    public Integer getFirstOnlineTime() {
        return firstOnlineTime;
    }

    public void setFirstOnlineTime(Integer firstOnlineTime) {
        this.firstOnlineTime = firstOnlineTime;
    }

    public String getListPackageName() {
        return listPackageName;
    }

    public void setListPackageName(String listPackageName) {
        this.listPackageName = listPackageName == null ? null : listPackageName.trim();
    }

    public Boolean getPackageType() {
        return packageType;
    }

    public void setPackageType(Boolean packageType) {
        this.packageType = packageType;
    }

    public Integer getStoreSortNum() {
        return storeSortNum;
    }

    public void setStoreSortNum(Integer storeSortNum) {
        this.storeSortNum = storeSortNum;
    }

    public String getListPromotionName() {
        return listPromotionName;
    }

    public void setListPromotionName(String listPromotionName) {
        this.listPromotionName = listPromotionName == null ? null : listPromotionName.trim();
    }

    public Integer getExpiryValue() {
        return expiryValue;
    }

    public void setExpiryValue(Integer expiryValue) {
        this.expiryValue = expiryValue;
    }

    public Byte getOrginPlace() {
        return orginPlace;
    }

    public void setOrginPlace(Byte orginPlace) {
        this.orginPlace = orginPlace;
    }

    public Boolean getSearchOption() {
        return searchOption;
    }

    public void setSearchOption(Boolean searchOption) {
        this.searchOption = searchOption;
    }

    public String getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(String packageWeight) {
        this.packageWeight = packageWeight == null ? null : packageWeight.trim();
    }

    public Float getNetprofit() {
        return netprofit;
    }

    public void setNetprofit(Float netprofit) {
        this.netprofit = netprofit;
    }

    public String getDesPurprice() {
        return desPurprice;
    }

    public void setDesPurprice(String desPurprice) {
        this.desPurprice = desPurprice == null ? null : desPurprice.trim();
    }

    public Integer getSaleLimitnum() {
        return saleLimitnum;
    }

    public void setSaleLimitnum(Integer saleLimitnum) {
        this.saleLimitnum = saleLimitnum;
    }

    public Float getPriceSearchFactor() {
        return priceSearchFactor;
    }

    public void setPriceSearchFactor(Float priceSearchFactor) {
        this.priceSearchFactor = priceSearchFactor;
    }

    public Integer getLogisticsWay() {
        return logisticsWay;
    }

    public void setLogisticsWay(Integer logisticsWay) {
        this.logisticsWay = logisticsWay;
    }

    public Float getPackageSize() {
        return packageSize;
    }

    public void setPackageSize(Float packageSize) {
        this.packageSize = packageSize;
    }

    public String getPackageSizeInfo() {
        return packageSizeInfo;
    }

    public void setPackageSizeInfo(String packageSizeInfo) {
        this.packageSizeInfo = packageSizeInfo == null ? null : packageSizeInfo.trim();
    }

    public Integer getUleCardPay() {
        return uleCardPay;
    }

    public void setUleCardPay(Integer uleCardPay) {
        this.uleCardPay = uleCardPay;
    }

    public Double getMerchantFreightPay() {
        return merchantFreightPay;
    }

    public void setMerchantFreightPay(Double merchantFreightPay) {
        this.merchantFreightPay = merchantFreightPay;
    }

    public Integer getPrepareCargoTime() {
        return prepareCargoTime;
    }

    public void setPrepareCargoTime(Integer prepareCargoTime) {
        this.prepareCargoTime = prepareCargoTime;
    }

    public Long getOtherListId() {
        return otherListId;
    }

    public void setOtherListId(Long otherListId) {
        this.otherListId = otherListId;
    }

    public Integer getLocalSpecialty() {
        return localSpecialty;
    }

    public void setLocalSpecialty(Integer localSpecialty) {
        this.localSpecialty = localSpecialty;
    }

    public Long getOldListId() {
        return oldListId;
    }

    public void setOldListId(Long oldListId) {
        this.oldListId = oldListId;
    }

    public String getSellUnit() {
        return sellUnit;
    }

    public void setSellUnit(String sellUnit) {
        this.sellUnit = sellUnit == null ? null : sellUnit.trim();
    }

    public Boolean getBoxSell() {
        return boxSell;
    }

    public void setBoxSell(Boolean boxSell) {
        this.boxSell = boxSell;
    }

    public String getSellUnitSingle() {
        return sellUnitSingle;
    }

    public void setSellUnitSingle(String sellUnitSingle) {
        this.sellUnitSingle = sellUnitSingle == null ? null : sellUnitSingle.trim();
    }

    public Integer getOfflineCode() {
        return offlineCode;
    }

    public void setOfflineCode(Integer offlineCode) {
        this.offlineCode = offlineCode;
    }

    public Integer getOnlineableTime() {
        return onlineableTime;
    }

    public void setOnlineableTime(Integer onlineableTime) {
        this.onlineableTime = onlineableTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getListBargaining() {
        return listBargaining;
    }

    public void setListBargaining(Integer listBargaining) {
        this.listBargaining = listBargaining;
    }

    public Boolean getPriceCompare() {
        return priceCompare;
    }

    public void setPriceCompare(Boolean priceCompare) {
        this.priceCompare = priceCompare;
    }

    public String getGeneralFlag() {
        return generalFlag;
    }

    public void setGeneralFlag(String generalFlag) {
        this.generalFlag = generalFlag == null ? null : generalFlag.trim();
    }

    public Integer getSaleChannelsId() {
        return saleChannelsId;
    }

    public void setSaleChannelsId(Integer saleChannelsId) {
        this.saleChannelsId = saleChannelsId;
    }

    public String getSaleChannelName() {
        return saleChannelName;
    }

    public void setSaleChannelName(String saleChannelName) {
        this.saleChannelName = saleChannelName == null ? null : saleChannelName.trim();
    }

    public Long getDirectProvince() {
        return directProvince;
    }

    public void setDirectProvince(Long directProvince) {
        this.directProvince = directProvince;
    }

    public Boolean getAllowChangePrice() {
        return allowChangePrice;
    }

    public void setAllowChangePrice(Boolean allowChangePrice) {
        this.allowChangePrice = allowChangePrice;
    }

    public Boolean getAutomateShelve() {
        return automateShelve;
    }

    public void setAutomateShelve(Boolean automateShelve) {
        this.automateShelve = automateShelve;
    }

    public Integer getAutomateShelveHour() {
        return automateShelveHour;
    }

    public void setAutomateShelveHour(Integer automateShelveHour) {
        this.automateShelveHour = automateShelveHour;
    }

    public Boolean getZoneProposalFlag() {
        return zoneProposalFlag;
    }

    public void setZoneProposalFlag(Boolean zoneProposalFlag) {
        this.zoneProposalFlag = zoneProposalFlag;
    }

    public String getJqListDesc() {
        return jqListDesc;
    }

    public void setJqListDesc(String jqListDesc) {
        this.jqListDesc = jqListDesc == null ? null : jqListDesc.trim();
    }

    public Float getAgencyRate() {
        return agencyRate;
    }

    public void setAgencyRate(Float agencyRate) {
        this.agencyRate = agencyRate;
    }

    public String getMd5Verify() {
        return md5Verify;
    }

    public void setMd5Verify(String md5Verify) {
        this.md5Verify = md5Verify == null ? null : md5Verify.trim();
    }

    public String getPromotionDescTwo() {
        return promotionDescTwo;
    }

    public void setPromotionDescTwo(String promotionDescTwo) {
        this.promotionDescTwo = promotionDescTwo == null ? null : promotionDescTwo.trim();
    }

    public Boolean getIsEmsFreight() {
        return isEmsFreight;
    }

    public void setIsEmsFreight(Boolean isEmsFreight) {
        this.isEmsFreight = isEmsFreight;
    }

    public Boolean getIsReturnSevendays() {
        return isReturnSevendays;
    }

    public void setIsReturnSevendays(Boolean isReturnSevendays) {
        this.isReturnSevendays = isReturnSevendays;
    }

    public String getListingTag() {
        return listingTag;
    }

    public void setListingTag(String listingTag) {
        this.listingTag = listingTag == null ? null : listingTag.trim();
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    public Integer getSettlementPercent() {
        return settlementPercent;
    }

    public void setSettlementPercent(Integer settlementPercent) {
        this.settlementPercent = settlementPercent;
    }

    public Boolean getThirdPlatformId() {
        return thirdPlatformId;
    }

    public void setThirdPlatformId(Boolean thirdPlatformId) {
        this.thirdPlatformId = thirdPlatformId;
    }

    public String getThirdPrdId() {
        return thirdPrdId;
    }

    public void setThirdPrdId(String thirdPrdId) {
        this.thirdPrdId = thirdPrdId == null ? null : thirdPrdId.trim();
    }

    public Long getThirdProductId() {
        return thirdProductId;
    }

    public void setThirdProductId(Long thirdProductId) {
        this.thirdProductId = thirdProductId;
    }

    public Float getThirdProductPrice() {
        return thirdProductPrice;
    }

    public void setThirdProductPrice(Float thirdProductPrice) {
        this.thirdProductPrice = thirdProductPrice;
    }

    public String getTakeWay() {
        return takeWay;
    }

    public void setTakeWay(String takeWay) {
        this.takeWay = takeWay == null ? null : takeWay.trim();
    }

    public String getValidPeriod() {
        return validPeriod;
    }

    public void setValidPeriod(String validPeriod) {
        this.validPeriod = validPeriod == null ? null : validPeriod.trim();
    }

    public Long getCuzFreightTemplateId() {
        return cuzFreightTemplateId;
    }

    public void setCuzFreightTemplateId(Long cuzFreightTemplateId) {
        this.cuzFreightTemplateId = cuzFreightTemplateId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType == null ? null : paymentType.trim();
    }

    public Boolean getStorageState() {
        return storageState;
    }

    public void setStorageState(Boolean storageState) {
        this.storageState = storageState;
    }

    @Override
    public String toString() {
        return "Listing{" +
                "listId=" + listId +
                ", listName='" + listName + '\'' +
                ", merchantId=" + merchantId +
                ", merchantName='" + merchantName + '\'' +
                ", storeName='" + storeName + '\'' +
                ", storeId=" + storeId +
                ", prdId=" + prdId +
                ", categoryId=" + categoryId +
                ", storeCls1=" + storeCls1 +
                ", storeCls2=" + storeCls2 +
                ", storeCls3=" + storeCls3 +
                ", brand=" + brand +
                ", weight=" + weight +
                ", defItemId=" + defItemId +
                ", defImgUrl='" + defImgUrl + '\'' +
                ", storage=" + storage +
                ", soldCount=" + soldCount +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", minPrice=" + minPrice +
                ", maxPrice=" + maxPrice +
                ", reqVal1Ids='" + reqVal1Ids + '\'' +
                ", reqVal2Ids='" + reqVal2Ids + '\'' +
                ", attribute='" + attribute + '\'' +
                ", listDesc='" + listDesc + '\'' +
                ", promotionIds='" + promotionIds + '\'' +
                ", tag='" + tag + '\'' +
                ", delFlag=" + delFlag +
                ", starId=" + starId +
                ", adId=" + adId +
                ", dcCode='" + dcCode + '\'' +
                ", dcName='" + dcName + '\'' +
                ", single='" + single + '\'' +
                ", limitWay=" + limitWay +
                ", limitNum=" + limitNum +
                ", freight=" + freight +
                ", insurance=" + insurance +
                ", oldPrice=" + oldPrice +
                ", promotionDesc='" + promotionDesc + '\'' +
                ", deliveryType=" + deliveryType +
                ", serachTag='" + serachTag + '\'' +
                ", startShipmentDate=" + startShipmentDate +
                ", endShipmentDate=" + endShipmentDate +
                ", colorDisplayType=" + colorDisplayType +
                ", merchantStorage=" + merchantStorage +
                ", arrivalDate=" + arrivalDate +
                ", deliveryMinDay=" + deliveryMinDay +
                ", deliveryMaxDay=" + deliveryMaxDay +
                ", listNumber='" + listNumber + '\'' +
                ", priceApprovedState=" + priceApprovedState +
                ", operateStateTime=" + operateStateTime +
                ", tax=" + tax +
                ", listingSource=" + listingSource +
                ", packageCount=" + packageCount +
                ", saleMode=" + saleMode +
                ", listingType=" + listingType +
                ", listingFlag=" + listingFlag +
                ", searchEngineFlag=" + searchEngineFlag +
                ", listingState=" + listingState +
                ", standardAttributeIds='" + standardAttributeIds + '\'' +
                ", labels='" + labels + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", settlementType=" + settlementType +
                ", settlementPoint=" + settlementPoint +
                ", shipmentType=" + shipmentType +
                ", nationalStandardNumber='" + nationalStandardNumber + '\'' +
                ", imgUrls='" + imgUrls + '\'' +
                ", priceApprovedTime=" + priceApprovedTime +
                ", firstOnlineTime=" + firstOnlineTime +
                ", listPackageName='" + listPackageName + '\'' +
                ", packageType=" + packageType +
                ", storeSortNum=" + storeSortNum +
                ", listPromotionName='" + listPromotionName + '\'' +
                ", expiryValue=" + expiryValue +
                ", orginPlace=" + orginPlace +
                ", searchOption=" + searchOption +
                ", packageWeight='" + packageWeight + '\'' +
                ", netprofit=" + netprofit +
                ", desPurprice='" + desPurprice + '\'' +
                ", saleLimitnum=" + saleLimitnum +
                ", priceSearchFactor=" + priceSearchFactor +
                ", logisticsWay=" + logisticsWay +
                ", packageSize=" + packageSize +
                ", packageSizeInfo='" + packageSizeInfo + '\'' +
                ", uleCardPay=" + uleCardPay +
                ", merchantFreightPay=" + merchantFreightPay +
                ", prepareCargoTime=" + prepareCargoTime +
                ", otherListId=" + otherListId +
                ", localSpecialty=" + localSpecialty +
                ", oldListId=" + oldListId +
                ", sellUnit='" + sellUnit + '\'' +
                ", boxSell=" + boxSell +
                ", sellUnitSingle='" + sellUnitSingle + '\'' +
                ", offlineCode=" + offlineCode +
                ", onlineableTime=" + onlineableTime +
                ", remark='" + remark + '\'' +
                ", listBargaining=" + listBargaining +
                ", priceCompare=" + priceCompare +
                ", generalFlag='" + generalFlag + '\'' +
                ", saleChannelsId=" + saleChannelsId +
                ", saleChannelName='" + saleChannelName + '\'' +
                ", directProvince=" + directProvince +
                ", allowChangePrice=" + allowChangePrice +
                ", automateShelve=" + automateShelve +
                ", automateShelveHour=" + automateShelveHour +
                ", zoneProposalFlag=" + zoneProposalFlag +
                ", jqListDesc='" + jqListDesc + '\'' +
                ", agencyRate=" + agencyRate +
                ", md5Verify='" + md5Verify + '\'' +
                ", promotionDescTwo='" + promotionDescTwo + '\'' +
                ", isEmsFreight=" + isEmsFreight +
                ", isReturnSevendays=" + isReturnSevendays +
                ", listingTag='" + listingTag + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", settlementPercent=" + settlementPercent +
                ", thirdPlatformId=" + thirdPlatformId +
                ", thirdPrdId='" + thirdPrdId + '\'' +
                ", thirdProductId=" + thirdProductId +
                ", thirdProductPrice=" + thirdProductPrice +
                ", takeWay='" + takeWay + '\'' +
                ", validPeriod='" + validPeriod + '\'' +
                ", cuzFreightTemplateId=" + cuzFreightTemplateId +
                ", paymentType='" + paymentType + '\'' +
                ", storageState=" + storageState +
                '}';
    }
}