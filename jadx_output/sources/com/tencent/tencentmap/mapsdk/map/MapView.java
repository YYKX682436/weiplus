package com.tencent.tencentmap.mapsdk.map;

/* loaded from: classes13.dex */
public class MapView extends android.widget.FrameLayout implements com.tencent.tencentmap.mapsdk.map.IMapView {
    private com.tencent.mapsdk.rastercore.MapProvider mMapProvider;
    private int mMapType;
    private com.tencent.tencentmap.mapsdk.map.Projection mProjection;
    private com.tencent.tencentmap.mapsdk.map.UiSettings mUiSettings;
    private com.tencent.tencentmap.mapsdk.map.IMapView mapView;

    /* loaded from: classes13.dex */
    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {
        public static final int BOTTOM_CENTER = 81;
        public static final int CENTER = 17;
        public int alignment;
        public int height;
        public com.tencent.mapsdk.raster.model.LatLng point;
        public int width;

        public LayoutParams(int i17, int i18, com.tencent.mapsdk.raster.model.LatLng latLng, int i19) {
            super(i17, i18);
            this.width = i17;
            this.height = i18;
            this.point = latLng;
            this.alignment = i19;
        }
    }

    public MapView(android.content.Context context) {
        this(context, (com.tencent.tencentmap.mapsdk.map.TencentMapOptions) null);
    }

    private void init(com.tencent.tencentmap.mapsdk.map.TencentMapOptions tencentMapOptions) {
        android.content.Context context = getContext();
        this.mMapProvider = new com.tencent.mapsdk.rastercore.MapProvider();
        com.tencent.mapsdk.rastercore.core.MapContext.setContext(context.getApplicationContext());
        com.tencent.tencentmap.mapsdk.map.IMapView mapView = this.mMapProvider.getMapView(context.getApplicationContext(), tencentMapOptions);
        this.mapView = mapView;
        if (mapView != null) {
            addView(this.mapView.getMapView(), new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        if (context instanceof com.tencent.tencentmap.mapsdk.map.MapActivity) {
            ((com.tencent.tencentmap.mapsdk.map.MapActivity) context).setMapView(this);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void addView(android.view.View view, com.tencent.tencentmap.mapsdk.map.MapView.LayoutParams layoutParams) {
        com.tencent.tencentmap.mapsdk.map.IMapView iMapView = this.mapView;
        if (iMapView == null || layoutParams == null) {
            return;
        }
        iMapView.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View, com.tencent.tencentmap.mapsdk.map.IMapView
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        this.mapView.dispatchTouchEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public com.tencent.tencentmap.mapsdk.map.TencentMap getMap() {
        com.tencent.tencentmap.mapsdk.map.IMapView iMapView = this.mapView;
        if (iMapView == null) {
            return null;
        }
        return iMapView.getMap();
    }

    @java.lang.Deprecated
    public com.tencent.mapsdk.raster.model.LatLng getMapCenter() {
        com.tencent.tencentmap.mapsdk.map.IMapView iMapView = this.mapView;
        if (iMapView == null || iMapView.getMap() == null) {
            return null;
        }
        return this.mapView.getMap().getMapCenter();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public com.tencent.tencentmap.mapsdk.map.MapController getMapController() {
        com.tencent.tencentmap.mapsdk.map.IMapView iMapView = this.mapView;
        if (iMapView == null) {
            return null;
        }
        return iMapView.getMapController();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public android.view.View getMapView() {
        return this;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public com.tencent.tencentmap.mapsdk.map.Projection getProjection() {
        com.tencent.tencentmap.mapsdk.map.IMapView iMapView = this.mapView;
        if (iMapView == null) {
            return null;
        }
        return iMapView.getMap().getProjection();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public com.tencent.tencentmap.mapsdk.map.UiSettings getUiSettings() {
        com.tencent.tencentmap.mapsdk.map.IMapView iMapView = this.mapView;
        if (iMapView == null) {
            return null;
        }
        return iMapView.getUiSettings();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.tencentmap.mapsdk.map.IMapView iMapView = this.mapView;
        if (iMapView == null) {
            return;
        }
        iMapView.onCreate(bundle);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onDestroy() {
        com.tencent.tencentmap.mapsdk.map.IMapView iMapView = this.mapView;
        if (iMapView == null) {
            return;
        }
        iMapView.onDestroy();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onDestroyView() {
        com.tencent.tencentmap.mapsdk.map.IMapView iMapView = this.mapView;
        if (iMapView == null) {
            return;
        }
        iMapView.onDestroyView();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onLowMemory() {
        com.tencent.tencentmap.mapsdk.map.IMapView iMapView = this.mapView;
        if (iMapView == null) {
            return;
        }
        iMapView.onLowMemory();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onPause() {
        com.tencent.tencentmap.mapsdk.map.IMapView iMapView = this.mapView;
        if (iMapView == null) {
            return;
        }
        iMapView.onPause();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onRestart() {
        com.tencent.tencentmap.mapsdk.map.IMapView iMapView = this.mapView;
        if (iMapView == null) {
            return;
        }
        iMapView.onRestart();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onResume() {
        com.tencent.tencentmap.mapsdk.map.IMapView iMapView = this.mapView;
        if (iMapView == null) {
            return;
        }
        iMapView.onResume();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onSaveInstanceState(android.os.Bundle bundle) {
        com.tencent.tencentmap.mapsdk.map.IMapView iMapView = this.mapView;
        if (iMapView == null) {
            return;
        }
        iMapView.onSaveInstanceState(bundle);
    }

    @Override // android.view.View, com.tencent.tencentmap.mapsdk.map.IMapView
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        com.tencent.tencentmap.mapsdk.map.IMapView iMapView = this.mapView;
        if (iMapView != null) {
            iMapView.onSizeChanged(i17, i18, i19, i27);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onStart() {
        com.tencent.tencentmap.mapsdk.map.IMapView iMapView = this.mapView;
        if (iMapView == null) {
            return;
        }
        iMapView.onStart();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onStop() {
        com.tencent.tencentmap.mapsdk.map.IMapView iMapView = this.mapView;
        if (iMapView == null) {
            return;
        }
        iMapView.onStop();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onSurfaceChanged(java.lang.Object obj, int i17, int i18) {
        com.tencent.tencentmap.mapsdk.map.IMapView iMapView = this.mapView;
        if (iMapView != null) {
            iMapView.onSurfaceChanged(obj, i17, i18);
        }
    }

    @Override // android.view.View, com.tencent.tencentmap.mapsdk.map.IMapView
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.tencentmap.mapsdk.map.IMapView iMapView = this.mapView;
        return iMapView != null ? iMapView.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager, com.tencent.tencentmap.mapsdk.map.IMapView
    public void updateViewLayout(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        com.tencent.tencentmap.mapsdk.map.IMapView iMapView = this.mapView;
        if (iMapView == null) {
            return;
        }
        iMapView.updateViewLayout(view, layoutParams);
    }

    public MapView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMapType = 1;
        init(null);
    }

    public MapView(android.content.Context context, com.tencent.tencentmap.mapsdk.map.TencentMapOptions tencentMapOptions) {
        super(context);
        this.mMapType = 1;
        init(tencentMapOptions);
    }
}
