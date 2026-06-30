package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class t8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f186906e;

    public t8(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, android.os.Bundle bundle) {
        this.f186905d = webViewUI;
        this.f186906e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186905d;
        if (webViewUI == null || webViewUI.isFinishing()) {
            return;
        }
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b.f186984a.b(this.f186906e);
    }
}
