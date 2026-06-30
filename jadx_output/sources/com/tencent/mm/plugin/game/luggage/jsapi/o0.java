package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f139722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.p0 f139723e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139724f;

    public o0(org.json.JSONObject jSONObject, com.tencent.mm.plugin.game.luggage.jsapi.p0 p0Var, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f139722d = jSONObject;
        this.f139723e = p0Var;
        this.f139724f = q5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.game.luggage.jsapi.p0 p0Var = this.f139723e;
        com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f139724f;
        org.json.JSONObject jSONObject = this.f139722d;
        if (jSONObject == null) {
            com.tencent.mm.plugin.game.luggage.jsapi.p0.f(p0Var, q5Var);
            return;
        }
        java.lang.String optString = jSONObject.optString("videoId");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mm.plugin.game.luggage.jsapi.p0.f(p0Var, q5Var);
            return;
        }
        m33.g1 mj6 = ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).mj(optString);
        if (mj6 == null) {
            q5Var.a(null, null);
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put(p0Var.g(mj6));
        jSONObject2.put("result", jSONArray);
        q5Var.a(null, jSONObject2);
    }
}
