package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes11.dex */
public class z implements android.widget.AbsListView.OnScrollListener, android.view.View.OnTouchListener, com.tencent.mm.plugin.taskbar.ui.r {
    public com.tencent.mm.plugin.taskbar.api.GyroView D1;
    public android.view.View E1;
    public com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView F1;
    public boolean G1;
    public boolean H1;
    public android.view.View I1;
    public android.view.View J1;
    public com.tencent.mm.ui.FrostedContentView K1;
    public final boolean M;
    public int U;
    public final jl1.a V;
    public java.lang.Runnable X;
    public boolean Z;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f172762d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ListView f172763e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.taskbar.ui.TaskBarContainer f172764f;

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Vibrator f172767i;

    /* renamed from: m, reason: collision with root package name */
    public int f172769m;

    /* renamed from: o, reason: collision with root package name */
    public hh4.a f172771o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer f172772p;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f172774p1;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f172775q;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f172778t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f172779u;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.Runnable f172786y0;

    /* renamed from: g, reason: collision with root package name */
    public int f172765g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f172766h = 0;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f172770n = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public boolean f172776r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f172777s = false;

    /* renamed from: v, reason: collision with root package name */
    public int f172780v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f172781w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f172782x = 0;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.Runnable f172785y = null;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Runnable f172788z = null;
    public java.lang.Runnable A = null;
    public wu5.b B = null;
    public wu5.b C = null;
    public boolean D = false;
    public boolean E = false;
    public boolean F = true;
    public boolean G = false;
    public boolean H = false;
    public int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public boolean f172761J = false;
    public boolean K = true;
    public boolean L = true;
    public boolean N = false;
    public boolean P = false;
    public int Q = 0;
    public int R = 0;
    public int S = 0;
    public int T = 0;
    public boolean W = false;
    public boolean Y = true;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f172773p0 = false;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f172783x0 = false;

    /* renamed from: l1, reason: collision with root package name */
    public int f172768l1 = 0;

    /* renamed from: x1, reason: collision with root package name */
    public final android.graphics.PointF f172784x1 = new android.graphics.PointF();

    /* renamed from: y1, reason: collision with root package name */
    public final android.graphics.PointF f172787y1 = new android.graphics.PointF();

    /* renamed from: z1, reason: collision with root package name */
    public boolean f172789z1 = false;
    public boolean A1 = false;
    public final java.lang.Runnable B1 = new com.tencent.mm.plugin.taskbar.ui.i0(this);
    public boolean C1 = true;

