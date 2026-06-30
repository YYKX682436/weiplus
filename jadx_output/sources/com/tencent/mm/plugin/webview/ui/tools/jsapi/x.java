package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f185507e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f185508f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f185509g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nw4.k f185510h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185511i;

    public x(java.lang.String str, long j17, long j18, java.util.HashMap hashMap, nw4.k kVar, nw4.y2 y2Var) {
        this.f185506d = str;
        this.f185507e = j17;
        this.f185508f = j18;
        this.f185509g = hashMap;
        this.f185510h = kVar;
        this.f185511i = y2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        try {
            str = com.tencent.mm.plugin.webview.ui.tools.jsapi.b0.f(com.tencent.mm.plugin.webview.ui.tools.jsapi.b0.f184939d, this.f185506d, this.f185507e, this.f185508f);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiChoosePassport", e17, "choosePassport save original image error", new java.lang.Object[0]);
            str = null;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.jsapi.w(str, this.f185509g, this.f185506d, this.f185510h, this.f185511i));
    }
}
