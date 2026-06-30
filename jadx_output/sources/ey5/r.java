package ey5;

/* loaded from: classes13.dex */
public class r implements com.tencent.tencentmap.mapsdk.map.TencentMap, com.tencent.tencentmap.mapsdk.maps.TencentMap.InfoWindowAdapter, com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerDragListener, com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback, com.tencent.tencentmap.mapsdk.maps.TencentMap.OnInfoWindowClickListener, com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerClickListener, com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener, com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapClickListener, com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLongClickListener {
    public java.util.List A;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.maps.TencentMap f257662d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f257663e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f257664f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f257665g = false;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener f257666h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter f257667i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f257668m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerDraggedListener f257669n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f257670o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLoadedListener f257671p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f257672q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener f257673r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f257674s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener f257675t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.List f257676u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener f257677v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.List f257678w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapClickListener f257679x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.List f257680y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLongClickListener f257681z;

    public r(com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap) {
        this.f257662d = tencentMap;
        tencentMap.setInfoWindowAdapter(this);
        tencentMap.setOnMarkerDragListener(this);
        tencentMap.setOnMapLoadedCallback(this);
        tencentMap.setOnInfoWindowClickListener(this);
        tencentMap.setOnMarkerClickListener(this);
        tencentMap.setOnCameraChangeListener(this);
        tencentMap.setOnMapClickListener(this);
        tencentMap.setOnMapLongClickListener(this);
    }

