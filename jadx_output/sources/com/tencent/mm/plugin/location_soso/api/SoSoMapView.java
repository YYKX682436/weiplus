package com.tencent.mm.plugin.location_soso.api;

/* loaded from: classes13.dex */
public class SoSoMapView extends com.tencent.tencentmap.mapsdk.map.MapView implements ab3.h {
    public static final java.lang.String TAG = "MicroMsg.SoSoMapView";
    private boolean firstanim;
    private ab3.f iController;
    private com.tencent.mm.plugin.location_soso.ViewManager mViewManager;
    private java.util.HashMap<java.lang.String, java.lang.Object> tagsView;

    public SoSoMapView(android.content.Context context) {
        super(context);
        this.tagsView = new java.util.HashMap<>();
        this.firstanim = true;
        init();
    }

    private void init() {
        this.mViewManager = new com.tencent.mm.plugin.location_soso.ViewManager(getMap());
        getMap().set3DEnable(true);
        this.iController = new ab3.f() { // from class: com.tencent.mm.plugin.location_soso.api.SoSoMapView.1
            @Override // ab3.f
            public void animateTo(double d17, double d18, int i17) {
                if (com.tencent.mm.plugin.location_soso.api.SoSoMapView.this.firstanim) {
                    com.tencent.mm.plugin.location_soso.api.SoSoMapView.this.getMap().moveCamera(com.tencent.tencentmap.mapsdk.map.CameraUpdateFactory.newLatLngZoom(new com.tencent.mapsdk.raster.model.LatLng(d17, d18), i17));
                } else {
                    com.tencent.mm.plugin.location_soso.api.SoSoMapView.this.getMap().animateCamera(com.tencent.tencentmap.mapsdk.map.CameraUpdateFactory.newLatLngZoom(new com.tencent.mapsdk.raster.model.LatLng(d17, d18), i17));
                }
                com.tencent.mm.plugin.location_soso.api.SoSoMapView.this.firstanim = false;
            }

            public void offsetCenter(double d17, double d18) {
                setCenter((com.tencent.mm.plugin.location_soso.api.SoSoMapView.this.getMapCenterX() / 1000000.0d) + d17, (com.tencent.mm.plugin.location_soso.api.SoSoMapView.this.getMapCenterY() / 1000000.0d) + d18);
            }

            @Override // ab3.f
            public void setCenter(double d17, double d18) {
                com.tencent.mm.plugin.location_soso.api.SoSoMapView.this.getMap().moveCamera(com.tencent.tencentmap.mapsdk.map.CameraUpdateFactory.newLatLng(new com.tencent.mapsdk.raster.model.LatLng(d17, d18)));
            }

            @Override // ab3.f
            public void setZoom(int i17) {
                com.tencent.mm.plugin.location_soso.api.SoSoMapView.this.getMap().moveCamera(com.tencent.tencentmap.mapsdk.map.CameraUpdateFactory.zoomTo(i17));
            }

            @Override // ab3.f
            public void animateTo(double d17, double d18) {
                if (com.tencent.mm.plugin.location_soso.api.SoSoMapView.this.firstanim) {
                    com.tencent.mm.plugin.location_soso.api.SoSoMapView.this.getMap().moveCamera(com.tencent.tencentmap.mapsdk.map.CameraUpdateFactory.newLatLng(new com.tencent.mapsdk.raster.model.LatLng(d17, d18)));
                } else {
                    com.tencent.mm.plugin.location_soso.api.SoSoMapView.this.getMap().animateCamera(com.tencent.tencentmap.mapsdk.map.CameraUpdateFactory.newLatLng(new com.tencent.mapsdk.raster.model.LatLng(d17, d18)));
                }
                com.tencent.mm.plugin.location_soso.api.SoSoMapView.this.firstanim = false;
            }
        };
    }

