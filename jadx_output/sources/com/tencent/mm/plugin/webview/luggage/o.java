package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.r f182583d;

    public o(com.tencent.mm.plugin.webview.luggage.r rVar) {
        this.f182583d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.luggage.r rVar = this.f182583d;
        if (!rVar.f182608h || rVar.f182606f) {
            return;
        }
        int webScrollY = rVar.f182604d.getWebScrollY();
        com.tencent.mm.plugin.webview.luggage.r rVar2 = this.f182583d;
        if (rVar2.f182610m != webScrollY) {
            rVar2.f182610m = webScrollY;
            rVar2.post(new com.tencent.mm.plugin.webview.luggage.n(this));
            ((ku5.t0) ku5.t0.f312615d).k(this.f182583d.f182609i, 100L);
        }
    }
}
