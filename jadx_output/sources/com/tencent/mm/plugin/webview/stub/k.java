package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes.dex */
public class k implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI f183539d;

    public k(com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI webViewStubProxyUI) {
        this.f183539d = webViewStubProxyUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubProxyUI", "addshortcut, user cancel");
        this.f183539d.finish();
    }
}
