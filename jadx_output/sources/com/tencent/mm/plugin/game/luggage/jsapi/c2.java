package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class c2 implements m33.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139602a;

    public c2(com.tencent.mm.plugin.game.luggage.jsapi.d2 d2Var, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f139602a = q5Var;
    }

    @Override // m33.h1
    public void a(java.util.Map map) {
        com.tencent.mars.xlog.Log.i("JsApiOpenGameDetail", "JsApiOpenGameDetail success");
        this.f139602a.a(null, null);
    }

    @Override // m33.h1
    public void b(java.util.Map map) {
        com.tencent.mars.xlog.Log.i("JsApiOpenGameDetail", "JsApiOpenGameDetail fail");
        this.f139602a.a("openGameDetail:fail, " + map.get("error"), null);
    }
}
