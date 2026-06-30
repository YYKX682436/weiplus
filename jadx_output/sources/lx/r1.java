package lx;

/* loaded from: classes8.dex */
public final class r1 implements com.tencent.pigeon.biz.BizLocationApi, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f321927d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.pigeon.biz.BizLocationCallbackApi f321928e;

    /* renamed from: f, reason: collision with root package name */
    public eq1.u f321929f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.pigeon.biz.BizUserLocationInfo f321930g;

    public final boolean a() {
        if (ih.a.b("clicfg_feed_request_with_poi_preload_n_cache_android", 0) == 0) {
            return false;
        }
        boolean i17 = com.tencent.mm.sdk.platformtools.o4.R("__flutter_biz_mmkv__").i(gm0.j1.b().j() + "_biz_wesee_location_auth_dialog_showed", false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchBizPOIInfoWhenEnter return for not showed: ");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizLocationPlugin", sb6.toString());
        return isOpenSystemLocation() <= 0 || isOpenK1kLocation() >= 1 || i17 || ih.a.b("clicfg_biz_disable_k1k_location_auth_dialog_android", 0) == 0;
    }

    public final void b(yz5.l lVar) {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizLocationPlugin", "fetchBizPOIInfoAsync");
            android.content.Context context = this.f321927d;
            if (context == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (!j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", true)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizLocationPlugin", "fetchBizPOIInfoAsync no system permission");
                pm0.v.X(new lx.a1(lVar));
                return;
            }
            if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f227167r)) {
                kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new lx.e1(this, lVar, null), 2, null);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizLocationPlugin", "fetchBizPOIInfoAsync no business permission");
                pm0.v.X(new lx.b1(lVar));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FlutterBizLocationPlugin", "fetchBizPOIInfoAsync outer fail e:%s", e17.getMessage());
            pm0.v.X(new lx.f1(lVar));
        }
    }

    public final void c() {
        if (a()) {
            long isOpenK1kLocation = isOpenK1kLocation();
            long isOpenSystemLocation = isOpenSystemLocation();
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizLocationPlugin", "fetchBizPOIInfoWhenEnter");
            b(new lx.h1(this, isOpenK1kLocation, isOpenSystemLocation));
        }
    }

    public final void d(yz5.l lVar) {
        android.app.Activity activity = this.f321927d;
        if (activity == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizLocationPlugin", "activity is null");
            lVar.invoke(java.lang.Boolean.FALSE);
            return;
        }
        d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
        d85.g0 g0Var = d85.g0.LOCAION;
        d85.f0 f0Var = d85.f0.f227167r;
        if (((d85.d1) m0Var).Ri(g0Var, f0Var)) {
            lVar.invoke(java.lang.Boolean.TRUE);
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizLocationPlugin", "already has business location permission");
            return;
        }
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Bi(activity, g0Var, f0Var, new lx.m1(this, lVar))) {
            return;
        }
        lVar.invoke(java.lang.Boolean.TRUE);
    }

    @Override // com.tencent.pigeon.biz.BizLocationApi
    public void getBizPOIInfo(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        b(new lx.i1(callback));
    }

    @Override // com.tencent.pigeon.biz.BizLocationApi
    public void getCacheLocationInfo(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (!i95.n0.h(u60.g.class)) {
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).q(new lx.k1(this, callback));
    }

    @Override // com.tencent.pigeon.biz.BizLocationApi
    public com.tencent.pigeon.biz.BizUserLocationInfo getUserLocation() {
        long isOpenK1kLocation = isOpenK1kLocation();
        long isOpenSystemLocation = isOpenSystemLocation();
        com.tencent.pigeon.biz.BizUserLocationInfo bizUserLocationInfo = this.f321930g;
        return bizUserLocationInfo == null ? new com.tencent.pigeon.biz.BizUserLocationInfo(java.lang.Double.valueOf(0.0d), java.lang.Double.valueOf(0.0d), "", java.lang.Long.valueOf(isOpenK1kLocation), java.lang.Long.valueOf(isOpenSystemLocation)) : bizUserLocationInfo;
    }

    @Override // com.tencent.pigeon.biz.BizLocationApi
    public void gotoSystemLocationSettings(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        android.content.Context context = this.f321927d;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS", android.net.Uri.parse("package:" + context.getPackageName()));
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        if (com.tencent.mm.sdk.platformtools.t8.I0(context, intent, true, false)) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/brandservice/flutter/model/FlutterBizLocationPlugin", "gotoSystemLocationSettings", "(Lkotlin/jvm/functions/Function1;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/feature/brandservice/flutter/model/FlutterBizLocationPlugin", "gotoSystemLocationSettings", "(Lkotlin/jvm/functions/Function1;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FlutterBizLocationPlugin", e17, "gotoSystemLocationSettings startActivity failed", new java.lang.Object[0]);
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.FlutterBizLocationPlugin", "gotoSystemLocationSettings intent not available");
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
    }

    @Override // com.tencent.pigeon.biz.BizLocationApi
    public long isOpenK1kLocation() {
        return ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f227167r) ? 1L : 0L;
    }

    @Override // com.tencent.pigeon.biz.BizLocationApi
    public long isOpenSystemLocation() {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = this.f321927d;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        ((sb0.f) jVar).getClass();
        return j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", true) ? 1L : 0L;
    }

    @Override // com.tencent.pigeon.biz.BizLocationApi
    public void isUnderFreqControl(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long q17 = com.tencent.mm.sdk.platformtools.o4.R("__flutter_biz_mmkv__").q(gm0.j1.b().j() + "_biz_wesee_last_fetch_poi_time_ms", 0L);
        boolean z17 = q17 <= 0 || (currentTimeMillis > q17 && currentTimeMillis - q17 >= 3600000);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizLocationPlugin", "isUnderFreqControl now=" + currentTimeMillis + " last=" + q17 + " delta=" + (currentTimeMillis > q17 ? currentTimeMillis - q17 : 0L) + " canFetch=" + z17);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17))));
    }

    @Override // com.tencent.pigeon.biz.BizLocationApi
    public void markLastGetPOITime(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.sdk.platformtools.o4.R("__flutter_biz_mmkv__").B(gm0.j1.b().j() + "_biz_wesee_last_fetch_poi_time_ms", currentTimeMillis);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("markLastGetPOITime now=");
        sb6.append(currentTimeMillis);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizLocationPlugin", sb6.toString());
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f321927d = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        com.tencent.pigeon.biz.BizLocationCallbackApi bizLocationCallbackApi;
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizLocationPlugin", "onAttachedToEngine");
        com.tencent.pigeon.biz.BizLocationApi.Companion companion = com.tencent.pigeon.biz.BizLocationApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizLocationApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f321928e = new com.tencent.pigeon.biz.BizLocationCallbackApi(binaryMessenger2, null, 2, null);
        this.f321929f = new eq1.u();
        com.tencent.pigeon.biz.BizUserLocationInfo bizUserLocationInfo = this.f321930g;
        if (bizUserLocationInfo == null || (bizLocationCallbackApi = this.f321928e) == null) {
            return;
        }
        bizLocationCallbackApi.onPOIFetched(bizUserLocationInfo, java.lang.System.currentTimeMillis(), lx.l1.f321845d);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f321927d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f321927d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizLocationPlugin", "onDetachedFromEngine");
        com.tencent.pigeon.biz.BizLocationApi.Companion companion = com.tencent.pigeon.biz.BizLocationApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizLocationApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.f321928e = null;
        eq1.u uVar = this.f321929f;
        if (uVar != null) {
            uVar.a();
        }
        this.f321929f = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f321927d = binding.getActivity();
    }

    @Override // com.tencent.pigeon.biz.BizLocationApi
    public void requestLocationAuth(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.f321927d == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizLocationPlugin", "activity is null");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
            return;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.app.Activity activity = this.f321927d;
        ((sb0.f) jVar).getClass();
        if (j35.u.d(activity, "android.permission.ACCESS_FINE_LOCATION", true)) {
            d(new lx.n1(callback));
            return;
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizLocationPlugin", "missing system location permission");
    }

    @Override // com.tencent.pigeon.biz.BizLocationApi
    public void requestLocationWithSystemAuth(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.f321927d == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizLocationPlugin", "activity is null");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
        } else {
            lx.q1 q1Var = new lx.q1(callback, this);
            if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(this.f321927d, "android.permission.ACCESS_FINE_LOCATION", 155, "", "", q1Var)) {
                d(new lx.o1(callback));
            }
        }
    }
}
