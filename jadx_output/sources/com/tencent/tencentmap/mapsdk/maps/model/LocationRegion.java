package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public class LocationRegion {
    public com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.RegionName regionName;
    public android.location.Location target;

    /* loaded from: classes13.dex */
    public interface LocationRegionChangedListener {
        void onLocationRegionChanged(com.tencent.tencentmap.mapsdk.maps.model.LocationRegion locationRegion, com.tencent.tencentmap.mapsdk.maps.model.LocationRegion locationRegion2);
    }

    /* loaded from: classes6.dex */
    public enum RegionName {
        EARTH,
        TAIWAN_OF_CHINA,
        INLAND_WITHOUT_SAR_OF_CHINA,
        OUT_OF_CHINA
    }
}
