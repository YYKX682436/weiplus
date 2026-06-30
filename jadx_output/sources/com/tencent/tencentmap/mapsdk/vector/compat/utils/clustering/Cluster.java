package com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering;

/* loaded from: classes13.dex */
public interface Cluster<T extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem> {
    java.util.Collection<T> getItems();

    com.tencent.mapsdk.raster.model.LatLng getPosition();

    int getSize();
}
