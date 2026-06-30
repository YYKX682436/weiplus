package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes15.dex */
public class WxaLiteAppIsolateTaskUI extends com.tencent.liteapp.ui.WxaLiteAppUI implements q80.z, nf.m, com.tencent.mm.sdk.platformtools.f7 {
    public org.json.JSONObject N1;
    public final q80.w P1;
    public q80.x Q1;
    public int M1 = -1;
    public android.content.Intent O1 = null;

    public WxaLiteAppIsolateTaskUI() {
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        this.P1 = new aa3.f0();
        this.Q1 = null;
    }

    @Override // q80.z
    public void R1(q80.x xVar) {
        this.Q1 = xVar;
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void closeWindow(android.content.Intent intent) {
        if (intent.hasExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA)) {
            try {
                this.N1 = new org.json.JSONObject(intent.getStringExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA));
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
        if (keyEvent.getKeyCode() == 4 && (Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(this)) != null && ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) Ai).S6(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void g7(boolean z17) {
        android.content.Intent intent;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = z17 ? "onResume" : "onCreate";
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaLiteAppIsolateTaskUI", "addWindowFlags from=[%s]", objArr);
        this.M1 = getTaskId();
        android.content.Intent intent2 = getIntent();
        if (z17 && (intent = this.O1) != null) {
            intent2 = intent;
        }
        android.os.Bundle extras = intent2.getExtras();
        if (extras == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaLiteAppIsolateTaskUI", "getIntent getExtras is null");
            return;
        }
        android.os.Bundle bundle = extras.getBundle(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
        if (bundle == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaLiteAppIsolateTaskUI", "getBundle.extraData is null");
            return;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(bundle.getBoolean("showLiteAppOnLockedScreen", false));
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaLiteAppIsolateTaskUI", "canShowLiteAppOnLocked=%s, containsKey=%s", valueOf, java.lang.Boolean.valueOf(bundle.containsKey("showLiteAppOnLockedScreen")));
        if (valueOf.booleanValue()) {
            getWindow().addFlags(6815872);
        }
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

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        nf.g.a(this).g(i17, i18, intent);
        q80.x xVar = this.Q1;
        if (xVar != null) {
            xVar.onActivityResult(i17, i18, intent);
            this.Q1 = null;
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
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.lite.ui.f1(this));
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
        q80.w wVar = this.P1;
        com.tencent.mm.plugin.lite.ui.c1 c1Var = new com.tencent.mm.plugin.lite.ui.c1(this, weakReference);
        aa3.f0 f0Var = (aa3.f0) wVar;
        f0Var.getClass();
        f0Var.f2521b = c1Var;
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
        g7(false);
        ox5.a aVar = this.f46032g;
        if (aVar != null) {
            aVar.f349795d.setWxKeyboardAction(new com.tencent.mm.plugin.lite.ui.d1(this));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaLiteAppIsolateTaskUI", "onCreate delegate is null");
        }
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
        riVar.f7818b = this.N1;
        liteAppLifeCycleEvent.e();
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ext.ui.SwipeBackActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        android.app.ActivityManager activityManager;
        super.onDestroy();
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        aa3.h0.f2526a.d(this.P1);
        com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent = new com.tencent.mm.autogen.events.LiteAppLifeCycleEvent();
        am.ri riVar = liteAppLifeCycleEvent.f54468g;
        riVar.f7817a = 3;
        riVar.f7819c = this.f46114x;
        riVar.f7820d = java.lang.Long.valueOf(this.f46108r);
        riVar.f7821e = this.A;
        riVar.f7818b = this.N1;
        liteAppLifeCycleEvent.e();
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).ek(java.lang.Boolean.FALSE);
        nf.g.b(this);
        if (!isFinishing() || (activityManager = (android.app.ActivityManager) getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)) == null) {
            return;
        }
        for (android.app.ActivityManager.AppTask appTask : activityManager.getAppTasks()) {
            if (android.os.Build.VERSION.SDK_INT >= 29 && this.M1 == appTask.getTaskInfo().taskId) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaLiteAppIsolateTaskUI", "task.remove isolate task");
                appTask.finishAndRemoveTask();
            }
        }
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaLiteAppIsolateTaskUI", "onNewIntent=%s", intent.toString());
        this.O1 = intent;
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
        riVar.f7818b = this.N1;
        liteAppLifeCycleEvent.e();
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ext.ui.SwipeBackActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        g7(true);
        com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent = new com.tencent.mm.autogen.events.LiteAppLifeCycleEvent();
        am.ri riVar = liteAppLifeCycleEvent.f54468g;
        riVar.f7817a = 1;
        riVar.f7819c = this.f46114x;
        riVar.f7820d = java.lang.Long.valueOf(this.f46108r);
        riVar.f7821e = this.A;
        riVar.f7818b = this.N1;
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
        com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEventToTopPage(this.f46108r, "app.screenshot", (org.json.JSONObject) null);
    }
}
