package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class d4 extends com.tencent.mm.plugin.webview.luggage.jsapi.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.e4 f139618a;

    public d4(com.tencent.mm.plugin.game.luggage.jsapi.e4 e4Var) {
        this.f139618a = e4Var;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.q5
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.game.luggage.jsapi.e4 e4Var = this.f139618a;
        if (jSONObject != null) {
            e4Var.f139631a.putString("ret", jSONObject.toString());
        } else {
            e4Var.f139631a.putBoolean(ya.b.SUCCESS, false);
            e4Var.f139631a.putString(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_MSG, str);
        }
        e4Var.f139632b.a(e4Var.f139631a);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.q5
    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
    }
}
