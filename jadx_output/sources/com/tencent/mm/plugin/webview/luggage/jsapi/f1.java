package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class f1 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "getLocalImgData";
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
        java.lang.String optString = bVar.f406597b.f344506c.optString(dm.i4.COL_LOCALID);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetLocalImgData", "localId is nil");
            bVar.c("invaild_localid", null);
        } else {
            com.tencent.mm.ipcinvoker.type.IPCString iPCString = new com.tencent.mm.ipcinvoker.type.IPCString();
            iPCString.f68406d = optString;
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, iPCString, com.tencent.mm.plugin.webview.luggage.jsapi.e1.class, new com.tencent.mm.plugin.webview.luggage.jsapi.d1(this, bVar));
        }
    }
}
