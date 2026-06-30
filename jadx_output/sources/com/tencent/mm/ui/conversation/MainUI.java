package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class MainUI extends com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment implements com.tencent.mm.ui.conversation.m6 {
    public hh4.a C;
    public ih5.d D;
    public final e75.a E;
    public final e75.a F;
    public com.tencent.mm.ui.conversation.MainUIView G;
    public boolean H;
    public fg5.b I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.Runnable f207370J;
    public android.content.SharedPreferences K;
    public com.tencent.mm.ui.conversation.j7 L;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.MMFragmentActivity f207371n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.conversation.ConversationListView f207372o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.taskbar.ui.u f207373p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f207374q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f207375r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f207376s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f207377t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f207378u;

    /* renamed from: v, reason: collision with root package name */
    public yf5.j0 f207379v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.ui.conversation.q f207380w = new com.tencent.mm.ui.conversation.q();

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.ui.conversation.o5 f207381x = new com.tencent.mm.ui.conversation.o5();

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.ui.conversation.q5 f207382y = new com.tencent.mm.ui.conversation.q5();

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.ui.conversation.pa f207383z = new com.tencent.mm.ui.conversation.pa();
    public final com.tencent.mm.ui.conversation.x9 A = new com.tencent.mm.ui.conversation.x9();
    public final int[] B = new int[2];

    public MainUI() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "create mainUI");
        this.D = new com.tencent.mm.ui.conversation.x6(this);
        this.E = new com.tencent.mm.ui.conversation.y6(this);
        this.F = new com.tencent.mm.ui.conversation.b7(this);
        this.G = null;
        this.H = false;
        this.I = null;
    }

    @Override // com.tencent.mm.ui.y7
    public void B() {
        com.tencent.mm.plugin.taskbar.ui.z zVar;
        android.view.View view;
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "onTabSwitchOut");
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = this.f207372o;
        if (conversationListView != null) {
            conversationListView.u();
            com.tencent.mm.plugin.taskbar.ui.r rVar = conversationListView.f207318m;
            if (rVar != null && (view = (zVar = (com.tencent.mm.plugin.taskbar.ui.z) rVar).I1) != null) {
                zVar.H = true;
                view.setTranslationY(0.0f);
            }
        }
        if (this.f207379v != null) {
            com.tencent.mm.ui.report.m0.f209700c.clear();
        }
    }

    @Override // com.tencent.mm.ui.y7
    public void V() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "turn to fg");
    }

    @Override // com.tencent.mm.ui.y7
    public void e0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "turn to bg");
    }

    @Override // com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment, com.tencent.mm.ui.MMFragment
    /* renamed from: getLayoutId */
    public int getF72225d() {
        return 0;
    }

    @Override // com.tencent.mm.ui.MMFragment
    public android.view.View getLayoutView() {
        com.tencent.mm.ui.conversation.MainUIView mainUIView = (com.tencent.mm.ui.conversation.MainUIView) com.tencent.mm.ui.td.f209893c.a("LayoutsForLauncherUI").a(android.view.LayoutInflater.from(getContext()), com.tencent.mm.R.layout.bvn, null, false);
        this.G = mainUIView;
        return mainUIView;
    }

    @Override // com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
    public void l0(android.os.Bundle bundle) {
        j13.a aVar;
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2;
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "onTabCreate, %d", java.lang.Integer.valueOf(hashCode()));
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar != null) {
            gaVar.f208643f0 = 4;
            gaVar.f208647h0 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "mainUIOnCreate");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        setMenuVisibility(true);
        gm0.j1.e().o();
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "main ui init view");
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = this.f207372o;
        com.tencent.mm.ui.conversation.o5 o5Var = this.f207381x;
        if (conversationListView != null) {
            com.tencent.mm.ui.conversation.q qVar = this.f207380w;
            if (qVar.f207986p != null) {
                qVar.f(qVar.f207977d);
                qVar.f(qVar.f207978e);
                qVar.f(qVar.f207979f);
                qVar.f(qVar.f207980g);
            }
            android.widget.LinearLayout linearLayout3 = o5Var.f207928h;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
        }
        this.f207377t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.df_);
        this.f207378u = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.j8f);
        com.tencent.mm.ui.conversation.ConversationListView conversationListView2 = (com.tencent.mm.ui.conversation.ConversationListView) findViewById(com.tencent.mm.R.id.j8g);
        this.f207372o = conversationListView2;
        conversationListView2.D = getBounceView();
        android.content.Context context = conversationListView2.getContext();
        if (conversationListView2.f207317i == null) {
            ((pe0.l) ((qe0.e) i95.n0.c(qe0.e.class))).getClass();
            conversationListView2.f207317i = new com.tencent.mm.plugin.taskbar.ui.TaskBarContainer(context);
            if (com.tencent.mm.ui.t7.f209881a.a()) {
                com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer = (com.tencent.mm.plugin.taskbar.ui.TaskBarContainer) conversationListView2.f207317i;
                taskBarContainer.getClass();
                taskBarContainer.f172508r.setVisibility(8);
                android.view.View view = taskBarContainer.f172512v;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "setHideSearchIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "setHideSearchIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ((android.widget.RelativeLayout) conversationListView2.f207317i).setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
            qe0.e eVar = (qe0.e) i95.n0.c(qe0.e.class);
            com.tencent.mm.plugin.taskbar.ui.s sVar = conversationListView2.f207317i;
            ((pe0.l) eVar).getClass();
            com.tencent.mm.plugin.taskbar.ui.z zVar = new com.tencent.mm.plugin.taskbar.ui.z(context, conversationListView2, (com.tencent.mm.plugin.taskbar.ui.TaskBarContainer) sVar);
            conversationListView2.f207318m = zVar;
            java.util.LinkedList linkedList = (java.util.LinkedList) zVar.f172770n;
            if (!linkedList.contains(conversationListView2)) {
                linkedList.add(conversationListView2);
            }
            conversationListView2.f207317i.setAnimController(conversationListView2.f207318m);
            if (conversationListView2.f207315g) {
                conversationListView2.f207316h = true;
                conversationListView2.addHeaderView((android.widget.RelativeLayout) conversationListView2.f207317i);
            }
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.nhm);
        this.f207374q = findViewById;
        this.f207372o.setStatusBarMaskView(findViewById);
        x0();
        ia0.n nVar = (ia0.n) i95.n0.c(ia0.n.class);
        android.app.Activity context2 = getContext();
        ((ia0.o) nVar).getClass();
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer dynamicBgContainer = new com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer(context2, null, 0, 6, null);
        this.f207375r = dynamicBgContainer;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(dynamicBgContainer, arrayList2.toArray(), "com/tencent/mm/ui/conversation/MainUI", "addDynamicBackgroundView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        dynamicBgContainer.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(dynamicBgContainer, "com/tencent/mm/ui/conversation/MainUI", "addDynamicBackgroundView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.G.addView(this.f207375r, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f207372o.setDrawingCacheEnabled(false);
        this.f207372o.setScrollingCacheEnabled(false);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f483101wl);
        this.f207376s = findViewById2;
        com.tencent.mm.ui.conversation.ConversationListView conversationListView3 = this.f207372o;
        android.view.View view2 = this.f207375r;
        com.tencent.mm.plugin.taskbar.ui.s sVar2 = conversationListView3.f207317i;
        if (sVar2 != null) {
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer2 = (com.tencent.mm.plugin.taskbar.ui.TaskBarContainer) sVar2;
            com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer dynamicBgContainer2 = (com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer) view2;
            com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientColorBackgroundView = (com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView) findViewById2;
            taskBarContainer2.f172499f = dynamicBgContainer2;
            taskBarContainer2.f172500g = gradientColorBackgroundView;
            com.tencent.mm.plugin.taskbar.ui.z zVar2 = taskBarContainer2.f172497d;
            if (zVar2 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "setBackgroundView");
                zVar2.f172772p = dynamicBgContainer2;
                zVar2.f172778t = gradientColorBackgroundView;
                dynamicBgContainer2.setGradientBgView(gradientColorBackgroundView);
            }
        }
        nm.j.f338443g.a(new com.tencent.mm.ui.conversation.f7(this));
        com.tencent.mm.ui.t7 t7Var = com.tencent.mm.ui.t7.f209881a;
        if (t7Var.a()) {
            this.f207372o.addHeaderView(t7Var.b(getContext(), com.tencent.mm.ui.LauncherUI.getInstance().f7()));
        }
        android.app.Activity context3 = getContext();
        com.tencent.mm.ui.conversation.ConversationListView conversationListView4 = this.f207372o;
        yf5.j0 j0Var = this.f207379v;
        android.widget.LinearLayout linearLayout4 = this.f207378u;
        o5Var.getClass();
        kotlin.jvm.internal.o.g(context3, "context");
        o5Var.f207925e = context3;
        o5Var.f207926f = conversationListView4;
        o5Var.f207924d = j0Var;
        o5Var.f207928h = linearLayout4;
        o5Var.f207931n = (int) (context3.getResources().getDimension(com.tencent.mm.R.dimen.f479896i9) + 0.5f);
        o5Var.f207932o = (int) (context3.getResources().getDimension(com.tencent.mm.R.dimen.f479872hl) + 0.5f);
        o5Var.f207933p = (int) (i65.a.f(context3, com.tencent.mm.R.dimen.f479627b2) * i65.a.m(context3));
        if (com.tencent.mm.ui.a4.f197117a.h(context3)) {
            o5Var.f207933p += com.tencent.mm.ui.bl.c(context3);
        }
        o5Var.H = 0;
        o5Var.c(com.tencent.mm.ui.bk.h(context3).y, true);
        s35.a a17 = com.tencent.mm.ui.conversation.banner.j.a(o5Var.f207925e, com.tencent.mm.ui.conversation.banner.i.CHATTING_FOLD_BANNER, null);
        kotlin.jvm.internal.o.e(a17, "null cannot be cast to non-null type com.tencent.mm.pluginsdk.ui.banner.BaseBanner");
        s35.b bVar = (s35.b) a17;
        o5Var.f207927g = bVar;
        android.widget.LinearLayout linearLayout5 = o5Var.f207928h;
        if (linearLayout5 != null) {
            linearLayout5.addView(bVar.f402843h);
        }
        android.widget.LinearLayout linearLayout6 = o5Var.f207928h;
        if (linearLayout6 != null) {
            linearLayout6.setOnClickListener(new com.tencent.mm.ui.conversation.f5(o5Var, bVar));
        }
        s35.b bVar2 = o5Var.f207927g;
        o5Var.f207929i = (bVar2 == null || (linearLayout2 = bVar2.f402843h) == null) ? null : linearLayout2.findViewById(com.tencent.mm.R.id.mj_);
        s35.b bVar3 = o5Var.f207927g;
        o5Var.f207930m = (bVar3 == null || (linearLayout = bVar3.f402843h) == null) ? null : (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.g_u);
        com.tencent.mm.ui.conversation.ConversationListView conversationListView5 = o5Var.f207926f;
        if (conversationListView5 != null) {
            conversationListView5.setFoldBanner(o5Var.f207928h);
        }
        com.tencent.mm.ui.conversation.ConversationListView conversationListView6 = o5Var.f207926f;
        if (conversationListView6 != null) {
            conversationListView6.setFoldHelper(o5Var);
        }
        android.widget.LinearLayout linearLayout7 = o5Var.f207928h;
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout7 != null ? linearLayout7.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = o5Var.f207933p;
        }
        android.widget.LinearLayout linearLayout8 = o5Var.f207928h;
        if (linearLayout8 != null) {
            linearLayout8.setLayoutParams(marginLayoutParams);
        }
        com.tencent.mm.ui.conversation.ConversationListView conversationListView7 = o5Var.f207926f;
        ag5.a aVar2 = conversationListView7 != null ? new ag5.a(conversationListView7) : null;
        o5Var.D = aVar2 != null ? new ag5.b(aVar2) : null;
        c01.d9.b().a(o5Var);
        c01.d9.b().getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f01.w1.INSTANCE.f258406d.f296974a;
        if (!concurrentHashMap.contains(o5Var)) {
            concurrentHashMap.put(o5Var, java.lang.Boolean.FALSE);
        }
        c01.d9.b().getClass();
        j01.c cVar = f01.s1.INSTANCE.f258391d;
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = cVar.f296974a;
        if (!concurrentHashMap2.contains(o5Var)) {
            if (mainLooper != null) {
                concurrentHashMap2.put(o5Var, new android.os.Handler(mainLooper));
            } else {
                concurrentHashMap2.put(o5Var, java.lang.Boolean.FALSE);
            }
        }
        o5Var.E.alive();
        com.tencent.mm.ui.conversation.ConversationListView conversationListView8 = this.f207372o;
        yf5.j0 j0Var2 = this.f207379v;
        com.tencent.mm.ui.conversation.x9 x9Var = this.A;
        x9Var.f208239a = conversationListView8;
        x9Var.f208240b = j0Var2;
        x9Var.f208241c = o5Var;
        com.tencent.mm.pluginsdk.ui.b0 b0Var = x9Var.f208246h;
        conversationListView8.setOnScrollListener(b0Var);
        ((yf5.w0) j0Var2).f461987s = b0Var;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.conversation.v9(x9Var));
        com.tencent.mm.ui.LauncherUI.getInstance().f7().n();
        yf5.j0 j0Var3 = this.f207379v;
        com.tencent.mm.ui.conversation.ConversationListView listView = this.f207372o;
        yf5.w0 w0Var = (yf5.w0) j0Var3;
        w0Var.getClass();
        kotlin.jvm.internal.o.g(listView, "listView");
        w0Var.f461979h = listView;
        listView.setAdapter((android.widget.ListAdapter) w0Var);
        com.tencent.mm.ui.conversation.ConversationListView conversationListView9 = this.f207372o;
        conversationListView9.setOnItemClickListener(new com.tencent.mm.ui.conversation.w2(this.f207379v, conversationListView9, getActivity()));
        com.tencent.mm.ui.conversation.ConversationListView conversationListView10 = this.f207372o;
        conversationListView10.setOnItemLongClickListener(new com.tencent.mm.ui.conversation.r3(this.f207379v, conversationListView10, getActivity(), this.B));
        this.f207372o.setonDispatchTouchEventListener(new com.tencent.mm.ui.conversation.g7(this));
        hh4.a aVar3 = this.C;
        if (aVar3 != null) {
            this.f207372o.setActionBarUpdateCallback(aVar3);
        }
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f207371n;
        if (mMFragmentActivity != null) {
            this.f207372o.setActivity(mMFragmentActivity);
        }
        com.tencent.mm.ui.conversation.j7 j7Var = this.L;
        if (j7Var != null) {
            u0(j7Var.f207779a, j7Var.f207780b, j7Var.f207781c);
        }
        this.f207372o.setSelection(0);
        ((pe0.l) ((qe0.e) i95.n0.c(qe0.e.class))).getClass();
        this.f207373p = new com.tencent.mm.plugin.taskbar.ui.o2();
        if (this.f207372o.getTaskBarView() != null) {
            com.tencent.mm.plugin.taskbar.ui.t taskBarView = this.f207372o.getTaskBarView();
            com.tencent.mm.plugin.taskbar.ui.u uVar = this.f207373p;
            com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView2 = (com.tencent.mm.plugin.taskbar.ui.TaskBarView) taskBarView;
            taskBarView2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "TaskBarView initPresenter");
            com.tencent.mm.plugin.taskbar.ui.o2 o2Var = (com.tencent.mm.plugin.taskbar.ui.o2) uVar;
            taskBarView2.f172523c2 = o2Var;
            o2Var.getClass();
            o2Var.f172655a = taskBarView2;
            o2Var.A.alive();
            o2Var.f172679y.alive();
            com.tencent.mm.plugin.taskbar.ui.q2.f172692d = new java.lang.ref.WeakReference(o2Var);
            com.tencent.mm.plugin.taskbar.ui.w.f172737d = new java.lang.ref.WeakReference(o2Var);
            com.tencent.mm.plugin.taskbar.ui.b.f172561d = new java.lang.ref.WeakReference(o2Var);
            gh4.o0 Bi = ((gh4.e0) i95.n0.c(gh4.e0.class)).Bi();
            if (Bi != null) {
                Bi.add(o2Var.f172680z);
            }
            ((uh4.c0) i95.n0.c(uh4.c0.class)).Kb(o2Var.B);
            pv.z zVar3 = (pv.z) i95.n0.c(pv.z.class);
            com.tencent.mm.plugin.taskbar.ui.c2 c2Var = (com.tencent.mm.plugin.taskbar.ui.c2) ((jz5.n) o2Var.C).getValue();
            ov.b bVar4 = (ov.b) zVar3;
            if (c2Var != null) {
                synchronized (bVar4.f349067e) {
                    bVar4.f349067e.remove(c2Var);
                }
            } else {
                bVar4.getClass();
            }
            pv.z zVar4 = (pv.z) i95.n0.c(pv.z.class);
            com.tencent.mm.plugin.taskbar.ui.c2 c2Var2 = (com.tencent.mm.plugin.taskbar.ui.c2) ((jz5.n) o2Var.C).getValue();
            ov.b bVar5 = (ov.b) zVar4;
            if (c2Var2 != null) {
                synchronized (bVar5.f349067e) {
                    bVar5.f349067e.add(c2Var2);
                }
            } else {
                bVar5.getClass();
            }
            o2Var.n();
            o2Var.b(true, 2000L);
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "forceReloadData");
            java.lang.Runnable runnable = taskBarView2.Y2;
            taskBarView2.removeCallbacks(runnable);
            taskBarView2.postDelayed(runnable, 2000L);
            ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.taskbar.ui.i2(o2Var));
        }
        final com.tencent.mm.ui.conversation.q5 q5Var = this.f207382y;
        androidx.fragment.app.FragmentActivity activity = getActivity();
        com.tencent.mm.ui.conversation.q qVar2 = this.f207380w;
        com.tencent.mm.ui.conversation.o5 o5Var2 = this.f207381x;
        q5Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.InitHelper", "onCreate %s", java.lang.Integer.valueOf(activity.hashCode()));
        q5Var.f208009o = activity;
        q5Var.f208011q = qVar2;
        q5Var.f208012r = o5Var2;
        q5Var.f208013s = this;
        q5Var.f208010p = new java.lang.ref.WeakReference(activity);
        q5Var.f208005h = ((android.os.PowerManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power")).newWakeLock(26, "NetSceneInit Lock");
        c01.d9.e().a(-1, q5Var);
        q5Var.f208006i = false;
        q5Var.f208015u.alive();
        q5Var.f208016v.alive();
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.ui.conversation.q5$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.ui.conversation.q5 q5Var2 = com.tencent.mm.ui.conversation.q5.this;
                q5Var2.getClass();
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir(), "DBRecoverStarted");
                if (r6Var.m()) {
                    jx3.f.INSTANCE.i("DBRepair", "Last recovery interrupted.", null);
                    r6Var.l();
                }
                com.tencent.mm.sdk.platformtools.FLock fLock = new com.tencent.mm.sdk.platformtools.FLock(com.tencent.mm.vfs.w6.i(new com.tencent.mm.vfs.z7(null, null, new java.io.File(com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir(), "MMStarted").getPath(), null, null).toString(), true), true);
                q5Var2.f208017w = fLock;
                if (fLock.d()) {
                    q5Var2.f208017w.e();
                    com.tencent.mars.xlog.Log.i("MicroMsg.DuplicateDetect", "No data multiple instance detected.");
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.DuplicateDetect", "Data multiple instance detected.");
                    jx3.f.INSTANCE.idkeyStat(579L, 0L, 1L, true);
                }
                q5Var2.f208017w.b();
            }
        }, "InitHelper-Report");
        final com.tencent.mm.ui.conversation.pa paVar = this.f207383z;
        yf5.j0 j0Var4 = this.f207379v;
        final com.tencent.mm.ui.conversation.ConversationListView conversationListView11 = this.f207372o;
        androidx.fragment.app.FragmentActivity activity2 = getActivity();
        paVar.f207970e = j0Var4;
        paVar.f207969d = activity2;
        paVar.f207971f = conversationListView11;
        if (paVar.f207972g == null) {
            final com.tencent.mm.ui.conversation.fa faVar = new com.tencent.mm.ui.conversation.fa(paVar);
            final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
            paVar.f207972g = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RePullEmojiInfoDescEvent>(paVar, a0Var, faVar) { // from class: com.tencent.mm.ui.conversation.RefreshHelper$2

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ com.tencent.mm.sdk.platformtools.n3 f207412d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(a0Var);
                    this.f207412d = faVar;
                    this.__eventId = -474068419;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.RePullEmojiInfoDescEvent rePullEmojiInfoDescEvent) {
                    this.f207412d.sendEmptyMessage(0);
                    return false;
                }
            };
        }
        if (paVar.f207973h == null) {
            paVar.f207973h = new com.tencent.mm.ui.conversation.RefreshHelper$3(paVar, com.tencent.mm.app.a0.f53288d);
        }
        if (paVar.f207974i == null) {
            final com.tencent.mm.app.a0 a0Var2 = com.tencent.mm.app.a0.f53288d;
            paVar.f207974i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MainUISetTopEvent>(paVar, a0Var2, conversationListView11) { // from class: com.tencent.mm.ui.conversation.RefreshHelper$4

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ com.tencent.mm.ui.conversation.ConversationListView f207414d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(a0Var2);
                    this.f207414d = conversationListView11;
                    this.__eventId = -765268918;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.MainUISetTopEvent mainUISetTopEvent) {
                    com.tencent.mm.ui.conversation.ConversationListView conversationListView12 = this.f207414d;
                    if (conversationListView12 != null) {
                        conversationListView12.setSelection(0);
                    }
                    return false;
                }
            };
        }
        paVar.f207972g.alive();
        paVar.f207973h.alive();
        paVar.f207974i.alive();
        conversationListView11.post(new com.tencent.mm.ui.conversation.ia(paVar));
        zr.b bVar6 = (zr.b) com.tencent.mm.sdk.event.q.f192403a.a(zr.b.class);
        androidx.fragment.app.FragmentActivity lifecycleOwner = thisActivity();
        e75.a observer = this.F;
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(observer, "observer");
        bVar6.f192369d.observe(lifecycleOwner, e75.g.MainThread, observer);
        gm0.m.f273232u = false;
        dm.e2.D2.observe(this, com.tencent.mm.contact.d.f64855g);
        yf5.w0 w0Var2 = (yf5.w0) this.f207379v;
        w0Var2.d().l();
        java.util.List a18 = w0Var2.c().a();
        yf5.a aVar4 = w0Var2.f461985q;
        aVar4.a(a18);
        com.tencent.mm.ui.conversation.adapter.MvvmConvList mvvmConvList = new com.tencent.mm.ui.conversation.adapter.MvvmConvList(w0Var2.d(), new xm3.n0(), w0Var2.f461975d, a18);
        yf5.s0 callback = (yf5.s0) ((jz5.n) w0Var2.f461986r).getValue();
        kotlin.jvm.internal.o.g(callback, "callback");
        mvvmConvList.f152067q = callback;
        w0Var2.f461984p = mvvmConvList;
        yf5.w d17 = w0Var2.d();
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = w0Var2.f461984p;
        if (mvvmList == null) {
            kotlin.jvm.internal.o.o("mvvmList");
            throw null;
        }
        d17.f461962f = mvvmList;
        w0Var2.d().f461964h = aVar4;
        w0Var2.d().f461965i = w0Var2;
        w0Var2.d().f461963g = w0Var2.c();
        yf5.m c17 = w0Var2.c();
        v65.i.b(c17.f461909c, null, new yf5.h(c17, c17.f461912f.f461864b, null, null), 1, null);
        if (((f13.e) i95.n0.c(f13.e.class)) != null && (aVar = j13.a.f297177d) != null) {
            aVar.add((yf5.q0) ((jz5.n) w0Var2.f461992x).getValue());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "kevin mainUIOnCreate time:%d uin:%d ver:%x", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(c01.d9.b().C()), java.lang.Integer.valueOf(o45.wf.f343029g));
        if (com.tencent.mm.ui.LauncherUI.getInstance() != null) {
            boolean isInMultiWindowMode = com.tencent.mm.ui.LauncherUI.getInstance().isInMultiWindowMode();
            this.H = isInMultiWindowMode;
            com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "initMultiWindowModeListener %s", java.lang.Boolean.valueOf(isInMultiWindowMode));
        }
        fg5.b bVar7 = this.I;
        if (bVar7 != null) {
            bVar7.dead();
        }
        fg5.b bVar8 = new fg5.b(this.f207379v);
        this.I = bVar8;
        bVar8.alive();
        this.f207372o.postDelayed(new com.tencent.mm.ui.conversation.r6(this), 200L);
        setOnVisibilityChangedListener(this.D);
    }

    @Override // com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
    public void m0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "onTabDestroy  acc:%b", java.lang.Boolean.valueOf(gm0.j1.a()));
        nm.j.f338443g.a(new com.tencent.mm.ui.conversation.w6(this));
        com.tencent.mm.ui.conversation.o5 o5Var = this.f207381x;
        o5Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FolderHelper", "onTabDestroy");
        o5Var.t();
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = o5Var.f207926f;
        if (conversationListView != null) {
            conversationListView.removeCallbacks(o5Var.C);
        }
        s35.b bVar = o5Var.f207927g;
        if (bVar != null) {
            bVar.a();
        }
        ag5.b bVar2 = o5Var.D;
        if (bVar2 != null) {
            bVar2.a();
        }
        if (gm0.j1.a()) {
            c01.d9.b().G(o5Var);
            c01.d9.b().getClass();
            f01.w1.INSTANCE.f258406d.f296974a.remove(o5Var);
            c01.d9.b().getClass();
            f01.s1.INSTANCE.f258391d.f296974a.remove(o5Var);
        }
        o5Var.E.dead();
        o5Var.f207925e = null;
        com.tencent.mm.ui.conversation.q5 q5Var = this.f207382y;
        q5Var.getClass();
        try {
            q5Var.f208017w.e();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.InitHelper", "onTabDestroy, dupDetectLock unlock failed : " + th6.getMessage());
        }
        c01.d9.e().q(-1, q5Var);
        android.app.ProgressDialog progressDialog = q5Var.f208008n;
        if (progressDialog != null) {
            progressDialog.dismiss();
            q5Var.f208008n = null;
        }
        q5Var.f208015u.dead();
        q5Var.f208016v.dead();
        com.tencent.mm.ui.conversation.pa paVar = this.f207383z;
        com.tencent.mm.sdk.event.IListener iListener = paVar.f207972g;
        if (iListener != null) {
            iListener.dead();
            paVar.f207972g = null;
        }
        paVar.f207973h.dead();
        paVar.f207974i.dead();
        if (p21.l.a() != null) {
            ((dh4.t) p21.l.a()).f(paVar);
        }
        if (gm0.j1.a()) {
            int i17 = x51.t1.f452086a;
            com.tencent.mars.xlog.Log.w("MicroMsg.Util", "memory usage: h=%s/%s, e=%s/%s, n=%s/%s", x51.t1.a(android.os.Debug.getGlobalAllocSize()), x51.t1.a(android.os.Debug.getGlobalAllocSize() + android.os.Debug.getGlobalFreedSize()), x51.t1.a(android.os.Debug.getGlobalExternalAllocSize()), x51.t1.a(android.os.Debug.getGlobalExternalAllocSize() + android.os.Debug.getGlobalExternalFreedSize()), x51.t1.a(android.os.Debug.getNativeHeapAllocatedSize()), x51.t1.a(android.os.Debug.getNativeHeapSize()));
        }
        this.D = null;
        setOnVisibilityChangedListener(null);
    }

    @Override // com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
    public void n0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "onTabPause");
        if (com.tencent.mm.ui.bk.y()) {
            return;
        }
        nm.j.f338443g.a(new com.tencent.mm.ui.conversation.u6(this));
        this.f207382y.d();
        hideVKB();
        this.f207383z.a();
        yf5.j0 j0Var = this.f207379v;
        if (j0Var != null) {
            yf5.w0 w0Var = (yf5.w0) j0Var;
            if (w0Var.f461991w) {
                w0Var.f461991w = false;
            }
        }
    }

    @Override // com.tencent.mm.ui.MMFragment
    public boolean noActionBar() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
    public void o0() {
        com.tencent.mm.ui.conversation.ConversationListView conversationListView;
        com.tencent.mm.ui.conversation.ConversationListView conversationListView2;
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "onTabResume");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.System.currentTimeMillis();
        s0();
        nm.j.f338443g.a(new com.tencent.mm.ui.conversation.s6(this));
        java.lang.System.currentTimeMillis();
        com.tencent.mm.ui.conversation.pa paVar = this.f207383z;
        paVar.getClass();
        if (p21.l.a() != null) {
            ((dh4.t) p21.l.a()).a(paVar);
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.conversation.ja(paVar));
        android.app.Activity activity = paVar.f207969d;
        if (com.tencent.mm.sdk.platformtools.a0.c()) {
            java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("NewShowRating");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                java.util.Map d18 = com.tencent.mm.sdk.platformtools.aa.d(d17, "ShowRatingNode", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                java.lang.String str = "0";
                int intValue = java.lang.Integer.decode((d18 == null || d18.get(".ShowRatingNode.MinVer") == null) ? "0" : (java.lang.String) d18.get(".ShowRatingNode.MinVer")).intValue();
                int intValue2 = java.lang.Integer.decode((d18 == null || d18.get(".ShowRatingNode.MaxVer") == null) ? "0" : (java.lang.String) d18.get(".ShowRatingNode.MaxVer")).intValue();
                if (d18 != null && d18.get(".ShowRatingNode.WaitDays") != null) {
                    str = (java.lang.String) d18.get(".ShowRatingNode.WaitDays");
                }
                int intValue3 = java.lang.Integer.decode(str).intValue();
                int i17 = o45.wf.f343029g;
                if (intValue <= i17 && i17 <= intValue2) {
                    android.content.SharedPreferences sharedPreferences = activity.getSharedPreferences("show_rating_preferences", 0);
                    int i18 = sharedPreferences.getInt("show_rating_flag", 0);
                    int i19 = sharedPreferences.getInt("show_rating_version", 0);
                    long j17 = sharedPreferences.getLong("show_rating_timestamp", 0L);
                    boolean z18 = sharedPreferences.getBoolean("show_rating_again", false);
                    long j18 = (intValue3 == 0 ? 7 : intValue3) * 86400000;
                    if (i19 == 0 || intValue > i19 || i19 > intValue2) {
                        sharedPreferences.edit().putInt("show_rating_version", o45.wf.f343029g).commit();
                        sharedPreferences.edit().putInt("show_rating_flag", 0).commit();
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        sharedPreferences.edit().putLong("show_rating_timestamp", currentTimeMillis).commit();
                        sharedPreferences.edit().putBoolean("show_rating_again", false).commit();
                        sharedPreferences.edit().putInt("show_rating_wait_days", intValue3).commit();
                        sharedPreferences.edit().putInt("show_rating_first_second_time", (int) (java.lang.System.currentTimeMillis() / 1000)).commit();
                        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]current clientVersion=%s,has rating clientVersion=%s,dynamic config showRatting min version=%s,max version:%s,waitDaysMillis:%s", java.lang.Integer.valueOf(o45.wf.f343029g), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2), java.lang.Long.valueOf(j18));
                        j17 = currentTimeMillis;
                        i18 = 0;
                    }
                    int i27 = o45.wf.f343029g;
                    if (intValue <= i27 && i27 <= intValue2 && i18 == 0 && j17 != 0 && java.lang.System.currentTimeMillis() >= j17 + j18) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]show enjoy app dialog.");
                        com.tencent.mm.ui.conversation.ea.f207655a = db5.e1.K(activity, false, activity.getString(com.tencent.mm.R.string.f493156j54), "", activity.getString(com.tencent.mm.R.string.j4x), activity.getString(com.tencent.mm.R.string.j4w), new com.tencent.mm.ui.conversation.y9(sharedPreferences, activity), new com.tencent.mm.ui.conversation.z9(sharedPreferences, activity));
                    } else if (z18 && j17 != 0 && java.lang.System.currentTimeMillis() >= j17 + j18 + 345600000) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]show rating dialog again.");
                        com.tencent.mm.ui.conversation.ea.b(activity, false);
                        sharedPreferences.edit().putInt("show_rating_flag", 3).commit();
                    } else if (i18 == 1) {
                        com.tencent.mm.ui.conversation.ea.b(activity, true);
                    } else if (i18 == 2) {
                        com.tencent.mm.ui.conversation.ea.a(activity);
                    } else if (i18 == 3) {
                        com.tencent.mm.ui.conversation.ea.b(activity, false);
                    }
                }
            }
        }
        android.app.Activity activity2 = paVar.f207969d;
        if (activity2 != null && activity2.getIntent() != null && paVar.f207969d.getIntent().getBooleanExtra("resend_fail_messages", false)) {
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.ui.conversation.ma(paVar), 500L);
            paVar.f207969d.getIntent().putExtra("resend_fail_messages", false);
        }
        com.tencent.mm.ui.LauncherUI launcherUI = (com.tencent.mm.ui.LauncherUI) paVar.f207969d;
        if (launcherUI != null) {
            com.tencent.mm.ui.HomeUI homeUI = launcherUI.getHomeUI();
            java.lang.Runnable runnable = paVar.f207975m;
            java.util.LinkedList linkedList = homeUI.T;
            if (!linkedList.contains(runnable)) {
                linkedList.add(runnable);
            }
        }
        if (com.tencent.mm.sdk.platformtools.c2.c(paVar.f207969d.getIntent(), "Main_ListToTop", false) && (conversationListView2 = paVar.f207971f) != null) {
            conversationListView2.post(new com.tencent.mm.ui.conversation.oa(paVar));
        }
        com.tencent.mm.sdk.platformtools.c2.m(paVar.f207969d.getIntent(), "Main_ListToTop", false);
        com.tencent.mm.ui.conversation.q5 q5Var = this.f207382y;
        java.lang.Object[] objArr = new java.lang.Object[2];
        android.app.ProgressDialog progressDialog = q5Var.f208008n;
        objArr[0] = java.lang.Integer.valueOf(progressDialog == null ? -1 : progressDialog.isShowing() ? 1 : 0);
        w11.k0 k0Var = q5Var.f208007m;
        objArr[1] = java.lang.Integer.valueOf(k0Var == null ? -2 : k0Var.hashCode());
        com.tencent.mars.xlog.Log.i("MicroMsg.InitHelper", "onTabResume tip:%d initscene:%d", objArr);
        q5Var.e();
        ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.ui.conversation.c6(q5Var), 300L);
        if (gm0.j1.a()) {
            if (!(this.f207382y.f208007m != null)) {
                int i28 = j62.e.g().i("clicfg_exdevice_not_sync_data_in_mainui", 1, true, true);
                com.tencent.mars.xlog.Log.i("MicroMsg.ProcessReclaimSwitch", "isExDeviceMainUISyncDataDisabled:" + i28);
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                if (i28 == 0) {
                    ((zr.d) com.tencent.mm.sdk.event.q.f192403a.a(zr.d.class)).O6(new java.lang.Object());
                }
                ((ve4.f) com.tencent.mm.sdk.event.q.f192403a.a(ve4.f.class)).O6(4);
            }
        }
        ul5.k bounceView = getBounceView();
        if (bounceView != 0) {
            ((com.tencent.mm.ui.widget.pulldown.NestedBounceView) bounceView).g(false);
            bounceView.setEnd2StartBgColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
            com.tencent.mm.ui.conversation.t6 t6Var = new com.tencent.mm.ui.conversation.t6(this);
            com.tencent.mm.ui.conversation.ConversationListView conversationListView3 = this.f207372o;
            if (conversationListView3 != null) {
                conversationListView3.setTag(com.tencent.mm.R.id.plp, t6Var);
            }
        }
        com.tencent.mm.ui.ga controller = getController();
        if (controller != null) {
            int color = getActivity().getResources().getColor(com.tencent.mm.R.color.a07);
            android.widget.FrameLayout frameLayout = controller.f208644g;
            if (frameLayout != null) {
                android.view.View findViewById = frameLayout.findViewById(com.tencent.mm.R.id.og9);
                if (findViewById == null) {
                    findViewById = new android.view.View(controller.x());
                    findViewById.setId(com.tencent.mm.R.id.og9);
                    controller.f208644g.addView(findViewById);
                    android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) findViewById.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = com.tencent.mm.ui.bl.i(controller.x(), -1);
                }
                findViewById.setBackgroundColor(color);
            }
        }
        java.lang.String str3 = com.tencent.mm.ui.mmfb.sdk.l.f209202f;
        com.tencent.mars.xlog.Log.i("MicroMsg.FacebookLoginUI", "facebook resetCheck");
        ((qf0.u) ((rf0.p) i95.n0.c(rf0.p.class))).getClass();
        ((ku5.t0) ku5.t0.f312615d).g(qf0.t.f362253d);
        ((vd0.o2) ((wd0.s1) i95.n0.c(wd0.s1.class))).Ni(false);
        if (!com.tencent.mm.ui.a4.f197117a.h(thisActivity()) || (conversationListView = this.f207372o) == null || conversationListView.r()) {
            return;
        }
        com.tencent.mm.ui.FrostedContentView frostedContentView = (com.tencent.mm.ui.FrostedContentView) findViewById(com.tencent.mm.R.id.jlt);
        com.tencent.mm.ui.LauncherUIBottomTabView launcherUIBottomTabView = (com.tencent.mm.ui.LauncherUIBottomTabView) frostedContentView.getRootView().findViewById(com.tencent.mm.R.id.huj);
        frostedContentView.a(true, launcherUIBottomTabView.getHeight(), launcherUIBottomTabView.getTranslationY());
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.f207380w.h();
        com.tencent.mm.ui.conversation.o5 o5Var = this.f207381x;
        o5Var.getClass();
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        o5Var.c(com.tencent.mm.ui.bk.h(o5Var.f207925e).y, true);
        o5Var.A(true);
        if (com.tencent.mm.ui.LauncherUI.getInstance() == null || this.H == com.tencent.mm.ui.LauncherUI.getInstance().isInMultiWindowMode()) {
            return;
        }
        this.H = com.tencent.mm.ui.LauncherUI.getInstance().isInMultiWindowMode();
        x0();
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "MainUI.onCreate");
        yf5.w0 w0Var = new yf5.w0(getActivity(), this.f207381x, new com.tencent.mm.ui.conversation.d7(this));
        this.f207379v = w0Var;
        w0Var.f461993y = new yf5.d(w0Var.f461975d, 18);
        c01.f b17 = c01.d9.b();
        yf5.j0 j0Var = this.f207379v;
        b17.getClass();
        j01.c cVar = f01.s1.INSTANCE.f258391d;
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = cVar.f296974a;
        if (!concurrentHashMap.contains(j0Var)) {
            if (mainLooper != null) {
                concurrentHashMap.put(j0Var, new android.os.Handler(mainLooper));
            } else {
                concurrentHashMap.put(j0Var, java.lang.Boolean.FALSE);
            }
        }
        ((l75.a1) c01.d9.b().q()).a(this.f207379v);
        final yf5.w0 w0Var2 = (yf5.w0) this.f207379v;
        if (w0Var2.B == null) {
            final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
            w0Var2.B = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BackupResetAccUinEvent>(a0Var) { // from class: com.tencent.mm.ui.conversation.adapter.MvvmConversationAdapter$addBackupResetAccUinListener$1
                {
                    this.__eventId = -991574716;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.BackupResetAccUinEvent backupResetAccUinEvent) {
                    com.tencent.mm.autogen.events.BackupResetAccUinEvent event = backupResetAccUinEvent;
                    kotlin.jvm.internal.o.g(event, "event");
                    yf5.w0.this.C = true;
                    return false;
                }
            };
        }
        com.tencent.mm.sdk.event.IListener iListener = w0Var2.B;
        if (iListener != null) {
            iListener.alive();
        }
        yf5.j0 j0Var2 = this.f207379v;
        com.tencent.mm.ui.conversation.e7 e7Var = new com.tencent.mm.ui.conversation.e7(this);
        yf5.w0 w0Var3 = (yf5.w0) j0Var2;
        w0Var3.getClass();
        w0Var3.D = e7Var;
        zr.c cVar2 = (zr.c) com.tencent.mm.sdk.event.q.f192403a.a(zr.c.class);
        androidx.fragment.app.FragmentActivity lifecycleOwner = thisActivity();
        e75.a observer = this.E;
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(observer, "observer");
        cVar2.f192369d.observe(lifecycleOwner, e75.g.MainThread, observer);
    }

    @Override // com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment, com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        j13.a aVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "onDestroy");
        this.A.b();
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = this.f207372o;
        if (conversationListView != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "onDestroy");
            com.tencent.mm.plugin.taskbar.ui.s sVar = conversationListView.f207317i;
            if (sVar != null) {
                com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer = (com.tencent.mm.plugin.taskbar.ui.TaskBarContainer) sVar;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopContainer", "onDestroy");
                com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = taskBarContainer.f172498e;
                if (taskBarView != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "TaskBarView onDestroy %d", java.lang.Integer.valueOf(taskBarView.hashCode()));
                    taskBarView.f172523c2.f172655a = null;
                    taskBarView.N2.dead();
                    try {
                        synchronized (taskBarView) {
                            com.tencent.mm.sdk.platformtools.n3 n3Var = taskBarView.f172524d2;
                            if (n3Var != null) {
                                n3Var.removeCallbacksAndMessages(null);
                            }
                            taskBarView.f172524d2 = null;
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TaskBarView", e17, "onDestroy exception", new java.lang.Object[0]);
                    }
                }
                com.tencent.mm.sdk.event.IListener iListener = taskBarContainer.N;
                if (iListener != null) {
                    iListener.dead();
                }
                java.lang.Runnable runnable = taskBarContainer.M;
                if (runnable != null) {
                    taskBarContainer.removeCallbacks(runnable);
                    taskBarContainer.M = null;
                }
                com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer dynamicBgContainer = taskBarContainer.f172499f;
                if (dynamicBgContainer != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBgContainer.", "release");
                    dynamicBgContainer.released = true;
                    if (dynamicBgContainer.dynamicBgSurfaceView != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBgContainer.", "removed");
                        dynamicBgContainer.removeView(dynamicBgContainer.dynamicBgSurfaceView);
                        dynamicBgContainer.dynamicBgSurfaceView = null;
                    }
                }
            }
            com.tencent.mm.plugin.taskbar.ui.r rVar = conversationListView.f207318m;
            if (rVar != null) {
                com.tencent.mm.plugin.taskbar.ui.z zVar = (com.tencent.mm.plugin.taskbar.ui.z) rVar;
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "DesktopAnimController onDestroy");
                android.widget.ListView listView = zVar.f172763e;
                if (listView != null) {
                    java.lang.Runnable runnable2 = zVar.f172788z;
                    if (runnable2 != null) {
                        listView.removeCallbacks(runnable2);
                        zVar.f172788z = null;
                    }
                    java.lang.Runnable runnable3 = zVar.f172785y;
                    if (runnable3 != null) {
                        zVar.f172763e.removeCallbacks(runnable3);
                        zVar.f172785y = null;
                    }
                    java.lang.Runnable runnable4 = zVar.X;
                    if (runnable4 != null) {
                        zVar.f172763e.removeCallbacks(runnable4);
                        zVar.X = null;
                    }
                }
                ((ku5.t0) ku5.t0.f312615d).A("AppBrandDesktopPerformanceMonitor");
                kh4.f fVar = kh4.f.INSTANCE;
                synchronized (fVar.f308063g) {
                    if (fVar.f308061e) {
                        wu5.c cVar = fVar.f308062f;
                        if (cVar != null) {
                            cVar.cancel(false);
                        }
                        fVar.f308061e = false;
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.PerformanceMonitor", "PerformanceMonitor release");
                java.util.HashMap hashMap = fVar.f308060d;
                if (hashMap != null) {
                    hashMap.clear();
                }
                zVar.D = false;
            }
            java.lang.Runnable runnable5 = conversationListView.A;
            if (runnable5 != null) {
                conversationListView.removeCallbacks(runnable5);
            }
            java.lang.Runnable runnable6 = conversationListView.f207332z;
            if (runnable6 != null) {
                conversationListView.removeCallbacks(runnable6);
            }
            com.tencent.mm.sdk.event.IListener iListener2 = conversationListView.N;
            if (iListener2 != null) {
                iListener2.dead();
            }
        }
        com.tencent.mm.plugin.taskbar.ui.u uVar = this.f207373p;
        if (uVar != null) {
            com.tencent.mm.plugin.taskbar.ui.o2 o2Var = (com.tencent.mm.plugin.taskbar.ui.o2) uVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "onDestroy");
            o2Var.f172655a = null;
            o2Var.A.dead();
            o2Var.f172679y.dead();
            com.tencent.mm.plugin.taskbar.ui.q2.f172692d = null;
            com.tencent.mm.plugin.taskbar.ui.w.f172737d = null;
            com.tencent.mm.plugin.taskbar.ui.b.f172561d = null;
            ((uh4.c0) i95.n0.c(uh4.c0.class)).tc(o2Var.B);
            gh4.o0 Bi = ((gh4.e0) i95.n0.c(gh4.e0.class)).Bi();
            if (Bi != null) {
                Bi.remove(o2Var.f172680z);
            }
            ((ov.b) ((pv.z) i95.n0.c(pv.z.class))).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelTaskBarController", "releaseAudioPanelTaskBarController " + ip1.q.f293596a.hashCode());
            kp1.l1 l1Var = ip1.q.f293597b;
            if (l1Var != null) {
                l1Var.release();
            }
            ip1.q.f293597b = null;
            ip1.q.f293601f = null;
            ip1.q.f293602g = null;
            pv.z zVar2 = (pv.z) i95.n0.c(pv.z.class);
            com.tencent.mm.plugin.taskbar.ui.c2 c2Var = (com.tencent.mm.plugin.taskbar.ui.c2) ((jz5.n) o2Var.C).getValue();
            ov.b bVar = (ov.b) zVar2;
            if (c2Var != null) {
                synchronized (bVar.f349067e) {
                    bVar.f349067e.remove(c2Var);
                }
            } else {
                bVar.getClass();
            }
        }
        super.onDestroy();
        zr.c cVar2 = (zr.c) com.tencent.mm.sdk.event.q.f192403a.a(zr.c.class);
        e75.a observer = this.E;
        kotlin.jvm.internal.o.g(observer, "observer");
        cVar2.f192369d.removeObserver(observer);
        fg5.b bVar2 = this.I;
        if (bVar2 != null) {
            bVar2.dead();
            this.I = null;
        }
        yf5.j0 j0Var = this.f207379v;
        if (j0Var != null) {
            yf5.w0 w0Var = (yf5.w0) j0Var;
            com.tencent.mm.sdk.event.IListener iListener3 = w0Var.B;
            if (iListener3 != null) {
                iListener3.dead();
            }
            w0Var.B = null;
            yf5.w0 w0Var2 = (yf5.w0) this.f207379v;
            w0Var2.D = null;
            w0Var2.D = null;
            w0Var2.f461989u.clear();
            if (((f13.e) i95.n0.c(f13.e.class)) != null && (aVar = j13.a.f297177d) != null) {
                aVar.remove((yf5.q0) ((jz5.n) w0Var2.f461992x).getValue());
            }
            com.tencent.mars.xlog.Log.i(w0Var2.f461978g, "onDestroy");
        }
        if (!gm0.j1.a() || this.f207379v == null) {
            return;
        }
        c01.f b17 = c01.d9.b();
        yf5.j0 j0Var2 = this.f207379v;
        b17.getClass();
        f01.s1.INSTANCE.f258391d.f296974a.remove(j0Var2);
        ((l75.a1) c01.d9.b().q()).e(this.f207379v);
    }

    @Override // com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment, com.tencent.mm.ui.MMFragment
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getAction() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = this.f207372o;
        if (conversationListView == null || !conversationListView.r()) {
            return super.onKeyDown(i17, keyEvent);
        }
        this.f207372o.j(10L, 11, false);
        return true;
    }

    @Override // com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        com.tencent.mm.plugin.taskbar.ui.r rVar;
        com.tencent.mm.plugin.taskbar.ui.s sVar;
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView;
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "onPause");
        super.onPause();
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = this.f207372o;
        if (conversationListView != null) {
            if (conversationListView.f207315g && (sVar = conversationListView.f207317i) != null && (taskBarView = ((com.tencent.mm.plugin.taskbar.ui.TaskBarContainer) sVar).f172498e) != null) {
                taskBarView.f172546z2 = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "onPause isHeaderOpen: %b, needProcess: %b", java.lang.Boolean.valueOf(taskBarView.f172542v2), java.lang.Boolean.valueOf(taskBarView.B2));
                if (taskBarView.f172542v2 && taskBarView.B2) {
                    taskBarView.C2 = true;
                    taskBarView.v1();
                }
                if (taskBarView.E2) {
                    taskBarView.E2 = false;
                    com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer = taskBarView.f172526f2;
                    if (taskBarContainer != null) {
                        int i17 = taskBarView.G2;
                        com.tencent.mm.plugin.taskbar.ui.z zVar = taskBarContainer.f172497d;
                        if (zVar != null) {
                            zVar.b(1000L, i17, false);
                        }
                        taskBarView.G2 = 0;
                    }
                }
                com.tencent.mm.plugin.taskbar.ui.o2 o2Var = taskBarView.f172523c2;
                com.tencent.mm.plugin.taskbar.ui.a2 a2Var = o2Var.f172655a;
                if (a2Var != null && ((com.tencent.mm.plugin.taskbar.ui.TaskBarView) a2Var).f172542v2) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    long j17 = o2Var.f172675u;
                    if (currentTimeMillis >= j17) {
                        o2Var.f172676v += currentTimeMillis - j17;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "onPause lastStartTime:%d,duration:%d,currentTime:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(o2Var.f172676v), java.lang.Long.valueOf(currentTimeMillis));
                }
                ((ov.b) ((pv.z) i95.n0.c(pv.z.class))).getClass();
                ip1.q qVar = ip1.q.f293596a;
            }
            if (!conversationListView.f207315g || (rVar = conversationListView.f207318m) == null) {
                return;
            }
            com.tencent.mm.plugin.taskbar.ui.z zVar2 = (com.tencent.mm.plugin.taskbar.ui.z) rVar;
            if (zVar2.h() && zVar2.N) {
                return;
            }
            zVar2.g();
        }
    }

    @Override // com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        int i17;
        com.tencent.mm.plugin.taskbar.ui.r rVar;
        com.tencent.mm.plugin.taskbar.ui.r rVar2;
        java.lang.Object obj;
        com.tencent.mm.plugin.taskbar.ui.s sVar;
        kp1.l1 l1Var;
        com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer;
        com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer2;
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "onResume");
        super.onResume();
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = this.f207372o;
        if (conversationListView != null) {
            if (conversationListView.f207315g && (sVar = conversationListView.f207317i) != null) {
                com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer3 = (com.tencent.mm.plugin.taskbar.ui.TaskBarContainer) sVar;
                taskBarContainer3.h();
                com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = taskBarContainer3.f172498e;
                if (taskBarView != null) {
                    taskBarView.f172546z2 = false;
                    taskBarView.A2 = false;
                    taskBarView.f172545y2 = false;
                    if (taskBarView.C) {
                        taskBarView.setLayoutFrozen(false);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "onResume isHeaderOpen: %b, needProcessSurfaceWhenResumed: %b, needCloseWhenPaused: %b", java.lang.Boolean.valueOf(taskBarView.f172542v2), java.lang.Boolean.valueOf(taskBarView.C2), java.lang.Boolean.valueOf(taskBarView.D2));
                    if (taskBarView.f172542v2 && taskBarView.C2) {
                        if (gh4.j0.b() && (taskBarContainer2 = taskBarView.f172526f2) != null) {
                            com.tencent.mm.plugin.taskbar.ui.z zVar = taskBarContainer2.f172497d;
                            if (zVar != null ? zVar.h() : false) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "switchToDynamicBackgroundView");
                                ((android.view.View) taskBarView.f172526f2.getParent()).setBackgroundColor(taskBarView.f172527g2.getResources().getColor(com.tencent.mm.R.color.a9e));
                                com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer backgroundGLSurfaceContainer = taskBarView.f172526f2.getBackgroundGLSurfaceContainer();
                                if (backgroundGLSurfaceContainer != null && taskBarView.L2) {
                                    synchronized (backgroundGLSurfaceContainer) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBgContainer.", "resume");
                                        com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientBgView = backgroundGLSurfaceContainer.getGradientBgView();
                                        if (gradientBgView != null) {
                                            gradientBgView.setVisibility(0);
                                        }
                                        com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientBgView2 = backgroundGLSurfaceContainer.getGradientBgView();
                                        if (gradientBgView2 != null) {
                                            gradientBgView2.setAlpha(1.0f);
                                        }
                                        com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView dynamicBackgroundGLSurfaceView = backgroundGLSurfaceContainer.dynamicBgSurfaceView;
                                        if (dynamicBackgroundGLSurfaceView != null) {
                                            dynamicBackgroundGLSurfaceView.c();
                                        }
                                        backgroundGLSurfaceContainer.postDelayed(new sk3.a(backgroundGLSurfaceContainer), 100L);
                                    }
                                    taskBarView.L2 = false;
                                }
                            }
                        }
                        taskBarView.B2 = true;
                        taskBarView.C2 = true;
                    }
                    if (taskBarView.D2 && (taskBarContainer = taskBarView.f172526f2) != null) {
                        if (taskBarView.f172542v2) {
                            int i18 = taskBarView.G2;
                            com.tencent.mm.plugin.taskbar.ui.z zVar2 = taskBarContainer.f172497d;
                            if (zVar2 != null) {
                                zVar2.b(0L, i18, true);
                            }
                        }
                        taskBarView.G2 = 0;
                        taskBarView.D2 = false;
                    }
                    com.tencent.mm.plugin.taskbar.ui.o2 o2Var = taskBarView.f172523c2;
                    if (o2Var != null) {
                        o2Var.n();
                        com.tencent.mm.plugin.taskbar.ui.a2 a2Var = o2Var.f172655a;
                        if (a2Var != null && ((com.tencent.mm.plugin.taskbar.ui.TaskBarView) a2Var).f172542v2) {
                            long currentTimeMillis = java.lang.System.currentTimeMillis();
                            if (currentTimeMillis >= o2Var.f172675u) {
                                o2Var.f172675u = currentTimeMillis;
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "onResume lastStartTime:%d,duration:%d,currentTime:%d", java.lang.Long.valueOf(o2Var.f172675u), java.lang.Long.valueOf(o2Var.f172676v), java.lang.Long.valueOf(currentTimeMillis));
                        }
                        ((ov.b) ((pv.z) i95.n0.c(pv.z.class))).getClass();
                        if (ip1.q.f293598c && (l1Var = ip1.q.f293597b) != null) {
                            l1Var.onResume();
                        }
                        if ((o2Var.f172670p == 0) && o2Var.f172665k == 1) {
                            ((ku5.t0) ku5.t0.f312615d).k(com.tencent.mm.plugin.taskbar.ui.g2.f172616d, 1000L);
                        }
                    }
                    taskBarView.post(taskBarView.X2);
                    taskBarView.m1();
                }
                taskBarContainer3.b();
            }
            if (conversationListView.f207315g && (rVar2 = conversationListView.f207318m) != null && ((com.tencent.mm.plugin.taskbar.ui.z) rVar2).h() && (obj = conversationListView.f207317i) != null && ((android.widget.RelativeLayout) obj).getBottom() < i65.a.b(conversationListView.getContext(), 100)) {
                if (com.tencent.mm.ui.bk.C()) {
                    conversationListView.z(1.0f, conversationListView.getResources().getColor(com.tencent.mm.R.color.f478861j7), conversationListView.getResources().getColor(com.tencent.mm.R.color.by));
                } else {
                    conversationListView.z(1.0f, conversationListView.getResources().getColor(com.tencent.mm.R.color.a07), conversationListView.getResources().getColor(com.tencent.mm.R.color.f478599bx));
                }
            }
            if (conversationListView.f207315g && (rVar = conversationListView.f207318m) != null) {
                com.tencent.mm.plugin.taskbar.ui.z zVar3 = (com.tencent.mm.plugin.taskbar.ui.z) rVar;
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(zVar3.h());
                com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer4 = zVar3.f172764f;
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "onResume isVisibleHeader: %b, bottom: %d, height: %d, scrollOffset:%d isCurrentMainUI: %b", valueOf, java.lang.Integer.valueOf(taskBarContainer4.getBottom()), java.lang.Integer.valueOf(taskBarContainer4.getHeight()), java.lang.Integer.valueOf(zVar3.f172769m), java.lang.Boolean.valueOf(zVar3.Y));
                zVar3.f172789z1 = false;
                if (zVar3.h() && taskBarContainer4.getBottom() < taskBarContainer4.getHeight()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "onResume fastCloseHeader");
                    zVar3.b(0L, 0, true);
                }
                if (!zVar3.N) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "onResume enableBottomTabSwitch true");
                    zVar3.d(true);
                } else if (!zVar3.Y) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "onResume not main ui and header open, then close header");
                    zVar3.b(0L, 0, true);
                }
            }
            ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
            ((uh4.c0) i95.n0.c(uh4.c0.class)).hd();
            conversationListView.A(true);
        }
        android.content.SharedPreferences d17 = com.tencent.mm.sdk.platformtools.x2.d();
        this.K = d17;
        if (d17 != null) {
            if (d17.getBoolean("conversation_box_tip", false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "firstInit ConvBox navigation page");
                yf5.j0 j0Var = this.f207379v;
                if (j0Var != null && (i17 = ((yf5.w0) j0Var).f461985q.f461844a) > 0) {
                    int firstVisiblePosition = (this.f207372o.getFirstVisiblePosition() - this.f207372o.getHeaderViewsCount()) + 1;
                    if (firstVisiblePosition < 0) {
                        firstVisiblePosition = 0;
                    }
                    int abs = java.lang.Math.abs((firstVisiblePosition + 1) % i17);
                    while (true) {
                        if (abs != firstVisiblePosition) {
                            com.tencent.mm.storage.l4 item = ((yf5.w0) this.f207379v).getItem(abs);
                            if (item != null && com.tencent.mm.storage.z3.N3(item.h1())) {
                                break;
                            } else {
                                abs = (abs + 1) % i17;
                            }
                        } else {
                            abs = 0;
                            break;
                        }
                    }
                    this.f207372o.post(new com.tencent.mm.ui.conversation.i7(this, this.f207372o.getHeaderViewsCount() + abs));
                    com.tencent.mm.sdk.platformtools.u3.l(this.f207370J);
                    com.tencent.mm.ui.conversation.q6 q6Var = new com.tencent.mm.ui.conversation.q6(this);
                    this.f207370J = q6Var;
                    com.tencent.mm.sdk.platformtools.u3.i(q6Var, 1000L);
                    this.K.edit().putBoolean("conversation_box_tip", false).apply();
                }
            }
            if (this.f207379v != null) {
                this.K.edit().putInt("heavy_user_session_cnt", ((yf5.w0) this.f207379v).f461985q.f461844a).commit();
            }
        }
    }

    @Override // com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
    public void p0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "onTabStart");
    }

    @Override // com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
    public void q0() {
        com.tencent.mm.plugin.taskbar.ui.s sVar;
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView;
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "onTabStop");
        if (com.tencent.mm.ui.bk.y()) {
            nm.j.f338443g.a(new com.tencent.mm.ui.conversation.v6(this));
            this.f207382y.d();
            hideVKB();
            this.f207383z.a();
            yf5.j0 j0Var = this.f207379v;
            if (j0Var != null) {
                yf5.w0 w0Var = (yf5.w0) j0Var;
                if (w0Var.f461991w) {
                    w0Var.f461991w = false;
                }
            }
        }
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = this.f207372o;
        if (conversationListView != null) {
            if (conversationListView.f207315g && (sVar = conversationListView.f207317i) != null && (taskBarView = ((com.tencent.mm.plugin.taskbar.ui.TaskBarContainer) sVar).f172498e) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "onStop");
                taskBarView.A2 = true;
            }
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            int hashCode = conversationListView.hashCode();
            iy1.c cVar = iy1.c.MainUI;
            ((cy1.a) rVar).vj("MainUI_PullDown", hashCode, 1005, 0);
        }
    }

    @Override // com.tencent.mm.ui.y7
    public void r() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "dkinit onTabSwitchIn");
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.tencent.mm.ui.conversation.q5 q5Var = this.f207382y;
        android.app.ProgressDialog progressDialog = q5Var.f208008n;
        objArr[0] = java.lang.Integer.valueOf(progressDialog == null ? -1 : progressDialog.isShowing() ? 1 : 0);
        w11.k0 k0Var = q5Var.f208007m;
        objArr[1] = java.lang.Integer.valueOf(k0Var == null ? -2 : k0Var.hashCode());
        com.tencent.mars.xlog.Log.i("MicroMsg.InitHelper", "onTabSwitchIn tip:%d initscene:%d", objArr);
        if (q5Var.f208005h != null) {
            q5Var.e();
        }
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar != null) {
            gaVar.l0();
        }
        if (this.f207379v != null) {
            com.tencent.mm.storage.b1.f193759a = c01.id.a();
        }
    }

    @Override // com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
    public void r0() {
    }

    public void s0() {
        yf5.h0 h0Var;
        yf5.j0 j0Var = this.f207379v;
        if (j0Var != null) {
            yf5.w0 w0Var = (yf5.w0) j0Var;
            if (w0Var.f461991w) {
                return;
            }
            boolean z17 = true;
            w0Var.f461991w = true;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i17 = calendar.get(6);
            java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
            if (w0Var.F == i17 && kotlin.jvm.internal.o.b(w0Var.G, d17)) {
                z17 = false;
            }
            w0Var.F = i17;
            w0Var.G = d17;
            if (z17) {
                yf5.w d18 = w0Var.d();
                java.util.Iterator it = d18.f461972s.entrySet().iterator();
                while (it.hasNext()) {
                    yf5.x xVar = (yf5.x) ((java.util.Map.Entry) it.next()).getValue();
                    com.tencent.mm.storage.l4 conv = xVar.f461995d;
                    kotlin.jvm.internal.o.f(conv, "conv");
                    xVar.f461998g = d18.f(conv);
                }
                yf5.m mVar = d18.f461963g;
                if (mVar != null) {
                    mVar.b();
                }
            }
            if (w0Var.C && (h0Var = w0Var.D) != null) {
                com.tencent.mm.ui.conversation.MainUI mainUI = ((com.tencent.mm.ui.conversation.e7) h0Var).f207649a;
                ((yf5.w0) mainUI.f207379v).d().f461972s.clear();
                c01.f b17 = c01.d9.b();
                yf5.j0 j0Var2 = mainUI.f207379v;
                b17.getClass();
                j01.c cVar = f01.s1.INSTANCE.f258391d;
                android.os.Looper mainLooper = android.os.Looper.getMainLooper();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = cVar.f296974a;
                if (!concurrentHashMap.contains(j0Var2)) {
                    if (mainLooper != null) {
                        concurrentHashMap.put(j0Var2, new android.os.Handler(mainLooper));
                    } else {
                        concurrentHashMap.put(j0Var2, java.lang.Boolean.FALSE);
                    }
                }
                ((l75.a1) c01.d9.b().q()).a(mainUI.f207379v);
                w0Var.C = false;
                yf5.m c17 = w0Var.c();
                if (c17 != null) {
                    c17.b();
                }
            }
            w0Var.d().l();
        }
    }

    public final void t0(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "setListMargin isInMultiWindowMode: %b", java.lang.Boolean.valueOf(this.H));
        android.view.ViewGroup.LayoutParams layoutParams = this.f207372o.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        }
        if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            int i19 = layoutParams2.topMargin;
            com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "setListMargin origin: %d, topMargin: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17));
            if (i19 <= 0 || this.H) {
                if (this.H) {
                    layoutParams2.topMargin = 0;
                } else {
                    layoutParams2.topMargin = i17;
                }
                this.f207372o.setLayoutParams(layoutParams);
            }
        }
        android.view.View view = this.f207374q;
        if (view != null) {
            int i27 = view.getLayoutParams().height;
            com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "setStatusBarMaskView height origin: %d, new: %d isInMultiWindowMode:%s", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(this.H));
            if (i27 <= 0 || this.H) {
                if (this.H) {
                    this.f207374q.getLayoutParams().height = 0;
                } else {
                    this.f207374q.getLayoutParams().height = i18;
                }
            }
        }
    }

    public void u0(boolean z17, boolean z18, boolean z19) {
        com.tencent.mm.plugin.taskbar.ui.r rVar;
        com.tencent.mm.plugin.taskbar.ui.r rVar2;
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = this.f207372o;
        if (!(conversationListView instanceof com.tencent.mm.ui.conversation.ConversationListView)) {
            this.L = new com.tencent.mm.ui.conversation.j7(this, z17, z18, z19);
            return;
        }
        conversationListView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "[showAppBrandHeader] isShow:" + z17 + " isAnim:" + z18 + " isScrollFirst:" + z19);
        if (z17) {
            if (!conversationListView.f207315g || (rVar2 = conversationListView.f207318m) == null) {
                return;
            }
            ((com.tencent.mm.plugin.taskbar.ui.z) rVar2).l(true, 600L, 2000);
            return;
        }
        if (!conversationListView.f207315g || (rVar = conversationListView.f207318m) == null) {
            return;
        }
        ((com.tencent.mm.plugin.taskbar.ui.z) rVar).a(0);
    }

    public void w0(long j17) {
        com.tencent.mm.ui.conversation.MainUIView mainUIView = this.G;
        if (mainUIView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MainUI", "Unexpected. Call suspendRequestLayoutForAnimation() failed");
            return;
        }
        if (j17 > 800) {
            mainUIView.f207388h = j17;
        } else {
            mainUIView.f207388h = 800L;
        }
        synchronized (mainUIView) {
            mainUIView.f207385e = true;
            mainUIView.f207386f = java.lang.System.currentTimeMillis();
            mainUIView.f207384d.removeCallbacks(mainUIView.f207389i);
            mainUIView.f207384d.postDelayed(mainUIView.f207389i, mainUIView.f207388h);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUIView", "Pending further layout request for %sms.", java.lang.Long.valueOf(mainUIView.f207388h));
    }

    public final void x0() {
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = this.f207372o;
        if (conversationListView == null) {
            return;
        }
        boolean showHeaderContainer = conversationListView.getShowHeaderContainer();
        int i17 = com.tencent.mm.ui.bl.i(getContext(), -1);
        int a17 = o25.n1.a(this.f207372o.getContext());
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "initListViewPadding actionBarHeight: %d, statusBarHeight: %d, showHeadrContainer: %b", java.lang.Integer.valueOf(a17), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(showHeaderContainer));
        com.tencent.mm.ui.conversation.h7 h7Var = new com.tencent.mm.ui.conversation.h7(this, showHeaderContainer);
        if (i17 <= 0) {
            this.f207372o.post(h7Var);
            return;
        }
        t0(showHeaderContainer ? 0 : a17, i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "[trySetListViewMargin] statusHeight: %s, actionBarHeight: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17));
        this.f207372o.postDelayed(h7Var, 100L);
    }
}
