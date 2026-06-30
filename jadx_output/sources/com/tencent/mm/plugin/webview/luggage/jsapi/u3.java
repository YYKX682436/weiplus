package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class u3 implements vz.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f182473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g02.c f182474b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182475c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.v3 f182476d;

    public u3(com.tencent.mm.plugin.webview.luggage.jsapi.v3 v3Var, boolean z17, g02.c cVar, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f182476d = v3Var;
        this.f182473a = z17;
        this.f182474b = cVar;
        this.f182475c = q5Var;
    }

    @Override // vz.z1
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        boolean z17 = this.f182473a;
        com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f182475c;
        if (z17) {
            com.tencent.mm.plugin.webview.luggage.jsapi.v3.f(this.f182476d, str, jSONObject, this.f182474b, q5Var);
        } else {
            q5Var.a(str, jSONObject);
        }
    }
}
