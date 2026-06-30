package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class q4 extends com.tencent.mm.plugin.webview.luggage.jsapi.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd.b f182442a;

    public q4(com.tencent.mm.plugin.webview.luggage.jsapi.j4 j4Var, sd.b bVar) {
        this.f182442a = bVar;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.q5
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        this.f182442a.c(str, null);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.q5
    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
        if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ij()) {
            sd.b bVar = this.f182442a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(bVar.f406597b.f344506c.optString("liteAppId")) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            if (jSONObject == null) {
                jSONObject = new org.json.JSONObject();
            }
            com.tencent.mm.plugin.lite.LiteAppCenter.dispatchStore(bVar.f406597b.f344506c.optString("liteAppId"), str, jSONObject);
        }
    }
}
