package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class k implements vz.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f182375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g02.c f182376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182377c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.l f182378d;

    public k(com.tencent.mm.plugin.webview.luggage.jsapi.l lVar, boolean z17, g02.c cVar, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f182378d = lVar;
        this.f182375a = z17;
        this.f182376b = cVar;
        this.f182377c = q5Var;
    }

    @Override // vz.z1
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        boolean z17 = this.f182375a;
        com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f182377c;
        if (z17) {
            com.tencent.mm.plugin.webview.luggage.jsapi.l.f(this.f182378d, str, jSONObject, this.f182376b, q5Var);
        } else {
            q5Var.a(str, jSONObject);
        }
    }
}
