package com.tencent.mm.plugin.ting.ui;

/* loaded from: classes15.dex */
public class TingPostLiteAppUI extends com.tencent.liteapp.ui.WxaLiteAppUI implements q80.z, com.tencent.mm.sdk.platformtools.f7 {
    public org.json.JSONObject M1;
    public final q80.w N1;
    public q80.x O1;

    public TingPostLiteAppUI() {
        new java.util.HashMap();
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        this.N1 = new aa3.f0();
        this.O1 = null;
    }

    @Override // q80.z
    public void R1(q80.x xVar) {
        this.O1 = xVar;
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void closeWindow(android.content.Intent intent) {
        if (intent.hasExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA)) {
            try {
                this.M1 = new org.json.JSONObject(intent.getStringExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA));
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

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void hideKeyboard() {
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        aa3.h0.f2526a.b();
        super.hideKeyboard();
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public boolean isDarkMode() {
        return com.tencent.mm.ui.bk.C();
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void keyboardEnable(boolean z17) {
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        aa3.h0.f2526a.c(z17);
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        q80.x xVar = this.O1;
        if (xVar != null) {
            xVar.onActivityResult(i17, i18, intent);
            this.O1 = null;
        }
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onCheckBaseLibSumFail(java.lang.String str, java.util.List list) {
        super.onCheckBaseLibSumFail(str, list);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = this.X.I;
        ((com.tencent.mm.feature.lite.i) g0Var).getClass();
        com.tencent.mm.plugin.lite.logic.g1.s().B(liteAppReporter);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onCheckLiteAppVersionError(int i17) {
        ((ku5.t0) ku5.t0.f312615d).B(new im4.h(this));
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onCheckSumFail(java.lang.String str, java.util.List list) {
        super.onCheckSumFail(str, list);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = this.X.I;
        ((com.tencent.mm.feature.lite.i) g0Var).getClass();
        com.tencent.mm.plugin.lite.logic.g1.s().C(str, liteAppReporter);
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        q80.w wVar = this.N1;
        im4.e eVar = new im4.e(this, weakReference);
        aa3.f0 f0Var = (aa3.f0) wVar;
        f0Var.getClass();
        f0Var.f2521b = eVar;
        ((aa3.f0) wVar).f2520a = true;
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        aa3.h0.f2526a.a(wVar);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).ek(java.lang.Boolean.TRUE);
        if (!kx5.n.h().l()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1293L, 112L, 1L);
        }
        if (com.tencent.mm.ui.bk.C()) {
            setTheme(com.tencent.mm.R.style.f494622yf);
        } else {
            setTheme(com.tencent.mm.R.style.f494623yg);
        }
        super.onCreate(bundle);
        this.f46032g.f349795d.setWxKeyboardAction(new im4.f(this));
        com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent = new com.tencent.mm.autogen.events.LiteAppLifeCycleEvent();
        am.ri riVar = liteAppLifeCycleEvent.f54468g;
        riVar.f7817a = 0;
        riVar.f7819c = this.f46114x;
        riVar.f7820d = java.lang.Long.valueOf(this.f46108r);
        riVar.f7821e = this.A;
        riVar.f7818b = this.M1;
        liteAppLifeCycleEvent.e();
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ext.ui.SwipeBackActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        aa3.h0.f2526a.d(this.N1);
        com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent = new com.tencent.mm.autogen.events.LiteAppLifeCycleEvent();
        am.ri riVar = liteAppLifeCycleEvent.f54468g;
        riVar.f7817a = 3;
        riVar.f7819c = this.f46114x;
        riVar.f7820d = java.lang.Long.valueOf(this.f46108r);
        riVar.f7821e = this.A;
        riVar.f7818b = this.M1;
        liteAppLifeCycleEvent.e();
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).ek(java.lang.Boolean.FALSE);
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ext.ui.SwipeBackActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent = new com.tencent.mm.autogen.events.LiteAppLifeCycleEvent();
        am.ri riVar = liteAppLifeCycleEvent.f54468g;
        riVar.f7817a = 2;
        riVar.f7819c = this.f46114x;
        riVar.f7820d = java.lang.Long.valueOf(this.f46108r);
        riVar.f7821e = this.A;
        riVar.f7818b = this.M1;
        liteAppLifeCycleEvent.e();
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ext.ui.SwipeBackActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent = new com.tencent.mm.autogen.events.LiteAppLifeCycleEvent();
        am.ri riVar = liteAppLifeCycleEvent.f54468g;
        riVar.f7817a = 1;
        riVar.f7819c = this.f46114x;
        riVar.f7820d = java.lang.Long.valueOf(this.f46108r);
        riVar.f7821e = this.A;
        riVar.f7818b = this.M1;
        liteAppLifeCycleEvent.e();
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(com.tencent.mm.sdk.platformtools.x2.f193071a, this);
        } else {
            ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(com.tencent.mm.sdk.platformtools.x2.f193071a, this);
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        new org.json.JSONObject().toString();
        com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEventToTopPage(this.f46108r, "app.screenshot", (org.json.JSONObject) null);
    }
}
