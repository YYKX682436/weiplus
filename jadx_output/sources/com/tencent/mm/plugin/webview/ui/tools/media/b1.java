package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.media.b1 f185746a = new com.tencent.mm.plugin.webview.ui.tools.media.b1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f185747b;

    static {
        i95.n0.c(qk.g9.class);
        f185747b = new java.util.HashMap();
    }

    public final void a(java.util.HashMap retValue) {
        kotlin.jvm.internal.o.g(retValue, "retValue");
        b66.h hVar = b66.i.f18167d;
        b66.g gVar = (b66.g) urgen.ur_2BA9.UR_882D.UR_EC54("webSearchStandAlone");
        if (gVar == null) {
            return;
        }
        b66.i iVar = (b66.i) gVar;
        b66.n a17 = iVar.a();
        bw5.lp0 g17 = a17 != null ? ((b66.q) a17).g() : null;
        b66.n a18 = iVar.a();
        if (a18 == null || g17 == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String b17 = g17.b();
        if (b17 == null) {
            b17 = "";
        }
        jSONObject.put("srcId", b17);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        retValue.put("item", jSONObject2);
        retValue.put("currentTime", java.lang.Long.valueOf(a18.m()));
        retValue.put("buffered", java.lang.Long.valueOf(a18.E()));
        retValue.put("duration", java.lang.Long.valueOf(a18.k()));
        retValue.put("playRate", java.lang.Float.valueOf(a18.h()));
        retValue.put("status", rk4.m.f396834a.a(qk.ia.f364169e.a(a18.i())));
    }
}
