package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class wn0 extends com.tencent.mm.plugin.finder.live.plugin.l implements kn2.d, kn2.c {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f114973p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f114974q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f114975r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f114976s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f114977t;

    /* renamed from: u, reason: collision with root package name */
    public qs5.s f114978u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f114979v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f114980w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap.KeySetView f114981x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f114973p = statusMonitor;
        this.f114974q = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.an0(root, this));
        this.f114975r = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.qm0(root, this));
        this.f114976s = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.rm0(root, this));
        this.f114978u = qs5.s.f366464d;
        this.f114981x = java.util.concurrent.ConcurrentHashMap.newKeySet();
        if (zl2.r4.f473950a.W1(S0())) {
            return;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        if (dk2.ef.f233380e instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) {
            return;
        }
        A1();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t1(com.tencent.mm.plugin.finder.live.plugin.wn0 r12, kotlin.coroutines.Continuation r13) {
        /*
            r12.getClass()
            boolean r0 = r13 instanceof com.tencent.mm.plugin.finder.live.plugin.tm0
            if (r0 == 0) goto L16
            r0 = r13
            com.tencent.mm.plugin.finder.live.plugin.tm0 r0 = (com.tencent.mm.plugin.finder.live.plugin.tm0) r0
            int r1 = r0.f114433g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f114433g = r1
            goto L1b
        L16:
            com.tencent.mm.plugin.finder.live.plugin.tm0 r0 = new com.tencent.mm.plugin.finder.live.plugin.tm0
            r0.<init>(r12, r13)
        L1b:
            java.lang.Object r13 = r0.f114431e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f114433g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r12 = r0.f114430d
            xg2.h r12 = (xg2.h) r12
            kotlin.ResultKt.throwOnFailure(r13)
            goto L8a
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            java.lang.Object r12 = r0.f114430d
            com.tencent.mm.plugin.finder.live.plugin.wn0 r12 = (com.tencent.mm.plugin.finder.live.plugin.wn0) r12
            kotlin.ResultKt.throwOnFailure(r13)
            goto L6b
        L41:
            kotlin.ResultKt.throwOnFailure(r13)
            az2.j r13 = r12.v1()
            android.view.ViewGroup r2 = r12.f365323d
            android.content.Context r6 = r2.getContext()
            java.lang.String r2 = "getContext(...)"
            kotlin.jvm.internal.o.f(r6, r2)
            r7 = 0
            r8 = 0
            r10 = 6
            r11 = 0
            r5 = r13
            az2.j.u(r5, r6, r7, r8, r10, r11)
            kotlinx.coroutines.p0 r2 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r2 = kotlinx.coroutines.internal.b0.f310484a
            r0.f114430d = r12
            r0.f114433g = r4
            java.lang.Object r13 = xg2.g.b(r13, r2, r0)
            if (r13 != r1) goto L6b
            goto L8c
        L6b:
            xg2.h r13 = (xg2.h) r13
            boolean r2 = r13 instanceof xg2.i
            if (r2 == 0) goto L8a
            oz5.l r2 = r13.f454392a
            if (r2 != 0) goto L79
            oz5.l r2 = r0.getContext()
        L79:
            com.tencent.mm.plugin.finder.live.plugin.sm0 r4 = new com.tencent.mm.plugin.finder.live.plugin.sm0
            r5 = 0
            r4.<init>(r13, r5, r12)
            r0.f114430d = r13
            r0.f114433g = r3
            java.lang.Object r12 = kotlinx.coroutines.l.g(r2, r4, r0)
            if (r12 != r1) goto L8a
            goto L8c
        L8a:
            jz5.f0 r1 = jz5.f0.f302826a
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.wn0.t1(com.tencent.mm.plugin.finder.live.plugin.wn0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void A1() {
        if (this.f114977t) {
            return;
        }
        this.f114977t = true;
        ((mm2.f7) P0(mm2.f7.class)).f329060h.observe(this, new com.tencent.mm.plugin.finder.live.plugin.ln0(this));
        ((mm2.s2) P0(mm2.s2.class)).f329405g.observe(this, new com.tencent.mm.plugin.finder.live.plugin.mn0(this));
        ((mm2.s2) P0(mm2.s2.class)).f329406h.observe(this, new com.tencent.mm.plugin.finder.live.plugin.nn0(this));
        ((mm2.f7) P0(mm2.f7.class)).f329061i.observe(this, new com.tencent.mm.plugin.finder.live.plugin.on0(this));
    }

    public boolean B1() {
        zl2.r4 r4Var = zl2.r4.f473950a;
        if (r4Var.w1() && !dk2.ef.f233372a.x()) {
            return r4Var.U1(S0());
        }
        return ((mm2.c1) P0(mm2.c1.class)).m7();
    }

    public boolean C1() {
        boolean z17 = ((mm2.c1) P0(mm2.c1.class)).Z5;
        com.tencent.mars.xlog.Log.i("FinderLiveWishPanelPlug", "isInteractionWishSwitchEnable : " + z17);
        return z17;
    }

    public boolean D1() {
        r45.i82 i82Var = (r45.i82) ((mm2.f7) P0(mm2.f7.class)).f329058f.getValue();
        return i82Var != null && i82Var.getBoolean(0);
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
        if (com.tencent.mm.plugin.finder.live.plugin.lm0.f113416a[status.ordinal()] == 1) {
            A1();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        this.f114977t = false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void f1(float f17) {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u1() {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.wn0.u1():void");
    }

    public final az2.j v1() {
        r45.uu1 uu1Var = new r45.uu1();
        uu1Var.set(1, db2.t4.f228171a.a(10069));
        android.content.Context context = this.f113324f.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        uu1Var.set(2, xy2.c.e(context));
        uu1Var.set(4, java.lang.Long.valueOf(((mm2.e1) P0(mm2.e1.class)).f328983m));
        gk2.e eVar = gk2.e.f272471n;
        uu1Var.set(3, com.tencent.mm.protobuf.g.b(eVar != null ? ((mm2.e1) eVar.a(mm2.e1.class)).f328985o : null));
        uu1Var.set(5, java.lang.Long.valueOf(((mm2.e1) P0(mm2.e1.class)).f328988r.getLong(0)));
        if (((mm2.c1) P0(mm2.c1.class)).T) {
            r3 = 3;
        } else if (!((mm2.c1) P0(mm2.c1.class)).N7()) {
            r3 = (!((mm2.n0) P0(mm2.n0.class)).f329273r ? 0 : 1) != 0 ? 16 : 2;
        }
        uu1Var.set(6, java.lang.Integer.valueOf(r3));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 10069;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetrewardwishlist";
        lVar.f70664a = uu1Var;
        lVar.f70665b = new r45.vu1();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        return (az2.j) wi6;
    }

    public void w1(r45.c04 wishConfig, yz5.a onSuccess, yz5.q onFail) {
        kotlin.jvm.internal.o.g(wishConfig, "wishConfig");
        kotlin.jvm.internal.o.g(onSuccess, "onSuccess");
        kotlin.jvm.internal.o.g(onFail, "onFail");
        com.tencent.mars.xlog.Log.i("FinderLiveWishPanelPlug", "createInteractionWish with callback: " + this.f114980w);
        if (C1()) {
            com.tencent.mm.plugin.finder.live.util.y.m(this, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.finder.live.plugin.sn0(this, 1, wishConfig, onSuccess, onFail, null), 2, null);
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveWishPanelPlug", "createInteractionWish ignore as interactiveWish disable.");
            onFail.invoke(null, null, null);
        }
    }

    public final com.tencent.mm.plugin.finder.live.wish.widget.q x1() {
        return (com.tencent.mm.plugin.finder.live.wish.widget.q) ((jz5.n) this.f114975r).getValue();
    }

    public final com.tencent.mm.plugin.finder.live.wish.widget.x y1() {
        return (com.tencent.mm.plugin.finder.live.wish.widget.x) ((jz5.n) this.f114976s).getValue();
    }

    public final com.tencent.mm.plugin.finder.live.wish.widget.t0 z1() {
        return (com.tencent.mm.plugin.finder.live.wish.widget.t0) ((jz5.n) this.f114974q).getValue();
    }
}
