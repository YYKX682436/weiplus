package com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo;

/* loaded from: classes13.dex */
public class PreCachingAlgorithmDecorator<T extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem> implements com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm<T> {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm<T> f215459a;

    /* renamed from: b, reason: collision with root package name */
    public final x.g f215460b = new x.g(5);

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.locks.ReadWriteLock f215461c = new java.util.concurrent.locks.ReentrantReadWriteLock();

    /* loaded from: classes13.dex */
    public class PrecacheRunnable implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f215462a;

        public PrecacheRunnable(int i17) {
            this.f215462a = i17;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                java.lang.Thread.sleep((long) ((java.lang.Math.random() * 500.0d) + 500.0d));
            } catch (java.lang.InterruptedException unused) {
            }
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.PreCachingAlgorithmDecorator.this.a(this.f215462a);
        }
    }

    public PreCachingAlgorithmDecorator(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm<T> algorithm) {
        this.f215459a = algorithm;
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm
    public void addItem(T t17) {
        this.f215459a.addItem(t17);
        a();
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm
    public void addItems(java.util.Collection<T> collection) {
        this.f215459a.addItems(collection);
        a();
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm
    public void clearItems() {
        this.f215459a.clearItems();
        a();
    }

    public com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm getAlgorithm() {
        return this.f215459a;
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm
    public java.util.Set<? extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T>> getClusters(double d17) {
        int i17 = (int) d17;
        java.util.Set<? extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T>> a17 = a(i17);
        int i18 = i17 + 1;
        if (this.f215460b.get(java.lang.Integer.valueOf(i18)) == null) {
            new java.lang.Thread(new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.PreCachingAlgorithmDecorator.PrecacheRunnable(i18)).start();
        }
        int i19 = i17 - 1;
        if (this.f215460b.get(java.lang.Integer.valueOf(i19)) == null) {
            new java.lang.Thread(new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.PreCachingAlgorithmDecorator.PrecacheRunnable(i19)).start();
        }
        return a17;
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm
    public java.util.Collection<T> getItems() {
        return this.f215459a.getItems();
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm
    public void removeItem(T t17) {
        this.f215459a.removeItem(t17);
        a();
    }

    public final void a() {
        this.f215460b.evictAll();
    }

    public final java.util.Set<? extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T>> a(int i17) {
        this.f215461c.readLock().lock();
        java.util.Set<? extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T>> set = (java.util.Set) this.f215460b.get(java.lang.Integer.valueOf(i17));
        this.f215461c.readLock().unlock();
        if (set == null) {
            this.f215461c.writeLock().lock();
            set = (java.util.Set) this.f215460b.get(java.lang.Integer.valueOf(i17));
            if (set == null) {
                set = this.f215459a.getClusters(i17);
                this.f215460b.put(java.lang.Integer.valueOf(i17), set);
            }
            this.f215461c.writeLock().unlock();
        }
        return set;
    }
}
