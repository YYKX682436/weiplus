package sx4;

/* loaded from: classes8.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx4.g0 f413603d;

    public e0(sx4.g0 g0Var) {
        this.f413603d = g0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI gameWebViewUI = this.f413603d.f413609b;
        if (gameWebViewUI.N3) {
            synchronized (gameWebViewUI.O3) {
                if (gameWebViewUI.f183871y != null && gameWebViewUI.N3) {
                    android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(gameWebViewUI);
                    gameWebViewUI.M3 = frameLayout;
                    frameLayout.setClickable(true);
                    gameWebViewUI.f183871y.addView(gameWebViewUI.M3, new android.widget.FrameLayout.LayoutParams(-1, -1));
                    gameWebViewUI.M3.addView(android.view.LayoutInflater.from(gameWebViewUI).inflate(com.tencent.mm.R.layout.bsh, (android.view.ViewGroup) gameWebViewUI.f183871y, false), new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
                }
            }
        }
    }
}
