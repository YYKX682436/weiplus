package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class NewChattingTabUI implements com.tencent.mm.ui.m8 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.MMFragmentActivity f197014a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.n8 f197015b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.tools.TestTimeForChatting f197016c;

    /* renamed from: d, reason: collision with root package name */
    public int f197017d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.MessageQueue.IdleHandler f197018e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.OnLayoutChangedLinearLayout f197019f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f197020g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f197021h;

    /* renamed from: i, reason: collision with root package name */
    public android.os.Bundle f197022i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f197023j;
    private com.tencent.mm.ui.IChattingUIProxy mChattingUIProxy;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.BaseChattingUIFragment f197027n;

    /* renamed from: p, reason: collision with root package name */
    public long f197029p;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Bitmap f197031r;

    /* renamed from: t, reason: collision with root package name */
    public android.view.animation.Animation f197033t;

    /* renamed from: v, reason: collision with root package name */
    public android.view.animation.Animation f197035v;

    /* renamed from: k, reason: collision with root package name */
    public boolean f197024k = true;

    /* renamed from: l, reason: collision with root package name */
    public boolean f197025l = false;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f197026m = new com.tencent.mm.ui.pf(this);

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Boolean[] f197028o = {null};

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.ui.dg f197030q = new com.tencent.mm.ui.dg(this, null);

    /* renamed from: s, reason: collision with root package name */
    public boolean f197032s = false;
    java.lang.Runnable mStartChattingRunnable = new com.tencent.mm.ui.xf(this);

    /* renamed from: u, reason: collision with root package name */
    public final db5.x8 f197034u = new com.tencent.mm.ui.ag(this);

    public NewChattingTabUI(com.tencent.mm.ui.n8 n8Var) {
        this.f197015b = n8Var;
    }

    public static void b(com.tencent.mm.ui.NewChattingTabUI newChattingTabUI) {
        newChattingTabUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "[doJobOnChattingAnimStart] cost:%sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - newChattingTabUI.f197029p));
        newChattingTabUI.f197025l = true;
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting = newChattingTabUI.f197016c;
        if (testTimeForChatting != null) {
            testTimeForChatting.setTranslationX(0.0f);
            newChattingTabUI.f197016c.e();
            com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = newChattingTabUI.f197027n;
            if (baseChattingUIFragment == null || !baseChattingUIFragment.isSupportNavigationSwipeBack()) {
                return;
            }
            newChattingTabUI.f197027n.getSwipeBackLayout().setEnableGesture(false);
        }
    }

    public static void c(com.tencent.mm.ui.NewChattingTabUI newChattingTabUI) {
        newChattingTabUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "[doJobOnChattingAnimEnd]");
        ((com.tencent.mm.booter.notification.x) c01.d9.f()).k(false);
        newChattingTabUI.f197025l = false;
        if (newChattingTabUI.f197016c != null) {
            ((ku5.t0) ku5.t0.f312615d).D(new com.tencent.mm.ui.of(newChattingTabUI));
            com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = newChattingTabUI.f197027n;
            if (baseChattingUIFragment == null || !baseChattingUIFragment.isSupportNavigationSwipeBack()) {
                return;
            }
            newChattingTabUI.f197027n.getSwipeBackLayout().setEnableGesture(true);
        }
    }

    public static void e(com.tencent.mm.ui.NewChattingTabUI newChattingTabUI, android.content.Intent intent, boolean z17) {
        boolean z18;
        if (!newChattingTabUI.m()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (newChattingTabUI.l()) {
                com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = new com.tencent.mm.ui.chatting.ChattingUIFragment();
                newChattingTabUI.f197027n = chattingUIFragment;
                newChattingTabUI.mChattingUIProxy = new com.tencent.mm.ui.chatting.ChattingUIProxy(newChattingTabUI.f197014a, chattingUIFragment);
                z18 = true;
            } else {
                z18 = false;
            }
            try {
                newChattingTabUI.g();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LauncherUI.NewChattingTabUI", e17, "[prepareChattingFragment]", new java.lang.Object[0]);
            }
            if (intent != null) {
                newChattingTabUI.f197027n.getArguments().putAll(com.tencent.mm.sdk.platformtools.c2.e(intent));
            }
            if (z18) {
                newChattingTabUI.mChattingUIProxy.onInit(newChattingTabUI.f197017d, z17);
                newChattingTabUI.f197019f = (com.tencent.mm.ui.base.OnLayoutChangedLinearLayout) newChattingTabUI.f197027n.getView().findViewById(com.tencent.mm.R.id.bkb);
                newChattingTabUI.f197027n.f198156m = true;
            } else {
                newChattingTabUI.mChattingUIProxy.onEnterBegin();
            }
            if (newChattingTabUI.f197027n.isSupportNavigationSwipeBack()) {
                newChattingTabUI.f197027n.getSwipeBackLayout().setNeedRequestActivityTranslucent(false);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "ashu::prepareChattingFragment use %dms, needInit %B, Intent %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Boolean.valueOf(z18), intent);
            return;
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        if (newChattingTabUI.l()) {
            com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment2 = new com.tencent.mm.ui.chatting.ChattingUIFragment();
            newChattingTabUI.f197027n = chattingUIFragment2;
            newChattingTabUI.mChattingUIProxy = new com.tencent.mm.ui.chatting.ChattingUIProxy(newChattingTabUI.f197014a, chattingUIFragment2);
        }
        try {
            newChattingTabUI.g();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LauncherUI.NewChattingTabUI", e18, "[prepareChattingFragment]", new java.lang.Object[0]);
        }
        if (intent != null) {
            newChattingTabUI.f197027n.getArguments().putAll(com.tencent.mm.sdk.platformtools.c2.e(intent));
        }
        if (z17) {
            com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = newChattingTabUI.f197027n;
            if (!baseChattingUIFragment.f198156m) {
                baseChattingUIFragment.Q0(newChattingTabUI.f197014a);
            }
        } else {
            if (newChattingTabUI.f197027n.f198156m) {
                newChattingTabUI.mChattingUIProxy.onEnterBegin();
            } else {
                newChattingTabUI.mChattingUIProxy.onInit(newChattingTabUI.f197017d, false);
                newChattingTabUI.f197019f = (com.tencent.mm.ui.base.OnLayoutChangedLinearLayout) newChattingTabUI.f197027n.getView().findViewById(com.tencent.mm.R.id.bkb);
                newChattingTabUI.f197027n.f198156m = true;
            }
            if (newChattingTabUI.f197027n.isSupportNavigationSwipeBack()) {
                newChattingTabUI.f197027n.getSwipeBackLayout().setNeedRequestActivityTranslucent(false);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "ashu::prepareChattingFragment use %dms, needInit %B, Intent %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2), java.lang.Boolean.valueOf(!newChattingTabUI.f197027n.f198156m), intent);
    }

    public final boolean a(boolean z17, int i17) {
        com.tencent.mm.ui.HomeUI homeUI = (com.tencent.mm.ui.HomeUI) this.f197015b;
        homeUI.getClass();
        if (!(homeUI.f196757p == com.tencent.mm.ui.HomeUI.ActivityStatus.ACTIVITY_RESUME)) {
            return false;
        }
        android.view.View findViewById = this.f197014a.findViewById(com.tencent.mm.R.id.huh);
        if (findViewById == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LauncherUI.NewChattingTabUI", "[onSettle] null == container");
            return true;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) this.f197014a.findViewById(com.tencent.mm.R.id.l3_);
        if (imageView != null && imageView.getVisibility() == 8 && imageView.getDrawable() != null) {
            imageView.setVisibility(0);
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "[onSettle] prepareView VISIBLE");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/NewChattingTabUI", "_performOnSettleImpl", "(ZI)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/NewChattingTabUI", "_performOnSettleImpl", "(ZI)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (imageView == null || imageView.getVisibility() != 0) {
            int width = findViewById.getWidth() == 0 ? this.f197014a.getResources().getDisplayMetrics().widthPixels : findViewById.getWidth();
            if (z17) {
                com.tencent.mm.ui.tools.l5.a(findViewById, 208L, 0.0f, 0.0f, null);
            } else {
                com.tencent.mm.ui.tools.l5.a(findViewById, 234L, (width * (-1)) / 2.5f, 0.0f, null);
            }
        } else {
            int width2 = imageView.getWidth() == 0 ? this.f197014a.getResources().getDisplayMetrics().widthPixels : imageView.getWidth();
            if (z17) {
                com.tencent.mm.ui.tools.l5.a(imageView, 208L, 0.0f, 0.0f, null);
            } else {
                com.tencent.mm.ui.tools.l5.a(imageView, 234L, (width2 * (-1)) / 2.5f, 0.0f, null);
            }
        }
        return true;
    }

    public boolean f(boolean z17) {
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment;
        android.widget.ImageView imageView;
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting = this.f197016c;
        objArr[0] = java.lang.Boolean.valueOf(testTimeForChatting == null ? false : testTimeForChatting.isShown());
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "try closeChatting, ishow:%b", objArr);
        i(false);
        com.tencent.mm.sdk.platformtools.u3.l(this.f197026m);
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting2 = this.f197016c;
        if (testTimeForChatting2 == null || testTimeForChatting2.getVisibility() == 8 || (baseChattingUIFragment = this.f197027n) == null || this.f197014a == null) {
            return false;
        }
        if (baseChattingUIFragment.isSupportNavigationSwipeBack()) {
            al5.a3.c(this.f197014a);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "[closeChatting] needAnim:%b", java.lang.Boolean.valueOf(z17));
        ((kn4.i0) ((pf0.u) i95.n0.c(pf0.u.class))).Ai("ChattingUI", 4);
        this.f197024k = true;
        if (z17 && this.f197035v == null) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this.f197014a, com.tencent.mm.ui.uc.f211081d);
            this.f197035v = loadAnimation;
            loadAnimation.setAnimationListener(new com.tencent.mm.ui.bg(this));
        }
        db5.m9.a(true, new android.content.Intent().putExtra("classname", "mainui").putExtra("main_process", false));
        if (this.f197027n.isSupportCustomActionBar() && (imageView = (android.widget.ImageView) this.f197014a.getWindow().getDecorView().findViewById(com.tencent.mm.R.id.l3_)) != null && imageView.getVisibility() == 0) {
            imageView.setVisibility(8);
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "[closeChatting] prepareView GONE");
        }
        q(0);
        if (z17) {
            this.mChattingUIProxy.onExitBegin();
            this.mChattingUIProxy.onExitEnd();
            this.f197016c.startAnimation(this.f197035v);
        } else {
            this.mChattingUIProxy.onExitBegin();
            this.mChattingUIProxy.onExitEnd();
            this.f197016c.setVisibility(8);
            this.f197014a.onSwipe(1.0f);
            s();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0414, code lost:
    
        if (r0 == null) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0465  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 1197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.NewChattingTabUI.g():void");
    }

    public void h() {
        if (k()) {
            ((kn4.i0) ((pf0.u) i95.n0.c(pf0.u.class))).Ai("ChattingUI", 4);
            com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f197027n;
            if (baseChattingUIFragment == null || !baseChattingUIFragment.isSupportNavigationSwipeBack()) {
                return;
            }
            this.f197027n.getSwipeBackLayout().setEnableGesture(false);
        }
    }

    public void i(boolean z17) {
        if (z17) {
            com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f197027n;
            if (baseChattingUIFragment == null || baseChattingUIFragment.getView() == null) {
                return;
            }
            this.f197027n.getView().setImportantForAccessibility(1);
            return;
        }
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment2 = this.f197027n;
        if (baseChattingUIFragment2 == null || baseChattingUIFragment2.getView() == null || com.tencent.mm.ui.bk.y()) {
            return;
        }
        this.f197027n.getView().setImportantForAccessibility(4);
    }

    public final int j() {
        int i17;
        int h17 = com.tencent.mm.ui.bl.h(this.f197014a);
        boolean isInMultiWindowMode = com.tencent.mm.ui.LauncherUI.getInstance() != null ? com.tencent.mm.ui.LauncherUI.getInstance().isInMultiWindowMode() : false;
        if (!isInMultiWindowMode) {
            android.content.SharedPreferences d17 = com.tencent.mm.sdk.platformtools.x2.d();
            if ((d17 != null ? d17.getBoolean("Main_need_read_top_margin", false) : false) && (i17 = d17.getInt("Main_top_marign", -1)) >= 0) {
                return i17;
            }
        }
        if (isInMultiWindowMode) {
            h17 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "getTopHeight statusHeight:%s, isInMultiWindowMode:%s", java.lang.Integer.valueOf(h17), java.lang.Boolean.valueOf(isInMultiWindowMode));
        return h17;
    }

    public boolean k() {
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f197027n;
        if (baseChattingUIFragment == null) {
            return false;
        }
        return baseChattingUIFragment.f198152f.f460714i;
    }

    public boolean l() {
        pd5.l lVar;
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f197027n;
        if (baseChattingUIFragment == null) {
            return true;
        }
        yb5.d dVar = baseChattingUIFragment.f198152f;
        dVar.getClass();
        if (!(((j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigChattingContextCheck()) == 1) != dVar.f460711f) || ((lVar = baseChattingUIFragment.f198157n) != null && lVar.a()))) {
            return false;
        }
        androidx.fragment.app.i2 beginTransaction = this.f197014a.getSupportFragmentManager().beginTransaction();
        beginTransaction.j(this.f197027n);
        beginTransaction.g();
        return true;
    }

    public final boolean m() {
        java.lang.Boolean[] boolArr = this.f197028o;
        if (boolArr[0] == null) {
            synchronized (boolArr) {
                java.lang.Boolean[] boolArr2 = this.f197028o;
                if (boolArr2[0] == null) {
                    boolean z17 = true;
                    if (j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigSplitChattingPreload()) != 1) {
                        z17 = false;
                    }
                    boolArr2[0] = java.lang.Boolean.valueOf(z17);
                }
            }
        }
        return this.f197028o[0].booleanValue();
    }

    public final boolean n() {
        return db5.f.g() && ep.a.a() && !zo.e.e(this.f197014a);
    }

    public boolean o(boolean z17, int i17) {
        com.tencent.mm.ui.conversation.MainUI mainUI;
        yf5.j0 j0Var;
        if (!n()) {
            return true;
        }
        if (z17 && (mainUI = (com.tencent.mm.ui.conversation.MainUI) ((com.tencent.mm.ui.HomeUI) this.f197015b).f196761t.f196935o.get(0)) != null && (j0Var = mainUI.f207379v) != null) {
            ((yf5.w0) j0Var).f461988t.b(170);
        }
        return a(z17, i17);
    }

    public final void p() {
        android.graphics.Bitmap bitmap = this.f197031r;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "bitmap recycle %s", this.f197031r.toString());
        this.f197031r.recycle();
    }

    public final void q(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "[setLauncherContainerVisible] visible:%s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f197014a;
        if (mMFragmentActivity == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LauncherUI.NewChattingTabUI", "[setLauncherContainerVisible] getActivity is null");
            return;
        }
        android.view.View findViewById = mMFragmentActivity.findViewById(com.tencent.mm.R.id.huh);
        if (findViewById == null || findViewById.getVisibility() == i17) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/NewChattingTabUI", "setLauncherContainerVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/NewChattingTabUI", "setLauncherContainerVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void r(java.lang.String str, android.os.Bundle bundle, boolean z17) {
        com.tencent.mm.ui.n8 n8Var;
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout;
        this.f197029p = java.lang.System.currentTimeMillis();
        boolean z18 = (com.tencent.mm.ui.bk.v0() && (com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.c0() || com.tencent.mm.ui.bk.y())) || com.tencent.mm.ui.bk.Z() || com.tencent.mm.ui.bk.w0();
        if (!z18) {
            com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f197027n;
            if (baseChattingUIFragment != null && (swipeBackLayout = baseChattingUIFragment.getSwipeBackLayout()) != null && !swipeBackLayout.C) {
                java.util.LinkedList linkedList = al5.a3.f5864a;
                swipeBackLayout.setLikeIOSAnim(j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigSwipeBackLikeIOSAnim()) == 1);
            }
            com.tencent.mm.sdk.platformtools.o3.b(true);
            if (z17) {
                if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_chatting_ui_anim_suspend_request_layout_extend, 1) == 1) && (n8Var = this.f197015b) != null) {
                    com.tencent.mm.ui.HomeUI homeUI = (com.tencent.mm.ui.HomeUI) n8Var;
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_chatting_ui_anim_suspend_request_layout, 1) == 1) {
                        com.tencent.mm.ui.MMFragment h17 = homeUI.f196761t.h(0);
                        if (h17 instanceof com.tencent.mm.ui.conversation.MainUI) {
                            ((com.tencent.mm.ui.conversation.MainUI) h17).w0(4000L);
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "Suspend requestLayout() disabled.");
                    }
                }
            }
        }
        if (m() && !z18 && l()) {
            com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = new com.tencent.mm.ui.chatting.ChattingUIFragment();
            this.f197027n = chattingUIFragment;
            this.mChattingUIProxy = new com.tencent.mm.ui.chatting.ChattingUIProxy(this.f197014a, chattingUIFragment);
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting = this.f197016c;
        objArr[0] = java.lang.Boolean.valueOf(testTimeForChatting == null ? false : testTimeForChatting.isShown());
        objArr[1] = str;
        objArr[2] = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "try startChatting, ishow:%b userName:%s needAnim:%b", objArr);
        i(true);
        ((com.tencent.mm.booter.notification.x) c01.d9.f()).k(false);
        this.f197032s = false;
        this.f197022i = bundle;
        this.f197021h = str;
        this.f197023j = z17;
        if (z17) {
            jz5.g gVar = com.tencent.mm.ui.chatting.adapter.m.f198435a;
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment2 = this.f197027n;
            if (baseChattingUIFragment2 != null) {
                baseChattingUIFragment2.T0();
            }
        }
        if (!z18) {
            gm0.j1.e().p();
            com.tencent.mm.sdk.platformtools.u3.m(-8);
            com.tencent.mm.sdk.platformtools.u3.l(this.mStartChattingRunnable);
            com.tencent.mm.sdk.platformtools.u3.h(this.mStartChattingRunnable);
            return;
        }
        android.content.Intent intent = new android.content.Intent(this.f197014a, (java.lang.Class<?>) com.tencent.mm.ui.chatting.ChattingUI.class);
        intent.putExtra("Chat_User", this.f197021h);
        intent.addFlags(67108864);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f197014a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mMFragmentActivity, arrayList.toArray(), "com/tencent/mm/ui/NewChattingTabUI", "startChatting", "(Ljava/lang/String;Landroid/os/Bundle;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMFragmentActivity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mMFragmentActivity, "com/tencent/mm/ui/NewChattingTabUI", "startChatting", "(Ljava/lang/String;Landroid/os/Bundle;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void s() {
        if (n()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(this.f197027n == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "ashutest: tryResetChattingSwipeStatus, chattingFragment NULL ? %B", objArr);
            com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f197027n;
            if (baseChattingUIFragment != null) {
                com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = baseChattingUIFragment.getSwipeBackLayout();
                swipeBackLayout.f211441v = false;
                swipeBackLayout.F = false;
                this.f197027n.getSwipeBackLayout().f211433n = 0.0f;
            }
        }
    }
}
