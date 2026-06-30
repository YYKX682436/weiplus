package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.x0 f182481e;

    public v0(com.tencent.mm.plugin.webview.luggage.jsapi.x0 x0Var, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f182481e = x0Var;
        this.f182480d = q5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f182481e.g(this.f182480d, "timeout");
    }
}
