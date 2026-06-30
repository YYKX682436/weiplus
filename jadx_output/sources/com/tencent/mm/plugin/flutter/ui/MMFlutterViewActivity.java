package com.tencent.mm.plugin.flutter.ui;

@db5.a(4128)
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/flutter/ui/MMFlutterViewActivity;", "Lcom/tencent/mm/ui/vas/VASActivity;", "Lpi0/o0;", "", "Lpi0/w0;", "Lzc/x;", "<init>", "()V", "flutter-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public class MMFlutterViewActivity extends com.tencent.mm.ui.vas.VASActivity implements pi0.o0, pi0.w0, zc.x {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f137305t = 0;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.flutter.ui.FlutterViewEngine f137308f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.flutter.ui.FlutterPageStyle f137309g;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.flutter.ui.FlutterPageInfo f137311i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f137312m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f137313n;

    /* renamed from: p, reason: collision with root package name */
    public android.view.GestureDetector f137315p;

    /* renamed from: q, reason: collision with root package name */
    public long f137316q;

    /* renamed from: r, reason: collision with root package name */
    public long f137317r;

    /* renamed from: s, reason: collision with root package name */
    public f03.a f137318s;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f137306d = "MicroMsg.MMFlutterViewActivity@" + hashCode();

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f137307e = jz5.h.b(new w03.j(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f137310h = jz5.h.b(new w03.i(this));

    /* renamed from: o, reason: collision with root package name */
    public boolean f137314o = true;

    @Override // pi0.o0
    public com.tencent.mm.flutter.ui.FlutterPageInfo F5() {
        com.tencent.mm.flutter.ui.FlutterPageInfo flutterPageInfo = this.f137311i;
        kotlin.jvm.internal.o.d(flutterPageInfo);
        return flutterPageInfo;
    }

    @Override // pi0.o0
    public bj0.t P1() {
        na5.a activityAnimLifecycle = getActivityAnimLifecycle();
        w03.h hVar = activityAnimLifecycle instanceof w03.h ? (w03.h) activityAnimLifecycle : null;
        if (hVar != null) {
            return (w03.f) ((jz5.n) hVar.f441883f).getValue();
        }
        return null;
    }

    public android.view.ViewGroup S2() {
        return U6();
    }

    @Override // pi0.o0
    public com.tencent.mm.flutter.ui.FlutterPageStyle S3() {
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = this.f137309g;
        kotlin.jvm.internal.o.d(flutterPageStyle);
        return flutterPageStyle;
    }

    @Override // pi0.o0
    public void S5(boolean z17) {
        if (getF65848t()) {
            this.f137314o = z17;
            com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = getSwipeBackLayout();
            if (swipeBackLayout != null) {
                swipeBackLayout.setEnableGesture(z17);
            }
        }
    }

    public android.widget.FrameLayout U6() {
        return (android.widget.FrameLayout) ((jz5.n) this.f137307e).getValue();
    }

    public boolean V6() {
        return this instanceof com.tencent.mm.plugin.wenote.flutter.WeNoteFlutterUI;
    }

    public final void W6() {
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine;
        io.flutter.embedding.engine.renderer.FlutterRenderer attachedRenderer;
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine2 = this.f137308f;
        boolean z17 = false;
        if (flutterViewEngine2 != null) {
            io.flutter.embedding.android.FlutterView flutterView = flutterViewEngine2.f68137o;
            if ((flutterView == null || (attachedRenderer = flutterView.getAttachedRenderer()) == null || !attachedRenderer.isDisplayingFlutterUi()) ? false : true) {
                z17 = true;
            }
        }
        if (!z17 || (flutterViewEngine = this.f137308f) == null) {
            return;
        }
        flutterViewEngine.i();
    }

    public final void X6(int i17) {
        int i18 = android.os.Build.VERSION.SDK_INT;
        getWindow().clearFlags(134217728);
        getWindow().setNavigationBarColor(i17);
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & (-513));
        if (i18 >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
    }

    public final void Y6() {
        if (!this.f137312m) {
            com.tencent.mars.xlog.Log.i(this.f137306d, "switchToSurfaceView not resumed");
            com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = this.f137309g;
            this.f137313n = (flutterPageStyle == null || flutterPageStyle.f68126p) ? false : true;
            return;
        }
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = this.f137308f;
        if (flutterViewEngine != null) {
            io.flutter.embedding.android.FlutterView flutterView = flutterViewEngine.f68137o;
            if (flutterView != null) {
                flutterView.setEnableSwitchSurface(true);
            }
            flutterViewEngine.j();
        }
    }

    public final void Z6() {
        this.f137313n = false;
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = this.f137308f;
        if (flutterViewEngine != null) {
            flutterViewEngine.i();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean convertActivityFromTranslucent() {
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = this.f137309g;
        return flutterPageStyle != null && flutterPageStyle.f68117d == 0;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity
    public na5.c createVASAnimLifecycle() {
        return new w03.h();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        android.view.GestureDetector gestureDetector = this.f137315p;
        if (gestureDetector == null) {
            kotlin.jvm.internal.o.o("gestureDetector");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(ev6);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/flutter/ui/MMFlutterViewActivity", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/flutter/ui/MMFlutterViewActivity", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if ((ev6.getAction() == 0) && this.f137316q == 0) {
            this.f137316q = java.lang.System.currentTimeMillis();
        }
        return super.dispatchTouchEvent(ev6);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = this.f137309g;
        if (flutterPageStyle != null && !(this instanceof com.tencent.mm.plugin.wenote.flutter.WeNoteFlutterUI)) {
            kotlin.jvm.internal.o.d(flutterPageStyle);
            if (flutterPageStyle.f68117d == 1) {
                overridePendingTransition(-1, -1);
            } else {
                int i17 = flutterPageStyle.f68118e;
                if (i17 == -1) {
                    overridePendingTransition(-1, -1);
                } else if (i17 == 1) {
                    overridePendingTransition(-1, com.tencent.mm.R.anim.f477855dd);
                }
            }
        }
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = this.f137308f;
        if (flutterViewEngine != null) {
            flutterViewEngine.b();
        }
    }

    @Override // pi0.o0
    public androidx.appcompat.app.AppCompatActivity getActivity() {
        return this;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    /* renamed from: isSupportNavigationSwipeBack */
    public boolean getF65848t() {
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = (com.tencent.mm.flutter.ui.FlutterPageStyle) ((jz5.n) this.f137310h).getValue();
        return flutterPageStyle != null && flutterPageStyle.f68117d == 0;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean needResetStatusBarColorOnActivityCreate() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean noActionBar() {
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = this.f137308f;
        if (flutterViewEngine != null && flutterViewEngine.f68135m != null && flutterViewEngine.f68137o != null) {
            flutterViewEngine.f68133h.getActivityControlSurface().onActivityResult(i17, i18, intent);
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mars.xlog.Log.i(this.f137306d, "onBackPressed");
        java.util.Iterator it = com.tencent.mm.ui.component.UIComponentActivity.activeUIComponents$default(this, false, 1, null).iterator();
        while (it.hasNext()) {
            if (((com.tencent.mm.ui.component.UIComponent) it.next()).onBackPressed()) {
                return;
            }
        }
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = this.f137308f;
        if (flutterViewEngine != null) {
            flutterViewEngine.f68133h.getNavigationChannel().popRoute();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        f03.a aVar = this.f137318s;
        if (aVar == null || (lVar = aVar.f258416a) == null) {
            return;
        }
        lVar.invoke(newConfig);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle;
        java.lang.String str2 = this.f137306d;
        com.tencent.mars.xlog.Log.i(str2, "onCreate");
        this.f137311i = (com.tencent.mm.flutter.ui.FlutterPageInfo) getIntent().getParcelableExtra("page_info");
        this.f137309g = (com.tencent.mm.flutter.ui.FlutterPageStyle) ((jz5.n) this.f137310h).getValue();
        io.flutter.embedding.engine.FlutterEngineCache flutterEngineCache = io.flutter.embedding.engine.FlutterEngineCache.getInstance();
        com.tencent.mm.flutter.ui.FlutterPageInfo flutterPageInfo = this.f137311i;
        if (flutterPageInfo == null || (str = flutterPageInfo.f68113d) == null) {
            str = "";
        }
        if (flutterEngineCache.get(str) == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("launch with cached engine id ");
            com.tencent.mm.flutter.ui.FlutterPageInfo flutterPageInfo2 = this.f137311i;
            sb6.append(flutterPageInfo2 != null ? flutterPageInfo2.f68113d : null);
            sb6.append(", but it has been destroyed");
            com.tencent.mars.xlog.Log.e(str2, sb6.toString());
            super.onCreate(bundle);
            finish();
            return;
        }
        if (bundle == null && !V6() && (flutterPageStyle = this.f137309g) != null) {
            if (flutterPageStyle.f68120g) {
                overridePendingTransition(com.tencent.mm.ui.uc.f211078a, com.tencent.mm.ui.uc.f211079b);
            }
            if (flutterPageStyle.f68117d == 1) {
                overridePendingTransition(-1, -1);
            } else {
                int i17 = flutterPageStyle.f68118e;
                if (i17 == -1) {
                    overridePendingTransition(-1, -1);
                } else if (i17 == 1) {
                    overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477729q);
                }
            }
        }
        super.onCreate(bundle);
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = new com.tencent.mm.flutter.ui.FlutterViewEngine(this);
        this.f137308f = flutterViewEngine;
        flutterViewEngine.f();
        getWindow().getDecorView().setSystemUiVisibility(1280);
        getWindow().setStatusBarColor(0);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setNavigationBarColor(0);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.w(new android.graphics.drawable.ColorDrawable(0));
            supportActionBar.o();
        }
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle2 = this.f137309g;
        if ((flutterPageStyle2 != null ? flutterPageStyle2.f68123m : null) != null) {
            java.lang.Integer num = flutterPageStyle2 != null ? flutterPageStyle2.f68123m : null;
            kotlin.jvm.internal.o.d(num);
            X6(num.intValue());
        } else {
            X6(getResources().getColor(com.tencent.mm.R.color.f478489a));
            boolean z17 = !com.tencent.mm.ui.bk.E(getResources());
            if (fp.h.c(30)) {
                if (z17) {
                    android.view.WindowInsetsController windowInsetsController = getWindow().getDecorView().getWindowInsetsController();
                    if (windowInsetsController != null) {
                        windowInsetsController.setSystemBarsAppearance(16, 16);
                    }
                } else {
                    android.view.WindowInsetsController windowInsetsController2 = getWindow().getDecorView().getWindowInsetsController();
                    if (windowInsetsController2 != null) {
                        windowInsetsController2.setSystemBarsAppearance(0, 16);
                    }
                }
            }
            boolean z18 = !com.tencent.mm.ui.bk.E(getResources());
            if (fp.h.c(30)) {
                if (z18) {
                    android.view.WindowInsetsController windowInsetsController3 = getWindow().getDecorView().getWindowInsetsController();
                    if (windowInsetsController3 != null) {
                        windowInsetsController3.setSystemBarsAppearance(8, 8);
                    }
                } else {
                    android.view.WindowInsetsController windowInsetsController4 = getWindow().getDecorView().getWindowInsetsController();
                    if (windowInsetsController4 != null) {
                        windowInsetsController4.setSystemBarsAppearance(0, 8);
                    }
                }
            } else if (fp.h.c(21)) {
                if (z18) {
                    getWindow().clearFlags(67108864);
                    getWindow().addFlags(Integer.MIN_VALUE);
                    getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 8192);
                } else {
                    getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & (-8193));
                }
            }
        }
        U6().setOnApplyWindowInsetsListener(new w03.k(this));
        this.f137315p = new android.view.GestureDetector(this, new w03.l(this));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i(this.f137306d, "onDestroy");
        super.onDestroy();
        this.f137308f = null;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        this.f137312m = false;
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = this.f137308f;
        if (flutterViewEngine != null && flutterViewEngine.f68135m != null && flutterViewEngine.f68137o != null) {
            flutterViewEngine.f68133h.getActivityControlSurface().onRequestPermissionsResult(i17, permissions, grantResults);
        }
        super.onRequestPermissionsResult(i17, permissions, grantResults);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout;
        super.onResume();
        if (getF65848t() && !this.f137314o && (swipeBackLayout = getSwipeBackLayout()) != null) {
            swipeBackLayout.setEnableGesture(this.f137314o);
        }
        this.f137312m = true;
        ((ku5.t0) ku5.t0.f312615d).B(new w03.m(this));
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onUserLeaveHint() {
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = this.f137308f;
        if (flutterViewEngine != null) {
            flutterViewEngine.h();
        }
        super.onUserLeaveHint();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity
    public void onVASBackPressedDispatcherCallback() {
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public android.view.View provideCustomActivityContentView() {
        return U6();
    }

    public void u3(pi0.w0 host) {
        kotlin.jvm.internal.o.g(host, "host");
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = this.f137308f;
        if (flutterViewEngine != null) {
            flutterViewEngine.onDestroy();
        }
        this.f137308f = null;
    }
}
