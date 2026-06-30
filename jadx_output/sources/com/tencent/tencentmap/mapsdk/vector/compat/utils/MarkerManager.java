package com.tencent.tencentmap.mapsdk.vector.compat.utils;

/* loaded from: classes13.dex */
public class MarkerManager implements com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener, com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener, com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.map.TencentMap f215373a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map<java.lang.String, com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager.Collection> f215374b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map<com.tencent.mapsdk.raster.model.Marker, com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager.Collection> f215375c = new java.util.HashMap();

    /* loaded from: classes13.dex */
    public class Collection {

        /* renamed from: a, reason: collision with root package name */
        public final java.util.Set<com.tencent.mapsdk.raster.model.Marker> f215376a = new java.util.HashSet();

        /* renamed from: b, reason: collision with root package name */
        public com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener f215377b;

        /* renamed from: c, reason: collision with root package name */
        public com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener f215378c;

        /* renamed from: d, reason: collision with root package name */
        public com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter f215379d;

        public Collection() {
        }

        public java.util.Collection<com.tencent.mapsdk.raster.model.Marker> getMarkers() {
            return java.util.Collections.unmodifiableCollection(this.f215376a);
        }

        public com.tencent.mapsdk.raster.model.Marker a(com.tencent.mapsdk.raster.model.MarkerOptions markerOptions) {
            com.tencent.mapsdk.raster.model.Marker addMarker = com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager.this.f215373a.addMarker(markerOptions);
            this.f215376a.add(addMarker);
            com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager.this.f215375c.put(addMarker, this);
            return addMarker;
        }

        public boolean a(com.tencent.mapsdk.raster.model.Marker marker) {
            if (!this.f215376a.remove(marker)) {
                return false;
            }
            com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager.this.f215375c.remove(marker);
            marker.remove();
            return true;
        }

        public void a() {
            for (com.tencent.mapsdk.raster.model.Marker marker : this.f215376a) {
                marker.remove();
                com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager.this.f215375c.remove(marker);
            }
            this.f215376a.clear();
        }

        public void a(com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener onInfoWindowClickListener) {
            this.f215377b = onInfoWindowClickListener;
        }

        public void a(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener onMarkerClickListener) {
            this.f215378c = onMarkerClickListener;
        }

        public void a(com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter infoWindowAdapter) {
            this.f215379d = infoWindowAdapter;
        }
    }

    public MarkerManager(com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap) {
        this.f215373a = tencentMap;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter
    public android.view.View getInfoWindow(com.tencent.mapsdk.raster.model.Marker marker) {
        com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager.Collection collection = this.f215375c.get(marker);
        if (collection == null || collection.f215379d == null) {
            return null;
        }
        return collection.f215379d.getInfoWindow(marker);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener
    public void onInfoWindowClick(com.tencent.mapsdk.raster.model.Marker marker) {
        com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager.Collection collection = this.f215375c.get(marker);
        if (collection == null || collection.f215377b == null) {
            return;
        }
        collection.f215377b.onInfoWindowClick(marker);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter
    public void onInfoWindowDettached(com.tencent.mapsdk.raster.model.Marker marker, android.view.View view) {
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener
    public boolean onMarkerClick(com.tencent.mapsdk.raster.model.Marker marker) {
        com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager.Collection collection = this.f215375c.get(marker);
        if (collection == null || collection.f215378c == null) {
            return false;
        }
        return collection.f215378c.onMarkerClick(marker);
    }

    public com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager.Collection a() {
        return new com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager.Collection();
    }

    public boolean a(com.tencent.mapsdk.raster.model.Marker marker) {
        com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager.Collection collection = this.f215375c.get(marker);
        return collection != null && collection.a(marker);
    }
}
