package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public class LocationCompass {
    private com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor compassImage;
    private com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor[] mGroupIcons;

    public LocationCompass(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor, com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor[] bitmapDescriptorArr) {
        this.compassImage = bitmapDescriptor;
        this.mGroupIcons = bitmapDescriptorArr;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor[] getCompassGroupImages() {
        return this.mGroupIcons;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor getCompassImage() {
        return this.compassImage;
    }

    public void setCompassGroupImage(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor[] bitmapDescriptorArr) {
        if (bitmapDescriptorArr == null || bitmapDescriptorArr.length != 4) {
            return;
        }
        this.mGroupIcons = bitmapDescriptorArr;
    }

    public void setCompassImage(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor) {
        this.compassImage = bitmapDescriptor;
    }
}
