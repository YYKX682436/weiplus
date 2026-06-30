package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public final class s extends com.tencent.mm.plugin.webview.core.f3 {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.ref.WeakReference f136922b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f136923c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f136924d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.stub.b f136925e = new com.tencent.mm.plugin.webview.stub.b();

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void b(int i17, java.lang.String reqUrl, int i18, int i19, java.lang.String errMsg) {
        java.lang.Runnable runnable;
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        super.b(i17, reqUrl, i18, i19, errMsg);
        com.tencent.mars.xlog.Log.i("Finder.WebViewController", "reason:" + i17 + " reqUrl:" + reqUrl + " errType:" + i18 + " errCode:" + i19 + " :" + errMsg + ": String) ");
        java.lang.ref.WeakReference weakReference = this.f136924d;
        if (weakReference == null || (runnable = (java.lang.Runnable) weakReference.get()) == null) {
            return;
        }
        runnable.run();
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void e() {
        zg0.q2 q2Var;
        zg0.q2 q2Var2;
        try {
            java.lang.ref.WeakReference weakReference = this.f136923c;
            if (weakReference == null || (q2Var = (zg0.q2) weakReference.get()) == null) {
                return;
            }
            com.tencent.mm.plugin.webview.stub.v0 e07 = ((com.tencent.mm.plugin.webview.core.r0) q2Var).e0();
            com.tencent.mm.plugin.webview.stub.b bVar = this.f136925e;
            java.lang.ref.WeakReference weakReference2 = this.f136923c;
            e07.rg(bVar, (weakReference2 == null || (q2Var2 = (zg0.q2) weakReference2.get()) == null) ? 0 : ((com.tencent.mm.plugin.webview.core.r0) q2Var2).U());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.WebViewController", th6, "initWebViewController exception", new java.lang.Object[0]);
        }
    }
}
