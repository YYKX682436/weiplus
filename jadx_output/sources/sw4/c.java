package sw4;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.ipc.GaussianBlurProxyUI f413482d;

    public c(com.tencent.mm.plugin.webview.luggage.ipc.GaussianBlurProxyUI gaussianBlurProxyUI) {
        this.f413482d = gaussianBlurProxyUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View decorView;
        int i17 = com.tencent.mm.plugin.webview.luggage.ipc.GaussianBlurProxyUI.f182229d;
        com.tencent.mm.plugin.webview.luggage.ipc.GaussianBlurProxyUI gaussianBlurProxyUI = this.f413482d;
        boolean z17 = false;
        boolean booleanExtra = gaussianBlurProxyUI.getIntent().getBooleanExtra("key_gaussian_ui_fullscreen", false);
        k91.x2 x2Var = k91.x2.f305817e;
        k91.v2 v2Var = k91.v2.f305790d;
        if ("dragBar".equals(gaussianBlurProxyUI.getIntent().getStringExtra("key_gaussian_ui_style"))) {
            x2Var = k91.x2.f305816d;
            v2Var = k91.v2.f305791e;
            z17 = true;
        }
        k91.x2 x2Var2 = x2Var;
        k91.v2 v2Var2 = v2Var;
        boolean z18 = z17;
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = gaussianBlurProxyUI.getIntent().getStringExtra("key_gaussian_ui_appid");
        b1Var.f317012a = gaussianBlurProxyUI.getIntent().getStringExtra("key_gaussian_ui_username");
        b1Var.f317022f = gaussianBlurProxyUI.getIntent().getStringExtra("key_gaussian_ui_path");
        b1Var.f317032k = gaussianBlurProxyUI.getIntent().getIntExtra("key_gaussian_ui_scene", bb1.b.CTRL_INDEX);
        android.content.Intent intent = gaussianBlurProxyUI.getIntent();
        android.view.Window window = gaussianBlurProxyUI.getWindow();
        boolean z19 = true;
        k91.s2 s2Var = null;
        boolean z27 = true;
        b1Var.G = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig(z19, intent.getIntExtra("key_gaussian_ui_height", (((window == null || (decorView = window.getDecorView()) == null) ? gaussianBlurProxyUI.getResources().getDisplayMetrics().heightPixels : decorView.getHeight()) * 3) / 4), s2Var, z27, new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig(gaussianBlurProxyUI.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479672c9), true, true, false, false), false, null, k91.t2.f305767e, booleanExtra, true, null, k91.y2.f305827d, false, false, null, false, 0, null, 0, 0, 0, false, false, false, x2Var2, false, null, 0, z18, null, false, 0, false, false, booleanExtra, booleanExtra, v2Var2, null, null, false, null, null, false, -287345564, 2019, null);
        b1Var.L = new sw4.b(new java.lang.ref.WeakReference(gaussianBlurProxyUI));
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(gaussianBlurProxyUI.getContext(), b1Var);
    }
}
