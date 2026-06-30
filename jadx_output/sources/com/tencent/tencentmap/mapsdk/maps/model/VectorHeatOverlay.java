package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public interface VectorHeatOverlay {
    com.tencent.tencentmap.mapsdk.maps.model.VectorHeatAggregationUnit getUnit(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);

    void remove();

    void setOpacity(float f17);

    void setVisibility(boolean z17);
}
