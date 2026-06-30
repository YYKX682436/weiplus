package com.tencent.mm.plugin.lite.map;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BG\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0018\u0010\f\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/lite/map/LiteAppMapView;", "Lio/flutter/plugin/platform/PlatformView;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Landroidx/lifecycle/v;", "Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;", "Landroid/content/Context;", "context", "", dm.i4.COL_ID, "", "", "", "creationParams", "Lio/flutter/plugin/common/MethodChannel;", "channel", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "activityPluginBinding", "<init>", "(Landroid/content/Context;ILjava/util/Map;Lio/flutter/plugin/common/MethodChannel;Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class LiteAppMapView implements io.flutter.plugin.platform.PlatformView, io.flutter.plugin.common.MethodChannel.MethodCallHandler, androidx.lifecycle.v, io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener {
    public boolean A;
    public boolean B;
    public boolean C;
    public android.location.Location D;
    public i11.e E;
    public ca3.a F;
    public boolean G;
    public final java.util.HashMap H = new java.util.HashMap();
    public final java.util.HashMap I = new java.util.HashMap();

    /* renamed from: J, reason: collision with root package name */
    public final ca3.q f144099J;
    public final ca3.r K;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f144100d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.common.MethodChannel f144101e;

    /* renamed from: f, reason: collision with root package name */
    public io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding f144102f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.map.MapView f144103g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f144104h;

    /* renamed from: i, reason: collision with root package name */
    public double f144105i;

    /* renamed from: m, reason: collision with root package name */
    public double f144106m;

    /* renamed from: n, reason: collision with root package name */
    public double f144107n;

    /* renamed from: o, reason: collision with root package name */
    public double f144108o;

    /* renamed from: p, reason: collision with root package name */
    public double f144109p;

    /* renamed from: q, reason: collision with root package name */
    public cl0.e f144110q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f144111r;

    /* renamed from: s, reason: collision with root package name */
    public cl0.e f144112s;

    /* renamed from: t, reason: collision with root package name */
    public double f144113t;

    /* renamed from: u, reason: collision with root package name */
    public double f144114u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f144115v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f144116w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f144117x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f144118y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f144119z;

    public LiteAppMapView(android.content.Context context, int i17, java.util.Map<java.lang.String, ? extends java.lang.Object> map, io.flutter.plugin.common.MethodChannel methodChannel, io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding activityPluginBinding) {
        com.tencent.tencentmap.mapsdk.map.UiSettings uiSettings;
        com.tencent.tencentmap.mapsdk.map.UiSettings uiSettings2;
        com.tencent.tencentmap.mapsdk.map.UiSettings uiSettings3;
        com.tencent.tencentmap.mapsdk.map.UiSettings uiSettings4;
        com.tencent.tencentmap.mapsdk.map.UiSettings uiSettings5;
        this.f144100d = context;
        this.f144101e = methodChannel;
        this.f144102f = activityPluginBinding;
        this.f144107n = 16.0d;
        this.f144108o = 3.0d;
        this.f144109p = 20.0d;
        this.f144110q = new cl0.e();
        this.f144111r = "standard";
        this.f144112s = new cl0.e();
        this.f144115v = true;
        this.f144116w = true;
        this.f144119z = true;
        this.A = true;
        ca3.o oVar = new ca3.o(this);
        ca3.q qVar = new ca3.q(this);
        this.f144099J = qVar;
        ca3.r rVar = new ca3.r(this);
        this.K = rVar;
        io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding activityPluginBinding2 = this.f144102f;
        if ((activityPluginBinding2 != null ? activityPluginBinding2.getLifecycle() : null) instanceof io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference) {
            io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding activityPluginBinding3 = this.f144102f;
            java.lang.Object lifecycle = activityPluginBinding3 != null ? activityPluginBinding3.getLifecycle() : null;
            kotlin.jvm.internal.o.e(lifecycle, "null cannot be cast to non-null type io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference");
            ((io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference) lifecycle).getLifecycle().a(this);
        }
        io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding activityPluginBinding4 = this.f144102f;
        if (activityPluginBinding4 != null) {
            activityPluginBinding4.addRequestPermissionsResultListener(this);
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding activityPluginBinding5 = this.f144102f;
        kotlin.jvm.internal.o.d(activityPluginBinding5);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppMapView", "checkPermission checkLocation: " + ((sb0.f) jVar).Di(activityPluginBinding5.getActivity(), new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 156, null, null));
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(this);
        }
        com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer.setAgreePrivacy(true);
        com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.getInstance().setMyLocationSource(null, oVar);
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.E = i11.h.e();
        com.tencent.tencentmap.mapsdk.map.MapView mapView = new com.tencent.tencentmap.mapsdk.map.MapView(context);
        this.f144103g = mapView;
        mapView.onCreate(null);
        com.tencent.tencentmap.mapsdk.map.MapView mapView2 = this.f144103g;
        if (mapView2 != null) {
            mapView2.onResume();
        }
        com.tencent.tencentmap.mapsdk.map.MapView mapView3 = this.f144103g;
        com.tencent.tencentmap.mapsdk.map.TencentMap map2 = mapView3 != null ? mapView3.getMap() : null;
        java.lang.Boolean bool = (java.lang.Boolean) (map != null ? map.get("showLocation") : null);
        this.f144104h = bool != null ? bool.booleanValue() : false;
        java.lang.Double d17 = (java.lang.Double) (map != null ? map.get("longitude") : null);
        this.f144105i = d17 != null ? d17.doubleValue() : 0.0d;
        java.lang.Double d18 = (java.lang.Double) (map != null ? map.get("latitude") : null);
        this.f144106m = d18 != null ? d18.doubleValue() : 0.0d;
        java.lang.Double d19 = (java.lang.Double) (map != null ? map.get(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ZOOM) : null);
        this.f144107n = d19 != null ? d19.doubleValue() : 0.0d;
        java.lang.Double d27 = (java.lang.Double) (map != null ? map.get("minZoom") : null);
        this.f144108o = d27 != null ? d27.doubleValue() : 0.0d;
        java.lang.Double d28 = (java.lang.Double) (map != null ? map.get("maxZoom") : null);
        this.f144109p = d28 != null ? d28.doubleValue() : 0.0d;
        java.lang.String str = (java.lang.String) (map != null ? map.get("initialMarkers") : null);
        this.f144110q = new cl0.e(str == null ? "[]" : str);
        java.lang.String str2 = (java.lang.String) (map != null ? map.get("mapType") : null);
        this.f144111r = str2 == null ? "standard" : str2;
        java.lang.String str3 = (java.lang.String) (map != null ? map.get("initialPolylines") : null);
        this.f144112s = new cl0.e(str3 != null ? str3 : "[]");
        java.lang.Double d29 = (java.lang.Double) (map != null ? map.get("rotation") : null);
        this.f144113t = d29 != null ? d29.doubleValue() : 0.0d;
        java.lang.Double d37 = (java.lang.Double) (map != null ? map.get("overlooking") : null);
        this.f144114u = d37 != null ? d37.doubleValue() : 0.0d;
        java.lang.Boolean bool2 = (java.lang.Boolean) (map != null ? map.get("enableZoom") : null);
        this.f144115v = bool2 != null ? bool2.booleanValue() : true;
        java.lang.Boolean bool3 = (java.lang.Boolean) (map != null ? map.get("enableScroll") : null);
        this.f144116w = bool3 != null ? bool3.booleanValue() : true;
        java.lang.Boolean bool4 = (java.lang.Boolean) (map != null ? map.get("enableRotation") : null);
        this.f144117x = bool4 != null ? bool4.booleanValue() : false;
        java.lang.Boolean bool5 = (java.lang.Boolean) (map != null ? map.get("enableTraffic") : null);
        this.f144118y = bool5 != null ? bool5.booleanValue() : false;
        java.lang.Boolean bool6 = (java.lang.Boolean) (map != null ? map.get("enablePOI") : null);
        this.f144119z = bool6 != null ? bool6.booleanValue() : true;
        java.lang.Boolean bool7 = (java.lang.Boolean) (map != null ? map.get("enableBuilding") : null);
        this.A = bool7 != null ? bool7.booleanValue() : true;
        java.lang.Boolean bool8 = (java.lang.Boolean) (map != null ? map.get("showScale") : null);
        this.B = bool8 != null ? bool8.booleanValue() : false;
        java.lang.Boolean bool9 = (java.lang.Boolean) (map != null ? map.get("showCompass") : null);
        this.C = bool9 != null ? bool9.booleanValue() : false;
        if (this.f144111r.equals("standard")) {
            if (map2 != null) {
                map2.setMapType(1000);
            }
        } else if (this.f144111r.equals("satellite")) {
            if (map2 != null) {
                map2.setMapType(1011);
            }
        } else if (this.f144111r.equals("dark") && map2 != null) {
            map2.setMapType(1008);
        }
        if (map2 != null) {
            map2.setTrafficEnabled(this.f144118y);
        }
        a(this.f144110q);
        b(this.f144112s);
        com.tencent.tencentmap.mapsdk.map.MapView mapView4 = this.f144103g;
        if (mapView4 != null && (uiSettings5 = mapView4.getUiSettings()) != null) {
            uiSettings5.setScrollGesturesEnabled(this.f144116w);
        }
        com.tencent.tencentmap.mapsdk.map.MapView mapView5 = this.f144103g;
        if (mapView5 != null && (uiSettings4 = mapView5.getUiSettings()) != null) {
            uiSettings4.setZoomGesturesEnabled(this.f144115v);
        }
        com.tencent.tencentmap.mapsdk.map.MapView mapView6 = this.f144103g;
        if (mapView6 != null && (uiSettings3 = mapView6.getUiSettings()) != null) {
            uiSettings3.setCompassEnabled(this.C);
        }
        com.tencent.tencentmap.mapsdk.map.MapView mapView7 = this.f144103g;
        if (mapView7 != null && (uiSettings2 = mapView7.getUiSettings()) != null) {
            uiSettings2.setRotateGesturesEnabled(this.f144117x);
        }
        com.tencent.tencentmap.mapsdk.map.MapView mapView8 = this.f144103g;
        if (mapView8 != null && (uiSettings = mapView8.getUiSettings()) != null) {
            uiSettings.setScaleControlsEnabled(this.B);
        }
        if (map2 != null) {
            map2.setPoisEnabled(this.f144119z);
        }
        if (map2 != null) {
            map2.showBuilding(this.A);
        }
        if (map2 != null) {
            map2.setMinZoomLevel((int) this.f144108o);
        }
        if (map2 != null) {
            map2.setMaxZoomLevel((int) this.f144109p);
        }
        if (this.f144104h) {
            i11.e eVar = this.E;
            if (eVar != null) {
                ((i11.h) eVar).j(qVar, true);
            }
            ca3.f.f39793a.a(rVar);
        }
        if (map2 != null) {
            map2.moveCamera(com.tencent.tencentmap.mapsdk.map.CameraUpdateFactory.newCameraPosition(new com.tencent.mapsdk.raster.model.CameraPosition(new com.tencent.mapsdk.raster.model.LatLng(this.f144106m, this.f144105i), (float) this.f144107n, (float) this.f144114u, (float) this.f144113t)));
        }
        if (map2 != null) {
            map2.setOnMapLoadedListener(ca3.h.f39798a);
        }
        if (map2 != null) {
            map2.setErrorListener(new ca3.i(this));
        }
        if (map2 != null) {
            map2.setOnMapCameraChangeListener(new ca3.j(this));
        }
        if (map2 != null) {
            map2.setOnMapClickListener(new ca3.k(this));
        }
        if (map2 != null) {
            map2.setOnMapPoiClickListener(new ca3.l(this));
        }
        if (map2 != null) {
            map2.setOnPolylineClickListener(new ca3.m(this));
        }
        if (map2 != null) {
            map2.setOnMarkerClickListener(new ca3.n(this));
        }
    }

    public final void a(cl0.e eVar) {
        int length = eVar.length();
        for (int i17 = 0; i17 < length; i17++) {
            cl0.g jSONObject = eVar.getJSONObject(i17);
            android.content.Context context = this.f144100d;
            kotlin.jvm.internal.o.d(context);
            ca3.b bVar = new ca3.b(context);
            com.tencent.tencentmap.mapsdk.map.MapView mapView = this.f144103g;
            kotlin.jvm.internal.o.d(mapView);
            com.tencent.tencentmap.mapsdk.map.TencentMap map = mapView.getMap();
            kotlin.jvm.internal.o.d(map);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppMapMarkerPoint", "attachMarker");
            double optDouble = jSONObject.optDouble("longitude", 0.0d);
            double optDouble2 = jSONObject.optDouble("latitude", 0.0d);
            int optInt = jSONObject.optInt(dm.i4.COL_ID, 0);
            java.lang.String optString = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
            com.tencent.mapsdk.raster.model.MarkerOptions markerOptions = new com.tencent.mapsdk.raster.model.MarkerOptions();
            markerOptions.anchor(0.5f, 0.5f);
            markerOptions.position(new com.tencent.mapsdk.raster.model.LatLng(optDouble2, optDouble));
            markerOptions.markerView(bVar.f39788d);
            markerOptions.zIndex(Integer.MAX_VALUE);
            markerOptions.flat(false);
            markerOptions.tag(bVar.f39785a);
            markerOptions.title(optString);
            bVar.f39786b = optInt;
            bVar.f39785a = "MarkerPoint" + optInt;
            bVar.f39787c = map.addMarker(markerOptions);
            this.H.put(java.lang.Integer.valueOf(bVar.f39786b), bVar);
            io.flutter.plugin.common.MethodChannel methodChannel = this.f144101e;
            if (methodChannel != null) {
                methodChannel.invokeMethod("update", null);
            }
        }
    }

    public final void b(cl0.e eVar) {
        int i17;
        int i18;
        double d17;
        vc1.b2 b2Var;
        int i19;
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.lite.map.LiteAppMapView liteAppMapView = this;
        int length = eVar.length();
        int i27 = 0;
        int i28 = 0;
        while (i28 < length) {
            cl0.g jSONObject = eVar.getJSONObject(i28);
            android.content.Context context = liteAppMapView.f144100d;
            kotlin.jvm.internal.o.d(context);
            ca3.c cVar = new ca3.c(context);
            com.tencent.tencentmap.mapsdk.map.MapView mapView = liteAppMapView.f144103g;
            kotlin.jvm.internal.o.d(mapView);
            com.tencent.tencentmap.mapsdk.map.TencentMap map = mapView.getMap();
            kotlin.jvm.internal.o.d(map);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppMapPolyline", "attachPolyline");
            cl0.e jSONArray = jSONObject.getJSONArray("points");
            int optInt = jSONObject.optInt(dm.i4.COL_ID, i27);
            int optInt2 = jSONObject.optInt("style", -1);
            double optDouble = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().density * jSONObject.optDouble("arrowGap", 0.0d);
            int parseColor = android.graphics.Color.parseColor(jSONObject.optString("color", "#000000"));
            cl0.e f17 = jSONObject.f("colorList");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (f17 == null || f17.length() <= 0) {
                i17 = length;
            } else {
                i17 = length;
                int i29 = 0;
                for (int length2 = f17.length(); i29 < length2; length2 = length2) {
                    arrayList2.add(java.lang.Integer.valueOf(android.graphics.Color.parseColor(f17.getString(i29))));
                    i29++;
                }
            }
            boolean optBoolean = jSONObject.optBoolean("enableGradient", false);
            java.lang.String optString = jSONObject.optString("buildingId", "");
            int i37 = i28;
            java.lang.String optString2 = jSONObject.optString("floorName", "");
            double optDouble2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().density * jSONObject.optDouble("width", 1.0d);
            int parseColor2 = android.graphics.Color.parseColor(jSONObject.optString("borderColorStr", "#00000000"));
            double optDouble3 = jSONObject.optDouble("borderWidth", 1.0d) * com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().density;
            boolean optBoolean2 = jSONObject.optBoolean("dotLine", false);
            jSONObject.optBoolean("arrowLine", false);
            jSONObject.optString("arrowIconPath", "");
            java.lang.String optString3 = jSONObject.optString(ya.b.LEVEL, "aboveroads");
            int i38 = com.tencent.mapsdk.raster.model.OverlayLevel.OverlayLevelAboveRoads;
            if (optString3.equals("aboveroads")) {
                i38 = com.tencent.mapsdk.raster.model.OverlayLevel.OverlayLevelAboveRoads;
            } else if (optString3.equals("abovebuildings")) {
                i38 = com.tencent.mapsdk.raster.model.OverlayLevel.OverlayLevelAboveBuildings;
            } else if (optString3.equals("abovelabels")) {
                i38 = com.tencent.mapsdk.raster.model.OverlayLevel.OverlayLevelAboveLabels;
            }
            int i39 = i38;
            cl0.g b17 = jSONObject.b("textStyle");
            if (b17 != null) {
                b2Var = new vc1.b2();
                d17 = optDouble3;
                java.lang.String optString4 = b17.optString("textColor", "#000000");
                java.lang.String optString5 = b17.optString("strokeColor", "#FFFFFF");
                i18 = parseColor2;
                int optInt3 = b17.optInt("fontSize", 14);
                b2Var.f434915a = android.graphics.Color.parseColor(optString4);
                b2Var.f434916b = android.graphics.Color.parseColor(optString5);
                b2Var.f434917c = optInt3;
            } else {
                i18 = parseColor2;
                d17 = optDouble3;
                b2Var = null;
            }
            cl0.e f18 = jSONObject.f("segmentTexts");
            if (f18 != null) {
                arrayList = new java.util.ArrayList();
                int i47 = 0;
                for (int length3 = f18.length(); i47 < length3; length3 = length3) {
                    cl0.g jSONObject2 = f18.getJSONObject(i47);
                    vc1.a2 a2Var = new vc1.a2();
                    a2Var.f434910a = jSONObject2.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "");
                    a2Var.f434911b = jSONObject2.optInt(io.flutter.plugin.editing.SpellCheckPlugin.START_INDEX_KEY, 0);
                    a2Var.f434912c = jSONObject2.optInt(io.flutter.plugin.editing.SpellCheckPlugin.END_INDEX_KEY, 0);
                    arrayList.add(a2Var);
                    i47++;
                    f18 = f18;
                }
                i19 = 0;
            } else {
                i19 = 0;
                arrayList = null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            int length4 = jSONArray.length();
            int i48 = i19;
            while (i48 < length4) {
                cl0.g jSONObject3 = jSONArray.getJSONObject(i48);
                arrayList3.add(new com.tencent.mapsdk.raster.model.LatLng(jSONObject3.optDouble("latitude", 0.0d), jSONObject3.optDouble("longitude", 0.0d)));
                i48++;
                optInt2 = optInt2;
                b2Var = b2Var;
                arrayList = arrayList;
                optDouble2 = optDouble2;
            }
            vc1.b2 b2Var2 = b2Var;
            java.util.ArrayList arrayList4 = arrayList;
            double d18 = optDouble2;
            int i49 = optInt2;
            com.tencent.mapsdk.raster.model.PolylineOptions polylineOptions = new com.tencent.mapsdk.raster.model.PolylineOptions();
            polylineOptions.addAll(arrayList3);
            if (!arrayList2.isEmpty()) {
                int size = arrayList2.size();
                int[] iArr = new int[size];
                int[] iArr2 = new int[size];
                int size2 = arrayList2.size();
                for (int i57 = 0; i57 < size2; i57++) {
                    java.lang.Object obj = arrayList2.get(i57);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    iArr[i57] = ((java.lang.Number) obj).intValue();
                    iArr2[i57] = i57;
                }
                polylineOptions.colors(iArr, iArr2);
            } else if (i49 != -1) {
                polylineOptions.color(i49);
            } else {
                polylineOptions.color(parseColor);
            }
            polylineOptions.setEnableGradient(optBoolean);
            polylineOptions.width((float) d18);
            polylineOptions.setDottedLine(optBoolean2);
            polylineOptions.edgeColor(i18);
            polylineOptions.edgeWidth((float) d17);
            polylineOptions.zIndex(1.0f);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString) && !com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                polylineOptions.indoorInfo(new com.tencent.mapsdk.raster.model.IndoorInfo(optString, optString2));
            }
            polylineOptions.arrowGap((float) optDouble);
            polylineOptions.level(i39);
            polylineOptions.lineCap(true);
            polylineOptions.setTextStyle(b2Var2);
            polylineOptions.setSegmentTexts(arrayList4);
            cVar.f39789a = optInt;
            cVar.f39790b = map.addPolyline(polylineOptions);
            this.I.put(java.lang.Integer.valueOf(cVar.f39789a), cVar);
            io.flutter.plugin.common.MethodChannel methodChannel = this.f144101e;
            if (methodChannel != null) {
                methodChannel.invokeMethod("update", null);
            }
            i28 = i37 + 1;
            liteAppMapView = this;
            length = i17;
            i27 = 0;
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        this.f144103g = null;
        this.f144102f = null;
        ca3.a aVar = this.F;
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppMapLocationPoint", "detachPoint");
            com.tencent.mapsdk.raster.model.Marker marker = aVar.f39776a;
            if (marker != null) {
                marker.remove();
            }
            aVar.f39776a = null;
        }
        this.F = null;
        i11.e eVar = this.E;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f144099J);
        }
        this.E = null;
        ca3.f.f39793a.b(this.K);
        java.util.HashMap hashMap = this.H;
        java.util.Collection<ca3.b> values = hashMap.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        for (ca3.b bVar : values) {
            bVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppMapMarkerPoint", "detachMarker");
            com.tencent.mapsdk.raster.model.Marker marker2 = bVar.f39787c;
            if (marker2 != null) {
                marker2.remove();
            }
            bVar.f39787c = null;
        }
        hashMap.clear();
        java.util.HashMap hashMap2 = this.I;
        java.util.Collection<ca3.c> values2 = hashMap2.values();
        kotlin.jvm.internal.o.f(values2, "<get-values>(...)");
        for (ca3.c cVar : values2) {
            cVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppMapPolyline", "detachPolyline");
            com.tencent.mapsdk.raster.model.Polyline polyline = cVar.f39790b;
            if (polyline != null) {
                polyline.remove();
            }
            cVar.f39790b = null;
        }
        hashMap2.clear();
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public android.view.View getView() {
        return this.f144103g;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e4, code lost:
    
        if (r10 == false) goto L71;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0027. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r17, io.flutter.plugin.common.MethodChannel.Result r18) {
        /*
            Method dump skipped, instructions count: 1706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.map.LiteAppMapView.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        if (grantResults.length == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppMapView", "onRequestPermissionsResult grantResults length 0. requestCode: " + i17);
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppMapView", "onRequestPermissionsResult requestCode: " + i17 + ", grantResults: " + grantResults[0]);
        if (i17 == 156) {
            int i18 = grantResults[0];
        }
        return true;
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppMapView", "onStateChanged source: " + source + ", event: " + event.name());
        int i17 = ca3.g.f39797a[event.ordinal()];
        ca3.r rVar = this.K;
        ca3.q qVar = this.f144099J;
        switch (i17) {
            case 1:
                com.tencent.tencentmap.mapsdk.map.MapView mapView = this.f144103g;
                if (mapView != null) {
                    mapView.onCreate(null);
                    return;
                }
                return;
            case 2:
                com.tencent.tencentmap.mapsdk.map.MapView mapView2 = this.f144103g;
                if (mapView2 != null) {
                    mapView2.onResume();
                }
                if (this.f144104h) {
                    i11.e eVar = this.E;
                    if (eVar != null) {
                        ((i11.h) eVar).j(qVar, true);
                    }
                    ca3.f.f39793a.a(rVar);
                }
                this.G = false;
                return;
            case 3:
                com.tencent.tencentmap.mapsdk.map.MapView mapView3 = this.f144103g;
                if (mapView3 != null) {
                    mapView3.onPause();
                }
                i11.e eVar2 = this.E;
                if (eVar2 != null) {
                    ((i11.h) eVar2).m(qVar);
                }
                ca3.f.f39793a.b(rVar);
                this.G = true;
                return;
            case 4:
                com.tencent.tencentmap.mapsdk.map.MapView mapView4 = this.f144103g;
                if (mapView4 != null) {
                    mapView4.onDestroy();
                    return;
                }
                return;
            case 5:
                com.tencent.tencentmap.mapsdk.map.MapView mapView5 = this.f144103g;
                if (mapView5 != null) {
                    mapView5.onStart();
                    return;
                }
                return;
            case 6:
                com.tencent.tencentmap.mapsdk.map.MapView mapView6 = this.f144103g;
                if (mapView6 != null) {
                    mapView6.onStop();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
