package com.tencent.mm.plugin.webview.ui.tools.floatball;

/* loaded from: classes8.dex */
public class w extends com.tencent.mm.plugin.ball.service.s4 {

    /* renamed from: y, reason: collision with root package name */
    public static final java.util.Set f184232y;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.WebViewUI f184233v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f184234w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f184235x;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f184232y = hashSet;
        hashSet.add(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        hashSet.add("webpageTitle");
        hashSet.add("hide_option_menu");
        hashSet.add("translate_webview");
        hashSet.add("srcUsername");
        hashSet.add("srcDisplayname");
        hashSet.add("mode");
        hashSet.add("KTemplateId");
        hashSet.add("KPublisherId");
        hashSet.add("KOpenArticleSceneFromScene");
        hashSet.add(com.tencent.mm.ui.w2.f211194g);
        hashSet.add("pay_channel");
        hashSet.add("key_download_restrict");
        hashSet.add("key_wallet_region");
        hashSet.add("key_function_id");
        hashSet.add(com.tencent.mm.ui.w2.f211197j);
        hashSet.add("geta8key_scene");
        hashSet.add("ad_ux_info_for_jsapi_pay");
        hashSet.add("key_menu_hide_expose");
        hashSet.add("webviewCurrentProcess");
        hashSet.add("float_ball_key");
    }

    public w(dp1.x xVar, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        super(xVar);
        this.f184235x = false;
        this.f184233v = webViewUI;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFloatBallHelper", "createFloatBallHelper, WebViewUI:%s", java.lang.Integer.valueOf(webViewUI.hashCode()));
    }

