package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.e f121675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121676e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f121677f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0 f121678g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f121679h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x f121680i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f121681m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f121682n;

    public g0(vp2.e eVar, in5.s0 s0Var, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0 m0Var, kotlin.jvm.internal.h0 h0Var2, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x xVar, long j17, long j18) {
        this.f121675d = eVar;
        this.f121676e = s0Var;
        this.f121677f = h0Var;
        this.f121678g = m0Var;
        this.f121679h = h0Var2;
        this.f121680i = xVar;
        this.f121681m = j17;
        this.f121682n = j18;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e A[LOOP:0: B:2:0x000a->B:12:0x003e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042 A[EDGE_INSN: B:13:0x0042->B:14:0x0042 BREAK  A[LOOP:0: B:2:0x000a->B:12:0x003e], SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            vp2.e r0 = r11.f121675d
            java.util.ArrayList r0 = r0.f438915e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        La:
            boolean r3 = r0.hasNext()
            r4 = -1
            long r5 = r11.f121681m
            r7 = 1
            if (r3 == 0) goto L41
            java.lang.Object r3 = r0.next()
            so2.j5 r3 = (so2.j5) r3
            boolean r8 = r3 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed
            if (r8 == 0) goto L3a
            zl2.q4 r8 = zl2.q4.f473933a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r3
            boolean r8 = r8.C(r3)
            if (r8 == 0) goto L3a
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            long r8 = r3.getId()
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 != 0) goto L3a
            r3 = r7
            goto L3b
        L3a:
            r3 = r1
        L3b:
            if (r3 == 0) goto L3e
            goto L42
        L3e:
            int r2 = r2 + 1
            goto La
        L41:
            r2 = r4
        L42:
            if (r2 == r4) goto Lce
            in5.s0 r0 = r11.f121676e
            android.content.Context r0 = r0.f293121e
            boolean r3 = r0 instanceof com.tencent.mm.ui.MMActivity
            r4 = 0
            if (r3 == 0) goto L50
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.mm.ui.MMActivity) r0
            goto L51
        L50:
            r0 = r4
        L51:
            if (r0 == 0) goto Laa
            pf5.z r3 = pf5.z.f353948a
            pf5.v r0 = r3.a(r0)
            java.lang.Class<rq2.w> r3 = rq2.w.class
            androidx.lifecycle.c1 r0 = r0.a(r3)
            java.lang.String r3 = "get(...)"
            kotlin.jvm.internal.o.f(r0, r3)
            rq2.w r0 = (rq2.w) r0
            cl0.g r3 = new cl0.g
            r3.<init>()
            long r8 = r11.f121682n
            java.lang.String r8 = pm0.v.u(r8)
            java.lang.String r9 = "liveid"
            r3.s(r9, r8)
            java.lang.String r5 = pm0.v.u(r5)
            java.lang.String r6 = "feedid"
            r3.s(r6, r5)
            java.lang.String r5 = "card_index"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r3.s(r5, r6)
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0 r5 = r11.f121678g
            r45.qt2 r5 = r5.f121799i
            if (r5 == 0) goto L92
            java.lang.String r4 = r5.getString(r7)
        L92:
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "toString(...)"
            kotlin.jvm.internal.o.f(r3, r5)
            java.lang.String r5 = ","
            java.lang.String r6 = ";"
            java.lang.String r1 = r26.i0.t(r3, r5, r6, r1)
            java.lang.String r3 = ""
            java.lang.String r5 = "main_page_end_live_card_recall"
            r0.P6(r3, r4, r5, r1)
        Laa:
            kotlin.jvm.internal.h0 r0 = r11.f121677f
            java.lang.Object r1 = r0.f310123d
            up2.c r1 = (up2.c) r1
            int r1 = r1.a0()
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0 r3 = r11.f121678g
            vp2.e r4 = r11.f121675d
            java.lang.Object r0 = r0.f310123d
            r6 = r0
            androidx.recyclerview.widget.f2 r6 = (androidx.recyclerview.widget.f2) r6
            int r7 = r2 + r1
            kotlin.jvm.internal.h0 r0 = r11.f121679h
            java.lang.Object r0 = r0.f310123d
            r8 = r0
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x r10 = r11.f121680i
            gp2.l0 r9 = r10.f122016f
            r5 = r2
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0.n(r3, r4, r5, r6, r7, r8, r9, r10)
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.g0.run():void");
    }
}
