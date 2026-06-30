package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class e4 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "setFontSizeCallback";
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
        int optInt = bVar.f406597b.f344506c.optInt("fontSize");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.luggage.jsapi.d4(this, bVar, optInt));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetFrontSizeCallback", "doSetFontSizeCb, fontSize = " + optInt);
        bVar.a();
    }
}
