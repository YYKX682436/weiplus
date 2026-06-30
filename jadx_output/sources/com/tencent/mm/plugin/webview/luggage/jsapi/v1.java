package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class v1 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "jumpToBizProfile";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("tousername");
            java.lang.String optString2 = jSONObject.optString("extmsg");
            java.lang.String optString3 = jSONObject.optString("currentUrl");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("toUserName", optString);
            intent.putExtra("extInfo", optString2);
            intent.putExtra("fromURL", optString3);
            intent.putExtra(ya.b.SOURCE, 2);
            com.tencent.mm.plugin.webview.luggage.jsapi.u1 u1Var = new com.tencent.mm.plugin.webview.luggage.jsapi.u1(this, q5Var);
            o25.t1 t1Var = dw4.a.f244297a;
            int hashCode = hashCode() & 65535;
            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
            ((com.tencent.mm.app.y7) t1Var).getClass();
            if (mMActivity != null) {
                intent.setClassName(mMActivity, "com.tencent.mm.ui.CheckCanSubscribeBizUI");
                mMActivity.mmStartActivityForResult((com.tencent.mm.ui.da) u1Var, intent, hashCode);
            }
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiJumpToBizProfile", "parase json fail");
            q5Var.a("fail", null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
