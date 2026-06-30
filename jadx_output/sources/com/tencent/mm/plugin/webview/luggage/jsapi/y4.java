package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class y4 implements uw4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f182524a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182525b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.z4 f182526c;

    public y4(com.tencent.mm.plugin.webview.luggage.jsapi.z4 z4Var, org.json.JSONObject jSONObject, java.lang.String str) {
        this.f182526c = z4Var;
        this.f182524a = jSONObject;
        this.f182525b = str;
    }

    @Override // uw4.o
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.webview.luggage.jsapi.z4 z4Var = this.f182526c;
        com.tencent.mm.plugin.webview.luggage.jsapi.j4 j4Var = z4Var.f182541g;
        com.tencent.mm.plugin.webview.luggage.jsapi.f5 f5Var = j4Var.f182360e;
        com.tencent.mm.plugin.webview.luggage.jsapi.f5 f5Var2 = com.tencent.mm.plugin.webview.luggage.jsapi.f5.GAME_SHARE_TYPE_IMG;
        org.json.JSONObject jSONObject2 = this.f182524a;
        if (f5Var == f5Var2) {
            j4Var.k(jSONObject2, z4Var.f182540f, new com.tencent.mm.plugin.webview.luggage.jsapi.w4(this, str));
        } else {
            org.json.JSONObject optJSONObject = jSONObject2.optJSONObject("friend");
            if (optJSONObject != null) {
                uw4.u.b(z4Var.f182540f, str, optJSONObject.optString("link"), optJSONObject, z4Var.f182539e, new com.tencent.mm.plugin.webview.luggage.jsapi.x4(this));
            }
        }
        com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 20, 2001, 2, 2, 0, this.f182525b);
    }
}
