package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public final class u5 implements m33.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.x5 f139750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139751b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139752c;

    public u5(com.tencent.mm.plugin.game.luggage.jsapi.x5 x5Var, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f139750a = x5Var;
        this.f139751b = str;
        this.f139752c = q5Var;
    }

    public void a(java.lang.String str) {
        this.f139750a.getClass();
        com.tencent.mars.xlog.Log.e("uploadMiniGameVideoToShare", "gamelog.jsapi, web , uploadMiniGameVideoToShare, error videoId = " + this.f139751b + ", errorMsg = " + str);
        this.f139752c.a(str, null);
    }
}
