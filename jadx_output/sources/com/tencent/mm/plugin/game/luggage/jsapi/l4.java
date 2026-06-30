package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class l4 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "sendGameNameCard";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        org.json.JSONObject jSONObject;
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (java.lang.Exception unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            q5Var.a("data is null", null);
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.jsapi.f9.a(jSONObject.optString("img_url"));
        com.tencent.mm.plugin.game.luggage.jsapi.k4 k4Var = new com.tencent.mm.plugin.game.luggage.jsapi.k4(this, 1, jSONObject, q5Var);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        n13.r rVar = new n13.r();
        rVar.f334117a = true;
        rVar.f334118b = 1;
        rVar.f334119c = k4Var;
        qc5.a aVar = new qc5.a();
        aVar.k(n13.v.f334140a.c(jSONObject.optString("card_image_url"), jSONObject.optString("card_desc"), jSONObject.optString("card_nick_name"), jSONObject.optString("card_tail"), jSONObject.optString("card_link"), new java.util.HashMap()));
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi((com.tencent.mm.ui.MMActivity) context, aVar, rVar);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
