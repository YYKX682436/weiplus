package sg0;

@j95.b
/* loaded from: classes8.dex */
public final class w2 extends jm0.o implements tg0.r1 {

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f407851o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Long f407853q;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f407849m = jz5.h.b(sg0.k2.f407740d);

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f407850n = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f407852p = new java.util.LinkedHashMap();

    public static final java.util.Map Zi(sg0.w2 w2Var, int i17, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, boolean z19, java.lang.String str3, java.util.Map map, boolean z27) {
        w2Var.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(i17));
        linkedHashMap.put("useFlutterSearchBar", java.lang.Boolean.valueOf(z17));
        linkedHashMap.put("searchDirectly", java.lang.Boolean.valueOf(z18));
        linkedHashMap.put("searchBarHintText", str2);
        linkedHashMap.put("searchBarText", str);
        linkedHashMap.put("searchDirectlyAddToKvHistory", java.lang.Boolean.valueOf(z19));
        linkedHashMap.put("searchParams", str3);
        if (map == null) {
            map = new java.util.LinkedHashMap();
        }
        linkedHashMap.put("searchDirectlyCgiParams", java.lang.String.valueOf(ri.l0.a(map)));
        linkedHashMap.put("isHalfScreen", java.lang.Boolean.valueOf(z27));
        return linkedHashMap;
    }

    public static final sg0.j2 aj(sg0.w2 w2Var) {
        w2Var.getClass();
        return new sg0.j2(new com.tencent.mm.plugin.websearch.m2(), new com.tencent.mm.plugin.websearch.FlutterSearchFinderVideoPlayerPlugin(), new com.tencent.mm.plugin.websearch.FlutterSearchFinderLivePlayerPlugin(), new zc.b0());
    }

    public static final com.tencent.mm.plugin.websearch.m2 bj(sg0.w2 w2Var, java.lang.Long l17) {
        sg0.j2 j2Var;
        if (l17 == null) {
            l17 = w2Var.f407853q;
        } else {
            w2Var.getClass();
        }
        if (l17 != null) {
            l17.longValue();
            sg0.i2 i2Var = (sg0.i2) ((java.util.LinkedHashMap) w2Var.f407852p).get(l17);
            if (i2Var != null && (j2Var = i2Var.f407723a) != null) {
                return j2Var.f407733a;
            }
        }
        return null;
    }

    public static final java.util.List cj(sg0.w2 w2Var, sg0.j2 j2Var) {
        w2Var.getClass();
        java.util.List Ai = ((r03.e) ((s03.g) i95.n0.c(s03.g.class))).Ai();
        java.util.List k17 = kz5.c0.k(new ev4.c(), j2Var.f407733a, j2Var.f407734b, j2Var.f407735c, j2Var.f407736d);
        k17.addAll(Ai);
        return k17;
    }

    public static final ou4.d0 fj(sg0.w2 w2Var) {
        ou4.d0 d0Var;
        java.lang.String str = w2Var.f407851o;
        if (str == null) {
            return null;
        }
        w2Var.f407851o = null;
        ou4.e0 hj6 = w2Var.hj();
        if (hj6 != null) {
            ou4.x xVar = (ou4.x) ((jz5.n) ((ou4.z) hj6).f349040d).getValue();
            xVar.getClass();
            d0Var = (ou4.d0) xVar.f349037b.get(str);
        } else {
            d0Var = null;
        }
        if (d0Var == null || ((ou4.s) d0Var).f349027k) {
            com.tencent.mars.xlog.Log.w("MicroMsg.hitest.WebSearchFlutterService", "takePreloadedContainer: preloaded container not found or destroyed");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.hitest.WebSearchFlutterService", "takePreloadedContainer: reusing containerId=".concat(str));
        return d0Var;
    }

    public final ou4.e0 hj() {
        return (ou4.e0) ((jz5.n) this.f407849m).getValue();
    }

    public void ij(java.lang.String exportId, java.lang.Long l17) {
        kotlin.jvm.internal.o.g(exportId, "exportId");
        kotlinx.coroutines.y0 b17 = kotlinx.coroutines.z0.b();
        kotlinx.coroutines.l.d(b17, null, null, new sg0.n2(this, l17, exportId, b17, null), 3, null);
    }

    public void mj(java.lang.String totalText, java.lang.String inEditText, java.lang.Long l17) {
        kotlin.jvm.internal.o.g(totalText, "totalText");
        kotlin.jvm.internal.o.g(inEditText, "inEditText");
        kotlinx.coroutines.y0 b17 = kotlinx.coroutines.z0.b();
        kotlinx.coroutines.l.d(b17, null, null, new sg0.p2(this, l17, totalText, inEditText, b17, null), 3, null);
    }

    public void nj(boolean z17, java.lang.Long l17) {
        kotlinx.coroutines.y0 b17 = kotlinx.coroutines.z0.b();
        kotlinx.coroutines.l.d(b17, null, null, new sg0.s2(this, l17, z17, b17, null), 3, null);
    }

    public final java.util.List oj(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            c75.c.d(new org.json.JSONArray(str), new sg0.t2(arrayList));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.hitest.WebSearchFlutterService", th6, "parse extReqParamsStr fail %s", str);
        }
        return arrayList;
    }

    @Override // jm0.o, i95.w
    public void onCreate(android.content.Context context) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.hitest.WebSearchFlutterService", "onCreate");
        super.onCreate(context);
        ou4.e0 hj6 = hj();
        if (hj6 != null) {
            ou4.o oVar = new ou4.o("websearch", ya.a.SEARCH, "home", null, null, false, null, 112, null);
            com.tencent.mars.xlog.Log.i("FlutterContainerService", "registerBusiness: businessId=".concat("websearch"));
            ou4.x xVar = (ou4.x) ((jz5.n) ((ou4.z) hj6).f349040d).getValue();
            xVar.getClass();
            com.tencent.mars.xlog.Log.i("FlutterContainerManager", "registerBusiness: businessId=".concat("websearch"));
            xVar.f349036a.put("websearch", oVar);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.hitest.WebSearchFlutterService", "IFlutterContainerService not available, skip registerBusiness");
        }
        try {
            i95.n0.c(tg0.l1.class);
            com.tencent.wechat.aff.websearch.WebSearchManager.getInstance();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.hitest.WebSearchFlutterService", "WebSearchManager init failed", e17);
        }
    }
}
