package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class q0 implements kh0.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.r0 f139735a;

    public q0(com.tencent.mm.plugin.game.luggage.jsapi.r0 r0Var) {
        this.f139735a = r0Var;
    }

    @Override // kh0.f
    public void a(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("wepkg_info", jSONObject);
        } catch (org.json.JSONException unused) {
        }
        this.f139735a.f139741d.a(null, jSONObject2);
    }
}
