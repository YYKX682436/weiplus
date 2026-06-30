package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class dc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f184110d;

    public dc(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f184110d = webViewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f184110d.finish();
    }
}
