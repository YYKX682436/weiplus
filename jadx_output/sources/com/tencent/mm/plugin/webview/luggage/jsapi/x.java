package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class x extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "batchViewCard";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("card_list");
            java.lang.String optString2 = jSONObject.optString("tempalate_id");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("card_list", optString);
            intent.putExtra("key_template_id", optString2);
            intent.putExtra("key_from_scene", 7);
            ((com.tencent.mm.ui.MMActivity) context).mmSetOnActivityResultCallback(new com.tencent.mm.plugin.webview.luggage.jsapi.w(this, q5Var));
            j45.l.o(context, "card", ".ui.CardViewEntranceUI", intent, hashCode() & 65535, false);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiBatchViewCard", "paras data error: " + e17.getMessage());
            q5Var.a("fail", null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
