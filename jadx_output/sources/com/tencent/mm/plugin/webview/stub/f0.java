package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes.dex */
public class f0 implements uh4.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.WebViewStubService f183531d;

    public f0(com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService) {
        this.f183531d = webViewStubService;
    }

    @Override // uh4.i0
    public void onDataChanged() {
        try {
            java.util.Iterator it = ((java.util.ArrayList) this.f183531d.f183486i).iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it.next()).f183795d.callback(256, new android.os.Bundle());
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubService", "notify network change failed :%s", e17.getMessage());
        }
    }
}
