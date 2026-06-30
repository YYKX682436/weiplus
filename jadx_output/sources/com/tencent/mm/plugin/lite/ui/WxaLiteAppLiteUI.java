package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes15.dex */
public class WxaLiteAppLiteUI extends com.tencent.liteapp.ui.WxaLiteAppUI implements q80.z, nf.m, com.tencent.mm.sdk.platformtools.f7 {
    public static final /* synthetic */ int S1 = 0;
    public org.json.JSONObject M1;
    public final q80.w N1;
    public pa3.p O1;
    public pa3.i P1;
    public x93.b Q1;
    public q80.x R1;

    public WxaLiteAppLiteUI() {
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        this.N1 = new aa3.f0();
        this.O1 = null;
        this.P1 = null;
        this.Q1 = null;
        this.R1 = null;
    }

    public static /* synthetic */ void g7(com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI wxaLiteAppLiteUI, boolean z17) {
        if (wxaLiteAppLiteUI.h7().booleanValue()) {
            return;
        }
        super.navigateBack(z17);
    }

    @Override // q80.z
    public void R1(q80.x xVar) {
        this.R1 = xVar;
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

    @Override // com.tencent.mm.ext.ui.SwipeBackActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        zk3.c Ai;
        if (keyEvent.getKeyCode() == 4 && (Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(this)) != null && ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) Ai).S6(keyEvent) && this.O1 == null && this.P1 == null) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
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

    public final java.lang.Boolean h7() {
        if ((this.O1 != null || this.P1 != null) && this.K && !this.W) {
            com.tencent.liteapp.gen.LiteAppOpenScene liteAppOpenScene = this.f46033h.referrerScene;
            java.util.Objects.toString(liteAppOpenScene);
            com.tencent.liteapp.gen.LiteAppOpenScene liteAppOpenScene2 = com.tencent.liteapp.gen.LiteAppOpenScene.STAR;
            if (liteAppOpenScene != liteAppOpenScene2 && liteAppOpenScene != com.tencent.liteapp.gen.LiteAppOpenScene.FLOAT) {
                return java.lang.Boolean.FALSE;
            }
            pa3.p pVar = this.O1;
            boolean z17 = false;
            if (pVar != null && liteAppOpenScene == liteAppOpenScene2 && !pVar.U(2, false)) {
                z17 = true;
            }
            pa3.i iVar = this.P1;
            if (iVar != null && liteAppOpenScene == com.tencent.liteapp.gen.LiteAppOpenScene.FLOAT && !iVar.m0(2)) {
                z17 = true;
            }
            return java.lang.Boolean.valueOf(!z17);
        }
        return java.lang.Boolean.FALSE;
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void hideKeyboard() {
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        aa3.h0.f2526a.b();
        super.hideKeyboard();
    }

    @Override // com.tencent.mm.ext.ui.SwipeBackActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.HashSet hashSet = new java.util.HashSet(java.util.Collections.emptySet());
        ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).wi(this, hashSet);
        return hashSet;
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

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void navigateBack(final boolean z17) {
        runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI.g7(com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI.this, z17);
            }
        });
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        nf.g.a(this).g(i17, i18, intent);
        q80.x xVar = this.R1;
        if (xVar != null) {
            xVar.onActivityResult(i17, i18, intent);
            this.R1 = null;
        }
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (h7().booleanValue()) {
            return;
        }
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
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.lite.ui.w1(this));
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
        java.lang.String str;
        android.app.Activity activity;
        android.app.Activity activity2;
        com.tencent.mm.plugin.lite.o oVar = com.tencent.mm.plugin.lite.p.f144149a;
        if (!com.tencent.mm.plugin.lite.p.f144150b.get()) {
            kd.c.b("MicroMsg.WxaLiteAppLiteUI", "LiteAppProcessProfileInit has no init.", new java.lang.Object[0]);
            this.f46038p = true;
            super.onCreate(bundle);
            finish();
            return;
        }
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        q80.w wVar = this.N1;
        com.tencent.mm.plugin.lite.ui.t1 t1Var = new com.tencent.mm.plugin.lite.ui.t1(this, weakReference);
        aa3.f0 f0Var = (aa3.f0) wVar;
        f0Var.getClass();
        f0Var.f2521b = t1Var;
        f0Var.f2520a = true;
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
        if (this.f46032g == null) {
            return;
        }
        pa3.s sVar = (pa3.s) com.tencent.mm.plugin.lite.w.f144519v.get(java.lang.Long.valueOf(this.f46108r));
        if (sVar != null) {
            com.tencent.mm.plugin.lite.w.j(this, this.f46114x, this.f46108r, this.f46120z, this.f46117y, sVar);
            pa3.p pVar = this.O1;
            if (pVar != null && (str = pVar.H) != null) {
                com.tencent.mars.xlog.Log.i("LiteAppMultiTaskHelper", "coverBitmapToAvoidWhiteScreen coverBitmapPath: ".concat(str));
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                android.graphics.Bitmap a17 = al3.b.f5849a.a(str, null);
                h0Var.f310123d = a17;
                if (a17 != null) {
                    ak3.c cVar = pVar.f300111d;
                    android.widget.ImageView imageView = new android.widget.ImageView(cVar != null ? cVar.getActivity() : null);
                    android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                    imageView.setLayoutParams(layoutParams);
                    imageView.setVisibility(0);
                    imageView.setImageBitmap((android.graphics.Bitmap) h0Var.f310123d);
                    android.widget.FrameLayout frameLayout = (cVar == null || (activity2 = cVar.getActivity()) == null) ? null : new android.widget.FrameLayout(activity2);
                    if (frameLayout != null) {
                        frameLayout.setLayoutParams(layoutParams);
                        frameLayout.addView(imageView);
                        if (cVar != null && (activity = cVar.getActivity()) != null) {
                            activity.addContentView(frameLayout, layoutParams);
                        }
                        pm0.v.V(200L, new pa3.m(imageView, h0Var));
                    }
                }
            }
        }
        this.f46032g.f349795d.setWxKeyboardAction(new com.tencent.mm.plugin.lite.ui.u1(this));
        com.tencent.mm.ui.MMActivity.initLanguage(this);
        android.view.View decorView = getWindow().getDecorView();
        if (decorView instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) decorView;
            if (viewGroup.getChildCount() > 0) {
                android.view.View childAt = viewGroup.getChildAt(0);
                zk3.c Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(this);
                if (Ai != null) {
                    ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) Ai).R6(childAt, null, false);
                }
            }
        }
        if (u46.l.c(this.f46114x, "wxalite2fd372f050eecd471a4392786dfae78c")) {
            ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FTSSOSHomeWebViewUI)).Rj(this, iy1.a.SearchHome);
        }
        long longExtra = getIntent().getLongExtra("callbackUuid", -1L);
        if (longExtra > 0) {
            java.util.HashMap hashMap = com.tencent.mm.plugin.lite.w.f144518u;
            q80.f0 f0Var2 = (q80.f0) hashMap.get(java.lang.Long.valueOf(longExtra));
            if (f0Var2 != null) {
                f0Var2.onCreate(this.f46108r, this.A);
                hashMap.remove(java.lang.Long.valueOf(longExtra));
            }
        }
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
        android.os.Bundle bundleExtra = getIntent().getBundleExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
        if (bundleExtra != null && bundleExtra.containsKey("key_multi_task_common_info")) {
            ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Vi(0, "MultiTaskForSnapshotMinusScreen", 1048576, "");
        }
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
        nf.g.b(this);
        pa3.p pVar = this.O1;
        if (pVar != null) {
            pVar.getClass();
        }
        pa3.i iVar = this.P1;
        if (iVar != null) {
            iVar.o0();
        }
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ext.ui.SwipeBackActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((com.tencent.mm.ui.feature.api.screenshot.j1) ((ct.e3) i95.n0.c(ct.e3.class))).Ni(null);
        kd.c.c("MicroMsg.WxaLiteAppLiteUI", "onPause: unregistered screenshot share provider", new java.lang.Object[0]);
        com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent = new com.tencent.mm.autogen.events.LiteAppLifeCycleEvent();
        am.ri riVar = liteAppLifeCycleEvent.f54468g;
        riVar.f7817a = 2;
        riVar.f7819c = this.f46114x;
        riVar.f7820d = java.lang.Long.valueOf(this.f46108r);
        riVar.f7821e = this.A;
        riVar.f7818b = this.M1;
        liteAppLifeCycleEvent.e();
        pa3.p pVar = this.O1;
        if (pVar != null) {
            pVar.A();
        }
        pa3.i iVar = this.P1;
        if (iVar != null) {
            iVar.z();
        }
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ext.ui.SwipeBackActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.Q1 == null) {
            final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
            this.Q1 = new x93.b(new yz5.a() { // from class: com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI$$a
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo;
                    int i17 = com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI.S1;
                    com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI wxaLiteAppLiteUI = (com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI) weakReference.get();
                    return java.lang.Long.valueOf((wxaLiteAppLiteUI == null || (pageInfo = wxaLiteAppLiteUI.f46036n) == null) ? -1L : pageInfo.pageId);
                }
            });
        }
        ((com.tencent.mm.ui.feature.api.screenshot.j1) ((ct.e3) i95.n0.c(ct.e3.class))).Ni(this.Q1);
        kd.c.c("MicroMsg.WxaLiteAppLiteUI", "onResume: registered screenshot share provider, appUuid=%d, appId=%s", java.lang.Long.valueOf(this.f46108r), this.f46114x);
        com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent = new com.tencent.mm.autogen.events.LiteAppLifeCycleEvent();
        am.ri riVar = liteAppLifeCycleEvent.f54468g;
        riVar.f7817a = 1;
        riVar.f7819c = this.f46114x;
        riVar.f7820d = java.lang.Long.valueOf(this.f46108r);
        riVar.f7821e = this.A;
        riVar.f7818b = this.M1;
        liteAppLifeCycleEvent.e();
        pa3.p pVar = this.O1;
        if (pVar != null) {
            pVar.z();
        }
        pa3.i iVar = this.P1;
        if (iVar != null) {
            iVar.x();
        }
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

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setIsPopGestureEnabled(boolean z17) {
        super.setIsPopGestureEnabled(z17);
        pa3.p pVar = this.O1;
        if (pVar != null) {
            pVar.d0();
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEventToTopPage(this.f46108r, "app.screenshot", (org.json.JSONObject) null);
    }
}
