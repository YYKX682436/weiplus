package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public class MMLuggageGameWebViewUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements nf.m {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.game.luggage.page.f f139504d;

    /* renamed from: e, reason: collision with root package name */
    public int f139505e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f139506f = true;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.game.luggage.page.l f139507g;

    public com.tencent.mm.plugin.game.luggage.page.x0 U6(android.os.Bundle bundle, java.lang.String str) {
        java.lang.String string = bundle.getString("float_ball_key");
        boolean z17 = bundle.getBoolean("float_layer_page", false);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            return new com.tencent.mm.plugin.game.luggage.page.x0(this.f139504d.f406669j, sd.q0.a(getContext(), java.lang.Integer.valueOf(com.tencent.mm.plugin.webview.luggage.z2.b(string))), bundle);
        }
        if (z17) {
            return new com.tencent.mm.plugin.game.luggage.page.a(this.f139504d.f406669j, null, bundle);
        }
        if (!bundle.containsKey("game_tab_data")) {
            sd.o0 g17 = com.tencent.mm.plugin.game.luggage.p1.g(getContext(), str);
            return g17 != null ? new com.tencent.mm.plugin.game.luggage.page.c1(this.f139504d.f406669j, g17, bundle) : new com.tencent.mm.plugin.game.luggage.page.x0(this.f139504d.f406669j, null, bundle);
        }
        this.f139507g = new com.tencent.mm.plugin.game.luggage.page.l(this.f139504d.f406669j, null, bundle);
        W6();
        return this.f139507g;
    }

    public void V6() {
    }

    public void W6() {
    }

    public void X6(android.view.View view) {
        setContentView(this.f139504d.f406662c);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return this.f139505e;
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
        this.f139504d.f406665f.g(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f139504d.e()) {
            return;
        }
        V6();
        finish();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        com.tencent.mm.plugin.game.luggage.GameFloatLayerInfo gameFloatLayerInfo;
        super.onCreate(bundle);
        this.f139505e = getIntent().getIntExtra("screen_orientation", -1);
        boolean booleanExtra = getIntent().getBooleanExtra("from_shortcut", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("from_game_tab", false);
        if (!booleanExtra && !(!com.tencent.mm.sdk.platformtools.t8.K0(getIntent().getStringExtra("float_ball_key"))) && !booleanExtra2) {
            overridePendingTransition(com.tencent.mm.ui.uc.f211082e, com.tencent.mm.ui.uc.f211083f);
        }
        if (getIntent().getBooleanExtra("game_from_detail_back", false)) {
            overridePendingTransition(com.tencent.mm.ui.uc.f211080c, com.tencent.mm.ui.uc.f211081d);
        }
        new com.tencent.mm.plugin.webview.luggage.ipc.ActiveMainProcessTask().d();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMLuggageGameWebViewUI", "onCreate, startTime: %d, now: %d", java.lang.Long.valueOf(getIntent().getLongExtra("start_activity_time", java.lang.System.currentTimeMillis())), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        java.lang.String stringExtra = getIntent().getStringExtra("rawUrl");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMLuggageGameWebViewUI", "url is null");
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
        com.tencent.mars.xlog.Log.i("MicroMsg.MMLuggageGameWebViewUI", "url: %s, __Time__， startTime: %d, gamecenterCreate: %d,startWebUI: %d, webUICreate: %d", stringExtra, java.lang.Long.valueOf(b17.f68185r), java.lang.Long.valueOf(b17.f68186s), java.lang.Long.valueOf(b17.f68187t), java.lang.Long.valueOf(b17.f68192y));
        sx4.d0.a(stringExtra);
        sx4.d0.i(stringExtra, java.lang.System.currentTimeMillis());
        sx4.d0.j(stringExtra, java.lang.System.currentTimeMillis());
        sx4.d0.e(stringExtra, b17.f68185r);
        com.tencent.mm.plugin.game.commlib.util.i.a(this);
        getWindow().setFlags(com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        getWindow().setFormat(-3);
        com.tencent.mm.plugin.game.luggage.page.f fVar = new com.tencent.mm.plugin.game.luggage.page.f(this);
        this.f139504d = fVar;
        X6(fVar.f406662c);
        com.tencent.mm.plugin.game.luggage.page.f fVar2 = this.f139504d;
        fVar2.f139886l = new com.tencent.mm.plugin.game.luggage.b1(this);
        fVar2.f406666g = new com.tencent.mm.plugin.game.luggage.c1(this);
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
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("rawUrl", gameFloatLayerInfo.f139474d);
            bundle2.putBoolean("show_full_screen", gameFloatLayerInfo.f139475e);
            bundle2.putInt("screen_orientation", gameFloatLayerInfo.f139476f);
            bundle2.putBoolean("float_layer_page", true);
            bundle2.putBoolean("needAnimation", false);
            bundle2.putInt("customize_status_bar_color", getIntent().getIntExtra("customize_status_bar_color", 0));
            bundle2.putString("customize_status_bar_color", getIntent().getStringExtra("status_bar_style"));
            this.f139504d.h(gameFloatLayerInfo.f139474d, bundle2, false);
            z17 = true;
        }
        if (z17) {
            b17.f68183p = 1;
            new android.os.Handler().postDelayed(new com.tencent.mm.plugin.game.luggage.d1(this, stringExtra), 300L);
        } else {
            this.f139504d.g(stringExtra, getIntent().getExtras());
        }
        if (getIntent().getBooleanExtra("from_download_floagt_ball_shutdown_entrance", false)) {
            new android.os.Handler().postDelayed(new com.tencent.mm.plugin.game.luggage.e1(this), 300L);
        }
        com.tencent.mm.plugin.game.luggage.i0.f139562a.getAndIncrement();
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
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMLuggageGameWebViewUI", "onDestroy");
        com.tencent.mm.plugin.game.commlib.util.i.f(this);
        com.tencent.mm.plugin.game.luggage.h0.f139559a = null;
        com.tencent.mm.plugin.game.luggage.h0.f139560b = 0L;
        this.f139504d.a();
        com.tencent.mm.plugin.wepkg.event.h.f188332a.clear();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMLuggageGameWebViewUI", "fixInputMethodManagerLeak");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMLuggageGameWebViewUI", "fixInputMethodManagerLeak, imm");
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
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMLuggageGameWebViewUI", th6, "", new java.lang.Object[0]);
                }
            }
        }
        java.lang.System.gc();
        com.tencent.mm.plugin.game.luggage.i0.a();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMLuggageGameWebViewUI", "onPause");
        hideVKB();
        sd.k b17 = this.f139504d.b();
        if (b17 != null) {
            b17.e();
        }
        com.tencent.mm.plugin.game.luggage.page.l lVar = this.f139507g;
        if (lVar != null) {
            lVar.Y();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMLuggageGameWebViewUI", "onResume, time: " + java.lang.System.currentTimeMillis());
        com.tencent.mm.plugin.game.luggage.page.f fVar = this.f139504d;
        sd.k b17 = fVar.b();
        if (b17 != null) {
            b17.h();
        }
        fVar.k();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMLuggageGameWebViewUI", "onWindowFocusChanged, hasFocus: %b, time: %d", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        super.onWindowFocusChanged(z17);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setMMOrientation() {
        int i17 = this.f139505e;
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
}
