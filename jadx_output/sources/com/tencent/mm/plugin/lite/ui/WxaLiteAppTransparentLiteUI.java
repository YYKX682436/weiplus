package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes15.dex */
public class WxaLiteAppTransparentLiteUI extends com.tencent.liteapp.ui.WxaLiteAppTransparentUI implements q80.z, com.tencent.mm.sdk.platformtools.f7, nf.m {
    public org.json.JSONObject A1;
    public final aa3.f0 B1 = new aa3.f0();
    public boolean C1 = false;
    public q80.x D1 = null;

    @Override // q80.z
    public void R1(q80.x xVar) {
        this.D1 = xVar;
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentUI, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void closeWindow(android.content.Intent intent) {
        if (intent.hasExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA)) {
            try {
                this.A1 = new org.json.JSONObject(intent.getStringExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA));
            } catch (java.lang.Exception unused) {
            }
        }
        if (intent.getBooleanExtra("onlySetData", false)) {
            return;
        }
        super.closeWindow(intent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return com.tencent.mm.sdk.platformtools.x2.f193075e;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        java.lang.Object systemService = super.getSystemService(str);
        return "layout_inflater".equals(str) ? com.tencent.mm.ui.id.c((android.view.LayoutInflater) systemService) : systemService;
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentUI, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void hideKeyboard() {
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        aa3.h0.f2526a.b();
        super.hideKeyboard();
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentUI, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public boolean isDarkMode() {
        return com.tencent.mm.ui.bk.C();
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentUI, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void keyboardEnable(boolean z17) {
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        aa3.h0.f2526a.c(z17);
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentBaseUI, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        nf.g.a(this).g(i17, i18, intent);
        q80.x xVar = this.D1;
        if (xVar != null) {
            xVar.onActivityResult(i17, i18, intent);
            this.D1 = null;
        }
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentBaseUI, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentUI, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onCheckBaseLibSumFail(java.lang.String str, java.util.List list) {
        super.onCheckBaseLibSumFail(str, list);
        com.tencent.mm.plugin.lite.logic.g1.s().B(this.R.I);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onCheckLiteAppVersionError(int i17) {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.lite.ui.r2(this));
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentUI, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onCheckSumFail(java.lang.String str, java.util.List list) {
        super.onCheckSumFail(str, list);
        com.tencent.mm.plugin.lite.logic.g1.s().C(str, this.R.I);
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentUI, com.tencent.liteapp.ui.WxaLiteAppTransparentBaseUI, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (bundle != null) {
            if (getIntent().hasExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP)) {
                this.f46076f = (com.tencent.liteapp.storage.WxaLiteAppInfo) getIntent().getParcelableExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP);
            }
            com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo = this.f46076f;
            if (wxaLiteAppInfo != null) {
                boolean contains = ra3.h0.f393513f.contains(wxaLiteAppInfo.appId);
                boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_liteapp_recreated_jump_to_launchui, true);
                com.tencent.mars.xlog.Log.i("LiteAppUtils", "needBackToLaunchUI switch check %s %s", java.lang.Boolean.valueOf(contains), java.lang.Boolean.valueOf(fj6));
                boolean z17 = contains && fj6;
                this.f46082o = z17;
                if (z17) {
                    super.onCreate(bundle);
                    com.tencent.mars.xlog.Log.i("LiteAppUtils", "jumpToLaunchUI");
                    android.content.Intent intent = new android.content.Intent();
                    intent.addFlags(67108864);
                    intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
                    intent.putExtra("preferred_tab", 0);
                    j45.l.u(this, "com.tencent.mm.ui.LauncherUI", intent, null);
                    finish();
                    return;
                }
            }
        }
        com.tencent.mm.plugin.lite.o oVar = com.tencent.mm.plugin.lite.p.f144149a;
        if (!com.tencent.mm.plugin.lite.p.f144150b.get()) {
            kd.c.b("MicroMsg.WxaLiteAppTransparentLiteUI", "LiteAppProcessProfileInit has no init.", new java.lang.Object[0]);
            this.f46081n = true;
            super.onCreate(bundle);
            finish();
            return;
        }
        com.tencent.mm.plugin.lite.ui.o2 o2Var = new com.tencent.mm.plugin.lite.ui.o2(this, new java.lang.ref.WeakReference(this));
        aa3.f0 f0Var = this.B1;
        f0Var.getClass();
        f0Var.f2521b = o2Var;
        f0Var.f2520a = true;
        aa3.h0.f2526a.a(f0Var);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).ek(java.lang.Boolean.TRUE);
        if (!kx5.n.h().l()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1293L, 112L, 1L);
        }
        super.onCreate(bundle);
        this.f46075e.f349795d.setWxKeyboardAction(new com.tencent.mm.plugin.lite.ui.p2(this));
        com.tencent.mm.ui.MMActivity.initLanguage(this);
        long longExtra = getIntent().getLongExtra("callbackUuid", -1L);
        if (longExtra > 0) {
            java.util.HashMap hashMap = com.tencent.mm.plugin.lite.w.f144518u;
            q80.f0 f0Var2 = (q80.f0) hashMap.get(java.lang.Long.valueOf(longExtra));
            if (f0Var2 != null) {
                f0Var2.onCreate(this.f46089q, this.f46102z);
                hashMap.remove(java.lang.Long.valueOf(longExtra));
            }
        }
        com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent = new com.tencent.mm.autogen.events.LiteAppLifeCycleEvent();
        am.ri riVar = liteAppLifeCycleEvent.f54468g;
        riVar.f7817a = 0;
        riVar.f7819c = this.f46095w;
        riVar.f7820d = java.lang.Long.valueOf(this.f46089q);
        riVar.f7821e = this.f46102z;
        riVar.f7818b = this.A1;
        liteAppLifeCycleEvent.e();
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentUI, com.tencent.liteapp.ui.WxaLiteAppTransparentBaseUI, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        android.os.Bundle bundleExtra = getIntent().getBundleExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
        if (bundleExtra != null && bundleExtra.containsKey("key_multi_task_common_info")) {
            ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Vi(0, "MultiTaskForSnapshotMinusScreen", 1048576, "");
        }
        com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent = new com.tencent.mm.autogen.events.LiteAppLifeCycleEvent();
        am.ri riVar = liteAppLifeCycleEvent.f54468g;
        riVar.f7817a = 3;
        riVar.f7819c = this.f46095w;
        riVar.f7820d = java.lang.Long.valueOf(this.f46089q);
        riVar.f7821e = this.f46102z;
        riVar.f7818b = this.A1;
        liteAppLifeCycleEvent.e();
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).ek(java.lang.Boolean.FALSE);
        aa3.h0.f2526a.d(this.B1);
        nf.g.b(this);
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentUI, com.tencent.liteapp.ui.WxaLiteAppTransparentBaseUI, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent = new com.tencent.mm.autogen.events.LiteAppLifeCycleEvent();
        am.ri riVar = liteAppLifeCycleEvent.f54468g;
        riVar.f7817a = 2;
        riVar.f7819c = this.f46095w;
        riVar.f7820d = java.lang.Long.valueOf(this.f46089q);
        riVar.f7821e = this.f46102z;
        riVar.f7818b = this.A1;
        liteAppLifeCycleEvent.e();
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentUI, com.tencent.liteapp.ui.WxaLiteAppTransparentBaseUI, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent = new com.tencent.mm.autogen.events.LiteAppLifeCycleEvent();
        am.ri riVar = liteAppLifeCycleEvent.f54468g;
        riVar.f7817a = 1;
        riVar.f7819c = this.f46095w;
        riVar.f7820d = java.lang.Long.valueOf(this.f46089q);
        riVar.f7821e = this.f46102z;
        riVar.f7818b = this.A1;
        liteAppLifeCycleEvent.e();
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentUI, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17 && j45.l.f()) {
            ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(com.tencent.mm.sdk.platformtools.x2.f193071a, this);
        } else {
            ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(com.tencent.mm.sdk.platformtools.x2.f193071a, this);
        }
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentUI, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void showPage(com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo) {
        super.showPage(pageInfo);
        boolean z17 = false;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_do_check_accessibility_safety_switch_liteapp, false);
        com.tencent.mars.xlog.Log.i("LiteAppSafetyHelper", "[getAccessibilitySafetySwitch] " + fj6);
        if (fj6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaLiteAppTransparentLiteUI", "start [checkCashierAccessibilitySecure]");
            com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo2 = this.f46079i;
            if (pageInfo2 == null) {
                com.tencent.mars.xlog.Log.e("LiteAppSafetyHelper", "current pageInfo is null or transparentLiteUI is null do not CheckAcccessibilitySecurityServiceList");
                return;
            }
            if (kotlin.jvm.internal.o.b(com.tencent.kinda.framework.kindalite.KindaLiteDef.WX_PAY_CASHIER_LITE_APP_ID, pageInfo2.appId) && kotlin.jvm.internal.o.b("pages/cashier/entry", pageInfo2.pageUrl)) {
                java.lang.String format = java.lang.String.format("current LiteApp is CashierLiteApp, current Page is %s", java.util.Arrays.copyOf(new java.lang.Object[]{pageInfo2.pageUrl}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
                com.tencent.mars.xlog.Log.i("LiteAppSafetyHelper", format);
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(android.R.id.content);
                if (this.C1) {
                    return;
                }
                this.C1 = true;
                java.util.ArrayList Di = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Di(true);
                if (Di.isEmpty()) {
                    com.tencent.mars.xlog.Log.e("LiteAppSafetyHelper", "[doCheckAccessibilitySecure] localServiceList isNullOrEmpty doNot BlockAccessibility");
                } else {
                    int Ni = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Ni(Di, true);
                    if (Ni == 0) {
                        com.tencent.mars.xlog.Log.e("LiteAppSafetyHelper", "[doCheckAccessibilitySecure] action is 0, return ");
                    } else {
                        com.tencent.mars.xlog.Log.i("LiteAppSafetyHelper", "accessibility secure action is " + Ni);
                        if (Ni != 0 && Ni != 1) {
                            if (Ni != 2) {
                                com.tencent.mars.xlog.Log.i("LiteAppSafetyHelper", "UnKnown action type: " + Ni);
                            } else {
                                z17 = true;
                            }
                        }
                        com.tencent.mars.xlog.Log.i("LiteAppSafetyHelper", "[doCheckAccessibilitySecure] status: " + z17);
                    }
                }
                if (viewGroup == null || isFinishing() || isDestroyed()) {
                    com.tencent.mars.xlog.Log.i("LiteAppSafetyHelper", "contentView is null no need action");
                    return;
                }
                com.tencent.mars.xlog.Log.i("LiteAppSafetyHelper", "get contentView success");
                viewGroup.setAccessibilityDelegate(new ra3.r(z17));
                if (z17) {
                    viewGroup.setImportantForAccessibility(4);
                } else {
                    viewGroup.setImportantForAccessibility(1);
                }
            }
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEventToTopPage(this.f46089q, "app.screenshot", (org.json.JSONObject) null);
    }
}
