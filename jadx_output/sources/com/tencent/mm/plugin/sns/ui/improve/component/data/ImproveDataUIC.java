package com.tencent.mm.plugin.sns.ui.improve.component.data;

/* loaded from: classes4.dex */
public final class ImproveDataUIC extends com.tencent.mm.plugin.sns.ui.improve.component.j {

    /* renamed from: r, reason: collision with root package name */
    public static final lc4.d f168761r = new lc4.d(null);

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.ArrayList f168762s = new java.util.ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.ArrayList f168763t = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.ArrayList f168764u = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public static boolean f168765v;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f168766d;

    /* renamed from: e, reason: collision with root package name */
    public final lc4.d0 f168767e;

    /* renamed from: f, reason: collision with root package name */
    public final lc4.a f168768f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository f168769g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f168770h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f168771i;

    /* renamed from: m, reason: collision with root package name */
    public long f168772m;

    /* renamed from: n, reason: collision with root package name */
    public kotlinx.coroutines.r2 f168773n;

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.r2 f168774o;

    /* renamed from: p, reason: collision with root package name */
    public kotlinx.coroutines.r2 f168775p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$commentUpdateListener$1 f168776q;

    static {
        java.lang.String str = gm0.j1.u().h() + "SnsMicroMsg.db";
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DataUIC", "origin path:" + str + " size:" + com.tencent.mm.vfs.w6.k(str));
        com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
        Fj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDb", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDb", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        jm0.i iVar = jm0.k.f300269h;
        ((zc4.h) iVar.a(zc4.h.class)).f300273g = Fj.f165994d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DataUIC", "init db finish result:" + jz5.f0.f302826a);
        ((zc4.g) ((zc4.h) iVar.a(zc4.h.class)).P6(zc4.g.class)).Q6(com.tencent.mm.app.a0.f53288d, lc4.c.f317951d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$commentUpdateListener$1] */
    public ImproveDataUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f168766d = jz5.h.b(new lc4.k(this, activity));
        this.f168767e = new lc4.d0(S6());
        this.f168768f = new lc4.a();
        this.f168769g = new com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository(activity);
        this.f168770h = jz5.h.b(lc4.z.f318004d);
        this.f168771i = jz5.h.b(new lc4.t(this));
        this.f168772m = java.lang.System.currentTimeMillis();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f168776q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsCommentUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$commentUpdateListener$1
            {
                this.__eventId = -1499688230;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsCommentUpdateEvent snsCommentUpdateEvent) {
                boolean z17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$commentUpdateListener$1");
                com.tencent.mm.autogen.events.SnsCommentUpdateEvent event = snsCommentUpdateEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$commentUpdateListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.String str = event.f54805g.f7463a;
                if (str == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$commentUpdateListener$1");
                    z17 = true;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DataUIC", "onSnsCommentUpdateEvent, snsId=".concat(str));
                    com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC improveDataUIC = com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.this;
                    kotlinx.coroutines.l.d(improveDataUIC.getMainScope(), null, null, new lc4.i(str, improveDataUIC, null), 3, null);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$commentUpdateListener$1");
                    z17 = false;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$commentUpdateListener$1");
                return z17;
            }
        };
    }

