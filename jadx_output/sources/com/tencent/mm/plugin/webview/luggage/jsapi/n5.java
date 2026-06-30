package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes12.dex */
public class n5 implements com.tencent.mm.plugin.webview.luggage.jsapi.g6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd.b f182409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.l6 f182410b;

    public n5(com.tencent.mm.plugin.webview.luggage.jsapi.o5 o5Var, sd.b bVar, com.tencent.mm.plugin.webview.luggage.jsapi.l6 l6Var) {
        this.f182409a = bVar;
        this.f182410b = l6Var;
    }

    public void a(boolean z17, java.util.HashMap hashMap) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUploadMediaFile", "sucess = %b", java.lang.Boolean.valueOf(z17));
        sd.b bVar = this.f182409a;
        if (z17) {
            bVar.d(hashMap);
        } else {
            bVar.c("fail", null);
        }
        com.tencent.mm.plugin.webview.luggage.jsapi.l6 l6Var = this.f182410b;
        l6Var.f182386a = null;
        l6Var.f182387b = null;
        l6Var.f182388c = null;
        l6Var.f182389d = null;
        l6Var.f182391f = null;
    }
}
