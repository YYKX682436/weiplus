package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public interface GroundOverlay {
    void remove();

    void setAlpha(float f17);

    void setAnchor(float f17, float f18);

    void setBitmap(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor);

    void setLatLongBounds(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds);

    void setLevel(int i17);

    void setPosition(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);

    void setVisibility(boolean z17);

    void setZindex(int i17);

    void setZoom(float f17);
}
