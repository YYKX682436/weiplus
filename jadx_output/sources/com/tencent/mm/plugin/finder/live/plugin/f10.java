package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class f10 extends com.tencent.mm.plugin.finder.live.plugin.l {
    public final androidx.lifecycle.k0 A;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f112480p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f112481q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f112482r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f112483s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.RelativeLayout f112484t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f112485u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f112486v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f112487w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f112488x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f112489y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f112490z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f10(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112480p = statusMonitor;
        this.f112481q = "Finder.FinderLiveNewVisitorPostPlugin";
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.fq6);
        this.f112482r = findViewById;
        android.widget.TextView postHint = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f484855fq3);
        this.f112483s = postHint;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) root.findViewById(com.tencent.mm.R.id.tqr);
        this.f112484t = relativeLayout;
        this.f112485u = "";
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dae);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f112486v = string;
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.cle);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        this.f112487w = string2;
        java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.cl_);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        this.f112488x = string3;
        java.lang.String string4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.cy_);
        kotlin.jvm.internal.o.f(string4, "getString(...)");
        this.f112489y = string4;
        java.lang.String string5 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.evd);
        kotlin.jvm.internal.o.f(string5, "getString(...)");
        this.f112490z = string5;
        this.A = new com.tencent.mm.plugin.finder.live.plugin.b10(this);
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.x00(this, root));
        if (relativeLayout != null) {
            ym5.a1.h(relativeLayout, new com.tencent.mm.plugin.finder.live.plugin.y00(this));
        }
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.z00(this));
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        r4Var.e(this, true);
        kotlin.jvm.internal.o.f(postHint, "postHint");
        com.tencent.mm.ui.fk.a(postHint);
        postHint.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
        r4Var.n3(root, "Finder.FinderLiveNewVisitorPostPlugin", false, true);
        if (r4Var.w1()) {
            android.view.ViewGroup viewGroup = this.f365323d;
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            int i17 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            com.tencent.mm.plugin.finder.live.plugin.a10 a10Var = new com.tencent.mm.plugin.finder.live.plugin.a10(this, i17);
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.a1.u(viewGroup, a10Var);
            z1(i17);
            viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), v1((int) viewGroup.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479672c9)));
        }
    }

    public static final boolean t1(com.tencent.mm.plugin.finder.live.plugin.f10 f10Var) {
        java.lang.String str;
        r45.qm1 qm1Var = (r45.qm1) ((mm2.e0) f10Var.P0(mm2.e0.class)).f328970m.getValue();
        if (qm1Var == null || (str = qm1Var.getString(1)) == null) {
            str = "";
        }
        boolean z17 = str.length() == 0;
        android.view.ViewGroup viewGroup = f10Var.f365323d;
        if (z17) {
            db5.t7.makeText(viewGroup.getContext(), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.cya), 0).show();
        } else {
            com.tencent.mm.plugin.finder.live.util.x xVar = com.tencent.mm.plugin.finder.live.util.x.f115742a;
            if (xVar.g(str)) {
                db5.t7.makeText(viewGroup.getContext(), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.cyb), 0).show();
            } else if (xVar.h(str)) {
                db5.t7.makeText(viewGroup.getContext(), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.cyc), 0).show();
            } else {
                if (((mm2.e0) f10Var.P0(mm2.e0.class)).f328969i) {
                    return true;
                }
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eby);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                db5.t7.g(viewGroup.getContext(), string);
            }
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            super.K0(i17);
        } else {
            this.f365323d.setVisibility(8);
            com.tencent.mars.xlog.Log.w(this.f112481q, "setVisible return for isTeenMode");
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        fe2.q qVar;
        kotlin.jvm.internal.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 27 || ordinal == 28) {
            K0(8);
            return;
        }
        if (ordinal == 123) {
            u1("");
            return;
        }
        android.view.View view = this.f112482r;
        if (ordinal == 127) {
            java.lang.String string = bundle != null ? bundle.getString("PARAM_FINDER_LIVE_AUTO_INPUT_MSG") : null;
            this.f112485u = string != null ? string : "";
            if (com.tencent.mm.plugin.finder.assist.o0.f102420a.a(S0()) && (qVar = (fe2.q) X0(fe2.q.class)) != null) {
                qVar.w1(this.f112481q);
            }
            view.performClick();
            return;
        }
        if (ordinal == 187) {
            if (((mm2.u0) P0(mm2.u0.class)).f329445h) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).ak(1, 6, kz5.b1.e(new jz5.l(ya.b.SOURCE, "1")));
                return;
            }
            return;
        }
        if (ordinal == 243) {
            ((mm2.e0) P0(mm2.e0.class)).f328970m.observe(this, this.A);
            return;
        }
        if (ordinal != 245) {
            return;
        }
        boolean z17 = bundle != null && bundle.getBoolean("isShow");
        android.widget.RelativeLayout relativeLayout = this.f112484t;
        if (z17) {
            if (relativeLayout != null) {
                relativeLayout.setVisibility(x1() ? 0 : 8);
            }
            view.requestLayout();
        } else {
            if (relativeLayout != null) {
                relativeLayout.setVisibility(x1() ? 0 : 8);
            }
            this.f365323d.requestLayout();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        android.widget.RelativeLayout relativeLayout = this.f112484t;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(x1() ? 0 : 8);
        }
        this.f365323d.requestLayout();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.g0) P0(mm2.g0.class)).U6();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u1(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.o.g(r7, r0)
            boolean r0 = r6.y1()
            android.widget.TextView r1 = r6.f112483s
            if (r0 == 0) goto L25
            java.lang.Class<mm2.j2> r0 = mm2.j2.class
            androidx.lifecycle.c1 r0 = r6.P0(r0)
            mm2.j2 r0 = (mm2.j2) r0
            boolean r2 = r6.x0()
            boolean r0 = r0.O6(r2)
            if (r0 != 0) goto L25
            java.lang.String r7 = r6.f112489y
            r1.setText(r7)
            return
        L25:
            boolean r0 = r6.w1()
            r2 = 0
            java.lang.Class<mm2.c1> r3 = mm2.c1.class
            if (r0 == 0) goto L7d
            java.lang.Class<mm2.u0> r0 = mm2.u0.class
            androidx.lifecycle.c1 r0 = r6.P0(r0)
            mm2.u0 r0 = (mm2.u0) r0
            boolean r4 = r0.f329444g
            r5 = 1
            if (r4 == 0) goto L44
            r45.i60 r0 = r0.f329443f
            if (r0 == 0) goto L4d
            java.lang.String r0 = r0.getString(r5)
            goto L4e
        L44:
            r45.i60 r0 = r0.f329443f
            if (r0 == 0) goto L4d
            java.lang.String r0 = r0.getString(r2)
            goto L4e
        L4d:
            r0 = 0
        L4e:
            if (r0 == 0) goto L58
            int r4 = r0.length()
            if (r4 != 0) goto L57
            goto L58
        L57:
            r5 = r2
        L58:
            if (r5 != 0) goto L5b
            goto L79
        L5b:
            zl2.r4 r0 = zl2.r4.f473950a
            gk2.e r4 = r6.S0()
            boolean r0 = r0.W1(r4)
            if (r0 == 0) goto L6a
            java.lang.String r0 = r6.f112488x
            goto L79
        L6a:
            androidx.lifecycle.c1 r0 = r6.P0(r3)
            mm2.c1 r0 = (mm2.c1) r0
            boolean r0 = r0.T
            if (r0 == 0) goto L77
            java.lang.String r0 = r6.f112487w
            goto L79
        L77:
            java.lang.String r0 = r6.f112486v
        L79:
            r1.setText(r0)
            goto L82
        L7d:
            java.lang.String r0 = r6.f112490z
            r1.setText(r0)
        L82:
            android.widget.RelativeLayout r0 = r6.f112484t
            if (r0 != 0) goto L87
            goto L93
        L87:
            boolean r1 = r6.x1()
            if (r1 == 0) goto L8e
            goto L90
        L8e:
            r2 = 8
        L90:
            r0.setVisibility(r2)
        L93:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = " riskControlEnableComment:"
            r0.append(r7)
            androidx.lifecycle.c1 r7 = r6.P0(r3)
            mm2.c1 r7 = (mm2.c1) r7
            boolean r7 = r7.f328884t
            r0.append(r7)
            java.lang.String r7 = ",enableLiveRoomComment:"
            r0.append(r7)
            androidx.lifecycle.c1 r7 = r6.P0(r3)
            mm2.c1 r7 = (mm2.c1) r7
            boolean r7 = r7.f328902w
            r0.append(r7)
            java.lang.String r7 = ",enableCustomerComment:"
            r0.append(r7)
            androidx.lifecycle.c1 r7 = r6.P0(r3)
            mm2.c1 r7 = (mm2.c1) r7
            boolean r7 = r7.f328896v
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = r6.f112481q
            com.tencent.mars.xlog.Log.i(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.f10.u1(java.lang.String):void");
    }

    public final int v1(int i17) {
        android.view.ViewGroup viewGroup = this.f365323d;
        if (i65.a.q(viewGroup.getContext()) <= 1.0f) {
            return i17;
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return (int) r4Var.s0(context, i17);
    }

    public final boolean w1() {
        return !zl2.r4.f473950a.J1(S0()) && ((mm2.c1) P0(mm2.c1.class)).f328884t && ((mm2.c1) P0(mm2.c1.class)).f328902w && ((mm2.c1) P0(mm2.c1.class)).f328896v;
    }

    public final boolean x1() {
        ae2.in inVar = ae2.in.f3688a;
        return (w1() || y1()) && (((java.lang.Number) ae2.in.H3.r()).intValue() == 1);
    }

    public final boolean y1() {
        return com.tencent.mm.plugin.finder.assist.o0.f102420a.a(S0()) && ((mm2.e0) P0(mm2.e0.class)).P6();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        super.z0();
        com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.d10(this, null), 3, null);
        jf2.k0 k0Var = (jf2.k0) U0(jf2.k0.class);
        if (k0Var == null || (liveMutableData = k0Var.f299384s) == null) {
            return;
        }
        liveMutableData.f111660d = true;
        liveMutableData.observe(this, new com.tencent.mm.plugin.finder.live.plugin.e10(this));
    }

    public final void z1(int i17) {
        if (x0()) {
            return;
        }
        if ((sn0.b.f409964e2 != null) || ((mm2.c1) P0(mm2.c1.class)).O7()) {
            return;
        }
        android.view.ViewGroup viewGroup = this.f365323d;
        int c17 = com.tencent.mm.ui.bl.c(viewGroup.getContext());
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = v1(i17 + c17);
        com.tencent.mars.xlog.Log.i(this.f112481q, "updateAnchorMarginBottom navigationHeight: " + c17);
    }
}
