package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class z8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f187719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f187720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.u7 f187721f;

    public z8(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, boolean z17, boolean z18) {
        this.f187721f = u7Var;
        this.f187719d = z17;
        this.f187720e = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.u7 u7Var = this.f187721f;
        if (u7Var.f186929e.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).isFinishing()) {
            return;
        }
        if (this.f187719d) {
            if (((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).f183815f != null && !com.tencent.mm.sdk.platformtools.t8.K0(((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).f183815f.getUrl())) {
                ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).N1.put(((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).f183815f.getUrl(), java.lang.Boolean.FALSE);
            }
            ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).a8(false);
            return;
        }
        com.tencent.mm.ui.widget.MMWebView mMWebView = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).f183815f;
        boolean z17 = this.f187720e;
        if (mMWebView != null && !com.tencent.mm.sdk.platformtools.t8.K0(((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).f183815f.getUrl())) {
            ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).N1.put(((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).f183815f.getUrl(), java.lang.Boolean.valueOf(z17));
        }
        ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).a8(z17);
    }
}
