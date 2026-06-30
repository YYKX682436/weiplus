package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ag0 extends com.tencent.mm.plugin.finder.live.plugin.g {
    public final com.tencent.mm.plugin.finder.live.widget.wm A;
    public final com.tencent.mm.plugin.finder.live.widget.e30 B;
    public final com.tencent.mm.plugin.finder.live.widget.xp C;
    public final com.tencent.mm.plugin.finder.live.widget.d20 D;
    public final com.tencent.mm.plugin.finder.live.widget.qy E;
    public final com.tencent.mm.plugin.finder.live.widget.e40 F;
    public final el2.c2 G;
    public final el2.i1 H;
    public final el2.r2 I;

    /* renamed from: J, reason: collision with root package name */
    public final el2.u2 f111879J;
    public final com.tencent.mm.plugin.finder.live.widget.o6 K;
    public final jy2.b L;
    public final java.util.List M;
    public boolean N;
    public final java.util.HashMap P;

    /* renamed from: v, reason: collision with root package name */
    public final qo0.c f111880v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f111881w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f111882x;

    /* renamed from: y, reason: collision with root package name */
    public xt2.p6 f111883y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.q30 f111884z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag0(android.view.ViewGroup root, qo0.c statusMonitor, android.view.ViewGroup rootParent) {
        super(root, statusMonitor);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(rootParent, "rootParent");
        this.f111880v = statusMonitor;
        this.f111881w = "Finder.FinderLiveVisitorBottomOptionPlugin";
        this.f111882x = ((mm2.c1) P0(mm2.c1.class)).E3.f329470c;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.muu);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f111883y = new xt2.e6((android.view.ViewGroup) findViewById, statusMonitor, this);
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.i2v);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.q30 q30Var = new com.tencent.mm.plugin.finder.live.widget.q30((android.view.ViewGroup) findViewById2, statusMonitor, this);
        this.f111884z = q30Var;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.u8b);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.wm wmVar = new com.tencent.mm.plugin.finder.live.widget.wm((android.view.ViewGroup) findViewById3, statusMonitor, this);
        this.A = wmVar;
        android.view.View findViewById4 = rootParent.findViewById(com.tencent.mm.R.id.fpi);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.e30 e30Var = new com.tencent.mm.plugin.finder.live.widget.e30((android.view.ViewGroup) findViewById4, statusMonitor, this);
        this.B = e30Var;
        android.view.View findViewById5 = root.findViewById(com.tencent.mm.R.id.f486015jv3);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.xp xpVar = new com.tencent.mm.plugin.finder.live.widget.xp((android.view.ViewGroup) findViewById5, statusMonitor, this);
        this.C = xpVar;
        android.view.View findViewById6 = root.findViewById(com.tencent.mm.R.id.gri);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.d20 d20Var = new com.tencent.mm.plugin.finder.live.widget.d20((android.view.ViewGroup) findViewById6, statusMonitor, this);
        this.D = d20Var;
        android.view.View findViewById7 = root.findViewById(com.tencent.mm.R.id.tpx);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.f30 f30Var = new com.tencent.mm.plugin.finder.live.widget.f30((android.view.ViewGroup) findViewById7, statusMonitor, this);
        android.view.View findViewById8 = root.findViewById(com.tencent.mm.R.id.eyy);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.qy qyVar = new com.tencent.mm.plugin.finder.live.widget.qy((android.view.ViewGroup) findViewById8, statusMonitor, this);
        this.E = qyVar;
        android.view.View findViewById9 = root.findViewById(com.tencent.mm.R.id.p_k);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.e40 e40Var = new com.tencent.mm.plugin.finder.live.widget.e40((android.view.ViewGroup) findViewById9, statusMonitor, this);
        this.F = e40Var;
        android.view.View findViewById10 = root.findViewById(com.tencent.mm.R.id.lc8);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        el2.c2 c2Var = new el2.c2((android.view.ViewGroup) findViewById10, statusMonitor, this);
        this.G = c2Var;
        android.view.View findViewById11 = root.findViewById(com.tencent.mm.R.id.q8x);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        el2.i1 i1Var = new el2.i1((android.view.ViewGroup) findViewById11, statusMonitor, this);
        this.H = i1Var;
        android.view.View findViewById12 = root.findViewById(com.tencent.mm.R.id.s5m);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        el2.r2 r2Var = new el2.r2((android.view.ViewGroup) findViewById12, statusMonitor, this);
        this.I = r2Var;
        android.view.View findViewById13 = root.findViewById(com.tencent.mm.R.id.rpt);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        el2.u2 u2Var = new el2.u2((android.view.ViewGroup) findViewById13, statusMonitor, this);
        this.f111879J = u2Var;
        android.view.View findViewById14 = root.findViewById(com.tencent.mm.R.id.j0u);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.o6 o6Var = new com.tencent.mm.plugin.finder.live.widget.o6((android.view.ViewGroup) findViewById14, statusMonitor, this);
        this.K = o6Var;
        android.view.View findViewById15 = root.findViewById(com.tencent.mm.R.id.p96);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        jy2.b bVar = new jy2.b((android.view.ViewGroup) findViewById15, statusMonitor, this);
        this.L = bVar;
        android.view.View findViewById16 = root.findViewById(com.tencent.mm.R.id.f486430l63);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        this.M = kz5.c0.i(this.f111883y, q30Var, wmVar, e30Var, xpVar, d20Var, f30Var, qyVar, e40Var, c2Var, i1Var, r2Var, o6Var, bVar, new el2.l0((android.view.ViewGroup) findViewById16, statusMonitor, this));
        com.tencent.mm.plugin.finder.live.plugin.kf0 kf0Var = com.tencent.mm.plugin.finder.live.plugin.kf0.f113228a;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.a1.u(root, kf0Var);
        e30Var.y1(this.f111882x, new com.tencent.mm.plugin.finder.live.plugin.lf0(this));
        M1(((mm2.l0) P0(mm2.l0.class)).f329215q);
        android.content.Context context = this.f113324f.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && activity.getIntent().getIntExtra("KEY_PARAMS_DO_ACTION", 0) == 13) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorBottomOptionPlugin", "checkLinkMicIntent: need show link mic after join live");
            this.N = true;
            activity.getIntent().removeExtra("KEY_PARAMS_DO_ACTION");
        }
        zl2.r4.o3(zl2.r4.f473950a, root, "Finder.FinderLiveVisitorBottomOptionPlugin", false, false, 12, null);
        java.lang.Object obj = this.f111883y;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.shopping.view.IFinderLiveChangeableButtonEntranceWidget");
        this.P = kz5.c1.i(new jz5.l(16, (xt2.m6) obj), new jz5.l(10, q30Var), new jz5.l(12, xpVar), new jz5.l(11, qyVar), new jz5.l(17, e40Var), new jz5.l(2, bVar), new jz5.l(15, d20Var), new jz5.l(19, c2Var), new jz5.l(20, r2Var), new jz5.l(23, u2Var), new jz5.l(27, wmVar), new jz5.l(14, new com.tencent.mm.plugin.finder.live.widget.a(e30Var)));
    }

    @Override // qo0.a
    public void C0(java.util.LinkedHashMap micUserMap) {
        kotlin.jvm.internal.o.g(micUserMap, "micUserMap");
        D1();
    }

    public final void C1(boolean z17) {
        java.lang.String str = ((mm2.c1) P0(mm2.c1.class)).E3.f329470c;
        com.tencent.mars.xlog.Log.i(this.f111881w, "checkCheerIcon, new:" + str + " old:" + this.f111882x);
        int i17 = ((mm2.c1) P0(mm2.c1.class)).E3.f329471d;
        com.tencent.mm.plugin.finder.live.widget.e30 e30Var = this.B;
        if (i17 == 0) {
            e30Var.y1("", null);
            this.f111882x = null;
        } else if (!com.tencent.mm.sdk.platformtools.t8.D0(this.f111882x, str) || z17) {
            this.f111882x = str;
            e30Var.y1(str, new com.tencent.mm.plugin.finder.live.plugin.rf0(this));
        }
    }

    public final void D1() {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.sf0(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E1(boolean r9) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ag0.E1(boolean):void");
    }

    @Override // qo0.a
    public void F0(int i17, int i18, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        if (i18 != hashCode()) {
            return;
        }
        com.tencent.mm.plugin.finder.live.widget.q30 q30Var = this.f111884z;
        q30Var.getClass();
        java.lang.String str = q30Var.f119470g;
        if (i17 == 16) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                com.tencent.mars.xlog.Log.i(str, "onRequestPermissionsResult camera granted");
                com.tencent.mm.plugin.finder.live.widget.q30.m(q30Var, q30Var.f119479s, 0, q30Var.f119480t, 2, null);
                return;
            }
            return;
        }
        if (i17 != 80) {
            return;
        }
        if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
            com.tencent.mars.xlog.Log.i(str, "onRequestPermissionsResult microphone granted");
            com.tencent.mm.plugin.finder.live.widget.q30.m(q30Var, q30Var.f119479s, 0, q30Var.f119480t, 2, null);
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "FinderLive request permission " + i17 + " failed");
        android.view.ViewGroup viewGroup = q30Var.f119467d;
        db5.e1.C(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.hhn), viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.hht), viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.g6z), viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.finder.live.widget.o30(q30Var), com.tencent.mm.plugin.finder.live.widget.p30.f119352d);
    }

    public final void F1(int i17, int i18, hi2.b bVar) {
        this.f111884z.l(i17, i18, bVar);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    public final android.view.ViewGroup G1() {
        jf2.k0 k0Var = (jf2.k0) U0(jf2.k0.class);
        com.tencent.mm.plugin.finder.live.widget.qy qyVar = this.E;
        boolean z17 = false;
        if (k0Var != null && k0Var.g7(qyVar)) {
            z17 = true;
        }
        return z17 ? this.f111879J.f253921d : qyVar.f119558d;
    }

    public final int[] H1() {
        jf2.k0 k0Var = (jf2.k0) U0(jf2.k0.class);
        return pm0.v.t(k0Var != null ? k0Var.f7(16) : false ? this.f111879J.f253921d : this.f111883y.h());
    }

    @Override // qo0.a
    public void I0() {
    }

    public final int I1(android.view.View withoutView) {
        kotlin.jvm.internal.o.g(withoutView, "withoutView");
        android.view.ViewGroup viewGroup = this.f365323d;
        int childCount = viewGroup.getChildCount();
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = viewGroup.getChildAt(i18);
            if (!kotlin.jvm.internal.o.b(withoutView, childAt) && childAt.getVisibility() == 0) {
                i17++;
            }
        }
        return i17 + (this.B.w0() == 0 ? 1 : 0);
    }

    public final android.view.ViewGroup J1() {
        jf2.k0 k0Var = (jf2.k0) U0(jf2.k0.class);
        com.tencent.mm.plugin.finder.live.widget.d20 d20Var = this.D;
        boolean z17 = false;
        if (k0Var != null && k0Var.g7(d20Var)) {
            z17 = true;
        }
        return z17 ? this.f111879J.f253921d : d20Var.f118042o;
    }

    public final android.view.ViewGroup K1() {
        jf2.k0 k0Var = (jf2.k0) U0(jf2.k0.class);
        com.tencent.mm.plugin.finder.live.widget.xp xpVar = this.C;
        boolean z17 = false;
        if (k0Var != null && k0Var.g7(xpVar)) {
            z17 = true;
        }
        return z17 ? this.f111879J.f253921d : xpVar.f120362d;
    }

    public final void L1() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("animate close def ");
        r45.ym1 ym1Var = ((mm2.c1) P0(mm2.c1.class)).f328831k4;
        sb6.append(ym1Var != null ? java.lang.Integer.valueOf(ym1Var.getInteger(3)) : null);
        com.tencent.mars.xlog.Log.i("LiveButtonChangeController", sb6.toString());
        r45.ym1 ym1Var2 = ((mm2.c1) P0(mm2.c1.class)).f328831k4;
        if ((ym1Var2 != null ? ym1Var2.getInteger(3) : 0) > 0) {
            return;
        }
        com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.zf0(this, null), 3, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 7) {
            n1();
            return;
        }
        if (ordinal == 123) {
            boolean z17 = !((mm2.c1) P0(mm2.c1.class)).e8();
            com.tencent.mm.plugin.finder.live.widget.q30 q30Var = this.f111884z;
            q30Var.f119481u = z17;
            this.D.a(!((mm2.c1) P0(mm2.c1.class)).e8());
            this.C.f120367i = ((mm2.g0) P0(mm2.g0.class)).U6();
            el2.i1 i1Var = this.H;
            if (i1Var.f253812d.getVisibility() == 0) {
                pm0.v.w(new el2.b1(i1Var));
            }
            if ((q30Var.f119467d.getVisibility() == 0) && this.N) {
                com.tencent.mars.xlog.Log.i(this.f111881w, "statusChange: FINDER_LIVE_UPDATE_LIVE_MSG, request link mic");
                com.tencent.mm.plugin.finder.live.widget.q30.m(this.f111884z, 0, 0, null, 7, null);
                this.N = false;
                return;
            }
            return;
        }
        if (ordinal == 245) {
            E1(true);
            return;
        }
        com.tencent.mm.plugin.finder.live.widget.e30 e30Var = this.B;
        switch (ordinal) {
            case 150:
                android.view.ViewGroup viewGroup = e30Var.f365323d;
                viewGroup.startAnimation(android.view.animation.AnimationUtils.loadAnimation(viewGroup.getContext(), com.tencent.mm.R.anim.f477734v));
                return;
            case 151:
                e30Var.getClass();
                pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.m20(e30Var, true));
                return;
            case 152:
                if (e30Var.i()) {
                    pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.t20(e30Var));
                    return;
                }
                return;
            case com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS /* 153 */:
                if (e30Var.i()) {
                    el2.r2 r2Var = this.I;
                    r2Var.getClass();
                    pm0.v.X(new el2.q2(r2Var));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void M1(mm2.i0 i0Var) {
        com.tencent.mars.xlog.Log.i(this.f111881w, "updateCheerInfos " + i0Var);
        if (i0Var != null) {
            ((mm2.c1) P0(mm2.c1.class)).P9(i0Var.f329131a, i0Var.f329132b, i0Var.f329133c);
            com.tencent.mm.plugin.finder.live.plugin.ow owVar = (com.tencent.mm.plugin.finder.live.plugin.ow) X0(com.tencent.mm.plugin.finder.live.plugin.ow.class);
            if (owVar != null) {
                owVar.I1(((mm2.c1) P0(mm2.c1.class)).E3.f329469b);
            }
            C1(false);
        }
    }

    @Override // qo0.a
    public void N0() {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData2;
        super.O0();
        this.f111882x = null;
        xt2.p6 p6Var = this.f111883y;
        if (p6Var instanceof xt2.e6) {
            kotlin.jvm.internal.o.e(p6Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.shopping.view.FinderLiveVisitorShoppingEntranceWidget");
            xt2.e6 e6Var = (xt2.e6) p6Var;
            ((android.widget.ImageView) ((jz5.n) e6Var.f456729q).getValue()).animate().cancel();
            e6Var.m().n();
            e6Var.t(8);
        } else if (p6Var instanceof xt2.d) {
            kotlin.jvm.internal.o.e(p6Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.shopping.view.FinderLiveAnchorShoppingEntranceWidget");
            ((xt2.d) p6Var).m().n();
        }
        this.C.f120364f = true;
        this.B.O0();
        this.G.getClass();
        this.H.o(false);
        com.tencent.mm.plugin.finder.live.widget.wm wmVar = this.A;
        wmVar.f120215p = false;
        zi2.w wVar = wmVar.f120217r;
        if (wVar != null && (liveMutableData2 = ((je2.t) wVar.P0(je2.t.class)).f299268n) != null) {
            zi2.w wVar2 = wmVar.f120217r;
            kotlin.jvm.internal.o.d(wVar2);
            liveMutableData2.removeObservers(wVar2);
        }
        zi2.w wVar3 = wmVar.f120217r;
        if (wVar3 != null && (liveMutableData = ((mm2.c1) wVar3.P0(mm2.c1.class)).f328886t3) != null) {
            zi2.w wVar4 = wmVar.f120217r;
            kotlin.jvm.internal.o.d(wVar4);
            liveMutableData.removeObservers(wVar4);
        }
        wmVar.f120218s = null;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = wmVar.f120220u;
        if (k0Var != null) {
            k0Var.u();
        }
        wmVar.f120220u = null;
        vg2.y1 y1Var = wmVar.f120221v;
        if (y1Var != null) {
            y1Var.f436626e.dismiss();
        }
        wmVar.f120221v = null;
        com.tencent.mars.xlog.Log.i(wmVar.f120208f, "unMount");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.g0) P0(mm2.g0.class)).U6();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void l1(android.os.Bundle bundle, java.lang.Object obj) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        java.lang.String str = string != null ? string : "";
        com.tencent.mars.xlog.Log.i(this.f111881w, "onPortraitAction action: ".concat(str));
        if (kotlin.jvm.internal.o.b(str, "PORTRAIT_ACTION_PROMOTE_CLICK")) {
            qo0.c.a(this.f111880v, qo0.b.I2, null, 2, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void n1() {
        android.view.View findViewById;
        jf2.k0 k0Var;
        if (((mm2.c1) P0(mm2.c1.class)).T) {
            com.tencent.mars.xlog.Log.i(this.f111881w, "init anchor shop entrance");
            jf2.k0 k0Var2 = (jf2.k0) U0(jf2.k0.class);
            if (k0Var2 != null) {
                com.tencent.mars.xlog.Log.i("LiveVisitorBottomEntranceController", "unRegisterEntrance = 16");
                pm0.v.d0(k0Var2.f299380o, new jf2.j0(16));
            }
            android.view.View findViewById2 = this.f365323d.findViewById(com.tencent.mm.R.id.muu);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            xt2.d dVar = new xt2.d((android.view.ViewGroup) findViewById2, this.f111880v, this);
            this.f111883y = dVar;
            xt2.d dVar2 = dVar instanceof jf2.o ? dVar : null;
            if (dVar2 != null && (k0Var = (jf2.k0) U0(jf2.k0.class)) != null) {
                k0Var.h7(dVar2);
            }
        }
        if (((((mm2.n0) P0(mm2.n0.class)).f329273r) || ((mm2.c1) P0(mm2.c1.class)).T) && (findViewById = this.f365323d.findViewById(com.tencent.mm.R.id.rpt)) != null && findViewById.getParent() == this.f365323d) {
            com.tencent.mars.xlog.Log.i(this.f111881w, "onStartLive: invitee/assistant, move fold_entrance_container to last");
            this.f365323d.removeView(findViewById);
            this.f365323d.addView(findViewById);
        }
        ((mm2.l0) P0(mm2.l0.class)).f329213o.observe(this, new com.tencent.mm.plugin.finder.live.plugin.wf0(this));
        ((mm2.w) P0(mm2.w.class)).f329503o.observe(this, new com.tencent.mm.plugin.finder.live.plugin.yf0(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.g
    public java.util.HashMap v1() {
        return this.P;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.g, com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.DiffMutableLiveData diffMutableLiveData;
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.DiffMutableLiveData diffMutableLiveData2;
        super.z0();
        xt2.p6 p6Var = this.f111883y;
        xt2.e6 e6Var = p6Var instanceof xt2.e6 ? (xt2.e6) p6Var : null;
        if (e6Var != null) {
            ((android.widget.ImageView) ((jz5.n) e6Var.f456729q).getValue()).setVisibility(0);
        }
        com.tencent.mm.plugin.finder.live.widget.qy qyVar = this.E;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = qyVar.f119560f;
        ((mm2.c1) lVar.P0(mm2.c1.class)).f328805f6.observe(lVar, new com.tencent.mm.plugin.finder.live.widget.py(qyVar));
        ((mm2.s2) P0(mm2.s2.class)).f329410o.observe(this, new com.tencent.mm.plugin.finder.live.plugin.uf0(this));
        el2.c2 c2Var = this.G;
        com.tencent.mm.plugin.finder.live.plugin.l lVar2 = c2Var.f253762e;
        el2.n1 n1Var = (el2.n1) lVar2.U0(el2.n1.class);
        if (n1Var != null && (diffMutableLiveData2 = n1Var.f253875q) != null) {
            diffMutableLiveData2.observe(lVar2, new el2.s1(c2Var));
        }
        el2.n1 n1Var2 = (el2.n1) lVar2.U0(el2.n1.class);
        if (n1Var2 != null && (diffMutableLiveData = n1Var2.f253875q) != null) {
            diffMutableLiveData.postValue(null);
        }
        el2.n1 n1Var3 = (el2.n1) lVar2.U0(el2.n1.class);
        if (n1Var3 != null) {
            com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = (com.tencent.mm.plugin.finder.live.plugin.r60) n1Var3.R6(com.tencent.mm.plugin.finder.live.plugin.r60.class);
            if (!(r60Var != null && r60Var.w0() == 0)) {
                n1Var3.f253875q.postValue(n1Var3.f253874p);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[mount] liveName = ");
        el2.i1 i1Var = this.H;
        com.tencent.mm.plugin.finder.live.plugin.l lVar3 = i1Var.f253814f;
        sb6.append(((mm2.e1) lVar3.P0(mm2.e1.class)).f328988r.getLong(0));
        sb6.append(", isActive = ");
        sb6.append(kotlinx.coroutines.z0.h(lVar3.R0().getViewScope()));
        com.tencent.mars.xlog.Log.i(i1Var.f253815g, sb6.toString());
        ((je2.t) lVar3.P0(je2.t.class)).f299268n.observe(lVar3, new el2.v0(i1Var));
        ((je2.t) lVar3.P0(je2.t.class)).f299274t.observe(lVar3, new el2.w0(i1Var));
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData2 = ((je2.t) lVar3.P0(je2.t.class)).f299269o;
        liveMutableData2.f111660d = true;
        liveMutableData2.observe(lVar3, new el2.x0(i1Var));
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData3 = ((mm2.c1) lVar3.P0(mm2.c1.class)).f328886t3;
        liveMutableData3.f111660d = true;
        liveMutableData3.observe(lVar3, new el2.y0(i1Var));
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData4 = ((je2.t) lVar3.P0(je2.t.class)).f299271q;
        liveMutableData4.f111660d = true;
        liveMutableData4.observe(lVar3, new el2.z0(i1Var));
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData5 = ((je2.t) lVar3.P0(je2.t.class)).f299270p;
        liveMutableData5.f111660d = true;
        liveMutableData5.observe(lVar3, new el2.a1(i1Var));
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[mount] liveId = ");
        com.tencent.mm.plugin.finder.live.widget.wm wmVar = this.A;
        com.tencent.mm.plugin.finder.live.plugin.l lVar4 = wmVar.f120207e;
        sb7.append(((mm2.e1) lVar4.P0(mm2.e1.class)).f328988r.getLong(0));
        java.lang.String sb8 = sb7.toString();
        java.lang.String str = wmVar.f120208f;
        com.tencent.mars.xlog.Log.i(str, sb8);
        zi2.w wVar = (zi2.w) lVar4.X0(zi2.w.class);
        if (wVar == null) {
            com.tencent.mars.xlog.Log.e(str, "mount failed: micCoverPlugin is null");
        } else {
            wmVar.f120217r = wVar;
            r45.tp1 tp1Var = (r45.tp1) ((je2.t) wVar.P0(je2.t.class)).f299268n.getValue();
            if (tp1Var != null) {
                wmVar.o(tp1Var);
            }
            wmVar.f120218s = new com.tencent.mm.plugin.finder.live.widget.jm(wmVar);
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData6 = ((je2.t) wVar.P0(je2.t.class)).f299268n;
            androidx.lifecycle.k0 k0Var = wmVar.f120218s;
            kotlin.jvm.internal.o.d(k0Var);
            liveMutableData6.observe(wVar, k0Var);
            com.tencent.mm.plugin.finder.live.util.y.m(wVar, null, null, new com.tencent.mm.plugin.finder.live.widget.lm(wVar, wmVar, null), 3, null);
            wmVar.p((om2.d0) ((kotlinx.coroutines.flow.h3) ((om2.g) wVar.P0(om2.g.class)).f346303g).getValue());
        }
        el2.r2 r2Var = this.I;
        r2Var.getClass();
        r2Var.f253899d.setOnClickListener(new el2.m2(r2Var));
        com.tencent.mm.plugin.finder.live.plugin.l lVar5 = r2Var.f253900e;
        ((mm2.c1) lVar5.P0(mm2.c1.class)).K1.observe(lVar5, new el2.n2(r2Var));
        el2.u2 u2Var = this.f111879J;
        com.tencent.mm.plugin.finder.live.plugin.l lVar6 = u2Var.f253922e;
        jf2.k0 k0Var2 = (jf2.k0) lVar6.U0(jf2.k0.class);
        if (k0Var2 == null || (liveMutableData = k0Var2.f299385t) == null) {
            return;
        }
        liveMutableData.f111660d = true;
        liveMutableData.observe(lVar6, new el2.t2(u2Var));
    }
}
