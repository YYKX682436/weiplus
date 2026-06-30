package zx4;

/* loaded from: classes8.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zx4.l0 f477135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f477136e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f477137f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f477138g;

    public g0(zx4.l0 l0Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, boolean z17, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f477135d = l0Var;
        this.f477136e = webViewUI;
        this.f477137f = z17;
        this.f477138g = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("WebviewScreenShotHelper", "captureResult failed: permission denied");
        zx4.l0.c(this.f477135d, this.f477136e, this.f477137f, this.f477138g);
    }
}
