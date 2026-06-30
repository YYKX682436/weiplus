package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class z1 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "openFinderPostView";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderPostView", "invokeInMM");
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            q5Var.a("invalid_params", null);
            return;
        }
        try {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f460472a.v(context, e17.toString(), 1, new com.tencent.mm.plugin.game.luggage.jsapi.y1(this));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("code", 100);
                jSONObject.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "post successful");
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiOpenFinderPostView", e18, "OpenFinderPostViewTask exception", new java.lang.Object[0]);
            }
            q5Var.a(null, jSONObject);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiOpenFinderPostView", e19, "OpenFinderPostViewTask exception", new java.lang.Object[0]);
            q5Var.a("post cancel", null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
