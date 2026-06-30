package k53;

/* loaded from: classes8.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem f304378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k53.u0 f304379e;

    public o0(k53.u0 u0Var, com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem webViewJSSDKVideoItem) {
        this.f304379e = u0Var;
        this.f304378d = webViewJSSDKVideoItem;
    }

    @Override // java.lang.Runnable
    public void run() {
        k53.u0 u0Var = this.f304379e;
        if (u0Var.f304402h) {
            return;
        }
        com.tencent.mm.plugin.webview.modeltools.z.bj().c("", this.f304378d.f182736e, 20302, 214, 2, u0Var.f304403i);
        u0Var.f304401g = java.lang.System.currentTimeMillis();
    }
}
