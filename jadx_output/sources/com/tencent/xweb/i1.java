package com.tencent.xweb;

/* loaded from: classes13.dex */
public class i1 extends android.content.MutableContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public tx5.f f220300a;

    @Override // android.content.MutableContextWrapper
    public void setBaseContext(android.content.Context context) {
        tx5.i c17;
        tx5.h g17;
        java.lang.Object bridge;
        super.setBaseContext(context);
        by5.c4.f("WebViewContextWrapper", "setBaseContext, context:" + context + ", webViewType:" + com.tencent.xweb.WebView.getCurrentModuleWebCoreType());
        tx5.f fVar = this.f220300a;
        if (!(fVar instanceof vx5.i0) || (c17 = tx5.j.c(com.tencent.xweb.f1.WV_KIND_PINUS)) == null || (g17 = c17.g()) == null) {
            return;
        }
        vx5.h0 h0Var = ((vx5.i0) fVar).f441355f;
        if (h0Var == null) {
            by5.c4.c("PinusWebView", "getPinusBridge, mWebview is null");
            bridge = null;
        } else {
            bridge = h0Var.getBridge();
        }
        g17.invokeRuntimeChannel(com.tencent.thumbplayer.tmediacodec.codec.CodecError.RESET_CODECEXCEPTION, new java.lang.Object[]{bridge});
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void unbindService(android.content.ServiceConnection serviceConnection) {
        try {
            super.unbindService(serviceConnection);
        } catch (java.lang.IllegalArgumentException e17) {
            by5.c4.c("WebViewContextWrapper", "XWebContextWrapper unbindService IllegalArgumentException:" + e17);
        }
    }
}
