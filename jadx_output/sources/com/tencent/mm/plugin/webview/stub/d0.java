package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes.dex */
public class d0 implements com.tencent.mm.plugin.webview.model.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.WebViewStubService f183527a;

    public d0(com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService) {
        this.f183527a = webViewStubService;
    }

    @Override // com.tencent.mm.plugin.webview.model.l0
    public void a(int i17, android.os.Bundle bundle) {
        try {
            java.util.Iterator it = ((java.util.ArrayList) this.f183527a.f183486i).iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it.next()).f183795d.callback(i17 == 1 ? 121002 : 121001, bundle);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewStubService", e17, "onExitFinderFullscreenEvent exception", new java.lang.Object[0]);
        }
    }
}
