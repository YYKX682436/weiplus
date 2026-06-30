package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class r3 implements vz.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g02.c f182447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.v3 f182449c;

    public r3(com.tencent.mm.plugin.webview.luggage.jsapi.v3 v3Var, g02.c cVar, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f182449c = v3Var;
        this.f182447a = cVar;
        this.f182448b = q5Var;
    }

    @Override // vz.z1
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.webview.luggage.jsapi.v3.f(this.f182449c, str, jSONObject, this.f182447a, this.f182448b);
    }
}
