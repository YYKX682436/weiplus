package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class g extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "cancelHaowanPublish";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            q5Var.a("empty_postId", null);
            return;
        }
        if (e17.optBoolean("cancelAll")) {
            ((i53.d0) ((m33.n1) i95.n0.c(m33.n1.class))).Ai(null, true);
        } else {
            org.json.JSONArray optJSONArray = e17.optJSONArray("postIdList");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                q5Var.a("empty_postId", null);
                return;
            }
            ((i53.d0) ((m33.n1) i95.n0.c(m33.n1.class))).Ai(optJSONArray, false);
        }
        q5Var.a(null, null);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
