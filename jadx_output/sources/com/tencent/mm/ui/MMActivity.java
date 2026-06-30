package com.tencent.mm.ui;

@db5.a(0)
/* loaded from: classes14.dex */
public abstract class MMActivity extends com.tencent.mm.ui.MMFragmentActivity implements com.tencent.mm.plugin.appbrand.widget.input.x4, com.tencent.mm.ui.widget.dialog.l, db5.b1 {
    private static final int ANDROID_API_LEVEL_11 = 11;
    protected static final int DEFAULT_TOAST_TIME = 3000;
    public static final java.lang.String FLAG_OVERRIDE_ENTER_ANIMATION = "MMActivity.OverrideEnterAnimation";
    public static final java.lang.String FLAG_OVERRIDE_EXIT_ANIMATION = "MMActivity.OverrideExitAnimation";
    private static final java.lang.String NAV_BAR_HEIGHT_LANDSCAPE_RES_NAME = "navigation_bar_height_landscape";
    private static final java.lang.String NAV_BAR_HEIGHT_RES_NAME = "navigation_bar_height";
    private static final java.lang.String SHOW_NAV_BAR_RES_NAME = "config_showNavigationBar";
    private static final java.lang.String TAG = "MicroMsg.MMActivity";
    private static final java.lang.String TAG2 = "MicroMsg.INIT";
    private static java.lang.String sNavBarOverride;
    private byte _hellAccFlag_;
    java.lang.String className;
    private android.content.res.Resources customResources;
    private android.view.GestureDetector gestureDetector;
    private android.content.res.Resources mBaseResources;
    private android.content.res.Resources mForceBaseResources;
    private android.content.res.Resources mForceNewResources;
    private android.content.res.Resources mForceOldResources;
    private android.content.res.Resources mNewResources;
    private android.content.res.Resources mOldResources;
    private android.view.View mSelfNavigationBar;
    protected boolean landscapeMode = false;
    private boolean mIsPaused = false;
    protected com.tencent.mm.ui.ga mController = new com.tencent.mm.ui.aa(this);
    boolean fixStatusbar = false;
    al5.r statusBarStrategy = al5.r.f6004d;
    al5.q navigationBarStrategy = al5.q.f5988d;
    boolean transparentTheme = false;
    boolean customfixStatusbar = false;
    protected android.view.ViewGroup mWrappingFrame = null;
    private boolean mIsStopped = false;
    private final java.util.Map<com.tencent.mm.ui.fa, java.lang.Object> mConfigChangedListeners = new x.b();
    private boolean updateResource = false;
    private boolean updateNewResource = false;
    private boolean updateForceResource = false;
    private long lastOnResumeTicks = 0;
    private long lastOnPauseTicks = 0;
    private long lastBrowseTime = 0;
    java.util.List<com.tencent.mm.ui.ea> onBackPressListeners = new java.util.ArrayList();

    static {
        try {
            java.lang.reflect.Method declaredMethod = java.lang.Class.forName("android.os.SystemProperties").getDeclaredMethod("get", java.lang.String.class);
            declaredMethod.setAccessible(true);
            sNavBarOverride = (java.lang.String) declaredMethod.invoke(null, "qemu.hw.mainkeys");
        } catch (java.lang.Throwable unused) {
            sNavBarOverride = null;
        }
    }

    public static java.util.Locale initLanguage(android.content.Context context) {
        return com.tencent.mm.ui.ga.Q(context);
    }

    public static void setMainProcess() {
        com.tencent.mm.ui.ga.f208628v0 = true;
    }

    public <T> T $(int i17) {
        return (T) findViewById(i17);
    }

    public int S6() {
        return getActionbarColor();
    }

    public void activateBroadcast(boolean z17) {
        this.mController.e(z17);
    }

    @java.lang.Deprecated
    public boolean activityHasDestroyed() {
        return isDestroyed();
    }

