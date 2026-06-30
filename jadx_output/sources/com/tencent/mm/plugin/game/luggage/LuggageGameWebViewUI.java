package com.tencent.mm.plugin.game.luggage;

@db5.a(128)
/* loaded from: classes8.dex */
public class LuggageGameWebViewUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements nf.m, com.tencent.mm.sdk.platformtools.f7 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f139493i = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.game.luggage.page.f f139494d;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.game.luggage.page.l f139497g;

    /* renamed from: e, reason: collision with root package name */
    public int f139495e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f139496f = true;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f139498h = new java.util.concurrent.ConcurrentHashMap();

    /* loaded from: classes8.dex */
    public static class a implements com.tencent.mm.ipcinvoker.j {
        private a() {
        }

        @Override // com.tencent.mm.ipcinvoker.j
        public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
            android.os.Bundle bundle = (android.os.Bundle) obj;
            if (bundle == null) {
                return;
            }
            java.lang.String string = bundle.getString("key_open_business_type");
            java.lang.String string2 = bundle.getString("key_back_appid");
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGameWebViewUI", "gamelog main process OpenBusinessViewUtil.launchBackApp businessType =%s ,appId = %s", string, string2);
            ((kt.s0) ((lt.r0) i95.n0.c(lt.r0.class))).Ai(string, "", string2, 0, "");
        }
    }

    public final void U6() {
        com.tencent.mm.plugin.game.luggage.page.f fVar = this.f139494d;
        if (fVar == null || fVar.e()) {
            return;
        }
        X6();
        finish();
    }

    public com.tencent.mm.plugin.game.luggage.page.l V6(sd.x xVar, android.os.Bundle bundle) {
        return new com.tencent.mm.plugin.game.luggage.page.l(xVar, null, bundle);
    }

    public com.tencent.mm.plugin.game.luggage.page.x0 W6(android.os.Bundle bundle, java.lang.String str) {
        java.lang.String string = bundle.getString("float_ball_key");
        boolean z17 = bundle.getBoolean("float_layer_page", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGameWebViewUI", "createPage ConstantsUI.WebViewUI.KextData = " + getIntent().getStringExtra("key_extData"));
        bundle.putString("key_extData", getIntent().getStringExtra("key_extData"));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            return new com.tencent.mm.plugin.game.luggage.page.x0(this.f139494d.f406669j, sd.q0.a(getContext(), java.lang.Integer.valueOf(com.tencent.mm.plugin.webview.luggage.z2.b(string))), bundle);
        }
        if (z17) {
            return new com.tencent.mm.plugin.game.luggage.page.a(this.f139494d.f406669j, null, bundle);
        }
        if (!bundle.containsKey("game_tab_data")) {
            sd.o0 g17 = com.tencent.mm.plugin.game.luggage.p1.g(getContext(), str);
            return g17 != null ? new com.tencent.mm.plugin.game.luggage.page.c1(this.f139494d.f406669j, g17, bundle) : new com.tencent.mm.plugin.game.luggage.page.x0(this.f139494d.f406669j, null, bundle);
        }
        this.f139497g = V6(this.f139494d.f406669j, bundle);
        Y6();
        return this.f139497g;
    }

    public void X6() {
    }

    public void Y6() {
    }

    public final void Z6() {
        boolean z17;
        com.tencent.mm.plugin.game.luggage.GameFloatLayerInfo gameFloatLayerInfo;
        this.f139495e = getIntent().getIntExtra("screen_orientation", -1);
        boolean booleanExtra = getIntent().getBooleanExtra("from_shortcut", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("from_game_tab", false);
        if (!booleanExtra && !(!com.tencent.mm.sdk.platformtools.t8.K0(getIntent().getStringExtra("float_ball_key"))) && !booleanExtra2) {
            overridePendingTransition(com.tencent.mm.ui.uc.f211082e, com.tencent.mm.ui.uc.f211083f);
        }
        if (getIntent().getBooleanExtra("game_from_detail_back", false)) {
            overridePendingTransition(com.tencent.mm.ui.uc.f211080c, com.tencent.mm.ui.uc.f211081d);
        }
        new com.tencent.mm.plugin.webview.luggage.ipc.ActiveMainProcessTask().d();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGameWebViewUI", "onCreate, startTime: %d, now: %d", java.lang.Long.valueOf(getIntent().getLongExtra("start_activity_time", java.lang.System.currentTimeMillis())), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        java.lang.String stringExtra = getIntent().getStringExtra("rawUrl");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageGameWebViewUI", "url is null");
            return;
        }
        if (getIntent().getBooleanExtra("shouldCheckLimitedMode", true) && ((qk.s6) gm0.j1.s(qk.s6.class)).isTeenMode()) {
            stringExtra = ((qk.s6) gm0.j1.s(qk.s6.class)).Hg();
            getIntent().putExtra("rawUrl", stringExtra);
        }
        com.tencent.mm.game.report.api.GameWebPerformanceInfo b17 = com.tencent.mm.game.report.api.GameWebPerformanceInfo.b(stringExtra);
        b17.f68174d = stringExtra;
        b17.f68186s = getIntent().getLongExtra("gamecenterui_createtime", 0L);
        b17.f68187t = getIntent().getLongExtra("start_activity_time", java.lang.System.currentTimeMillis());
        b17.f68185r = getIntent().getLongExtra("start_time", b17.f68187t);
        b17.f68192y = java.lang.System.currentTimeMillis();
        b17.f68176f = 1;
        b17.f68179i = 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGameWebViewUI", "url: %s, __Time__， startTime: %d, gamecenterCreate: %d,startWebUI: %d, webUICreate: %d", stringExtra, java.lang.Long.valueOf(b17.f68185r), java.lang.Long.valueOf(b17.f68186s), java.lang.Long.valueOf(b17.f68187t), java.lang.Long.valueOf(b17.f68192y));
        sx4.d0.a(stringExtra);
        sx4.d0.i(stringExtra, java.lang.System.currentTimeMillis());
        sx4.d0.j(stringExtra, java.lang.System.currentTimeMillis());
        sx4.d0.e(stringExtra, b17.f68185r);
        getWindow().setFlags(com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        getWindow().setFormat(-3);
        com.tencent.mm.plugin.game.luggage.page.f fVar = new com.tencent.mm.plugin.game.luggage.page.f(this);
        this.f139494d = fVar;
        a7(fVar.f406662c);
        com.tencent.mm.plugin.game.luggage.page.f fVar2 = this.f139494d;
        fVar2.f139886l = new com.tencent.mm.plugin.game.luggage.j0(this);
        fVar2.f406666g = new com.tencent.mm.plugin.game.luggage.k0(this);
        com.tencent.mm.plugin.game.luggage.GameWebViewLaunchParams gameWebViewLaunchParams = (com.tencent.mm.plugin.game.luggage.GameWebViewLaunchParams) getIntent().getParcelableExtra("launchParams");
        if (gameWebViewLaunchParams == null || (gameFloatLayerInfo = gameWebViewLaunchParams.f139487d) == null) {
            z17 = false;
        } else {
            com.tencent.mm.game.report.api.GameWebPerformanceInfo b18 = com.tencent.mm.game.report.api.GameWebPerformanceInfo.b(gameFloatLayerInfo.f139474d);
            b18.f68174d = gameFloatLayerInfo.f139474d;
            b18.f68186s = getIntent().getLongExtra("gamecenterui_createtime", 0L);
            b18.f68187t = getIntent().getLongExtra("start_activity_time", java.lang.System.currentTimeMillis());
            b18.f68185r = getIntent().getLongExtra("start_time", b18.f68187t);
            b18.f68192y = java.lang.System.currentTimeMillis();
            b18.f68176f = 1;
            b18.f68179i = 1;
            sx4.d0.i(gameFloatLayerInfo.f139474d, java.lang.System.currentTimeMillis());
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("rawUrl", gameFloatLayerInfo.f139474d);
            bundle.putBoolean("show_full_screen", gameFloatLayerInfo.f139475e);
            bundle.putInt("screen_orientation", gameFloatLayerInfo.f139476f);
            bundle.putBoolean("float_layer_page", true);
            bundle.putBoolean("needAnimation", false);
            bundle.putInt("customize_status_bar_color", getIntent().getIntExtra("customize_status_bar_color", 0));
            bundle.putString("customize_status_bar_color", getIntent().getStringExtra("status_bar_style"));
            this.f139494d.h(gameFloatLayerInfo.f139474d, bundle, false);
            z17 = true;
        }
        if (z17) {
            b17.f68183p = 1;
            new android.os.Handler().postDelayed(new com.tencent.mm.plugin.game.luggage.l0(this, stringExtra), 300L);
        } else {
            this.f139494d.g(stringExtra, getIntent().getExtras());
        }
        if (getIntent().getBooleanExtra("from_download_floagt_ball_shutdown_entrance", false)) {
            new android.os.Handler().postDelayed(new com.tencent.mm.plugin.game.luggage.m0(this), 300L);
        }
    }

    public void a7(android.view.View view) {
        setContentView(this.f139494d.f406662c);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return this.f139495e;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity
    public void initSwipeBack() {
        fixStatusbar(false);
        super.initSwipeBack();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean noActionBar() {
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        this.f139494d.f406665f.g(i17, i18, intent);
        if (i17 == 10011) {
            U6();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!g53.j.b(this.f139494d.b())) {
            m33.i1 i1Var = g53.f.f268911a;
            if (i1Var != null) {
                i1Var.onCancel();
            }
            g53.f.f268911a = null;
            U6();
            return;
        }
        if (g53.j.f268920d == 0) {
            return;
        }
        ((vz.x1) i95.n0.c(vz.x1.class)).getClass();
        java.lang.String appId = g53.j.f268918b;
        java.lang.String str = g53.j.f268919c;
        com.tencent.mm.plugin.game.luggage.p0 p0Var = new com.tencent.mm.plugin.game.luggage.p0(this);
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        c02.l lVar2 = new c02.l();
        lVar2.f37605d = appId;
        lVar.f70664a = lVar2;
        lVar.f70665b = new c02.m();
        lVar.f70666c = "/cgi-bin/mmgame-bin/getcloudgamedownloadinfo";
        lVar.f70667d = 4786;
        com.tencent.mm.ipcinvoker.wx_extension.h0.a(lVar.a(), new k02.q(p0Var, this, str, appId, 1));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        Z6();
        com.tencent.mm.plugin.game.commlib.util.i.a(this);
        com.tencent.mm.plugin.game.luggage.i0.f139562a.getAndIncrement();
        getController().E0(getColor(com.tencent.mm.R.color.f478490b));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        supportRequestWindowFeature(10);
        supportRequestWindowFeature(1);
        supportRequestWindowFeature(9);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        g53.j.f268917a = false;
        g53.j.f268918b = null;
        g53.j.f268919c = null;
        java.lang.ref.WeakReference weakReference = g53.j.f268921e;
        if (weakReference != null) {
            weakReference.clear();
        }
        g53.j.f268921e = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGameWebViewUI", "onDestroy");
        com.tencent.mm.plugin.game.commlib.util.i.f(this);
        com.tencent.mm.plugin.game.luggage.h0.f139559a = null;
        com.tencent.mm.plugin.game.luggage.h0.f139560b = 0L;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f139498h;
        java.util.Iterator it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            this.f139494d.f406662c.removeView((android.view.View) it.next());
        }
        concurrentHashMap.clear();
        this.f139494d.a();
        com.tencent.mm.plugin.wepkg.event.h.f188332a.clear();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGameWebViewUI", "fixInputMethodManagerLeak");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGameWebViewUI", "fixInputMethodManagerLeak, imm");
            java.lang.String[] strArr = {"mCurRootView", "mServedView", "mNextServedView"};
            for (int i17 = 0; i17 < 3; i17++) {
                try {
                    java.lang.reflect.Field declaredField = inputMethodManager.getClass().getDeclaredField(strArr[i17]);
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    java.lang.Object obj = declaredField.get(inputMethodManager);
                    if (obj != null && (obj instanceof android.view.View)) {
                        android.view.View view = (android.view.View) obj;
                        if (!(view.getContext() instanceof android.content.ContextWrapper)) {
                            if (view.getContext() != this) {
                                break;
                            } else {
                                declaredField.set(inputMethodManager, null);
                            }
                        } else if (((android.content.ContextWrapper) view.getContext()).getBaseContext() == this) {
                            declaredField.set(inputMethodManager, null);
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuggageGameWebViewUI", th6, "", new java.lang.Object[0]);
                }
            }
        }
        com.tencent.mm.plugin.game.luggage.i0.a();
        android.os.Bundle bundleExtra = getIntent().getBundleExtra("key_bundle_ext_data");
        if (bundleExtra != null && bundleExtra.getBoolean("key_open_by_sdk", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGameWebViewUI", "gamelog OpenBusinessViewUtil.launchBackApp businessType =%s ,appId = %s", bundleExtra.getString("key_open_business_type"), bundleExtra.getString("key_back_appid"));
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundleExtra, com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI.a.class, null);
        }
        super.onDestroy();
        java.lang.System.gc();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGameWebViewUI", "onNewIntent, time: " + java.lang.System.currentTimeMillis());
        if (intent == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuggageGameWebViewUI", "onNewIntent with null");
            return;
        }
        super.onNewIntent(intent);
        setIntent(intent);
        Z6();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGameWebViewUI", "onPause");
        hideVKB();
        com.tencent.mm.plugin.webview.luggage.u1.f182627b = false;
        sd.k b17 = this.f139494d.b();
        if (b17 != null) {
            b17.e();
        }
        com.tencent.mm.plugin.game.luggage.page.l lVar = this.f139497g;
        if (lVar != null) {
            lVar.Y();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGameWebViewUI", "onResume, time: " + java.lang.System.currentTimeMillis());
        com.tencent.mm.plugin.webview.luggage.u1.f182627b = true;
        com.tencent.mm.plugin.game.luggage.page.f fVar = this.f139494d;
        sd.k b17 = fVar.b();
        if (b17 != null) {
            b17.h();
        }
        fVar.k();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGameWebViewUI", "onWindowFocusChanged, hasFocus: %b, time: %d", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        if (z17 && j45.l.f()) {
            ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(com.tencent.mm.sdk.platformtools.x2.f193071a, this);
        } else {
            ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(com.tencent.mm.sdk.platformtools.x2.f193071a, this);
        }
        super.onWindowFocusChanged(z17);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setMMOrientation() {
        int i17 = this.f139495e;
        if (i17 != -1) {
            setRequestedOrientation(i17);
            return;
        }
        boolean z17 = getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 4).getBoolean("settings_landscape_mode", false);
        this.landscapeMode = z17;
        if (z17) {
            setRequestedOrientation(-1);
        } else {
            setRequestedOrientation(1);
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean supportNavigationSwipeBack() {
        return !getIntent().getBooleanExtra("disable_game_page_swipe", false);
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        try {
            sd.u0 u0Var = (sd.u0) com.tencent.mm.plugin.webview.luggage.u1.b().getLast();
            if ((u0Var instanceof com.tencent.mm.plugin.game.luggage.page.x0) && ((com.tencent.mm.plugin.game.luggage.page.x0) u0Var).v(1048576)) {
                u0Var.f406655i.c(new com.tencent.mm.plugin.game.luggage.q0(this));
            }
        } catch (java.util.NoSuchElementException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageGameWebViewUI", "LuggagePageStackList size:%s", java.lang.Integer.valueOf(com.tencent.mm.plugin.webview.luggage.u1.b().size()));
        }
    }
}