    public final ey5.e a(com.tencent.tencentmap.mapsdk.maps.model.Marker marker) {
        if (marker == null) {
            return null;
        }
        return (ey5.e) this.f257663e.get(java.lang.Integer.valueOf(marker.getId().hashCode()));
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.Arc addArc(com.tencent.tencentmap.mapsdk.maps.model.ArcOptions arcOptions) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null || arcOptions == null) {
            return null;
        }
        return tencentMap.addArc(arcOptions);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public com.tencent.mapsdk.raster.model.Circle addCircle(com.tencent.mapsdk.raster.model.CircleOptions circleOptions) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null || circleOptions == null) {
            return null;
        }
        com.tencent.tencentmap.mapsdk.maps.model.CircleOptions circleOptions2 = new com.tencent.tencentmap.mapsdk.maps.model.CircleOptions();
        com.tencent.tencentmap.mapsdk.maps.model.LatLng f17 = ey5.x.f(circleOptions.getCenter());
        if (f17 != null) {
            circleOptions2.center(f17);
        }
        circleOptions2.center(ey5.x.f(circleOptions.getCenter())).fillColor(circleOptions.getFillColor()).radius(circleOptions.getRadius()).strokeColor(circleOptions.getStrokeColor()).strokeWidth(circleOptions.getStrokeWidth()).visible(circleOptions.isVisible()).zIndex((int) circleOptions.getZIndex()).level(circleOptions.getLevel());
        return new ey5.b(tencentMap.addCircle(circleOptions2));
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public com.tencent.mapsdk.raster.model.CustomLayer addCustomLayer(com.tencent.mapsdk.raster.model.CustomLayerOptions customLayerOptions) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return null;
        }
        return new ey5.c(tencentMap.addCustomLayer(customLayerOptions != null ? new com.tencent.tencentmap.mapsdk.maps.model.CustomLayerOptions().layerId(customLayerOptions.getLayerId()) : null));
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay addGroundOverlay(com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions groundOverlayOptions) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null || groundOverlayOptions == null) {
            return null;
        }
        return tencentMap.addGroundOverlay(groundOverlayOptions);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void addInfoWindowAdapter(com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter infoWindowAdapter) {
        if (infoWindowAdapter == null) {
            return;
        }
        if (this.f257668m == null) {
            this.f257668m = new java.util.LinkedList();
        }
        this.f257668m.add(infoWindowAdapter);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public com.tencent.mapsdk.raster.model.Marker addMarker(com.tencent.mapsdk.raster.model.MarkerOptions markerOptions) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null || markerOptions == null) {
            return null;
        }
        ey5.e eVar = new ey5.e(this, tencentMap.addMarker(ey5.x.h(markerOptions)));
        this.f257663e.put(java.lang.Integer.valueOf(eVar.getId().hashCode()), eVar);
        return eVar;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void addOnInfoWindowClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        if (onInfoWindowClickListener == null) {
            return;
        }
        if (this.f257674s == null) {
            this.f257674s = new java.util.LinkedList();
        }
        this.f257674s.add(onInfoWindowClickListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void addOnMapCameraChangeListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener onMapCameraChangeListener) {
        if (onMapCameraChangeListener == null) {
            return;
        }
        if (this.f257678w == null) {
            this.f257678w = new java.util.LinkedList();
        }
        this.f257678w.add(onMapCameraChangeListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void addOnMapClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapClickListener onMapClickListener) {
        if (onMapClickListener == null) {
            return;
        }
        if (this.f257680y == null) {
            this.f257680y = new java.util.LinkedList();
        }
        this.f257680y.add(onMapClickListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void addOnMapLoadedListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLoadedListener onMapLoadedListener) {
        if (onMapLoadedListener == null) {
            return;
        }
        if (this.f257672q == null) {
            this.f257672q = new java.util.LinkedList();
        }
        this.f257672q.add(onMapLoadedListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void addOnMapLongClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLongClickListener onMapLongClickListener) {
        if (onMapLongClickListener == null) {
            return;
        }
        if (this.A == null) {
            this.A = new java.util.LinkedList();
        }
        this.A.add(onMapLongClickListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void addOnMarkerClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener onMarkerClickListener) {
        if (onMarkerClickListener == null) {
            return;
        }
        if (this.f257676u == null) {
            this.f257676u = new java.util.LinkedList();
        }
        this.f257676u.add(onMarkerClickListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void addOnMarkerDraggedListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerDraggedListener onMarkerDraggedListener) {
        if (onMarkerDraggedListener == null) {
            return;
        }
        if (this.f257670o == null) {
            this.f257670o = new java.util.LinkedList();
        }
        this.f257670o.add(onMarkerDraggedListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public com.tencent.mapsdk.raster.model.Polygon addPolygon(com.tencent.mapsdk.raster.model.PolygonOptions polygonOptions) {
        com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions polygonOptions2 = null;
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null || polygonOptions == null) {
            return null;
        }
        com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions polygonOptions3 = new com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions();
        java.util.List g17 = ey5.x.g(polygonOptions.getPoints());
        if (g17 != null && ((java.util.ArrayList) g17).size() > 2) {
            polygonOptions3.addAll(g17);
            polygonOptions3.visible(polygonOptions.isVisible()).zIndex((int) polygonOptions.getZIndex()).level(polygonOptions.getLevel()).strokeWidth(polygonOptions.getStrokeWidth()).strokeColor(polygonOptions.getStrokeColor()).fillColor(polygonOptions.getFillColor());
            if (polygonOptions.getPattern() != null) {
                polygonOptions3.pattern(polygonOptions.getPattern());
            }
            polygonOptions2 = polygonOptions3;
        }
        return new ey5.g(tencentMap.addPolygon(polygonOptions2));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x021e A[LOOP:0: B:36:0x0218->B:38:0x021e, LOOP_END] */
    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mapsdk.raster.model.Polyline addPolyline(com.tencent.mapsdk.raster.model.PolylineOptions r20) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ey5.r.addPolyline(com.tencent.mapsdk.raster.model.PolylineOptions):com.tencent.mapsdk.raster.model.Polyline");
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public com.tencent.mapsdk.raster.model.TileOverlay addTileOverlay(com.tencent.mapsdk.raster.model.TileOverlayOptions tileOverlayOptions) {
        com.tencent.tencentmap.mapsdk.maps.model.TileProvider tileProvider = null;
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null || tileOverlayOptions == null) {
            return null;
        }
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions2 = new com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions();
        com.tencent.mapsdk.raster.model.TileProvider tileProvider2 = tileOverlayOptions.getTileProvider();
        if (tileProvider2 != null) {
            if (tileProvider2 instanceof com.tencent.mapsdk.raster.model.UrlTileProvider) {
                com.tencent.mapsdk.raster.model.UrlTileProvider urlTileProvider = (com.tencent.mapsdk.raster.model.UrlTileProvider) tileProvider2;
                tileProvider = new ey5.u(urlTileProvider.mWidth, urlTileProvider.mHeight, tileProvider2);
            } else {
                tileProvider = new ey5.v(tileProvider2);
            }
        }
        return new ey5.t(tencentMap.addTileOverlay(tileOverlayOptions2.tileProvider(tileProvider).diskCacheDir(tileOverlayOptions.getDiskCacheDir()).versionInfo(tileOverlayOptions.getVersionInfo()).zIndex(tileOverlayOptions.getZIndex()).betterQuality(tileOverlayOptions.isBetterQuality())));
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public com.tencent.map.sdk.comps.vis.VisualLayer addVisualLayer(com.tencent.map.sdk.comps.vis.VisualLayerOptions visualLayerOptions) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null || visualLayerOptions == null) {
            return null;
        }
        return tencentMap.addVisualLayer(visualLayerOptions);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void animateCamera(com.tencent.tencentmap.mapsdk.map.CameraUpdate cameraUpdate) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null || cameraUpdate == null) {
            return;
        }
        tencentMap.animateCamera(ey5.x.e(cameraUpdate, tencentMap));
    }

    @Override // com.tencent.tencentmap.mapsdk.map.MapController
    public void animateTo(com.tencent.mapsdk.raster.model.LatLng latLng) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null || latLng == null) {
            return;
        }
        tencentMap.animateCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.newLatLng(ey5.x.f(latLng)));
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void clearAllOverlays() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap != null) {
            tencentMap.clear();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public boolean clearCache() {
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void enableAutoMaxOverlooking(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.enableAutoMaxSkew(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void enableMultipleInfowindow(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.enableMultipleInfowindow(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public java.lang.String executeMapVisualLayerCommand(com.tencent.map.sdk.comps.vis.VisualLayer visualLayer, java.lang.String str) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        return tencentMap == null ? "" : tencentMap.executeVisualLayerCommand(visualLayer, str);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public java.lang.String getActivedIndoorBuilding(com.tencent.mapsdk.raster.model.LatLng latLng) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return null;
        }
        return tencentMap.getActivedIndoorBuilding(ey5.x.f(latLng));
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public java.lang.String[] getActivedIndoorFloorNames() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return null;
        }
        return tencentMap.getActivedIndoorFloorNames();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public com.tencent.mapsdk.raster.model.CameraPosition getCameraPosition() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return null;
        }
        return ey5.x.c(tencentMap.getCameraPosition());
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public java.lang.String getDebugError() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return null;
        }
        return tencentMap.getDebugError();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public int getIndoorFloorId() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return 0;
        }
        return tencentMap.getIndoorFloorId();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.InfoWindowAdapter
    public android.view.View getInfoContents(com.tencent.tencentmap.mapsdk.maps.model.Marker marker) {
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.InfoWindowAdapter
    public android.view.View getInfoWindow(com.tencent.tencentmap.mapsdk.maps.model.Marker marker) {
        ey5.e a17 = a(marker);
        java.util.List list = this.f257668m;
        android.view.View view = null;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext() && (view = ((com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter) it.next()).getInfoWindow(a17)) == null) {
            }
        }
        return view;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public com.tencent.mapsdk.raster.model.LatLng getMapCenter() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return null;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = tencentMap.getCameraPosition().target;
        return ey5.x.a(tencentMap.getCameraPosition().target);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public int getMapType() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return 1000;
        }
        return tencentMap.getMapType();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public int getMaxZoomLevel() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return 19;
        }
        return (int) tencentMap.getMaxZoomLevel();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public int getMinZoomLevel() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return 4;
        }
        return (int) tencentMap.getMinZoomLevel();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public com.tencent.tencentmap.mapsdk.map.Projection getProjection() {
        return new ey5.h(this.f257662d);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void getScreenShot(com.tencent.tencentmap.mapsdk.map.TencentMap.OnScreenShotListener onScreenShotListener) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.snapshot(new ey5.p(this, onScreenShotListener));
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public java.lang.String getVersion() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return null;
        }
        return tencentMap.getVersion();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public int getZoomLevel() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null || tencentMap.getCameraPosition() == null) {
            return -1;
        }
        return (int) tencentMap.getCameraPosition().zoom;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public boolean isAppKeyAvailable() {
        return true;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public boolean isHandDrawMapEnable() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return false;
        }
        return tencentMap.isHandDrawMapEnable();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public boolean isSatelliteEnabled() {
        return this.f257665g;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public boolean isTrafficEnabled() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return false;
        }
        return tencentMap.isTrafficEnabled();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void moveCamera(com.tencent.tencentmap.mapsdk.map.CameraUpdate cameraUpdate) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null || cameraUpdate == null) {
            return;
        }
        tencentMap.moveCamera(ey5.x.e(cameraUpdate, tencentMap));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener
    public void onCameraChange(com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition) {
        com.tencent.mapsdk.raster.model.CameraPosition c17 = ey5.x.c(cameraPosition);
        java.util.List list = this.f257678w;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener) it.next()).onCameraChange(c17);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener
    public void onCameraChangeFinished(com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition) {
        com.tencent.mapsdk.raster.model.CameraPosition c17 = ey5.x.c(cameraPosition);
        java.util.List list = this.f257678w;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener) it.next()).onCameraChangeFinish(c17);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnInfoWindowClickListener
    public void onInfoWindowClick(com.tencent.tencentmap.mapsdk.maps.model.Marker marker) {
        ey5.e a17 = a(marker);
        java.util.List list = this.f257674s;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener) it.next()).onInfoWindowClick(a17);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnInfoWindowClickListener
    public void onInfoWindowClickLocation(int i17, int i18, int i19, int i27) {
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapClickListener
    public void onMapClick(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        com.tencent.mapsdk.raster.model.LatLng a17 = ey5.x.a(latLng);
        java.util.List list = this.f257680y;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapClickListener) it.next()).onMapClick(a17);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback
    public void onMapLoaded() {
        java.util.List list = this.f257672q;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLoadedListener) it.next()).onMapLoaded();
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLongClickListener
    public void onMapLongClick(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        com.tencent.mapsdk.raster.model.LatLng a17 = ey5.x.a(latLng);
        java.util.List list = this.A;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLongClickListener) it.next()).onMapLongClick(a17);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerClickListener
    public boolean onMarkerClick(com.tencent.tencentmap.mapsdk.maps.model.Marker marker) {
        ey5.e a17 = a(marker);
        java.util.List list = this.f257676u;
        boolean z17 = false;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext() && !(z17 = ((com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener) it.next()).onMarkerClick(a17))) {
            }
        }
        return z17;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerDragListener
    public void onMarkerDrag(com.tencent.tencentmap.mapsdk.maps.model.Marker marker) {
        ey5.e a17 = a(marker);
        java.util.List list = this.f257670o;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerDraggedListener) it.next()).onMarkerDrag(a17);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerDragListener
    public void onMarkerDragEnd(com.tencent.tencentmap.mapsdk.maps.model.Marker marker) {
        ey5.e a17 = a(marker);
        java.util.List list = this.f257670o;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerDraggedListener) it.next()).onMarkerDragEnd(a17);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerDragListener
    public void onMarkerDragStart(com.tencent.tencentmap.mapsdk.maps.model.Marker marker) {
        ey5.e a17 = a(marker);
        java.util.List list = this.f257670o;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerDraggedListener) it.next()).onMarkerDragStart(a17);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void remmoveOnInfoWindowClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        java.util.List list;
        if (onInfoWindowClickListener == null || (list = this.f257674s) == null) {
            return;
        }
        ((java.util.LinkedList) list).remove(onInfoWindowClickListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void removeInfoWindowAdapter(com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter infoWindowAdapter) {
        java.util.List list;
        if (infoWindowAdapter == null || (list = this.f257668m) == null) {
            return;
        }
        ((java.util.LinkedList) list).remove(infoWindowAdapter);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void removeOnMapCameraChangeListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener onMapCameraChangeListener) {
        java.util.List list;
        if (onMapCameraChangeListener == null || (list = this.f257678w) == null) {
            return;
        }
        ((java.util.LinkedList) list).remove(onMapCameraChangeListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void removeOnMapClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapClickListener onMapClickListener) {
        java.util.List list;
        if (onMapClickListener == null || (list = this.f257680y) == null) {
            return;
        }
        ((java.util.LinkedList) list).remove(onMapClickListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void removeOnMapLoadedListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLoadedListener onMapLoadedListener) {
        java.util.List list;
        if (onMapLoadedListener == null || (list = this.f257672q) == null) {
            return;
        }
        ((java.util.LinkedList) list).remove(onMapLoadedListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void removeOnMapLongClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLongClickListener onMapLongClickListener) {
        java.util.List list;
        if (onMapLongClickListener == null || (list = this.A) == null) {
            return;
        }
        ((java.util.LinkedList) list).remove(onMapLongClickListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void removeOnMarkerClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener onMarkerClickListener) {
        java.util.List list;
        if (onMarkerClickListener == null || (list = this.f257676u) == null) {
            return;
        }
        ((java.util.LinkedList) list).remove(onMarkerClickListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void removeOnMarkerDraggedListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerDraggedListener onMarkerDraggedListener) {
        java.util.List list;
        if (onMarkerDraggedListener == null || (list = this.f257670o) == null) {
            return;
        }
        ((java.util.LinkedList) list).remove(onMarkerDraggedListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void removeTencentMapGestureListener(com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener tencentMapGestureListener) {
        this.f257662d.removeTencentMapGestureListener(this.f257666h);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void scrollBy(float f17, float f18) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.animateCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.scrollBy(f17, f18));
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void set3DEnable(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.setBuildingEnable(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setBuilding3dEffectEnable(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.setBuilding3dEffectEnable(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.MapController
    public void setCenter(com.tencent.mapsdk.raster.model.LatLng latLng) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null || latLng == null) {
            return;
        }
        tencentMap.moveCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.newLatLng(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(latLng.getLatitude(), latLng.getLongitude())));
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setErrorListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnErrorListener onErrorListener) {
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setForeignLanguage(com.tencent.mapsdk.raster.model.Language language) {
        com.tencent.tencentmap.mapsdk.maps.model.Language language2;
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        if (language == null) {
            language2 = com.tencent.tencentmap.mapsdk.maps.model.Language.zh;
        } else {
            int i17 = ey5.w.f257688a[language.ordinal()];
            language2 = i17 != 1 ? i17 != 2 ? com.tencent.tencentmap.mapsdk.maps.model.Language.zh : com.tencent.tencentmap.mapsdk.maps.model.Language.en : com.tencent.tencentmap.mapsdk.maps.model.Language.zh;
        }
        tencentMap.setForeignLanguage(language2);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setHandDrawMapEnable(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.setHandDrawMapEnable(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setIndoorEnabled(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.setIndoorEnabled(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setIndoorFloor(int i17) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.setIndoorFloor(i17);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setIndoorMaskColor(int i17) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.setIndoorMaskColor(i17);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setInfoWindowAdapter(com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter infoWindowAdapter) {
        com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter infoWindowAdapter2;
        if (infoWindowAdapter == null && (infoWindowAdapter2 = this.f257667i) != null) {
            removeInfoWindowAdapter(infoWindowAdapter2);
        }
        this.f257667i = infoWindowAdapter;
        addInfoWindowAdapter(infoWindowAdapter);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setMapAnchor(float f17, float f18) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.setCameraCenterProportion(f17, f18, false);
        tencentMap.getUiSettings().setGestureScaleByMapCenter(true);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setMapBoundary(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null || latLngBounds == null) {
            return;
        }
        tencentMap.setRestrictBounds(latLngBounds, com.tencent.tencentmap.mapsdk.maps.model.RestrictBoundsFitMode.FIT_WIDTH);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setMapStyle(int i17) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.setMapStyle(i17);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setMapType(int i17) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.setMapType(i17);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setMaxZoomLevel(int i17) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.setMaxZoomLevel(i17);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setMinZoomLevel(int i17) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.setMinZoomLevel(i17);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setOnIndoorStateChangeListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.setOnIndoorStateChangeListener(new ey5.n(this, onIndoorStateChangeListener));
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setOnInfoWindowClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener onInfoWindowClickListener2;
        if (onInfoWindowClickListener == null && (onInfoWindowClickListener2 = this.f257673r) != null) {
            remmoveOnInfoWindowClickListener(onInfoWindowClickListener2);
        }
        this.f257673r = onInfoWindowClickListener;
        addOnInfoWindowClickListener(onInfoWindowClickListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setOnMapCameraChangeListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener onMapCameraChangeListener) {
        com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener onMapCameraChangeListener2;
        if (onMapCameraChangeListener == null && (onMapCameraChangeListener2 = this.f257677v) != null) {
            removeOnMapCameraChangeListener(onMapCameraChangeListener2);
        }
        this.f257677v = onMapCameraChangeListener;
        addOnMapCameraChangeListener(onMapCameraChangeListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setOnMapClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapClickListener onMapClickListener) {
        com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapClickListener onMapClickListener2;
        if (onMapClickListener == null && (onMapClickListener2 = this.f257679x) != null) {
            removeOnMapClickListener(onMapClickListener2);
        }
        this.f257679x = onMapClickListener;
        addOnMapClickListener(onMapClickListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setOnMapLoadedListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLoadedListener onMapLoadedListener) {
        com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLoadedListener onMapLoadedListener2;
        if (onMapLoadedListener == null && (onMapLoadedListener2 = this.f257671p) != null) {
            removeOnMapLoadedListener(onMapLoadedListener2);
        }
        this.f257671p = onMapLoadedListener;
        addOnMapLoadedListener(onMapLoadedListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setOnMapLongClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLongClickListener onMapLongClickListener) {
        com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLongClickListener onMapLongClickListener2;
        if (onMapLongClickListener == null && (onMapLongClickListener2 = this.f257681z) != null) {
            removeOnMapLongClickListener(onMapLongClickListener2);
        }
        this.f257681z = onMapLongClickListener;
        addOnMapLongClickListener(onMapLongClickListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setOnMapPoiClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapPoiClickListener onMapPoiClickListener) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.setOnMapPoiClickListener(new ey5.m(this, onMapPoiClickListener));
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setOnMarkerClickListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener onMarkerClickListener) {
        com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener onMarkerClickListener2;
        if (onMarkerClickListener == null && (onMarkerClickListener2 = this.f257675t) != null) {
            removeOnMarkerClickListener(onMarkerClickListener2);
        }
        this.f257675t = onMarkerClickListener;
        addOnMarkerClickListener(onMarkerClickListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setOnMarkerCollisionStatusListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerCollisionStatusListener onMarkerCollisionStatusListener) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.setOnMarkerCollisionStatusListener(onMarkerCollisionStatusListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setOnMarkerDraggedListener(com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerDraggedListener onMarkerDraggedListener) {
        com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerDraggedListener onMarkerDraggedListener2;
        if (onMarkerDraggedListener == null && (onMarkerDraggedListener2 = this.f257669n) != null) {
            removeOnMarkerDraggedListener(onMarkerDraggedListener2);
        }
        this.f257669n = onMarkerDraggedListener;
        addOnMarkerDraggedListener(onMarkerDraggedListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setOnPolylineClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolylineClickListener onPolylineClickListener) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.setOnPolylineClickListener(onPolylineClickListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setOnScaleViewChangedListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnScaleViewChangedListener onScaleViewChangedListener) {
        this.f257662d.setOnScaleViewChangedListener(onScaleViewChangedListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setPoisEnabled(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.setPoisEnabled(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setSatelliteEnabled(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        this.f257665g = z17;
        tencentMap.setSatelliteEnabled(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setTencentMapGestureListener(com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener tencentMapGestureListener) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null || tencentMapGestureListener == null) {
            return;
        }
        com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener tencentMapGestureListener2 = this.f257666h;
        if (tencentMapGestureListener2 != null) {
            tencentMap.removeTencentMapGestureListener(tencentMapGestureListener2);
        }
        ey5.o oVar = new ey5.o(this, tencentMapGestureListener);
        this.f257666h = oVar;
        tencentMap.setTencentMapGestureListener(oVar);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setTrafficEnabled(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.setTrafficEnabled(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.MapController
    public void setZoom(int i17) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.moveCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.zoomTo(i17));
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void showBuilding(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.showBuilding(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void stopAnimation() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.stopAnimation();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void zoomIn() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.animateCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.zoomIn());
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void zoomInFixing(int i17, int i18) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.moveCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.zoomBy(1.0f, new android.graphics.Point(i17, i18)));
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void zoomOut() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.animateCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.zoomOut());
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void zoomOutFixing(int i17, int i18) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.moveCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.zoomBy(-1.0f, new android.graphics.Point(i17, i18)));
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap, com.tencent.tencentmap.mapsdk.map.MapController
    public void zoomToSpan(com.tencent.mapsdk.raster.model.LatLng latLng, com.tencent.mapsdk.raster.model.LatLng latLng2) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.moveCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.newLatLngBounds(new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds(ey5.x.f(latLng), ey5.x.f(latLng2)), 0));
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void animateCamera(com.tencent.tencentmap.mapsdk.map.CameraUpdate cameraUpdate, long j17, com.tencent.tencentmap.mapsdk.map.CancelableCallback cancelableCallback) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null || cameraUpdate == null) {
            return;
        }
        tencentMap.animateCamera(ey5.x.e(cameraUpdate, tencentMap), j17, new ey5.k(this, cancelableCallback));
    }

    @Override // com.tencent.tencentmap.mapsdk.map.MapController
    public void animateTo(com.tencent.mapsdk.raster.model.LatLng latLng, java.lang.Runnable runnable) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null || latLng == null) {
            return;
        }
        tencentMap.animateCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.newLatLng(ey5.x.f(latLng)), new ey5.i(this, runnable));
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void getScreenShot(com.tencent.tencentmap.mapsdk.map.TencentMap.OnScreenShotListener onScreenShotListener, android.graphics.Rect rect) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.snapshot(new ey5.q(this, onScreenShotListener));
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void scrollBy(float f17, float f18, long j17, com.tencent.tencentmap.mapsdk.map.CancelableCallback cancelableCallback) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.animateCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.scrollBy(f17, f18), new ey5.l(this, cancelableCallback));
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap
    public void setIndoorFloor(java.lang.String str, java.lang.String str2) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.setIndoorFloor(str, str2);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.MapController
    public void animateTo(com.tencent.mapsdk.raster.model.LatLng latLng, long j17, com.tencent.tencentmap.mapsdk.map.CancelableCallback cancelableCallback) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f257662d;
        if (tencentMap == null) {
            return;
        }
        tencentMap.animateCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.newLatLng(ey5.x.f(latLng)), j17, new ey5.j(this, cancelableCallback));
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap, com.tencent.tencentmap.mapsdk.map.MapController
    public void zoomToSpan(double d17, double d18) {
        double d19 = d17 / 2.0d;
        double d27 = d18 / 2.0d;
        zoomToSpan(new com.tencent.mapsdk.raster.model.LatLng(getMapCenter().getLatitude() - d19, getMapCenter().getLongitude() + d27), new com.tencent.mapsdk.raster.model.LatLng(getMapCenter().getLatitude() + d19, getMapCenter().getLongitude() - d27));
    }
}
