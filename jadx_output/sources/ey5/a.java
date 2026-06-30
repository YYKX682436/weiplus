package ey5;

/* loaded from: classes13.dex */
public class a implements com.tencent.tencentmap.mapsdk.map.IMapView {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.maps.MapRenderLayer f257638d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.map.TencentMap f257639e;

    public a(android.content.Context context, com.tencent.tencentmap.mapsdk.map.TencentMapOptions tencentMapOptions) {
        com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions2;
        com.tencent.mapsdk.rastercore.LogHelper.v("VecotrMapRenderLayer construct function start");
        if (tencentMapOptions != null) {
            tencentMapOptions2 = new com.tencent.tencentmap.mapsdk.maps.TencentMapOptions();
            tencentMapOptions2.setCustomCacheRootPath(com.tencent.mapsdk.rastercore.MapProvider.getMapSdkPath());
            if (tencentMapOptions.getExtSurface() != null) {
                tencentMapOptions2.setExtSurface(tencentMapOptions.getExtSurface());
                tencentMapOptions2.setExtSurfaceDimension(tencentMapOptions.getExtSurfaceWidth(), tencentMapOptions.getExtSurfaceHeight());
            }
            tencentMapOptions2.setHandDrawMapEnable(tencentMapOptions.isHandDrawMapEnable());
            tencentMapOptions2.setSubInfo(tencentMapOptions.getSubKey(), tencentMapOptions.getSubId());
            tencentMapOptions2.setMultipleInfoWindowEnable(tencentMapOptions.isMutipleInfowindowEnabled());
            tencentMapOptions2.enableMSAA(tencentMapOptions.enableMSAA());
            if (tencentMapOptions.getProtocolDataDesc() != null) {
                tencentMapOptions2.setServiceProtocol(tencentMapOptions.getProtocolFrom(), tencentMapOptions.getProtocolDataDesc());
            }
            if (tencentMapOptions.getOnAuthResultCallback() != null) {
                tencentMapOptions2.setOnAuthCallback(tencentMapOptions.getOnAuthResultCallback());
            }
            if (tencentMapOptions.isEnableLogger()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Map.VecotrMapRenderLayer", "initLogger");
                com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig.Builder newBuilder = com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig.newBuilder();
                newBuilder.toFile(false);
                newBuilder.toConsole(false);
                newBuilder.level(4);
                newBuilder.logCallback(new com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig.LogCallback() { // from class: ey5.a$$a
                    @Override // com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig.LogCallback
                    public final void onLog(java.lang.String str) {
                        ey5.a.this.getClass();
                        com.tencent.mars.xlog.Log.i("MicroMsg.Map.VecotrMapRenderLayer", "" + str);
                    }
                });
                tencentMapOptions2.initLogger(newBuilder.build());
            }
        } else {
            tencentMapOptions2 = new com.tencent.tencentmap.mapsdk.maps.TencentMapOptions();
            tencentMapOptions2.setCustomCacheRootPath(com.tencent.mapsdk.rastercore.MapProvider.getMapSdkPath());
        }
        com.tencent.tencentmap.mapsdk.maps.MapRenderLayer mapRenderLayer = new com.tencent.tencentmap.mapsdk.maps.MapRenderLayer(context, tencentMapOptions2);
        this.f257638d = mapRenderLayer;
        this.f257639e = new ey5.r(mapRenderLayer.getMap());
        mapRenderLayer.getMap().getUiSettings().setZoomControlsEnabled(false);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void addView(android.view.View view, com.tencent.tencentmap.mapsdk.map.MapView.LayoutParams layoutParams) {
        com.tencent.tencentmap.mapsdk.maps.MapRenderLayer mapRenderLayer = this.f257638d;
        if (mapRenderLayer.getMap() != null) {
            mapRenderLayer.getMap().addMarker(new com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions().icon(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromView(view)).position(ey5.x.f(layoutParams.point)));
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.tencentmap.mapsdk.maps.MapRenderLayer mapRenderLayer = this.f257638d;
        if (mapRenderLayer == null) {
            return false;
        }
        return mapRenderLayer.dispatchTouchEvent(motionEvent) || mapRenderLayer.onTouchEvent(motionEvent);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public com.tencent.tencentmap.mapsdk.map.TencentMap getMap() {
        return this.f257639e;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public com.tencent.tencentmap.mapsdk.map.MapController getMapController() {
        return this.f257639e;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public android.view.View getMapView() {
        return this.f257638d;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public com.tencent.tencentmap.mapsdk.map.Projection getProjection() {
        com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap = this.f257639e;
        if (tencentMap != null) {
            return ((ey5.r) tencentMap).getProjection();
        }
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public com.tencent.tencentmap.mapsdk.map.UiSettings getUiSettings() {
        com.tencent.tencentmap.mapsdk.maps.MapRenderLayer mapRenderLayer = this.f257638d;
        if (mapRenderLayer.getMap() != null) {
            return new ey5.y(mapRenderLayer.getMap().getUiSettings());
        }
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onCreate(android.os.Bundle bundle) {
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onDestroy() {
        this.f257638d.onDestroy();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onDestroyView() {
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onLowMemory() {
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onPause() {
        this.f257638d.onPause();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onRestart() {
        this.f257638d.onRestart();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onResume() {
        this.f257638d.onResume();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onSaveInstanceState(android.os.Bundle bundle) {
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        com.tencent.tencentmap.mapsdk.maps.MapRenderLayer mapRenderLayer = this.f257638d;
        if (mapRenderLayer != null) {
            mapRenderLayer.onSizeChanged(i17, i18, i19, i27);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onStart() {
        this.f257638d.onStart();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onStop() {
        this.f257638d.onStop();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onSurfaceChanged(java.lang.Object obj, int i17, int i18) {
        com.tencent.tencentmap.mapsdk.maps.MapRenderLayer mapRenderLayer = this.f257638d;
        if (mapRenderLayer != null) {
            mapRenderLayer.onSurfaceChanged(obj, i17, i18);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return this.f257638d.onTouchEvent(motionEvent);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView, android.view.ViewManager
    public void updateViewLayout(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        com.tencent.tencentmap.mapsdk.maps.MapRenderLayer mapRenderLayer = this.f257638d;
        if (mapRenderLayer != null) {
            mapRenderLayer.updateViewLayout(view, layoutParams);
        }
    }
}
