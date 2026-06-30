package com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view;

/* loaded from: classes13.dex */
public interface ClusterRenderer<T extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem> {
    void cancel();

    void onAdd();

    void onClustersChanged(java.util.Set<? extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T>> set);

    void onRemove();

    void setInfoWindowAdapter(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.ClusterInfoWindowAdapter clusterInfoWindowAdapter);

    void setItemInfoWindowAdapter(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.ClusterItemInfoWindowAdapter clusterItemInfoWindowAdapter);

    void setOnClusterClickListener(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.OnClusterClickListener<T> onClusterClickListener);

    void setOnClusterInfoWindowClickListener(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener);

    void setOnClusterItemClickListener(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener);

    void setOnClusterItemInfoWindowClickListener(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener);
}
