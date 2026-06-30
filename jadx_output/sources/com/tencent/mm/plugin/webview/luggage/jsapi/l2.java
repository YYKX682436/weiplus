package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes7.dex */
public class l2 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "login";
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogin", "invoke");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.String b17 = ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).K.b();
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLogin", "appId is null!");
            bVar.c("fail", null);
            return;
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.k24 k24Var = new r45.k24();
        lVar.f70664a = k24Var;
        lVar.f70665b = new r45.l24();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/js-login";
        lVar.f70667d = 1029;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        k24Var.f378325d = b17;
        k24Var.f378326e = linkedList;
        k24Var.f378327f = 0;
        k24Var.f378328g = "";
        k24Var.f378329h = "";
        k24Var.f378330i = 0;
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new com.tencent.mm.plugin.webview.luggage.jsapi.j2(this, bVar, b17));
    }
}
