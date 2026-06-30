package u64;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final u64.p f425023a = new u64.p();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f425024b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f425025c = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f425026d = new java.util.LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.List f425027e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f425028f = new java.util.LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final kotlinx.coroutines.r0 f425029g;

    static {
        int i17 = kotlinx.coroutines.r0.N0;
        f425029g = new u64.n(kotlinx.coroutines.q0.f310567d);
    }

    public static final /* synthetic */ java.util.Map a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPullAdReqStateMap$p", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        java.util.Map map = f425025c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPullAdReqStateMap$p", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        return map;
    }

    public static final /* synthetic */ java.util.Map b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTimelineReqStateMap$p", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        java.util.Map map = f425024b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTimelineReqStateMap$p", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        return map;
    }

    public static final void c(java.lang.String str, jz5.l state) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emitAdPullReqState", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        kotlin.jvm.internal.o.g(state, "state");
        com.tencent.mars.xlog.Log.i("AdPullRequestHelper", "emitAdPullReqState() called with: uuid = " + str + ", state = " + ((java.lang.Boolean) state.f302833d).booleanValue());
        if (str == null) {
            str = "";
        }
        java.util.Map map = f425025c;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    kotlinx.coroutines.flow.j2 j2Var = (kotlinx.coroutines.flow.j2) ((java.util.LinkedHashMap) map).get(str);
                    if (j2Var != null) {
                        ((kotlinx.coroutines.flow.h3) j2Var).k(state);
                    }
                } else {
                    map.put(str, kotlinx.coroutines.flow.i3.a(state));
                }
            } finally {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emitAdPullReqState", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            }
        }
    }

    public static final void d(java.lang.String str, jz5.l state) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emitTimelineReqState", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        kotlin.jvm.internal.o.g(state, "state");
        com.tencent.mars.xlog.Log.i("AdPullRequestHelper", "emitTimelineRequestState() called with: uuid = " + str + ", state = " + ((java.lang.Boolean) state.f302833d).booleanValue());
        if (str == null) {
            str = "";
        }
        java.util.Map map = f425024b;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    kotlinx.coroutines.flow.j2 j2Var = (kotlinx.coroutines.flow.j2) ((java.util.LinkedHashMap) map).get(str);
                    if (j2Var != null) {
                        ((kotlinx.coroutines.flow.h3) j2Var).k(state);
                    }
                } else {
                    map.put(str, kotlinx.coroutines.flow.i3.a(state));
                }
            } finally {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emitTimelineReqState", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            }
        }
    }

    public final com.tencent.mm.plugin.sns.storage.ADInfo e(r45.g5 g5Var) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.storage.ADInfo aDInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdInfoObj", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        kotlin.jvm.internal.o.g(g5Var, "<this>");
        r45.du5 du5Var = g5Var.f374886e;
        if (du5Var == null || (str = du5Var.f372756d) == null) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("AdPullRequestHelper", "adinfoStr len = " + str.length());
        java.util.Map map = f425028f;
        synchronized (map) {
            try {
                aDInfo = (com.tencent.mm.plugin.sns.storage.ADInfo) ((java.util.LinkedHashMap) map).get(str);
                if (aDInfo == null) {
                    aDInfo = new com.tencent.mm.plugin.sns.storage.ADInfo(str);
                    map.put(str, aDInfo);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfoObj", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfoObj", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        return aDInfo;
    }

    public final r45.g5 f(jz5.l lVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdPullObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        r45.n76 n76Var = (r45.n76) lVar.f302834e;
        java.util.LinkedList linkedList = n76Var != null ? n76Var.f381141d : null;
        if (linkedList == null || linkedList.size() < 1) {
            com.tencent.mars.xlog.Log.i("AdPullRequestHelper", "AdPullReq  has no adobj!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdPullObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            return null;
        }
        r45.g5 g5Var = (r45.g5) linkedList.get(0);
        if (g5Var == null) {
            com.tencent.mars.xlog.Log.i("AdPullRequestHelper", "adPull adobj is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdPullObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            return null;
        }
        com.tencent.mars.xlog.Log.i("AdPullRequestHelper", "adPull has adobj~");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdPullObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        return g5Var;
    }

    public final java.lang.String g(r45.g5 g5Var) {
        com.tencent.mm.protocal.protobuf.SnsObject snsObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        r45.f76 f76Var = g5Var.f374885d;
        java.lang.String t07 = ca4.z0.t0((f76Var == null || (snsObject = f76Var.f374076d) == null) ? 0L : snsObject.Id);
        com.tencent.mars.xlog.Log.i("AdPullRequestHelper", "AdvertiseList getSnsId = " + t07);
        kotlin.jvm.internal.o.f(t07, "also(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        return t07;
    }

    public final r45.g5 h(jz5.l lVar) {
        r45.f76 f76Var;
        com.tencent.mm.protocal.protobuf.SnsObject snsObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTlObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        r45.ua6 ua6Var = (r45.ua6) lVar.f302834e;
        java.util.LinkedList linkedList = ua6Var != null ? ua6Var.f387176o : null;
        if (linkedList == null || linkedList.size() < 1) {
            com.tencent.mars.xlog.Log.i("AdPullRequestHelper", "tlResult has no adobj!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTlObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            return null;
        }
        r45.g5 g5Var = (r45.g5) linkedList.get(0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tlResult orgAd Id is ");
        sb6.append((g5Var == null || (f76Var = g5Var.f374885d) == null || (snsObject = f76Var.f374076d) == null) ? null : java.lang.Long.valueOf(snsObject.Id));
        com.tencent.mars.xlog.Log.i("AdPullRequestHelper", sb6.toString());
        if (g5Var == null) {
            com.tencent.mars.xlog.Log.i("AdPullRequestHelper", "tlResult adObj is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTlObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            return null;
        }
        com.tencent.mars.xlog.Log.i("AdPullRequestHelper", "tlResult has obj~");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTlObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        return g5Var;
    }

    public final boolean i(java.lang.String str) {
        boolean b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExposed", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        if (str == null) {
            com.tencent.mars.xlog.Log.e("AdPullRequestHelper", "this is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExposed", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            return false;
        }
        java.util.Map map = f425026d;
        synchronized (map) {
            try {
                b17 = kotlin.jvm.internal.o.b(((java.util.LinkedHashMap) map).get(str), java.lang.Boolean.TRUE);
                com.tencent.mars.xlog.Log.i("AdPullRequestHelper", "isExposed " + str + " = " + b17);
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExposed", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExposed", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        return b17;
    }

    public final java.lang.String j(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("urlEncode", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        java.lang.String b17 = fp.s0.b(str, com.tencent.mapsdk.internal.rv.f51270c);
        kotlin.jvm.internal.o.f(b17, "encode(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("urlEncode", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        return b17;
    }
}
