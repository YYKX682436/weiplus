package ey5;

/* loaded from: classes13.dex */
public class d implements com.tencent.tencentmap.mapsdk.map.IMapView {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.maps.MapView f257643d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.map.TencentMap f257644e;

    public d(android.content.Context context, com.tencent.tencentmap.mapsdk.map.TencentMapOptions tencentMapOptions) {
        com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions2;
        com.tencent.mapsdk.rastercore.LogHelper.v("vector MapView construct function start");
        if (tencentMapOptions != null) {
            tencentMapOptions2 = new com.tencent.tencentmap.mapsdk.maps.TencentMapOptions();
            tencentMapOptions2.setCustomCacheRootPath(com.tencent.mapsdk.rastercore.MapProvider.getMapSdkPath());
            if (tencentMapOptions.getExtSurface() != null) {
                tencentMapOptions2.setExtSurface(tencentMapOptions.getExtSurface());
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
                com.tencent.mars.xlog.Log.i("MicroMsg.Map.VectorMapView", "initLogger");
                com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig.Builder newBuilder = com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig.newBuilder();
                newBuilder.toFile(false);
                newBuilder.toConsole(false);
                newBuilder.level(4);
                newBuilder.logCallback(new com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig.LogCallback() { // from class: ey5.d$$a
                    @Override // com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig.LogCallback
                    public final void onLog(java.lang.String str) {
                        ey5.d.this.getClass();
                        com.tencent.mars.xlog.Log.i("MicroMsg.Map.VectorMapView", "" + str);
                    }
                });
                tencentMapOptions2.initLogger(newBuilder.build());
            }
        } else {
            tencentMapOptions2 = new com.tencent.tencentmap.mapsdk.maps.TencentMapOptions();
            tencentMapOptions2.setCustomCacheRootPath(com.tencent.mapsdk.rastercore.MapProvider.getMapSdkPath());
        }
        com.tencent.tencentmap.mapsdk.maps.MapView mapView = new com.tencent.tencentmap.mapsdk.maps.MapView(context, tencentMapOptions2);
        this.f257643d = mapView;
        this.f257644e = new ey5.r(mapView.getMap());
        mapView.getMap().getUiSettings().setZoomControlsEnabled(false);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void addView(android.view.View view, com.tencent.tencentmap.mapsdk.map.MapView.LayoutParams layoutParams) {
        com.tencent.tencentmap.mapsdk.maps.MapView mapView = this.f257643d;
        if (mapView.getMap() != null) {
            mapView.getMap().addMarker(new com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions().icon(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromView(view)).position(ey5.x.f(layoutParams.point)));
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.tencentmap.mapsdk.maps.MapView mapView = this.f257643d;
        if (mapView == null) {
            return false;
        }
        return mapView.dispatchTouchEvent(motionEvent) || mapView.onTouchEvent(motionEvent);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public com.tencent.tencentmap.mapsdk.map.TencentMap getMap() {
        return this.f257644e;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public com.tencent.tencentmap.mapsdk.map.MapController getMapController() {
        return this.f257644e;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public android.view.View getMapView() {
        return this.f257643d;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public com.tencent.tencentmap.mapsdk.map.Projection getProjection() {
        com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap = this.f257644e;
        if (tencentMap != null) {
            return ((ey5.r) tencentMap).getProjection();
        }
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public com.tencent.tencentmap.mapsdk.map.UiSettings getUiSettings() {
        com.tencent.tencentmap.mapsdk.maps.MapView mapView = this.f257643d;
        if (mapView.getMap() != null) {
            return new ey5.y(mapView.getMap().getUiSettings());
        }
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onCreate(android.os.Bundle bundle) {
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onDestroy() {
        this.f257643d.onDestroy();
        com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap = this.f257644e;
        if (tencentMap instanceof ey5.r) {
            ey5.r rVar = (ey5.r) tencentMap;
            java.util.List list = rVar.f257668m;
            if (list != null) {
                ((java.util.LinkedList) list).clear();
            }
            java.util.List list2 = rVar.f257670o;
            if (list2 != null) {
                ((java.util.LinkedList) list2).clear();
            }
            java.util.List list3 = rVar.f257672q;
            if (list3 != null) {
                ((java.util.LinkedList) list3).clear();
            }
            java.util.List list4 = rVar.f257674s;
            if (list4 != null) {
                ((java.util.LinkedList) list4).clear();
            }
            java.util.List list5 = rVar.f257676u;
            if (list5 != null) {
                ((java.util.LinkedList) list5).clear();
            }
            java.util.List list6 = rVar.f257678w;
            if (list6 != null) {
                ((java.util.LinkedList) list6).clear();
            }
            java.util.List list7 = rVar.f257680y;
            if (list7 != null) {
                ((java.util.LinkedList) list7).clear();
            }
            java.util.List list8 = rVar.A;
            if (list8 != null) {
                ((java.util.LinkedList) list8).clear();
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onDestroyView() {
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onLowMemory() {
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onPause() {
        this.f257643d.onPause();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onRestart() {
        this.f257643d.onRestart();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onResume() {
        this.f257643d.onResume();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onSaveInstanceState(android.os.Bundle bundle) {
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        com.tencent.tencentmap.mapsdk.maps.MapView mapView = this.f257643d;
        if (mapView != null) {
            mapView.onSizeChanged(i17, i18, i19, i27);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onStart() {
        this.f257643d.onStart();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onStop() {
        this.f257643d.onStop();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public void onSurfaceChanged(java.lang.Object obj, int i17, int i18) {
        com.tencent.tencentmap.mapsdk.maps.MapView mapView = this.f257643d;
        if (mapView != null) {
            mapView.onSurfaceChanged(obj, i17, i18);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return motionEvent.getAction() == 0;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.IMapView, android.view.ViewManager
    public void updateViewLayout(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        com.tencent.tencentmap.mapsdk.maps.MapView mapView = this.f257643d;
        if (mapView != null) {
            mapView.updateViewLayout(view, layoutParams);
        }
    }
}
