package dm4;

/* loaded from: classes11.dex */
public final class b implements com.tencent.pigeon.ting.TingEmbedApi, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: g, reason: collision with root package name */
    public static com.tencent.pigeon.ting.TingEmbedCallbackApi f241755g;

    /* renamed from: d, reason: collision with root package name */
    public final int f241756d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f241757e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Activity f241758f;

    public b(int i17) {
        this.f241756d = i17;
    }

    @Override // com.tencent.pigeon.ting.TingEmbedApi
    public com.tencent.pigeon.ting.FinderProfileReportParams getFinderProfileDynamicReportParams() {
        jz5.l[] lVarArr = new jz5.l[3];
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        lVarArr[0] = new jz5.l("behaviour_session_id", Ri);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", b17);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        lVarArr[2] = new jz5.l("finder_tab_context_id", c17 != null ? c17 : "");
        return new com.tencent.pigeon.ting.FinderProfileReportParams(kz5.c1.k(lVarArr));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f241758f = p07.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.pigeon.ting.TingEmbedApi.Companion companion = com.tencent.pigeon.ting.TingEmbedApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ting.TingEmbedApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        this.f241757e = p07.getApplicationContext();
        if (this.f241756d == 0) {
            io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = p07.getBinaryMessenger();
            kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
            f241755g = new com.tencent.pigeon.ting.TingEmbedCallbackApi(binaryMessenger2, null, 2, null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f241758f = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.pigeon.ting.TingEmbedApi.Companion companion = com.tencent.pigeon.ting.TingEmbedApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ting.TingEmbedApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.f241757e = null;
        if (this.f241756d == 0) {
            f241755g = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // com.tencent.pigeon.ting.TingEmbedApi
    public void openCategoryItem(byte[] categoryItem, byte[] bArr, long j17) {
        java.lang.String str;
        android.content.Intent intent;
        kotlin.jvm.internal.o.g(categoryItem, "categoryItem");
        int i17 = (int) j17;
        boolean z17 = i17 == 600;
        android.app.Activity activity = this.f241758f;
        if (activity == null || (intent = activity.getIntent()) == null || (str = intent.getStringExtra("finder_username")) == null) {
            str = "";
        }
        il4.e eVar = new il4.e(null, 0, i17, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null);
        il4.f fVar = eVar.f292122s;
        fVar.f292132d.put("finderusername", str);
        fVar.f292131c = z17;
        android.content.Context context = this.f241757e;
        if (context != null) {
            qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            qk.ja jaVar = qk.ja.f364192e;
            rk4.k8 k8Var = (rk4.k8) aj6;
            try {
                bw5.o50 parseFrom = new bw5.o50().parseFrom(categoryItem);
                kotlin.jvm.internal.o.d(parseFrom);
                bw5.ar0 i18 = bw5.ar0.i(i17);
                if (i18 == null) {
                    i18 = bw5.ar0.TingScene_UnDefined;
                }
                qk.f9.d(k8Var, context, parseFrom, null, jaVar, i18, eVar, null, bArr, null, null, false, 1792, null);
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TingRouter", "consumeCategoryItemBuffer parse error");
            }
        }
    }

    @Override // com.tencent.pigeon.ting.TingEmbedApi
    public void openFinderDiscover(byte[] discoverLineData, java.lang.String finderUsername, byte[] bArr) {
        kotlin.jvm.internal.o.g(discoverLineData, "discoverLineData");
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        android.content.Context context = this.f241757e;
        if (context != null) {
            rk4.k8 k8Var = (rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            kotlinx.coroutines.l.d(k8Var, null, null, new rk4.a8(k8Var, discoverLineData, finderUsername, bArr, context, null), 3, null);
        }
    }

    @Override // com.tencent.pigeon.ting.TingEmbedApi
    public void openTingPage(java.lang.String pageUrl, com.tencent.pigeon.ting.OpenTingPageParams pageParams) {
        kotlin.jvm.internal.o.g(pageUrl, "pageUrl");
        kotlin.jvm.internal.o.g(pageParams, "pageParams");
        java.util.Map<java.lang.String, java.lang.Object> params = pageParams.getParams();
        java.lang.Object obj = params != null ? params.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE) : null;
        java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        int intValue = num != null ? num.intValue() : 0;
        com.tencent.mars.xlog.Log.i("Finder.FinderTingRouterPlugin_Flutter", "openTingPage scene " + intValue + ", pageUrl " + pageUrl);
        boolean z17 = intValue == 600;
        il4.e eVar = new il4.e(null, 0, intValue, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null);
        eVar.f292122s.f292131c = z17;
        android.content.Context context = this.f241757e;
        if (context != null) {
            rk4.k8 k8Var = (rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            bw5.ar0 i17 = bw5.ar0.i(eVar.f292106c);
            com.tencent.mars.xlog.Log.i("MicroMsg.TingRouter", "openTingPage enterScene: " + i17 + " pageUrl = " + pageUrl);
            if (i17 != null) {
                k8Var.M(i17);
            }
            il4.l.q(eVar, true, context, null, 8, null);
            kotlinx.coroutines.l.d(k8Var, null, null, new rk4.c8(k8Var, pageUrl, context, null), 3, null);
        }
    }

    @Override // com.tencent.pigeon.ting.TingEmbedApi
    public void openTingPageWithNewEngine(java.lang.String routeName, com.tencent.pigeon.ting.OpenTingPageParams params) {
        java.util.Map map;
        kotlin.jvm.internal.o.g(routeName, "routeName");
        kotlin.jvm.internal.o.g(params, "params");
        android.content.Context context = this.f241757e;
        if (context != null) {
            qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            java.util.Map<java.lang.String, java.lang.Object> params2 = params.getParams();
            if (params2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : params2.entrySet()) {
                    java.lang.String key = entry.getKey();
                    java.lang.Object value = entry.getValue();
                    jz5.l lVar = (key == null || value == null) ? null : new jz5.l(key, value);
                    if (lVar != null) {
                        arrayList.add(lVar);
                    }
                }
                map = kz5.c1.q(arrayList);
            } else {
                map = null;
            }
            ((rk4.k8) aj6).F(context, routeName, map, null);
        }
    }
}
