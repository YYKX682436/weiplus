package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public class w0 implements hy4.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.n1 f136934a;

    public w0(com.tencent.mm.plugin.finder.webview.n1 n1Var) {
        this.f136934a = n1Var;
    }

    @Override // hy4.r
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.finder.webview.n1 n1Var = this.f136934a;
        if (n1Var.h()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "onCaptureFinish:" + str);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.finder.webview.n1.f136895p = currentTimeMillis;
        n1Var.f136906j.put(str, java.lang.Long.valueOf(currentTimeMillis));
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$ScanImageData(str, com.tencent.mm.plugin.finder.webview.n1.f136895p, n1Var.f().getTouchX().floatValue(), n1Var.f().getTouchY().floatValue(), n1Var.f().getWebView().getMeasuredWidth(), n1Var.f().getWebView().getMeasuredHeight()), com.tencent.mm.plugin.finder.webview.k1.class, new com.tencent.mm.plugin.finder.webview.j1(new java.lang.ref.WeakReference(n1Var), str));
        n1Var.f136909m = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
    }
}
