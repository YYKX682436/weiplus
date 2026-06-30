package com.tencent.mm.storage;

/* loaded from: classes15.dex */
public class RegionCodeDecoder$Region {
    private java.lang.String code;
    private java.lang.String countryCode;
    private java.lang.String name;
    private boolean hasChildren = false;
    private com.tencent.mm.storage.RegionCodeDecoder$Region parent = null;
    private boolean isCountry = false;
    private boolean isProvince = false;
    private boolean isCity = false;

    public java.lang.String getCode() {
        return this.code;
    }

    public java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public com.tencent.mm.storage.RegionCodeDecoder$Region getParent() {
        return this.parent;
    }

    public boolean hasChildren() {
        return this.hasChildren;
    }

    public boolean isCity() {
        return this.isCity;
    }

    public boolean isCountry() {
        return this.isCountry;
    }

    public boolean isProvince() {
        return this.isProvince;
    }

    public void setCity(boolean z17) {
        this.isCity = z17;
    }

    public void setCode(java.lang.String str) {
        this.code = str;
    }

    public void setCountry(boolean z17) {
        this.isCountry = z17;
    }

    public void setCountryCode(java.lang.String str) {
        this.countryCode = str;
    }

    public void setHasChildren(boolean z17) {
        this.hasChildren = z17;
    }

    public void setName(java.lang.String str) {
        this.name = str;
    }

    public void setParent(com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region) {
        this.parent = regionCodeDecoder$Region;
    }

    public void setProvince(boolean z17) {
        this.isProvince = z17;
    }
}
