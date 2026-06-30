package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class ac implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f183911d;

    public ac(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f183911d = webViewUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f183911d;
        webViewUI.f183816f2 = true;
        com.tencent.mm.plugin.webview.ui.tools.t7.f186896i.a();
        com.tencent.mm.plugin.webview.model.u5.a(webViewUI.x7(), 1);
        webViewUI.finish();
    }
}
