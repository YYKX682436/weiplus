package sx4;

/* loaded from: classes8.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f413605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sx4.g0 f413606e;

    public f0(sx4.g0 g0Var, boolean z17) {
        this.f413606e = g0Var;
        this.f413605d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.ViewGroup viewGroup;
        com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI gameWebViewUI = this.f413606e.f413609b;
        if (gameWebViewUI.N3) {
            gameWebViewUI.N3 = false;
            synchronized (gameWebViewUI.O3) {
                android.widget.FrameLayout frameLayout = gameWebViewUI.f183871y;
                if (frameLayout != null && (viewGroup = gameWebViewUI.M3) != null) {
                    frameLayout.removeView(viewGroup);
                }
            }
            if (this.f413605d) {
                this.f413606e.f413609b.f183815f.stopLoading();
                sx4.g0 g0Var = this.f413606e;
                ((vz4.x) g0Var.f413609b.C3).e(g0Var.f413608a, !r2.I3, false);
                sx4.g0 g0Var2 = this.f413606e;
                g0Var2.f413609b.p8(g0Var2.f413608a, null, false);
            }
        }
    }
}
