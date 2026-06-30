package com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo;

/* loaded from: classes13.dex */
public class GridBasedAlgorithm<T extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem> implements com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm<T> {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set<T> f215448a = java.util.Collections.synchronizedSet(new java.util.HashSet());

    public static long a(long j17, double d17, double d18) {
        return (long) ((j17 * java.lang.Math.floor(d17)) + java.lang.Math.floor(d18));
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm
    public void addItem(T t17) {
        this.f215448a.add(t17);
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm
    public void addItems(java.util.Collection<T> collection) {
        this.f215448a.addAll(collection);
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm
    public void clearItems() {
        this.f215448a.clear();
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm
    public java.util.Set<? extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T>> getClusters(double d17) {
        long j17;
        long ceil = (long) java.lang.Math.ceil((java.lang.Math.pow(2.0d, d17) * 256.0d) / 100.0d);
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.i iVar = new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.i(ceil);
        java.util.HashSet hashSet = new java.util.HashSet();
        android.util.LongSparseArray longSparseArray = new android.util.LongSparseArray();
        synchronized (this.f215448a) {
            for (T t17 : this.f215448a) {
                com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h a17 = iVar.a(t17.getPosition());
                long a18 = a(ceil, a17.f215397a, a17.f215398b);
                com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.StaticCluster staticCluster = (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.StaticCluster) longSparseArray.get(a18);
                if (staticCluster == null) {
                    j17 = ceil;
                    staticCluster = new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.StaticCluster(iVar.a(new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h(java.lang.Math.floor(a17.f215397a) + 0.5d, java.lang.Math.floor(a17.f215398b) + 0.5d)));
                    longSparseArray.put(a18, staticCluster);
                    hashSet.add(staticCluster);
                } else {
                    j17 = ceil;
                }
                staticCluster.add(t17);
                ceil = j17;
            }
        }
        return hashSet;
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm
    public java.util.Collection<T> getItems() {
        return this.f215448a;
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm
    public void removeItem(T t17) {
        this.f215448a.remove(t17);
    }
}
