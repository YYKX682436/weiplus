package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public class TaskBarView extends androidx.recyclerview.widget.RecyclerView implements com.tencent.mm.plugin.taskbar.ui.q, com.tencent.mm.plugin.taskbar.ui.a2, lh4.b, cl1.o0, com.tencent.mm.plugin.taskbar.ui.t {

    /* renamed from: c3, reason: collision with root package name */
    public static final /* synthetic */ int f172519c3 = 0;
    public boolean A2;
    public boolean B2;
    public boolean C2;
    public boolean D2;
    public boolean E2;
    public boolean F2;
    public int G2;
    public boolean H2;
    public boolean I2;
    public int J2;
    public int K2;
    public boolean L2;
    public boolean M2;
    public final com.tencent.mm.sdk.event.IListener N2;
    public final int O2;
    public float P2;
    public float Q2;
    public float R2;
    public boolean S2;
    public boolean T2;
    public boolean U2;
    public boolean V2;
    public final android.view.animation.Interpolator W2;
    public final java.lang.Runnable X2;
    public final java.lang.Runnable Y2;
    public int Z2;

    /* renamed from: a3, reason: collision with root package name */
    public boolean f172520a3;

    /* renamed from: b2, reason: collision with root package name */
    public final com.tencent.mm.plugin.taskbar.ui.d1 f172521b2;

    /* renamed from: b3, reason: collision with root package name */
    public final androidx.recyclerview.widget.w2 f172522b3;

    /* renamed from: c2, reason: collision with root package name */
    public com.tencent.mm.plugin.taskbar.ui.o2 f172523c2;

    /* renamed from: d2, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f172524d2;

    /* renamed from: e2, reason: collision with root package name */
    public final java.util.ArrayList f172525e2;

    /* renamed from: f2, reason: collision with root package name */
    public com.tencent.mm.plugin.taskbar.ui.TaskBarContainer f172526f2;

    /* renamed from: g2, reason: collision with root package name */
    public android.content.Context f172527g2;

    /* renamed from: h2, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f172528h2;

    /* renamed from: i2, reason: collision with root package name */
    public boolean f172529i2;

    /* renamed from: j2, reason: collision with root package name */
    public java.lang.String f172530j2;

    /* renamed from: k2, reason: collision with root package name */
    public rh4.n0 f172531k2;

    /* renamed from: l2, reason: collision with root package name */
    public rh4.o f172532l2;

    /* renamed from: m2, reason: collision with root package name */
    public rh4.m f172533m2;

    /* renamed from: n2, reason: collision with root package name */
    public ph4.e f172534n2;

    /* renamed from: o2, reason: collision with root package name */
    public oh4.j f172535o2;

    /* renamed from: p2, reason: collision with root package name */
    public androidx.recyclerview.widget.f2 f172536p2;

    /* renamed from: q2, reason: collision with root package name */
    public int f172537q2;

    /* renamed from: r2, reason: collision with root package name */
    public java.lang.Runnable f172538r2;

    /* renamed from: s2, reason: collision with root package name */
    public boolean f172539s2;

    /* renamed from: t2, reason: collision with root package name */
    public int f172540t2;

    /* renamed from: u2, reason: collision with root package name */
    public boolean f172541u2;

    /* renamed from: v2, reason: collision with root package name */
    public boolean f172542v2;

    /* renamed from: w2, reason: collision with root package name */
    public boolean f172543w2;

    /* renamed from: x2, reason: collision with root package name */
    public boolean f172544x2;

    /* renamed from: y2, reason: collision with root package name */
    public boolean f172545y2;

    /* renamed from: z2, reason: collision with root package name */
    public boolean f172546z2;

    public TaskBarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f172521b2 = new com.tencent.mm.plugin.taskbar.ui.d1();
        this.f172524d2 = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f172525e2 = new java.util.ArrayList();
        this.f172528h2 = null;
        this.f172529i2 = false;
        this.f172530j2 = "";
        this.f172537q2 = 0;
        this.f172538r2 = null;
        this.f172539s2 = false;
        this.f172540t2 = 0;
        this.f172541u2 = false;
        this.f172542v2 = false;
        this.f172543w2 = true;
        this.f172544x2 = false;
        this.f172545y2 = false;
        this.f172546z2 = false;
        this.A2 = false;
        this.B2 = false;
        this.C2 = false;
        this.D2 = false;
        this.E2 = false;
        this.F2 = false;
        this.G2 = 0;
        this.H2 = false;
        this.I2 = false;
        this.J2 = 0;
        this.K2 = 0;
        this.L2 = false;
        this.M2 = false;
        this.N2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TingMusicRecommendStateChangedEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.taskbar.ui.TaskBarView.1
            {
                this.__eventId = -160835806;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.TingMusicRecommendStateChangedEvent tingMusicRecommendStateChangedEvent) {
                int i17 = com.tencent.mm.plugin.taskbar.ui.TaskBarView.f172519c3;
                com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = com.tencent.mm.plugin.taskbar.ui.TaskBarView.this;
                java.lang.Runnable runnable = taskBarView.Y2;
                taskBarView.removeCallbacks(runnable);
                taskBarView.post(runnable);
                return false;
            }
        };
        this.O2 = android.view.ViewConfiguration.get(com.tencent.mm.sdk.platformtools.x2.f193071a).getScaledTouchSlop();
        this.P2 = 0.0f;
        this.Q2 = 0.0f;
        this.R2 = 0.0f;
        this.S2 = false;
        this.T2 = false;
        this.U2 = false;
        this.V2 = false;
        this.W2 = new android.view.animation.DecelerateInterpolator();
        this.X2 = new com.tencent.mm.plugin.taskbar.ui.r1(this);
        this.Y2 = new com.tencent.mm.plugin.taskbar.ui.s1(this);
        this.Z2 = -1;
        this.f172520a3 = false;
        this.f172522b3 = new com.tencent.mm.plugin.taskbar.ui.m1(this);
        q1(context);
    }

    public static void g1(com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "checkDidReAppear CommonUsedDataUpdated:%b, dataRefreshType:%d", java.lang.Boolean.valueOf(taskBarView.f172523c2.f172667m), java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.taskbar.ui.o2 o2Var = taskBarView.f172523c2;
        if (o2Var.f172667m) {
            int i18 = taskBarView.K2;
            boolean z17 = true;
            if ((i18 == 0 && i17 == 1) || i17 == 2) {
                if (i17 == 1) {
                    taskBarView.K2 = i18 + 1;
                    z17 = false;
                }
                o2Var.f172667m = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "onDidReAppear dataRefreshType:%d, isBackFromDesktop:%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
                o2Var.f172666l = i17;
                ih4.a aVar = o2Var.f172674t;
                aVar.getClass();
                aVar.f291598a = java.lang.System.currentTimeMillis();
                o2Var.l(z17, 0);
                o2Var.m();
                o2Var.f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView getDesktopContainer() {
        return this.f172526f2.getDesktopContainerView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public int getEmptyViewTopMargin() {
        rh4.m mVar;
        rh4.o oVar;
        rh4.n0 n0Var;
        java.util.ArrayList arrayList = this.f172525e2;
        java.lang.Object[] objArr = arrayList.size() - (p1() ? 1 : 0) == 1;
        int f17 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479727dj);
        if (objArr == true) {
            return (getHeight() - (p1() ? f17 : 0)) / 3;
        }
        int height = getHeight();
        if (p1()) {
            height -= f17;
        }
        if (arrayList.contains(1) && (n0Var = this.f172531k2) != null) {
            height -= n0Var.getHeight();
        }
        if (arrayList.contains(2) && (oVar = this.f172532l2) != null) {
            height -= oVar.getHeight();
        }
        if (arrayList.contains(7) && (mVar = this.f172533m2) != null) {
            height -= mVar.getHeight();
        }
        return java.lang.Math.max(height / 3, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479688cn));
    }

    public static void h1(com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "onDidCloseHeader %b", java.lang.Boolean.valueOf(taskBarView.f172541u2));
        if (taskBarView.f172541u2) {
            return;
        }
        taskBarView.setupMultiTaskScroll(true);
        taskBarView.f172543w2 = true;
        taskBarView.post(taskBarView.X2);
        taskBarView.m1();
        if (taskBarView.f172533m2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "updateTitleSize to 14f");
            int dimensionPixelSize = taskBarView.f172527g2.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479925j4);
            taskBarView.f172533m2.h(dimensionPixelSize);
            rh4.n0 n0Var = taskBarView.f172531k2;
            if (n0Var != null) {
                n0Var.h(dimensionPixelSize);
            }
            ph4.e eVar = taskBarView.f172534n2;
            if (eVar != null) {
                eVar.h(dimensionPixelSize);
            }
            oh4.j jVar = taskBarView.f172535o2;
            if (jVar != null) {
                jVar.h(dimensionPixelSize);
            }
            taskBarView.f172533m2.t(false);
        }
        if (taskBarView.I2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "ljd checkUpdateCacheWhenCloseHeader");
            taskBarView.I2 = false;
            ((com.tencent.mm.feature.appbrand.support.c0) ((ft.j) i95.n0.c(ft.j.class))).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "notifyCommonUsedAppCacheUpdate");
            com.tencent.mm.plugin.appbrand.appusage.l0 l0Var = (com.tencent.mm.plugin.appbrand.appusage.l0) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.l0.class);
            l0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppStorage", "ljd notifyCommonUsedAppCacheUpdate db");
            l0Var.doNotify("batch", 3, 0);
            com.tencent.mm.plugin.appbrand.appusage.j0.f76474h = false;
        }
        ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Ui(rv.g3.ShowAppBrandBox);
    }

    public static void j1(com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView, int i17, com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo, int i18, boolean z17) {
        taskBarView.getClass();
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        appBrandStatObject.f87790f = i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(z17 ? "2:" : "1:");
        sb6.append(i18);
        appBrandStatObject.f87791g = sb6.toString();
        if (localUsageInfo != null) {
            taskBarView.D2 = true;
            taskBarView.v1();
            taskBarView.postDelayed(new com.tencent.mm.plugin.taskbar.ui.k1(taskBarView, localUsageInfo, i17, appBrandStatObject), gh4.j0.b() ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_android_appbrand_pulldown_launch_remove_delay_millis, 0L) : 0L);
        }
    }

    private void setupMultiTaskScroll(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "setupMultiTaskScroll %b", java.lang.Boolean.valueOf(z17));
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).T6(z17);
    }

    @Override // cl1.o0
    public void A() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0048  */
    @Override // cl1.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D(boolean r18, cl1.n0 r19, int r20, boolean r21, int r22) {
        /*
            r17 = this;
            r0 = r19
            r1 = r17
            com.tencent.mm.plugin.taskbar.ui.o2 r2 = r1.f172523c2
            r2.getClass()
            java.lang.String r3 = "item"
            kotlin.jvm.internal.o.g(r0, r3)
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r3 = r0.f42888a
            java.lang.String r3 = r3.f76362e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
            int r5 = r0.f42889b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r6}
            java.lang.String r4 = "MicroMsg.TaskBarViewPresenter"
            java.lang.String r6 = "reportOnItemManualAddDeleteMyWeApp appId:%s,pos:%d, viewType:%d"
            com.tencent.mars.xlog.Log.i(r4, r6, r3)
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r3 = r0.f42888a
            java.lang.String r4 = r3.f76362e
            int r3 = r3.f76363f
            java.lang.String r10 = com.tencent.mm.plugin.multitask.s0.b(r4, r3)
            r3 = 2
            r4 = 1
            r6 = 7
            if (r5 != r3) goto L3a
            r7 = 3
            goto L3e
        L3a:
            if (r5 != r6) goto L40
            r7 = 14
        L3e:
            r9 = r7
            goto L41
        L40:
            r9 = r4
        L41:
            if (r18 == 0) goto L45
            r7 = r4
            goto L46
        L45:
            r7 = r3
        L46:
            if (r18 == 0) goto L4a
            r3 = 6
            goto L4b
        L4a:
            r3 = r6
        L4b:
            if (r5 != r6) goto L4f
            r3 = 8
        L4f:
            r8 = r3
            ih4.a r6 = r2.f172674t
            r11 = 0
            r13 = 0
            r14 = 0
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r2 = r0.f42888a
            java.lang.String r15 = r2.f76361d
            boolean r0 = r19.b()
            if (r0 == 0) goto L61
            r0 = 4
            goto L62
        L61:
            r0 = 0
        L62:
            r16 = r0
            r12 = r22
            r6.c(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.taskbar.ui.TaskBarView.D(boolean, cl1.n0, int, boolean, int):void");
    }

    @Override // cl1.o0
    public void E(int i17) {
        com.tencent.mm.plugin.taskbar.ui.z zVar = this.f172526f2.f172497d;
        if (zVar != null) {
            zVar.b(0L, i17, false);
        }
    }

    @Override // cl1.o0
    public void G(int i17, cl1.n0 n0Var, boolean z17) {
        int i18;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.String str = n0Var.f42888a.f76365h;
        int i19 = n0Var.f42889b;
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "launchAppBrandWithCheck, %d %s %d %b", valueOf, str, java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(this.f172546z2));
        if (this.f172546z2) {
            return;
        }
        this.f172523c2.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "checkLaunchAppBrand checkOk: %b", java.lang.Boolean.TRUE);
        this.B2 = false;
        this.C2 = false;
        int i27 = 2;
        if (i19 == 2) {
            j1(this, 1104, n0Var.f42888a, i17, z17);
        } else if (i19 == 7) {
            j1(this, 1271, n0Var.f42888a, i17, z17);
        } else {
            j1(this, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.z.CTRL_INDEX, n0Var.f42888a, i17, z17);
        }
        com.tencent.mm.plugin.taskbar.ui.o2 o2Var = this.f172523c2;
        o2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "reportOnItemClicked appId:%s,pos:%d,viewType:%d,desktop:%b", n0Var.f42888a.f76362e, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = n0Var.f42888a;
        java.lang.String b17 = com.tencent.mm.plugin.multitask.s0.b(localUsageInfo.f76362e, localUsageInfo.f76363f);
        java.lang.String extra_data = "";
        if (i19 == 2) {
            i18 = 3;
        } else if (i19 == 7) {
            com.tencent.mm.plugin.appbrand.appusage.AppBrandCommUseInfo appBrandCommUseInfo = n0Var.f42888a.f76375u;
            if (appBrandCommUseInfo != null && !com.tencent.mm.sdk.platformtools.t8.K0(appBrandCommUseInfo.f76339f)) {
                extra_data = n0Var.f42888a.f76375u.f76339f;
                kotlin.jvm.internal.o.f(extra_data, "extra_data");
            }
            i18 = 14;
        } else {
            i18 = 1;
        }
        o2Var.f172678x = i18;
        if (!z17) {
            i27 = 1;
        } else if (i19 == 2) {
            i27 = 3;
        }
        o2Var.f172674t.e(i18, i17, b17, i27, null, extra_data, o2Var.f172666l, n0Var.f42888a.f76361d, n0Var.b() ? 4 : 0);
    }

    @Override // cl1.o0
    public void b(com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo, int i17, int i18) {
        com.tencent.mm.plugin.taskbar.ui.o2 o2Var = this.f172523c2;
        if (o2Var == null) {
            return;
        }
        o2Var.k(localUsageInfo, i17, i18, false);
    }

    @Override // cl1.o0
    public boolean c() {
        return !((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() && this.f172523c2.f172663i.size() > 0;
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.q
    public void d() {
        m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        if (r0 != 3) goto L74;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.taskbar.ui.TaskBarView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    @Override // cl1.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(cl1.n0 r18, boolean r19, boolean r20, boolean r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            if (r20 != 0) goto Ld
            boolean r3 = r0.f172545y2
            if (r3 == 0) goto Ld
            return
        Ld:
            if (r20 == 0) goto L92
            com.tencent.mm.plugin.taskbar.ui.o2 r3 = r0.f172523c2
            r3.getClass()
            java.lang.String r4 = "item"
            kotlin.jvm.internal.o.g(r1, r4)
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r4 = r1.f42888a
            java.lang.String r5 = r4.f76362e
            int r4 = r4.f76363f
            java.lang.String r9 = com.tencent.mm.plugin.multitask.s0.b(r5, r4)
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r4 = r1.f42888a
            java.lang.String r4 = r4.f76362e
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r21)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r19)
            int r7 = r1.f42889b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r9, r5, r6, r8}
            java.lang.String r5 = "MicroMsg.TaskBarViewPresenter"
            java.lang.String r6 = "reportOnItemAppear appId:%s,multiTaskId:%s loadMore:%b isMy:%b, viewType:%d"
            com.tencent.mars.xlog.Log.i(r5, r6, r4)
            r4 = 3
            r5 = 2
            java.lang.String r6 = ""
            if (r7 != r5) goto L4a
            r8 = r4
            goto L68
        L4a:
            r8 = 7
            if (r7 != r8) goto L6a
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r7 = r1.f42888a
            com.tencent.mm.plugin.appbrand.appusage.AppBrandCommUseInfo r7 = r7.f76375u
            r8 = 14
            if (r7 == 0) goto L68
            java.lang.String r7 = r7.f76339f
            boolean r7 = com.tencent.mm.sdk.platformtools.t8.K0(r7)
            if (r7 != 0) goto L68
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r6 = r1.f42888a
            com.tencent.mm.plugin.appbrand.appusage.AppBrandCommUseInfo r6 = r6.f76375u
            java.lang.String r6 = r6.f76339f
            java.lang.String r7 = "extra_data"
            kotlin.jvm.internal.o.f(r6, r7)
        L68:
            r12 = r6
            goto L6d
        L6a:
            r7 = 1
            r12 = r6
            r8 = r7
        L6d:
            if (r2 == 0) goto L71
            r10 = r4
            goto L72
        L71:
            r10 = r5
        L72:
            if (r21 == 0) goto L76
            r7 = r4
            goto L77
        L76:
            r7 = r5
        L77:
            ih4.a r6 = r3.f172674t
            java.lang.String r11 = ""
            int r14 = r3.f172666l
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r2 = r1.f42888a
            java.lang.String r15 = r2.f76361d
            boolean r1 = r18.b()
            if (r1 == 0) goto L89
            r1 = 4
            goto L8a
        L89:
            r1 = 0
        L8a:
            r16 = r1
            r13 = r22
            r6.d(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L99
        L92:
            com.tencent.mm.plugin.taskbar.ui.o2 r3 = r0.f172523c2
            r4 = r22
            r3.j(r1, r2, r4)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.taskbar.ui.TaskBarView.e(cl1.n0, boolean, boolean, boolean, int):void");
    }

    public androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return this;
    }

    public int getTaskBarContainerBottom() {
        return getBottom();
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return 0.0f;
    }

    public void l1(int i17) {
        postDelayed(new com.tencent.mm.plugin.taskbar.ui.e1(this, i17), E0() ? 200L : 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x032d A[Catch: Exception -> 0x0336, TRY_LEAVE, TryCatch #1 {Exception -> 0x0336, blocks: (B:63:0x02f4, B:113:0x0302, B:116:0x0309, B:118:0x0319, B:120:0x031f, B:125:0x032d), top: B:62:0x02f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0330 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x038e A[Catch: all -> 0x0394, TRY_LEAVE, TryCatch #0 {all -> 0x0394, blocks: (B:71:0x0353, B:74:0x0365, B:79:0x0372, B:81:0x037c, B:83:0x0382, B:88:0x038e), top: B:70:0x0353 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0391 A[SYNTHETIC] */
    @Override // com.tencent.mm.plugin.taskbar.ui.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m() {
        /*
            Method dump skipped, instructions count: 1073
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.taskbar.ui.TaskBarView.m():void");
    }

    public void m1() {
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Boolean.valueOf(this.f172545y2);
        objArr[1] = java.lang.Boolean.valueOf(this.A2);
        objArr[2] = java.lang.Boolean.valueOf(this.f172544x2);
        objArr[3] = java.lang.Boolean.valueOf(this.f172543w2);
        objArr[4] = java.lang.Boolean.valueOf(!this.f172546z2);
        objArr[5] = java.lang.Boolean.valueOf(this.f172523c2.f172670p == 0);
        objArr[6] = java.lang.Boolean.valueOf(!this.f172541u2);
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "checkReloadData isInSecondaryPage[%b],isStopped[%b] | shouldReloadOnAppear[%b] isHeaderDidClose[%b] !isPaused[%b] isOnMainTab[%b] !isHeaderStartOpen[%b]", objArr);
        if (!this.f172545y2 && (!this.A2 || this.f172543w2)) {
            if (!this.f172544x2 || !this.f172543w2 || this.f172546z2) {
                return;
            }
            if (!(this.f172523c2.f172670p == 0) || this.f172541u2) {
                return;
            }
        }
        java.lang.Runnable runnable = this.Y2;
        removeCallbacks(runnable);
        post(runnable);
    }

    @Override // cl1.o0
    public void n(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "notifyDesktopClosed isBack:%b, isDataChange:%b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        this.f172545y2 = false;
        this.f172526f2.f172503m.setImportantForAccessibility(2);
        if (z17) {
            if (!z18) {
                this.f172523c2.l(true, 0);
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            ((ov.b) ((pv.z) i95.n0.c(pv.z.class))).getClass();
            bundle.putString("session_id", ip1.q.f293600e);
            bundle.putBoolean("need_location_info", true);
            ft.j jVar = (ft.j) i95.n0.c(ft.j.class);
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.taskbar.ui.y1 y1Var = new com.tencent.mm.plugin.taskbar.ui.y1(this, 2);
            ((com.tencent.mm.feature.appbrand.support.c0) jVar).getClass();
            com.tencent.mm.plugin.appbrand.appusage.c1.z0().u0(currentTimeMillis, true, bundle, 11, 0, -1, -1L, null, y1Var);
        }
    }

    public void n1() {
        rh4.m mVar = this.f172533m2;
        if (mVar == null || !mVar.r()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "updateTitleSize to 12f");
        int dimensionPixelSize = this.f172527g2.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479930ja);
        this.f172533m2.h(dimensionPixelSize);
        rh4.n0 n0Var = this.f172531k2;
        if (n0Var != null) {
            n0Var.h(dimensionPixelSize);
        }
        ph4.e eVar = this.f172534n2;
        if (eVar != null) {
            eVar.h(dimensionPixelSize);
        }
        oh4.j jVar = this.f172535o2;
        if (jVar != null) {
            jVar.h(dimensionPixelSize);
        }
        if (this.f172533m2.r()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "need restrictMoreViewWidget");
            this.f172533m2.t(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d4  */
    @Override // com.tencent.mm.plugin.taskbar.ui.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(int r23, int r24) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.taskbar.ui.TaskBarView.o(int, int):void");
    }

    public final boolean o1() {
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_TASKBAR_SHOULD_NOT_SHOW_EMPTY_OTHER_TIPS_BOOLEAN_SYNC, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "enableOthersWording %b", java.lang.Boolean.valueOf(!o17));
        return !o17;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.view.View rootView = getRootView();
        if (rootView == null) {
            return;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.T2) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer = this.f172526f2;
        if (taskBarContainer == null || this.f172537q2 == taskBarContainer.getViewHeight()) {
            return;
        }
        int viewHeight = this.f172526f2.getViewHeight();
        this.f172537q2 = viewHeight;
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "onMeasure fixedViewHeight: %d, measuredHeight: %d", java.lang.Integer.valueOf(viewHeight), java.lang.Integer.valueOf(this.f172526f2.getMeasuredHeight()));
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View view, int i17) {
        com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer;
        super.onVisibilityChanged(view, i17);
        if (i17 == 8 || i17 == 4) {
            if (this.D2 && (taskBarContainer = this.f172526f2) != null) {
                int i18 = this.G2;
                com.tencent.mm.plugin.taskbar.ui.z zVar = taskBarContainer.f172497d;
                if (zVar != null) {
                    zVar.b(100L, i18, true);
                }
                this.G2 = 0;
                this.D2 = false;
            }
            if (this.f172539s2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "onVisibilityChanged needRefresh");
                this.f172539s2 = false;
                java.lang.Runnable runnable = this.f172538r2;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                com.tencent.mm.plugin.taskbar.ui.n1 n1Var = new com.tencent.mm.plugin.taskbar.ui.n1(this);
                this.f172538r2 = n1Var;
                postDelayed(n1Var, 1000L);
            }
        }
    }

    public final boolean p1() {
        java.util.ArrayList arrayList = this.f172525e2;
        return arrayList.contains(5) || arrayList.contains(10);
    }

    @Override // android.view.View
    public boolean post(java.lang.Runnable runnable) {
        synchronized (this) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f172524d2;
            if (n3Var == null) {
                return false;
            }
            return n3Var.post(runnable);
        }
    }

    @Override // android.view.View
    public boolean postDelayed(java.lang.Runnable runnable, long j17) {
        synchronized (this) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f172524d2;
            if (n3Var == null) {
                return false;
            }
            return n3Var.postDelayed(runnable, j17);
        }
    }

    public final void q1(android.content.Context context) {
        this.f172527g2 = context;
        setItemAnimator(this.f172521b2);
        N(new com.tencent.mm.plugin.taskbar.ui.x1(this, null));
        setVerticalFadingEdgeEnabled(false);
        setNestedScrollingEnabled(true);
        setBackground(null);
        com.tencent.mm.plugin.taskbar.ui.o1 o1Var = new com.tencent.mm.plugin.taskbar.ui.o1(this, context);
        this.f172528h2 = o1Var;
        setLayoutManager(o1Var);
        setOverScrollMode(2);
        i(this.f172522b3);
        androidx.recyclerview.widget.f2 w1Var = new com.tencent.mm.plugin.taskbar.ui.w1(this);
        this.f172536p2 = w1Var;
        setAdapter(w1Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "TaskBarView init %d", java.lang.Integer.valueOf(hashCode()));
        this.N2.alive();
    }

    public final boolean r1() {
        rh4.o oVar;
        rh4.m mVar;
        rh4.n0 n0Var = this.f172531k2;
        return (n0Var != null && n0Var.f395769m.f91125d2) || ((oVar = this.f172532l2) != null && oVar.f395769m.f91125d2) || ((mVar = this.f172533m2) != null && mVar.f395769m.f91125d2);
    }

    @Override // android.view.View
    public boolean removeCallbacks(java.lang.Runnable runnable) {
        synchronized (this) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f172524d2;
            if (n3Var == null) {
                return false;
            }
            n3Var.removeCallbacks(runnable);
            return true;
        }
    }

    public void s1() {
        this.B2 = false;
        this.C2 = false;
        this.D2 = false;
        if (((su4.a1) i95.n0.c(su4.a1.class)) != null) {
            this.f172545y2 = true;
            su4.j2 j2Var = new su4.j2();
            j2Var.f412939b = 42;
            j2Var.f412940c = 262208;
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_weapp_mainframe_search_style, 0) == 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "onSearchClick isSupportSearchStyle:%b", java.lang.Boolean.valueOf(z17));
            j2Var.D = z17;
            j2Var.E = c();
            j2Var.A = !((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).wi(42, 262208);
            ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Bi(this.f172527g2, j2Var);
            ((sg0.a2) ((su4.z0) i95.n0.c(su4.z0.class))).aj(42, 262208);
        }
        boolean z18 = j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigWeAppSearchEntryNewStyle()) == 1;
        int i17 = z18 ? 16 : 12;
        if (z18) {
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Di(1132);
        }
        u(i17, false, false, null);
    }

    public void setHeaderContainer(com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer) {
        this.f172526f2 = taskBarContainer;
        getDesktopContainer().setCallback(this);
    }

    public void t1() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "onTeenModeStatusChanged");
        this.f172523c2.b(true, 300L);
        final com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView appBrandDesktopView = (com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView) getDesktopContainer().f91073f;
        appBrandDesktopView.getClass();
        if (((ku5.t0) ku5.t0.f312615d).f312617a.get()) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: cl1.l$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.f91080h0;
                com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView appBrandDesktopView2 = com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.this;
                appBrandDesktopView2.o1();
                appBrandDesktopView2.n1();
                appBrandDesktopView2.m1(i65.a.B(appBrandDesktopView2.getContext()));
            }
        });
    }

    @Override // cl1.o0
    public void u(int i17, boolean z17, boolean z18, java.lang.String str) {
        com.tencent.mm.plugin.taskbar.ui.o2 o2Var = this.f172523c2;
        if (o2Var == null) {
            return;
        }
        o2Var.f172678x = i17;
        int i18 = !z17 ? 1 : z18 ? 3 : 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "reportOnItemClicked type:%d", java.lang.Integer.valueOf(i17));
        o2Var.f172674t.e(i17, 0, "", i18, str, "", o2Var.f172666l, "", -1);
    }

    public void u1(cl1.n0 n0Var, int i17) {
        if (n0Var.f42889b == 7) {
            this.f172523c2.g(n0Var, i17, 2, 9);
        } else {
            this.f172523c2.g(n0Var, i17, 2, 7);
        }
    }

    public final void v1() {
        if (this.f172526f2 == null || !gh4.j0.b()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "switchToGradientBackgroundView");
        java.lang.Object parent = this.f172526f2.getParent();
        if (parent instanceof android.view.View) {
            ((android.view.View) parent).setBackgroundColor(this.f172527g2.getResources().getColor(com.tencent.mm.R.color.a9e));
        }
        com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer backgroundGLSurfaceContainer = this.f172526f2.getBackgroundGLSurfaceContainer();
        if (backgroundGLSurfaceContainer != null) {
            synchronized (backgroundGLSurfaceContainer) {
                com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBgContainer.", "pause");
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
                    dynamicBackgroundGLSurfaceView.b();
                }
            }
            this.L2 = true;
        }
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.q
    public void w(int i17) {
        o(i17, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w1() {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.taskbar.ui.TaskBarView.w1():void");
    }

    @Override // cl1.o0
    public void y(boolean z17, int i17) {
        com.tencent.mm.plugin.taskbar.ui.o2 o2Var = this.f172523c2;
        o2Var.getClass();
        boolean b17 = gh4.j0.b();
        ih4.a aVar = o2Var.f172674t;
        int i18 = !z17 ? i17 : 0;
        int i19 = z17 ? i17 : 0;
        aVar.b(2, b17 ? 1 : 0, i18, 0, 0, 0, 0, 0, i19, 0, 0, z17 ? 3 : 2, 0, o2Var.f172666l);
    }

    public TaskBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f172521b2 = new com.tencent.mm.plugin.taskbar.ui.d1();
        this.f172524d2 = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f172525e2 = new java.util.ArrayList();
        this.f172528h2 = null;
        this.f172529i2 = false;
        this.f172530j2 = "";
        this.f172537q2 = 0;
        this.f172538r2 = null;
        this.f172539s2 = false;
        this.f172540t2 = 0;
        this.f172541u2 = false;
        this.f172542v2 = false;
        this.f172543w2 = true;
        this.f172544x2 = false;
        this.f172545y2 = false;
        this.f172546z2 = false;
        this.A2 = false;
        this.B2 = false;
        this.C2 = false;
        this.D2 = false;
        this.E2 = false;
        this.F2 = false;
        this.G2 = 0;
        this.H2 = false;
        this.I2 = false;
        this.J2 = 0;
        this.K2 = 0;
        this.L2 = false;
        this.M2 = false;
        this.N2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TingMusicRecommendStateChangedEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.taskbar.ui.TaskBarView.1
            {
                this.__eventId = -160835806;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.TingMusicRecommendStateChangedEvent tingMusicRecommendStateChangedEvent) {
                int i172 = com.tencent.mm.plugin.taskbar.ui.TaskBarView.f172519c3;
                com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = com.tencent.mm.plugin.taskbar.ui.TaskBarView.this;
                java.lang.Runnable runnable = taskBarView.Y2;
                taskBarView.removeCallbacks(runnable);
                taskBarView.post(runnable);
                return false;
            }
        };
        this.O2 = android.view.ViewConfiguration.get(com.tencent.mm.sdk.platformtools.x2.f193071a).getScaledTouchSlop();
        this.P2 = 0.0f;
        this.Q2 = 0.0f;
        this.R2 = 0.0f;
        this.S2 = false;
        this.T2 = false;
        this.U2 = false;
        this.V2 = false;
        this.W2 = new android.view.animation.DecelerateInterpolator();
        this.X2 = new com.tencent.mm.plugin.taskbar.ui.r1(this);
        this.Y2 = new com.tencent.mm.plugin.taskbar.ui.s1(this);
        this.Z2 = -1;
        this.f172520a3 = false;
        this.f172522b3 = new com.tencent.mm.plugin.taskbar.ui.m1(this);
        q1(context);
    }
}
