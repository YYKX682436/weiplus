package com.tencent.mm.plugin.finder.viewmodel.teenmode;

/* loaded from: classes10.dex */
public final class FinderTeenModeLimitVM extends pf5.o0 implements com.tencent.mm.app.t2, iz2.c {

    /* renamed from: i, reason: collision with root package name */
    public long f136735i;

    /* renamed from: m, reason: collision with root package name */
    public long f136736m;

    /* renamed from: n, reason: collision with root package name */
    public long f136737n;

    /* renamed from: o, reason: collision with root package name */
    public int f136738o;

    /* renamed from: p, reason: collision with root package name */
    public r45.kz2 f136739p;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f136741r;

    /* renamed from: e, reason: collision with root package name */
    public final hy2.o f136731e = new hy2.o();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f136732f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f136733g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public boolean f136734h = true;

    /* renamed from: q, reason: collision with root package name */
    public final hy2.h f136740q = new hy2.h(this);

    public FinderTeenModeLimitVM() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f136741r = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AgreeAuthorizationChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM$authorAgreeChangeListener$1
            {
                this.__eventId = 1690927405;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.AgreeAuthorizationChangeEvent agreeAuthorizationChangeEvent) {
                com.tencent.mm.autogen.events.AgreeAuthorizationChangeEvent event = agreeAuthorizationChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM finderTeenModeLimitVM = com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM.this;
                if (finderTeenModeLimitVM.Q6() && ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Dk() && ((uh4.c0) i95.n0.c(uh4.c0.class)).df() != null) {
                    int i17 = event.f53973g.f7285a;
                    if (i17 == 6 || i17 == 11) {
                        finderTeenModeLimitVM.U6(true, "AgreeAuthorization");
                    } else if (i17 == 5 || i17 == 10) {
                        finderTeenModeLimitVM.U6(false, "AgreeAuthorization");
                    }
                }
                return true;
            }
        };
    }

    public static final boolean N6(com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM finderTeenModeLimitVM, android.app.Activity activity) {
        finderTeenModeLimitVM.getClass();
        boolean z17 = (!(activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI) || (activity instanceof com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI) || (activity instanceof com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeTipsUI)) ? false : true;
        boolean contains = finderTeenModeLimitVM.f136733g.contains(activity.getClass());
        com.tencent.mars.xlog.Log.i("FinderTeenModeLimitVM", "isFinderCountPage: isFinderUI=" + z17 + ", isExtraUi=" + contains + ", activity=" + activity.getClass().getSimpleName());
        return z17 || contains;
    }

    public r45.kz2 O6() {
        if (this.f136739p == null) {
            com.tencent.mars.xlog.Log.i("FinderTeenModeLimitVM", "getTeenModeManageInfo: parse from config storage");
            try {
                r45.kz2 kz2Var = new r45.kz2();
                java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_SYNC_TEEN_MODE_MANAGE_CONFIG_STRING_SYNC, "");
                kotlin.jvm.internal.o.d(v17);
                if (v17.length() > 0) {
                    kz2Var.parseFrom(com.tencent.mm.sdk.platformtools.t8.h(v17));
                    this.f136739p = kz2Var;
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("FinderTeenModeLimitVM", th6, "getTeenModeManageInfo: parse teen mode config fail, ", new java.lang.Object[0]);
            }
        }
        r45.kz2 kz2Var2 = this.f136739p;
        return kz2Var2 == null ? new r45.kz2() : kz2Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r4 < 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int P6() {
        /*
            r7 = this;
            r45.kz2 r0 = r7.O6()
            r1 = 1
            int r2 = r0.getInteger(r1)
            r3 = 0
            int r0 = r0.getInteger(r3)
            if (r0 <= 0) goto L4e
            if (r2 <= 0) goto L4e
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            r5 = 5
            r4.set(r5, r1)
            java.util.Calendar r6 = java.util.Calendar.getInstance()
            r6.set(r5, r1)
            r6.set(r1, r0)
            r0 = 2
            r6.set(r0, r2)
            int r2 = r4.get(r1)
            int r5 = r6.get(r1)
            int r2 = r2 - r5
            int r4 = r4.get(r0)
            int r0 = r6.get(r0)
            int r4 = r4 - r0
            r0 = 100
            if (r2 < 0) goto L41
            if (r2 >= r0) goto L41
            goto L42
        L41:
            r1 = r3
        L42:
            if (r1 == 0) goto L49
            if (r4 >= 0) goto L4f
        L46:
            int r2 = r2 + (-1)
            goto L4f
        L49:
            if (r2 != r0) goto L4e
            if (r4 >= 0) goto L4e
            goto L46
        L4e:
            r2 = -1
        L4f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM.P6():int");
    }

    public final boolean Q6() {
        boolean z17;
        boolean z18;
        boolean z19;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        if (z18 && ((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127683eg).getValue()).r()).booleanValue()) {
            return true;
        }
        if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderOpenCheckAntiAddictSwitch", 1) != 1) {
            if (!(((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.V7).getValue()).r()).intValue() == 1)) {
                z19 = false;
                boolean wi6 = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).wi();
                com.tencent.mars.xlog.Log.i("FinderTeenModeLimitVM", "isEnableLimit switch:" + z19 + ", teenModeAndViewAll:" + wi6);
                return z19 && wi6;
            }
        }
        z19 = true;
        boolean wi62 = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).wi();
        com.tencent.mars.xlog.Log.i("FinderTeenModeLimitVM", "isEnableLimit switch:" + z19 + ", teenModeAndViewAll:" + wi62);
        if (z19) {
            return false;
        }
    }

    public final boolean R6() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(c01.id.c());
        int i17 = calendar.get(11);
        hy2.g gVar = hy2.g.f286058a;
        int b17 = gVar.b();
        int a17 = gVar.a();
        int i18 = a17 >= 1 ? a17 - 1 : 0;
        com.tencent.mars.xlog.Log.i("FinderTeenModeLimitVM", "isInDayHour22_6 now hour:" + i17 + ", start:" + b17 + ", end:" + a17 + ", realEnd:" + i18);
        if (!(b17 <= i17 && i17 < 25)) {
            if (!(i17 >= 0 && i17 <= i18)) {
                return false;
            }
        }
        return true;
    }

    public final void S6(boolean z17) {
        if (this.f136734h) {
            ((ku5.t0) ku5.t0.f312615d).B(new hy2.i(this, z17));
        }
    }

    public void T6() {
        if (this.f136736m > 0) {
            this.f136735i += c01.id.c() - this.f136736m;
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_TIME_LONG_SYNC, java.lang.Long.valueOf(this.f136735i));
            this.f136736m = c01.id.c();
        }
    }

    public final void U6(boolean z17, java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i("FinderTeenModeLimitVM", "startEnjoyFinder: source=" + source + ", isCurFew=" + z17);
        this.f136736m = c01.id.c();
        if (z17) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_IS_CURFEW_CLOSE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_CURFEW_CLOSE_TIME_LONG_SYNC, java.lang.Long.valueOf(this.f136736m));
        }
        this.f136735i = 0L;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_TIME_LONG_SYNC, java.lang.Long.valueOf(this.f136735i));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LAST_SHOW_TEENAGER_REST_TIME_LONG_SYNC, 0L);
    }

    public final void V6() {
        hy2.o oVar = this.f136731e;
        java.util.concurrent.Future future = oVar.f286069a;
        boolean z17 = false;
        if (future != null) {
            future.cancel(false);
            oVar.f286069a = null;
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("FinderTeenModeLimitVM", "stopCheckTeenModeTimer enjoyFinderMs" + this.f136735i);
        }
    }

    public void W6(r45.kz2 info, java.lang.String source) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(source, "source");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateTeenModeManageConfig: source=");
        sb6.append(source);
        sb6.append(", size=");
        sb6.append(info.getList(2).size());
        sb6.append(", birthY=");
        sb6.append(info.getInteger(0));
        sb6.append(", birthM=");
        sb6.append(info.getInteger(1));
        sb6.append(", visible_info_flag=");
        long j17 = info.getLong(3);
        r26.a.a(2);
        java.lang.String l17 = java.lang.Long.toString(j17, 2);
        kotlin.jvm.internal.o.f(l17, "toString(...)");
        sb6.append(l17);
        com.tencent.mars.xlog.Log.i("FinderTeenModeLimitVM", sb6.toString());
        this.f136739p = info;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_SYNC_TEEN_MODE_MANAGE_CONFIG_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.l(info.toByteArray()));
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("FinderTeenModeLimitVM", "FinderTeenModeLimitVM onAppBackground");
        V6();
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
    }
}
