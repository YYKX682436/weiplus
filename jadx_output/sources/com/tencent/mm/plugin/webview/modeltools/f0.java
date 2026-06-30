package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f183251a;

    /* renamed from: b, reason: collision with root package name */
    public long f183252b = 0;

    public f0(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f183251a = new java.lang.ref.WeakReference(webViewUI);
    }

    public void a(java.lang.String str) {
        java.lang.ref.WeakReference weakReference = this.f183251a;
        if (weakReference.get() == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f183252b < 200) {
            return;
        }
        this.f183252b = currentTimeMillis;
        com.tencent.mm.plugin.webview.modeltools.WebViewClipBoardHelper$ClipBoardDataWrapper webViewClipBoardHelper$ClipBoardDataWrapper = new com.tencent.mm.plugin.webview.modeltools.WebViewClipBoardHelper$ClipBoardDataWrapper();
        webViewClipBoardHelper$ClipBoardDataWrapper.f183235d = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).x7();
        webViewClipBoardHelper$ClipBoardDataWrapper.f183236e = str != null ? str.length() : 0;
        webViewClipBoardHelper$ClipBoardDataWrapper.f183237f = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).getIntent().getIntExtra("from_scence", 0);
        webViewClipBoardHelper$ClipBoardDataWrapper.f183238g = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).getIntent().getStringExtra("geta8key_username");
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, webViewClipBoardHelper$ClipBoardDataWrapper, com.tencent.mm.plugin.webview.modeltools.e0.class, null);
        com.tencent.mm.plugin.webview.model.h4.f182914i.a(hy4.a0.f286078n);
    }
}
