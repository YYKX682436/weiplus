package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class s6 extends xt2.m6 implements jf2.i {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f119724d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f119725e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f119726f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f119727g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f119728h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f119729i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f119730m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f119731n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f119732o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f119733p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f119734q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f119735r;

    public s6(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f119724d = root;
        this.f119725e = statusMonitor;
        this.f119726f = basePlugin;
        this.f119727g = "Finder.FinderLiveAnchorMicEntranceWidget";
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f484541ek2);
        this.f119728h = findViewById;
        this.f119729i = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f484544ek5);
        android.widget.ImageView imageView = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.f484540ek1);
        this.f119730m = imageView;
        this.f119731n = root.findViewById(com.tencent.mm.R.id.f484543ek4);
        this.f119732o = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f484542ek3);
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.i2z);
        this.f119733p = findViewById2;
        this.f119734q = "anchorlive.bottom.connectmic";
        this.f119735r = "";
        android.graphics.drawable.Drawable drawable = root.getContext().getResources().getDrawable(com.tencent.mm.R.raw.finder_icons_filled_link_mic);
        com.tencent.mm.ui.uk.f(drawable, root.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
        imageView.setImageDrawable(drawable);
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.r6(this));
        ll2.e eVar = ll2.e.f319133a;
        java.lang.Object context = root.getContext();
        ll2.e.l(eVar, context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null, "anchorlive.bottom.connectmic", findViewById2, null, null, 24, null);
    }

    @Override // jf2.h
    public void b() {
        this.f119724d.setVisibility(0);
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f119728h;
    }

    @Override // jf2.h
    public void g() {
        this.f119724d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f119724d;
    }

    @Override // jf2.h
    public boolean i() {
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f119726f;
        boolean F1 = zl2.r4.F1(lVar.S0());
        android.view.ViewGroup viewGroup = this.f119724d;
        if (F1) {
            n(8);
        } else {
            mm2.e1 e1Var = (mm2.e1) dk2.ef.f233372a.i(mm2.e1.class);
            boolean z17 = e1Var != null && e1Var.f7();
            com.tencent.mars.xlog.Log.i(this.f119727g, "#checkVisible isScreenCastGameMode=" + z17);
            if (z17) {
                n(8);
            } else {
                if (sn0.b.f409964e2 != null) {
                    viewGroup.setVisibility(8);
                } else if (zl2.r4.f473950a.N1(lVar.S0()) || !((((mm2.o4) lVar.P0(mm2.o4.class)).k7() || ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((mm2.o4) lVar.P0(mm2.o4.class)).H).getValue()).booleanValue()) && !((mm2.c1) lVar.P0(mm2.c1.class)).L9() && ((mm2.c1) lVar.P0(mm2.c1.class)).a8())) {
                    viewGroup.setVisibility(8);
                } else {
                    if (viewGroup.getVisibility() != 0) {
                        i95.m c17 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        zy2.zb.I8((zy2.zb) c17, ml2.u1.f328101y, null, null, null, null, null, false, 126, null);
                        i95.m c18 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c18, "getService(...)");
                        zy2.zb.I8((zy2.zb) c18, ml2.u1.Q, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
                        ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.B1, "", -1, -1);
                    }
                    if (((mm2.c1) lVar.P0(mm2.c1.class)).f328778a5) {
                        viewGroup.setVisibility(8);
                    } else {
                        viewGroup.setVisibility(0);
                    }
                }
            }
        }
        return viewGroup.getVisibility() == 0;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.widget.ImageView linkMicIcon = this.f119730m;
        kotlin.jvm.internal.o.f(linkMicIcon, "linkMicIcon");
        return linkMicIcon;
    }

    public final void k() {
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f119726f;
        java.util.List list = ((mm2.o4) lVar.P0(mm2.o4.class)).f329318o;
        kotlin.jvm.internal.o.f(list, "<get-linkMicUserList>(...)");
        boolean m17 = m(list);
        android.widget.ImageView imageView = this.f119730m;
        android.view.View view = this.f119728h;
        android.view.ViewGroup viewGroup = this.f119724d;
        if (!m17 && !((mm2.o4) lVar.P0(mm2.o4.class)).D && ((mm2.o4) lVar.P0(mm2.o4.class)).Z == null) {
            java.util.List list2 = ((mm2.o4) lVar.P0(mm2.o4.class)).f329327v;
            kotlin.jvm.internal.o.f(list2, "<get-audienceLinkMicUserList>(...)");
            if (!m(list2)) {
                java.util.List list3 = ((mm2.o4) lVar.P0(mm2.o4.class)).f329324s;
                kotlin.jvm.internal.o.f(list3, "<get-anchorPkMicUserList>(...)");
                if (!m(list3)) {
                    android.graphics.drawable.Drawable drawable = viewGroup.getContext().getResources().getDrawable(l());
                    com.tencent.mm.ui.uk.f(drawable, viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
                    imageView.setImageDrawable(drawable);
                    view.setBackground(viewGroup.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a6z));
                    com.tencent.mm.plugin.finder.live.plugin.c4 c4Var = (com.tencent.mm.plugin.finder.live.plugin.c4) lVar.X0(com.tencent.mm.plugin.finder.live.plugin.c4.class);
                    if (c4Var != null) {
                        int i17 = c4Var.f112614r;
                        if (view != null) {
                            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.qf0(view, i17));
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
        android.graphics.drawable.Drawable drawable2 = viewGroup.getContext().getResources().getDrawable(l());
        com.tencent.mm.ui.uk.f(drawable2, viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
        imageView.setImageDrawable(drawable2);
        view.setBackground(viewGroup.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481762a70));
    }

    public final int l() {
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f119726f;
        if (((mm2.e1) lVar.P0(mm2.e1.class)).b7()) {
            return com.tencent.mm.R.raw.icon_join_singing_filled;
        }
        if (((mm2.e1) lVar.P0(mm2.e1.class)).Z6()) {
            return com.tencent.mm.R.raw.call_on_filled;
        }
        dk2.u4 u4Var = ((mm2.o4) lVar.P0(mm2.o4.class)).Z;
        return u4Var != null ? (u4Var.k() || u4Var.g()) ? com.tencent.mm.R.raw.icons_live_connectmic_pk_icon : com.tencent.mm.R.raw.finder_icons_filled_link_mic : com.tencent.mm.R.raw.finder_icons_filled_link_mic;
    }

    public final boolean m(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            km2.q qVar = (km2.q) obj;
            if (true ^ (qVar.A > 0 && c01.id.c() > qVar.A)) {
                arrayList.add(obj);
            }
        }
        return !arrayList.isEmpty();
    }

    public final void n(int i17) {
        boolean N1 = zl2.r4.f473950a.N1(this.f119726f.S0());
        android.view.ViewGroup viewGroup = this.f119724d;
        if (!N1) {
            viewGroup.setVisibility(i17);
        } else {
            viewGroup.setVisibility(8);
            com.tencent.mars.xlog.Log.w(this.f119727g, "setVisible return for isDisableLinkMic");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.s6.o():void");
    }

    @Override // jf2.h
    public int type() {
        return 10;
    }
}
