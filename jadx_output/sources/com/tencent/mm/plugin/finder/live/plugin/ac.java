package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ac extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f111846p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f111847q;

    /* renamed from: r, reason: collision with root package name */
    public im5.c f111848r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f111849s;

    /* renamed from: t, reason: collision with root package name */
    public final mm2.e0 f111850t;

    /* renamed from: u, reason: collision with root package name */
    public long f111851u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.concurrent.ConcurrentHashMap f111852v;

    /* renamed from: w, reason: collision with root package name */
    public final androidx.lifecycle.k0 f111853w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ac(android.view.ViewGroup r3, qo0.c r4, com.tencent.mm.ui.MMActivity r5, r45.qt2 r6, int r7, kotlin.jvm.internal.i r8) {
        /*
            r2 = this;
            r7 = r7 & 8
            if (r7 == 0) goto L5
            r6 = 0
        L5:
            java.lang.String r7 = "root"
            kotlin.jvm.internal.o.g(r3, r7)
            java.lang.String r7 = "statusMonitor"
            kotlin.jvm.internal.o.g(r4, r7)
            java.lang.String r7 = "activity"
            kotlin.jvm.internal.o.g(r5, r7)
            r2.<init>(r3, r4, r6)
            r2.f111846p = r4
            r2.f111847q = r5
            im5.c r3 = new im5.c
            r3.<init>()
            r2.f111848r = r3
            java.lang.String r3 = ""
            r2.f111849s = r3
            java.lang.Class<mm2.e0> r4 = mm2.e0.class
            androidx.lifecycle.c1 r4 = r2.P0(r4)
            mm2.e0 r4 = (mm2.e0) r4
            r2.f111850t = r4
            java.util.concurrent.ConcurrentHashMap r4 = new java.util.concurrent.ConcurrentHashMap
            r4.<init>()
            r2.f111852v = r4
            com.tencent.mm.plugin.finder.live.plugin.vb r4 = new com.tencent.mm.plugin.finder.live.plugin.vb
            r4.<init>(r2)
            r2.f111853w = r4
            android.content.Intent r4 = r5.getIntent()
            java.lang.String r6 = "KEY_ENTER_LIVE_PARAM_BOX_GROUP_TO_LIVEID"
            r7 = 0
            long r6 = r4.getLongExtra(r6, r7)
            java.lang.Class<mm2.e1> r4 = mm2.e1.class
            androidx.lifecycle.c1 r4 = r2.P0(r4)
            mm2.e1 r4 = (mm2.e1) r4
            r45.nw1 r4 = r4.f328988r
            r8 = 0
            long r0 = r4.getLong(r8)
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 != 0) goto L7b
            java.lang.String r4 = "Finder.FinderLiveBoxPlugin"
            java.lang.String r6 = "hit targetId, consume fromGroupId"
            com.tencent.mars.xlog.Log.i(r4, r6)
            android.content.Intent r4 = r5.getIntent()
            java.lang.String r6 = "KEY_ENTER_LIVE_PARAM_BOX_GROUP_ID"
            java.lang.String r4 = r4.getStringExtra(r6)
            if (r4 != 0) goto L71
            goto L72
        L71:
            r3 = r4
        L72:
            r2.f111849s = r3
            android.content.Intent r3 = r5.getIntent()
            r3.removeExtra(r6)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ac.<init>(android.view.ViewGroup, qo0.c, com.tencent.mm.ui.MMActivity, r45.qt2, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        if (com.tencent.mm.plugin.finder.live.plugin.ub.f114546a[status.ordinal()] == 1) {
            com.tencent.mm.plugin.finder.assist.o0 o0Var = com.tencent.mm.plugin.finder.assist.o0.f102420a;
            kotlin.jvm.internal.o.g(S0(), "<this>");
            boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f3486t).getValue()).r()).intValue() == 1;
            com.tencent.mars.xlog.Log.i("Finder.BoxCommon", "local enable:" + z17);
            if (z17) {
                boolean a17 = o0Var.a(S0());
                if (a17) {
                    long j17 = ((mm2.e1) P0(mm2.e1.class)).f328988r.getLong(0);
                    this.f111851u = j17;
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveBoxPlugin", "startBox ".concat(pm0.v.u(j17)));
                    com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.wb(this, bundle, null), 3, null);
                }
                com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.yb(this, a17, null), 3, null);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        this.f111848r.dead();
        this.f111852v = new java.util.concurrent.ConcurrentHashMap();
        this.f111849s = "";
        super.O0();
        this.f111851u = 0L;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        this.f111848r = new im5.c();
        super.z0();
    }
}
