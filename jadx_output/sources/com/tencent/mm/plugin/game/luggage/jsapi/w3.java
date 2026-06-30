package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class w3 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "requestOverlayPermission";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        org.json.JSONObject jSONObject;
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (org.json.JSONException unused) {
            jSONObject = null;
        }
        java.lang.String optString = jSONObject != null ? jSONObject.optString("desc", com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492129fb2)) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492129fb2);
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("ret", 0);
            } catch (org.json.JSONException unused2) {
                jSONObject2 = null;
            }
            q5Var.a(null, jSONObject2);
            return;
        }
        com.tencent.mm.plugin.game.luggage.jsapi.v3 v3Var = new com.tencent.mm.plugin.game.luggage.jsapi.v3(this, q5Var);
        tb0.i iVar = (tb0.i) i95.n0.c(tb0.i.class);
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String a17 = n25.a.a();
        ((sb0.f) iVar).getClass();
        com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.S6(context2, optString, v3Var, true, a17);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