    public static final /* synthetic */ java.util.ArrayList O6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCacheList$cp", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        java.util.ArrayList arrayList = f168763t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCacheList$cp", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        return arrayList;
    }

    public static final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC P6(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC improveDataUIC) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMainUIC", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC T6 = improveDataUIC.T6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMainUIC", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        return T6;
    }

    public static final /* synthetic */ java.util.ArrayList Q6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getResumeData$cp", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        java.util.ArrayList arrayList = f168762s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getResumeData$cp", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        return arrayList;
    }

    public final boolean R6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkListHasFault", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        boolean z17 = !f168763t.isEmpty();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkListHasFault", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        return z17;
    }

    public final com.tencent.mm.plugin.mvvmlist.MvvmList S6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLiveList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = (com.tencent.mm.plugin.mvvmlist.MvvmList) this.f168766d.getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLiveList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        return mvvmList;
    }

    public final com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC T6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMainUIC", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC = (com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC) ((jz5.n) this.f168771i).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainUIC", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        return improveMainUIC;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x021d A[EDGE_INSN: B:76:0x021d->B:77:0x021d BREAK  A[LOOP:3: B:65:0x01f1->B:84:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[LOOP:3: B:65:0x01f1->B:84:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U6(o75.c r25) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.U6(o75.c):void");
    }

    public final boolean V6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasMoreData", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository snsInfoImproveOnlineRepository = this.f168769g;
        snsInfoImproveOnlineRepository.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasMoreData", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        boolean z17 = snsInfoImproveOnlineRepository.f169110i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasMoreData", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasMoreData", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        return z17;
    }

    public final boolean W6(xc4.p pVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSelfPrivateFeed", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        java.lang.String userName = pVar.getUserName();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelfName", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        java.lang.Object value = ((jz5.n) this.f168770h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelfName", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        if (kotlin.jvm.internal.o.b(userName, (java.lang.String) value) && pVar.getPravited() == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSelfPrivateFeed", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSelfPrivateFeed", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X6(kotlin.coroutines.Continuation r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "loadMore"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            boolean r4 = r1 instanceof lc4.p
            if (r4 == 0) goto L1f
            r4 = r1
            lc4.p r4 = (lc4.p) r4
            int r5 = r4.f317980g
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1f
            int r5 = r5 - r6
            r4.f317980g = r5
            goto L24
        L1f:
            lc4.p r4 = new lc4.p
            r4.<init>(r0, r1)
        L24:
            java.lang.Object r1 = r4.f317978e
            pz5.a r5 = pz5.a.f359186d
            int r6 = r4.f317980g
            jz5.f0 r7 = jz5.f0.f302826a
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L4c
            if (r6 == r9) goto L44
            if (r6 != r8) goto L39
            kotlin.ResultKt.throwOnFailure(r1)
            goto La6
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r4)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            throw r1
        L44:
            java.lang.Object r6 = r4.f317977d
            com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC r6 = (com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC) r6
            kotlin.ResultKt.throwOnFailure(r1)
            goto L62
        L4c:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.r2 r1 = r0.f168773n
            if (r1 == 0) goto L61
            r4.f317977d = r0
            r4.f317980g = r9
            java.lang.Object r1 = kotlinx.coroutines.v2.d(r1, r4)
            if (r1 != r5) goto L61
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r5
        L61:
            r6 = r0
        L62:
            long r10 = r6.f168772m
            kotlinx.coroutines.r2 r1 = r6.f168774o
            r15 = 0
            if (r1 == 0) goto L80
            r12 = 0
            if (r1 == 0) goto L73
            boolean r1 = r1.A()
            if (r1 != r9) goto L73
            goto L74
        L73:
            r9 = r12
        L74:
            if (r9 == 0) goto L77
            goto L80
        L77:
            java.lang.String r1 = "MicroMsg.Improve.DataUIC"
            java.lang.String r9 = "currentJob is running,jump loadMore"
            com.tencent.mars.xlog.Log.i(r1, r9)
            r1 = r15
            goto L94
        L80:
            kotlinx.coroutines.p0 r1 = kotlinx.coroutines.q1.f310568a
            r12 = 0
            lc4.s r13 = new lc4.s
            r13.<init>(r6, r10, r15)
            r14 = 2
            r9 = 0
            r10 = r6
            r11 = r1
            r1 = r15
            r15 = r9
            kotlinx.coroutines.r2 r9 = pf5.e.launch$default(r10, r11, r12, r13, r14, r15)
            r6.f168774o = r9
        L94:
            kotlinx.coroutines.r2 r6 = r6.f168774o
            if (r6 == 0) goto Laa
            r4.f317977d = r1
            r4.f317980g = r8
            java.lang.Object r1 = r6.C(r4)
            if (r1 != r5) goto La6
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r5
        La6:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r7
        Laa:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.X6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DataUIC", "onCreate");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupLiveList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        S6().f152071u.observe(getActivity(), new lc4.a0(this));
        ((ku5.t0) ku5.t0.f312615d).A("cache_delete_tag");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupLiveList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("observeDBChangeEvent", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
        }
        ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).Q6(getActivity(), new lc4.u(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("observeDBChangeEvent", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        f168765v = false;
        getOverScrollView().setRefreshCallback(new lc4.v(this));
        if (!resumePage()) {
            getOverScrollView().a(1);
        }
        lc4.d0 d0Var = this.f168767e;
        d0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.UnreadLoader", "PRELOAD_MAX_COUNT:" + d0Var.f317956e);
        gm0.j1.n().f273288b.a(211, d0Var);
        oc4.g gVar = com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC.f169009s;
        if (gVar.a()) {
            d0Var.c(gVar.b().a());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader");
        alive();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        java.lang.Object obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        kotlinx.coroutines.r2 r2Var = this.f168773n;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.r2 r2Var2 = this.f168774o;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        kotlinx.coroutines.r2 r2Var3 = this.f168775p;
        if (r2Var3 != null) {
            kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
        }
        java.util.ArrayList arrayList = S6().f152065o;
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (!((zc4.b) obj).n().isAd()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        zc4.b bVar = (zc4.b) obj;
        xc4.p n17 = bVar != null ? bVar.n() : null;
        java.util.ArrayList arrayList2 = f168762s;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        i64.u1.a(207, arrayList.size());
        f168765v = true;
        lc4.d0 d0Var = this.f168767e;
        d0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader");
        d0Var.f317958g = -1L;
        gm0.j1.n().f273288b.q(211, d0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader");
        int i17 = 0;
        for (java.lang.Object obj2 : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (((zc4.b) obj2).n().isAd()) {
                i64.u1.a(29, i17);
            }
            i17 = i18;
        }
        com.tencent.mm.plugin.sns.ui.f8 qj6 = com.tencent.mm.plugin.sns.model.l4.qj();
        java.lang.String stringSeq = n17 != null ? n17.getStringSeq() : null;
        qj6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveUpLimitSeq", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        qj6.f168312b = stringSeq;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveUpLimitSeq", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        com.tencent.mm.plugin.sns.ui.f8 qj7 = com.tencent.mm.plugin.sns.model.l4.qj();
        qj7.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pauseServerInfo", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        com.tencent.mm.plugin.sns.model.d6 Kj = com.tencent.mm.plugin.sns.model.l4.Kj();
        Kj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimeFirstId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        long j17 = Kj.f164153m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeFirstId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        qj7.f168316f = j17;
        com.tencent.mm.plugin.sns.model.d6 Kj2 = com.tencent.mm.plugin.sns.model.l4.Kj();
        Kj2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimeLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        long j18 = Kj2.f164152i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        qj7.f168315e = j18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pauseServerInfo", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        dead();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
    }
}
