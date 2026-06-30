package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public final class s0 implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f183345d;

    public s0(long j17) {
        this.f183345d = j17;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        android.os.Looper.myQueue().removeIdleHandler(this);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preload actually delay ");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis() - this.f183345d);
        sb6.append(" ms");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPreloadRenderProcessHelper", sb6.toString());
        com.tencent.mm.plugin.webview.modeltools.u0 u0Var = com.tencent.mm.plugin.webview.modeltools.u0.f183352a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (com.tencent.mm.plugin.webview.modeltools.u0.f183353b == null) {
            com.tencent.mm.ui.widget.MMWebView a17 = al5.l2.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mm.plugin.webview.modeltools.u0.f183353b = a17;
            a17.loadUrl("about:blank");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPreloadRenderProcessHelper", "preload cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " ms");
        return false;
    }
}
