package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class l2 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd.b f139708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.j2 f139709b;

    public l2(com.tencent.mm.plugin.game.luggage.jsapi.j2 j2Var, sd.b bVar) {
        this.f139709b = j2Var;
        this.f139708a = bVar;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "openLiteApp failed");
        this.f139709b.f(this.f139708a);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "openLiteApp success");
        this.f139708a.a();
    }
}
