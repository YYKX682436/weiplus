package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes.dex */
public class r implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI f183565d;

    public r(com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI webViewStubProxyUI) {
        this.f183565d = webViewStubProxyUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI webViewStubProxyUI = this.f183565d;
        if (webViewStubProxyUI.isFinishing()) {
            return false;
        }
        webViewStubProxyUI.finish();
        return false;
    }
}
