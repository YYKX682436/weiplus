package com.tencent.mm.plugin.sns.ui.improve.component.unread;

/* loaded from: classes4.dex */
public final class ImproveUnreadUIC extends com.tencent.mm.plugin.sns.ui.improve.component.j implements com.tencent.mm.modelbase.u0 {

    /* renamed from: s, reason: collision with root package name */
    public static final oc4.g f169009s = new oc4.g(null);

    /* renamed from: t, reason: collision with root package name */
    public static com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC f169010t;

    /* renamed from: d, reason: collision with root package name */
    public wa4.w f169011d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f169012e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f169013f;

    /* renamed from: g, reason: collision with root package name */
    public final oc4.x f169014g;

    /* renamed from: h, reason: collision with root package name */
    public oc4.v f169015h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f169016i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f169017m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f169018n;

    /* renamed from: o, reason: collision with root package name */
    public long f169019o;

    /* renamed from: p, reason: collision with root package name */
    public long f169020p;

    /* renamed from: q, reason: collision with root package name */
    public int f169021q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f169022r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImproveUnreadUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f169012e = com.tencent.mm.sdk.platformtools.o4.L();
        this.f169013f = jz5.h.b(oc4.i.f344344d);
        this.f169014g = new oc4.x(500);
        this.f169016i = new java.util.ArrayList();
        this.f169017m = "";
        this.f169018n = new java.util.HashSet();
        final androidx.lifecycle.y lifecycleOwner = getLifecycleOwner();
        this.f169022r = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsClickUnreadBtnEvent>(lifecycleOwner) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1
            {
                this.__eventId = -1369756755;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsClickUnreadBtnEvent snsClickUnreadBtnEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1");
                com.tencent.mm.autogen.events.SnsClickUnreadBtnEvent event = snsClickUnreadBtnEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC improveUnreadUIC = com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC.this;
                pf5.e.launch$default(improveUnreadUIC, null, null, new oc4.h(improveUnreadUIC, null), 3, null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1");
                return true;
            }
        };
    }

    public static final /* synthetic */ oc4.x O6(com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC improveUnreadUIC) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getFeedMap$p", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        oc4.x xVar = improveUnreadUIC.f169014g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getFeedMap$p", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        return xVar;
    }

    public static final java.lang.String P6(com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC improveUnreadUIC, java.util.ArrayList arrayList, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$listToString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        improveUnreadUIC.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("listToString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb6.append((java.lang.String) it.next());
            sb6.append(str);
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("listToString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$listToString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        return sb7;
    }

    public final boolean Q6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("exposeIntervalEnable", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        long currentTimeMillis = (java.lang.System.currentTimeMillis() / 1000) - this.f169012e.q("Key-Unread-Expose", 0L);
        oc4.r R6 = R6();
        R6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJumpIndicatorExposeInterval", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJumpIndicatorExposeInterval", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        boolean z17 = currentTimeMillis >= R6.f344365h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exposeIntervalEnable", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        return z17;
    }

    public final oc4.r R6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getConfig", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        oc4.r rVar = (oc4.r) ((jz5.n) this.f169013f).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getConfig", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        return rVar;
    }

    public final oc4.v S6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTier", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        oc4.v vVar = this.f169015h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTier", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        return vVar;
    }

    public final void T6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        if (this.f169011d == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            return;
        }
        oc4.x xVar = this.f169014g;
        if (xVar.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        } else if (((java.lang.String) xVar.firstKey()).compareTo(this.f169017m) < 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        } else {
            pf5.e.launch$default(this, getDispatcher(), null, new oc4.n(this, null), 2, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        }
    }

    public final boolean U6(xc4.p pVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("timeCheck", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        if (pVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("timeCheck", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            return false;
        }
        oc4.r R6 = R6();
        R6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJumpMinInterval", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJumpMinInterval", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        if (R6.f344358a <= com.tencent.mm.sdk.platformtools.t8.H1(pVar.getCreateTime())) {
            oc4.r R62 = R6();
            R62.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJumpMaxInterval", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJumpMaxInterval", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
            if (R62.f344359b >= com.tencent.mm.sdk.platformtools.t8.H1(pVar.getCreateTime())) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("timeCheck", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
                return true;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Improve.UnreadUIC", "tier not match for time error");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("timeCheck", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        return false;
    }

    public final boolean V6(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unreadCountCheck", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        long j17 = i17;
        oc4.r R6 = R6();
        R6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJumpMinFeedsCount", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJumpMinFeedsCount", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        if (j17 >= R6.f344360c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unreadCountCheck", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            return true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tier not match for size limit:");
        oc4.r R62 = R6();
        R62.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJumpMinFeedsCount", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJumpMinFeedsCount", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        sb6.append(R62.f344360c);
        sb6.append(" count:");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.e("MicroMsg.Improve.UnreadUIC", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unreadCountCheck", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        return false;
    }

    public final boolean W6(xc4.p pVar) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unreadGapCountCheck", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        if (pVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unreadGapCountCheck", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            return false;
        }
        java.lang.String a17 = pVar.a1();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateFeedsGapCount", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        long j17 = com.tencent.mm.plugin.sns.model.l4.Mj().f164741c;
        com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
        java.lang.String s07 = ca4.z0.s0(j17);
        Fj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFeedsGapCount", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.tencent.mm.plugin.sns.storage.f2.C1();
        if (Fj.b3(s07)) {
            str = "select snsId from SnsInfo  where  (sourceType & 2 != 0 )  AND " + Fj.u1(s07);
        } else {
            str = "select snsId from SnsInfo  where  (sourceType & 2 != 0 ) ";
        }
        if (Fj.b3(a17)) {
            str = str + " AND " + Fj.o1(a17);
        }
        int count = Fj.f165994d.B(str + com.tencent.mm.plugin.sns.storage.f2.f165982o, null).getCount();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFeedsGapCount", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateFeedsGapCount", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        long j18 = (long) count;
        oc4.r R6 = R6();
        R6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJumpMinFeedsGapCount", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJumpMinFeedsGapCount", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        if (j18 >= R6.f344361d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unreadGapCountCheck", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            return true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tier not match for gap count:");
        oc4.r R62 = R6();
        R62.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJumpMinFeedsGapCount", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJumpMinFeedsGapCount", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        sb6.append(R62.f344361d);
        com.tencent.mars.xlog.Log.e("MicroMsg.Improve.UnreadUIC", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unreadGapCountCheck", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        return false;
    }

    public final void X6(java.util.LinkedList linkedList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFinderTier", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        if (this.f169015h != null) {
            rc4.e eVar = rc4.e.f394136a;
            eVar.e("1:优先级低于未读跳转曝光");
            eVar.a(1);
        } else {
            long j17 = com.tencent.mm.plugin.sns.model.l4.Mj().f164741c;
            rc4.e eVar2 = rc4.e.f394136a;
            if (linkedList == null) {
                linkedList = new java.util.LinkedList();
            }
            eVar2.h(linkedList, j17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFinderTier", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x007d, code lost:
    
        if (r2 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r5 == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y6() {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC.Y6():void");
    }

    public final void Z6(oc4.v vVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateTier", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        this.f169015h = vVar;
        if (vVar != null) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC improveDataUIC = (com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.class);
            java.util.ArrayList feedList = vVar.a();
            improveDataUIC.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preloadUnreadData", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            kotlin.jvm.internal.o.g(feedList, "feedList");
            improveDataUIC.f168767e.c(feedList);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadUnreadData", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.UnreadUIC", "updateTier:" + vVar);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        pf5.e.launch$default(this, kotlinx.coroutines.internal.b0.f310484a, null, new oc4.q(this, vVar, null), 2, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateTier", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
    }

    public final boolean a7(java.util.ArrayList arrayList) {
        xc4.p c17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("wsPercentCheck", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            oc4.s sVar = (oc4.s) this.f169014g.get((java.lang.String) it.next());
            if (sVar != null && (c17 = sVar.c()) != null && c17.isWsFold()) {
                i17++;
            }
        }
        long size = (i17 * 100) / arrayList.size();
        oc4.r R6 = R6();
        R6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJumpNotWsPercent", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJumpNotWsPercent", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        boolean z17 = size <= R6.f344362e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("wsPercentCheck", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        return z17;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.UnreadUIC", "unread config:" + R6());
        f169010t = this;
        this.f169022r.alive();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDebugPrintInfo", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.class)).setAvatarLongClickListener(new oc4.p(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDebugPrintInfo", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("restoreData", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        pf5.e.launch$default(this, getDispatcher(), null, new oc4.o(this, null), 2, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restoreData", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        gm0.j1.n().f273288b.a(211, this);
        gm0.j1.n().f273288b.a(5987, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        T6();
        f169010t = null;
        this.f169022r.dead();
        gm0.j1.n().f273288b.q(211, this);
        gm0.j1.n().f273288b.q(5987, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        pf5.e.launch$default(this, getDispatcher(), null, new oc4.j(m1Var, this, null), 2, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.tencent.mm.plugin.sns.ui.improve.component.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r7, com.tencent.mm.plugin.sns.ui.improve.component.x1 r8, int r9, kotlin.coroutines.Continuation r10) {
        /*
            r6 = this;
            java.lang.String r0 = "onScrollStateChanged"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r10 instanceof oc4.k
            if (r2 == 0) goto L1b
            r2 = r10
            oc4.k r2 = (oc4.k) r2
            int r3 = r2.f344350g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f344350g = r3
            goto L20
        L1b:
            oc4.k r2 = new oc4.k
            r2.<init>(r6, r10)
        L20:
            java.lang.Object r10 = r2.f344348e
            pz5.a r3 = pz5.a.f359186d
            int r4 = r2.f344350g
            r5 = 1
            if (r4 == 0) goto L3e
            if (r4 != r5) goto L33
            java.lang.Object r7 = r2.f344347d
            com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC r7 = (com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC) r7
            kotlin.ResultKt.throwOnFailure(r10)
            goto L50
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r7
        L3e:
            kotlin.ResultKt.throwOnFailure(r10)
            r2.f344347d = r6
            r2.f344350g = r5
            java.lang.Object r7 = super.onScrollStateChanged(r7, r8, r9, r2)
            if (r7 != r3) goto L4f
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L4f:
            r7 = r6
        L50:
            r7.Y6()
            jz5.f0 r7 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, com.tencent.mm.plugin.sns.ui.improve.component.x1, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.component.j
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i17, i18);
        pf5.e.launch$default(this, getDispatcher(), null, new oc4.l(this, null), 2, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        super.onStop();
        pf5.e.launch$default(this, getDispatcher(), null, new oc4.m(this, null), 2, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
    }
}
