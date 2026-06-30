package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes7.dex */
public class s extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return com.tencent.mm.plugin.appbrand.jsapi.auth.o1.NAME;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAuthorize", "invokeInOwn");
        org.json.JSONArray optJSONArray = bVar.f406597b.f344506c.optJSONArray("scope");
        if (optJSONArray == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAuthorize", "scope is null!");
            bVar.c("fail", null);
            return;
        }
        java.lang.String b17 = ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).K.b();
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAuthorize", "appId is null!");
            bVar.c("fail", null);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
            linkedList.add(optJSONArray.optString(i17));
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.g24 g24Var = new r45.g24();
        lVar.f70664a = g24Var;
        lVar.f70665b = new r45.h24();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/js-authorize";
        lVar.f70667d = 1157;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        g24Var.f374834d = b17;
        g24Var.f374835e = linkedList;
        g24Var.f374836f = 0;
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new com.tencent.mm.plugin.webview.luggage.jsapi.q(this, bVar, b17));
    }
}
