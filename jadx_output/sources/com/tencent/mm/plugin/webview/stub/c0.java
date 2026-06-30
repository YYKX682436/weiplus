package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes.dex */
public class c0 implements com.tencent.mm.plugin.webview.model.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.WebViewStubService f183525a;

    public c0(com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService) {
        this.f183525a = webViewStubService;
    }

    @Override // com.tencent.mm.plugin.webview.model.k0
    public void a(android.os.Bundle bundle) {
        try {
            java.util.Iterator it = ((java.util.ArrayList) this.f183525a.f183486i).iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it.next()).f183795d.callback(121000, bundle);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewStubService", e17, "finderFeedInfUpdateEvent exception", new java.lang.Object[0]);
        }
    }
}
