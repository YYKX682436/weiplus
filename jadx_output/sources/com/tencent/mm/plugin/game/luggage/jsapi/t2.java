package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class t2 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.u2 f139745a;

    public t2(com.tencent.mm.plugin.game.luggage.jsapi.u2 u2Var) {
        this.f139745a = u2Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("JsApiOpenLiteApp", "jsApiOpenLiteApp fail");
        this.f139745a.f139748d.c("fail", null);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("JsApiOpenLiteApp", "jsApiOpenLiteApp success");
        this.f139745a.f139748d.a();
    }
}
