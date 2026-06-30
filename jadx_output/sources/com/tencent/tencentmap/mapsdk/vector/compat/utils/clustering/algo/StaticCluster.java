package com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo;

/* loaded from: classes13.dex */
public class StaticCluster<T extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem> implements com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T> {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mapsdk.raster.model.LatLng f215464a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List<T> f215465b = new java.util.ArrayList();

    public StaticCluster(com.tencent.mapsdk.raster.model.LatLng latLng) {
        this.f215464a = latLng;
    }

    public boolean add(T t17) {
        return this.f215465b.add(t17);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.StaticCluster)) {
            return false;
        }
        com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.StaticCluster staticCluster = (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.StaticCluster) obj;
        return staticCluster.f215464a.equals(this.f215464a) && staticCluster.f215465b.equals(this.f215465b);
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster
    public java.util.Collection<T> getItems() {
        return this.f215465b;
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster
    public com.tencent.mapsdk.raster.model.LatLng getPosition() {
        return this.f215464a;
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster
    public int getSize() {
        return this.f215465b.size();
    }

    public boolean remove(T t17) {
        return this.f215465b.remove(t17);
    }

    public java.lang.String toString() {
        return "StaticCluster{mCenter=" + this.f215464a + ", mItems.size=" + this.f215465b.size() + '}';
    }
}
