package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public class VectorHeatAggregationUnit {
    private com.tencent.tencentmap.mapsdk.maps.model.LatLng mCenter;
    private double mIntensity;
    private com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng[] mNodes;

    private VectorHeatAggregationUnit() {
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLng getCenter() {
        return this.mCenter;
    }

    public double getIntensity() {
        return this.mIntensity;
    }

    public com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng[] getNodes() {
        return this.mNodes;
    }

    private VectorHeatAggregationUnit(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, double d17, com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng[] weightedLatLngArr) {
        this.mCenter = latLng;
        this.mIntensity = d17;
        this.mNodes = weightedLatLngArr;
    }
}
