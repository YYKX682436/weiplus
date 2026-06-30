package sw4;

/* loaded from: classes3.dex */
public final class b implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f413481a;

    public b(java.lang.ref.WeakReference uiRef) {
        kotlin.jvm.internal.o.g(uiRef, "uiRef");
        this.f413481a = uiRef;
    }

    @Override // l81.e1
    public void a() {
        com.tencent.mm.plugin.webview.luggage.ipc.GaussianBlurProxyUI gaussianBlurProxyUI = (com.tencent.mm.plugin.webview.luggage.ipc.GaussianBlurProxyUI) this.f413481a.get();
        if (gaussianBlurProxyUI != null) {
            gaussianBlurProxyUI.finish();
        }
    }

    @Override // l81.e1
    public void b() {
        com.tencent.mm.plugin.webview.luggage.ipc.GaussianBlurProxyUI gaussianBlurProxyUI = (com.tencent.mm.plugin.webview.luggage.ipc.GaussianBlurProxyUI) this.f413481a.get();
        if (gaussianBlurProxyUI != null) {
            gaussianBlurProxyUI.finish();
        }
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
    }

    @Override // l81.e1
    public void e() {
    }

    @Override // l81.e1
    public void f(boolean z17) {
        com.tencent.mm.plugin.webview.luggage.ipc.GaussianBlurProxyUI gaussianBlurProxyUI = (com.tencent.mm.plugin.webview.luggage.ipc.GaussianBlurProxyUI) this.f413481a.get();
        if (gaussianBlurProxyUI != null) {
            gaussianBlurProxyUI.finish();
        }
    }
}
