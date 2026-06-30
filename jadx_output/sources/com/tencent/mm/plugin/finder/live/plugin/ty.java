package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ty extends com.tencent.mm.plugin.finder.live.plugin.l {
    public final android.content.res.Resources A;
    public final android.view.View B;
    public final android.widget.TextView C;
    public final android.widget.TextView D;
    public final android.widget.TextView E;
    public final android.view.View F;
    public final androidx.recyclerview.widget.RecyclerView G;
    public final com.tencent.mm.ui.widget.LiveBottomSheetPanel H;
    public final android.widget.ProgressBar I;

    /* renamed from: J, reason: collision with root package name */
    public final android.view.View f114483J;
    public final android.view.View K;
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveHonorView L;
    public final android.widget.TextView M;
    public final android.widget.TextView N;
    public final android.view.View P;
    public final android.view.View Q;
    public final bm2.n5 R;
    public final com.tencent.mm.ui.widget.RoundCornerRelativeLayout S;
    public final android.widget.ImageView T;
    public final android.widget.TextView U;
    public r45.xn1 V;
    public com.tencent.mm.ui.widget.dialog.k0 W;
    public com.tencent.mm.ui.widget.dialog.k0 X;
    public java.util.ArrayList Y;
    public int Z;

    /* renamed from: l1, reason: collision with root package name */
    public final int f114484l1;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f114485p;

    /* renamed from: p0, reason: collision with root package name */
    public final db5.t4 f114486p0;

    /* renamed from: p1, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveOnlineStateViewHotCardView f114487p1;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f114488q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f114489r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f114490s;

    /* renamed from: t, reason: collision with root package name */
    public final int f114491t;

    /* renamed from: u, reason: collision with root package name */
    public final int f114492u;

    /* renamed from: v, reason: collision with root package name */
    public final int f114493v;

    /* renamed from: w, reason: collision with root package name */
    public final int f114494w;

    /* renamed from: x, reason: collision with root package name */
    public final int f114495x;

    /* renamed from: x0, reason: collision with root package name */
    public final com.google.android.material.appbar.AppBarLayout f114496x0;

    /* renamed from: x1, reason: collision with root package name */
    public final java.util.Map f114497x1;

    /* renamed from: y, reason: collision with root package name */
    public final int f114498y;

    /* renamed from: y0, reason: collision with root package name */
    public final int f114499y0;

    /* renamed from: z, reason: collision with root package name */
    public int f114500z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty(android.view.ViewGroup root, zl2.u4 uiMode, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        android.view.ViewGroup.LayoutParams layoutParams;
        int i17;
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(uiMode, "uiMode");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f114485p = statusMonitor;
        this.f114488q = "Finder.FinderLiveMemberListPlugin";
        this.f114489r = "PORTRAIT_ACTION_GOTO_PROFILE_MEMBERLIST";
        this.f114490s = "PORTRAIT_ACTION_KEY_FINDER_USERNAME";
        this.f114491t = 1;
        this.f114492u = 10;
        this.f114493v = 11;
        this.f114494w = 12;
        this.f114495x = 13;
        this.f114498y = 14;
        int h07 = (int) (com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y * (ae2.in.f3688a.h0() / 100.0f));
        android.content.res.Resources resources = root.getContext().getResources();
        kotlin.jvm.internal.o.f(resources, "getResources(...)");
        this.A = resources;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f9p);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.B = findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.f9w);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.C = textView;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.f9r);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.D = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.f9l);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.view.View findViewById5 = root.findViewById(com.tencent.mm.R.id.f9k);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.E = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = root.findViewById(com.tencent.mm.R.id.f9m);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.F = findViewById6;
        android.view.View findViewById7 = root.findViewById(com.tencent.mm.R.id.f9j);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById7;
        this.G = recyclerView;
        android.view.View findViewById8 = root.findViewById(com.tencent.mm.R.id.f9h);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = (com.tencent.mm.ui.widget.LiveBottomSheetPanel) findViewById8;
        this.H = liveBottomSheetPanel;
        android.view.View findViewById9 = root.findViewById(com.tencent.mm.R.id.f9i);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById9;
        android.view.View findViewById10 = root.findViewById(com.tencent.mm.R.id.f9q);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.I = (android.widget.ProgressBar) findViewById10;
        android.view.View findViewById11 = root.findViewById(com.tencent.mm.R.id.f9g);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f114483J = findViewById11;
        android.view.View findViewById12 = root.findViewById(com.tencent.mm.R.id.f9n);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.K = findViewById12;
        android.view.View findViewById13 = root.findViewById(com.tencent.mm.R.id.f4r);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.L = (com.tencent.mm.plugin.finder.live.view.FinderLiveHonorView) findViewById13;
        android.view.View findViewById14 = root.findViewById(com.tencent.mm.R.id.f9x);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.M = (android.widget.TextView) findViewById14;
        android.view.View findViewById15 = root.findViewById(com.tencent.mm.R.id.f9v);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.N = (android.widget.TextView) findViewById15;
        android.view.View findViewById16 = root.findViewById(com.tencent.mm.R.id.r6h);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        this.P = findViewById16;
        android.view.View findViewById17 = root.findViewById(com.tencent.mm.R.id.f9d);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        this.Q = findViewById17;
        android.view.View findViewById18 = root.findViewById(com.tencent.mm.R.id.agx);
        kotlin.jvm.internal.o.f(findViewById18, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById18;
        android.content.Context context = R0().getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.content.res.Resources resources2 = root.getContext().getResources();
        kotlin.jvm.internal.o.f(resources2, "getResources(...)");
        bm2.n5 n5Var = new bm2.n5(uiMode, context, resources2, recyclerView, findViewById17, liveBottomSheetPanel, (mm2.c1) P0(mm2.c1.class), (mm2.f5) P0(mm2.f5.class), this);
        this.R = n5Var;
        android.view.View findViewById19 = root.findViewById(com.tencent.mm.R.id.f9u);
        kotlin.jvm.internal.o.f(findViewById19, "findViewById(...)");
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) findViewById19;
        this.S = roundCornerRelativeLayout;
        android.view.View findViewById20 = root.findViewById(com.tencent.mm.R.id.f9f);
        kotlin.jvm.internal.o.f(findViewById20, "findViewById(...)");
        this.T = (android.widget.ImageView) findViewById20;
        android.view.View findViewById21 = root.findViewById(com.tencent.mm.R.id.eqh);
        kotlin.jvm.internal.o.f(findViewById21, "findViewById(...)");
        this.U = (android.widget.TextView) findViewById21;
        this.Y = new java.util.ArrayList();
        this.f114486p0 = new com.tencent.mm.plugin.finder.live.plugin.ay(this);
        this.f114496x0 = (com.google.android.material.appbar.AppBarLayout) root.findViewById(com.tencent.mm.R.id.f9b);
        this.f114499y0 = i65.a.b(root.getContext(), 64);
        resources.getColor(com.tencent.mm.R.color.a9e);
        this.f114484l1 = resources.getColor(com.tencent.mm.R.color.f478494f);
        android.view.View findViewById22 = root.findViewById(com.tencent.mm.R.id.u2v);
        kotlin.jvm.internal.o.f(findViewById22, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.view.FinderLiveOnlineStateViewHotCardView finderLiveOnlineStateViewHotCardView = (com.tencent.mm.plugin.finder.live.view.FinderLiveOnlineStateViewHotCardView) findViewById22;
        this.f114487p1 = finderLiveOnlineStateViewHotCardView;
        android.view.ViewGroup.LayoutParams layoutParams2 = roundCornerRelativeLayout.getLayoutParams();
        int i18 = layoutParams2 != null ? layoutParams2.height : 0;
        this.f114500z = i18;
        if (i18 <= 0) {
            this.f114500z = resources.getDimensionPixelOffset(com.tencent.mm.R.dimen.f479731dn);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveMemberListPlugin", "initTitleGroupHeight:" + this.f114500z);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(root.getContext()));
        recyclerView.setAdapter(n5Var);
        int i19 = this.f114500z;
        android.view.ViewGroup viewGroup = this.f365323d;
        int c17 = com.tencent.mm.ui.bl.c(viewGroup.getContext());
        if (x0()) {
            liveBottomSheetPanel.getLayoutParams().width = com.tencent.mm.ui.bl.b(viewGroup.getContext()).y;
            liveBottomSheetPanel.setTranslationX(com.tencent.mm.ui.bl.b(viewGroup.getContext()).x);
            liveBottomSheetPanel.setForbidNestScroll(true);
            liveBottomSheetPanel.setOnClickListener(com.tencent.mm.plugin.finder.live.plugin.jx.f113171d);
            relativeLayout.getLayoutParams().height = com.tencent.mm.ui.bl.b(viewGroup.getContext()).y - i19;
            recyclerView.getLayoutParams().height = com.tencent.mm.ui.bl.b(viewGroup.getContext()).y - i19;
        } else {
            liveBottomSheetPanel.setTranslationY(com.tencent.mm.ui.bl.b(viewGroup.getContext()).y);
            liveBottomSheetPanel.getLayoutParams().height = h07;
            android.view.ViewGroup.LayoutParams layoutParams3 = relativeLayout.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin += c17;
            int i27 = (h07 - i19) - c17;
            relativeLayout.getLayoutParams().height = i27;
            recyclerView.getLayoutParams().height = i27;
        }
        if (!x0() && (layoutParams = imageView.getLayoutParams()) != null) {
            com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
            java.lang.System.nanoTime();
            boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            int i28 = a17.f197135a;
            if (!z17 && i28 > (i17 = a17.f197136b)) {
                i28 = i17;
            }
            layoutParams.height = (int) ((i28 * com.tencent.mars.cdn.CdnManager.kAppTypeTingImage) / 390.0f);
        }
        imageView.setImageDrawable(new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{android.graphics.Color.argb(30, 255, 195, 0), 0}));
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        finderLiveOnlineStateViewHotCardView.setClipToOutline(true);
        finderLiveOnlineStateViewHotCardView.setOutlineProvider(new com.tencent.mm.plugin.finder.live.plugin.gx(this));
        this.f114497x1 = new java.util.LinkedHashMap();
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.ty tyVar, boolean z17) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("kickMember:");
        r45.xn1 xn1Var = tyVar.V;
        java.lang.String str = null;
        sb6.append((xn1Var == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact2.getUsername());
        com.tencent.mars.xlog.Log.i(tyVar.f114488q, sb6.toString());
        dk2.xf W0 = tyVar.W0();
        if (W0 != null) {
            r45.xn1 xn1Var2 = tyVar.V;
            if (xn1Var2 != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) != null) {
                str = finderContact.getUsername();
            }
            ((dk2.r4) W0).w(str, z17, 2, new com.tencent.mm.plugin.finder.live.plugin.qx(tyVar));
        }
    }

    public final void A1(int i17, int i18) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("element", i18);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        if (zl2.r4.f473950a.w1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.H2, jSONObject2, null, 4, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (kotlin.jvm.internal.o.b(string != null ? string : "", this.f114489r)) {
            com.tencent.mm.plugin.finder.live.plugin.gy gyVar = new com.tencent.mm.plugin.finder.live.plugin.gy(this, bundle, obj, j17);
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            com.tencent.mm.sdk.platformtools.u3.i(gyVar, j17);
        }
    }

    @Override // qo0.a
    public boolean B0() {
        if (w0() != 0) {
            return false;
        }
        u1();
        if (this.f114485p.getLiveRole() != 1) {
            return true;
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.A;
        ml2.r3 r3Var = ml2.r3.f327900e;
        zy2.zb.y6(zbVar, z4Var, java.lang.String.valueOf(3), null, 4, null);
        return true;
    }

    public final void B1(int i17, java.lang.Integer num) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put(ya.b.SOURCE, 2);
        jSONObject.put("identity", num);
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        int i18 = 0;
        if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).R6()) {
            i18 = 1;
        }
        jSONObject.put("display_type", i18 ^ 1);
        jSONObject.put("sort_type", this.Z == 0 ? 1 : 2);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        if (zl2.r4.f473950a.w1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f328347d2, jSONObject2, null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.r0.hj((ml2.r0) c18, ml2.b4.F2, jSONObject2, 0L, null, null, null, null, null, 252, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0307  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C1(java.lang.Long r31) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ty.C1(java.lang.Long):void");
    }

    public final void D1(r45.x71 x71Var) {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        if (x71Var == null || (str = x71Var.getString(15)) == null) {
            str = null;
        } else {
            if (str.length() == 0) {
                str = zl2.r4.S(zl2.r4.f473950a, x71Var.getLong(12), 0, 2, null);
            }
        }
        java.lang.String str2 = str != null ? str : "";
        java.lang.String string = x71Var != null ? x71Var.getString(17) : null;
        java.lang.String string2 = x71Var != null ? x71Var.getString(18) : null;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("heatlimit showTitle isAnchorOrAssistantOrInviteeAnchor ");
        sb7.append(w1());
        sb7.append(", svrHeatStr:");
        sb7.append(str2);
        sb7.append(", heatValue:");
        sb7.append(x71Var != null ? java.lang.Long.valueOf(x71Var.getLong(12)) : null);
        sb7.append(", svrViewedMemberCountStr ");
        sb7.append(string);
        sb7.append(", svrOnlineCountStr ");
        sb7.append(string2);
        com.tencent.mars.xlog.Log.i(this.f114488q, sb7.toString());
        if (w0() == 0 && ((mm2.e1) P0(mm2.e1.class)).t7()) {
            if (string2 != null) {
                mm2.e1 e1Var = (mm2.e1) P0(mm2.e1.class);
                e1Var.D = string2;
                e1Var.s7();
            }
            com.tencent.mm.plugin.finder.live.plugin.kh khVar = (com.tencent.mm.plugin.finder.live.plugin.kh) X0(com.tencent.mm.plugin.finder.live.plugin.kh.class);
            if (khVar != null) {
                khVar.A1(kz5.b0.c(new jz5.l(3, null)), false, false);
            }
        }
        if (v1() && string2 != null) {
            if (!(string2.length() > 0)) {
                string2 = null;
            }
            if (string2 != null) {
                sb6.append(string2);
            }
        }
        android.view.ViewGroup viewGroup = this.f365323d;
        if (string != null) {
            if (!(string.length() > 0)) {
                string = null;
            }
            if (string != null) {
                if (sb6.length() > 0) {
                    sb6.append(" · ");
                }
                sb6.append(viewGroup.getContext().getString(com.tencent.mm.R.string.m9k, string));
            }
        }
        java.lang.String str3 = (r26.n0.N(str2) ^ true) && (!kotlin.jvm.internal.o.b(str2, "0") || v1()) ? str2 : null;
        if (str3 != null) {
            if (sb6.length() > 0) {
                sb6.append(" · ");
            }
            sb6.append(viewGroup.getContext().getString(com.tencent.mm.R.string.f491892ek4, str3));
        }
        this.C.setText(sb6.toString());
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
        if (i17 != 0) {
            ((mm2.e1) P0(mm2.e1.class)).D = "";
            this.R.y();
        } else {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((ml2.r0) c17).yk(3, (r13 & 2) != 0 ? null : null, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        this.L.getClass();
        bm2.n5 n5Var = this.R;
        n5Var.y();
        this.B.setOnClickListener(null);
        this.f114483J.setOnClickListener(null);
        this.E.setOnClickListener(null);
        this.K.setOnClickListener(null);
        this.H.setOnVisibilityListener(null);
        n5Var.C = null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    @Override // qo0.a
    public void s0(int i17, int i18, android.os.Bundle bundle) {
        boolean z17 = (((mm2.e1) P0(mm2.e1.class)).b7() && ((om2.l) P0(om2.l.class)).f346343h) ? false : true;
        int i19 = 16;
        if (!pm0.v.z(i18, 16) || !z17) {
            K0(8);
            return;
        }
        if (w0() != 0) {
            K0(0);
            nk2.l.f338021a.b(nk2.a.f337951d);
            if (bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_MEMBER_SKIP_LOADING") : false) {
                this.H.post(new com.tencent.mm.plugin.finder.live.plugin.jy(this));
                this.R.z();
                return;
            }
            this.I.setVisibility(0);
            this.D.setVisibility(8);
            android.view.View view = this.F;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "showMembersListLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "showMembersListLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.S.setVisibility(8);
            this.G.setVisibility(8);
            this.R.z();
            this.H.post(new com.tencent.mm.plugin.finder.live.plugin.ky(this));
            if (v1()) {
                i19 = 1;
            } else {
                if (!(((mm2.n0) P0(mm2.n0.class)).f329273r)) {
                    i19 = 2;
                }
            }
            int i27 = (this.Z == 1 && v1()) ? 3 : 0;
            this.R.L = this.Z == 1 && v1();
            dk2.xf W0 = W0();
            if (W0 != null) {
                ((dk2.r4) W0).B(i19, i27, new com.tencent.mm.plugin.finder.live.plugin.my(this));
            }
            if (!zl2.r4.f473950a.X1(S0()) || !((mm2.c1) P0(mm2.c1.class)).f328929z6) {
                this.L.setVisibility(8);
            } else {
                this.L.b();
                com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.ip0(this, null), 3, null);
            }
        }
    }

    public final void u1() {
        com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(this.H, null, 1, null);
    }

    public final boolean v1() {
        if (w1()) {
            return true;
        }
        return ((mm2.o4) P0(mm2.o4.class)).z7() && ((mm2.c1) P0(mm2.c1.class)).R4;
    }

    public final boolean w1() {
        if (zl2.r4.f473950a.w1() || ((mm2.c1) P0(mm2.c1.class)).T) {
            return true;
        }
        return ((mm2.n0) P0(mm2.n0.class)).f329273r;
    }

    public final void x1() {
        this.D.setVisibility(0);
        this.I.setVisibility(8);
        this.S.setVisibility(8);
        this.G.setVisibility(8);
        android.view.View view = this.F;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "onGetLiveOnlineMemberFail", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "onGetLiveOnlineMemberFail", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mars.xlog.Log.i(this.f114488q, "onGetLiveOnlineByRoomFail");
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y1(r45.x71 r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 1500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ty.y1(r45.x71, boolean):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        this.B.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.rx(this));
        this.f114483J.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.sx(this));
        this.E.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.tx(this));
        this.K.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.ux(this));
        this.H.setOnVisibilityListener(new com.tencent.mm.plugin.finder.live.plugin.vx(this));
        this.R.C = new com.tencent.mm.plugin.finder.live.plugin.wx(this);
        com.google.android.material.appbar.AppBarLayout appBarLayout = this.f114496x0;
        if (appBarLayout != null) {
            com.tencent.mm.plugin.finder.live.plugin.hx hxVar = new com.tencent.mm.plugin.finder.live.plugin.hx(this);
            hxVar.a(appBarLayout, 0);
            appBarLayout.a(hxVar);
        }
    }

    public final void z1(int i17) {
        int i18 = this.Z == 0 ? 1 : 2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("sort_type", i18);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        if (zl2.r4.f473950a.w1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.G2, jSONObject2, null, 4, null);
        }
    }
}
