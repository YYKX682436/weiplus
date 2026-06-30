package com.tencent.mm.plugin.webview.ui.tools.game;

/* loaded from: classes8.dex */
public class GameWebViewUI extends com.tencent.mm.plugin.webview.ui.tools.game.GameBaseWebViewUI implements sx4.z {
    public static final /* synthetic */ int S3 = 0;
    public kh0.h C3;
    public java.lang.String D3;
    public final java.util.Map E3;
    public java.lang.String F3;
    public com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuImageButton G3;
    public boolean H3;
    public boolean I3;
    public com.tencent.mm.game.report.api.GameWebPerformanceInfo J3;
    public long K3;
    public sx4.d0 L3;
    public android.view.ViewGroup M3;
    public boolean N3;
    public final java.lang.Object O3;
    public final sx4.q0 P3;
    public boolean Q3;
    public boolean R3;

    public GameWebViewUI() {
        new java.util.HashMap();
        this.D3 = null;
        this.E3 = new java.util.HashMap();
        this.N3 = false;
        this.O3 = new java.lang.Object();
        this.P3 = new sx4.q0(this, null);
        this.Q3 = false;
        this.R3 = false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void B8() {
        m53.i5 p17;
        int i17;
        super.B8();
        this.H3 = true;
        if ((this.Z1 == null && this.Y1 == 0) && (p17 = com.tencent.mm.plugin.game.commlib.i.p()) != null && !com.tencent.mm.sdk.platformtools.t8.K0(p17.f323795d) && !com.tencent.mm.sdk.platformtools.t8.K0(p17.f323797f)) {
            try {
                if (com.tencent.mm.ui.bk.C()) {
                    this.Y1 = android.graphics.Color.parseColor(p17.f323797f);
                } else {
                    this.Y1 = android.graphics.Color.parseColor(p17.f323795d);
                }
            } catch (java.lang.IllegalArgumentException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.GameWebViewUI", "parse color: " + e17.getMessage());
            }
            this.Z1 = p17.f323796e;
            if (!fp.h.c(21) || (i17 = this.Y1) == 0) {
                P8(S6());
            } else {
                setActionbarColor(i17);
            }
            a8(true);
        }
        android.content.Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("game_check_float", false)) {
            int intExtra = intent.getIntExtra("game_sourceScene", 0);
            java.lang.String stringExtra = intent.getStringExtra("game_transparent_float_url");
            this.D3 = stringExtra;
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("game_check_float", true);
                intent2.putExtra("game_sourceScene", intExtra);
                j45.l.j(this, "game", ".ui.GameCenterUI", intent2, null);
                return;
            }
            try {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("game_sourceScene", intExtra);
                com.tencent.mm.plugin.webview.stub.v0 v0Var = this.K1;
                if (v0Var != null) {
                    v0Var.i(91, bundle);
                }
                if (this.A3 == null) {
                    this.A3 = new sx4.q(this, this.f183871y, this.D3);
                }
                sx4.q qVar = this.A3;
                java.lang.String str = this.D3;
                qVar.f413646j = str;
                ((vz4.x) qVar.f413644h).e(str, false, false);
                com.tencent.mm.ui.widget.MMWebView mMWebView = qVar.f413639c;
                if (mMWebView != null && mMWebView.getParent() == null) {
                    qVar.f413640d.addView(mMWebView, new android.view.ViewGroup.LayoutParams(-1, -1));
                }
                if (mMWebView != null && qVar.f413645i != null) {
                    mMWebView.post(new sx4.i(qVar, str));
                }
                this.D3 = null;
            } catch (android.os.RemoteException unused) {
            }
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public synchronized com.tencent.xweb.s0 L7() {
        if (this.f183869x1 == null) {
            this.f183869x1 = new sx4.n0(this);
        }
        return this.f183869x1;
    }

    @Override // sx4.z
    public java.util.Map M1() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(21, m9());
        hashMap.put(22, com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a));
        hashMap.put(23, java.lang.String.valueOf(y7.c.b(com.tencent.mm.sdk.platformtools.x2.f193071a)));
        java.lang.String F7 = F7();
        try {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            hashMap.put(24, fp.s0.b(F7 == null ? "" : F7, com.tencent.mapsdk.internal.rv.f51270c));
        } catch (java.io.UnsupportedEncodingException unused) {
        }
        hashMap.put(25, java.lang.Boolean.valueOf(((vz4.x) this.C3).d(F7)));
        hashMap.put(26, 0);
        hashMap.put(27, 0);
        com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion = ((vz4.x) this.C3).f441758f;
        hashMap.put(28, wepkgVersion != null ? wepkgVersion.f188376f : "");
        ((vz4.x) this.C3).getClass();
        hashMap.put(29, vz4.b.a());
        return hashMap;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void S7(android.os.Bundle bundle) {
        super.S7(bundle);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void X8() {
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = this.f183849q2;
        if (c6Var.F) {
            c6Var.y();
        }
        com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuImageButton gameMenuImageButton = this.G3;
        if (gameMenuImageButton == null || !gameMenuImageButton.f184766e) {
            super.X8();
            return;
        }
        tx4.l lVar = new tx4.l(getContext());
        sx4.h0 h0Var = new sx4.h0(this);
        com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuView gameMenuView = lVar.f422696h;
        if (gameMenuView != null) {
            gameMenuView.setGameMenuItemSelectedListener(h0Var);
        }
        lVar.f422694f = new sx4.i0(this);
        if (this.B) {
            lVar.f422701p = true;
            lVar.f422702q = true;
        } else {
            lVar.f422701p = false;
            lVar.f422702q = false;
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter webViewSearchContentInputFooter = this.H;
        if (webViewSearchContentInputFooter == null || !webViewSearchContentInputFooter.isShown()) {
            hideVKB();
            com.tencent.mm.sdk.platformtools.u3.i(new sx4.k0(this, lVar), 100L);
        } else {
            this.H.a();
            com.tencent.mm.sdk.platformtools.u3.i(new sx4.j0(this, lVar), 100L);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public int Y8() {
        return super.Y8();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void Z7() {
        super.Z7();
        java.lang.String stringExtra = getIntent().getStringExtra("game_hv_menu_appid");
        this.F3 = stringExtra;
        if (!this.B || com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.MovingImageButton movingImageButton = this.f183875z;
        if (movingImageButton != null) {
            movingImageButton.setVisibility(8);
        }
        this.G3.a(this.f183867x, new sx4.l0(this));
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void a8(boolean z17) {
        super.a8(z17);
        h7(false);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.MMActivity
    public void addIconOptionMenu(int i17, int i18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        if (this.H3) {
            super.addIconOptionMenu(i17, i18, onMenuItemClickListener);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public com.tencent.mm.plugin.webview.core.e3 e7() {
        com.tencent.mm.plugin.webview.core.e3 e76 = super.e7();
        e76.E(this.P3);
        return e76;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        this.J3.A = java.lang.System.currentTimeMillis();
        return com.tencent.mm.R.layout.d9p;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        new android.graphics.drawable.ColorDrawable(b3.l.getColor(this, com.tencent.mm.R.color.f478592bq));
        new android.graphics.drawable.ColorDrawable(b3.l.getColor(this, com.tencent.mm.R.color.f478592bq));
        this.J3.B = java.lang.System.currentTimeMillis();
        this.L3.f413584c = java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public boolean l7() {
        getIntent().putExtra("minimize_secene", 2);
        return true;
    }

    public java.lang.String m9() {
        return (hashCode() & Integer.MAX_VALUE) + "_" + (F7().hashCode() & Integer.MAX_VALUE);
    }

    public kh0.h n9() {
        return this.C3;
    }

    public void o9() {
        this.L3.f413589h = java.lang.System.currentTimeMillis();
        this.J3.f68182o = 1;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.game.GameBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("rawUrl");
        if (getIntent().getBooleanExtra("shouldCheckLimitedMode", true) && ((qk.s6) gm0.j1.s(qk.s6.class)).isTeenMode()) {
            stringExtra = ((qk.s6) gm0.j1.s(qk.s6.class)).Hg();
            getIntent().putExtra("rawUrl", stringExtra);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            java.lang.String queryParameter = android.net.Uri.parse(stringExtra).getQueryParameter("nav_color");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(queryParameter)) {
                try {
                    getIntent().putExtra("customize_status_bar_color", android.graphics.Color.parseColor("#" + queryParameter));
                } catch (java.lang.IllegalArgumentException unused) {
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.GameWebViewUI", "rawUrl rid:%s, pkgId:%s", kh0.i.b(stringExtra), kh0.i.a(stringExtra));
        if (getIntent().getLongExtra("gamecenterui_createtime", 0L) > 0) {
            this.J3 = com.tencent.mm.game.report.api.GameWebPerformanceInfo.b(stringExtra);
        } else {
            this.J3 = com.tencent.mm.game.report.api.GameWebPerformanceInfo.a(stringExtra);
        }
        com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo = this.J3;
        gameWebPerformanceInfo.f68174d = stringExtra;
        gameWebPerformanceInfo.f68175e = m9();
        this.J3.f68186s = getIntent().getLongExtra("gamecenterui_createtime", 0L);
        this.J3.f68187t = getIntent().getLongExtra("start_activity_time", java.lang.System.currentTimeMillis());
        this.J3.f68185r = getIntent().getLongExtra("start_time", this.J3.f68187t);
        this.J3.f68192y = java.lang.System.currentTimeMillis();
        com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo2 = this.J3;
        gameWebPerformanceInfo2.f68179i = 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.GameWebViewUI", "onCreate, startTime: %d, gameCenterUICreate: %d, startWebUI: %d,webUICreate: %d", java.lang.Long.valueOf(gameWebPerformanceInfo2.f68185r), java.lang.Long.valueOf(this.J3.f68186s), java.lang.Long.valueOf(this.J3.f68187t), java.lang.Long.valueOf(this.J3.f68192y));
        sx4.d0 a17 = sx4.d0.a(stringExtra);
        this.L3 = a17;
        a17.f413583b = java.lang.System.currentTimeMillis();
        this.L3.f413591j = this.J3.f68185r;
        ((jh0.v) ((kh0.g) i95.n0.c(kh0.g.class))).getClass();
        this.C3 = new vz4.x();
        super.onCreate(bundle);
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f183815f;
        if (mMWebView != null) {
            mMWebView.getSettings().A(1);
        }
        android.content.Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("disable_progress_bar", false)) {
            this.f183834m.f197340m = false;
            android.widget.ProgressBar progressBar = this.f183843p;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        }
        ((vz4.x) this.C3).f441764l = new sx4.g0(this, stringExtra);
        boolean booleanExtra = getIntent().getBooleanExtra("open_game_float", false);
        this.I3 = booleanExtra;
        if (((vz4.x) this.C3).e(stringExtra, !booleanExtra, false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.GameWebViewUI", "current page use wepkg");
            android.widget.ProgressBar progressBar2 = this.f183843p;
            if (progressBar2 != null) {
                progressBar2.setVisibility(0);
            }
        }
        this.G3 = new com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuImageButton(getContext());
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.GameWebViewUI)).Rj(this, iy1.a.Game);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.game.GameBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.L1;
        sx4.q0 q0Var = this.P3;
        e3Var.M0(q0Var);
        this.L1.K0(q0Var.f413653b);
        super.onDestroy();
        ((vz4.x) this.C3).g(this.I3);
        this.J3.f68173J = java.lang.System.currentTimeMillis();
        jj0.a.a().e(this.J3);
        sx4.y.b(m9(), this);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.game.GameBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.J3.I += java.lang.System.currentTimeMillis() - this.K3;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.game.GameBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.J3.f68193z == 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.GameWebViewUI", "onResume: " + currentTimeMillis);
            this.J3.f68193z = currentTimeMillis;
        }
        this.K3 = java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void p8(java.lang.String str, java.util.Map map, boolean z17) {
        com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo = this.J3;
        if (gameWebPerformanceInfo.D == 0) {
            gameWebPerformanceInfo.D = java.lang.System.currentTimeMillis();
        }
        com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion = ((vz4.x) this.C3).f441758f;
        if (wepkgVersion == null || !wepkgVersion.f188378h) {
            super.p8(str, map, false);
        } else {
            super.p8(str, map, z17);
        }
    }

    public void p9() {
        this.L3.f413590i = java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.MMActivity
    public void setMMOrientation() {
        if (getForceOrientation() != -1) {
            setRequestedOrientation(getForceOrientation());
            return;
        }
        boolean z17 = getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 4).getBoolean("settings_landscape_mode", false);
        this.landscapeMode = z17;
        if (z17) {
            setRequestedOrientation(2);
        } else {
            setRequestedOrientation(1);
        }
    }

    @Override // sx4.z
    public java.util.Map w5() {
        java.util.HashMap hashMap = new java.util.HashMap();
        sx4.d0 c17 = sx4.d0.c(F7());
        if (c17 != null) {
            hashMap.put(30, java.lang.Long.valueOf(c17.f413584c - c17.f413583b));
            hashMap.put(31, java.lang.Long.valueOf(c17.f413585d - c17.f413583b));
            hashMap.put(32, java.lang.Long.valueOf(c17.f413586e - c17.f413585d));
            hashMap.put(33, java.lang.Long.valueOf(c17.f413588g - c17.f413587f));
            hashMap.put(34, java.lang.Long.valueOf(c17.f413590i - c17.f413589h));
            hashMap.put(45, java.lang.Long.valueOf(c17.f413591j));
            hashMap.put(70, java.lang.Long.valueOf(c17.f413583b - c17.f413591j));
        }
        hashMap.put(49, 0);
        return hashMap;
    }
}
