package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class l5 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "showOptionMenu";
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowOptionMenu", "invoke");
        com.tencent.mm.plugin.webview.luggage.y1 y1Var = ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f182186t;
        if (y1Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowOptionMenu", "actionBar is null");
            return;
        }
        for (com.tencent.mm.plugin.webview.luggage.menu.z zVar : y1Var.getMenuHelp().f182569a) {
            if (!zVar.f182574d) {
                zVar.f182573c = false;
            }
        }
        bVar.a();
    }
}
