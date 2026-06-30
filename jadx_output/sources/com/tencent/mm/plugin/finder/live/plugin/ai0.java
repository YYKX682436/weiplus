package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ai0 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f111888p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f111889q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.z10 f111890r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.m10 f111891s;

    /* renamed from: t, reason: collision with root package name */
    public hq0.e0 f111892t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f111893u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View.OnTouchListener f111894v;

    /* renamed from: w, reason: collision with root package name */
    public int f111895w;

    /* renamed from: x, reason: collision with root package name */
    public int f111896x;

    /* renamed from: y, reason: collision with root package name */
    public final int f111897y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f111888p = statusMonitor;
        this.f111889q = "FinderLiveVisitorGamePlugin";
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f111890r = new com.tencent.mm.plugin.finder.live.widget.z10(context, root, statusMonitor, this);
        this.f111891s = new com.tencent.mm.plugin.finder.live.widget.m10(root, statusMonitor, this);
        this.f111897y = 4;
    }

    @Override // qo0.a
    public boolean B0() {
        if (this.f365323d.getVisibility() != 0) {
            return false;
        }
        t1();
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    @Override // qo0.a
    public void I0() {
        hq0.e0 e0Var = this.f111892t;
        if (e0Var != null) {
            e0Var.f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Override // qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J0() {
        /*
            r18 = this;
            r0 = r18
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "onResume "
            r1.<init>(r2)
            com.tencent.mm.plugin.finder.live.widget.m10 r2 = r0.f111891s
            java.lang.String r3 = r2.L
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "Finder.FinderLiveVisitorGameTeamWidget"
            com.tencent.mars.xlog.Log.i(r3, r1)
            java.lang.String r1 = r2.L
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2c
            int r1 = r1.length()
            if (r1 <= 0) goto L27
            r1 = r3
            goto L28
        L27:
            r1 = r4
        L28:
            if (r1 != r3) goto L2c
            r1 = r3
            goto L2d
        L2c:
            r1 = r4
        L2d:
            if (r1 == 0) goto L7f
            ke2.u r1 = new ke2.u
            com.tencent.mm.plugin.finder.live.plugin.l r5 = r2.f119001c
            java.lang.Class<mm2.e1> r6 = mm2.e1.class
            androidx.lifecycle.c1 r7 = r5.P0(r6)
            mm2.e1 r7 = (mm2.e1) r7
            long r7 = r7.f328983m
            androidx.lifecycle.c1 r9 = r5.P0(r6)
            mm2.e1 r9 = (mm2.e1) r9
            r45.nw1 r9 = r9.f328988r
            long r9 = r9.getLong(r4)
            androidx.lifecycle.c1 r11 = r5.P0(r6)
            mm2.e1 r11 = (mm2.e1) r11
            byte[] r11 = r11.f328985o
            com.tencent.mm.protobuf.g r11 = com.tencent.mm.protobuf.g.b(r11)
            androidx.lifecycle.c1 r5 = r5.P0(r6)
            mm2.e1 r5 = (mm2.e1) r5
            java.lang.String r12 = r5.f328992v
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 112(0x70, float:1.57E-43)
            r17 = 0
            r5 = r1
            r6 = r7
            r8 = r9
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            r16 = r17
            r5.<init>(r6, r8, r10, r11, r12, r13, r14, r15, r16)
            pq5.g r1 = r1.l()
            com.tencent.mm.plugin.finder.live.widget.r00 r5 = new com.tencent.mm.plugin.finder.live.widget.r00
            r5.<init>(r2)
            r1.K(r5)
        L7f:
            com.tencent.mm.plugin.finder.live.widget.z10 r1 = r0.f111890r
            android.view.View r2 = r1.f120498g
            if (r2 == 0) goto Lb9
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L8d
            r2 = r3
            goto L8e
        L8d:
            r2 = r4
        L8e:
            if (r2 == 0) goto Lb1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "onResume serverLost:"
            r2.<init>(r5)
            boolean r5 = r0.f111893u
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = r0.f111889q
            com.tencent.mars.xlog.Log.i(r5, r2)
            boolean r2 = r0.f111893u
            if (r2 == 0) goto Lae
            r18.u1()
            r0.f111893u = r4
        Lae:
            r1.g(r3)
        Lb1:
            hq0.e0 r1 = r0.f111892t
            if (r1 == 0) goto Lb8
            r1.j()
        Lb8:
            return
        Lb9:
            java.lang.String r1 = "rootView"
            kotlin.jvm.internal.o.o(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ai0.J0():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04bd  */
    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M0(qo0.b r31, android.os.Bundle r32) {
        /*
            Method dump skipped, instructions count: 1266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ai0.M0(qo0.b, android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (((mm2.c1) r3.P0(mm2.c1.class)).L2 == true) goto L8;
     */
    @Override // qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N0() {
        /*
            r19 = this;
            r0 = r19
            com.tencent.mm.plugin.finder.live.widget.m10 r1 = r0.f111891s
            r1.getClass()
            java.lang.String r2 = "Finder.FinderLiveVisitorGameTeamWidget"
            java.lang.String r3 = "stop"
            com.tencent.mars.xlog.Log.i(r2, r3)
            com.tencent.mm.plugin.finder.live.plugin.l r3 = r1.f119001c
            if (r3 == 0) goto L20
            java.lang.Class<mm2.c1> r4 = mm2.c1.class
            androidx.lifecycle.c1 r4 = r3.P0(r4)
            mm2.c1 r4 = (mm2.c1) r4
            boolean r4 = r4.L2
            r5 = 1
            if (r4 != r5) goto L20
            goto L21
        L20:
            r5 = 0
        L21:
            if (r5 == 0) goto L72
            java.lang.String r4 = "floatMode"
            com.tencent.mars.xlog.Log.i(r2, r4)
            ml2.m5 r2 = ml2.m5.f327718a
            r2.b()
            dk2.ef r2 = dk2.ef.f233372a
            r2.N()
            tn0.w0 r2 = dk2.ef.f233378d
            if (r2 == 0) goto L5d
            jn0.a r15 = new jn0.a
            android.view.ViewGroup r1 = r1.f118999a
            android.content.Context r5 = r1.getContext()
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.o.f(r5, r1)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r1 = 0
            r16 = 2046(0x7fe, float:2.867E-42)
            r17 = 0
            r4 = r15
            r18 = r15
            r15 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r18
            r2.G(r1)
        L5d:
            if (r3 == 0) goto L72
            com.tencent.mm.plugin.finder.live.view.k0 r1 = r3.R0()
            km2.m r1 = r1.getData()
            if (r1 == 0) goto L72
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r1 = r1.f309131f
            if (r1 == 0) goto L72
            if2.z r2 = if2.z.f291153a
            r2.b(r1)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ai0.N0():void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        android.view.View.OnTouchListener onTouchListener;
        java.util.LinkedList linkedList;
        super.O0();
        com.tencent.mm.plugin.finder.live.plugin.x80 x80Var = (com.tencent.mm.plugin.finder.live.plugin.x80) X0(com.tencent.mm.plugin.finder.live.plugin.x80.class);
        if (x80Var != null && (onTouchListener = this.f111894v) != null && (linkedList = x80Var.f115053t) != null) {
            linkedList.remove(onTouchListener);
        }
        this.f111894v = null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 2;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void k1(android.content.Intent intent) {
        com.tencent.mm.ui.widget.dialog.y1 y1Var;
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f111891s;
        m10Var.getClass();
        boolean z17 = false;
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("extra_start_by_half_screen_empty_area_click_scene", false) : false;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "clickEmptyAreaClose = " + booleanExtra);
        if (booleanExtra) {
            com.tencent.mm.ui.widget.dialog.y1 y1Var2 = m10Var.f119013o;
            if (y1Var2 != null && y1Var2.f()) {
                z17 = true;
            }
            if (!z17 || (y1Var = m10Var.f119013o) == null) {
                return;
            }
            y1Var.q();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1() {
        if (this.f365323d.getVisibility() == 0) {
            com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f111890r.f120499h;
            if (liveBottomSheetPanel != null) {
                com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(liveBottomSheetPanel, null, 1, null);
            } else {
                kotlin.jvm.internal.o.o("container");
                throw null;
            }
        }
    }

    public final void u1() {
        java.lang.String str = this.f111889q;
        com.tencent.mars.xlog.Log.i(str, "setupDynamicCardEnv");
        boolean z17 = true;
        boolean z18 = ((mm2.c1) P0(mm2.c1.class)).A7() == null;
        int intValue = ((java.lang.Number) ae2.in.f3826n7.r()).intValue();
        com.tencent.mars.xlog.Log.i(str, "enableDynamicCard playTogetherJumpInfo is null:" + z18 + ", localSwitchValue:" + intValue + " ,localSwitchValue:  native(有mb): 2, liteapp: 0、1");
        if (!z18 && intValue != 2) {
            z17 = false;
        }
        if (z17) {
            ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).Ai("wxe208ce76dfa39515");
            ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).Di(new com.tencent.mm.plugin.finder.live.plugin.zh0(this));
            java.lang.String str2 = ((mm2.c1) P0(mm2.c1.class)).f328852o;
            long j17 = ((mm2.e1) P0(mm2.e1.class)).f328983m;
            zl2.r4 r4Var = zl2.r4.f473950a;
            android.view.ViewGroup viewGroup = this.f365323d;
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String j07 = r4Var.j0(context);
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            java.lang.String str3 = a52.a.f1584l;
            java.lang.String f17 = dk2.q4.f233938a.f(((ml2.r0) i95.n0.c(ml2.r0.class)).M, "enter_immerse_type");
            kotlin.jvm.internal.o.d(str3);
            oe0.u uVar = new oe0.u(str2, j17, j07, str3, f17, null, null, null, 224, null);
            oe0.x xVar = (oe0.x) i95.n0.c(oe0.x.class);
            java.lang.Object obj = new java.lang.Object();
            android.content.Context context2 = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            hq0.e0 wi6 = ((ne0.r) xVar).wi(obj, context2, uVar);
            this.f111892t = wi6;
            if (wi6 != null) {
                com.tencent.mm.plugin.finder.live.widget.z10 z10Var = this.f111890r;
                z10Var.getClass();
                z10Var.f120511t = wi6;
                java.util.Iterator it = z10Var.f120508q.iterator();
                while (it.hasNext()) {
                    ((cm2.p) it.next()).f43375f = wi6;
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        super.z0();
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f111891s;
        m10Var.L = null;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = m10Var.f119001c;
        ((mm2.c1) lVar.P0(mm2.c1.class)).f328805f6.observe(lVar, new com.tencent.mm.plugin.finder.live.widget.p00(m10Var));
        jf2.k0 k0Var = (jf2.k0) lVar.U0(jf2.k0.class);
        if (k0Var != null && (liveMutableData = k0Var.f299387v) != null) {
            liveMutableData.f111660d = true;
            liveMutableData.observe(lVar, new com.tencent.mm.plugin.finder.live.widget.q00(m10Var));
        }
        mm2.c1 c1Var = (mm2.c1) P0(mm2.c1.class);
        com.tencent.mm.plugin.finder.live.plugin.uh0 uh0Var = new com.tencent.mm.plugin.finder.live.plugin.uh0(this);
        zg2.b bVar = c1Var.f328889t6;
        bVar.getClass();
        bVar.observe(this, new zg2.a(uh0Var));
        this.f111894v = new com.tencent.mm.plugin.finder.live.plugin.vh0(this);
        com.tencent.mm.plugin.finder.live.plugin.x80 x80Var = (com.tencent.mm.plugin.finder.live.plugin.x80) X0(com.tencent.mm.plugin.finder.live.plugin.x80.class);
        if (x80Var != null) {
            x80Var.x1(this.f111894v);
        }
    }
}
