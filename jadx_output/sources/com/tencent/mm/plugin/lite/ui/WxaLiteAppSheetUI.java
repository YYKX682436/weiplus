package com.tencent.mm.plugin.lite.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/lite/ui/WxaLiteAppSheetUI;", "Landroidx/appcompat/app/AppCompatActivity;", "Lq80/z;", "Lcom/tencent/mm/plugin/lite/LiteAppCenter$IFragmentCallback;", "Lcom/tencent/mm/sdk/platformtools/f7;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class WxaLiteAppSheetUI extends androidx.appcompat.app.AppCompatActivity implements q80.z, com.tencent.mm.plugin.lite.LiteAppCenter.IFragmentCallback, com.tencent.mm.sdk.platformtools.f7 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f144352x = 0;

    /* renamed from: e, reason: collision with root package name */
    public org.json.JSONObject f144354e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f144356g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f144357h;

    /* renamed from: i, reason: collision with root package name */
    public double f144358i;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View.OnLayoutChangeListener f144367u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f144368v;

    /* renamed from: w, reason: collision with root package name */
    public q80.x f144369w;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f144353d = "MicroMsg.WxaLiteAppSheetUI";

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.liteapp.ui.WxaLiteAppFragment f144355f = (com.tencent.liteapp.ui.WxaLiteAppFragment) new com.tencent.liteapp.ui.j(com.tencent.liteapp.ui.WxaLiteAppFragment.class).a();

    /* renamed from: m, reason: collision with root package name */
    public long f144359m = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f144360n = -1;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig f144361o = new com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig();

    /* renamed from: p, reason: collision with root package name */
    public final int f144362p = 1;

    /* renamed from: q, reason: collision with root package name */
    public final int f144363q = 2;

    /* renamed from: r, reason: collision with root package name */
    public final int f144364r = 3;

    /* renamed from: s, reason: collision with root package name */
    public int f144365s = 0;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.lite.ui.l2 f144366t = new com.tencent.mm.plugin.lite.ui.l2(this, new android.os.Handler(android.os.Looper.getMainLooper()));

    public final void P6(boolean z17) {
        com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout scrollableFrameLayout = (com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout) findViewById(com.tencent.mm.R.id.gd9);
        if (scrollableFrameLayout == null) {
            kd.c.e(this.f144353d, "applyHalfScreenLayout: contentView is null, skip layout update", new java.lang.Object[0]);
            return;
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        int i17 = displayMetrics.widthPixels;
        int i18 = displayMetrics.heightPixels;
        android.view.View rootView = findViewById(android.R.id.content).getRootView();
        int width = rootView != null ? rootView.getWidth() : 0;
        int height = rootView != null ? rootView.getHeight() : 0;
        if (width > 0) {
            i17 = width;
        }
        if (height <= 0) {
            height = i18;
        }
        boolean z18 = height >= i17;
        com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig liteAppHalfScreenConfig = this.f144361o;
        double d17 = liteAppHalfScreenConfig == null ? 1.0d : z18 ? liteAppHalfScreenConfig.f143410d : liteAppHalfScreenConfig.f143412f;
        if (d17 <= 0.0d || d17 > 1.0d) {
            d17 = 1.0d;
        }
        double d18 = z18 ? liteAppHalfScreenConfig.f143411e : liteAppHalfScreenConfig.f143413g;
        if (d18 <= 0.0d || d18 > 1.0d) {
            d18 = 0.75d;
        }
        double d19 = i18;
        double d27 = d18 * d19;
        this.f144358i = d27;
        double d28 = (liteAppHalfScreenConfig.f143415i || z17) ? d19 : d27;
        double d29 = d19 - d27;
        int i19 = (int) (i17 * d17);
        if (i19 < 1) {
            i19 = 1;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i19, (int) d28);
        layoutParams.gravity = 49;
        layoutParams.topMargin = (int) d29;
        scrollableFrameLayout.setLayoutParams(layoutParams);
        scrollableFrameLayout.setSpaceHolderHeight((float) d29);
        scrollableFrameLayout.setTranslationY((float) (z17 ? -d29 : 0.0d));
        R6(scrollableFrameLayout, ((int) (((double) (-scrollableFrameLayout.getTranslationY())) + d27)) == i18);
    }

    public final void Q6() {
        hideKeyboard();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.gd9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ((com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout) findViewById).h();
    }

    @Override // q80.z
    public void R1(q80.x onActResult) {
        kotlin.jvm.internal.o.g(onActResult, "onActResult");
        this.f144369w = onActResult;
    }

    public final void R6(android.view.View view, boolean z17) {
        if (z17) {
            getWindow().addFlags(1024);
        } else {
            getWindow().clearFlags(1024);
        }
        view.setOutlineProvider(new com.tencent.mm.plugin.lite.ui.n2(z17));
        view.setClipToOutline(true);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IFragmentCallback
    public void closeWindow(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        if (intent.hasExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA)) {
            try {
                this.f144354e = new org.json.JSONObject(intent.getStringExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA));
            } catch (java.lang.Exception unused) {
            }
        }
        runOnUiThread(new com.tencent.mm.plugin.lite.ui.c2(this));
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        if (this.f144356g) {
            return;
        }
        this.f144356g = true;
        com.tencent.liteapp.ui.WxaLiteAppFragment wxaLiteAppFragment = this.f144355f;
        if (wxaLiteAppFragment != null && wxaLiteAppFragment.f46063p == 0) {
            kd.c.b(this.f144353d, "finish appUuid=0", new java.lang.Object[0]);
            super.finish();
            return;
        }
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).ek(java.lang.Boolean.FALSE);
        if (this.f144357h) {
            super.finish();
            return;
        }
        Q6();
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).postDelayed(new com.tencent.mm.plugin.lite.ui.d2(new java.lang.ref.WeakReference(this), this), 330L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return com.tencent.mm.sdk.platformtools.x2.f193075e;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        java.lang.Object systemService = super.getSystemService(name);
        if (!kotlin.jvm.internal.o.b("layout_inflater", name)) {
            return systemService;
        }
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        return com.tencent.mm.ui.id.c((android.view.LayoutInflater) systemService);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IFragmentCallback
    public void halfScreenScrollToBottom() {
        super.halfScreenScrollToBottom();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.gd9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ((com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout) findViewById).h();
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IFragmentCallback
    public void halfScreenScrollToResume() {
        super.halfScreenScrollToResume();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.gd9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ((com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout) findViewById).g();
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IFragmentCallback
    public void halfScreenScrollToTop() {
        super.halfScreenScrollToTop();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.gd9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ((com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout) findViewById).i();
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IFragmentCallback
    public void hideKeyboard() {
        java.lang.Object systemService = getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.gd9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(((android.widget.FrameLayout) findViewById).getWindowToken(), 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        q80.x xVar = this.f144369w;
        if (xVar != null) {
            kotlin.jvm.internal.o.d(xVar);
            xVar.onActivityResult(i17, i18, intent);
            this.f144369w = null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f144355f.f46023e.d(true, false);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout scrollableFrameLayout = (com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout) findViewById(com.tencent.mm.R.id.gd9);
        if (scrollableFrameLayout != null) {
            P6(scrollableFrameLayout.getHasArrivedTop());
        } else {
            kd.c.e(this.f144353d, "onConfigurationChanged: contentView is null, skip layout update", new java.lang.Object[0]);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        final q80.f0 f0Var;
        com.tencent.mm.plugin.lite.o oVar = com.tencent.mm.plugin.lite.p.f144149a;
        if (!com.tencent.mm.plugin.lite.p.f144150b.get()) {
            kd.c.b(this.f144353d, "LiteAppProcessProfileInit has no init.", new java.lang.Object[0]);
            super.onCreate(bundle);
            finish();
            return;
        }
        com.tencent.liteapp.ui.WxaLiteAppFragment wxaLiteAppFragment = this.f144355f;
        wxaLiteAppFragment.f46071x = true;
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).ek(java.lang.Boolean.TRUE);
        super.onCreate(bundle);
        setContentView(com.tencent.mm.R.layout.f489217bq1);
        overridePendingTransition(0, com.tencent.mm.R.anim.f477724l);
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.i2 beginTransaction = supportFragmentManager != null ? supportFragmentManager.beginTransaction() : null;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.gd9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        h0Var.f310123d = findViewById;
        android.os.Bundle bundleExtra = getIntent().getBundleExtra("bundle");
        if (bundleExtra != null) {
            getWindowManager().getDefaultDisplay().getRealMetrics(new android.util.DisplayMetrics());
            com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig liteAppHalfScreenConfig = bundleExtra.containsKey("halfScreenConfig") ? (com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig) bundleExtra.getParcelable("halfScreenConfig") : null;
            if (liteAppHalfScreenConfig != null) {
                this.f144361o = liteAppHalfScreenConfig;
            } else {
                double d17 = 0.75d;
                double d18 = bundleExtra.containsKey("heightPercent") ? bundleExtra.getDouble("heightPercent") : 0.75d;
                if (d18 > 0.0d && d18 < 1.0d) {
                    d17 = d18;
                }
                com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig liteAppHalfScreenConfig2 = this.f144361o;
                liteAppHalfScreenConfig2.f143411e = d17;
                liteAppHalfScreenConfig2.f143414h = bundleExtra.containsKey("enableDragToCloseInHalfScreen") && bundleExtra.getBoolean("enableDragToCloseInHalfScreen");
                this.f144361o.f143415i = bundleExtra.containsKey("enableDragToFullScreenInHalfScreen") && bundleExtra.getBoolean("enableDragToFullScreenInHalfScreen");
                this.f144361o.f143416m = (com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener) bundleExtra.getParcelable("halfScreenStatusChangeListener");
            }
            wxaLiteAppFragment.A = this.f144361o.f143414h;
            ((com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout) h0Var.f310123d).setCanScrollToBottom(true);
            ((com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout) h0Var.f310123d).setCanScrollToTop(this.f144361o.f143415i);
            ((com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout) h0Var.f310123d).setCanScrollWhenFullScreen(this.f144361o.f143415i);
            ((com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout) h0Var.f310123d).setChildScrolledReferee(new com.tencent.mm.plugin.lite.ui.e2(this));
            if (bundleExtra.containsKey("liteappReferrerInfo")) {
                com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = (com.tencent.liteapp.storage.LiteAppReferrerInfo) bundleExtra.getParcelable("liteappReferrerInfo");
                if (liteAppReferrerInfo != null && liteAppReferrerInfo.innerData.has("appUuid")) {
                    this.f144359m = liteAppReferrerInfo.innerData.getLong("appUuid");
                }
                if (liteAppReferrerInfo != null && liteAppReferrerInfo.innerData.has("pageId")) {
                    this.f144360n = liteAppReferrerInfo.innerData.getLong("pageId");
                }
            } else if (bundleExtra.containsKey("referrerFromUuid") && bundleExtra.containsKey("referrerFromPageId")) {
                this.f144359m = bundleExtra.getLong("referrerFromUuid");
                this.f144360n = bundleExtra.getLong("referrerFromPageId");
            }
        }
        R6((android.view.View) h0Var.f310123d, false);
        ((com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout) h0Var.f310123d).setEnableGestureDelegate(new com.tencent.mm.plugin.lite.ui.f2(this));
        ((com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout) h0Var.f310123d).setUiEventListener(new com.tencent.mm.plugin.lite.ui.g2(this, h0Var));
        final long longExtra = getIntent().getLongExtra("callbackUuid", -1L);
        if (longExtra > 0 && (f0Var = (q80.f0) com.tencent.mm.plugin.lite.w.f144518u.get(java.lang.Long.valueOf(longExtra))) != null) {
            wxaLiteAppFragment.mo133getLifecycle().a(new androidx.lifecycle.v() { // from class: com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI$onCreate$4
                @Override // androidx.lifecycle.v
                public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
                    kotlin.jvm.internal.o.g(source, "source");
                    kotlin.jvm.internal.o.g(event, "event");
                    if (event == androidx.lifecycle.m.ON_CREATE) {
                        com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI wxaLiteAppSheetUI = this;
                        com.tencent.liteapp.ui.WxaLiteAppFragment wxaLiteAppFragment2 = wxaLiteAppSheetUI.f144355f;
                        q80.f0.this.onCreate(wxaLiteAppFragment2.f46063p, wxaLiteAppFragment2.f46029n);
                        com.tencent.mm.plugin.lite.w.f144518u.remove(java.lang.Long.valueOf(longExtra));
                        wxaLiteAppSheetUI.f144355f.mo133getLifecycle().c(this);
                    }
                }
            });
        }
        com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener liteAppHalfScreenStatusChangeListener = this.f144361o.f143416m;
        if (liteAppHalfScreenStatusChangeListener != null) {
            liteAppHalfScreenStatusChangeListener.a(com.tencent.mm.plugin.lite.api.m.ON_CREATE);
        }
        if (beginTransaction != null) {
            beginTransaction.h(com.tencent.mm.R.id.gd9, wxaLiteAppFragment, null, 1);
        }
        if (beginTransaction != null) {
            beginTransaction.d();
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f485558i41);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById2;
        if (bundleExtra == null) {
            frameLayout.setBackgroundColor(2130706432);
        } else {
            frameLayout.setBackgroundColor(bundleExtra.getInt("KHalfScreenBackGroundColor", this.f144361o.f143417n ? 0 : 2130706432));
        }
        frameLayout.setOnClickListener(new com.tencent.mm.plugin.lite.ui.h2(this));
        com.tencent.mm.ui.MMActivity.initLanguage(this);
        ((com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout) h0Var.f310123d).post(new com.tencent.mm.plugin.lite.ui.i2(this));
        com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent = new com.tencent.mm.autogen.events.LiteAppLifeCycleEvent();
        am.ri riVar = liteAppLifeCycleEvent.f54468g;
        riVar.f7817a = 0;
        riVar.f7819c = wxaLiteAppFragment.f46026h;
        riVar.f7820d = java.lang.Long.valueOf(wxaLiteAppFragment.f46063p);
        riVar.f7818b = this.f144354e;
        liteAppLifeCycleEvent.e();
        android.view.View rootView = findViewById(android.R.id.content).getRootView();
        this.f144368v = rootView;
        if (rootView != null) {
            rootView.setBackgroundColor(0);
        }
        com.tencent.mm.plugin.lite.ui.k2 k2Var = new com.tencent.mm.plugin.lite.ui.k2(this);
        this.f144367u = k2Var;
        android.view.View view = this.f144368v;
        if (view != null) {
            view.addOnLayoutChangeListener(k2Var);
        }
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        n3.h2.a(getWindow(), true);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        android.view.View view;
        super.onDestroy();
        com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent = new com.tencent.mm.autogen.events.LiteAppLifeCycleEvent();
        am.ri riVar = liteAppLifeCycleEvent.f54468g;
        riVar.f7817a = 3;
        com.tencent.liteapp.ui.WxaLiteAppFragment wxaLiteAppFragment = this.f144355f;
        riVar.f7819c = wxaLiteAppFragment.f46026h;
        riVar.f7820d = java.lang.Long.valueOf(wxaLiteAppFragment.f46063p);
        riVar.f7818b = this.f144354e;
        liteAppLifeCycleEvent.e();
        android.view.View.OnLayoutChangeListener onLayoutChangeListener = this.f144367u;
        if (onLayoutChangeListener != null && (view = this.f144368v) != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        this.f144367u = null;
        this.f144368v = null;
        com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener liteAppHalfScreenStatusChangeListener = this.f144361o.f143416m;
        if (liteAppHalfScreenStatusChangeListener != null) {
            liteAppHalfScreenStatusChangeListener.a(com.tencent.mm.plugin.lite.api.m.ON_STOP);
        }
        if (this.f144359m <= 0 || this.f144360n <= 0) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", "hide");
        jSONObject.put(ya.b.SOURCE, "halfPage");
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Uj(this.f144359m, this.f144360n, "overlayStateChange", jSONObject);
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent = new com.tencent.mm.autogen.events.LiteAppLifeCycleEvent();
        am.ri riVar = liteAppLifeCycleEvent.f54468g;
        riVar.f7817a = 2;
        com.tencent.liteapp.ui.WxaLiteAppFragment wxaLiteAppFragment = this.f144355f;
        riVar.f7819c = wxaLiteAppFragment.f46026h;
        riVar.f7820d = java.lang.Long.valueOf(wxaLiteAppFragment.f46063p);
        riVar.f7818b = this.f144354e;
        liteAppLifeCycleEvent.e();
        com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener liteAppHalfScreenStatusChangeListener = this.f144361o.f143416m;
        if (liteAppHalfScreenStatusChangeListener != null) {
            liteAppHalfScreenStatusChangeListener.a(com.tencent.mm.plugin.lite.api.m.ON_PAUSE);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener liteAppHalfScreenStatusChangeListener = this.f144361o.f143416m;
        if (liteAppHalfScreenStatusChangeListener != null) {
            liteAppHalfScreenStatusChangeListener.a(com.tencent.mm.plugin.lite.api.m.ON_RESUME);
        }
        if (this.f144359m > 0 && this.f144360n > 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", "show");
            jSONObject.put(ya.b.SOURCE, "halfPage");
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Uj(this.f144359m, this.f144360n, "overlayStateChange", jSONObject);
        }
        com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent = new com.tencent.mm.autogen.events.LiteAppLifeCycleEvent();
        am.ri riVar = liteAppLifeCycleEvent.f54468g;
        riVar.f7817a = 1;
        com.tencent.liteapp.ui.WxaLiteAppFragment wxaLiteAppFragment = this.f144355f;
        riVar.f7819c = wxaLiteAppFragment.f46026h;
        riVar.f7820d = java.lang.Long.valueOf(wxaLiteAppFragment.f46063p);
        riVar.f7818b = this.f144354e;
        liteAppLifeCycleEvent.e();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        getContentResolver().registerContentObserver(android.provider.Settings.System.getUriFor("accelerometer_rotation"), false, this.f144366t);
        com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener liteAppHalfScreenStatusChangeListener = this.f144361o.f143416m;
        if (liteAppHalfScreenStatusChangeListener != null) {
            liteAppHalfScreenStatusChangeListener.a(com.tencent.mm.plugin.lite.api.m.ON_START);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        getContentResolver().unregisterContentObserver(this.f144366t);
        com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener liteAppHalfScreenStatusChangeListener = this.f144361o.f143416m;
        if (liteAppHalfScreenStatusChangeListener != null) {
            liteAppHalfScreenStatusChangeListener.a(com.tencent.mm.plugin.lite.api.m.ON_STOP);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            ct.d3 d3Var = (ct.d3) i95.n0.c(ct.d3.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((com.tencent.mm.ui.feature.api.screenshot.t) d3Var).wi(context, this);
            return;
        }
        ct.d3 d3Var2 = (ct.d3) i95.n0.c(ct.d3.class);
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        ((com.tencent.mm.ui.feature.api.screenshot.t) d3Var2).Bi(context2, this);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IFragmentCallback
    public void setPageOrientation(int i17) {
        runOnUiThread(new com.tencent.mm.plugin.lite.ui.m2(this, i17));
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEventToTopPage(this.f144355f.f46063p, "app.screenshot", (org.json.JSONObject) null);
    }
}
