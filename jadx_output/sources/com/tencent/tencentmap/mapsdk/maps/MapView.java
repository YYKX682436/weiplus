package com.tencent.tencentmap.mapsdk.maps;

/* loaded from: classes13.dex */
public class MapView extends com.tencent.tencentmap.mapsdk.maps.BaseMapView {
    private boolean mIsResumed;
    private com.tencent.tencentmap.mapsdk.maps.TencentMap mMap;
    protected com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy mMapDelegate;
    private com.tencent.tencentmap.mapsdk.maps.TencentMapOptions mMapOptions;

    public MapView(android.content.Context context) {
        this(context, new com.tencent.tencentmap.mapsdk.maps.TencentMapOptions());
    }

    private <T extends com.tencent.tencentmap.mapsdk.maps.TencentMap> void getMapSync(com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions, final com.tencent.map.tools.Callback<T> callback) {
        tencentMapOptions.setGetMapAsync(new com.tencent.map.tools.Callback<com.tencent.tencentmap.mapsdk.maps.TencentMap>() { // from class: com.tencent.tencentmap.mapsdk.maps.MapView.2

            /* renamed from: com.tencent.tencentmap.mapsdk.maps.MapView$2$1, reason: invalid class name */
            /* loaded from: classes13.dex */
            public class AnonymousClass1 implements com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ com.tencent.tencentmap.mapsdk.maps.TencentMap f215348a;

                public AnonymousClass1(com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap) {
                    this.f215348a = tencentMap;
                }

                @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback
                public final void onMapLoaded() {
                    com.tencent.map.tools.Callback callback = callback;
                    if (callback != null) {
                        callback.callback(this.f215348a);
                    }
                    this.f215348a.removeOnMapLoadedCallback(this);
                }
            }

            private void a(com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap) {
                tencentMap.addOnMapLoadedCallback(new com.tencent.tencentmap.mapsdk.maps.MapView.AnonymousClass2.AnonymousClass1(tencentMap));
            }

            @Override // com.tencent.map.tools.Callback
            public final /* synthetic */ void callback(com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap) {
                com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap2 = tencentMap;
                tencentMap2.addOnMapLoadedCallback(new com.tencent.tencentmap.mapsdk.maps.MapView.AnonymousClass2.AnonymousClass1(tencentMap2));
            }
        });
        initMap(tencentMapOptions);
    }

    private void initMap(com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy mapViewProxy;
        com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions2;
        if (this.mMap == null || !((tencentMapOptions2 = this.mMapOptions) == tencentMapOptions || tencentMapOptions2.equals(tencentMapOptions))) {
            if (tencentMapOptions == null) {
                tencentMapOptions = new com.tencent.tencentmap.mapsdk.maps.TencentMapOptions();
            }
            if (tencentMapOptions.getMapViewType() == null) {
                tencentMapOptions.setMapViewType(getViewType());
            }
            if (tencentMapOptions.getMapKernel() == null) {
                tencentMapOptions.setMapKernel(getMapKernel());
            }
            setClickable(true);
            if (this.mMap != null && (mapViewProxy = this.mMapDelegate) != null) {
                mapViewProxy.onPause();
                this.mMapDelegate.onStop();
                this.mMapDelegate.onDestroy();
                this.mMapDelegate = null;
                this.mMap = null;
            }
            final com.tencent.map.tools.Callback<com.tencent.tencentmap.mapsdk.maps.TencentMap> mapAsyncCallback = tencentMapOptions.getMapAsyncCallback();
            if (this.mMapDelegate == null) {
                com.tencent.mapsdk.internal.hm.a aVar = com.tencent.mapsdk.internal.hm.a().f49780a.get(com.tencent.mapsdk.internal.hm.b.MAP_ENGINE);
                if (aVar != null) {
                    com.tencent.mapsdk.internal.u.a();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(aVar.f49782b);
                    java.lang.String sb7 = sb6.toString();
                    java.lang.String str = aVar.f49783c;
                    java.lang.String str2 = aVar.f49781a;
                    java.lang.String str3 = aVar.f49785e;
                    java.lang.String str4 = aVar.f49784d;
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    sb8.append(aVar.f49786f);
                    new com.tencent.mapsdk.shell.events.DynamicLibEvent(sb7, str, str2, str3, str4, sb8.toString());
                }
                if (!com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer.isPreLoadLibrarySuccess(com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer.LibraryName.TENCENT_MAP_ENGINE)) {
                    com.tencent.cso.CsoLoader.e(com.tencent.mapsdk.internal.tf.f51579a);
                }
                com.tencent.mapsdk.internal.t tVar = new com.tencent.mapsdk.internal.t(getContext().getApplicationContext());
                if (mapAsyncCallback != null) {
                    new java.lang.Thread(new com.tencent.mapsdk.internal.u.AnonymousClass4(tVar.f51564a, tVar.a(tencentMapOptions), new android.os.Handler(android.os.Looper.getMainLooper()), new com.tencent.mapsdk.internal.t.AnonymousClass1(this, tencentMapOptions, new com.tencent.map.tools.Callback<com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy>() { // from class: com.tencent.tencentmap.mapsdk.maps.MapView.1
                        private void a(com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy mapViewProxy2) {
                            com.tencent.tencentmap.mapsdk.maps.MapView.this.mMapDelegate = mapViewProxy2;
                            if (mapViewProxy2 != null) {
                                mapViewProxy2.onResume();
                                mapAsyncCallback.callback(mapViewProxy2.getMap());
                            }
                        }

                        @Override // com.tencent.map.tools.Callback
                        public final /* synthetic */ void callback(com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy mapViewProxy2) {
                            com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy mapViewProxy3 = mapViewProxy2;
                            com.tencent.tencentmap.mapsdk.maps.MapView.this.mMapDelegate = mapViewProxy3;
                            if (mapViewProxy3 != null) {
                                mapViewProxy3.onResume();
                                mapAsyncCallback.callback(mapViewProxy3.getMap());
                            }
                        }
                    })), "tms-plugin").start();
                } else {
                    this.mMapDelegate = tVar.a(this, tencentMapOptions);
                }
            }
            this.mMapOptions = tencentMapOptions;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy mapViewProxy;
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (dispatchTouchEvent || (mapViewProxy = this.mMapDelegate) == null || !mapViewProxy.isTouchable()) {
            return dispatchTouchEvent;
        }
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(this.mMapOptions.isDisallowInterceptTouchEvent());
        }
        return this.mMapDelegate.onTouchEvent(motionEvent);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView
    public com.tencent.tencentmap.mapsdk.maps.TencentMap getMap() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.mMap;
        return tencentMap != null ? tencentMap : getMap(this.mMapOptions);
    }

    public int[] getMapPadding() {
        return new int[]{getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom()};
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView
    public void onDestroy() {
        com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy mapViewProxy = this.mMapDelegate;
        if (mapViewProxy != null) {
            mapViewProxy.onDestroy();
            this.mMapDelegate = null;
        }
        this.mMapOptions = null;
        this.mMap = null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView
    public void onPause() {
        com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy mapViewProxy = this.mMapDelegate;
        if (mapViewProxy != null) {
            mapViewProxy.onPause();
            this.mIsResumed = false;
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView
    public void onRestart() {
        com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy mapViewProxy = this.mMapDelegate;
        if (mapViewProxy != null) {
            mapViewProxy.onRestart();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView
    public void onResume() {
        com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy mapViewProxy = this.mMapDelegate;
        if (mapViewProxy != null && !this.mIsResumed) {
            mapViewProxy.onResume();
            this.mIsResumed = true;
        }
        com.tencent.mapsdk.internal.u.a();
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy mapViewProxy = this.mMapDelegate;
        if (mapViewProxy != null) {
            mapViewProxy.onSizeChanged(i17, i18, i19, i27);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView
    public void onStart() {
        com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy mapViewProxy = this.mMapDelegate;
        if (mapViewProxy != null) {
            mapViewProxy.onStart();
        }
        com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy mapViewProxy2 = this.mMapDelegate;
        if (mapViewProxy2 == null || this.mIsResumed) {
            return;
        }
        mapViewProxy2.onResume();
        this.mIsResumed = true;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView
    public void onStop() {
        com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy mapViewProxy = this.mMapDelegate;
        if (mapViewProxy != null) {
            mapViewProxy.onStop();
        }
        com.tencent.mapsdk.internal.u.a();
    }

    public void onSurfaceChanged(java.lang.Object obj, int i17, int i18) {
        com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy mapViewProxy;
        if (((obj instanceof android.view.Surface) || (obj instanceof android.graphics.SurfaceTexture) || (obj instanceof android.view.SurfaceHolder)) && (mapViewProxy = this.mMapDelegate) != null) {
            mapViewProxy.onSurfaceChanged(obj, i17, i18);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    public void setMapPadding(int i17, int i18, int i19, int i27) {
        setPadding(i17, i18, i19, i27);
    }

    public void setOnTop(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy mapViewProxy = this.mMapDelegate;
        if (mapViewProxy != null) {
            mapViewProxy.setOnTop(z17);
        }
    }

    public MapView(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        super(context);
        this.mMap = getMap(tencentMapOptions);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView
    public com.tencent.tencentmap.mapsdk.maps.TencentMap getMap(com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        if (!com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer.getAgreePrivacy()) {
            return null;
        }
        initMap(tencentMapOptions);
        com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy mapViewProxy = this.mMapDelegate;
        if (mapViewProxy != null) {
            return mapViewProxy.getMap();
        }
        return null;
    }

    public MapView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, new com.tencent.tencentmap.mapsdk.maps.TencentMapOptions());
    }

    public MapView(android.content.Context context, android.util.AttributeSet attributeSet, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        this(context, attributeSet, 0, tencentMapOptions);
    }

    public MapView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, new com.tencent.tencentmap.mapsdk.maps.TencentMapOptions());
    }

    public MapView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        super(context, attributeSet, i17);
        this.mMap = getMap(tencentMapOptions);
    }
}
