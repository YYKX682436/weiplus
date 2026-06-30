package com.tencent.mm.plugin.voip.ui;

@db5.a(32)
@pk.b(pk.a.ALL)
@gm0.a2
@ul5.d(0)
/* loaded from: classes14.dex */
public class VideoActivity extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.plugin.voip.ui.f {

    /* renamed from: d, reason: collision with root package name */
    public hq4.a f176931d;

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void H5(int i17, java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public android.content.Context J4() {
        return null;
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void M4(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void Q2(boolean z17) {
    }

    public hq4.a T6() {
        if (this.f176931d == null) {
            if (getIntent().hasExtra("page_info")) {
                ((ao5.s) ((bo5.e) i95.n0.c(bo5.e.class))).getClass();
                this.f176931d = new ao5.w(this);
            } else {
                this.f176931d = ((y03.e) i95.n0.c(y03.e.class)).I4(this);
            }
        }
        return this.f176931d;
    }

    public void U6() {
        super.finish();
    }

    public void V6(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setTitleVisibility(8);
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void W2() {
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void dealContentView(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voip/ui/VideoActivity", "com/tencent/mm/plugin/voip/ui/VideoActivity", "dealContentView", "(Landroid/view/View;)V", this, array);
        T6().dealContentView(view);
        yj0.a.h(this, "com/tencent/mm/plugin/voip/ui/VideoActivity", "com/tencent/mm/plugin/voip/ui/VideoActivity", "dealContentView", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void e4(java.lang.String str) {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        yj0.a.a("com/tencent/mm/plugin/voip/ui/VideoActivity", "com/tencent/mm/plugin/voip/ui/VideoActivity", "finish", "()V", this);
        T6().finish();
        if (mm.k.H1.h()) {
            android.app.ActivityManager activityManager = (android.app.ActivityManager) getSystemService(android.app.ActivityManager.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.app.ActivityManager.AppTask appTask : activityManager.getAppTasks()) {
                android.content.ComponentName component = appTask.getTaskInfo().baseIntent.getComponent();
                if (component != null && com.tencent.mm.sdk.platformtools.x2.f193072b.equals(component.getPackageName())) {
                    arrayList.add(appTask);
                }
            }
            if (arrayList.size() == 1) {
                android.app.ActivityManager.AppTask appTask2 = (android.app.ActivityManager.AppTask) arrayList.get(0);
                android.content.ComponentName component2 = appTask2.getTaskInfo().baseIntent.getComponent();
                if (component2 != null && component2.getClassName().equals(getClass().getName())) {
                    appTask2.setExcludeFromRecents(true);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/voip/ui/VideoActivity", "com/tencent/mm/plugin/voip/ui/VideoActivity", "finish", "()V");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return T6().getForceOrientation();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return T6().getLayoutId();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return super.getResources();
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void i2(cv.v0 v0Var) {
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void k() {
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean needResetStatusBarColorOnActivityCreate() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean noActionBar() {
        return true;
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void o5(long j17) {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        T6().onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (T6().onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onBusinessPermissionDenied(java.lang.String str) {
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onBusinessPermissionGranted(java.lang.String str) {
        xq4.a aVar;
        dr4.c0 c0Var;
        android.util.Size size;
        com.tencent.mm.plugin.voip.model.i1 i1Var = com.tencent.mm.plugin.voip.model.h1.a().A;
        synchronized (i1Var.f176653h) {
            i1Var.f176666u.post(new com.tencent.mm.plugin.voip.model.i1$$b(i1Var));
        }
        dr4.p1 p1Var = ((b13.m) gq4.v.Bi().f176559b).f176375f;
        if (p1Var == null || (aVar = p1Var.f242704c) == null) {
            return;
        }
        aVar.e();
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (!j35.u.h(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.CAMERA")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPRenderMgr", "camera start failed casue no permisson");
            return;
        }
        dr4.x1 x1Var = p1Var.f242708g;
        if (x1Var == null || (c0Var = x1Var.f242762b) == null) {
            return;
        }
        boolean z17 = aVar.b(p1Var.f242701J, true) == 1;
        p1Var.f242707f = z17;
        if (z17) {
            android.graphics.SurfaceTexture surfaceTexture = c0Var.f242603f;
            if (surfaceTexture != null) {
                ((zq4.b) aVar).f475054n = surfaceTexture;
            }
            zq4.b bVar = (zq4.b) aVar;
            gq4.v.Bi().J(bVar.f475043c);
            xq4.a aVar2 = p1Var.f242704c;
            if (aVar2 == null || bVar.f475046f == null) {
                return;
            }
            aVar2.c();
            p1Var.f242706e = true;
            xq4.a aVar3 = p1Var.f242704c;
            if (aVar3 == null || (size = ((zq4.b) aVar3).f475046f) == null) {
                return;
            }
            p1Var.p(size);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_voip_pad_mode_landscape_forbily_enable, false)) {
            try {
                if (android.provider.Settings.Global.getInt(getContentResolver(), "dynamic_device_characteristics") == 1) {
                    com.tencent.mars.xlog.Log.i("pad_mode_landscape_forbily", "setRequestedOrientation LANDSCAPE");
                    setRequestedOrientation(0);
                } else {
                    com.tencent.mars.xlog.Log.i("pad_mode_landscape_forbily", "setRequestedOrientation PORTRAIT");
                    setRequestedOrientation(1);
                }
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("pad_mode_landscape_forbily", "setRequestedOrientation FAILED");
            }
        }
        T6().onConfigurationChanged(configuration);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_voip_pad_mode_landscape_forbily_enable, false)) {
            try {
                if (android.provider.Settings.Global.getInt(getContentResolver(), "dynamic_device_characteristics") == 1) {
                    com.tencent.mars.xlog.Log.i("pad_mode_landscape_forbily", "setRequestedOrientation LANDSCAPE");
                    setRequestedOrientation(0);
                } else {
                    com.tencent.mars.xlog.Log.i("pad_mode_landscape_forbily", "setRequestedOrientation PORTRAIT");
                    setRequestedOrientation(1);
                }
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("pad_mode_landscape_forbily", "setRequestedOrientation FAILED");
            }
        } else {
            setRequestedOrientation(1);
        }
        if (gq4.v.wi().f365983q == 0) {
            gq4.v.wi().f365983q = java.lang.System.currentTimeMillis();
        }
        setTransparentTheme(true);
        T6().onCreate(bundle);
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.VideoActivity)).Rj(this, iy1.a.Voip);
        getSwipeBackLayout().setAutoResetToNoTranslucent(false);
        getSwipeBackLayout().setDragListener(new com.tencent.mm.plugin.voip.ui.p0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        T6().onDestroy();
        if (com.tencent.mm.ui.fj.b(this)) {
            com.tencent.mm.ui.fj.d(com.tencent.mm.plugin.voip.ui.VideoActivity.class, 0);
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voip/ui/VideoActivity", "com/tencent/mm/plugin/voip/ui/VideoActivity", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", this, array);
        boolean z17 = T6().onKeyDown(i17, keyEvent) || super.onKeyDown(i17, keyEvent);
        yj0.a.i(z17, this, "com/tencent/mm/plugin/voip/ui/VideoActivity", "com/tencent/mm/plugin/voip/ui/VideoActivity", "onKeyDown", "(ILandroid/view/KeyEvent;)Z");
        return z17;
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        T6().onNewIntent(intent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        T6().onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        T6().onPostResume();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        T6().onRequestPermissionsResult(i17, strArr, iArr);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        T6().onResume();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        T6().onStart();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        T6().onStop();
        super.onStop();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean onSwipeBackFinish() {
        super.onSwipeBackFinish();
        T6().onSwipeBackFinish();
        T6().onStop();
        return true;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        super.onTrimMemory(i17);
        T6().onTrimMemory(i17);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onUserLeaveHint() {
        if (T6().onUserLeaveHint()) {
            return;
        }
        super.onUserLeaveHint();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public android.view.View provideCustomActivityContentView() {
        return T6().provideCustomActivityContentView();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, android.app.Activity
    public void setRequestedOrientation(int i17) {
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_voip_pad_mode_landscape_forbily_enable, false)) {
            if (android.os.Build.VERSION.SDK_INT != 26) {
                super.setRequestedOrientation(i17);
                return;
            }
            try {
                super.setRequestedOrientation(i17);
                return;
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Voip.VideoActivity", "setRequestedOrientation() couldn't be called successfully");
                return;
            }
        }
        try {
            if (android.provider.Settings.Global.getInt(getContentResolver(), "dynamic_device_characteristics") == 1) {
                com.tencent.mars.xlog.Log.i("pad_mode_landscape_forbily", "super.setRequestedOrientation LANDSCAPE");
                super.setRequestedOrientation(0);
            } else {
                com.tencent.mars.xlog.Log.i("pad_mode_landscape_forbily", "super.setRequestedOrientation PORTRAIT");
                super.setRequestedOrientation(1);
            }
        } catch (java.lang.Exception unused2) {
            com.tencent.mars.xlog.Log.e("pad_mode_landscape_forbily", "super.setRequestedOrientation FAILED");
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setScreenEnable(boolean z17) {
        super.setScreenEnable(z17);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        T6().importUIComponents(hashSet);
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void u() {
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void v1() {
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void y(int i17) {
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void z(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void z1(int i17, int i18) {
    }
}