    public static void t0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        android.os.Bundle bundle;
        if (ballInfo == null || (bundle = ballInfo.G) == null) {
            return;
        }
        int i17 = bundle.getInt(com.tencent.mm.ui.w2.f211197j, -1);
        java.lang.String string = ballInfo.G.getString("rawUrl");
        if (i17 <= -1 || com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            return;
        }
        ballInfo.G.getString("srcDisplayname");
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).d(string, i17, ballInfo.G.getInt("KOpenArticleSceneFromScene"), new java.lang.Object[0]);
    }

    public static void u0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        android.os.Bundle bundle;
        java.lang.String str;
        if (ballInfo == null || (bundle = ballInfo.G) == null) {
            return;
        }
        java.lang.String str2 = ballInfo.f93049g;
        java.lang.String string = bundle.getString("rawUrl");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFloatBallHelper", "handleBallInfoClicked, url:%s", string);
        int i17 = ballInfo.G.getInt("minimize_secene", 0);
        int i18 = ballInfo.G.getInt(com.tencent.mm.ui.w2.f211197j, -1);
        android.content.Intent intent = new android.content.Intent();
        qp1.m.b(intent, ballInfo.G, f184232y);
        intent.putExtra("rawUrl", string);
        intent.putExtra("minimize_secene", i17);
        intent.putExtra("float_ball_key", str2);
        intent.putExtra("key_enable_teen_mode_check", true);
        intent.putExtra("key_enable_fts_quick", true);
        intent.putExtra("webpageTitle", ballInfo.f93063x);
        intent.putExtra("key_enter_float_ball_type", ballInfo.f93046d);
        ep1.m.b(com.tencent.mm.sdk.platformtools.x2.f193071a, intent, true);
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFloatBallHelper", "openWebPage, go to jd url");
            intent.putExtra("useJs", true);
            intent.putExtra("vertical_scroll", true);
            intent.putExtra("minimize_secene", 1);
            intent.putExtra("KPublisherId", "jd_store");
            h45.g0.f278945a = 9;
        } else {
            if (i17 == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFloatBallHelper", "openWebPage, go to game url");
                str = ".ui.tools.game.GameWebViewUI";
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                j45.l.j(context, "webview", str, intent, ep1.m.f(context));
            }
            if (i18 > -1) {
                boolean z17 = i18 == 5;
                int i19 = ballInfo.G.getInt("KOpenArticleSceneFromScene");
                int i27 = ballInfo.G.getInt(com.tencent.mm.ui.w2.f211194g);
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
                if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.e(i19)) {
                    if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).E(com.tencent.mm.sdk.platformtools.x2.f193071a, string, i18, z17, i19, i27, intent)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFloatBallHelper", "openWebPage, use fast Load");
                        return;
                    }
                }
            }
        }
        str = ".ui.tools.WebViewUI";
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        j45.l.j(context2, "webview", str, intent, ep1.m.f(context2));
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void H() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFloatBallHelper", "onReceivedBallInfoRemovedEvent, WebViewUI:%s", java.lang.Integer.valueOf(this.f184233v.hashCode()));
        n0();
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void I() {
        this.f93246u = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, WebViewUI:%s", java.lang.Integer.valueOf(this.f184233v.hashCode()));
        this.f93239n.q(false);
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public void Z(java.lang.String str) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        if (ballInfo == null || com.tencent.mm.sdk.platformtools.t8.K0(ballInfo.f93063x) || this.f93132d.f93063x.startsWith("http://") || this.f93132d.f93063x.startsWith("https://") || com.tencent.mm.sdk.platformtools.t8.K0(str) || !(str.startsWith("http://") || str.startsWith("https://"))) {
            super.Z(str);
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d, gp1.r
    public void b(int i17, java.lang.String str) {
        this.f184234w = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFloatBallHelper", "onCreate, type:%s, key:%s", java.lang.Integer.valueOf(i17), str);
        super.b(i17, str);
        Q(1);
        t().f93086f = 3;
        com.tencent.mm.plugin.ball.model.BallReportInfo t17 = t();
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f184233v;
        t17.f93085e = webViewUI.L1.Q();
        if (v0(webViewUI.F7())) {
            t().f93089i = webViewUI.getIntent().getStringExtra("srcUsername");
        }
        int i18 = t().f93085e;
        g();
        dp1.x xVar = this.f93239n;
        if (xVar.getIntent() == null || this.f93132d.G == null) {
            return;
        }
        qp1.m.c(xVar.getIntent(), this.f93132d.G, f184232y);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f93132d.G.getString("float_ball_key"))) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
            ballInfo.G.putString("float_ball_key", ballInfo.f93049g);
        }
        g();
    }

    @Override // com.tencent.mm.plugin.ball.service.d, gp1.r
    public void d() {
        gp1.v vVar;
        if (!this.f184234w || (vVar = this.f93136h) == null) {
            return;
        }
        vVar.U(this.f93132d);
    }

    @Override // com.tencent.mm.plugin.ball.service.d, gp1.r
    public void g() {
        gp1.v vVar;
        if (!this.f184234w || (vVar = this.f93136h) == null) {
            return;
        }
        vVar.V(this.f93132d);
    }

    @Override // com.tencent.mm.plugin.ball.service.d, gp1.r
    public void j() {
        gp1.v vVar;
        if (!this.f184234w || (vVar = this.f93136h) == null) {
            return;
        }
        vVar.u(this.f93132d);
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public boolean k0() {
        int intExtra = this.f93239n.getIntent().getIntExtra("key_enter_float_ball_type", -1);
        return intExtra == 2 || intExtra == 50;
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public boolean n() {
        return this.f184233v.m8();
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public boolean o() {
        return true;
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public void o0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFloatBallHelper", "onDestroy, WebViewUI:%s", java.lang.Integer.valueOf(this.f184233v.hashCode()));
        super.o0();
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public com.tencent.mm.plugin.ball.model.BallInfo r() {
        return s();
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public boolean v() {
        return this.f184233v.m8() && this.f93239n.t() && this.f93136h.Y();
    }

    public boolean v0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        if (!str.startsWith("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/")) {
            if (!str.startsWith("http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/")) {
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void x() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFloatBallHelper", "onEnterPage, WebViewUI:%s, isEntered: %b", java.lang.Integer.valueOf(this.f184233v.hashCode()), java.lang.Boolean.valueOf(this.f184235x));
        if (this.f184235x) {
            return;
        }
        this.f184235x = true;
        super.x();
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFloatBallHelper", "onExitPage, WebViewUI:%s", java.lang.Integer.valueOf(this.f184233v.hashCode()));
        super.z();
        this.f184235x = false;
    }
}
