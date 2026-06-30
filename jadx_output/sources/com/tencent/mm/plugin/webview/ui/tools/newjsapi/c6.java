package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes7.dex */
public final class c6 implements zq1.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f186008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f186009b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f186010c;

    public c6(long j17, android.os.Bundle bundle, com.tencent.mm.ipcinvoker.r rVar) {
        this.f186008a = j17;
        this.f186009b = bundle;
        this.f186010c = rVar;
    }

    @Override // zq1.h0
    public void a(java.util.List list) {
        jx3.f.INSTANCE.w(1454L, 191L, 1L);
        zq1.m0 m0Var = (zq1.m0) gm0.j1.s(zq1.m0.class);
        long j17 = this.f186008a;
        ((yq1.x0) m0Var).getClass();
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3 b3Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3.f94192a;
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.brandservice.ui.timeline.preload.a3(j17), "MicroMsg.WebPrefetcherCallbackManager");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                zq1.k0 k0Var = (zq1.k0) it.next();
                int i17 = k0Var.f475010b;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                zq1.i0 i0Var = k0Var.f475009a;
                java.lang.String str = i0Var != null ? i0Var.f474983a : null;
                if (str == null) {
                    str = "";
                }
                jSONObject.put("url", str);
                jSONObject.put("result", k0Var.f475010b);
                jSONArray.put(jSONObject);
            }
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOnWebPageUrlExposed", "onPrefetchResult result: %s", jSONArray2);
        android.os.Bundle bundle = this.f186009b;
        bundle.putString("url_result", jSONArray2);
        com.tencent.mm.ipcinvoker.r rVar = this.f186010c;
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}
