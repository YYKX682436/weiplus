package com.tencent.tencentmap.mapsdk.maps;

/* loaded from: classes13.dex */
public final class CustomLocationProvider {
    public static final java.lang.String NAME = "_CustomAutoLocationProvider";
    private static com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider sGlobalLocationProvider;
    private android.location.Location thisLatestLocation;
    private java.lang.ref.WeakReference<com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.MyLocationSource> thisMyLocationSourceWeakReference;
    private final java.util.Map<java.lang.ref.WeakReference<com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.a>, java.lang.Boolean> thisWeakRefLocationObservers = new java.util.concurrent.ConcurrentHashMap();
    private android.os.Handler thisRequestHandler = new android.os.Handler(android.os.Looper.getMainLooper());

    /* loaded from: classes13.dex */
    public interface MyLocationSource {
        android.location.Location getMyLocation();
    }

    /* loaded from: classes13.dex */
    public interface a {
        void a(android.location.Location location);
    }

    /* loaded from: classes13.dex */
    public static class b implements com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.a, com.tencent.tencentmap.mapsdk.maps.LocationSource {

        /* renamed from: a, reason: collision with root package name */
        com.tencent.tencentmap.mapsdk.maps.LocationSource.OnLocationChangedListener f215338a;

        /* renamed from: b, reason: collision with root package name */
        private final com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider f215339b;

        /* renamed from: c, reason: collision with root package name */
        private final android.os.Handler f215340c = new android.os.Handler(android.os.Looper.getMainLooper());

        public b(com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider customLocationProvider) {
            this.f215339b = customLocationProvider;
        }

        @Override // com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.a
        public final void a(final android.location.Location location) {
            final com.tencent.tencentmap.mapsdk.maps.LocationSource.OnLocationChangedListener onLocationChangedListener;
            if (location == null || (onLocationChangedListener = this.f215338a) == null) {
                return;
            }
            this.f215340c.post(new java.lang.Runnable() { // from class: com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    location.setProvider(location.getProvider() + com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.NAME);
                    onLocationChangedListener.onLocationChanged(location);
                }
            });
        }

        @Override // com.tencent.tencentmap.mapsdk.maps.LocationSource
        public final void activate(com.tencent.tencentmap.mapsdk.maps.LocationSource.OnLocationChangedListener onLocationChangedListener) {
            this.f215338a = onLocationChangedListener;
            this.f215339b.addLocationObserver(this);
        }

        @Override // com.tencent.tencentmap.mapsdk.maps.LocationSource
        public final void deactivate() {
            this.f215339b.removeLocationObserver(this);
            this.f215338a = null;
        }
    }

    private CustomLocationProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLocationObserver(com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.a aVar) {
        if (aVar == null) {
            return;
        }
        this.thisWeakRefLocationObservers.put(new java.lang.ref.WeakReference<>(aVar), java.lang.Boolean.TRUE);
        android.location.Location location = this.thisLatestLocation;
        if (location != null) {
            aVar.a(location);
        }
    }

    public static com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider getInstance() {
        if (sGlobalLocationProvider == null) {
            sGlobalLocationProvider = new com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider();
        }
        return sGlobalLocationProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLocationObserver(com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.a aVar) {
        if (aVar == null) {
            return;
        }
        java.util.Iterator<java.lang.ref.WeakReference<com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.a>> it = this.thisWeakRefLocationObservers.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().get() == aVar) {
                it.remove();
            }
        }
    }

    public final synchronized void clearLocation() {
        this.thisLatestLocation = null;
    }

    public final synchronized android.location.Location getLatestLocation() {
        return this.thisLatestLocation;
    }

    public final com.tencent.tencentmap.mapsdk.maps.LocationSource getLocationSource() {
        return new com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.b(this);
    }

    public final synchronized boolean hasLocation() {
        return this.thisLatestLocation != null;
    }

    public final boolean hasLocationSource() {
        java.lang.ref.WeakReference<com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.MyLocationSource> weakReference = this.thisMyLocationSourceWeakReference;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public final void requestLatestLocation() {
        if (this.thisMyLocationSourceWeakReference != null) {
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50225z, "requestLatestLocation");
            final com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.MyLocationSource myLocationSource = this.thisMyLocationSourceWeakReference.get();
            if (myLocationSource != null) {
                this.thisRequestHandler.post(new java.lang.Runnable() { // from class: com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.this.thisLatestLocation = myLocationSource.getMyLocation();
                        java.util.Iterator it = com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.this.thisWeakRefLocationObservers.keySet().iterator();
                        while (it.hasNext()) {
                            com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.a aVar = (com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.a) ((java.lang.ref.WeakReference) it.next()).get();
                            if (aVar != null) {
                                aVar.a(com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.this.thisLatestLocation);
                            }
                        }
                    }
                });
            }
        }
    }

    public final void setMyLocationSource(com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.MyLocationSource myLocationSource) {
        setMyLocationSource(null, myLocationSource);
    }

    public final void setMyLocationSource(android.os.Handler handler, com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.MyLocationSource myLocationSource) {
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50225z, "setMyLocationSource");
        if (handler != null) {
            this.thisRequestHandler = handler;
        }
        this.thisMyLocationSourceWeakReference = new java.lang.ref.WeakReference<>(myLocationSource);
    }
}
