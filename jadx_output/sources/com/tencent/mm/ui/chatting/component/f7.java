package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.e0.class)
/* loaded from: classes11.dex */
public class f7 extends com.tencent.mm.ui.chatting.component.a implements sb5.e0 {

    /* renamed from: f, reason: collision with root package name */
    public int f199016f;

    /* renamed from: y, reason: collision with root package name */
    public long f199032y;

    /* renamed from: z, reason: collision with root package name */
    public int f199033z;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f199015e = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f199017g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f199018h = new java.util.HashSet();

    /* renamed from: i, reason: collision with root package name */
    public int f199019i = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f199020m = false;

    /* renamed from: n, reason: collision with root package name */
    public final tg3.j1 f199021n = new com.tencent.mm.ui.chatting.component.b7(this);

    /* renamed from: o, reason: collision with root package name */
    public long f199022o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f199023p = false;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f199024q = null;

    /* renamed from: r, reason: collision with root package name */
    public long f199025r = 0;

    /* renamed from: s, reason: collision with root package name */
    public long f199026s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f199027t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f199028u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f199029v = 0;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f199030w = "";

    /* renamed from: x, reason: collision with root package name */
    public boolean f199031x = false;

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        o0();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.chatting.component.e7(this));
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        o0();
        boolean n17 = ((com.tencent.mm.storage.d3) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).wi()).n(this.f198580d.x());
        yd5.j jVar = yd5.j.f461103b;
        boolean D = this.f198580d.D();
        int[] iArr = jVar.f461104a;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, length);
        ((ku5.t0) ku5.t0.f312615d).q(new yd5.i(jVar, D, n17, iArr2));
        yd5.k kVar = yd5.k.f461105g;
        com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomReporter", "[report] chatroomId:%s mCount:%s mDownCount:%s mUpCount:%s mErrCount:%s mSuccessCount:%s mFetchCount:%s", this.f198580d.x(), java.lang.Integer.valueOf(kVar.f461106a), java.lang.Integer.valueOf(kVar.f461109d), java.lang.Integer.valueOf(kVar.f461110e), java.lang.Integer.valueOf(kVar.f461107b), java.lang.Integer.valueOf(kVar.f461108c), java.lang.Integer.valueOf(kVar.f461111f));
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.idkeyStat(403L, 60L, kVar.f461106a, true);
        fVar.idkeyStat(403L, 61L, kVar.f461109d, true);
        fVar.idkeyStat(403L, 62L, kVar.f461110e, true);
        fVar.idkeyStat(403L, 63L, kVar.f461107b, true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.tencent.mars.smc.IDKey(403, 64, kVar.f461108c));
        arrayList.add(new com.tencent.mars.smc.IDKey(403, 65, kVar.f461111f));
        fVar.b(arrayList, true);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        com.tencent.mm.storage.l4 p17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f198580d.x())) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(110L, 0L, 1L, true);
        }
        java.lang.String x17 = this.f198580d.x();
        this.f199032y = 0L;
        if (com.tencent.mm.sdk.platformtools.t8.K0(x17) || (p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(x17)) == null || !"hidden_conv_parent".equalsIgnoreCase(p17.W0())) {
            return;
        }
        this.f199032y = java.lang.System.currentTimeMillis();
        this.f199033z = c01.h2.b(x17);
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
    }

    public void m0(com.tencent.mm.storage.f9 f9Var) {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.chatting.component.w6(this, f9Var, false));
    }

    public void n0(com.tencent.mm.storage.f9 f9Var) {
        if (!this.f199020m) {
            this.f199020m = true;
            com.tencent.mm.storage.c z07 = com.tencent.mm.model.newabtest.z.Ai().z0("100134");
            if (z07.isValid()) {
                java.lang.String str = (java.lang.String) z07.t0().get("needUploadData");
                int i17 = x51.t1.f452086a;
                int i18 = 0;
                if (str != null) {
                    try {
                        if (str.length() > 0) {
                            i18 = java.lang.Integer.parseInt(str);
                        }
                    } catch (java.lang.NumberFormatException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Util", e17, "", new java.lang.Object[0]);
                    }
                }
                this.f199019i = i18;
            }
        }
        if (this.f199019i == 0 || this.f199018h.contains(java.lang.Long.valueOf(f9Var.I0()))) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.component.y6(this, f9Var));
    }

    public final void o0() {
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.chatting.component.z6(this, this.f198580d.x()), "MicroMsg.ChattingUI.ChattingReportComponent");
        ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
        com.tencent.mm.modelstat.e.f71505a.getClass();
        com.tencent.mm.autogen.events.ChattingUIStatusEvent chattingUIStatusEvent = new com.tencent.mm.autogen.events.ChattingUIStatusEvent();
        chattingUIStatusEvent.f54046g.f7124a = false;
        chattingUIStatusEvent.e();
        tg3.k1 k1Var = (tg3.k1) i95.n0.c(tg3.k1.class);
        tg3.j1 j1Var = this.f199021n;
        ih3.e eVar = (ih3.e) k1Var;
        eVar.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new ih3.g(eVar, "tmpl_type_succeed_contact", j1Var));
        java.lang.String x17 = this.f198580d.x();
        if (this.f199032y != 0) {
            com.tencent.mm.autogen.mmdata.rpt.HideSessionExitStruct hideSessionExitStruct = new com.tencent.mm.autogen.mmdata.rpt.HideSessionExitStruct();
            if (this.f198580d.f460717l.getIntExtra("chat_from_scene", 0) == 5) {
                hideSessionExitStruct.f58443d = 1L;
            } else {
                hideSessionExitStruct.f58443d = 2L;
            }
            hideSessionExitStruct.f58444e = hideSessionExitStruct.b("ChatName", x17, true);
            hideSessionExitStruct.f58445f = this.f199032y;
            hideSessionExitStruct.f58446g = java.lang.System.currentTimeMillis();
            hideSessionExitStruct.f58447h = this.f199033z;
            hideSessionExitStruct.f58448i = c01.h2.b(x17);
            com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(x17);
            if (p17 != null) {
                if ("hidden_conv_parent".equalsIgnoreCase(p17.W0())) {
                    hideSessionExitStruct.f58449j = 1L;
                } else if (p17.w0() > this.f199032y) {
                    hideSessionExitStruct.f58449j = com.tencent.mm.sdk.platformtools.t8.K0(p17.z0()) ? 2L : 3L;
                } else if (!com.tencent.mm.sdk.platformtools.t8.K0(p17.A0()) || p17.D0() != 0) {
                    hideSessionExitStruct.f58449j = 4L;
                }
            }
            hideSessionExitStruct.k();
            this.f199032y = 0L;
        }
    }

    public void p0(com.tencent.mm.storage.f9 f9Var) {
        if (this.f199017g.contains(java.lang.Long.valueOf(f9Var.I0()))) {
            return;
        }
        this.f199017g.add(java.lang.Long.valueOf(f9Var.I0()));
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.component.x6(this, f9Var));
    }

    public final void q0() {
        this.f199024q = null;
        if (c01.z1.r() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.ChattingReportComponent", "getUsernameFromUserInfo is null!");
            return;
        }
        int i17 = 0;
        if (!c01.z1.r().equals(this.f198580d.x()) && this.f198580d.C()) {
            this.f199024q = this.f198580d.x();
            this.f199025r = (c01.w9.p() / 1000) * 1000;
            this.f199027t = 0;
            gm0.j1.e().j(new com.tencent.mm.ui.chatting.component.c7(this, this.f199024q, this.f198580d.x(), this.f198580d.u()));
        }
        if (this.f199023p) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f199022o;
            this.f199022o = 0L;
            this.f199023p = false;
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            int i18 = 8;
            long[] jArr = {0, 200, 400, 600, 800, 1000, 1500, 2000};
            while (true) {
                if (i17 >= 8) {
                    i18 = -1;
                    break;
                } else if (currentTimeMillis >= jArr[i17]) {
                    if (i17 == 7) {
                        break;
                    } else {
                        i17++;
                    }
                } else {
                    i18 = i17;
                    break;
                }
            }
            g0Var.idkeyStat(109L, i18, 1L, true);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        r45.fh7 fh7Var = (r45.fh7) ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).wi(13, "report_".concat(this.f198580d.x()));
        if (fh7Var != null) {
            this.f199029v = fh7Var.f374360d;
            this.f199030w = fh7Var.f374361e;
        }
        if (!this.f199031x) {
            q0();
        }
        this.f199031x = false;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        if (android.text.TextUtils.isEmpty(this.f199024q) || !this.f198580d.C()) {
            return;
        }
        this.f199026s = c01.w9.p();
        java.lang.String str = this.f199024q;
        this.f199024q = "";
        int i17 = ((com.tencent.mm.ui.chatting.component.rf) ((sb5.a1) this.f198580d.f460708c.a(sb5.a1.class))).f199832h;
        if (i17 == 2) {
            ((com.tencent.mm.ui.chatting.component.rf) ((sb5.a1) this.f198580d.f460708c.a(sb5.a1.class))).f199832h = 0;
        }
        int i18 = (this.f198580d.C() && this.f198580d.u().T == 0) ? 1 : 0;
        if (5 == this.f198580d.f460717l.getIntExtra("chat_from_scene", 0)) {
            this.f199028u = 2;
        } else {
            this.f199028u = this.f198580d.f460717l.getIntExtra("chat_from_scene_for_group_chats", 0);
        }
        int i19 = this.f199028u;
        this.f199028u = 0;
        gm0.j1.e().j(new com.tencent.mm.ui.chatting.component.d7(this, str, i17, i18, i19, i18));
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        int i17;
        this.f199022o = java.lang.System.currentTimeMillis();
        this.f199023p = true;
        if (this.f198580d.u() != null) {
            this.f198580d.x();
            if (c01.z1.r() != null) {
                v90.v vVar = (v90.v) i95.n0.c(v90.v.class);
                this.f198580d.x();
                ((u90.a) vVar).getClass();
                com.tencent.mm.modelstat.e.f71505a.getClass();
                if (!c01.z1.r().equals(this.f198580d.x())) {
                    com.tencent.mm.autogen.events.ChattingUIStatusEvent chattingUIStatusEvent = new com.tencent.mm.autogen.events.ChattingUIStatusEvent();
                    chattingUIStatusEvent.f54046g.f7124a = true;
                    chattingUIStatusEvent.e();
                }
                int i18 = 2;
                if (com.tencent.mm.storage.z3.R4(this.f198580d.x())) {
                    ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
                    com.tencent.mm.plugin.finder.report.m0 m0Var = com.tencent.mm.plugin.finder.report.m0.f125120d;
                    com.tencent.mm.plugin.finder.report.m0.f125121e.put(2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
                } else {
                    ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
                    com.tencent.mm.plugin.finder.report.m0 m0Var2 = com.tencent.mm.plugin.finder.report.m0.f125120d;
                    com.tencent.mm.plugin.finder.report.m0.f125121e.put(1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
                }
                boolean r07 = ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) this.f198580d.f460708c.a(sb5.q2.class))).r0();
                int i19 = 0;
                if ("notification_messages".equals(this.f198580d.x()) || "schedule_message".equals(this.f198580d.x())) {
                    i18 = 8;
                    i17 = 1;
                } else if (c01.e2.G(this.f198580d.x())) {
                    com.tencent.mm.ui.chatting.component.biz.a aVar = (com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class));
                    if (aVar.f198753r) {
                        i17 = !r07 ? 1 : 0;
                        if (aVar.f198754s) {
                            aVar.f198744f.w0().size();
                            i18 = 5;
                        } else {
                            i18 = 4;
                        }
                    } else if (r01.z.h(this.f198580d.x())) {
                        i17 = !r07 ? 1 : 0;
                        i18 = 3;
                    } else {
                        rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
                        java.lang.String x17 = this.f198580d.x();
                        ((qv.o) u2Var).getClass();
                        if (r01.z.j(x17)) {
                            i17 = 1;
                            i18 = 0;
                        } else {
                            i18 = r01.z.n(this.f198580d.x()) ? 6 : 7;
                            i17 = 0;
                        }
                    }
                } else {
                    boolean C = this.f198580d.C();
                    i17 = !r07 ? 1 : 0;
                    if (!C) {
                        i18 = 1;
                    }
                }
                if (!this.f198580d.G()) {
                    for (java.lang.String str : c01.e2.f37132p) {
                        if (str.equals(this.f198580d.x())) {
                            i18 = 0;
                        }
                    }
                    i19 = i18;
                }
                if (i19 != 0) {
                    if (!((com.tencent.mm.ui.chatting.component.h3) ((sb5.s) this.f198580d.f460708c.a(sb5.s.class))).u() && !((com.tencent.mm.ui.chatting.component.h4) ((sb5.x) this.f198580d.f460708c.a(sb5.x.class))).t() && !((com.tencent.mm.ui.chatting.component.u7) ((sb5.h0) this.f198580d.f460708c.a(sb5.h0.class))).G() && !((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class))).G0() && !((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class))).H0() && !((com.tencent.mm.ui.chatting.component.b9) ((sb5.j0) this.f198580d.f460708c.a(sb5.j0.class))).s()) {
                        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.chatting.component.a7(this, i19, this.f198580d.x(), i17), "MicroMsg.ChattingUI.ChattingReportComponent");
                    }
                }
                tg3.k1 k1Var = (tg3.k1) i95.n0.c(tg3.k1.class);
                tg3.j1 j1Var = this.f199021n;
                ih3.e eVar = (ih3.e) k1Var;
                eVar.getClass();
                com.tencent.mm.sdk.platformtools.u3.h(new ih3.f(eVar, "tmpl_type_succeed_contact", j1Var));
            }
        }
        this.f199031x = true;
        q0();
    }
}
