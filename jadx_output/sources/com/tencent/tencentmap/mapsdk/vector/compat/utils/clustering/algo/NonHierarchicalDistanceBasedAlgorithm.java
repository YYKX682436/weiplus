package com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo;

/* loaded from: classes13.dex */
public class NonHierarchicalDistanceBasedAlgorithm<T extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem> implements com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.tencentmap.mapsdk.vector.compat.utils.a.i f215449a = new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.i(1.0d);

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f215450b;

    /* renamed from: d, reason: collision with root package name */
    public int f215452d;

    /* renamed from: c, reason: collision with root package name */
    public int f215451c = 35;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Collection<com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem<T>> f215453e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.vector.compat.utils.a.j<com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem<T>> f215454f = new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.j<>(0.0d, 1.0d, 0.0d, 1.0d);

    /* loaded from: classes13.dex */
    public static class QuadItem<T extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem> implements com.tencent.tencentmap.mapsdk.vector.compat.utils.a.j.a, com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f215455a;

        /* renamed from: b, reason: collision with root package name */
        public final com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h f215456b;

        /* renamed from: c, reason: collision with root package name */
        public final com.tencent.mapsdk.raster.model.LatLng f215457c;

        /* renamed from: d, reason: collision with root package name */
        public java.util.Set<T> f215458d;

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem) {
                return ((com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem) obj).f215455a.equals(this.f215455a);
            }
            return false;
        }

        @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.a.j.a
        public com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h getPoint() {
            return this.f215456b;
        }

        @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster
        public com.tencent.mapsdk.raster.model.LatLng getPosition() {
            return this.f215457c;
        }

        @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster
        public int getSize() {
            return 1;
        }

        public int hashCode() {
            return this.f215455a.hashCode();
        }

        public QuadItem(T t17) {
            this.f215455a = t17;
            com.tencent.mapsdk.raster.model.LatLng position = t17.getPosition();
            this.f215457c = position;
            this.f215456b = com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.f215449a.a(position);
            this.f215458d = java.util.Collections.singleton(t17);
        }

        @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster
        public java.util.Set<T> getItems() {
            return this.f215458d;
        }
    }

    public NonHierarchicalDistanceBasedAlgorithm(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f215450b = applicationContext;
        this.f215452d = (int) ((applicationContext.getResources().getDisplayMetrics().density * this.f215451c) + 0.5f);
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm
    public void addItem(T t17) {
        com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem<T> quadItem = new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem<>(t17);
        synchronized (this.f215454f) {
            this.f215453e.add(quadItem);
            this.f215454f.a((com.tencent.tencentmap.mapsdk.vector.compat.utils.a.j<com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem<T>>) quadItem);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm
    public void addItems(java.util.Collection<T> collection) {
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            addItem(it.next());
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm
    public void clearItems() {
        synchronized (this.f215454f) {
            this.f215453e.clear();
            this.f215454f.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm
    public java.util.Set<? extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T>> getClusters(double d17) {
        int i17 = 1;
        double pow = (this.f215452d / java.lang.Math.pow(2.0d, ((int) d17) + 1)) / 256.0d;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        synchronized (this.f215454f) {
            for (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem<T> quadItem : this.f215453e) {
                if (!hashSet.contains(quadItem)) {
                    java.util.Collection<com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem<T>> a17 = this.f215454f.a(a(quadItem.getPoint(), pow));
                    if (a17.size() == i17) {
                        hashSet2.add(quadItem);
                        hashSet.add(quadItem);
                        hashMap.put(quadItem, java.lang.Double.valueOf(0.0d));
                    } else {
                        com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.StaticCluster staticCluster = new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.StaticCluster(quadItem.f215455a.getPosition());
                        hashSet2.add(staticCluster);
                        for (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem<T> quadItem2 : a17) {
                            java.lang.Double d18 = (java.lang.Double) hashMap.get(quadItem2);
                            double d19 = pow;
                            double a18 = a(quadItem2.getPoint(), quadItem.getPoint());
                            if (d18 != null) {
                                if (d18.doubleValue() < a18) {
                                    pow = d19;
                                } else {
                                    ((com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.StaticCluster) hashMap2.get(quadItem2)).remove(quadItem2.f215455a);
                                }
                            }
                            hashMap.put(quadItem2, java.lang.Double.valueOf(a18));
                            staticCluster.add(quadItem2.f215455a);
                            hashMap2.put(quadItem2, staticCluster);
                            pow = d19;
                        }
                        hashSet.addAll(a17);
                        pow = pow;
                        i17 = 1;
                    }
                }
            }
        }
        return hashSet2;
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm
    public java.util.Collection<T> getItems() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.f215454f) {
            java.util.Iterator<com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem<T>> it = this.f215453e.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f215455a);
            }
        }
        return arrayList;
    }

    public int getMaxDistanceAtZoom() {
        return this.f215451c;
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm
    public void removeItem(T t17) {
        com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem<T> quadItem = new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem<>(t17);
        synchronized (this.f215454f) {
            this.f215453e.remove(quadItem);
            this.f215454f.b(quadItem);
        }
    }

    public void setMaxDistanceAtZoom(int i17) {
        this.f215451c = i17;
        this.f215452d = (int) ((this.f215450b.getResources().getDisplayMetrics().density * this.f215451c) + 0.5f);
    }

    public final double a(com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h hVar, com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h hVar2) {
        double d17 = hVar.f215397a - hVar2.f215397a;
        double d18 = hVar.f215398b - hVar2.f215398b;
        return (d17 * d17) + (d18 * d18);
    }

    public final com.tencent.tencentmap.mapsdk.vector.compat.utils.a.g a(com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h hVar, double d17) {
        double d18 = d17 / 2.0d;
        double d19 = hVar.f215397a;
        double d27 = d19 - d18;
        double d28 = d19 + d18;
        double d29 = hVar.f215398b;
        return new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.g(d27, d28, d29 - d18, d29 + d18);
    }
}
