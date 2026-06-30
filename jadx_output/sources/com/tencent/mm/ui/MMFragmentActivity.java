package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class MMFragmentActivity extends com.tencent.mm.ui.component.glocom.GloUIComponentActivity implements al5.z2, al5.f3, im5.b {
    public static final long ANIMATION_DURATION = 260;
    public static final java.lang.String EXTRA_USE_SYSTEM_DEFAULT_ENTER_EXIT_ANIM = "extra_use_system_default_enter_exit_anim";
    private static final java.lang.String TAG = "MicroMsg.MMFragmentActivity";
    public static final float WIDTH_SETTLE_FACT = 2.5f;
    public static final float WIDTH_SETTLE_FACT_FOR_CHATTING = 2.5f;
    public static uk5.c aMonitor;
    public static uk5.f aReporter;
    private static java.util.List<com.tencent.mm.ui.ad> interceptors;
    private byte _hellAccFlag_;
    java.lang.String className;
    private android.content.res.Resources customResources;
    private android.content.res.Resources mForceBaseResources;
    private android.content.res.Resources mForceNewResources;
    private android.content.res.Resources mForceOldResources;
    private boolean mIsPaused;
    private com.tencent.mm.ui.widget.SwipeBackLayout mSwipeBackLayout;
    private boolean mSwiping;
    java.util.ArrayList<java.lang.ref.WeakReference<com.tencent.mm.ui.MMFragment>> record = new java.util.ArrayList<>();
    private dm5.a mLifeCycleKeeper = new dm5.a();
    private com.tencent.mm.ui.xc onActResult = null;
    private java.util.List<com.tencent.mm.ui.xc> onActResults = new java.util.LinkedList();
    private java.util.List<com.tencent.mm.ui.yc> onRequestResults = new java.util.LinkedList();
    public yn5.l inflateXMLInfo = new yn5.l(getClass().getSimpleName());
    private com.tencent.mm.ui.uc mActivityAnimStyle = new com.tencent.mm.ui.uc();
    private boolean updateResource = false;
    private boolean updateForceResource = false;
    private android.view.View mContentViewForSwipeBack = null;
    private java.util.List<com.tencent.mm.ui.wc> mDispatchedTouchListeners = new java.util.ArrayList();

    static {
        vj5.n.f437719l = new com.tencent.mm.ui.MMFragmentActivity$$a();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        interceptors = copyOnWriteArrayList;
        copyOnWriteArrayList.add(new com.tencent.mm.ui.tc());
        int i17 = uk5.f.f428550a;
        aReporter = uk5.e.f428549a;
        int i18 = uk5.c.f428548a;
        aMonitor = uk5.b.f428547a;
    }

    public static void addInterceptor(com.tencent.mm.ui.ad adVar) {
        interceptors.add(adVar);
    }

    public static boolean isVASActivity(android.content.Intent intent) {
        return intent != null && lk5.s.d(intent, 1);
    }

    public final boolean R6(android.content.Context context, java.lang.String str, android.content.Intent intent, int i17, com.tencent.mm.ui.x7 x7Var) {
        java.util.Iterator<com.tencent.mm.ui.ad> it = interceptors.iterator();
        while (it.hasNext()) {
            if (it.next().b(context, str, intent, i17, x7Var)) {
                return true;
            }
        }
        return false;
    }

    public void addDispatchedTouchListener(com.tencent.mm.ui.wc wcVar) {
        boolean z17;
        for (com.tencent.mm.ui.wc wcVar2 : this.mDispatchedTouchListeners) {
            if (wcVar2 == wcVar || wcVar2.key().equals(wcVar.key())) {
                z17 = true;
                break;
            }
        }
        z17 = false;
        if (z17) {
            return;
        }
        this.mDispatchedTouchListeners.add(wcVar);
    }

    public java.lang.String appendMemLog() {
        long j17 = java.lang.Runtime.getRuntime().totalMemory();
        long freeMemory = java.lang.Runtime.getRuntime().freeMemory();
        return java.lang.String.format("Runtime: [%s:%s:%s] Native: [%s:%s:%s] ", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(freeMemory), java.lang.Long.valueOf(j17 - freeMemory), java.lang.Long.valueOf(android.os.Debug.getNativeHeapSize()), java.lang.Long.valueOf(android.os.Debug.getNativeHeapAllocatedSize()), java.lang.Long.valueOf(android.os.Debug.getNativeHeapFreeSize()));
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
        fp.q.f265230a.e(this);
    }

    public boolean convertActivityFromTranslucent() {
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        zk3.c Ai;
        if (keyEvent.getKeyCode() == 4 && (Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(this)) != null && ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) Ai).S6(keyEvent)) {
            return true;
        }
        if (getF65848t()) {
            com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = getSwipeBackLayout();
            if (keyEvent.getKeyCode() == 4 && swipeBackLayout != null) {
                swipeBackLayout.a();
                if (swipeBackLayout.f211441v) {
                    com.tencent.mars.xlog.Log.w("ashutest", "ashutest::IS SwipeBack ING, ignore KeyBack Event");
                    return true;
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        java.util.Iterator<com.tencent.mm.ui.wc> it = this.mDispatchedTouchListeners.iterator();
        while (it.hasNext()) {
            it.next().a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean enableActivityAnimation() {
        android.content.Intent intent = getIntent();
        return !(intent != null ? com.tencent.mm.sdk.platformtools.c2.c(intent, EXTRA_USE_SYSTEM_DEFAULT_ENTER_EXIT_ANIM, false) : false);
    }

    public boolean enableEdge2Edge() {
        return true;
    }

    public boolean enableEdgeToEdgeWrapperLayout() {
        return !((db5.f.e(getClass()) & 4096) != 0) && enableEdge2Edge();
    }

    public boolean enableFixNavigationBarForApi35() {
        return !((db5.f.e(getClass()) & 512) != 0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public <T extends android.view.View> T findViewById(int i17) {
        T t17 = (T) super.findViewById(i17);
        int i18 = ih5.c.f291603a;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return t17;
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        initActivityCloseAnimation();
    }

    public boolean forceRemoveNoMatchOnPath() {
        return false;
    }

    public int getActionBarHeightFromTheme() {
        return fp.a.c(this);
    }

    public com.tencent.mm.ui.MMFragment getCurrentFragmet() {
        com.tencent.mm.ui.MMFragment mMFragment;
        int size = this.record.size();
        if (size == 0 || (mMFragment = this.record.get(size - 1).get()) == null || !mMFragment.isShowing()) {
            return null;
        }
        return mMFragment;
    }

    @Override // android.app.Activity
    public android.content.Intent getIntent() {
        android.content.Intent intent = super.getIntent();
        if (intent != null) {
            lk5.d.f319023a.f(intent);
        }
        return intent;
    }

    public final android.content.res.Resources getOriginalResources() {
        return super.getResources();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        if (getAssets() == null || com.tencent.mm.sdk.platformtools.x2.f193075e == null) {
            return super.getResources();
        }
        if (!this.updateResource || this.customResources == null) {
            android.content.res.Resources resources = getBaseContext().getResources();
            android.content.res.Resources resources2 = com.tencent.mm.sdk.platformtools.x2.f193075e;
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

    @Override // androidx.appcompat.app.AppCompatActivity
    public androidx.appcompat.app.b getSupportActionBar() {
        return al5.p0.N(super.getSupportActionBar());
    }

    public com.tencent.mm.ui.widget.SwipeBackLayout getSwipeBackLayout() {
        return this.mSwipeBackLayout;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        if (("clipboard".equals(str) || "power".equals(str)) && getApplicationContext() != null) {
            return getApplicationContext().getSystemService(str);
        }
        java.lang.Object systemService = super.getSystemService(str);
        return "layout_inflater".equals(str) ? com.tencent.mm.ui.id.c((android.view.LayoutInflater) systemService) : systemService;
    }

    @Override // android.app.Activity
    public android.view.WindowManager getWindowManager() {
        if (!isDestroyed()) {
            return super.getWindowManager();
        }
        try {
            java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
            if (stackTrace != null && stackTrace.length >= 2 && stackTrace[1].getMethodName().equals("handleDestroyActivity")) {
                return tp.a.a(super.getWindowManager());
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(TAG, th6.getMessage());
        }
        return super.getWindowManager();
    }

    public void hideVKB() {
        android.view.View currentFocus = getCurrentFocus();
        if (currentFocus == null) {
            hideVKB(getWindow().getDecorView());
        } else {
            hideVKB(currentFocus);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if ((getResources().getConfiguration().orientation == 1) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initActivityCloseAnimation() {
        /*
            r3 = this;
            boolean r0 = r3.enableActivityAnimation()
            if (r0 == 0) goto L58
            java.lang.Class r0 = r3.getClass()
            int r0 = db5.f.e(r0)
            r0 = r0 & 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L16
            r0 = r1
            goto L17
        L16:
            r0 = r2
        L17:
            if (r0 == 0) goto L41
            boolean r0 = com.tencent.mm.ui.bk.y()
            if (r0 == 0) goto L39
            boolean r0 = com.tencent.mm.ui.bk.A()
            if (r0 == 0) goto L35
            android.content.res.Resources r0 = r3.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            if (r0 != r1) goto L32
            goto L33
        L32:
            r1 = r2
        L33:
            if (r1 != 0) goto L39
        L35:
            super.overridePendingTransition(r2, r2)
            goto L58
        L39:
            int r0 = com.tencent.mm.ui.uc.f211084g
            int r1 = com.tencent.mm.ui.uc.f211085h
            super.overridePendingTransition(r0, r1)
            goto L58
        L41:
            java.lang.Class r0 = r3.getClass()
            int r0 = db5.f.e(r0)
            r0 = r0 & 4
            if (r0 == 0) goto L4e
            goto L4f
        L4e:
            r1 = r2
        L4f:
            if (r1 != 0) goto L55
            db5.f.k(r3)
            goto L58
        L55:
            db5.f.h(r3)
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.MMFragmentActivity.initActivityCloseAnimation():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:7|(1:9)(1:68)|10|(10:63|64|13|(3:15|(1:17)(1:21)|(1:19))|22|23|(1:25)(1:59)|26|(1:28)(1:58)|(4:30|(4:32|(2:34|(1:36))|38|39)|40|41)(6:42|43|(1:45)(1:54)|46|(1:48)|(2:50|51)(2:52|53)))|12|13|(0)|22|23|(0)(0)|26|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        if ((getResources().getConfiguration().orientation == 1) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0060, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0061, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ActivityUtil", r1, "", new java.lang.Object[0]);
        com.tencent.mars.xlog.Log.e("MicroMsg.ActivityUtil", "Class %s not found in dex", r9);
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initActivityOpenAnimation(android.content.Intent r9) {
        /*
            r8 = this;
            boolean r0 = r8.enableActivityAnimation()
            if (r0 == 0) goto Lcf
            r0 = 0
            if (r9 != 0) goto Lb
            r9 = r0
            goto Lf
        Lb:
            android.content.ComponentName r9 = r9.getComponent()
        Lf:
            if (r9 == 0) goto Lcf
            java.lang.String r1 = r9.getClassName()
            java.lang.String r2 = r9.getPackageName()
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L24
            java.lang.String r9 = r9.getClassName()
            goto L28
        L24:
            java.lang.String r9 = r9.getClassName()
        L28:
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r2 = "Class %s not found in dex"
            java.lang.String r3 = ""
            java.lang.String r4 = "MicroMsg.ActivityUtil"
            r5 = 0
            if (r1 == 0) goto L37
        L35:
            r1 = r0
            goto L4a
        L37:
            java.lang.Class r1 = java.lang.Class.forName(r9)     // Catch: java.lang.ClassNotFoundException -> L3c
            goto L4a
        L3c:
            r1 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r5]
            com.tencent.mars.xlog.Log.printErrStackTrace(r4, r1, r3, r6)
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            com.tencent.mars.xlog.Log.e(r4, r2, r1)
            goto L35
        L4a:
            r6 = 1
            if (r1 == 0) goto L5b
            int r1 = db5.f.e(r1)
            r1 = r1 & 64
            if (r1 == 0) goto L57
            r1 = r6
            goto L58
        L57:
            r1 = r5
        L58:
            if (r1 == 0) goto L5b
            return
        L5b:
            java.lang.Class r1 = java.lang.Class.forName(r9)     // Catch: java.lang.ClassNotFoundException -> L60
            goto L6e
        L60:
            r1 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r5]
            com.tencent.mars.xlog.Log.printErrStackTrace(r4, r1, r3, r7)
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            com.tencent.mars.xlog.Log.e(r4, r2, r1)
            r1 = r0
        L6e:
            if (r1 == 0) goto L75
            int r1 = db5.f.e(r1)
            goto L76
        L75:
            r1 = r5
        L76:
            r1 = r1 & 2
            if (r1 != 0) goto L7c
            r1 = r6
            goto L7d
        L7c:
            r1 = r5
        L7d:
            if (r1 == 0) goto La7
            boolean r9 = com.tencent.mm.ui.bk.y()
            if (r9 == 0) goto L9f
            boolean r9 = com.tencent.mm.ui.bk.A()
            if (r9 == 0) goto L9b
            android.content.res.Resources r9 = r8.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            int r9 = r9.orientation
            if (r9 != r6) goto L98
            goto L99
        L98:
            r6 = r5
        L99:
            if (r6 != 0) goto L9f
        L9b:
            super.overridePendingTransition(r5, r5)
            goto Lcf
        L9f:
            int r9 = com.tencent.mm.ui.uc.f211082e
            int r0 = com.tencent.mm.ui.uc.f211083f
            super.overridePendingTransition(r9, r0)
            goto Lcf
        La7:
            java.lang.Class r0 = java.lang.Class.forName(r9)     // Catch: java.lang.ClassNotFoundException -> Lac
            goto Lb9
        Lac:
            r1 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r5]
            com.tencent.mars.xlog.Log.printErrStackTrace(r4, r1, r3, r7)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            com.tencent.mars.xlog.Log.e(r4, r2, r9)
        Lb9:
            if (r0 == 0) goto Lc0
            int r9 = db5.f.e(r0)
            goto Lc1
        Lc0:
            r9 = r5
        Lc1:
            r9 = r9 & 4
            if (r9 == 0) goto Lc6
            r5 = r6
        Lc6:
            if (r5 != 0) goto Lcc
            db5.f.i(r8)
            goto Lcf
        Lcc:
            db5.f.h(r8)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.MMFragmentActivity.initActivityOpenAnimation(android.content.Intent):void");
    }

    public boolean initNavigationSwipeBack() {
        if (db5.f.g()) {
            if (!((db5.f.e(getClass()) & 1) == 0) || !convertActivityFromTranslucent()) {
                if (((db5.f.e(getClass()) & 16) != 0) && com.tencent.mm.sdk.platformtools.u3.e()) {
                    db5.f.b(this);
                }
            } else if (com.tencent.mm.sdk.platformtools.u3.e()) {
                db5.f.b(this);
            }
        }
        if (!getF65848t()) {
            return false;
        }
        initSwipeBack();
        return true;
    }

    public void initSwipeBack() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getWindow().getDecorView();
        int i17 = 0;
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = (com.tencent.mm.ui.widget.SwipeBackLayout) android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.cxh, viewGroup, false);
        this.mSwipeBackLayout = swipeBackLayout;
        swipeBackLayout.c();
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        android.view.View childAt = viewGroup.getChildAt(0);
        if (childAt.findViewById(android.R.id.content) == null) {
            int childCount = viewGroup.getChildCount();
            while (true) {
                if (i17 >= childCount) {
                    break;
                }
                android.view.View childAt2 = viewGroup.getChildAt(i17);
                if ((childAt2 instanceof android.view.ViewGroup) && childAt2.findViewById(android.R.id.content) != null) {
                    childAt = childAt2;
                    break;
                }
                i17++;
            }
        }
        childAt.setBackgroundResource(com.tencent.mm.R.color.a9e);
        viewGroup.removeView(childAt);
        this.mSwipeBackLayout.addView(childAt);
        this.mSwipeBackLayout.setContentView(childAt);
        viewGroup.addView(this.mSwipeBackLayout);
        this.mSwipeBackLayout.setSwipeGestureDelegate(this);
    }

    public boolean isCallSuperOnSaveInstanceState() {
        return false;
    }

    /* renamed from: isHideStatusBar */
    public boolean getP() {
        return (db5.f.e(getClass()) & 32) != 0;
    }

    public boolean isPaused() {
        return this.mIsPaused;
    }

    /* renamed from: isSupportNavigationSwipeBack */
    public boolean getF65848t() {
        if (db5.f.g() && ep.a.a() && supportNavigationSwipeBack()) {
            return (db5.f.e(getClass()) & 1) == 0;
        }
        return false;
    }

    public boolean isSwiping() {
        return this.mSwiping;
    }

    public void keep(im5.a aVar) {
        this.mLifeCycleKeeper.f241759a.keep(aVar);
    }

    public void lifeCycleKeeperOnCreate() {
        this.mLifeCycleKeeper.getClass();
    }

    public void lifeCycleKeeperOnDestroy() {
        this.mLifeCycleKeeper.f241759a.dead();
    }

    public void lifeCycleKeeperOnPause() {
        this.mLifeCycleKeeper.f241760b.dead();
    }

    public void lifeCycleKeeperOnResume() {
        this.mLifeCycleKeeper.getClass();
    }

    public void lifeCycleKeeperOnStart() {
        this.mLifeCycleKeeper.getClass();
    }

    public void lifeCycleKeeperOnStop() {
        this.mLifeCycleKeeper.f241761c.dead();
    }

    public void m6() {
        hideVKB();
    }

    public void mmStartActivityForResult(com.tencent.mm.ui.xc xcVar, android.content.Intent intent, int i17) {
        this.onActResult = xcVar;
        startActivityForResult(intent, i17);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mm.ui.xc xcVar = this.onActResult;
        this.onActResult = null;
        if (xcVar != null) {
            xcVar.mmOnActivityResult(i17, i18, intent);
        }
        java.util.Iterator<com.tencent.mm.ui.xc> it = this.onActResults.iterator();
        while (it.hasNext()) {
            it.next().mmOnActivityResult(i17, i18, intent);
        }
    }

    public void onCancel() {
        this.mSwiping = false;
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        android.view.ViewGroup viewGroup;
        android.view.View findViewById;
        super.onConfigurationChanged(configuration);
        if (getSupportActionBar() == null || (viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.crd)) == null || (findViewById = viewGroup.findViewById(com.tencent.mm.R.id.f482432ef)) == null || !(findViewById instanceof androidx.appcompat.widget.Toolbar)) {
            return;
        }
        androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) findViewById;
        android.view.ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = getActionBarHeightFromTheme();
        }
        toolbar.setLayoutParams(layoutParams);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.Window window;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(bundle);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MMFragmentActivity", "com/tencent/mm/ui/MMFragmentActivity", "onCreate", "(Landroid/os/Bundle;)V", this, array);
        aMonitor.b(this);
        java.lang.String name = getClass().getName();
        this.className = name;
        com.tencent.mm.ui.zj.a(3, name);
        super.onCreate(bundle);
        if (enableEdgeToEdgeWrapperLayout() && (window = getWindow()) != null && getWindow() != null && com.tencent.mm.ui.b4.c(this)) {
            try {
                window.getDecorView();
                n3.h2.a(window, false);
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                int i17 = android.os.Build.VERSION.SDK_INT;
                if (i17 >= 28) {
                    int i18 = i17 < 30 ? 1 : 3;
                    android.view.WindowManager.LayoutParams attributes = window.getAttributes();
                    if (attributes.layoutInDisplayCutoutMode != i18) {
                        attributes.layoutInDisplayCutoutMode = i18;
                        window.setAttributes(attributes);
                    }
                }
                if (i17 >= 29) {
                    window.setStatusBarContrastEnforced(false);
                    window.setNavigationBarContrastEnforced(false);
                }
            } catch (java.lang.RuntimeException e17) {
                e17.toString();
            }
        }
        lifeCycleKeeperOnCreate();
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.o.f(intent, "getIntent(...)");
        android.os.Parcelable parcelableExtra = intent.getParcelableExtra("KEY_LIFE_CYCLE_OBSERVER");
        android.os.ResultReceiver resultReceiver = parcelableExtra instanceof android.os.ResultReceiver ? (android.os.ResultReceiver) parcelableExtra : null;
        com.tencent.mm.ui.MMTransferLifecycleObserver mMTransferLifecycleObserver = resultReceiver != null ? new com.tencent.mm.ui.MMTransferLifecycleObserver(resultReceiver) : null;
        if (mMTransferLifecycleObserver != null) {
            mo133getLifecycle().a(mMTransferLifecycleObserver);
        }
        java.lang.String simpleName = getClass().getSimpleName();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(getTaskId());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(TAG, "checktask onCreate:%s#0x%x, taskid:%d, task:%s appendMemLog:%s", simpleName, valueOf, valueOf2, new com.tencent.mm.sdk.platformtools.q8(this), appendMemLog());
        yj0.a.h(this, "com/tencent/mm/ui/MMFragmentActivity", "com/tencent/mm/ui/MMFragmentActivity", "onCreate", "(Landroid/os/Bundle;)V");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(6:3|(5:5|6|(1:8)|9|(1:11))|15|(1:17)|19|20)|14|15|(0)|19|20) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093 A[Catch: all -> 0x00af, TRY_LEAVE, TryCatch #1 {all -> 0x00af, blocks: (B:15:0x0089, B:17:0x0093), top: B:14:0x0089 }] */
    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            r8 = this;
            java.lang.String r0 = "com/tencent/mm/ui/MMFragmentActivity"
            java.lang.String r1 = "onDestroy"
            java.lang.String r2 = "()V"
            yj0.a.a(r0, r0, r1, r2, r8)
            uk5.c r3 = com.tencent.mm.ui.MMFragmentActivity.aMonitor
            yn5.l r4 = r8.inflateXMLInfo
            r3.a(r4)
            java.lang.Class r3 = r8.getClass()
            java.lang.String r3 = r3.getSimpleName()
            int r4 = r8.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.f192989a
            com.tencent.mm.sdk.platformtools.q8 r5 = new com.tencent.mm.sdk.platformtools.q8
            r5.<init>(r8)
            java.lang.String r6 = r8.appendMemLog()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5, r6}
            java.lang.String r4 = "MicroMsg.MMFragmentActivity"
            java.lang.String r5 = "checktask onDestroy:%s#0x%x task:%s appendMemLog:%s"
            com.tencent.mars.xlog.Log.i(r4, r5, r3)
            r8.lifeCycleKeeperOnDestroy()
            java.util.List<com.tencent.mm.ui.wc> r3 = r8.mDispatchedTouchListeners
            r3.clear()
            super.onDestroy()
            um0.b.a(r8)
            java.lang.String r3 = "HUAWEI"
            java.lang.String r4 = android.os.Build.MANUFACTURER
            boolean r3 = r3.equalsIgnoreCase(r4)
            java.lang.String r4 = "mContext"
            r5 = 1
            if (r3 != 0) goto L52
            goto L89
        L52:
            int r3 = android.os.Build.VERSION.SDK_INT
            r6 = 24
            if (r3 == r6) goto L59
            goto L89
        L59:
            java.lang.Class r3 = um0.c.f428702a     // Catch: java.lang.Throwable -> L89
            if (r3 != 0) goto L7b
            java.lang.String r3 = "android.gestureboost.GestureBoostManager"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L89
            um0.c.f428702a = r3     // Catch: java.lang.Throwable -> L89
            java.lang.String r6 = "sGestureBoostManager"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r6)     // Catch: java.lang.Throwable -> L89
            um0.c.f428703b = r3     // Catch: java.lang.Throwable -> L89
            r3.setAccessible(r5)     // Catch: java.lang.Throwable -> L89
            java.lang.Class r3 = um0.c.f428702a     // Catch: java.lang.Throwable -> L89
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L89
            um0.c.f428704c = r3     // Catch: java.lang.Throwable -> L89
            r3.setAccessible(r5)     // Catch: java.lang.Throwable -> L89
        L7b:
            java.lang.reflect.Field r3 = um0.c.f428703b     // Catch: java.lang.Throwable -> L89
            r6 = 0
            java.lang.Object r3 = r3.get(r6)     // Catch: java.lang.Throwable -> L89
            if (r3 == 0) goto L89
            java.lang.reflect.Field r7 = um0.c.f428704c     // Catch: java.lang.Throwable -> L89
            r7.set(r3, r6)     // Catch: java.lang.Throwable -> L89
        L89:
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> Laf
            java.lang.String r6 = "samsung"
            boolean r3 = r3.equalsIgnoreCase(r6)     // Catch: java.lang.Throwable -> Laf
            if (r3 == 0) goto Laf
            android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Throwable -> Laf
            java.lang.String r6 = "com.samsung.android.content.clipboard.SemClipboardManager"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r3 = r3.getSystemService(r6)     // Catch: java.lang.Throwable -> Laf
            java.lang.Class r6 = r3.getClass()     // Catch: java.lang.Throwable -> Laf
            java.lang.reflect.Field r4 = r6.getDeclaredField(r4)     // Catch: java.lang.Throwable -> Laf
            r4.setAccessible(r5)     // Catch: java.lang.Throwable -> Laf
            android.content.Context r5 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Throwable -> Laf
            r4.set(r3, r5)     // Catch: java.lang.Throwable -> Laf
        Laf:
            yj0.a.h(r8, r0, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.MMFragmentActivity.onDestroy():void");
    }

    public void onDrag() {
        this.mSwiping = true;
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.ui.zj.a(2, this.className);
        this.mIsPaused = true;
        super.onPause();
        if (getF65848t()) {
            if (getSwipeBackLayout() != null) {
                getSwipeBackLayout().setEnableGesture(false);
            }
            if (!isFinishing()) {
                al5.a3.d(this);
            }
        }
        lifeCycleKeeperOnPause();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i17, strArr, iArr);
        java.util.Iterator<com.tencent.mm.ui.yc> it = this.onRequestResults.iterator();
        while (it.hasNext()) {
            it.next().a(i17, strArr, iArr);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        android.content.res.Resources resources;
        com.tencent.mm.ui.zj.a(1, this.className);
        this.mIsPaused = false;
        super.onResume();
        if (com.tencent.mm.ui.bk.U() && (resources = this.customResources) != null && (resources instanceof j65.j)) {
            ((j65.j) resources).updateConfiguration(resources.getConfiguration(), ((j65.j) this.customResources).f297961e.e());
        }
        if (getF65848t()) {
            al5.a3.c(this);
            onSwipe(1.0f);
            if (getSwipeBackLayout() != null) {
                getSwipeBackLayout().setEnableGesture(true);
                com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = getSwipeBackLayout();
                swipeBackLayout.f211441v = false;
                swipeBackLayout.F = false;
            }
        }
        lifeCycleKeeperOnResume();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        if (isCallSuperOnSaveInstanceState()) {
            super.onSaveInstanceState(bundle);
        }
    }

    public void onSettle(boolean z17, int i17, boolean z18) {
        if (z18) {
            if (this.mContentViewForSwipeBack == null) {
                this.mContentViewForSwipeBack = com.tencent.mm.ui.bk.b(getWindow(), getSupportActionBar().j());
            }
            android.view.View view = this.mContentViewForSwipeBack;
            if (z17) {
                com.tencent.mm.ui.tools.l5.a(view, i17 <= 0 ? 260L : 130L, 0.0f, 0.0f, null);
            } else {
                com.tencent.mm.ui.tools.l5.a(view, i17 <= 0 ? 260L : 130L, (view.getWidth() * (-1)) / 2.5f, 0.0f, null);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        lifeCycleKeeperOnStart();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        lifeCycleKeeperOnStop();
        super.onStop();
    }

    public void onSwipe(float f17) {
        if (this.mContentViewForSwipeBack == null) {
            this.mContentViewForSwipeBack = com.tencent.mm.ui.bk.b(getWindow(), getSupportActionBar() != null ? getSupportActionBar().j() : null);
        }
        android.view.View view = this.mContentViewForSwipeBack;
        if (java.lang.Float.compare(1.0f, f17) <= 0) {
            com.tencent.mm.ui.tools.l5.c(view, 0.0f, 0.0f);
        } else {
            com.tencent.mm.ui.tools.l5.c(view, (view.getWidth() / 2.5f) * (1.0f - f17) * (-1.0f), 0.0f);
            view.postInvalidateOnAnimation();
        }
    }

    public void onSwipeBack() {
        if (!isFinishing()) {
            finish();
        }
        android.view.View decorView = getWindow().getDecorView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(decorView, arrayList.toArray(), "com/tencent/mm/ui/MMFragmentActivity", "onSwipeBack", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        decorView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(decorView, "com/tencent/mm/ui/MMFragmentActivity", "onSwipeBack", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        overridePendingTransition(0, 0);
        this.mSwiping = false;
    }

    @Override // android.app.Activity
    public void onTopResumedActivityChanged(boolean z17) {
        android.content.res.Resources resources;
        super.onTopResumedActivityChanged(z17);
        if (com.tencent.mm.ui.bk.U() && z17 && (resources = this.customResources) != null && (resources instanceof j65.j)) {
            ((j65.j) resources).updateConfiguration(resources.getConfiguration(), ((j65.j) this.customResources).f297961e.e());
        }
    }

    public boolean popBackStackImmediate() {
        if (this.record.size() == 0) {
            return false;
        }
        this.record.remove(r0.size() - 1);
        return getSupportFragmentManager().popBackStackImmediate();
    }

    public void putActivityCloseAnimation(int i17, int i18) {
        if (enableActivityAnimation()) {
            com.tencent.mm.ui.uc.f211084g = i17;
            com.tencent.mm.ui.uc.f211085h = i18;
        }
        super.overridePendingTransition(i17, i18);
    }

    public void putActivityOpenAnimation(int i17, int i18) {
        if (enableActivityAnimation()) {
            com.tencent.mm.ui.uc.f211082e = i17;
            com.tencent.mm.ui.uc.f211083f = i18;
        }
        super.overridePendingTransition(i17, i18);
    }

    public void registerMMOnFragmentActivityResult(com.tencent.mm.ui.xc xcVar) {
        if (this.onActResults.contains(xcVar)) {
            return;
        }
        this.onActResults.add(xcVar);
    }

    public void registerMMOnRequestPermissionsResult(com.tencent.mm.ui.yc ycVar) {
        if (this.onRequestResults.contains(ycVar)) {
            return;
        }
        this.onRequestResults.add(ycVar);
    }

    public void removeDispatchedTouchListener(com.tencent.mm.ui.wc wcVar) {
        this.mDispatchedTouchListeners.remove(wcVar);
    }

    public void setMMOnFragmentActivityResult(com.tencent.mm.ui.xc xcVar) {
        this.onActResult = xcVar;
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i17) {
        if (!com.tencent.mm.sdk.platformtools.d.a(this, i17)) {
            com.tencent.mars.xlog.Log.e(TAG, "AndroidOSafety.safety false ignore setRequestedOrientation %s for activity %s", java.lang.Integer.valueOf(i17), this);
            return;
        }
        try {
            super.setRequestedOrientation(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "AndroidOSafety.safety uncaught", new java.lang.Object[0]);
        }
    }

    public void showVKB() {
        android.view.View currentFocus;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getSystemService("input_method");
        if (inputMethodManager == null || (currentFocus = getCurrentFocus()) == null || currentFocus.getWindowToken() == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 2);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivities(android.content.Intent[] intentArr, android.os.Bundle bundle) {
        if (com.tencent.mm.ui.b2.a(this, this.mIsPaused, intentArr, bundle)) {
            return;
        }
        super.startActivities(intentArr, bundle);
        initActivityOpenAnimation(null);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(android.content.Intent intent) {
        java.lang.String className = intent.getComponent() != null ? intent.getComponent().getClassName() : "";
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (R6(this, className == null ? "" : className, intent, 0, null)) {
            return;
        }
        super.startActivity(intent);
        initActivityOpenAnimation(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17) {
        super.startActivityForResult(intent, i17);
        initActivityOpenAnimation(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void startActivityFromFragment(androidx.fragment.app.Fragment fragment, android.content.Intent intent, int i17) {
        java.lang.String className = intent.getComponent() != null ? intent.getComponent().getClassName() : "";
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (R6(this, className == null ? "" : className, intent, i17, null)) {
            return;
        }
        super.startActivityFromFragment(fragment, intent, i17);
        initActivityOpenAnimation(intent);
    }

    public void startVASActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        try {
            lk5.q0.e(this, java.lang.Class.forName(intent.getComponent().getClassName()), intent, bundle, i17);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        if (getCurrentFragmet() == null || !getCurrentFragmet().interceptSupportInvalidateOptionsMenu()) {
            super.supportInvalidateOptionsMenu();
        }
    }

    public boolean supportNavigationSwipeBack() {
        return true;
    }

    public void switchFragment(androidx.fragment.app.Fragment fragment, int i17, boolean z17, boolean z18, int i18, int i19) {
        if (fragment == null || i17 == 0) {
            return;
        }
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.i2 beginTransaction = supportFragmentManager.beginTransaction();
        if (z18) {
            beginTransaction.l(i18, i19, 0, 0);
        }
        if (supportFragmentManager.findFragmentById(i17) == null) {
            beginTransaction.h(i17, fragment, fragment.getTag(), 1);
        } else if (fragment.isHidden()) {
            beginTransaction.n(fragment);
        }
        if (z17) {
            beginTransaction.c(null);
        }
        beginTransaction.d();
        supportFragmentManager.executePendingTransactions();
    }

    public void switchFragmentActivity(androidx.fragment.app.Fragment fragment) {
        if (fragment == null) {
            return;
        }
        switchFragmentActivity(fragment, fragment.getId());
    }

    public void switchFragmentInternalBackwardWithAnim(androidx.fragment.app.Fragment fragment) {
        switchFragmentInternalBackwardWithAnim(fragment, fragment.getId());
    }

    public void switchFragmentInternalBackwardWithAnimLeftSelfView(androidx.fragment.app.Fragment fragment, android.view.View view) {
        if (fragment == null) {
            return;
        }
        switchFragmentInternalBackwardWithAnimLeftSelfView(fragment, fragment.getId(), view);
    }

    public void switchFragmentInternalFarwardWithAnim(androidx.fragment.app.Fragment fragment) {
        if (fragment == null) {
            return;
        }
        switchFragmentInternalFarwardWithAnim(fragment, fragment.getId());
    }

    public void switchFragmentInternalWithoutAnim(androidx.fragment.app.Fragment fragment) {
        if (fragment == null) {
            return;
        }
        switchFragmentInternalWithoutAnim(fragment, fragment.getId());
    }

    public im5.b theCreate() {
        return this.mLifeCycleKeeper.f241759a;
    }

    public im5.b theResume() {
        return this.mLifeCycleKeeper.f241760b;
    }

    public im5.b theStart() {
        return this.mLifeCycleKeeper.f241760b;
    }

    public void unregisterMMOnFragmentActivityResult(com.tencent.mm.ui.xc xcVar) {
        this.onActResults.remove(xcVar);
    }

    public void unregisterMMOnRequestPermissionsResult(com.tencent.mm.ui.yc ycVar) {
        this.onRequestResults.remove(ycVar);
    }

    public void switchFragmentActivity(androidx.fragment.app.Fragment fragment, int i17) {
        switchFragment(fragment, i17, true, true, com.tencent.mm.R.anim.f477843d1, com.tencent.mm.R.anim.f477848d6);
        this.record.add(new java.lang.ref.WeakReference<>((com.tencent.mm.ui.MMFragment) fragment));
    }

    public void switchFragmentInternalBackwardWithAnim(androidx.fragment.app.Fragment fragment, int i17) {
        switchFragment(fragment, i17, false, true, com.tencent.mm.R.anim.f477880e4, com.tencent.mm.R.anim.f477889ed);
    }

    public void switchFragmentInternalBackwardWithAnimLeftSelfView(androidx.fragment.app.Fragment fragment, int i17, android.view.View view) {
        switchFragment(fragment, i17, false, true, 0, com.tencent.mm.R.anim.f477889ed);
        if (view == null) {
            return;
        }
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477880e4);
        if (loadAnimation != null) {
            view.startAnimation(loadAnimation);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/MMFragmentActivity", "switchFragmentInternalBackwardWithAnimLeftSelfView", "(Landroidx/fragment/app/Fragment;ILandroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/MMFragmentActivity", "switchFragmentInternalBackwardWithAnimLeftSelfView", "(Landroidx/fragment/app/Fragment;ILandroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void switchFragmentInternalFarwardWithAnim(androidx.fragment.app.Fragment fragment, int i17) {
        switchFragment(fragment, i17, false, true, com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
    }

    public void switchFragmentInternalWithoutAnim(androidx.fragment.app.Fragment fragment, int i17) {
        switchFragment(fragment, i17, false, false, 0, 0);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        com.tencent.mm.ui.dd ddVar;
        java.lang.String className = intent.getComponent() != null ? intent.getComponent().getClassName() : "";
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (R6(this, className == null ? "" : className, intent, i17, null)) {
            return;
        }
        if (com.tencent.mm.ui.b2.a(this, this.mIsPaused, new android.content.Intent[]{intent}, java.lang.Integer.valueOf(i17), bundle)) {
            android.os.Parcelable parcelableExtra = intent.getParcelableExtra("KEY_START_ACTIVITY_OBSERVER");
            android.os.ResultReceiver resultReceiver = parcelableExtra instanceof android.os.ResultReceiver ? (android.os.ResultReceiver) parcelableExtra : null;
            ddVar = resultReceiver != null ? new com.tencent.mm.ui.dd(resultReceiver) : null;
            if (ddVar == null) {
                return;
            }
            ddVar.f208334a.send(1, new android.os.Bundle());
            intent.removeExtra("KEY_START_ACTIVITY_OBSERVER");
            return;
        }
        boolean isVASActivity = isVASActivity(intent);
        aReporter.b(intent, this, isVASActivity);
        lk5.d.f319023a.g(intent);
        if (isVASActivity) {
            startVASActivityForResult(intent, i17, bundle);
        } else {
            super.startActivityForResult(intent, i17, bundle);
        }
        initActivityOpenAnimation(intent);
        android.os.Parcelable parcelableExtra2 = intent.getParcelableExtra("KEY_START_ACTIVITY_OBSERVER");
        android.os.ResultReceiver resultReceiver2 = parcelableExtra2 instanceof android.os.ResultReceiver ? (android.os.ResultReceiver) parcelableExtra2 : null;
        ddVar = resultReceiver2 != null ? new com.tencent.mm.ui.dd(resultReceiver2) : null;
        if (ddVar == null) {
            return;
        }
        ddVar.f208334a.send(0, new android.os.Bundle());
        intent.removeExtra("KEY_START_ACTIVITY_OBSERVER");
    }

    public void hideVKB(android.view.View view) {
        android.view.inputmethod.InputMethodManager inputMethodManager;
        android.os.IBinder windowToken;
        if (view == null || (inputMethodManager = (android.view.inputmethod.InputMethodManager) getSystemService("input_method")) == null || (windowToken = view.getWindowToken()) == null) {
            return;
        }
        try {
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        } catch (java.lang.IllegalArgumentException e17) {
            com.tencent.mars.xlog.Log.e(TAG, "hide VKB(View) exception %s", e17);
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivities(android.content.Intent[] intentArr) {
        super.startActivities(intentArr);
        initActivityOpenAnimation(null);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(android.content.Intent intent, android.os.Bundle bundle) {
        super.startActivity(intent, bundle);
        initActivityOpenAnimation(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void startActivityFromFragment(androidx.fragment.app.Fragment fragment, android.content.Intent intent, int i17, android.os.Bundle bundle) {
        java.lang.String className = intent.getComponent() != null ? intent.getComponent().getClassName() : "";
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (R6(this, className == null ? "" : className, intent, i17, null) || com.tencent.mm.ui.b2.a(this, this.mIsPaused, new android.content.Intent[]{intent}, fragment, java.lang.Integer.valueOf(i17))) {
            return;
        }
        super.startActivityFromFragment(fragment, intent, i17, bundle);
    }

    public com.tencent.mm.ui.vc startActivityForResult(android.content.Intent intent) {
        return startActivityForResult(intent, (android.os.Bundle) null);
    }

    public com.tencent.mm.ui.vc startActivityForResult(android.content.Intent intent, android.os.Bundle bundle) {
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        com.tencent.mm.ui.bd bdVar = new com.tencent.mm.ui.bd();
        androidx.activity.result.c e17 = getActivityResultRegistry().e(java.lang.String.valueOf(java.lang.System.currentTimeMillis()), new h.f(), bdVar);
        bdVar.f197878b = e17;
        e17.a(intent, null);
        return bdVar;
    }
}