    private void setEnableForeignMap(boolean z17) {
        try {
            java.lang.reflect.Method declaredMethod = com.tencent.tencentmap.mapsdk.map.MapView.class.getDeclaredMethod("setForeignEnabled", java.lang.Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this, java.lang.Boolean.valueOf(z17));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    public void addAnimTrackView(android.view.View view, double d17, double d18, java.lang.String str) {
        this.tagsView.put(str, view);
        new com.tencent.mapsdk.raster.model.GeoPoint((int) (d17 * 1000000.0d), (int) (d18 * 1000000.0d));
    }

    public void addLocationPin(android.view.View view) {
        addView(view, 0.0d, 0.0d);
    }

    public void addNullView(android.view.View view) {
        addView(view);
    }

    public void addOverlay(java.lang.Object obj) {
    }

    @Override // ab3.h
    public void addPinView(android.view.View view, double d17, double d18) {
        this.mViewManager.addPinView(view, d17, d18);
    }

    public void addView(android.view.View view, double d17, double d18) {
        this.mViewManager.addView(view, d17, d18);
    }

    @Override // ab3.h
    public void animateCamera(com.tencent.tencentmap.mapsdk.map.CameraUpdate cameraUpdate) {
        this.mViewManager.animateCamera(cameraUpdate);
    }

    @Override // ab3.h
    public void clean() {
        this.tagsView.clear();
        this.mViewManager.destroy();
    }

    @Override // ab3.h
    public void destroy() {
        this.mViewManager.destroy();
    }

    public void disableDarkMode() {
        this.mViewManager.disableDarkMode();
    }

    @Override // ab3.h
    public com.tencent.mapsdk.raster.model.Circle drawAccuracyCircle(double d17, double d18, double d19) {
        return this.mViewManager.drawAccuracyCircle(d17, d18, d19);
    }

    public void enableDarkMode() {
        this.mViewManager.enableDarkMode();
    }

    @Override // ab3.h
    public void enableIndoorLevelPick(boolean z17) {
        getUiSettings().setIndoorLevelPickerEnabled(z17);
    }

    @Override // ab3.h
    public java.util.Collection<java.lang.Object> getChilds() {
        return this.tagsView.values();
    }

    public com.tencent.tencentmap.mapsdk.map.MapController getController() {
        return getMapController();
    }

    @Override // ab3.h
    public ab3.f getIController() {
        return this.iController;
    }

    @Override // ab3.h
    public int getMapCenterX() {
        if (getMapCenter() != null) {
            return (int) (getMapCenter().getLatitude() * 1000000.0d);
        }
        return 0;
    }

    @Override // ab3.h
    public int getMapCenterY() {
        if (getMapCenter() != null) {
            return (int) (getMapCenter().getLongitude() * 1000000.0d);
        }
        return 0;
    }

    @Override // ab3.h
    public android.graphics.Point getPointByGeoPoint(double d17, double d18) {
        android.graphics.Point point = new android.graphics.Point();
        getProjection().toPixels(new com.tencent.mapsdk.raster.model.GeoPoint((int) (d17 * 1000000.0d), (int) (d18 * 1000000.0d)), point);
        return point;
    }

    @Override // ab3.h
    public java.util.Set<java.lang.String> getTags() {
        return this.tagsView.keySet();
    }

    @Override // ab3.h
    public java.lang.Object getViewByItag(java.lang.String str) {
        if (this.tagsView.containsKey(str)) {
            return this.tagsView.get(str);
        }
        return null;
    }

    @Override // ab3.h
    public ab3.i getViewManager() {
        return this.mViewManager;
    }

    @Override // ab3.h
    public int getZoom() {
        return getZoomLevel();
    }

    @Override // ab3.h
    public int getZoomLevel() {
        com.tencent.tencentmap.mapsdk.map.TencentMap map = getMap();
        if (map == null) {
            return 16;
        }
        return map.getZoomLevel();
    }

    public float metersToEquatorPixels(double d17) {
        return getProjection().metersToEquatorPixels((float) d17);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager, ab3.h
    public void removeView(android.view.View view) {
        this.mViewManager.removeView(view);
        for (java.lang.String str : this.tagsView.keySet()) {
            if (this.tagsView.get(str).equals(view)) {
                this.tagsView.remove(str);
                return;
            }
        }
    }

    @Override // ab3.h
    public java.lang.Object removeViewByTag(java.lang.String str) {
        java.lang.Object obj = this.tagsView.get(str);
        if (obj instanceof android.view.View) {
            removeView((android.view.View) obj);
        }
        return obj;
    }

    public void requestMapFocus() {
        requestFocus();
    }

    @Override // ab3.h
    public void setBuiltInZoomControls(boolean z17) {
    }

    @Override // ab3.h
    public void setCanRotate(boolean z17) {
        com.tencent.tencentmap.mapsdk.map.UiSettings uiSettings = getUiSettings();
        if (uiSettings != null) {
            uiSettings.setRotateGesturesEnabled(z17);
        }
    }

    @Override // ab3.h
    public void setLogoMargin(int[] iArr) {
        com.tencent.tencentmap.mapsdk.map.UiSettings uiSettings = getUiSettings();
        uiSettings.setScaleViewPositionWithMargin(0, 0, 0, 0, 0);
        uiSettings.setLogoPosition(1, iArr);
    }

    @Override // ab3.h
    public void setMapAnchor(float f17, float f18) {
        getMap().setMapAnchor(f17, f18);
    }

    @Override // ab3.h
    public void setMapViewOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        setOnTouchListener(onTouchListener);
    }

    @Override // ab3.h
    public void setMarkerClickListener(android.view.View view, com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener onMarkerClickListener) {
        this.mViewManager.setMarkerClick(view, onMarkerClickListener);
    }

    public void updateAnimViewLayout(android.view.View view, double d17, double d18) {
        new com.tencent.mapsdk.raster.model.GeoPoint((int) (d17 * 1000000.0d), (int) (d18 * 1000000.0d));
    }

    @Override // ab3.h
    public void updateLocaitonPinLayout(android.view.View view, double d17, double d18) {
        updateLocaitonPinLayout(view, d17, d18, false);
    }

    @Override // ab3.h
    public void updateMarkerView(android.view.View view) {
        this.mViewManager.updateMarkerView(view);
    }

    public void updateViewLayout(android.view.View view, double d17, double d18) {
        this.mViewManager.updateViewLayout(view, d17, d18, false);
    }

    @Override // ab3.h
    public void zoomToSpan(double d17, double d18, double d19, double d27) {
        getIController().setCenter(d17, d18);
        if (d19 == 0.0d || d27 == 0.0d || getController() == null) {
            return;
        }
        getController().zoomToSpan(d19, d27);
    }

    @Override // ab3.h
    public void addView(java.lang.Object obj, double d17, double d18, java.lang.String str) {
        this.tagsView.put(str, obj);
    }

    public void updateLocaitonPinLayout(android.view.View view, double d17, double d18, boolean z17) {
        this.mViewManager.updateLocationPinLayout(view, d17, d18, z17);
    }

    public void updateViewLayout(android.view.View view, double d17, double d18, int i17) {
        new com.tencent.mapsdk.raster.model.GeoPoint((int) (d17 * 1000000.0d), (int) (d18 * 1000000.0d));
    }

    public void addView(android.view.View view, double d17, double d18, int i17) {
        new com.tencent.mapsdk.raster.model.GeoPoint((int) (d17 * 1000000.0d), (int) (1000000.0d * d18));
        if (i17 == -2) {
            addView(view, new com.tencent.tencentmap.mapsdk.map.MapView.LayoutParams(-2, -2, new com.tencent.mapsdk.raster.model.LatLng(d17, d18), 17));
        } else if (i17 == -1) {
            addView(view, new com.tencent.tencentmap.mapsdk.map.MapView.LayoutParams(-1, -1, new com.tencent.mapsdk.raster.model.LatLng(d17, d18), 17));
        } else {
            addView(view, new com.tencent.tencentmap.mapsdk.map.MapView.LayoutParams(i17, i17, new com.tencent.mapsdk.raster.model.LatLng(d17, d18), 17));
        }
    }

    public SoSoMapView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tagsView = new java.util.HashMap<>();
        this.firstanim = true;
        init();
    }

    public SoSoMapView(android.content.Context context, com.tencent.tencentmap.mapsdk.map.TencentMapOptions tencentMapOptions) {
        super(context, tencentMapOptions);
        this.tagsView = new java.util.HashMap<>();
        this.firstanim = true;
        init();
    }
}
