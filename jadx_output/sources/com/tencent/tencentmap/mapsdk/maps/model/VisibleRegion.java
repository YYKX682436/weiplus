package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public final class VisibleRegion {
    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng farLeft;
    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng farRight;
    public final com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds;
    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng nearLeft;
    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng nearRight;

    public VisibleRegion(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng3, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng4, com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds) {
        this.nearLeft = latLng;
        this.nearRight = latLng2;
        this.farLeft = latLng3;
        this.farRight = latLng4;
        this.latLngBounds = latLngBounds;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion)) {
            return false;
        }
        com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion visibleRegion = (com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion) obj;
        return this.nearLeft.equals(visibleRegion.nearLeft) && this.nearRight.equals(visibleRegion.nearRight) && this.farLeft.equals(visibleRegion.farLeft) && this.farRight.equals(visibleRegion.farRight) && this.latLngBounds.equals(visibleRegion.latLngBounds);
    }

    public final java.lang.String toString() {
        return "nearLeft" + this.nearLeft + "nearRight" + this.nearRight + "farLeft" + this.farLeft + "farRight" + this.farRight + "latLngBounds" + this.latLngBounds;
    }
}