    public z(android.content.Context context, android.widget.ListView listView, com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer) {
        this.U = 0;
        this.Z = true;
        this.G1 = true;
        this.H1 = false;
        this.f172762d = context;
        this.f172763e = listView;
        this.f172764f = taskBarContainer;
        this.f172767i = (android.os.Vibrator) context.getSystemService("vibrator");
        this.f172769m = com.tencent.mm.ui.bl.a(context) + com.tencent.mm.ui.bl.h(context);
        boolean post = listView.post(new com.tencent.mm.plugin.taskbar.ui.d0(this));
        gh4.j0.a();
        boolean b17 = gh4.j0.b();
        this.M = b17;
        this.Z = !(1 == ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_appbrand_guide_jump_launch_page_and_auto_pull, 1));
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "init AppBrandDesktopAnimController isEnableDynamicBackground: %b mScrollOffset:%s ret:%s checkCloseHeaderWhenScrollingByAnim:%b", java.lang.Boolean.valueOf(b17), java.lang.Integer.valueOf(this.f172769m), java.lang.Boolean.valueOf(post), java.lang.Boolean.valueOf(this.Z));
        this.H1 = true;
        this.G1 = true;
        com.tencent.mm.plugin.taskbar.api.GyroView gyroView = this.D1;
        if (gyroView != null) {
            gyroView.a(0.0f, m());
            this.D1.setTranslationY(0.0f);
        }
        c();
        this.U = context.getResources().getColor(com.tencent.mm.R.color.f478489a);
        this.V = new jl1.a(context.getResources().getColor(com.tencent.mm.R.color.FG_0), com.tencent.mm.ui.uk.a(context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8), 60));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r6) {
        /*
            r5 = this;
            boolean r0 = r5.h()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "MicroMsg.TaskBarAnimController"
            java.lang.String r2 = "closeHeader isVisibleHeader: %b, reason: %d"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            java.lang.Runnable r0 = r5.A
            android.widget.ListView r1 = r5.f172763e
            if (r0 == 0) goto L22
            if (r1 == 0) goto L22
            r1.removeCallbacks(r0)
        L22:
            r0 = 11
            r2 = 1
            r3 = 0
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r4 = r5.f172764f
            if (r6 != r0) goto L39
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView r0 = r4.f172516z
            boolean r0 = r0.b()
            if (r0 == 0) goto L3c
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView r0 = r4.f172516z
            r0.a()
            r0 = r2
            goto L3d
        L39:
            r4.getClass()
        L3c:
            r0 = r3
        L3d:
            if (r0 == 0) goto L40
            return
        L40:
            r5.H = r2
            r5.f172789z1 = r3
            r5.o(r3)
            boolean r0 = r5.h()
            if (r0 != 0) goto L51
            r5.k(r3)
            return
        L51:
            r5.f172773p0 = r2
            java.lang.Runnable r0 = r5.f172786y0
            r1.removeCallbacks(r0)
            com.tencent.mm.plugin.taskbar.ui.g0 r0 = new com.tencent.mm.plugin.taskbar.ui.g0
            r0.<init>(r5, r6)
            r5.f172786y0 = r0
            r1.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.taskbar.ui.z.a(int):void");
    }

    public void b(long j17, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "closeHeader delay: %d, type: %d fast:%s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        java.lang.Runnable runnable = this.f172788z;
        android.widget.ListView listView = this.f172763e;
        if (runnable != null) {
            listView.removeCallbacks(runnable);
        }
        com.tencent.mm.plugin.taskbar.ui.h0 h0Var = new com.tencent.mm.plugin.taskbar.ui.h0(this, z17, i17);
        this.f172788z = h0Var;
        listView.postDelayed(h0Var, j17);
    }

    public final void c() {
        android.content.Context context = this.f172762d;
        try {
            this.f172780v = (int) (context.getResources().getDisplayMetrics().heightPixels * 0.2f);
            int b17 = i65.a.b(context, 16);
            this.f172781w = b17;
            int i17 = this.f172780v;
            if (i17 < b17) {
                this.f172781w = 0;
            }
            this.f172782x = i17;
            this.S = i65.a.b(context, 100);
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "configAnim mStartAlphaAnimDisFromBottom: %d, mAlphaAnimationDistance: %d, mGyroViewAnimateAlphaDistance: %d", java.lang.Integer.valueOf(this.f172780v), java.lang.Integer.valueOf(this.f172782x), java.lang.Integer.valueOf(this.S));
        } catch (java.lang.Exception unused) {
        }
    }

    public void d(boolean z17) {
        this.f172764f.f172498e.getClass();
        if (z17 != this.C1) {
            z65.c.a();
            this.C1 = z17;
            com.tencent.mm.autogen.events.EnableMainBottomTabSwitchEvent enableMainBottomTabSwitchEvent = new com.tencent.mm.autogen.events.EnableMainBottomTabSwitchEvent();
            enableMainBottomTabSwitchEvent.f54108g.f8052a = z17;
            enableMainBottomTabSwitchEvent.e();
        }
    }

    public final int e() {
        com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer = this.f172764f;
        if (taskBarContainer.getMeasuredHeight() == 0) {
            return 0;
        }
        return taskBarContainer.getBottom() - this.f172769m;
    }

    public final void g() {
        boolean h17 = h();
        boolean z17 = this.M;
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "virbg: hideBackgroundView isEnableDynamicBackground: %b isHeaderVisible: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(h17));
        if ((this.F && h17) || !z17 || this.f172776r) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "virbg: hideBackgroundView SurfaceView onPause and set GONE");
        this.f172772p.b(((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Di(this.f172762d));
        this.f172776r = true;
    }

    public boolean h() {
        com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer = this.f172764f;
        taskBarContainer.getBottom();
        android.widget.ListView listView = this.f172763e;
        listView.getFirstVisiblePosition();
        return taskBarContainer.getBottom() >= this.f172769m + 10 && listView.getFirstVisiblePosition() == 0;
    }

    public final boolean i() {
        android.graphics.PointF pointF = this.f172787y1;
        float f17 = pointF.y;
        android.graphics.PointF pointF2 = this.f172784x1;
        return java.lang.Math.abs(f17 - pointF2.y) <= 5.0f || pointF.y <= pointF2.y;
    }

    public void j(boolean z17, boolean z18, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "notifyCallback isOpen: %b, isDrag: %b, reason: %d", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(i17));
        if (z17) {
            this.I = 0;
            this.N = true;
            android.view.View view = this.f172778t;
            if (view != null && view.getVisibility() == 0) {
                this.f172778t.invalidate();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "onOpenHeader isToClose: %b, isEnableDynamicBackgroud: %b", java.lang.Boolean.valueOf(this.H), java.lang.Boolean.valueOf(this.M));
            android.view.View view2 = this.I1;
            if (view2 != null) {
                if (this.H) {
                    if (view2 != null) {
                        this.H = true;
                        view2.setTranslationY(0.0f);
                    }
                } else if (h()) {
                    this.I1.animate().translationY(this.I1.getHeight()).setDuration(260L).setListener(new com.tencent.mm.plugin.taskbar.ui.j0(this)).setUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.mm.plugin.taskbar.ui.z$$a
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                            com.tencent.mm.ui.a4 a4Var = com.tencent.mm.ui.a4.f197117a;
                            com.tencent.mm.plugin.taskbar.ui.z zVar = com.tencent.mm.plugin.taskbar.ui.z.this;
                            if (!a4Var.h(zVar.f172762d) || zVar.K1 == null) {
                                return;
                            }
                            zVar.K1.setBottomBlurAreaHeight((int) (zVar.I1.getHeight() - zVar.I1.getTranslationY()));
                            zVar.K1.invalidate();
                        }
                    }).start();
                    this.W = true;
                    java.lang.Runnable runnable = this.X;
                    android.widget.ListView listView = this.f172763e;
                    if (runnable != null) {
                        listView.removeCallbacks(runnable);
                    }
                    com.tencent.mm.plugin.taskbar.ui.k0 k0Var = new com.tencent.mm.plugin.taskbar.ui.k0(this);
                    this.X = k0Var;
                    listView.postDelayed(k0Var, 500L);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "onOpen header not visible");
                    this.I1.setTranslationY(0.0f);
                }
            }
            int i19 = this.f172768l1;
            if ((i19 & 2) != 0) {
                return;
            } else {
                this.f172768l1 = (i19 | 2) & (-5);
            }
        } else {
            k(z18);
            int i27 = this.f172768l1;
            if ((i27 & 4) != 0) {
                return;
            } else {
                this.f172768l1 = (i27 | 4) & (-3);
            }
        }
        for (com.tencent.mm.plugin.taskbar.ui.q qVar : this.f172770n) {
            if (z17) {
                if (z18) {
                    qVar.d();
                } else {
                    qVar.m();
                }
            } else if (z18) {
                qVar.w(i17);
            } else {
                qVar.o(i17, i18);
            }
        }
    }

    public void k(boolean z17) {
        this.N = false;
        com.tencent.mm.plugin.taskbar.api.GyroView gyroView = this.D1;
        if (gyroView != null) {
            gyroView.a(0.0f, m());
            this.D1.setTranslationY(0.0f);
        }
        java.lang.Runnable runnable = this.f172785y;
        if (runnable != null) {
            com.tencent.mm.sdk.platformtools.u3.l(runnable);
        }
        if (this.F) {
            com.tencent.mm.plugin.taskbar.ui.m0 m0Var = new com.tencent.mm.plugin.taskbar.ui.m0(this);
            this.f172785y = m0Var;
            com.tencent.mm.sdk.platformtools.u3.i(m0Var, 500L);
        } else {
            g();
        }
        android.view.View view = this.I1;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "onClose", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "onClose", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.I1.animate().translationY(0.0f).setDuration(this.I1.getTranslationY() == 0.0f ? 130L : 260L).setListener(new com.tencent.mm.plugin.taskbar.ui.l0(this)).setUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.mm.plugin.taskbar.ui.z$$b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.tencent.mm.ui.a4 a4Var = com.tencent.mm.ui.a4.f197117a;
                com.tencent.mm.plugin.taskbar.ui.z zVar = com.tencent.mm.plugin.taskbar.ui.z.this;
                if (!a4Var.h(zVar.f172762d) || zVar.K1 == null) {
                    return;
                }
                zVar.K1.setBottomBlurAreaHeight((int) (zVar.I1.getHeight() - zVar.I1.getTranslationY()));
                zVar.K1.invalidate();
            }
        }).start();
        this.W = true;
        java.lang.Runnable runnable2 = this.X;
        android.widget.ListView listView = this.f172763e;
        if (runnable2 != null) {
            listView.removeCallbacks(runnable2);
        }
        com.tencent.mm.plugin.taskbar.ui.k0 k0Var = new com.tencent.mm.plugin.taskbar.ui.k0(this);
        this.X = k0Var;
        listView.postDelayed(k0Var, 500L);
    }

    public void l(boolean z17, long j17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "openHeader allowOpenWhenHeaderHide: %b, delayTime: %d, animDurationTime: %d", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        java.lang.Runnable runnable = this.A;
        android.widget.ListView listView = this.f172763e;
        if (runnable != null && listView != null) {
            listView.removeCallbacks(runnable);
        }
        com.tencent.mm.plugin.taskbar.ui.f0 f0Var = new com.tencent.mm.plugin.taskbar.ui.f0(this, z17, i17);
        if (j17 <= 0) {
            f0Var.run();
        } else {
            this.A = f0Var;
            listView.postDelayed(f0Var, j17);
        }
    }

    public int m() {
        if (this.f172765g == 0) {
            this.f172765g = (int) (this.f172764f.getHeight() * 0.2f);
        }
        return this.f172765g;
    }

    public final void o(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "setActionBarVisible: %d", java.lang.Integer.valueOf(i17));
        android.view.View view = this.J1;
        if (view == null || view.getVisibility() == i17) {
            return;
        }
        android.view.View view2 = this.J1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "setActionBarVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "setActionBarVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        boolean z17;
        android.view.View view;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        boolean z18 = this.W;
        com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer = this.f172764f;
        if (!z18 && absListView.isInLayout() && !this.H && taskBarContainer.getBottom() < taskBarContainer.getHeight() - 5 && ((this.Z || !this.f172773p0) && this.N)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "isInLayout");
            a(0);
            yj0.a.h(this, "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
            return;
        }
        if (this.f172783x0 && !this.f172773p0 && this.f172774p1 && i17 <= 0 && h()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "[onScroll] stop fling!");
            this.f172763e.scrollBy(0, 0);
            a(4);
        }
        if (taskBarContainer != null && taskBarContainer.getHeight() != this.T) {
            this.Q = ((int) (taskBarContainer.getHeight() * 0.2f)) + 60;
            this.R = taskBarContainer.getHeight() - this.f172769m;
            this.f172765g = (int) (taskBarContainer.getHeight() * 0.2f);
            this.f172766h = (int) (taskBarContainer.getHeight() * 0.05f);
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "initAnimationOffset headerContainer height: %d, old: %d, startAlphaOffset: %d, endAlphaOffset: %d, openLimit: %d, closeLimit: %d", java.lang.Integer.valueOf(taskBarContainer.getHeight()), java.lang.Integer.valueOf(this.T), java.lang.Integer.valueOf(this.Q), java.lang.Integer.valueOf(this.R), java.lang.Integer.valueOf(this.f172765g), java.lang.Integer.valueOf(this.f172766h));
            this.T = taskBarContainer.getHeight();
        }
        if (!this.f172783x0 && i17 == 0 && taskBarContainer != null) {
            taskBarContainer.getBottom();
            hh4.a aVar = this.f172771o;
            taskBarContainer.getHeight();
            taskBarContainer.getBottom();
            boolean z19 = this.M;
            if (z19 || this.f172778t != null) {
                if (!z19) {
                    this.f172776r = true;
                    if (h() && (view = this.f172778t) != null && (view.getVisibility() != 0 || this.f172778t.getAlpha() != 1.0f)) {
                        android.view.View view2 = this.f172778t;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList2.add(java.lang.Float.valueOf(1.0f));
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "showSurfaceView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "showSurfaceView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        android.view.View view3 = this.f172778t;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "showSurfaceView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "showSurfaceView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else if (h() && this.f172776r && this.f172777s && !((com.tencent.mm.plugin.taskbar.ui.TaskBarView) taskBarContainer.getTaskBarView()).f172546z2) {
                    this.f172776r = false;
                    android.view.View view4 = this.f172778t;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "switchToSurfaceView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "switchToSurfaceView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f172772p.a();
                }
            }
            if (this.L) {
                int e17 = e();
                float min = 1.0f - java.lang.Math.min(1.0f, java.lang.Math.max(0.0f, ((e17 - this.Q) * 1.0f) / ((taskBarContainer.getMeasuredHeight() - this.f172769m) - this.Q)));
                s(min);
                if (aVar != null) {
                    aVar.b(min >= 1.0f);
                }
                float min2 = java.lang.Math.min(1.0f, java.lang.Math.max(0.0f, ((e() - ((taskBarContainer.getHeight() - this.f172769m) - this.f172780v)) * 1.0f) / (this.f172780v - this.f172781w)));
                if (e17 < this.Q / 2) {
                    if (this.K) {
                        this.K = false;
                        taskBarContainer.g(false);
                    }
                } else if (!this.K) {
                    this.K = true;
                    taskBarContainer.g(true);
                }
                if (e17 < this.Q) {
                    o(0);
                    q(1.0f, this.U, e17);
                    r(1.0f);
                } else if (min2 >= 0.0f) {
                    o(4);
                    q(min2, this.f172762d.getResources().getColor(com.tencent.mm.R.color.f478643cz), e17);
                    r(1.0f - min2);
                }
                for (int i27 = i17; i27 < i17 + i18; i27++) {
                    android.view.View childAt = absListView.getChildAt(i27);
                    if (childAt != null && i27 != 0) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList5.add(java.lang.Float.valueOf(min));
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(childAt, arrayList5.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "onDragHeader", "(IILandroid/widget/AbsListView;IILcom/tencent/mm/plugin/taskbar/api/ActionBarColorUpdate;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        childAt.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
                        yj0.a.f(childAt, "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "onDragHeader", "(IILandroid/widget/AbsListView;IILcom/tencent/mm/plugin/taskbar/api/ActionBarColorUpdate;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    }
                }
                android.view.View view5 = this.f172779u;
                if (view5 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList6.add(java.lang.Float.valueOf(min));
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view5, arrayList6.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "onDragHeader", "(IILandroid/widget/AbsListView;IILcom/tencent/mm/plugin/taskbar/api/ActionBarColorUpdate;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view5.setAlpha(((java.lang.Float) arrayList6.get(0)).floatValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "onDragHeader", "(IILandroid/widget/AbsListView;IILcom/tencent/mm/plugin/taskbar/api/ActionBarColorUpdate;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "onDragHeader disableUpdateListAlpha");
            }
        }
        if (h()) {
            this.f172783x0 = false;
        } else {
            this.f172783x0 = true;
            int e18 = e() - 60;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(i());
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(e18);
            if (this.f172766h == 0) {
                this.f172766h = (int) (taskBarContainer.getHeight() * 0.05f);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "checkClose moveUp:%b offset:%d closeLimit:%d", valueOf, valueOf2, java.lang.Integer.valueOf(this.f172766h));
            if ((taskBarContainer == null || taskBarContainer.getBottom() > 0) && i()) {
                if (this.f172766h == 0) {
                    this.f172766h = (int) (taskBarContainer.getHeight() * 0.05f);
                }
                if (e18 < this.f172766h) {
                    z17 = true;
                    if (!z17 && this.P) {
                        j(false, true, 0, 0);
                    } else if (this.A1 && this.P) {
                        j(false, true, 0, 0);
                    }
                }
            }
            z17 = false;
            if (!z17) {
            }
            if (this.A1) {
                j(false, true, 0, 0);
            }
        }
        if (this.D1 == null) {
            this.D1 = (com.tencent.mm.plugin.taskbar.api.GyroView) taskBarContainer.findViewById(com.tencent.mm.R.id.f485207gw5);
        }
        if (this.E1 == null) {
            this.E1 = taskBarContainer.findViewById(com.tencent.mm.R.id.f483103wn);
        }
        if (this.F1 == null) {
            this.F1 = taskBarContainer.getDesktopContainerView();
        }
        if (i17 <= 0) {
            int m17 = m();
            int bottom = taskBarContainer.getBottom();
            int e19 = e();
            int i28 = this.R;
            int i29 = this.Q;
            float f17 = ((e19 - i29) * 1.0f) / (i28 - i29);
            android.view.View view6 = this.E1;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList7.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view6, arrayList7.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "setHeaderAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view6.setAlpha(((java.lang.Float) arrayList7.get(0)).floatValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "setHeaderAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView appBrandDesktopContainerView = this.F1;
            if (!appBrandDesktopContainerView.f91077m) {
                appBrandDesktopContainerView.contentView.setAlpha(f17);
                android.view.ViewGroup viewGroup = appBrandDesktopContainerView.f91072e;
                if (f17 < 0.2f) {
                    viewGroup.setAlpha(f17 * 5);
                } else {
                    viewGroup.setAlpha(1.0f);
                }
            }
            int i37 = e19 - 60;
            taskBarContainer.getHeight();
            this.D1.getHeight();
            if ((!this.f172774p1 && bottom >= 5) || this.G) {
                if (m17 >= i37) {
                    this.D1.a(i37, m17);
                    this.D1.setAlpha(1.0f);
                } else {
                    this.D1.a(m17, m17);
                }
            }
            this.D1.setTranslationY((-(e19 - r9.getHeight())) / 2.0f);
            this.D1.setAlpha(1.0f - (((i37 - m17) * 1.0f) / this.S));
            if (i37 >= m17 && this.H1 && h() && !absListView.isInLayout()) {
                this.f172767i.vibrate(10L);
                this.H1 = false;
            }
            if (bottom < this.f172769m + 10) {
                this.H1 = true;
                this.G1 = true;
            }
        }
        this.A1 = h();
        if (h() && this.f172789z1) {
            d(false);
        } else {
            boolean z27 = this.N;
            if (!z27) {
                d(true);
            } else if (z27) {
                d(false);
            }
        }
        java.lang.Runnable runnable = this.B1;
        com.tencent.mm.sdk.platformtools.u3.l(runnable);
        com.tencent.mm.sdk.platformtools.u3.i(runnable, 60L);
        yj0.a.h(this, "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "onScrollStateChanged scrollState: %d, isMoveUp: %b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(i()));
        this.f172777s = true;
        if (i17 == 0 || i17 == -1) {
            this.P = false;
            if (this.f172773p0 && i17 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "isScrollingByAnim True!!!");
                this.f172773p0 = false;
                yj0.a.h(this, "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            }
            int e17 = e() - 60;
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "checkOpen moveUp:%b offset:%d openLimit:%d", java.lang.Boolean.valueOf(i()), java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(m()));
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer = this.f172764f;
            if ((taskBarContainer == null || taskBarContainer.getBottom() > 0) && !i() && e17 > m()) {
                l(false, 0L, 600);
            } else if (i() && i17 == -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "onScrollStateChanged closeHeader");
                a(4);
            } else if (i17 == -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "onScrollStateChanged closeHeader auto");
                a(0);
                this.G = true;
            }
        } else if (i17 == 2) {
            this.f172774p1 = true;
            this.P = true;
        } else if (i17 == 1) {
            this.f172774p1 = false;
            this.L = true;
            this.P = true;
            if (i()) {
                this.f172774p1 = false;
                this.I = 4;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            p(motionEvent);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f172789z1 = false;
            this.f172787y1.set(motionEvent.getRawX(), motionEvent.getRawY());
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer = this.f172764f;
            if (taskBarContainer != null && taskBarContainer.getBackUpFooterRect().contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()) && i()) {
                if (this.I == 0) {
                    this.I = 12;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "onTouch ActionUp reason: %d", java.lang.Integer.valueOf(this.I));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "onTouch ActionUp");
            onScrollStateChanged(this.f172763e, -1);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }

    public void p(android.view.MotionEvent motionEvent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "setActionDownEvent %d, x: %f, y: %f", java.lang.Integer.valueOf(motionEvent.getAction()), java.lang.Float.valueOf(motionEvent.getRawX()), java.lang.Float.valueOf(motionEvent.getRawY()));
        java.lang.Runnable runnable = this.f172786y0;
        android.widget.ListView listView = this.f172763e;
        listView.removeCallbacks(runnable);
        listView.removeCallbacks(this.f172788z);
        java.lang.Runnable runnable2 = this.A;
        if (runnable2 != null) {
            listView.removeCallbacks(runnable2);
        }
        this.f172784x1.set(motionEvent.getRawX(), motionEvent.getRawY());
        this.f172783x0 = false;
        this.W = false;
        this.f172789z1 = true;
    }

    public final void q(float f17, int i17, int i18) {
        com.tencent.mm.plugin.taskbar.ui.TaskBarBottomView taskBarBottomView;
        int i19 = (i17 & 16777215) | (((int) (255.0f * f17)) << 24);
        hh4.a aVar = this.f172771o;
        if (aVar != null) {
            aVar.a(f17, i19, i18);
        }
        com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer = this.f172764f;
        if (taskBarContainer == null || (taskBarBottomView = taskBarContainer.f172515y) == null) {
            return;
        }
        taskBarBottomView.setDrawColor(i19);
    }

    public final void r(float f17) {
        int a17 = this.V.a(1.0f - f17);
        hh4.a aVar = this.f172771o;
        if (aVar != null) {
            aVar.c(f17, a17, a17);
        }
        com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer = this.f172764f;
        if (taskBarContainer != null) {
            android.widget.TextView textView = taskBarContainer.f172507q;
            if (textView != null) {
                textView.setTextColor(a17);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = taskBarContainer.f172508r;
            if (weImageView != null) {
                weImageView.setImageResource(com.tencent.mm.R.raw.actionbar_icon_dark_search);
                taskBarContainer.f172508r.setIconColor(a17);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = taskBarContainer.f172509s;
            if (weImageView2 != null) {
                weImageView2.setImageResource(com.tencent.mm.R.raw.icons_outlined_add2);
                taskBarContainer.f172509s.setIconColor(a17);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = taskBarContainer.f172511u;
            if (weImageView3 != null) {
                weImageView3.setVisibility(taskBarContainer.f172498e.f172523c2.f172656b ? 0 : 8);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = taskBarContainer.f172510t;
            if (weImageView4 != null) {
                weImageView4.setIconColor(a17);
                android.view.View view = taskBarContainer.f172504n;
                if (view != null) {
                    android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.actionbar_up_indicator_btn);
                    if (findViewById == null || findViewById.getVisibility() != 0) {
                        taskBarContainer.f172510t.setVisibility(4);
                    } else {
                        taskBarContainer.f172510t.setVisibility(0);
                    }
                }
            }
        }
    }

    public final void s(float f17) {
        int color = (this.f172762d.getResources().getColor(com.tencent.mm.R.color.f478489a) & 16777215) | (((int) (255.0f * f17)) << 24);
        int i17 = f17 < 1.0f ? 0 : color;
        android.widget.ListView listView = this.f172763e;
        if (listView != null) {
            listView.setBackgroundColor(color);
        }
        android.view.View view = this.f172775q;
        if (view != null) {
            view.setBackgroundColor(i17);
        }
    }
}
