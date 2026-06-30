package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class m2 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "openBizChat";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString(dm.i4.COL_USERNAME);
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                q5Var.a("param_err", null);
                return;
            }
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(optString, true);
            if (n17 == null || !n17.k2()) {
                q5Var.a("not biz username", null);
                return;
            }
            if (!n17.r2()) {
                q5Var.a("open_biz_chat", null);
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", optString);
            intent.putExtra("finish_direct", true);
            j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
            q5Var.a(null, null);
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenBizChat", "parase json fail");
            q5Var.a("fail", null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
