package cw2;

/* loaded from: classes2.dex */
public final class f8 extends td2.b implements com.tencent.mm.app.t2, cw2.z9 {
    public final com.tencent.mm.plugin.finder.video.FinderVideoCore$finderSeekEventListener$1 A;
    public long B;

    /* renamed from: g, reason: collision with root package name */
    public final int f223699g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.nb0 f223700h;

    /* renamed from: i, reason: collision with root package name */
    public cs2.k f223701i;

    /* renamed from: m, reason: collision with root package name */
    public ec2.i f223702m;

    /* renamed from: n, reason: collision with root package name */
    public dw2.c0 f223703n;

    /* renamed from: o, reason: collision with root package name */
    public uo2.v f223704o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f223705p;

    /* renamed from: q, reason: collision with root package name */
    public f25.m0 f223706q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.appcompat.app.AppCompatActivity f223707r;

    /* renamed from: s, reason: collision with root package name */
    public androidx.fragment.app.Fragment f223708s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f223709t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f223710u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f223711v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f223712w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f223713x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f223714y;

    /* renamed from: z, reason: collision with root package name */
    public int f223715z;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.video.FinderVideoCore$finderSeekEventListener$1] */
    public f8(int i17) {
        this.f223699g = i17;
        this.f223700h = (com.tencent.mm.plugin.finder.viewmodel.component.nb0) pf5.u.f353936a.e(zy2.b6.class).c(com.tencent.mm.plugin.finder.viewmodel.component.nb0.class);
        this.f223709t = true;
        this.f223712w = true;
        this.f223713x = true;
        this.f223715z = -1;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.A = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderVideoCtrlEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.video.FinderVideoCore$finderSeekEventListener$1
            {
                this.__eventId = 726298794;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderVideoCtrlEvent finderVideoCtrlEvent) {
                am.qd qdVar;
                int i18;
                com.tencent.mm.autogen.events.FinderVideoCtrlEvent event = finderVideoCtrlEvent;
                kotlin.jvm.internal.o.g(event, "event");
                cw2.f8 f8Var = cw2.f8.this;
                androidx.appcompat.app.AppCompatActivity appCompatActivity = f8Var.f223707r;
                if (appCompatActivity != null && ((i18 = (qdVar = event.f54337g).f7707b) == 0 || i18 == appCompatActivity.hashCode())) {
                    boolean z17 = qdVar.f7706a;
                    com.tencent.mm.plugin.finder.viewmodel.component.nb0 nb0Var = f8Var.f223700h;
                    if (z17) {
                        if (qdVar.f7707b != 0) {
                            dw2.c0 c0Var = f8Var.f223703n;
                            if (c0Var != null) {
                                c0Var.X(false);
                                c0Var.w0("FinderVideoCtrlEvent");
                            }
                        } else {
                            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) nb0Var).f7(appCompatActivity);
                        }
                        f8Var.H0().T6();
                        com.tencent.mars.xlog.Log.i("FinderVideoCore", f8Var.F0() + " resume video from event");
                    } else {
                        dw2.c0 c0Var2 = f8Var.f223703n;
                        if (c0Var2 != null) {
                            c0Var2.X(true);
                        }
                        if (!qdVar.f7708c) {
                            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) nb0Var).c7(appCompatActivity);
                        }
                        f8Var.H0().S6();
                        com.tencent.mars.xlog.Log.i("FinderVideoCore", f8Var.F0() + " pause video from event");
                    }
                }
                return true;
            }
        };
    }

    public static /* synthetic */ void L0(cw2.f8 f8Var, androidx.appcompat.app.AppCompatActivity appCompatActivity, androidx.fragment.app.Fragment fragment, cw2.b8 b8Var, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            fragment = null;
        }
        if ((i17 & 4) != 0) {
            b8Var = null;
        }
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        f8Var.J0(appCompatActivity, fragment, b8Var, z17);
    }

    @Override // cw2.z9
    public boolean A() {
        com.tencent.mars.xlog.Log.i("FinderVideoCore", F0() + " isDefaultMute: hasAudioFocus=" + this.f223709t + ", hasCareFloatBall=" + this.f223710u + " isVoiping:" + this.f223711v);
        return (!this.f223709t && this.f223710u) || this.f223711v;
    }

    @Override // cw2.z9
    public cw2.w9 C() {
        return this.f223701i;
    }

    @Override // cw2.z9
    public void D(long j17) {
        this.B = j17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (kotlin.jvm.internal.o.b(r1 != null ? ((g25.e) r1).f267979b : null, f25.q.f259109c) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        if (((r0 == null || (r0 = ((g25.e) r0).f267979b) == null || (r0 = r0.f259104a) == null) ? false : r26.i0.y(r0, "ting_", false)) != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E0() {
        /*
            r6 = this;
            java.lang.Class<f25.n0> r0 = f25.n0.class
            i95.m r0 = i95.n0.c(r0)
            f25.n0 r0 = (f25.n0) r0
            f25.e r0 = r0.Vd()
            f25.m0 r1 = r0.f259093b
            r2 = 0
            if (r1 == 0) goto L16
            g25.e r1 = (g25.e) r1
            f25.l0 r1 = r1.f267979b
            goto L17
        L16:
            r1 = r2
        L17:
            f25.l r3 = f25.l.f259103c
            boolean r1 = kotlin.jvm.internal.o.b(r1, r3)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L36
            f25.m0 r1 = r0.f259093b
            if (r1 == 0) goto L2a
            g25.e r1 = (g25.e) r1
            f25.l0 r1 = r1.f267979b
            goto L2b
        L2a:
            r1 = r2
        L2b:
            f25.m r5 = f25.m.f259106c
            boolean r1 = kotlin.jvm.internal.o.b(r1, r5)
            if (r1 == 0) goto L34
            goto L36
        L34:
            r1 = r4
            goto L37
        L36:
            r1 = r3
        L37:
            boolean r5 = r0.f259092a
            if (r5 == 0) goto L78
            boolean r5 = iq.b.l(r2, r4)
            if (r5 == 0) goto L43
            if (r1 != 0) goto L79
        L43:
            kd2.o0 r1 = kd2.p1.N
            kd2.p1 r1 = r1.a()
            boolean r1 = r1.u()
            if (r1 == 0) goto L5f
            f25.m0 r1 = r0.f259093b
            if (r1 == 0) goto L57
            g25.e r1 = (g25.e) r1
            f25.l0 r2 = r1.f267979b
        L57:
            f25.q r1 = f25.q.f259109c
            boolean r1 = kotlin.jvm.internal.o.b(r2, r1)
            if (r1 != 0) goto L79
        L5f:
            f25.m0 r0 = r0.f259093b
            if (r0 == 0) goto L74
            g25.e r0 = (g25.e) r0
            f25.l0 r0 = r0.f267979b
            if (r0 == 0) goto L74
            java.lang.String r0 = r0.f259104a
            if (r0 == 0) goto L74
            java.lang.String r1 = "ting_"
            boolean r0 = r26.i0.y(r0, r1, r4)
            goto L75
        L74:
            r0 = r4
        L75:
            if (r0 == 0) goto L78
            goto L79
        L78:
            r3 = r4
        L79:
            r6.f223710u = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.f8.E0():void");
    }

    @Override // cw2.z9
    public com.tencent.mm.plugin.finder.viewmodel.component.nb0 F() {
        return this.f223700h;
    }

    public final java.lang.String F0() {
        return "tabType:" + this.f223699g + '.' + hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G0() {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r10.F0()
            r0.append(r1)
            java.lang.String r1 = " gainAudioFocus: tabType="
            r0.append(r1)
            int r1 = r10.f223699g
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderVideoCore"
            com.tencent.mars.xlog.Log.i(r1, r0)
            r0 = 1
            r10.f223709t = r0
            androidx.appcompat.app.AppCompatActivity r1 = r10.f223707r
            boolean r2 = r1 instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI
            r3 = 0
            if (r2 == 0) goto L2c
            com.tencent.mm.plugin.finder.ui.FinderHomeUI r1 = (com.tencent.mm.plugin.finder.ui.FinderHomeUI) r1
            goto L2d
        L2c:
            r1 = r3
        L2d:
            r2 = 0
            if (r1 == 0) goto Lc8
            pf5.z r4 = pf5.z.f353948a
            pf5.v r5 = r4.a(r1)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC> r6 = com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class
            androidx.lifecycle.c1 r5 = r5.a(r6)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC r5 = (com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) r5
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r5 = r5.getActiveFragment()
            pf5.v r1 = r4.a(r1)
            androidx.lifecycle.c1 r1 = r1.a(r6)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC r1 = (com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) r1
            java.util.ArrayList r1 = r1.getFragments()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L59:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L9a
            java.lang.Object r6 = r1.next()
            r7 = r6
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r7 = (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) r7
            androidx.lifecycle.o r8 = r7.mo133getLifecycle()
            androidx.lifecycle.n r8 = r8.b()
            androidx.lifecycle.n r9 = androidx.lifecycle.n.CREATED
            boolean r8 = r8.a(r9)
            if (r8 == 0) goto L93
            int r7 = r7.f129265p
            int r8 = r5.f129265p
            if (r7 == r8) goto L93
            androidx.fragment.app.Fragment r8 = r10.f223708s
            boolean r9 = r8 instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment
            if (r9 == 0) goto L85
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r8 = (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) r8
            goto L86
        L85:
            r8 = r3
        L86:
            if (r8 == 0) goto L8e
            int r8 = r8.f129265p
            if (r7 != r8) goto L8e
            r7 = r0
            goto L8f
        L8e:
            r7 = r2
        L8f:
            if (r7 != 0) goto L93
            r7 = r0
            goto L94
        L93:
            r7 = r2
        L94:
            if (r7 == 0) goto L59
            r4.add(r6)
            goto L59
        L9a:
            java.util.Iterator r1 = r4.iterator()
        L9e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lc8
            java.lang.Object r3 = r1.next()
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r3 = (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) r3
            java.lang.String r4 = "fragment"
            kotlin.jvm.internal.o.g(r3, r4)
            pf5.z r4 = pf5.z.f353948a
            pf5.v r3 = r4.b(r3)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.t80> r4 = com.tencent.mm.plugin.finder.viewmodel.component.t80.class
            pf5.b0 r3 = r3.e(r4)
            com.tencent.mm.plugin.finder.viewmodel.component.t80 r3 = (com.tencent.mm.plugin.finder.viewmodel.component.t80) r3
            if (r3 == 0) goto L9e
            cw2.f8 r3 = r3.U6()
            if (r3 == 0) goto L9e
            r3.f223709t = r0
            goto L9e
        Lc8:
            androidx.appcompat.app.AppCompatActivity r0 = r10.f223707r
            com.tencent.mm.plugin.finder.viewmodel.component.nb0 r1 = r10.f223700h
            com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler r1 = (com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) r1
            r1.getClass()
            com.tencent.mm.plugin.finder.viewmodel.component.pa0 r3 = new com.tencent.mm.plugin.finder.viewmodel.component.pa0
            r3.<init>(r1, r0, r2)
            pm0.v.X(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.f8.G0():void");
    }

    public final uo2.v H0() {
        uo2.v vVar = this.f223704o;
        if (vVar != null) {
            return vVar;
        }
        kotlin.jvm.internal.o.o("musicManager");
        throw null;
    }

    @Override // cw2.z9
    public ec2.i I() {
        return this.f223702m;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I0(f25.l0 r11) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.f8.I0(f25.l0):void");
    }

    public final void J0(final androidx.appcompat.app.AppCompatActivity context, androidx.fragment.app.Fragment fragment, cw2.b8 b8Var, boolean z17) {
        dw2.c0 c0Var;
        cs2.k kVar;
        fc2.c Y6;
        kotlin.jvm.internal.o.g(context, "context");
        this.f223707r = context;
        this.f223708s = fragment;
        this.f223714y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MMFinderUIScreenShotEvent>(this) { // from class: com.tencent.mm.plugin.finder.video.FinderVideoCore$onInitialize$1

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ cw2.f8 f130691e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(androidx.appcompat.app.AppCompatActivity.this);
                this.f130691e = this;
                this.__eventId = 1609849418;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MMFinderUIScreenShotEvent mMFinderUIScreenShotEvent) {
                com.tencent.mm.plugin.finder.view.f5 P6;
                com.tencent.mm.autogen.events.MMFinderUIScreenShotEvent event = mMFinderUIScreenShotEvent;
                kotlin.jvm.internal.o.g(event, "event");
                cw2.f8 f8Var = this.f130691e;
                f8Var.getClass();
                androidx.appcompat.app.AppCompatActivity activity = androidx.appcompat.app.AppCompatActivity.this;
                kotlin.jvm.internal.o.g(activity, "activity");
                pf5.z zVar = pf5.z.f353948a;
                com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC finderProfileDrawerUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC) zVar.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC.class);
                boolean z18 = finderProfileDrawerUIC != null && finderProfileDrawerUIC.P6();
                com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) zVar.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class);
                java.lang.Integer valueOf = finderHomeUIC != null ? java.lang.Integer.valueOf(finderHomeUIC.S6()) : null;
                if ((!(activity instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) || (valueOf != null && valueOf.intValue() == f8Var.f223699g)) && !z18) {
                    cw2.da S6 = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) f8Var.f223700h).S6(activity);
                    cw2.wa f130756y = S6 != null ? S6.getF130756y() : null;
                    if (S6 != null && f130756y != null) {
                        com.tencent.mm.plugin.finder.viewmodel.component.u6 u6Var = (com.tencent.mm.plugin.finder.viewmodel.component.u6) zVar.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.u6.class);
                        int i17 = (u6Var == null || (P6 = u6Var.P6()) == null || !P6.b()) ? 0 : 1;
                        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                        jz5.l[] lVarArr = new jz5.l[7];
                        lVarArr[0] = new jz5.l("view_id", "screen_shot");
                        lVarArr[1] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
                        lVarArr[2] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
                        lVarArr[3] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
                        lVarArr[4] = new jz5.l("feed_id", pm0.v.u(f130756y.f224099f.getFeedId()));
                        lVarArr[5] = new jz5.l("video_progress", java.lang.Long.valueOf(S6.getCurrentPlayMs()));
                        lVarArr[6] = new jz5.l("is_pull_comment", java.lang.Integer.valueOf(i17));
                        ((cy1.a) rVar).yj("screenshot", null, kz5.c1.k(lVarArr), 1, false);
                    }
                }
                return true;
            }
        };
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(context).a(uo2.v.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f223704o = (uo2.v) a17;
        com.tencent.mm.plugin.finder.viewmodel.component.m50 m50Var = (com.tencent.mm.plugin.finder.viewmodel.component.m50) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.m50.class);
        m50Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[init] tabType=");
        int i17 = this.f223699g;
        sb6.append(i17);
        sb6.append(" limitPlayDuration=");
        sb6.append(m50Var.f135128h);
        sb6.append(" limitPlayCount=");
        sb6.append(m50Var.f135129i);
        com.tencent.mars.xlog.Log.i("Finder.SilentPlayControlUIC", sb6.toString());
        android.app.Activity context2 = m50Var.getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        dw2.c0 c0Var2 = null;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar != null && (Y6 = nyVar.Y6(i17)) != null) {
            Y6.a(new com.tencent.mm.plugin.finder.viewmodel.component.i50(m50Var));
        }
        com.tencent.mm.plugin.finder.viewmodel.component.nb0 nb0Var = this.f223700h;
        final com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler = (com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) nb0Var;
        finderVideoRecycler.getClass();
        final java.lang.String valueOf = java.lang.String.valueOf(context.hashCode());
        if (finderVideoRecycler.f133681q == 0) {
            finderVideoRecycler.f133689y.alive();
            jz5.l M2 = com.tencent.mm.plugin.finder.storage.t70.f127590a.M2();
            finderVideoRecycler.f133673f = ((java.lang.Number) M2.f302833d).intValue();
            finderVideoRecycler.f133672e = ((java.lang.Boolean) M2.f302834e).booleanValue();
            int i18 = finderVideoRecycler.f133673f - 1;
            if (i18 > 4) {
                i18 = 4;
            }
            finderVideoRecycler.f133674g = i18;
            com.tencent.mm.plugin.findersdk.receiver.HeadsetReceiver headsetReceiver = new com.tencent.mm.plugin.findersdk.receiver.HeadsetReceiver();
            finderVideoRecycler.f133682r = headsetReceiver;
            android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            headsetReceiver.b(context3, finderVideoRecycler.f133684t);
            boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Oa).getValue()).r()).intValue() == 1;
            if (finderVideoRecycler.f133686v == null && z18) {
                int i19 = pu5.i.f358473b;
                android.os.HandlerThread a18 = pu5.f.a("FinderTPWorkThread", 0);
                finderVideoRecycler.f133686v = a18;
                a18.start();
            }
            com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "[onInit] maxVideoCount=" + finderVideoRecycler.f133673f + " preInflateCount=" + finderVideoRecycler.f133674g + " waitForRelease=" + finderVideoRecycler.f133672e + " enableFinderTpWorkThreadReuse:" + z18);
        }
        if (finderVideoRecycler.f133680p.add(valueOf)) {
            com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "[register] activity=" + context.getClass().getSimpleName() + " key:" + valueOf + " activityCount:" + finderVideoRecycler.f133681q + " isPreInflate=" + z17);
            finderVideoRecycler.f133681q = finderVideoRecycler.f133681q + 1;
            context.mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$make$1
                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                public final void onDestroy() {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onDestroy activityCount:");
                    com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler2 = com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.this;
                    sb7.append(finderVideoRecycler2.f133681q);
                    com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", sb7.toString());
                    int i27 = finderVideoRecycler2.f133681q - 1;
                    finderVideoRecycler2.f133681q = i27;
                    androidx.appcompat.app.AppCompatActivity appCompatActivity = context;
                    if (i27 == 0) {
                        finderVideoRecycler2.Y6();
                    } else {
                        kz5.h0.A(finderVideoRecycler2.f133676i, new com.tencent.mm.plugin.finder.viewmodel.component.ka0(appCompatActivity));
                        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
                        finderVideoRecycler2.O6(new com.tencent.mm.plugin.finder.viewmodel.component.la0(appCompatActivity, f0Var, finderVideoRecycler2));
                        cw2.da daVar = finderVideoRecycler2.f133685u;
                        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = daVar instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) daVar : null;
                        if (finderThumbPlayerProxy != null && finderThumbPlayerProxy.getI() == appCompatActivity.hashCode()) {
                            finderVideoRecycler2.f133685u = null;
                            com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "[removeByContext] simpleName=" + appCompatActivity.getClass().getSimpleName() + " remove recentFocusView.");
                        }
                        com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "[removeByContext] simpleName=" + appCompatActivity.getClass().getSimpleName() + " context:" + appCompatActivity.hashCode() + " removeCount=" + f0Var.f310116d + " videoCount=" + finderVideoRecycler2.V6(null));
                    }
                    finderVideoRecycler2.f133680p.remove(valueOf);
                    appCompatActivity.mo133getLifecycle().c(this);
                }
            });
        }
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipEvent>(this) { // from class: com.tencent.mm.plugin.finder.video.FinderVideoCore$onInitialize$voipCallEvent$1

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ cw2.f8 f130697e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(androidx.appcompat.app.AppCompatActivity.this);
                this.f130697e = this;
                this.__eventId = -797557590;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoipEvent voipEvent) {
                com.tencent.mm.autogen.events.VoipEvent event = voipEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (!gm0.j1.a()) {
                    return false;
                }
                am.y00 y00Var = event.f54945g;
                int i27 = y00Var.f8415b;
                cw2.f8 f8Var = this.f130697e;
                if (i27 == 11) {
                    f8Var.f223711v = false;
                    com.tencent.mars.xlog.Log.i("FinderVideoCore", f8Var.F0() + " onVoipStop opcode:" + y00Var.f8415b);
                    f8Var.Z();
                    cw2.da S6 = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) f8Var.f223700h).S6(androidx.appcompat.app.AppCompatActivity.this);
                    if (S6 != null) {
                        android.view.ViewParent parentView = S6.getParentView();
                        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = parentView instanceof com.tencent.mm.plugin.finder.video.FinderVideoLayout ? (com.tencent.mm.plugin.finder.video.FinderVideoLayout) parentView : null;
                        S6.setMute(f8Var.A() || (finderVideoLayout != null && finderVideoLayout.isMute));
                    }
                } else if (i27 == 3 || i27 == 7) {
                    com.tencent.mars.xlog.Log.i("FinderVideoCore", f8Var.F0() + " onVoipStart opcode:" + y00Var.f8415b);
                    f8Var.f223711v = true;
                }
                return true;
            }
        }.alive();
        this.f223711v = iq.b.E() || iq.b.F(null, false) || iq.b.H();
        alive();
        com.tencent.mars.xlog.Log.i("FinderVideoCore", "finderSeekEventListener?.alive() " + hashCode());
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MemberStatusEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MemberStatusEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.video.FinderVideoCore$onInitialize$2
            {
                this.__eventId = -616994146;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MemberStatusEvent memberStatusEvent) {
                com.tencent.mm.autogen.events.MemberStatusEvent event = memberStatusEvent;
                kotlin.jvm.internal.o.g(event, "event");
                dw2.c0 c0Var3 = cw2.f8.this.f223703n;
                if (c0Var3 == null) {
                    return false;
                }
                c0Var3.w0("finderMember");
                return false;
            }
        };
        this.f223705p = iListener;
        iListener.alive();
        if (b8Var != null) {
            androidx.recyclerview.widget.RecyclerView d17 = b8Var.d();
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataList = b8Var.getData();
            androidx.lifecycle.c1 a19 = pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            kotlin.jvm.internal.o.f(a19, "get(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) a19;
            fc2.c Y62 = nyVar2.Y6(i17);
            if (Y62 != null) {
                this.f223702m = new ec2.i(Y62);
            }
            int integer = nyVar2.W6(i17).getInteger(5);
            if (b8Var.c()) {
                if (fragment != null) {
                    kVar = (cs2.k) pf5.z.f353948a.b(fragment).a(cs2.k.class);
                    kVar.S6(dataList, integer, i17, nyVar2.Y6(i17));
                } else {
                    kVar = (cs2.k) pf5.z.f353948a.a(context).a(cs2.k.class);
                    kVar.S6(dataList, integer, i17, nyVar2.Y6(i17));
                }
                this.f223701i = kVar;
            }
            ae2.b2 b2Var = ae2.b2.f3461a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.X).getValue()).r()).intValue() == 1) {
                xr2.b bVar = new xr2.b();
                fc2.c Y63 = nyVar2.Y6(i17);
                kotlin.jvm.internal.o.g(dataList, "dataList");
                if (Y63 != null) {
                    Y63.a(new xr2.a(bVar, dataList));
                }
            }
            if (b8Var.a()) {
                if (d17 != null) {
                    if (integer == 155) {
                        c0Var = new com.tencent.mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager((com.tencent.mm.ui.MMFragmentActivity) context, d17, nb0Var, i17);
                    } else {
                        com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager finderVideoAutoPlayManager = new com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager((com.tencent.mm.ui.MMFragmentActivity) context, d17, this.f223700h, b8Var.b(), H0(), this.f223699g);
                        finderVideoAutoPlayManager.f130784t = new cw2.c8(this, context);
                        c0Var = finderVideoAutoPlayManager;
                    }
                    c0Var2 = c0Var;
                }
                this.f223703n = c0Var2;
                if (c0Var2 != null) {
                    c0Var2.s();
                }
            }
        }
        D0((com.tencent.mm.ui.MMFragmentActivity) context, new td2.c() { // from class: com.tencent.mm.plugin.finder.video.FinderVideoCore$onInitialize$4

            /* renamed from: d, reason: collision with root package name */
            public boolean f130693d;

            @Override // td2.c
            public void onCreate(androidx.lifecycle.y var1) {
                kotlin.jvm.internal.o.g(var1, "var1");
            }

            @Override // td2.c
            public void onDestroy(androidx.lifecycle.y var1) {
                kotlin.jvm.internal.o.g(var1, "var1");
                com.tencent.mm.app.w wVar = com.tencent.mm.app.w.INSTANCE;
                cw2.f8 f8Var = cw2.f8.this;
                wVar.p(f8Var);
                f8Var.H0().O6();
                com.tencent.mm.plugin.finder.video.FinderVideoCore$finderSeekEventListener$1 finderVideoCore$finderSeekEventListener$1 = f8Var.A;
                if (finderVideoCore$finderSeekEventListener$1 != null) {
                    finderVideoCore$finderSeekEventListener$1.dead();
                }
                com.tencent.mm.sdk.event.IListener iListener2 = f8Var.f223705p;
                if (iListener2 != null) {
                    iListener2.dead();
                }
                f8Var.i();
                com.tencent.mars.xlog.Log.i("FinderVideoCore", "finderSeekEventListener?.dead() " + f8Var.hashCode());
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
            @Override // td2.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onPause(androidx.lifecycle.y r7) {
                /*
                    Method dump skipped, instructions count: 255
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.video.FinderVideoCore$onInitialize$4.onPause(androidx.lifecycle.y):void");
            }

            /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
            
                if ((r0.f129826v == 1) == true) goto L15;
             */
            @Override // td2.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onResume(androidx.lifecycle.y r6) {
                /*
                    r5 = this;
                    java.lang.String r0 = "var1"
                    kotlin.jvm.internal.o.g(r6, r0)
                    androidx.appcompat.app.AppCompatActivity r6 = r2
                    r0 = r6
                    com.tencent.mm.ui.MMFragmentActivity r0 = (com.tencent.mm.ui.MMFragmentActivity) r0
                    cw2.f8 r1 = cw2.f8.this
                    r1.getClass()
                    boolean r2 = r0 instanceof com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI
                    r3 = 0
                    if (r2 == 0) goto L17
                    com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI r0 = (com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI) r0
                    goto L18
                L17:
                    r0 = r3
                L18:
                    r2 = 0
                    if (r0 == 0) goto L26
                    int r0 = r0.f129826v
                    r4 = 1
                    if (r0 != r4) goto L22
                    r0 = r4
                    goto L23
                L22:
                    r0 = r2
                L23:
                    if (r0 != r4) goto L26
                    goto L27
                L26:
                    r4 = r2
                L27:
                    if (r4 == 0) goto L2a
                    return
                L2a:
                    boolean r0 = r1.f223712w
                    if (r0 == 0) goto L44
                    r1.E0()
                    r1.Z()
                    r5.f130693d = r2
                    com.tencent.mm.plugin.finder.viewmodel.component.nb0 r0 = r1.f223700h
                    com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler r0 = (com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) r0
                    r0.f7(r6)
                    uo2.v r6 = r1.H0()
                    r6.T6()
                L44:
                    com.tencent.mm.sdk.event.IListener r6 = r1.f223714y
                    java.lang.String r0 = "screenShotEvent"
                    if (r6 == 0) goto L59
                    r6.dead()
                    com.tencent.mm.sdk.event.IListener r6 = r1.f223714y
                    if (r6 == 0) goto L55
                    r6.alive()
                    return
                L55:
                    kotlin.jvm.internal.o.o(r0)
                    throw r3
                L59:
                    kotlin.jvm.internal.o.o(r0)
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.video.FinderVideoCore$onInitialize$4.onResume(androidx.lifecycle.y):void");
            }

            @Override // td2.c
            public void onStart(androidx.lifecycle.y var1) {
                kotlin.jvm.internal.o.g(var1, "var1");
            }

            @Override // td2.c
            public void onStop(androidx.lifecycle.y var1) {
                kotlin.jvm.internal.o.g(var1, "var1");
                boolean z19 = this.f130693d;
                cw2.f8 f8Var = cw2.f8.this;
                if (z19) {
                    com.tencent.mars.xlog.Log.i("FinderVideoCore", f8Var.F0() + " onStop hasBlockPauseAction true, pause focus video again");
                    ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) f8Var.f223700h).c7(context);
                    f8Var.H0().S6();
                }
                f8Var.i();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    @Override // cw2.z9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Z() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.f8.Z():void");
    }

    @Override // cw2.z9
    public void c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) this.f223700h).c7(context);
        H0().S6();
        android.app.Activity activity = (android.app.Activity) context;
        pf5.z zVar = pf5.z.f353948a;
        if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (!((com.tencent.mm.plugin.finder.viewmodel.component.gg) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class)).f134514p) {
            com.tencent.mm.plugin.finder.viewmodel.component.gg.f134504z = false;
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "resumeFromClickFloatBallAndBack:false");
        }
        com.tencent.mm.sdk.event.IListener iListener = this.f223714y;
        if (iListener != null) {
            iListener.dead();
        } else {
            kotlin.jvm.internal.o.o("screenShotEvent");
            throw null;
        }
    }

    @Override // cw2.z9
    public void g(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        E0();
        Z();
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) this.f223700h).f7(context);
        H0().T6();
        com.tencent.mm.sdk.event.IListener iListener = this.f223714y;
        if (iListener == null) {
            kotlin.jvm.internal.o.o("screenShotEvent");
            throw null;
        }
        iListener.dead();
        com.tencent.mm.sdk.event.IListener iListener2 = this.f223714y;
        if (iListener2 != null) {
            iListener2.alive();
        } else {
            kotlin.jvm.internal.o.o("screenShotEvent");
            throw null;
        }
    }

    @Override // cw2.z9
    public void i() {
        f25.m0 m0Var = this.f223706q;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
    }

    @Override // cw2.z9
    public void j0() {
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) this.f223700h).a7(cw2.d8.f223653d);
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) this.f223700h).c7(null);
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
    }

    @Override // cw2.z9
    public dw2.c0 v() {
        return this.f223703n;
    }

    public /* synthetic */ f8(int i17, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? -1 : i17);
    }
}
