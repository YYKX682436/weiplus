package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public class TaskBarContainer extends android.widget.RelativeLayout implements android.view.View.OnTouchListener, com.tencent.mm.plugin.taskbar.ui.s {
    public static final /* synthetic */ int P = 0;
    public android.view.View A;
    public boolean B;
    public boolean C;
    public android.widget.TextView D;
    public com.tencent.mm.ui.MMFragmentActivity E;
    public boolean F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f172496J;
    public boolean K;
    public final boolean L;
    public java.lang.Runnable M;
    public final com.tencent.mm.sdk.event.IListener N;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.taskbar.ui.z f172497d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.taskbar.ui.TaskBarView f172498e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer f172499f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView f172500g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f172501h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f172502i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f172503m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f172504n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f172505o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f172506p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f172507q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f172508r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f172509s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f172510t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f172511u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f172512v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f172513w;

    /* renamed from: x, reason: collision with root package name */
    public int f172514x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.taskbar.ui.TaskBarBottomView f172515y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView f172516z;

    public TaskBarContainer(android.content.Context context) {
        super(context);
        this.f172501h = new android.graphics.Rect();
        this.f172514x = com.tencent.mm.ui.bl.h(getContext());
        this.B = false;
        this.C = false;
        this.F = true;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.f172496J = 0;
        this.K = true;
        this.L = com.tencent.mm.sdk.platformtools.m2.j();
        this.M = null;
        this.N = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UpdateMainActionBarViewEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.taskbar.ui.TaskBarContainer.1
            {
                this.__eventId = -1600912022;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.UpdateMainActionBarViewEvent updateMainActionBarViewEvent) {
                com.tencent.mm.autogen.events.UpdateMainActionBarViewEvent updateMainActionBarViewEvent2 = updateMainActionBarViewEvent;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopContainer", "updateMainActionBarView updateField: %d", java.lang.Integer.valueOf(updateMainActionBarViewEvent2.f54921g.f6113a));
                com.tencent.mm.plugin.taskbar.ui.TaskBarContainer.a(com.tencent.mm.plugin.taskbar.ui.TaskBarContainer.this, updateMainActionBarViewEvent2);
                return false;
            }
        };
        c(context);
    }

    public static void a(com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer, com.tencent.mm.autogen.events.UpdateMainActionBarViewEvent updateMainActionBarViewEvent) {
        taskBarContainer.getClass();
        am.a00 a00Var = updateMainActionBarViewEvent.f54921g;
        int i17 = a00Var.f6113a;
        if (i17 == 1) {
            taskBarContainer.setActionBarTitle(a00Var.f6114b);
            return;
        }
        if (i17 == 2) {
            android.view.View view = taskBarContainer.f172512v;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "updateActionBarIconTips", "(Lcom/tencent/mm/autogen/events/UpdateMainActionBarViewEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "updateActionBarIconTips", "(Lcom/tencent/mm/autogen/events/UpdateMainActionBarViewEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = taskBarContainer.f172513w;
            if (view2 != null) {
                int i18 = updateMainActionBarViewEvent.f54921g.f6115c ? 0 : 8;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "updateActionBarIconTips", "(Lcom/tencent/mm/autogen/events/UpdateMainActionBarViewEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "updateActionBarIconTips", "(Lcom/tencent/mm/autogen/events/UpdateMainActionBarViewEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    private void setActionBarTitle(java.lang.String str) {
        if (gm0.j1.a() && this.f172507q != null) {
            this.f172507q.setText(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(getContext(), str, i65.a.h(getContext(), com.tencent.mm.R.dimen.f479568k)));
            float f17 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479559b) * i65.a.m(getContext());
            if (this.f172507q.getTextSize() != f17) {
                this.f172507q.setTextSize(0, f17);
            }
            com.tencent.mm.ui.bk.r0(this.f172507q.getPaint(), 0.8f);
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).pj(this.f172507q, en1.a.a(), bi4.c.PLANET, bi4.d.OUTLINED);
        }
    }

    public final void b() {
        if (gm0.j1.a()) {
            boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
            boolean z17 = j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigWeAppSearchEntryNewStyle()) == 1;
            if (isTeenMode || z17) {
                android.view.View view = this.A;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "checkShowSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "checkShowSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = this.A;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "checkShowSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "checkShowSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (z17 != this.C) {
                this.C = z17;
                com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = this.f172498e;
                if (taskBarView != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "forceReloadData");
                    java.lang.Runnable runnable = taskBarView.Y2;
                    taskBarView.removeCallbacks(runnable);
                    taskBarView.post(runnable);
                }
            }
            this.A.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.taskbar.ui.TaskBarContainer$$a
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view3) {
                    int i17 = com.tencent.mm.plugin.taskbar.ui.TaskBarContainer.P;
                    com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer = com.tencent.mm.plugin.taskbar.ui.TaskBarContainer.this;
                    taskBarContainer.getClass();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(view3);
                    java.lang.Object[] array = arrayList3.toArray();
                    arrayList3.clear();
                    yj0.a.b("com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", taskBarContainer, array);
                    if (taskBarContainer.f172498e != null) {
                        boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_weapp_mainframe_search_style, 0) == 1;
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopContainer", "isSupportSearchStyle:%b", java.lang.Boolean.valueOf(z18));
                        if (!z18) {
                            taskBarContainer.f172498e.s1();
                        } else if (!taskBarContainer.B) {
                            taskBarContainer.B = true;
                            android.view.View view4 = taskBarContainer.A;
                            float x17 = view4.getX();
                            float y17 = view4.getY();
                            float scaleX = view4.getScaleX();
                            float scaleY = view4.getScaleY();
                            float translationX = view4.getTranslationX();
                            float translationY = view4.getTranslationY();
                            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view4.getLayoutParams();
                            int width = ((android.widget.RelativeLayout) view4.getParent()).getWidth() - (layoutParams.rightMargin * 2);
                            int i18 = layoutParams.width;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view4, "scaleY", 1.0f, 1.35f);
                            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(view4.getWidth(), width);
                            arrayList4.add(ofFloat);
                            arrayList4.add(ofInt);
                            ofInt.addUpdateListener(new com.tencent.mm.plugin.taskbar.ui.q0(taskBarContainer, width, view4));
                            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                            animatorSet.playTogether(arrayList4);
                            animatorSet.setDuration(300L);
                            animatorSet.addListener(new com.tencent.mm.plugin.taskbar.ui.s0(taskBarContainer, view4, scaleX, scaleY, x17, y17, translationX, translationY, i18));
                            animatorSet.start();
                            arrayList4.clear();
                            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
                            arrayList4.add(android.animation.ObjectAnimator.ofFloat(taskBarContainer.D, "alpha", 1.0f, 0.0f));
                            animatorSet2.playTogether(arrayList4);
                            animatorSet2.setDuration(300L);
                            animatorSet2.start();
                        }
                    }
                    yj0.a.h(taskBarContainer, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
    }

    public final void c(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopContainer", "HeaderContainer init");
        setImportantForAccessibility(2);
        this.f172496J = i65.a.f(context, com.tencent.mm.R.dimen.m_);
        int i17 = getResources().getConfiguration().orientation;
        setBackground(null);
        jh4.c.f299846a.a();
        android.view.View a17 = com.tencent.mm.ui.td.f209893c.a("LayoutsForLauncherUI").a(android.view.LayoutInflater.from(context), com.tencent.mm.R.layout.cxv, null, false);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) a17.findViewById(com.tencent.mm.R.id.f483103wn);
        this.f172502i = linearLayout;
        ((android.widget.FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = this.f172514x;
        this.f172503m = (android.view.ViewGroup) a17.findViewById(com.tencent.mm.R.id.a0i);
        this.A = a17.findViewById(com.tencent.mm.R.id.f486760md5);
        this.D = (android.widget.TextView) a17.findViewById(com.tencent.mm.R.id.f483105wp);
        b();
        this.f172516z = (com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView) a17.findViewById(com.tencent.mm.R.id.cvn);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) a17.findViewById(com.tencent.mm.R.id.f483100wk);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cxw, (android.view.ViewGroup) null);
        this.f172505o = inflate;
        this.f172506p = inflate.findViewById(com.tencent.mm.R.id.cg7);
        frameLayout.addView(this.f172505o, -1, -1);
        android.widget.TextView textView = (android.widget.TextView) this.f172505o.findViewById(android.R.id.text1);
        this.f172507q = textView;
        textView.setVisibility(0);
        this.f172508r = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f172505o.findViewById(com.tencent.mm.R.id.meb);
        this.f172509s = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f172505o.findViewById(com.tencent.mm.R.id.plus_icon);
        this.f172511u = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f172505o.findViewById(com.tencent.mm.R.id.h0y);
        this.f172512v = this.f172505o.findViewById(com.tencent.mm.R.id.med);
        this.f172513w = this.f172505o.findViewById(com.tencent.mm.R.id.ky_);
        this.f172515y = (com.tencent.mm.plugin.taskbar.ui.TaskBarBottomView) this.f172505o.findViewById(com.tencent.mm.R.id.f483098wi);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f172505o.findViewById(com.tencent.mm.R.id.actionbar_up_indicator_btn);
        this.f172510t = weImageView;
        weImageView.setImageResource(((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai() ? com.tencent.mm.R.raw.icons_multi_task_star_line_regular : com.tencent.mm.R.raw.icons_outlined_multitask);
        this.f172508r.setOnClickListener(new com.tencent.mm.plugin.taskbar.ui.n0(this));
        this.f172509s.setOnClickListener(new com.tencent.mm.plugin.taskbar.ui.o0(this));
        d();
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = (com.tencent.mm.plugin.taskbar.ui.TaskBarView) a17.findViewById(com.tencent.mm.R.id.f483106wq);
        this.f172498e = taskBarView;
        taskBarView.setHeaderContainer(this);
        this.f172498e.setId(com.tencent.mm.R.id.f483106wq);
        addView(a17, new android.widget.RelativeLayout.LayoutParams(-1, -1));
    }

    public final void d() {
        android.widget.LinearLayout linearLayout;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopContainer", "initViewScale measuredWidth: %d", java.lang.Integer.valueOf(getMeasuredWidth()));
        if (this.K && (linearLayout = this.f172502i) != null) {
            linearLayout.setScaleX(0.6f);
            this.f172502i.setScaleY(0.6f);
        }
    }

    public void e(boolean z17) {
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = this.f172498e;
        if (taskBarView != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "notifyMultiWindowModeChanged: %b, old: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(taskBarView.M2));
            if (taskBarView.M2 != z17) {
                taskBarView.M2 = z17;
            }
        }
        com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer.setIsInMultiWindowMode(z17);
    }

    public void g(boolean z17) {
        long j17;
        boolean z18;
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo;
        java.lang.String str;
        r45.nw1 liveInfo;
        java.util.List list;
        java.lang.Object obj;
        com.tencent.mm.plugin.taskbar.ui.a2 a2Var;
        java.util.List list2;
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = this.f172498e;
        taskBarView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "onStartPull isStart:%b", java.lang.Boolean.valueOf(z17));
        if (!z17) {
            taskBarView.f172541u2 = false;
            return;
        }
        taskBarView.f172541u2 = true;
        com.tencent.mm.plugin.taskbar.ui.o2 o2Var = taskBarView.f172523c2;
        o2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "onStartToPull");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.taskbar.ui.h2(o2Var));
        synchronized (o2Var) {
            lh4.n a17 = o2Var.a(4);
            if (a17 == null || (list2 = a17.f318723c) == null) {
                j17 = currentTimeMillis;
                z18 = false;
            } else {
                int size = list2.size();
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                long Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_taskbar_recent_timeout, 3600L) * 1000;
                java.util.Iterator it = list2.iterator();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) it.next();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append("item[");
                    sb6.append(multiTaskInfo2.v0().getString(1));
                    sb6.append(", ");
                    sb6.append(multiTaskInfo2.field_id);
                    sb6.append("] time:");
                    long j18 = currentTimeMillis;
                    sb6.append(multiTaskInfo2.field_updateTime);
                    sb6.append(" now:");
                    sb6.append(currentTimeMillis2);
                    sb6.append(" limit:");
                    sb6.append(Ui);
                    com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", sb6.toString());
                    if (currentTimeMillis2 - multiTaskInfo2.field_updateTime > Ui) {
                        linkedList.add(multiTaskInfo2);
                        it.remove();
                    }
                    currentTimeMillis = j18;
                }
                j17 = currentTimeMillis;
                ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.taskbar.ui.l2(linkedList, o2Var));
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "remove Timeout Data done " + size + ' ' + list2.size());
                z18 = size != list2.size();
            }
        }
        if (z18 && (a2Var = o2Var.f172655a) != null) {
            com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView2 = (com.tencent.mm.plugin.taskbar.ui.TaskBarView) a2Var;
            int indexOf = taskBarView2.f172525e2.indexOf(4);
            if (indexOf != -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "do reloadOtherData");
                long j19 = taskBarView2.E0() ? 200L : 0L;
                if (taskBarView2.f172523c2.a(4).f318723c.isEmpty()) {
                    taskBarView2.w1();
                    taskBarView2.postDelayed(new com.tencent.mm.plugin.taskbar.ui.t1(taskBarView2, indexOf), j19);
                } else {
                    taskBarView2.postDelayed(new com.tencent.mm.plugin.taskbar.ui.u1(taskBarView2, indexOf), j19);
                }
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        lh4.n a18 = o2Var.a(4);
        if (a18 == null || (list = a18.f318723c) == null) {
            multiTaskInfo = null;
        } else {
            java.util.Iterator it6 = list.iterator();
            while (true) {
                if (it6.hasNext()) {
                    obj = it6.next();
                    if (((com.tencent.mm.plugin.multitask.model.MultiTaskInfo) obj).field_type == 21) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            multiTaskInfo = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) obj;
        }
        if (multiTaskInfo != null) {
            r45.b22 b22Var = new r45.b22();
            try {
                b22Var.parseFrom(multiTaskInfo.field_data);
                if (((com.tencent.mm.protocal.protobuf.FinderObject) b22Var.getCustom(7)) != null) {
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) b22Var.getCustom(7);
                    kotlin.jvm.internal.o.d(finderObject);
                    hashMap.put(java.lang.Long.valueOf(finderObject.getId()), multiTaskInfo);
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) b22Var.getCustom(7);
                    if (((finderObject2 == null || (liveInfo = finderObject2.getLiveInfo()) == null) ? 2 : liveInfo.getInteger(2)) != 2) {
                        com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = (com.tencent.mm.protocal.protobuf.FinderObject) b22Var.getCustom(7);
                        kotlin.jvm.internal.o.d(finderObject3);
                        hashMap2.put(java.lang.Long.valueOf(finderObject3.getId()), b22Var);
                    }
                }
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TaskBarViewPresenter", "FinderLiveMultiTaskData parse failed");
            }
        }
        if (!hashMap2.isEmpty()) {
            long currentTimeMillis3 = java.lang.System.currentTimeMillis() / 1000;
            if (currentTimeMillis3 - o2Var.f172671q <= o2Var.f172672r) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "not check because of interval: " + o2Var.f172672r + " last:" + o2Var.f172671q);
            } else {
                o2Var.f172671q = currentTimeMillis3;
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "start check live status");
                i95.m c17 = i95.n0.c(s40.w0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                java.util.Collection values = hashMap2.values();
                kotlin.jvm.internal.o.f(values, "<get-values>(...)");
                java.util.Collection<r45.b22> collection = values;
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(collection, 10));
                for (r45.b22 b22Var2 : collection) {
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject4 = (com.tencent.mm.protocal.protobuf.FinderObject) b22Var2.getCustom(7);
                    java.lang.Long valueOf = java.lang.Long.valueOf(finderObject4 != null ? finderObject4.getId() : 0L);
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject5 = (com.tencent.mm.protocal.protobuf.FinderObject) b22Var2.getCustom(7);
                    if (finderObject5 == null || (str = finderObject5.getObjectNonceId()) == null) {
                        str = "";
                    }
                    arrayList.add(new android.util.Pair(valueOf, str));
                }
                java.util.List V0 = kz5.n0.V0(arrayList);
                com.tencent.mm.plugin.taskbar.ui.e2 e2Var = new com.tencent.mm.plugin.taskbar.ui.e2(o2Var, hashMap2, hashMap);
                java.lang.Object obj2 = o2Var.f172655a;
                android.content.Context context = obj2 instanceof android.content.Context ? (android.content.Context) obj2 : null;
                r45.qt2 wi6 = context != null ? ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).wi(context) : null;
                java.util.ArrayList arrayList2 = (java.util.ArrayList) V0;
                if (arrayList2.isEmpty()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FinderLiveFeatureService", "batchGetLiveInfo: finderObject list is null!");
                } else {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(V0, 10));
                    java.util.Iterator it7 = arrayList2.iterator();
                    while (it7.hasNext()) {
                        android.util.Pair pair = (android.util.Pair) it7.next();
                        arrayList3.add(new jz5.l(pair.first, pair.second));
                    }
                    db2.u uVar = new db2.u(arrayList3, 1, 0, null, null, wi6, 28, null);
                    uVar.f16137p = false;
                    pm0.v.T(uVar.l(), new com.tencent.mm.feature.finder.live.y1(e2Var));
                }
            }
        }
        if (!o2Var.f172673s) {
            ((ku5.t0) ku5.t0.f312615d).A("TaskBarReloadData");
            o2Var.b(true, 0L);
            com.tencent.mm.plugin.taskbar.ui.a2 a2Var2 = o2Var.f172655a;
            if (a2Var2 != null) {
                com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView3 = (com.tencent.mm.plugin.taskbar.ui.TaskBarView) a2Var2;
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "forceReloadData");
                java.lang.Runnable runnable = taskBarView3.Y2;
                taskBarView3.removeCallbacks(runnable);
                taskBarView3.post(runnable);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "onStartToPull done " + (java.lang.System.currentTimeMillis() - j17));
    }

    public int getAnimationScrollOffset() {
        return this.f172497d.Q;
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.s
    public android.graphics.Rect getBackUpFooterRect() {
        return this.f172501h;
    }

    public com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer getBackgroundGLSurfaceContainer() {
        return this.f172499f;
    }

    public android.view.View getBackgroundGLSurfaceView() {
        return this.f172499f.getDynamicBgSurfaceView();
    }

    public android.view.View getBackgroundGradientView() {
        return this.f172500g;
    }

    public com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView getDesktopContainerView() {
        return this.f172516z;
    }

    public int getExtraBottomHeight() {
        return this.I;
    }

    public android.widget.LinearLayout getRootLayout() {
        return this.f172502i;
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.s
    public com.tencent.mm.plugin.taskbar.ui.t getTaskBarView() {
        return this.f172498e;
    }

    public int getViewHeight() {
        return this.H;
    }

    public void h() {
        android.view.WindowInsets rootWindowInsets;
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.E;
        if (mMFragmentActivity == null) {
            return;
        }
        android.util.Pair pair = new android.util.Pair(0, 0);
        if (mMFragmentActivity != null && com.tencent.mm.sdk.platformtools.u3.e()) {
            try {
                int rotation = mMFragmentActivity.getWindowManager().getDefaultDisplay().getRotation();
                if (rotation != 0 && rotation != 2) {
                    if (android.os.Build.VERSION.SDK_INT < 28 || (rootWindowInsets = mMFragmentActivity.getWindow().getDecorView().getRootWindowInsets()) == null || rootWindowInsets.getDisplayCutout() == null) {
                        int p17 = com.tencent.mm.ui.bk.p(mMFragmentActivity);
                        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarUIUtils", "getLeftRightSafeInsets from statusbar %d %d", java.lang.Integer.valueOf(p17), java.lang.Integer.valueOf(rotation));
                        pair = rotation == 1 ? new android.util.Pair(java.lang.Integer.valueOf(p17), 0) : new android.util.Pair(0, java.lang.Integer.valueOf(p17));
                    } else {
                        android.view.DisplayCutout displayCutout = rootWindowInsets.getDisplayCutout();
                        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarUIUtils", "getLeftRightSafeInsets from insets %d %d", java.lang.Integer.valueOf(displayCutout.getSafeInsetLeft()), java.lang.Integer.valueOf(displayCutout.getSafeInsetRight()));
                        pair = new android.util.Pair(java.lang.Integer.valueOf(displayCutout.getSafeInsetLeft()), java.lang.Integer.valueOf(displayCutout.getSafeInsetRight()));
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TaskBarUIUtils", "getSafeInsetsFailed", e17);
            }
        }
        ((android.widget.FrameLayout.LayoutParams) this.f172506p.getLayoutParams()).setMargins(((java.lang.Integer) pair.first).intValue(), 0, ((java.lang.Integer) pair.second).intValue(), 0);
        this.f172505o.requestLayout();
        android.view.View view = this.f172505o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "updateActionBarSafeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "updateActionBarSafeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void i() {
        android.view.View view;
        if (this.f172507q == null || (view = this.f172504n) == null) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopContainer", "updateFakeActionBarLeftMargin location x: %d, y: %d", java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]));
        if (this.E.isInMultiWindowMode()) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f172507q.getLayoutParams();
            int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479573p);
            layoutParams.leftMargin = dimensionPixelSize;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopContainer", "updateFakeActionBarLeftMargin leftMargin: %d", java.lang.Integer.valueOf(dimensionPixelSize));
            if (this.f172507q.getParent() != null) {
                this.f172507q.getParent().requestLayout();
            }
            android.view.View view2 = this.f172505o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "updateFakeActionBarLeftMargin", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "updateFakeActionBarLeftMargin", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopContainer", "desktopContainer onAttachedToWindow");
        com.tencent.mm.sdk.event.IListener iListener = this.N;
        if (iListener != null) {
            iListener.alive();
        }
        com.tencent.mm.autogen.events.GetMainTabUnReadCountEvent getMainTabUnReadCountEvent = new com.tencent.mm.autogen.events.GetMainTabUnReadCountEvent();
        getMainTabUnReadCountEvent.e();
        am.fg fgVar = getMainTabUnReadCountEvent.f54404g;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopContainer", "updateUnReadCount unReadCount: %d", java.lang.Integer.valueOf(fgVar.f6674a));
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.f490495wp);
        if (fgVar.f6674a > 0) {
            if (!this.L) {
                string = string + " ";
            }
            string = string + "(" + fgVar.f6674a + ")";
        }
        setActionBarTitle(string);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopContainer", "desktopContainer onDetachedFromWindow");
        com.tencent.mm.sdk.event.IListener iListener = this.N;
        if (iListener != null) {
            iListener.dead();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int makeMeasureSpec;
        int i19 = getResources().getConfiguration().orientation;
        int i27 = getResources().getConfiguration().orientation;
        if (this.F) {
            int measuredHeight = ((((android.view.ViewGroup) getParent()).getMeasuredHeight() - 0) - this.I) - this.f172496J;
            makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            this.H = measuredHeight;
        } else {
            makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        }
        super.onMeasure(i17, makeMeasureSpec);
        if (getMeasuredWidth() != this.G) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopContainer", "onMeasure width new: %d, old: %d", java.lang.Integer.valueOf(getMeasuredWidth()), java.lang.Integer.valueOf(this.G));
            this.G = getMeasuredWidth();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopContainer", "initViewPivot getMeasuredWidth: %d", java.lang.Integer.valueOf(getMeasuredWidth()));
            this.f172502i.setPivotX(getMeasuredWidth() / 2.0f);
            this.f172502i.setPivotY(com.tencent.mm.ui.bl.a(getContext()));
            d();
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (this.f172497d != null && (motionEvent.getAction() == 0 || motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f172497d.onTouch(view, motionEvent);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.s
    public void setActionBar(android.view.View view) {
        this.f172504n = view;
        i();
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.s
    public void setActivity(com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity) {
        this.E = mMFragmentActivity;
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.s
    public void setAnimController(com.tencent.mm.plugin.taskbar.ui.r rVar) {
        com.tencent.mm.plugin.taskbar.ui.z zVar = (com.tencent.mm.plugin.taskbar.ui.z) rVar;
        this.f172497d = zVar;
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = this.f172498e;
        if (taskBarView == null || zVar == null) {
            return;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) zVar.f172770n;
        if (linkedList.contains(taskBarView)) {
            return;
        }
        linkedList.add(taskBarView);
    }

    public void setDynamicBackgroundView(android.view.View view) {
        com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer dynamicBgContainer = (com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer) view;
        com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientColorBackgroundView = this.f172500g;
        this.f172499f = dynamicBgContainer;
        this.f172500g = gradientColorBackgroundView;
        com.tencent.mm.plugin.taskbar.ui.z zVar = this.f172497d;
        if (zVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "setBackgroundView");
            zVar.f172772p = dynamicBgContainer;
            zVar.f172778t = gradientColorBackgroundView;
            dynamicBgContainer.setGradientBgView(gradientColorBackgroundView);
        }
    }

    public void setExtraBottomHeight(int i17) {
        this.I = i17;
    }

    public void setFixedHeight(boolean z17) {
        this.F = z17;
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.s
    public void setFoldBanner(android.view.View view) {
        com.tencent.mm.plugin.taskbar.ui.z zVar = this.f172497d;
        if (zVar != null) {
            zVar.f172779u = view;
        }
    }

    public TaskBarContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f172501h = new android.graphics.Rect();
        this.f172514x = com.tencent.mm.ui.bl.h(getContext());
        this.B = false;
        this.C = false;
        this.F = true;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.f172496J = 0;
        this.K = true;
        this.L = com.tencent.mm.sdk.platformtools.m2.j();
        this.M = null;
        this.N = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UpdateMainActionBarViewEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.taskbar.ui.TaskBarContainer.1
            {
                this.__eventId = -1600912022;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.UpdateMainActionBarViewEvent updateMainActionBarViewEvent) {
                com.tencent.mm.autogen.events.UpdateMainActionBarViewEvent updateMainActionBarViewEvent2 = updateMainActionBarViewEvent;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopContainer", "updateMainActionBarView updateField: %d", java.lang.Integer.valueOf(updateMainActionBarViewEvent2.f54921g.f6113a));
                com.tencent.mm.plugin.taskbar.ui.TaskBarContainer.a(com.tencent.mm.plugin.taskbar.ui.TaskBarContainer.this, updateMainActionBarViewEvent2);
                return false;
            }
        };
        c(context);
    }

    public TaskBarContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f172501h = new android.graphics.Rect();
        this.f172514x = com.tencent.mm.ui.bl.h(getContext());
        this.B = false;
        this.C = false;
        this.F = true;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.f172496J = 0;
        this.K = true;
        this.L = com.tencent.mm.sdk.platformtools.m2.j();
        this.M = null;
        this.N = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UpdateMainActionBarViewEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.taskbar.ui.TaskBarContainer.1
            {
                this.__eventId = -1600912022;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.UpdateMainActionBarViewEvent updateMainActionBarViewEvent) {
                com.tencent.mm.autogen.events.UpdateMainActionBarViewEvent updateMainActionBarViewEvent2 = updateMainActionBarViewEvent;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopContainer", "updateMainActionBarView updateField: %d", java.lang.Integer.valueOf(updateMainActionBarViewEvent2.f54921g.f6113a));
                com.tencent.mm.plugin.taskbar.ui.TaskBarContainer.a(com.tencent.mm.plugin.taskbar.ui.TaskBarContainer.this, updateMainActionBarViewEvent2);
                return false;
            }
        };
        c(context);
    }
}
