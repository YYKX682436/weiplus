package com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo;

/* loaded from: classes13.dex */
public interface Algorithm<T extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem> {
    void addItem(T t17);

    void addItems(java.util.Collection<T> collection);

    void clearItems();

    java.util.Set<? extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T>> getClusters(double d17);

    java.util.Collection<T> getItems();

    void removeItem(T t17);
}
