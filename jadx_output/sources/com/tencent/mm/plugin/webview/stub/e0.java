package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes8.dex */
public class e0 extends com.tencent.mm.network.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f183528d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.WebViewStubService f183529e;

    public e0(com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService) {
        this.f183529e = webViewStubService;
    }

    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        synchronized (this.f183528d) {
            try {
                java.lang.String j17 = com.tencent.mm.pluginsdk.ui.tools.e9.j();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("webview_network_type", j17);
                java.util.Iterator it = ((java.util.ArrayList) this.f183529e.f183486i).iterator();
                while (it.hasNext()) {
                    ((com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it.next()).f183795d.callback(90, bundle);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubService", "notify network change failed :%s", e17.getMessage());
            }
        }
    }
}