    public void addDialog(android.app.Dialog dialog) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (dialog == null) {
            gaVar.getClass();
            return;
        }
        if (gaVar.F == null) {
            gaVar.F = new java.util.ArrayList();
        }
        gaVar.F.add(dialog);
    }

    public void addIconOptionMenu(int i17, int i18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.i(i17, i18, "", false, onMenuItemClickListener, null, com.tencent.mm.ui.fb.NORMAL);
    }

    public void addOnBackPressListener(com.tencent.mm.ui.ea eaVar) {
        if (this.onBackPressListeners.contains(eaVar)) {
            return;
        }
        this.onBackPressListeners.add(eaVar);
    }

    public void addOnConfigurationChangedListener(com.tencent.mm.ui.fa faVar) {
        if (faVar != null) {
            this.mConfigChangedListeners.put(faVar, this);
        }
    }

    public void addSearchMenu(boolean z17, com.tencent.mm.ui.tools.c9 c9Var) {
        this.mController.j(z17, c9Var);
    }

    public void addTextOptionMenu(int i17, java.lang.String str, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.i(i17, 0, str, false, onMenuItemClickListener, null, com.tencent.mm.ui.fb.NORMAL);
    }

    public void applyHalfScreenActionbarHeight() {
        int dimension = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479731dn);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.hwa);
        if (frameLayout != null) {
            ((android.widget.FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = dimension;
        }
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.hvf);
        if (frameLayout2 != null) {
            frameLayout2.getLayoutParams().height = dimension;
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.coz);
        if (findViewById != null) {
            ((android.widget.RelativeLayout.LayoutParams) findViewById.getLayoutParams()).addRule(15, -1);
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    public boolean callBackMenu() {
        return this.mController.k();
    }

    @java.lang.Deprecated
    public void customfixStatusbar(boolean z17) {
        this.customfixStatusbar = z17;
    }

    public void dealContentView(android.view.View view) {
        if (!com.tencent.mm.ui.b4.a(this)) {
            setContentView(view);
            return;
        }
        try {
            setContentView(view);
        } catch (java.lang.NullPointerException e17) {
            com.tencent.mars.xlog.Log.w(TAG, "dealContentView fail:" + e17);
        }
    }

    public void dispatchOnConfigurationChanged(android.content.res.Configuration configuration) {
        if (this.mConfigChangedListeners.isEmpty()) {
            return;
        }
        for (com.tencent.mm.ui.fa faVar : (com.tencent.mm.ui.fa[]) this.mConfigChangedListeners.keySet().toArray(new com.tencent.mm.ui.fa[this.mConfigChangedListeners.size()])) {
            faVar.onConfigurationChanged(configuration);
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.GestureDetector gestureDetector = this.gestureDetector;
        if (gestureDetector != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(motionEvent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/ui/MMActivity", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/ui/MMActivity", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void enableBackMenu(boolean z17) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        com.tencent.mm.ui.eb ebVar = gaVar.C;
        if (ebVar == null || ebVar.f208380f == z17) {
            return;
        }
        ebVar.f208380f = z17;
        gaVar.N0();
    }

    public void enableOptionMenu(boolean z17) {
        this.mController.p(true, -1, z17);
    }

    public void expendActionbar() {
        int i17;
        int i18;
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (!gaVar.d0() && (i17 = gaVar.f208671t0) < (i18 = gaVar.Y)) {
            android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofInt(i17, i18).setDuration(200L);
            duration.addUpdateListener(new com.tencent.mm.ui.va(gaVar));
            duration.start();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        int g17 = com.tencent.mm.sdk.platformtools.c2.g(getIntent(), "MMActivity.OverrideEnterAnimation", -1);
        int g18 = com.tencent.mm.sdk.platformtools.c2.g(getIntent(), "MMActivity.OverrideExitAnimation", -1);
        if (g17 != -1) {
            super.overridePendingTransition(g17, g18);
        }
    }

    @java.lang.Deprecated
    public void fixStatusbar(boolean z17) {
        this.fixStatusbar = z17;
    }

    public boolean fromFullScreenActivity() {
        return false;
    }

    public void fullScreenNoTitleBar(boolean z17) {
        this.mController.t(z17);
    }

    public void fullScreenWithTitleBar(boolean z17) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (z17) {
            gaVar.f208670t.getWindow().setFlags(1024, 1024);
        } else {
            gaVar.f208670t.getWindow().clearFlags(1024);
        }
    }

    public int getActionbarColor() {
        return this.mController.u();
    }

    public long getActivityBrowseTimeMs() {
        long elapsedRealtime;
        long j17;
        long j18 = this.lastOnPauseTicks;
        if (j18 != 0) {
            elapsedRealtime = j18 - this.lastOnResumeTicks;
            j17 = this.lastBrowseTime;
        } else {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.lastOnResumeTicks;
            j17 = this.lastBrowseTime;
        }
        long j19 = elapsedRealtime + j17;
        if (j19 < 0) {
            com.tencent.mars.xlog.Log.w(TAG, "%d get activity browse time is error, may be something warn here.[%d %d %d %d]", java.lang.Integer.valueOf(hashCode()), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(this.lastOnResumeTicks), java.lang.Long.valueOf(this.lastOnPauseTicks), java.lang.Long.valueOf(this.lastBrowseTime));
        }
        hashCode();
        return j19;
    }

    public android.view.View getBodyView() {
        return this.mController.f208634b;
    }

    public ul5.k getBounceView() {
        return this.mController.f208674v;
    }

    public java.lang.String getCallerPackage() {
        java.lang.String str;
        android.net.Uri referrer;
        android.content.ComponentName callingActivity = getCallingActivity();
        if (callingActivity != null) {
            str = callingActivity.getPackageName();
            com.tencent.mars.xlog.Log.i(TAG, "get calling activity, %s", str);
        } else {
            str = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                java.lang.Object a17 = new yo.b(this, "mReferrer", null).a();
                if (a17 != null) {
                    str = (java.lang.String) a17;
                }
                com.tencent.mars.xlog.Log.i(TAG, "get referrer, %s", str);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "get mReferrer error", new java.lang.Object[0]);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) || (referrer = getReferrer()) == null) {
            return str;
        }
        java.lang.String authority = referrer.getAuthority();
        com.tencent.mars.xlog.Log.i(TAG, "get referrer, %s", authority);
        return authority;
    }

    public final android.view.View getContentView() {
        return this.mController.w();
    }

    public androidx.appcompat.app.AppCompatActivity getContext() {
        return this.mController.x();
    }

    public com.tencent.mm.ui.ga getController() {
        return this.mController;
    }

    public int getCurrentActionbarHeight() {
        return this.mController.f208671t0;
    }

    public int getCurrentStatusBarColor() {
        return this.mController.f208673u0;
    }

    public int getCustomBounceId() {
        return -1;
    }

    public int getForceOrientation() {
        return -1;
    }

    public int getForceUIMode() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.x4
    public android.app.Activity getHostActivity() {
        return this;
    }

    public s75.b getIdentString() {
        return new s75.b("");
    }

    public abstract int getLayoutId();

    public android.view.View getLayoutView() {
        return null;
    }

    public android.widget.TextView getMMSubTitle() {
        return this.mController.N;
    }

    public java.lang.CharSequence getMMTitle() {
        com.tencent.mm.ui.ga gaVar = this.mController;
        androidx.appcompat.app.b bVar = gaVar.G;
        if (bVar == null) {
            return null;
        }
        java.lang.String str = gaVar.f208652k;
        return str != null ? str : bVar.n();
    }

    public android.widget.TextView getMMTitleView() {
        return this.mController.H;
    }

    public com.tencent.mm.ui.widget.imageview.WeImageView getMabBackBtn() {
        return this.mController.K;
    }

    public db5.g4 getMenu() {
        com.tencent.mm.ui.tools.e eVar = this.mController.E;
        if (eVar == null || !eVar.f210364c) {
            return null;
        }
        return eVar.f210365d;
    }

    public int getNavigationBarColor() {
        return this.mController.f208669s0;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        android.content.Context baseContext = getBaseContext();
        if (baseContext == null) {
            com.tencent.mm.sdk.platformtools.Log.c(TAG, "no base context!!", new java.lang.Object[0]);
            return super.getResources();
        }
        if (getForceUIMode() != 0) {
            if (!this.updateNewResource || this.mNewResources == null) {
                this.mBaseResources = baseContext.getResources();
                this.mOldResources = super.getResources();
                this.mBaseResources.getConfiguration().updateFrom(this.mOldResources.getConfiguration());
                this.mNewResources = new j65.y(this.mBaseResources, getForceUIMode(), j65.f.d());
                this.updateNewResource = true;
            }
            return this.mNewResources;
        }
        if (!this.updateResource || this.customResources == null) {
            android.content.res.Resources resources = baseContext.getResources();
            android.content.res.Resources resources2 = super.getResources();
            this.customResources = resources2;
            if ((resources2 instanceof j65.j) && resources != null) {
                j65.j jVar = (j65.j) resources2;
                android.content.res.Configuration b17 = jVar.f297961e.b(resources.getConfiguration());
                j65.m.c(b17, com.tencent.mm.ui.bk.E(this.customResources));
                jVar.getConfiguration().updateFrom(b17);
                this.customResources = jVar;
                this.updateResource = true;
            }
        }
        return this.customResources;
    }

    public int getStatusBarColor() {
        return com.tencent.mm.ui.b4.c(this) ? this.mController.f208673u0 : getWindow().getStatusBarColor();
    }

    public int getStatusBarHeight(int i17) {
        android.view.ViewGroup viewGroup = this.mWrappingFrame;
        return viewGroup instanceof vj5.h ? ((vj5.h) viewGroup).getDrawnStatusBarHeight() : com.tencent.mm.ui.bl.i(this, i17);
    }

    public int getStreamMaxVolume(int i17) {
        return this.mController.f208648i.getStreamMaxVolume(i17);
    }

    public int getStreamVolume(int i17) {
        return this.mController.f208648i.getStreamVolume(i17);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity
    public androidx.appcompat.app.b getSupportActionBar() {
        return al5.p0.N(super.getSupportActionBar());
    }

    public int getTitleLocation() {
        androidx.appcompat.app.b bVar = this.mController.G;
        if (bVar == null) {
            return 0;
        }
        return bVar.l();
    }

    public android.view.ViewGroup getWrappingFrame() {
        return this.mWrappingFrame;
    }

    public void hideActionBarOperationArea() {
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar != null) {
            gaVar.G();
        }
    }

    public void hideActionbarLine() {
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar.F() != null) {
            gaVar.F().G(0.0f);
        }
    }

    public void hideAllManagedDialogs() {
        this.mController.H();
    }

    public void hideTitleView() {
        this.mController.J();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.plugin.appbrand.widget.input.x4
    public void hideVKB() {
        this.mController.K();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.x4
    public boolean hideVKBHavingResult() {
        return this.mController.K();
    }

    public void initActionBarOperationArea() {
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar != null) {
            android.view.View view = gaVar.f208633a0;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/MMActivityController", "initActionBarOperationArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/MMActivityController", "initActionBarOperationArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = gaVar.I;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/MMActivityController", "initActionBarOperationArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/MMActivityController", "initActionBarOperationArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public void initActionBarOperationAreaTxt(java.lang.String str) {
        com.tencent.mm.ui.widget.AlbumChooserView albumChooserView;
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar == null || (albumChooserView = gaVar.f208635b0) == null) {
            return;
        }
        albumChooserView.f211240d.setText(str);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public void initSwipeBack() {
        super.initSwipeBack();
        if (getSwipeBackLayout() == null || getSwipeBackLayout().getChildCount() <= 0) {
            return;
        }
        android.view.View childAt = getSwipeBackLayout().getChildAt(0);
        getSwipeBackLayout().removeView(childAt);
        if (com.tencent.mm.ui.b4.c(this) && enableEdgeToEdgeWrapperLayout()) {
            com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout edgeToEdgeWrapperLayout = new com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout(this);
            this.mWrappingFrame = edgeToEdgeWrapperLayout;
            edgeToEdgeWrapperLayout.setId(com.tencent.mm.R.id.twm);
            ((com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout) this.mWrappingFrame).setStatusBarStrategy(this.statusBarStrategy);
            ((com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout) this.mWrappingFrame).setNavigationBarStrategy(this.navigationBarStrategy);
            ((com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout) this.mWrappingFrame).setDisableNavigationBarContrastEnforced((db5.f.e(getClass()) & 16384) != 0);
        } else if (this.fixStatusbar) {
            this.mWrappingFrame = new vj5.h(this);
        } else {
            this.mWrappingFrame = new android.widget.FrameLayout(this);
        }
        this.mWrappingFrame.addView(childAt, new android.widget.FrameLayout.LayoutParams(-1, -1));
        getSwipeBackLayout().addView(this.mWrappingFrame);
        getSwipeBackLayout().setContentView(this.mWrappingFrame);
        if (com.tencent.mm.ui.b4.c(this)) {
            com.tencent.mm.ui.ga gaVar = this.mController;
            gaVar.E0(gaVar.f208669s0);
        }
    }

    @java.lang.Deprecated
    public void initView() {
    }

    public boolean isActionbarCenterLayoutMode() {
        return true;
    }

    public boolean isActionbarMenuUseOriginalSys() {
        return false;
    }

    public boolean isForceFixStatusBar() {
        return false;
    }

    public boolean isHideVKBWhenScroll() {
        return false;
    }

    public boolean isLayoutInDecorView() {
        return false;
    }

    public boolean isOptionMenuEnable(int i17) {
        java.util.Iterator it = this.mController.D.iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.eb ebVar = (com.tencent.mm.ui.eb) it.next();
            if (ebVar.f208375a == i17) {
                return ebVar.f208380f;
            }
        }
        return false;
    }

    public boolean isOptionMenuShow(int i17) {
        java.util.Iterator it = this.mController.D.iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.eb ebVar = (com.tencent.mm.ui.eb) it.next();
            if (ebVar.f208375a == i17) {
                return ebVar.f208381g;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean isPaused() {
        return this.mIsPaused;
    }

    public boolean isScreenEnable() {
        return this.mController.f208650j;
    }

    public boolean isShowDialog() {
        java.util.ArrayList arrayList = this.mController.F;
        if (arrayList == null) {
            return false;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((android.app.Dialog) it.next()).isShowing()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSingleTitleView() {
        com.tencent.mm.ui.ga gaVar = this.mController;
        androidx.appcompat.app.b bVar = gaVar.G;
        return (bVar == null || bVar.j() == null || gaVar.G.j().findViewById(com.tencent.mm.R.id.f482439em) == null) ? false : true;
    }

    public boolean isStopped() {
        return this.mIsStopped;
    }

    public boolean isTitleShowing() {
        androidx.appcompat.app.b bVar = this.mController.G;
        if (bVar == null) {
            return false;
        }
        return bVar.q();
    }

    public int keyboardState() {
        return this.mController.f208655l0;
    }

    public void makeActionBarOperationAreaToCenter() {
        android.view.View view;
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar == null || (view = gaVar.f208633a0) == null) {
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.setMargins(0, layoutParams.topMargin, 0, layoutParams.bottomMargin);
        layoutParams.addRule(13);
    }

    public void mmSetOnActivityResultCallback(com.tencent.mm.ui.da daVar) {
        super.setMMOnFragmentActivityResult(daVar);
    }

    public void mmStartActivityForResult(com.tencent.mm.ui.da daVar, android.content.Intent intent, int i17) {
        super.mmStartActivityForResult((com.tencent.mm.ui.xc) daVar, intent, i17);
    }

    public boolean needResetStatusBarColorOnActivityCreate() {
        return true;
    }

    public boolean needShowIdcError() {
        return true;
    }

    public boolean noActionBar() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        java.util.Iterator<com.tencent.mm.ui.ea> it = this.onBackPressListeners.iterator();
        while (it.hasNext()) {
            if (it.next().onBackPressed()) {
                return;
            }
        }
        super.onBackPressed();
    }

    public void onBusinessPermissionDenied(java.lang.String str) {
        finish();
    }

    public void onBusinessPermissionGranted(java.lang.String str) {
        if (getCallingActivity() != null) {
            recreate();
            return;
        }
        finish();
        overridePendingTransition(0, 0);
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.ui.ca(this), 50L);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dispatchOnConfigurationChanged(configuration);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.View childAt;
        android.view.ViewGroup viewGroup;
        zk3.c Ai;
        int i17;
        al5.r rVar;
        if (!this.customfixStatusbar) {
            this.fixStatusbar = true;
        }
        getController().f208651j0 = com.tencent.mm.R.layout.f487918bk;
        super.onCreate(bundle);
        if (getP() && !isForceFixStatusBar()) {
            this.fixStatusbar = false;
        }
        if (com.tencent.mm.ui.b4.c(this) && enableEdgeToEdgeWrapperLayout()) {
            com.tencent.mm.ui.a4.f197117a.i(this);
            java.lang.Class<?> cls = getClass();
            int e17 = db5.f.e(cls);
            if ((e17 & 128) != 0) {
                rVar = al5.r.f6004d;
            } else if ((e17 & 256) != 0) {
                rVar = al5.r.f6005e;
            } else {
                rVar = (db5.f.e(cls) & 32) != 0 ? al5.r.f6004d : al5.r.f6005e;
            }
            this.statusBarStrategy = rVar;
            al5.q f17 = db5.f.f(getClass());
            this.navigationBarStrategy = f17;
            com.tencent.mars.xlog.Log.i(TAG, "Edge2Edge statusBarStrategy:%s, navigationBarStrategy:%s for %s", this.statusBarStrategy, f17, getClass().getSimpleName());
        } else {
            this.statusBarStrategy = al5.r.f6004d;
            this.navigationBarStrategy = al5.q.f5988d;
        }
        com.tencent.mars.xlog.Log.i(TAG, "Edge2Edge customfixStatusbar:%s, fixStatusbar:%s, isForceFixStatusBar:%s", java.lang.Boolean.valueOf(this.customfixStatusbar), java.lang.Boolean.valueOf(this.fixStatusbar), java.lang.Boolean.valueOf(isForceFixStatusBar()));
        this.mController.e0(getApplicationContext(), this);
        initNavigationSwipeBack();
        if (com.tencent.mm.ui.b4.c(this) && enableEdgeToEdgeWrapperLayout()) {
            if (getSwipeBackLayout() != null) {
                com.tencent.mars.xlog.Log.i(TAG, "Edge2Edge already init DrawStatusBarFrameLayout");
            } else {
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) getWindow().getDecorView();
                android.view.View childAt2 = viewGroup2.getChildAt(0);
                if (childAt2.findViewById(android.R.id.content) == null) {
                    int childCount = viewGroup2.getChildCount();
                    i17 = 0;
                    while (i17 < childCount) {
                        android.view.View childAt3 = viewGroup2.getChildAt(i17);
                        if ((childAt3 instanceof android.view.ViewGroup) && childAt3.findViewById(android.R.id.content) != null) {
                            childAt2 = childAt3;
                            break;
                        }
                        i17++;
                    }
                }
                i17 = 0;
                viewGroup2.removeView(childAt2);
                com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout edgeToEdgeWrapperLayout = new com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout(this);
                this.mWrappingFrame = edgeToEdgeWrapperLayout;
                edgeToEdgeWrapperLayout.addView(childAt2, new android.widget.FrameLayout.LayoutParams(-1, -1));
                ((com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout) this.mWrappingFrame).setStatusBarStrategy(this.statusBarStrategy);
                ((com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout) this.mWrappingFrame).setNavigationBarStrategy(this.navigationBarStrategy);
                ((com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout) this.mWrappingFrame).setDisableNavigationBarContrastEnforced((db5.f.e(getClass()) & 16384) != 0);
                this.mWrappingFrame.setId(com.tencent.mm.R.id.twm);
                viewGroup2.addView(this.mWrappingFrame, i17);
                com.tencent.mars.xlog.Log.i(TAG, "add EdgeToEdgeWrapperLayout to Decor");
                com.tencent.mm.ui.ga gaVar = this.mController;
                gaVar.E0(gaVar.f208669s0);
            }
        }
        if (!noActionBar()) {
            setActionbarColor(getResources().getColor(com.tencent.mm.R.color.a07));
            setMMTitleSize(i65.a.f(this, com.tencent.mm.R.dimen.f479559b) * i65.a.m(this));
        }
        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.global.RepairerConfigGlobalToastActivityName()) == 1) {
            db5.t7.makeText(this, getClass().getSimpleName(), 0).show();
        }
        if (isHideVKBWhenScroll()) {
            this.gestureDetector = new android.view.GestureDetector(this, new com.tencent.mm.ui.ba(this));
        }
        android.view.View decorView = getWindow().getDecorView();
        if (this.fixStatusbar && (decorView instanceof android.view.ViewGroup)) {
            android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) decorView;
            if (viewGroup3.getChildCount() > 0) {
                childAt = viewGroup3.getChildAt(0);
                if (childAt != null || (Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(this)) == null) {
                }
                ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) Ai).R6(childAt, null, false);
                return;
            }
        }
        childAt = (this.fixStatusbar || (viewGroup = this.mWrappingFrame) == null || viewGroup.getChildCount() <= 0) ? null : this.mWrappingFrame.getChildAt(0);
        if (childAt != null) {
        }
    }

    public void onCreateBeforeSetContentView() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        try {
            if (this.mController.g0(menu)) {
                return true;
            }
            return super.onCreateOptionsMenu(menu);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "onCreateOptionsMenu", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.f208649i0.dead();
        gaVar.H();
        q75.a.b(this);
        this.mConfigChangedListeners.clear();
    }

    public void onDialogDismiss(android.app.Dialog dialog) {
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (this.mController.h0(i17, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        boolean z17;
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.getClass();
        if (i17 == 82 && keyEvent.getAction() == 1) {
            com.tencent.mm.ui.eb ebVar = gaVar.f208657m0;
            if (ebVar != null && ebVar.f208380f) {
                gaVar.l(gaVar.f208659n0, ebVar);
            }
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            return true;
        }
        try {
            return super.onKeyUp(i17, keyEvent);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "java.lang.IllegalStateException: Can not perform this action after onSaveInstanceState", new java.lang.Object[0]);
            return true;
        }
    }

    public void onKeyboardStateChanged() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        return this.mController.j0(menuItem);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        java.lang.System.currentTimeMillis();
        com.tencent.mm.ui.zj.a(2, this.className);
        this.mIsPaused = true;
        super.onPause();
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.e(false);
        gaVar.f208649i0.dead();
        isFinishing();
        java.lang.System.currentTimeMillis();
        hashCode();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.lastOnPauseTicks = android.os.SystemClock.elapsedRealtime();
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        this.mController.k0(menu);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        java.lang.System.currentTimeMillis();
        com.tencent.mm.ui.zj.a(1, this.className);
        this.mIsPaused = false;
        super.onResume();
        java.lang.System.currentTimeMillis();
        this.mController.l0();
        java.lang.System.currentTimeMillis();
        hashCode();
        long j17 = this.lastOnPauseTicks;
        long j18 = this.lastOnResumeTicks;
        if (j17 > j18) {
            this.lastBrowseTime += j17 - j18;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.lastOnResumeTicks = android.os.SystemClock.elapsedRealtime();
        this.lastOnPauseTicks = 0L;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        if (isCallSuperOnSaveInstanceState()) {
            super.onSaveInstanceState(bundle);
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        setMMOrientation();
        this.mIsStopped = false;
        super.onStart();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        this.mIsStopped = true;
        super.onStop();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        if (!onSwipeBackFinish()) {
            this.mController.k();
        }
        super.onSwipeBack();
    }

    public boolean onSwipeBackFinish() {
        return false;
    }

    public void playActionBarOperationAreaAnim() {
        com.tencent.mm.ui.widget.AlbumChooserView albumChooserView;
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar == null || (albumChooserView = gaVar.f208635b0) == null || albumChooserView.f211242f) {
            return;
        }
        albumChooserView.f211242f = true;
        albumChooserView.f211241e.animate().rotationBy(180.0f).setDuration(200L).withEndAction(new al5.b(albumChooserView)).start();
    }

    public android.view.View provideCustomActivityContentView() {
        return null;
    }

    public void removeAllOptionMenu() {
        com.tencent.mm.ui.ga gaVar = this.mController;
        java.util.LinkedList linkedList = gaVar.D;
        if (linkedList.isEmpty()) {
            return;
        }
        linkedList.clear();
        gaVar.N0();
    }

    public void removeOnBackPressListener(com.tencent.mm.ui.ea eaVar) {
        if (this.onBackPressListeners.contains(eaVar)) {
            this.onBackPressListeners.remove(eaVar);
        }
    }

    public void removeOnConfigurationChangedListener(com.tencent.mm.ui.fa faVar) {
        if (faVar != null) {
            this.mConfigChangedListeners.remove(faVar);
        }
    }

    public boolean removeOptionMenu(int i17) {
        return this.mController.n0(i17);
    }

    public void removeSearchMenu() {
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.f208672u.getString(com.tencent.mm.R.string.f490549y8);
        gaVar.n0(com.tencent.mm.R.id.jha);
        gaVar.N0();
    }

    public void setActionBarOperationAreaClickListener(al5.d dVar) {
        com.tencent.mm.ui.widget.AlbumChooserView albumChooserView;
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar == null || (albumChooserView = gaVar.f208635b0) == null) {
            return;
        }
        albumChooserView.setOnAlbumChooserViewClick(dVar);
    }

    public void setActionbarColor(int i17) {
        this.mController.p0(i17);
        if (getCustomBounceId() != -1 || getBounceView() == null) {
            return;
        }
        getBounceView().setStart2EndBgColorByActionBar(i17);
    }

    public void setActionbarElementColor(int i17) {
        this.mController.q0(i17);
    }

    public void setActionbarFrosted(boolean z17) {
        if (z17) {
            this.mController.o(50, com.tencent.mm.R.color.agt, 94);
        } else {
            this.mController.n();
        }
    }

    public void setActionbarHeight(int i17) {
        this.mController.r0(i17, false);
    }

    public void setActivityPopAnimParam(int i17, int i18) {
        getIntent().putExtra("MMActivity.OverrideEnterAnimation", i17);
        getIntent().putExtra("MMActivity.OverrideExitAnimation", i18);
    }

    public void setBackBtn(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.s0(onMenuItemClickListener, 0);
    }

    public void setBackBtnColorFilter(int i17) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = gaVar.K;
        if (weImageView != null) {
            weImageView.setIconColor(gaVar.f208672u.getResources().getColor(i17));
        }
    }

    public void setBackBtnVisible(boolean z17) {
        this.mController.t0(z17);
    }

    public void setBackGroundColorResource(int i17) {
        this.mController.u0(i17);
    }

    public final void setBodyView(int i17) {
        this.mController.v0(i17);
    }

    public void setBounceEnabled(boolean z17) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.f208675w = z17;
        ul5.k kVar = gaVar.f208674v;
        if (kVar != null) {
            kVar.setBounceEnabled(z17);
        }
    }

    public void setContentViewVisibility(int i17) {
        android.view.View contentView = getContentView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/ui/MMActivity", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/ui/MMActivity", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i17 == 0) {
            showTitleView();
        } else {
            hideTitleView();
        }
    }

    public void setCurController(com.tencent.mm.ui.ga gaVar) {
        this.mController = gaVar;
    }

    public void setCurrentStatusColor(int i17) {
        this.mController.G0(i17);
    }

    public void setIconAlpha(float f17) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        android.view.View view = gaVar.f208631J;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/MMActivityController", "setIconAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/ui/MMActivityController", "setIconAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            if (f17 == 0.0f) {
                gaVar.f208631J.setEnabled(false);
            } else {
                gaVar.f208631J.setEnabled(true);
            }
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = gaVar.U;
        if (weImageView != null) {
            weImageView.setAlpha(f17);
            if (f17 == 0.0f) {
                gaVar.U.setEnabled(false);
            } else {
                gaVar.U.setEnabled(true);
            }
        }
    }

    public void setIsDarkActionbarBg(boolean z17) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.R = z17;
        gaVar.O0(z17);
        gaVar.P0();
    }

    public void setLightNavigationbarIcon() {
        android.view.View decorView = this.mController.f208670t.getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
    }

    public void setMMNormalView() {
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar.f208672u != null) {
            gaVar.N(gaVar.f208670t);
        }
    }

    public void setMMOrientation() {
        if (getForceOrientation() != -1) {
            setRequestedOrientation(getForceOrientation());
            return;
        }
        this.landscapeMode = getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getBoolean("settings_landscape_mode", false);
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_SUPPORT_ORIENTATION", false);
        if (this.landscapeMode || booleanExtra) {
            com.tencent.mm.ui.ee.c(1);
            setRequestedOrientation(-1);
        } else {
            com.tencent.mm.ui.ee.c(0);
            setRequestedOrientation(1);
        }
    }

    public void setMMSingleTitle(java.lang.String str) {
        this.mController.y0(str, null);
    }

    public void setMMSubTitle(java.lang.String str) {
        this.mController.A0(str);
    }

    @java.lang.Deprecated
    public void setMMSubTitleColor(int i17) {
        android.widget.TextView textView;
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar.G == null || (textView = gaVar.N) == null) {
            return;
        }
        textView.setTextColor(i17);
        gaVar.f208665q0 = i17;
    }

    public void setMMSubTitleEllipsize(android.text.TextUtils.TruncateAt truncateAt) {
        android.widget.TextView textView;
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar.G == null || (textView = gaVar.N) == null) {
            return;
        }
        textView.setEllipsize(truncateAt);
    }

    public void setMMSubTitleSize(float f17) {
        android.widget.TextView textView;
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar.G == null || (textView = gaVar.N) == null) {
            return;
        }
        textView.setTextSize(0, f17);
    }

    public void setMMTitle(java.lang.String str) {
        super.setTitle(str);
        this.mController.C0(str);
    }

    public void setMMTitleColor(int i17) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar.G == null) {
            return;
        }
        gaVar.H.setTextColor(i17);
    }

    public void setMMTitleSize(float f17) {
        android.widget.TextView textView;
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar.G == null || (textView = gaVar.H) == null) {
            return;
        }
        textView.setTextSize(0, f17);
    }

    public void setMMTitleVisibility(int i17) {
        this.mController.D0(i17);
    }

    public void setNavigationbarColor(int i17) {
        this.mController.E0(i17);
        android.view.ViewGroup viewGroup = this.mWrappingFrame;
        if (viewGroup instanceof com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout) {
            ((com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout) viewGroup).setNavigationBarBackgroundColor(i17);
            ((com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout) this.mWrappingFrame).u();
        }
    }

    public void setProgressIcon(int i17) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar.G == null) {
            return;
        }
        gaVar.M.setIndeterminateDrawable(gaVar.x().getDrawable(i17));
    }

    public void setProgressVisibility(int i17) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar.G == null) {
            return;
        }
        gaVar.M.setVisibility(i17);
    }

    @java.lang.Deprecated
    public void setRedDotVisibilty(int i17) {
    }

    public void setScreenEnable(boolean z17) {
        this.mController.F0(z17);
    }

    public void setSelfNavigationBarColor(int i17) {
        if (!com.tencent.mm.ui.bl.f(getContext())) {
            com.tencent.mars.xlog.Log.w(TAG, "has not NavigationBar!");
            return;
        }
        if (this.mSelfNavigationBar == null) {
            this.mSelfNavigationBar = new android.view.View(getContext());
            ((android.view.ViewGroup) getWindow().getDecorView()).addView(this.mSelfNavigationBar);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, com.tencent.mm.ui.bl.c(getContext()));
        layoutParams.gravity = 80;
        this.mSelfNavigationBar.setLayoutParams(layoutParams);
        this.mSelfNavigationBar.setBackgroundColor(i17);
        android.view.View view = this.mSelfNavigationBar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/MMActivity", "setSelfNavigationBarColor", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/MMActivity", "setSelfNavigationBarColor", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void setSelfNavigationBarVisible(int i17) {
        android.view.View view = this.mSelfNavigationBar;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/MMActivity", "setSelfNavigationBarVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/MMActivity", "setSelfNavigationBarVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void setSmartGalleryEntryVisibility(boolean z17) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar != null) {
            gaVar.f208678z = z17;
            gaVar.N0();
        }
    }

    public void setStatusBarShowStrategy(al5.r rVar) {
        if ((this.mWrappingFrame instanceof com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout) && com.tencent.mm.ui.b4.c(this)) {
            ((com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout) this.mWrappingFrame).setStatusBarStrategy(rVar);
        }
    }

    public void setTitleAlpha(float f17) {
        android.widget.TextView textView = this.mController.H;
        if (textView != null) {
            textView.setAlpha(f17);
        }
    }

    public void setTitleBarClickListener(java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        androidx.appcompat.app.b bVar = gaVar.G;
        if (bVar == null || bVar.j() == null) {
            return;
        }
        gaVar.G.j().setOnClickListener(new com.tencent.mm.ui.pa(gaVar, runnable, runnable2));
    }

    public void setTitleBarDoubleClickListener(java.lang.Runnable runnable) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        androidx.appcompat.app.b bVar = gaVar.G;
        if (bVar == null || runnable == null) {
            return;
        }
        bVar.j().setOnClickListener(new com.tencent.mm.ui.oa(gaVar, runnable));
    }

    @java.lang.Deprecated
    public void setTitleClickAction(android.view.GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
    }

    public void setTitleDividerColor(int i17) {
        this.mController.getClass();
    }

    public void setTitleDividerVis(boolean z17) {
        this.mController.getClass();
    }

    public void setTitleForceNotifyIconVisibility(int i17) {
        this.mController.Y0();
    }

    public void setTitleLogo(int i17, int i18) {
        this.mController.I0(i17, i18);
    }

    public void setTitleMuteIconVisibility(int i17) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.getClass();
        gaVar.f208666r = i17 == 0;
        gaVar.Y0();
    }

    public void setTitlePhoneIconVisibility(int i17) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.getClass();
        gaVar.f208668s = i17 == 0;
        gaVar.Y0();
    }

    public void setTitleVisibility(int i17) {
        this.mController.J0(i17);
    }

    @java.lang.Deprecated
    public void setToTop(android.view.View.OnClickListener onClickListener) {
    }

    public void setTransparentTheme(boolean z17) {
        this.transparentTheme = z17;
    }

    public void showActionbarLine() {
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar.F() != null) {
            gaVar.F().G(1.0f);
        }
    }

    public void showHomeBtn(boolean z17) {
        this.mController.K0(z17);
    }

    public void showMMLogo() {
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.K.setVisibility(8);
        android.view.View view = gaVar.f208631J;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/MMActivityController", "showMMLogo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/MMActivityController", "showMMLogo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void showOptionMenu(boolean z17) {
        this.mController.L0(true, -1, z17);
    }

    public void showTitleView() {
        androidx.appcompat.app.b bVar = this.mController.G;
        if (bVar == null) {
            return;
        }
        bVar.L();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.plugin.appbrand.widget.input.x4
    public void showVKB() {
        com.tencent.mm.ui.ga.M0(this.mController.f208670t);
    }

    public void startActivity(java.lang.Class<?> cls) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this, cls);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/MMActivity", "startActivity", "(Ljava/lang/Class;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/ui/MMActivity", "startActivity", "(Ljava/lang/Class;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(la5.t0.class);
        hashSet.add(uj5.e.class);
        ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).wi(this, hashSet);
    }

    public void supportLightStatusBar() {
        android.view.View decorView = this.mController.f208670t.getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
    }

    public void triggerActivityResult(int i17, int i18, android.content.Intent intent) {
        onActivityResult(i17, i18, intent);
    }

    public void updataStatusBarIcon(boolean z17) {
        this.mController.O0(z17);
    }

    public void updateActionBarOperationAreaTxt(java.lang.String str) {
        com.tencent.mm.ui.widget.AlbumChooserView albumChooserView;
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar == null || (albumChooserView = gaVar.f208635b0) == null || albumChooserView.f211242f) {
            return;
        }
        albumChooserView.f211242f = true;
        albumChooserView.f211241e.animate().rotationBy(180.0f).setDuration(200L).withEndAction(new al5.c(albumChooserView, str)).start();
    }

    public void updateBackBtn(android.graphics.drawable.Drawable drawable) {
        this.mController.Q0(drawable);
    }

    public void updateDescription(java.lang.String str) {
        this.mController.R0(str);
    }

    public void updateOptionMenuIcon(int i17, int i18) {
        this.mController.T0(i17, i18);
    }

    public void updateOptionMenuListener(int i17, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener) {
        com.tencent.mm.ui.eb E = this.mController.E(i17);
        if (E != null) {
            E.f208388n = onMenuItemClickListener;
            E.f208389o = onLongClickListener;
        }
    }

    public void updateOptionMenuRedDot(int i17, boolean z17) {
        this.mController.U0(i17, z17);
    }

    public void updateOptionMenuRightButtonColor(int i17, int i18, int i19, int i27, int i28, boolean z17) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        com.tencent.mm.ui.eb E = gaVar.E(i17);
        if ((E == null || (E.f208391q == i18 && E.f208392r == i19 && E.f208393s == i27 && E.f208394t == i28)) && E.f208395u == z17) {
            return;
        }
        E.f208391q = i18;
        E.f208392r = i19;
        E.f208393s = i27;
        E.f208394t = i28;
        E.f208395u = z17;
        gaVar.N0();
    }

    public void updateOptionMenuStyle(int i17, com.tencent.mm.ui.fb fbVar) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        com.tencent.mm.ui.eb E = gaVar.E(i17);
        if (E != null) {
            E.f208386l = fbVar;
            gaVar.N0();
        }
    }

    public void updateOptionMenuText(int i17, java.lang.String str) {
        this.mController.V0(i17, str);
    }

    public void updateStatusBarAndActionBarIconColor() {
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.S0();
        gaVar.O0(gaVar.R);
        gaVar.P0();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "updateStatusBarAndActionBarIconColor: isDarkActionBar = %s", java.lang.Boolean.valueOf(gaVar.R));
    }

    public static java.util.Locale initLanguage(android.content.Context context, java.lang.String str) {
        if (str.equals("language_default")) {
            com.tencent.mm.sdk.platformtools.m2.u(context, java.util.Locale.ENGLISH);
            return java.util.Locale.getDefault();
        }
        java.util.Locale s17 = com.tencent.mm.sdk.platformtools.m2.s(str);
        com.tencent.mm.sdk.platformtools.m2.u(context, s17);
        return s17;
    }

    public void fullScreenNoTitleBar(boolean z17, long j17) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        java.lang.Runnable runnable = gaVar.f208663p0;
        java.lang.Runnable runnable2 = gaVar.f208661o0;
        com.tencent.mm.sdk.platformtools.n3 n3Var = gaVar.f208677y;
        if (z17) {
            androidx.appcompat.app.b bVar = gaVar.G;
            if (bVar != null) {
                bVar.o();
            }
            n3Var.removeCallbacks(runnable);
            n3Var.removeCallbacks(runnable2);
            n3Var.postDelayed(runnable2, j17);
            return;
        }
        gaVar.f208670t.getWindow().clearFlags(1024);
        n3Var.removeCallbacks(runnable2);
        n3Var.removeCallbacks(runnable);
        n3Var.postDelayed(runnable, j17);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.plugin.appbrand.widget.input.x4
    public void hideVKB(android.view.View view) {
        this.mController.M(view);
    }

    public void setBackBtn(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, int i17) {
        this.mController.s0(onMenuItemClickListener, i17);
    }

    public void setMMSubTitle(int i17) {
        this.mController.z0(i17);
    }

    public void enableOptionMenu(int i17, boolean z17) {
        this.mController.p(false, i17, z17);
    }

    public void setMMSingleTitle(java.lang.String str, android.view.animation.Animation animation) {
        this.mController.y0(str, animation);
    }

    public void setMMTitle(java.lang.CharSequence charSequence) {
        super.setTitle(charSequence);
        this.mController.B0(charSequence);
    }

    public void showOptionMenu(int i17, boolean z17) {
        this.mController.L0(false, i17, z17);
    }

    public static void showVKB(android.app.Activity activity) {
        android.view.View currentFocus;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager == null || (currentFocus = activity.getCurrentFocus()) == null || currentFocus.getWindowToken() == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 2);
    }

    public void addIconOptionMenu(int i17, int i18, android.graphics.drawable.Drawable drawable, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.h(i17, getString(i18), drawable, onMenuItemClickListener);
    }

    public void addTextOptionMenu(int i17, java.lang.String str, int i18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.getClass();
        com.tencent.mm.ui.fb fbVar = com.tencent.mm.ui.fb.NORMAL;
        com.tencent.mm.ui.eb ebVar = new com.tencent.mm.ui.eb();
        ebVar.f208375a = i17;
        ebVar.f208382h = str;
        ebVar.f208383i = i18;
        ebVar.f208388n = onMenuItemClickListener;
        ebVar.f208389o = null;
        ebVar.f208386l = fbVar;
        gaVar.o0(i17);
        gaVar.D.add(ebVar);
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.ui.ua(gaVar), 200L);
    }

    public void setActionbarFrosted(boolean z17, int i17, int i18, int i19) {
        if (z17) {
            this.mController.o(i17, i18, i19);
        } else {
            this.mController.n();
        }
    }

    public void addIconOptionMenu(int i17, java.lang.String str, android.graphics.drawable.Drawable drawable, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.h(i17, str, drawable, onMenuItemClickListener);
    }

    public void initActionBarOperationAreaTxt(java.lang.String str, int i17, int i18, int i19, int i27) {
        com.tencent.mm.ui.widget.AlbumChooserView albumChooserView;
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar == null || (albumChooserView = gaVar.f208635b0) == null) {
            return;
        }
        albumChooserView.f211240d.setText(str);
        albumChooserView.f211240d.setTextColor(albumChooserView.getContext().getResources().getColor(i17));
        ((android.widget.LinearLayout) albumChooserView.f211240d.getParent()).setBackground(albumChooserView.getContext().getResources().getDrawable(i27));
        albumChooserView.f211241e.setIconColor(albumChooserView.getContext().getResources().getColor(i18));
        ((android.widget.FrameLayout) albumChooserView.f211241e.getParent()).setBackground(albumChooserView.getContext().getResources().getDrawable(i19));
    }

    public void setMMTitle(int i17) {
        super.setTitle(i17);
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.C0(gaVar.f208672u.getString(i17));
    }

    public void addIconOptionMenu(int i17, java.lang.String str, int i18, boolean z17, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.i(i17, i18, str, z17, onMenuItemClickListener, null, com.tencent.mm.ui.fb.NORMAL);
    }

    public void addIconOptionMenu(int i17, java.lang.String str, int i18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        getController().g(i17, str, i18, onMenuItemClickListener);
    }

    public void addIconOptionMenu(int i17, int i18, int i19, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        getController().f(i17, i18, i19, onMenuItemClickListener);
    }

    public void startActivity(java.lang.Class<?> cls, android.content.Intent intent) {
        intent.setClass(this, cls);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/MMActivity", "startActivity", "(Ljava/lang/Class;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/ui/MMActivity", "startActivity", "(Ljava/lang/Class;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void addIconOptionMenu(int i17, int i18, int i19, boolean z17, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.i(i17, i19, gaVar.f208672u.getString(i18), z17, onMenuItemClickListener, null, com.tencent.mm.ui.fb.NORMAL);
    }

    public void addIconOptionMenu(int i17, int i18, int i19, boolean z17, boolean z18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        com.tencent.mm.ui.ga controller = getController();
        java.lang.String string = controller.f208672u.getString(i18);
        com.tencent.mm.ui.fb fbVar = com.tencent.mm.ui.fb.NORMAL;
        com.tencent.mm.ui.eb ebVar = new com.tencent.mm.ui.eb();
        ebVar.f208375a = i17;
        ebVar.f208376b = i19;
        ebVar.f208382h = string;
        ebVar.f208388n = onMenuItemClickListener;
        ebVar.f208389o = null;
        ebVar.f208386l = fbVar;
        ebVar.f208387m = z17;
        if (i19 == com.tencent.mm.R.drawable.f481980ap2 || i19 == com.tencent.mm.R.raw.icons_outlined_more || i19 == com.tencent.mm.R.raw.actionbar_icon_dark_more || (i19 == com.tencent.mm.R.raw.icons_outlined_help && com.tencent.mm.sdk.platformtools.t8.K0(string))) {
            ebVar.f208382h = controller.f208672u.getString(com.tencent.mm.R.string.w_);
        }
        controller.o0(ebVar.f208375a);
        java.util.LinkedList linkedList = controller.D;
        if (z18) {
            linkedList.addFirst(ebVar);
        } else {
            linkedList.add(ebVar);
        }
        controller.N0();
    }

    public void addTextOptionMenu(int i17, java.lang.String str, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener) {
        this.mController.i(i17, 0, str, false, onMenuItemClickListener, onLongClickListener, com.tencent.mm.ui.fb.NORMAL);
    }

    public void addTextOptionMenu(int i17, java.lang.String str, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener, com.tencent.mm.ui.fb fbVar) {
        this.mController.i(i17, 0, str, false, onMenuItemClickListener, onLongClickListener, fbVar);
    }

    public void addTextOptionMenu(int i17, java.lang.String str, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener, android.view.View.OnTouchListener onTouchListener, com.tencent.mm.ui.fb fbVar) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.getClass();
        com.tencent.mm.ui.eb ebVar = new com.tencent.mm.ui.eb();
        ebVar.f208375a = i17;
        ebVar.f208376b = 0;
        ebVar.f208382h = str;
        ebVar.f208388n = onMenuItemClickListener;
        ebVar.f208389o = onLongClickListener;
        ebVar.f208390p = onTouchListener;
        ebVar.f208386l = fbVar;
        ebVar.f208387m = false;
        gaVar.o0(i17);
        gaVar.D.add(ebVar);
        gaVar.N0();
    }

    public void addIconOptionMenu(int i17, int i18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener) {
        this.mController.i(i17, i18, "", false, onMenuItemClickListener, onLongClickListener, com.tencent.mm.ui.fb.NORMAL);
    }

    public void addIconOptionMenu(int i17, int i18, int i19, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.i(i17, i19, gaVar.f208672u.getString(i18), false, onMenuItemClickListener, onLongClickListener, com.tencent.mm.ui.fb.NORMAL);
    }
}
