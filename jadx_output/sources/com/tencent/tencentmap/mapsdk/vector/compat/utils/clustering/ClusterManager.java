package com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering;

/* loaded from: classes13.dex */
public class ClusterManager<T extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem> implements com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener, com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener, com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener, com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager f215427a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager.Collection f215428b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager.Collection f215429c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm<T> f215430d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.locks.ReadWriteLock f215431e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.ClusterRenderer<T> f215432f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.map.TencentMap f215433g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mapsdk.raster.model.CameraPosition f215434h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager<T>.a f215435i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.locks.ReadWriteLock f215436j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f215437k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.OnClusterItemClickListener<T> f215438l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.OnClusterInfoWindowClickListener<T> f215439m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.ClusterInfoWindowAdapter<T> f215440n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.OnClusterItemInfoWindowClickListener<T> f215441o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.OnClusterClickListener<T> f215442p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.ClusterItemInfoWindowAdapter<T> f215443q;

    /* loaded from: classes13.dex */
    public interface ClusterInfoWindowAdapter<T extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem> {
        android.view.View getInfoContents(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T> cluster);

        android.view.View getInfoWindow(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T> cluster);

        android.view.View getInfoWindowPressState(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T> cluster);
    }

    /* loaded from: classes13.dex */
    public interface ClusterItemInfoWindowAdapter<T extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem> {
        android.view.View getInfoContents(T t17);

        android.view.View getInfoWindow(T t17);

        android.view.View getInfoWindowPressState(T t17);
    }

    /* loaded from: classes13.dex */
    public interface OnClusterClickListener<T extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem> {
        boolean onClusterClick(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T> cluster);
    }

    /* loaded from: classes13.dex */
    public interface OnClusterInfoWindowClickListener<T extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem> {
        void onClusterInfoWindowClick(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T> cluster);
    }

    /* loaded from: classes13.dex */
    public interface OnClusterItemClickListener<T extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem> {
        boolean onClusterItemClick(T t17);
    }

    /* loaded from: classes13.dex */
    public interface OnClusterItemInfoWindowClickListener<T extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem> {
        void onClusterItemInfoWindowClick(T t17);
    }

    /* loaded from: classes13.dex */
    public class b implements com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T> {

        /* renamed from: a, reason: collision with root package name */
        public T f215445a;

        /* renamed from: b, reason: collision with root package name */
        public java.util.Set<T> f215446b;

        public b(T t17) {
            this.f215445a = t17;
            this.f215446b = java.util.Collections.singleton(t17);
        }

        @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster
        public java.util.Collection<T> getItems() {
            return this.f215446b;
        }

        @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster
        public com.tencent.mapsdk.raster.model.LatLng getPosition() {
            return this.f215445a.getPosition();
        }

        @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster
        public int getSize() {
            return 1;
        }
    }

    public ClusterManager(android.content.Context context, com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap) {
        this(context, tencentMap, new com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager(tencentMap));
    }

    public void addItem(T t17) {
        this.f215431e.writeLock().lock();
        try {
            this.f215430d.addItem(t17);
        } finally {
            this.f215431e.writeLock().unlock();
        }
    }

    public void addItems(java.util.Collection<T> collection) {
        this.f215431e.writeLock().lock();
        try {
            this.f215430d.addItems(collection);
        } finally {
            this.f215431e.writeLock().unlock();
        }
    }

    public void cancel() {
        clearItems();
        if (this.f215435i.cancel(true)) {
            return;
        }
        this.f215432f.cancel();
    }

    public void clearItems() {
        this.f215431e.writeLock().lock();
        try {
            this.f215430d.clearItems();
        } finally {
            this.f215431e.writeLock().unlock();
        }
    }

    public void cluster() {
        this.f215436j.writeLock().lock();
        try {
            this.f215435i.cancel(true);
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager<T>.a aVar = new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.a();
            this.f215435i = aVar;
            aVar.executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, java.lang.Float.valueOf(this.f215433g.getCameraPosition().getZoom()));
        } finally {
            this.f215436j.writeLock().unlock();
        }
    }

    public com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm<T> getAlgorithm() {
        return this.f215430d;
    }

    public com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager.Collection getClusterMarkerCollection() {
        return this.f215429c;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter
    public android.view.View getInfoWindow(com.tencent.mapsdk.raster.model.Marker marker) {
        return getMarkerManager().getInfoWindow(marker);
    }

    public com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager.Collection getMarkerCollection() {
        return this.f215428b;
    }

    public com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager getMarkerManager() {
        return this.f215427a;
    }

    public com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.ClusterRenderer<T> getRenderer() {
        return this.f215432f;
    }

    public boolean isClusterEnabled() {
        return this.f215437k;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener
    public void onCameraChange(com.tencent.mapsdk.raster.model.CameraPosition cameraPosition) {
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener
    public void onCameraChangeFinish(com.tencent.mapsdk.raster.model.CameraPosition cameraPosition) {
        if (this.f215437k) {
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.ClusterRenderer<T> clusterRenderer = this.f215432f;
            if (clusterRenderer instanceof com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener) {
                ((com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener) clusterRenderer).onCameraChangeFinish(cameraPosition);
            }
            com.tencent.mapsdk.raster.model.CameraPosition cameraPosition2 = this.f215433g.getCameraPosition();
            com.tencent.mapsdk.raster.model.CameraPosition cameraPosition3 = this.f215434h;
            if (cameraPosition3 == null || cameraPosition3.getZoom() != cameraPosition2.getZoom()) {
                this.f215434h = this.f215433g.getCameraPosition();
                cluster();
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener
    public void onInfoWindowClick(com.tencent.mapsdk.raster.model.Marker marker) {
        getMarkerManager().onInfoWindowClick(marker);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter
    public void onInfoWindowDettached(com.tencent.mapsdk.raster.model.Marker marker, android.view.View view) {
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener
    public boolean onMarkerClick(com.tencent.mapsdk.raster.model.Marker marker) {
        return getMarkerManager().onMarkerClick(marker);
    }

    public void removeItem(T t17) {
        this.f215431e.writeLock().lock();
        try {
            this.f215430d.removeItem(t17);
        } finally {
            this.f215431e.writeLock().unlock();
        }
    }

    public void setAlgorithm(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm<T> algorithm) {
        this.f215431e.writeLock().lock();
        try {
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm<T> algorithm2 = this.f215430d;
            if (algorithm2 != null) {
                algorithm.addItems(algorithm2.getItems());
            }
            this.f215430d = new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.PreCachingAlgorithmDecorator(algorithm);
            this.f215431e.writeLock().unlock();
            cluster();
        } catch (java.lang.Throwable th6) {
            this.f215431e.writeLock().unlock();
            throw th6;
        }
    }

    public void setClusterEnabled(boolean z17) {
        if (this.f215437k ^ z17) {
            this.f215437k = z17;
            cluster();
        }
    }

    public void setClusterInfoWindowAdapter(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.ClusterInfoWindowAdapter<T> clusterInfoWindowAdapter) {
        this.f215440n = clusterInfoWindowAdapter;
        this.f215432f.setInfoWindowAdapter(clusterInfoWindowAdapter);
    }

    public void setClusterItemInfoWindowAdapter(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.ClusterItemInfoWindowAdapter<T> clusterItemInfoWindowAdapter) {
        this.f215443q = clusterItemInfoWindowAdapter;
        this.f215432f.setItemInfoWindowAdapter(clusterItemInfoWindowAdapter);
    }

    public void setOnClusterClickListener(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.OnClusterClickListener<T> onClusterClickListener) {
        this.f215442p = onClusterClickListener;
        this.f215432f.setOnClusterClickListener(onClusterClickListener);
    }

    public void setOnClusterInfoWindowClickListener(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener) {
        this.f215439m = onClusterInfoWindowClickListener;
        this.f215432f.setOnClusterInfoWindowClickListener(onClusterInfoWindowClickListener);
    }

    public void setOnClusterItemClickListener(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener) {
        this.f215438l = onClusterItemClickListener;
        this.f215432f.setOnClusterItemClickListener(onClusterItemClickListener);
    }

    public void setOnClusterItemInfoWindowClickListener(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener) {
        this.f215441o = onClusterItemInfoWindowClickListener;
        this.f215432f.setOnClusterItemInfoWindowClickListener(onClusterItemInfoWindowClickListener);
    }

    public void setRenderer(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.ClusterRenderer<T> clusterRenderer) {
        this.f215432f.setOnClusterClickListener(null);
        this.f215432f.setOnClusterItemClickListener(null);
        this.f215429c.a();
        this.f215428b.a();
        this.f215432f.onRemove();
        this.f215432f = clusterRenderer;
        clusterRenderer.onAdd();
        this.f215432f.setOnClusterClickListener(this.f215442p);
        this.f215432f.setOnClusterInfoWindowClickListener(this.f215439m);
        this.f215432f.setOnClusterItemClickListener(this.f215438l);
        this.f215432f.setOnClusterItemInfoWindowClickListener(this.f215441o);
        cluster();
    }

    public ClusterManager(android.content.Context context, com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap, com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager markerManager) {
        this.f215431e = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.f215436j = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.f215437k = true;
        this.f215433g = tencentMap;
        this.f215427a = markerManager;
        this.f215429c = markerManager.a();
        this.f215428b = markerManager.a();
        this.f215432f = new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer(context, tencentMap, this);
        this.f215430d = new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.PreCachingAlgorithmDecorator(new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm(context));
        this.f215435i = new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.a();
        this.f215432f.onAdd();
    }

    /* loaded from: classes13.dex */
    public class a extends android.os.AsyncTask<java.lang.Float, java.lang.Void, java.util.Set<? extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T>>> {
        public a() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.util.Set<? extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T>> doInBackground(java.lang.Float... fArr) {
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.this.f215431e.readLock().lock();
            try {
                if (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.this.f215437k && fArr != null) {
                    return com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.this.f215430d.getClusters(fArr[0].floatValue());
                }
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.Iterator<T> it = com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.this.f215430d.getItems().iterator();
                while (it.hasNext()) {
                    hashSet.add(new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.b(it.next()));
                }
                return hashSet;
            } finally {
                com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.this.f215431e.readLock().unlock();
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(java.util.Set<? extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<T>> set) {
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.this.f215432f.onClustersChanged(set);
        }
    }
}
