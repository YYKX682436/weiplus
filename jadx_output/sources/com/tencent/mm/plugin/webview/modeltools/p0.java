package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f183335d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(long j17) {
        super(0);
        this.f183335d = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.MMWebView mMWebView = com.tencent.mm.plugin.webview.modeltools.u0.f183353b;
        if (mMWebView != null) {
            mMWebView.stopLoading();
            mMWebView.destroy();
        }
        com.tencent.mm.plugin.webview.modeltools.u0.f183353b = null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cleanPreload cost:");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis() - this.f183335d);
        sb6.append(" ms");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPreloadRenderProcessHelper", sb6.toString());
        return jz5.f0.f302826a;
    }
}
