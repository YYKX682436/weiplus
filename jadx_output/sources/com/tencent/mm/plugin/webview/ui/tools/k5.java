package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class k5 implements hy4.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.b5 f185605a;

    public k5(com.tencent.mm.plugin.webview.ui.tools.b5 b5Var) {
        this.f185605a = b5Var;
    }

    @Override // hy4.r
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.b5 b5Var = this.f185605a;
        if (b5Var.q()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "onCaptureFinish:" + str);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.webview.ui.tools.b5.f183931x = currentTimeMillis;
        b5Var.f183942j.put(str, java.lang.Long.valueOf(currentTimeMillis));
        com.tencent.mm.ui.widget.MMWebView mMWebView = b5Var.f183947o.getController().f181916a;
        if (mMWebView == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewLongClickHelper", "onCaptureFinish webView is null");
        } else {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$ScanImageData(str, com.tencent.mm.plugin.webview.ui.tools.b5.f183931x, b5Var.f183947o.c(), b5Var.f183947o.b(), mMWebView.getMeasuredWidth(), mMWebView.getMeasuredHeight()), com.tencent.mm.plugin.webview.ui.tools.z5.class, new com.tencent.mm.plugin.webview.ui.tools.y5(new java.lang.ref.WeakReference(b5Var), str));
            b5Var.f183945m = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        }
    }
}
