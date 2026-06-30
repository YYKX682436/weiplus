package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes.dex */
public class p implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI f183560d;

    public p(com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI webViewStubProxyUI) {
        this.f183560d = webViewStubProxyUI;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI webViewStubProxyUI = this.f183560d;
        if (webViewStubProxyUI.isFinishing()) {
            return;
        }
        webViewStubProxyUI.finish();
    }
}
