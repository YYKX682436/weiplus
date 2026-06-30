package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public final class l0 implements com.tencent.mm.plugin.finder.webview.n0 {

    /* renamed from: n, reason: collision with root package name */
    public static boolean f136880n;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f136881a;

    /* renamed from: b, reason: collision with root package name */
    public final oy2.l f136882b;

    /* renamed from: c, reason: collision with root package name */
    public final oy2.p f136883c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f136884d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f136885e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f136886f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f136887g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f136888h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f136889i;

    /* renamed from: j, reason: collision with root package name */
    public android.content.DialogInterface.OnDismissListener f136890j;

    /* renamed from: k, reason: collision with root package name */
    public final oy2.a0 f136891k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.webview.p0 f136892l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.webview.FinderWebViewScrollViewWrapper$lifecycleObserver$1 f136893m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.lifecycle.x, com.tencent.mm.plugin.finder.webview.FinderWebViewScrollViewWrapper$lifecycleObserver$1] */
    public l0(android.content.Context context, java.lang.String url, oy2.l dialog, int i17, java.lang.String str, oy2.p scConfig, java.util.Map map) {
        zg0.q2 webViewController;
        com.tencent.mm.ui.widget.MMWebView mMWebView;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(dialog, "dialog");
        kotlin.jvm.internal.o.g(scConfig, "scConfig");
        this.f136881a = context;
        this.f136882b = dialog;
        this.f136883c = scConfig;
        oy2.a0 a0Var = new oy2.a0(this);
        this.f136891k = a0Var;
        r45.sn snVar = new r45.sn();
        snVar.f385851e = java.util.UUID.randomUUID().toString();
        snVar.f385852f = url;
        com.tencent.mm.plugin.finder.webview.FinderWebViewHelper finderWebViewHelper = new com.tencent.mm.plugin.finder.webview.FinderWebViewHelper(context, snVar, null, i17, scConfig.f349997f, 4, null);
        finderWebViewHelper.setDialogWindow(dialog.getWindow());
        com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView = a0Var.f349944i;
        if (multiCodeMaskView == null) {
            kotlin.jvm.internal.o.o("codeMaskView");
            throw null;
        }
        finderWebViewHelper.setCodeMaskView(multiCodeMaskView);
        finderWebViewHelper.getWebViewEnv().f136932d = str;
        finderWebViewHelper.setWxWebViewEnvMap(map);
        this.f136892l = finderWebViewHelper;
        ?? r17 = new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.finder.webview.FinderWebViewScrollViewWrapper$lifecycleObserver$1
            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
            public final void onDestroy() {
                com.tencent.mars.xlog.Log.i("Finder.AdCenterDialog", "OnLifecycleEvent onDestroy");
                oy2.l lVar = com.tencent.mm.plugin.finder.webview.l0.this.f136882b;
                if (lVar.isAttachedToWindow()) {
                    lVar.b();
                }
            }

            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
            public final void onPause() {
                com.tencent.mm.plugin.finder.webview.l0.f136880n = false;
                com.tencent.mars.xlog.Log.i("Finder.AdCenterDialog", "OnLifecycleEvent onPause");
            }

            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
            public final void onResume() {
                com.tencent.mars.xlog.Log.i("Finder.AdCenterDialog", "OnLifecycleEvent onResume");
            }

            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_STOP)
            public final void onStop() {
                com.tencent.mars.xlog.Log.i("Finder.AdCenterDialog", "OnLifecycleEvent onStop");
            }
        };
        this.f136893m = r17;
        finderWebViewHelper.addWebViewStateListener(new com.tencent.mm.plugin.finder.webview.i0(this));
        this.f136884d = finderWebViewHelper.getWithInitWebView();
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((com.tencent.mm.plugin.finder.viewmodel.component.qa0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.qa0.class)) != null && (context instanceof android.app.Activity) && (webViewController = finderWebViewHelper.getWebViewController()) != null && (mMWebView = this.f136884d) != null) {
            mMWebView.setWebChromeClient(new com.tencent.mm.plugin.finder.webview.r(new java.lang.ref.WeakReference(context), new java.lang.ref.WeakReference(webViewController)));
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.webview.j0(this));
        dialog.setOnDismissListener(new com.tencent.mm.plugin.finder.webview.f0(this));
        com.tencent.mm.ui.widget.MMWebView mMWebView2 = this.f136884d;
        kotlin.jvm.internal.o.d(mMWebView2);
        a0Var.f349939d = mMWebView2;
        mMWebView2.D0(new oy2.t(a0Var));
        com.tencent.mm.plugin.finder.webview.RelativeInterceptScrollLayout relativeInterceptScrollLayout = a0Var.f349938c;
        if (relativeInterceptScrollLayout == null) {
            kotlin.jvm.internal.o.o("mWebViewContainer");
            throw null;
        }
        relativeInterceptScrollLayout.addView(a0Var.f349939d, new android.widget.RelativeLayout.LayoutParams(-1, -2));
        com.tencent.mm.ui.widget.MMWebView mMWebView3 = a0Var.f349939d;
        if (mMWebView3 != null) {
            mMWebView3.setWebViewCallbackClient(a0Var.f349949n);
        }
        a0Var.f349946k = new com.tencent.mm.plugin.finder.webview.g0(this);
        com.tencent.mm.plugin.finder.webview.k0 k0Var = new com.tencent.mm.plugin.finder.webview.k0(this);
        if (z65.c.a()) {
            a0Var.f349948m = k0Var;
        } else {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
            this.f136888h = mMActivity;
            mMActivity.mo133getLifecycle().a(r17);
        } else if (context instanceof com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment) {
            com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment mMFinderFragment = (com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment) context;
            if (mMFinderFragment.getActivity() instanceof com.tencent.mm.ui.MMActivity) {
                androidx.fragment.app.FragmentActivity activity = mMFinderFragment.getActivity();
                kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                this.f136888h = (com.tencent.mm.ui.MMActivity) activity;
                androidx.fragment.app.FragmentActivity activity2 = mMFinderFragment.getActivity();
                kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((com.tencent.mm.ui.MMActivity) activity2).mo133getLifecycle().a(r17);
            }
        }
        dialog.setCurScrollHeightListener(finderWebViewHelper.getScrollHeightListener());
    }

    @Override // com.tencent.mm.plugin.finder.webview.n0
    public oy2.m a() {
        return this.f136882b;
    }

    public final void b() {
        android.view.Window window;
        com.tencent.mars.xlog.Log.i("Finder.AdCenterDialog", "realShow");
        oy2.l lVar = this.f136882b;
        lVar.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderScrollDialog", "show");
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 80;
        android.content.Context context = lVar.getContext();
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        android.view.KeyEvent.Callback decorView = (mMActivity == null || (window = mMActivity.getWindow()) == null) ? null : window.getDecorView();
        android.widget.FrameLayout frameLayout = decorView instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) decorView : null;
        if (frameLayout != null) {
            frameLayout.addView(lVar, layoutParams);
        }
        f136880n = true;
    }

    public void c() {
        com.tencent.mars.xlog.Log.i("Finder.AdCenterDialog", "showDialog showAfterWebViewReady: %b, webViewReady: %b", java.lang.Boolean.valueOf(this.f136887g), java.lang.Boolean.valueOf(this.f136885e));
        if (!this.f136887g) {
            b();
        } else if (this.f136885e) {
            b();
        } else {
            this.f136886f = true;
        }
    }
}
