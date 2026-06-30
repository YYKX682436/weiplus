package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class v3 extends com.tencent.mm.plugin.finder.live.plugin.l {
    public final android.widget.TextView A;
    public final android.view.View B;
    public final android.widget.TextView C;
    public final android.view.View D;
    public final android.widget.TextView E;
    public final android.view.View F;
    public final android.widget.ImageView G;
    public final android.widget.TextView H;
    public final android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public final android.view.View f114642J;
    public final android.widget.TextView K;
    public final com.tencent.mm.plugin.finder.live.util.FinderLivePushReplaceLayout L;
    public final jz5.g M;
    public final jz5.g N;
    public boolean P;
    public int Q;
    public long R;
    public km2.b S;
    public com.tencent.mm.protocal.protobuf.FinderObject T;
    public com.tencent.mm.plugin.finder.live.widget.pu U;
    public com.tencent.mm.plugin.finder.live.widget.l8 V;
    public com.tencent.mm.plugin.finder.live.widget.wt W;
    public com.tencent.mm.plugin.finder.live.widget.xt X;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f114643p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f114644q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f114645r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.ViewGroup f114646s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.ImageView f114647t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f114648u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f114649v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.LinearLayout f114650w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.TextView f114651x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.View f114652y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.ImageView f114653z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(android.view.ViewGroup root, qo0.c statueMonitor) {
        super(root, statueMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statueMonitor, "statueMonitor");
        this.f114643p = statueMonitor;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.i5j);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.i4w);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f114644q = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.if_);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f114645r = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.i66);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f114646s = (android.view.ViewGroup) findViewById4;
        android.view.View findViewById5 = root.findViewById(com.tencent.mm.R.id.aac);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById5;
        this.f114647t = imageView;
        android.view.View findViewById6 = root.findViewById(com.tencent.mm.R.id.f482977tg);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f114648u = findViewById6;
        android.view.View findViewById7 = root.findViewById(com.tencent.mm.R.id.f485566i53);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        android.view.View findViewById8 = root.findViewById(com.tencent.mm.R.id.u_x);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f114649v = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = root.findViewById(com.tencent.mm.R.id.f485568i56);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f114650w = (android.widget.LinearLayout) findViewById9;
        android.view.View findViewById10 = root.findViewById(com.tencent.mm.R.id.f485567i55);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f114651x = (android.widget.TextView) findViewById10;
        android.view.View findViewById11 = root.findViewById(com.tencent.mm.R.id.gqg);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f114652y = findViewById11;
        android.view.View findViewById12 = root.findViewById(com.tencent.mm.R.id.s2a);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f114653z = (android.widget.ImageView) findViewById12;
        android.view.View findViewById13 = root.findViewById(com.tencent.mm.R.id.rbz);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.A = (android.widget.TextView) findViewById13;
        this.B = root.findViewById(com.tencent.mm.R.id.r8x);
        this.C = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f485564ru1);
        this.D = root.findViewById(com.tencent.mm.R.id.f485565ru2);
        this.E = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.rbx);
        android.view.View findViewById14 = root.findViewById(com.tencent.mm.R.id.f483032ur);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.F = findViewById14;
        android.view.View findViewById15 = root.findViewById(com.tencent.mm.R.id.f483033us);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.G = (android.widget.ImageView) findViewById15;
        android.view.View findViewById16 = root.findViewById(com.tencent.mm.R.id.f483035uu);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        this.H = (android.widget.TextView) findViewById16;
        android.view.View findViewById17 = root.findViewById(com.tencent.mm.R.id.f483034ut);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        this.I = (android.widget.TextView) findViewById17;
        android.view.View findViewById18 = root.findViewById(com.tencent.mm.R.id.f482978th);
        kotlin.jvm.internal.o.f(findViewById18, "findViewById(...)");
        android.view.View findViewById19 = root.findViewById(com.tencent.mm.R.id.scs);
        kotlin.jvm.internal.o.f(findViewById19, "findViewById(...)");
        this.f114642J = findViewById19;
        android.view.View findViewById20 = root.findViewById(com.tencent.mm.R.id.sct);
        kotlin.jvm.internal.o.f(findViewById20, "findViewById(...)");
        this.K = (android.widget.TextView) findViewById20;
        android.view.View findViewById21 = root.findViewById(com.tencent.mm.R.id.scr);
        kotlin.jvm.internal.o.f(findViewById21, "findViewById(...)");
        this.L = (com.tencent.mm.plugin.finder.live.util.FinderLivePushReplaceLayout) findViewById21;
        this.M = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.r1(root));
        this.N = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.s1(root));
        this.Q = -1;
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) findViewById).getPaint(), 0.8f);
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(root.getContext(), com.tencent.mm.R.raw.icons_filled_close, -1));
        imageView.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.i1(this));
        ((android.view.ViewGroup) findViewById7).setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.j1(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u1(com.tencent.mm.plugin.finder.live.plugin.v3 r7, java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof com.tencent.mm.plugin.finder.live.plugin.z1
            if (r0 == 0) goto L16
            r0 = r9
            com.tencent.mm.plugin.finder.live.plugin.z1 r0 = (com.tencent.mm.plugin.finder.live.plugin.z1) r0
            int r1 = r0.f115254g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f115254g = r1
            goto L1b
        L16:
            com.tencent.mm.plugin.finder.live.plugin.z1 r0 = new com.tencent.mm.plugin.finder.live.plugin.z1
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.f115252e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f115254g
            r3 = 0
            java.lang.Class<df2.v0> r4 = df2.v0.class
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L40
            if (r2 == r6) goto L38
            if (r2 != r5) goto L30
            kotlin.ResultKt.throwOnFailure(r9)
            goto L72
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.f115251d
            com.tencent.mm.plugin.finder.live.plugin.v3 r7 = (com.tencent.mm.plugin.finder.live.plugin.v3) r7
            kotlin.ResultKt.throwOnFailure(r9)
            goto L58
        L40:
            kotlin.ResultKt.throwOnFailure(r9)
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r9 = r7.U0(r4)
            df2.v0 r9 = (df2.v0) r9
            if (r9 == 0) goto L74
            r0.f115251d = r7
            r0.f115254g = r6
            r45.yg7 r2 = r45.yg7.FinderLiveImgSource_Unknown
            java.lang.Object r9 = r9.d7(r8, r2, r3, r0)
            if (r9 != r1) goto L58
            goto L76
        L58:
            r45.lw1 r9 = (r45.lw1) r9
            if (r9 == 0) goto L74
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r7 = r7.U0(r4)
            df2.v0 r7 = (df2.v0) r7
            if (r7 == 0) goto L74
            r8 = 0
            r0.f115251d = r8
            r0.f115254g = r5
            r8 = 8
            java.lang.Object r9 = r7.b7(r9, r3, r8, r0)
            if (r9 != r1) goto L72
            goto L76
        L72:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
        L74:
            jz5.f0 r1 = jz5.f0.f302826a
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.v3.u1(com.tencent.mm.plugin.finder.live.plugin.v3, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void v1(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, boolean z17, boolean z18, boolean z19, boolean z27, yz5.p pVar) {
        v3Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "[setLongFeedGen] needDanmu = " + z17 + ", onlyMember = " + z18 + ",genHighlight = " + z19 + ", enableAutoGen = " + z27);
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, 0);
        r45.r02 r02Var = new r45.r02();
        r02Var.set(0, 1);
        r02Var.set(1, 0);
        r02Var.set(2, java.lang.Integer.valueOf(z17 ? 1 : 0));
        r02Var.set(3, java.lang.Integer.valueOf(z18 ? 1 : 0));
        r02Var.set(4, java.lang.Integer.valueOf(z19 ? 1 : 0));
        r02Var.set(5, 0);
        r02Var.set(6, java.lang.Integer.valueOf(z27 ? 1 : 0));
        hx0Var.set(1, com.tencent.mm.protobuf.g.b(r02Var.toByteArray()));
        v3Var.t1(hx0Var, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w1(com.tencent.mm.plugin.finder.live.plugin.v3 r7, km2.b r8, kotlin.coroutines.Continuation r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof com.tencent.mm.plugin.finder.live.plugin.p3
            if (r0 == 0) goto L16
            r0 = r9
            com.tencent.mm.plugin.finder.live.plugin.p3 r0 = (com.tencent.mm.plugin.finder.live.plugin.p3) r0
            int r1 = r0.f113825g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f113825g = r1
            goto L1b
        L16:
            com.tencent.mm.plugin.finder.live.plugin.p3 r0 = new com.tencent.mm.plugin.finder.live.plugin.p3
            r0.<init>(r7, r9)
        L1b:
            r6 = r0
            java.lang.Object r9 = r6.f113823e
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f113825g
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r7 = r6.f113822d
            com.tencent.mm.plugin.finder.live.plugin.v3 r7 = (com.tencent.mm.plugin.finder.live.plugin.v3) r7
            kotlin.ResultKt.throwOnFailure(r9)
            goto L69
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.ResultKt.throwOnFailure(r9)
            r45.nw1 r8 = r8.f309070t
            if (r8 == 0) goto L4f
            r9 = 44
            com.tencent.mm.protobuf.f r8 = r8.getCustom(r9)
            r45.i72 r8 = (r45.i72) r8
            if (r8 == 0) goto L4f
            r9 = 12
            long r8 = r8.getLong(r9)
            goto L51
        L4f:
            r8 = 0
        L51:
            java.lang.Class<zy2.b6> r1 = zy2.b6.class
            i95.m r1 = i95.n0.c(r1)
            zy2.b6 r1 = (zy2.b6) r1
            r4 = 0
            r5 = 0
            r6.f113822d = r7
            r6.f113825g = r2
            c61.l7 r1 = (c61.l7) r1
            r2 = r8
            java.lang.Object r9 = r1.pl(r2, r4, r5, r6)
            if (r9 != r0) goto L69
            goto L6f
        L69:
            com.tencent.mm.protocal.protobuf.FinderObject r9 = (com.tencent.mm.protocal.protobuf.FinderObject) r9
            r7.T = r9
            jz5.f0 r0 = jz5.f0.f302826a
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.v3.w1(com.tencent.mm.plugin.finder.live.plugin.v3, km2.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void x1(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, int i17) {
        v3Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "updateReplayStatus " + i17);
        km2.b bVar = v3Var.S;
        if (bVar != null) {
            r45.nw1 nw1Var = bVar.f309070t;
            if (nw1Var != null) {
                nw1Var.set(31, java.lang.Integer.valueOf(i17));
            }
            v3Var.E1(bVar);
        }
    }

    public static final void z1(android.widget.LinearLayout linearLayout, java.util.List list) {
        int i17 = list.size() > 1 ? 24 : 32;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.ag1 ag1Var = (r45.ag1) it.next();
            java.lang.String string = ag1Var.getString(1);
            if (string != null) {
                android.widget.ImageView imageView = new android.widget.ImageView(linearLayout.getContext());
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i65.a.b(imageView.getContext(), i17), i65.a.b(imageView.getContext(), i17));
                if (linearLayout.getChildCount() != 0) {
                    layoutParams.setMarginStart(i65.a.b(imageView.getContext(), 6));
                }
                imageView.setLayoutParams(layoutParams);
                zl2.r4 r4Var = zl2.r4.f473950a;
                int integer = ag1Var.getInteger(0);
                mn2.g1 g1Var = mn2.g1.f329975a;
                if (integer == 1 || integer == 2) {
                    g1Var.l().c(new mn2.n(string, null, 2, null), imageView, g1Var.h(mn2.f1.f329961o));
                } else {
                    g1Var.a().c(new mn2.n(string, null, 2, null), imageView, g1Var.h(mn2.f1.f329957h));
                }
                linearLayout.addView(imageView);
            }
        }
    }

    @Override // qo0.a
    public void A0(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.finder.live.widget.pu puVar = this.U;
        if (puVar != null) {
            puVar.y(i17, i18, intent);
        }
    }

    public final android.view.View A1() {
        java.lang.Object value = ((jz5.n) this.M).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    @Override // qo0.a
    public boolean B0() {
        if (this.f114643p.getLiveRole() != 1) {
            return false;
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Lj(ml2.i1.f327549g, "");
        return false;
    }

    public final android.view.View B1() {
        java.lang.Object value = ((jz5.n) this.N).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final java.lang.String C1(boolean z17) {
        boolean z18 = ((je2.a0) P0(je2.a0.class)).f299197i;
        android.view.ViewGroup viewGroup = this.f365323d;
        if (z18) {
            java.lang.String string = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.d3q);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        if (mm2.g0.Q6((mm2.g0) P0(mm2.g0.class), null, 1, null)) {
            java.lang.String string2 = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.d3p);
            kotlin.jvm.internal.o.d(string2);
            return string2;
        }
        java.lang.String string3 = z17 ? viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.nny) : viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.d3o);
        kotlin.jvm.internal.o.d(string3);
        return string3;
    }

    public final void D1(km2.b bVar) {
        r45.z74 z74Var;
        r45.l71 l71Var = bVar.f309072v;
        java.lang.Long valueOf = (l71Var == null || (z74Var = (r45.z74) l71Var.getCustom(21)) == null) ? null : java.lang.Long.valueOf(z74Var.getLong(0));
        if (valueOf == null) {
            com.tencent.mars.xlog.Log.w("Finder.LiveAnchorAfterPlugin", "prepareNoticePanel: displayFlag is null");
            android.view.View view = this.B;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin", "prepareNoticePanel", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/AnchorFinishInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin", "prepareNoticePanel", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/AnchorFinishInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        boolean z17 = pm0.v.z((int) valueOf.longValue(), 1);
        com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "prepareNoticePanel: canShowNoticePanel=" + z17);
        if (!z17) {
            android.view.View view2 = this.B;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin", "prepareNoticePanel", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/AnchorFinishInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin", "prepareNoticePanel", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/AnchorFinishInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = this.B;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin", "prepareNoticePanel", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/AnchorFinishInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin", "prepareNoticePanel", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/AnchorFinishInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView noticeCreateBtn = this.C;
        kotlin.jvm.internal.o.f(noticeCreateBtn, "noticeCreateBtn");
        com.tencent.mm.ui.fk.a(noticeCreateBtn);
        com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.t2(H1(), this, null), 3, null);
    }

    public final void E1(km2.b bVar) {
        com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", " liveInfo:" + cm2.a.f43328a.y(((mm2.e1) P0(mm2.e1.class)).f328988r) + ", haveJoinLive:" + ((mm2.c1) P0(mm2.c1.class)).S + " replaySwitchStatus=" + bVar.f309068r);
        com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.v2(bVar, this, null), 3, null);
    }

    public final void F1(int i17) {
        r45.fd2 fd2Var;
        java.lang.String string;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("diagnosis_id", this.Q);
        java.lang.String str = "";
        jSONObject.put("browse_time", i17 == 3 ? java.lang.String.valueOf(java.lang.System.currentTimeMillis() - this.R) : "");
        kotlinx.coroutines.flow.j2 j2Var = ((mm2.g1) P0(mm2.g1.class)).f329072m;
        if (j2Var != null && (fd2Var = (r45.fd2) ((kotlinx.coroutines.flow.h3) j2Var).getValue()) != null && (string = fd2Var.getString(1)) != null) {
            str = string;
        }
        jSONObject.put("anchor_category", str);
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        ml2.i1 i1Var = ml2.i1.f327550h;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        j0Var.Lj(i1Var, jSONObject2);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    public final void G1(java.lang.String str, android.widget.ImageView imageView, int i17) {
        if (str == null || str.length() == 0) {
            if (i17 > 0) {
                pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.c3(imageView, this, i17));
            }
        } else {
            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128356f));
            com.tencent.mm.plugin.finder.live.plugin.b3 b3Var = new com.tencent.mm.plugin.finder.live.plugin.b3(imageView, i17, str, this);
            a17.getClass();
            a17.f447873d = b3Var;
            a17.f();
        }
    }

    public final java.lang.String H1() {
        if (!((mm2.n0) P0(mm2.n0.class)).f329273r) {
            return ((mm2.c1) P0(mm2.c1.class)).f328852o;
        }
        android.content.Context context = this.f113324f.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return xy2.c.e(context);
    }

    public final void I1(final yz5.a aVar) {
        com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "[show] livingToFinish=" + this.P);
        boolean z17 = this.P;
        android.widget.ImageView imageView = this.f114647t;
        if (z17 || zl2.r4.f473950a.W1(S0())) {
            android.view.ViewGroup viewGroup = this.f365323d;
            viewGroup.setAlpha(0.0f);
            K0(0);
            imageView.setVisibility(0);
            viewGroup.animate().alpha(1.0f).setDuration(300L).withEndAction(aVar != null ? new java.lang.Runnable(aVar) { // from class: com.tencent.mm.plugin.finder.live.plugin.d3

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f112225d;

                {
                    kotlin.jvm.internal.o.g(aVar, "function");
                    this.f112225d = aVar;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f112225d.invoke();
                }
            } : null).start();
        } else {
            K0(0);
            imageView.setVisibility(0);
            if (aVar != null) {
                aVar.invoke();
            }
        }
        if (this.f114643p.getLiveRole() == 1) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Lj(ml2.i1.f327547e, "");
        }
        N1(null);
    }

    @Override // qo0.a
    public void J0() {
        if (this.R > 0) {
            F1(3);
            this.R = 0L;
        }
    }

    public final void J1(km2.b bVar) {
        java.lang.String string;
        com.tencent.mm.feature.finder.live.v4 v4Var = (com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class);
        r45.nw1 nw1Var = bVar.f309070t;
        java.lang.String str = null;
        boolean z17 = true;
        boolean z18 = mm2.g0.Q6((mm2.g0) P0(mm2.g0.class), null, 1, null) || !v4Var.aj(nw1Var != null ? nw1Var.getInteger(37) : 0);
        if (!z18) {
            r45.sl1 sl1Var = bVar.f309071u;
            if ((sl1Var != null ? sl1Var.getInteger(0) : 0) != 0) {
                if ((sl1Var != null ? sl1Var.getInteger(1) : 0) != 0) {
                    z17 = false;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "showGenReplayPanel cantShowDanmuEntrance: " + z18 + "，cantShowHighLightLayout: " + z17);
        if (this.U == null) {
            android.content.Context context = this.f365323d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.live.widget.pu puVar = new com.tencent.mm.plugin.finder.live.widget.pu(context, S0().f272475i, false, null, 12, null);
            puVar.f119431m = z18;
            puVar.f119430i = z17;
            r45.l71 l71Var = bVar.f309072v;
            if (l71Var == null || (string = l71Var.getString(34)) == null) {
                r45.pf2 pf2Var = bVar.f309073w;
                if (pf2Var != null) {
                    str = pf2Var.getString(12);
                }
            } else {
                str = string;
            }
            if (str == null) {
                str = "";
            }
            puVar.f119432n = str;
            this.U = puVar;
            puVar.f119433o = new com.tencent.mm.plugin.finder.live.plugin.j3(this, bVar);
        }
        com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "replayGenWidget show");
        com.tencent.mm.plugin.finder.live.widget.pu puVar2 = this.U;
        if (puVar2 != null) {
            puVar2.z(((mm2.c1) P0(mm2.c1.class)).t7(), C1(false));
        }
    }

    public final void K1(java.lang.String str) {
        com.tencent.mm.plugin.finder.live.util.i.f115540a.b(((mm2.c1) P0(mm2.c1.class)).f328852o, ((mm2.c1) P0(mm2.c1.class)).t7(), this.f114646s, null);
    }

    public final void L1() {
        if (((mm2.c1) P0(mm2.c1.class)).N7()) {
            return;
        }
        this.f114646s.setBackgroundColor(this.f365323d.getContext().getResources().getColor(com.tencent.mm.R.color.f479059on));
        ya2.b2 b17 = ((mm2.c1) P0(mm2.c1.class)).f328852o != null ? ya2.h.f460484a.b(((mm2.c1) P0(mm2.c1.class)).f328852o) : null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(b17 != null ? b17.field_avatarUrl : null)) {
            java.lang.String str = b17 != null ? b17.field_avatarUrl : null;
            if (str == null) {
                str = "";
            }
            K1(str);
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "update bg fail,contact is null!");
        dk2.xf W0 = W0();
        if (W0 != null) {
            ((dk2.r4) W0).x(((mm2.c1) P0(mm2.c1.class)).f328852o, new com.tencent.mm.plugin.finder.live.plugin.q3(this), new com.tencent.mm.plugin.finder.live.plugin.r3(this));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        km2.b bVar;
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 27) {
            this.P = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_MANUAL") : false;
        } else if (ordinal == 112 && ((mm2.c1) P0(mm2.c1.class)).U7() && (bVar = this.S) != null) {
            D1(bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x06ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x098e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x09c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0a4c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0ae6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0aed  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0b07  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0b0d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0aea  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x09ab  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x099b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x072f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M1(km2.b r45) {
        /*
            Method dump skipped, instructions count: 2894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.v3.M1(km2.b):void");
    }

    public final void N1(km2.b bVar) {
        r45.l71 l71Var;
        r45.ug1 ug1Var;
        int i17;
        boolean d17 = ya2.h.f460484a.d("Entrance_LiveComplete");
        android.widget.TextView textView = this.f114645r;
        if (bVar != null && (l71Var = bVar.f309072v) != null && (ug1Var = (r45.ug1) l71Var.getCustom(31)) != null) {
            if (d17) {
                i17 = 0;
                if (ug1Var.getBoolean(0)) {
                    df2.od.f230952w.d(S0(), ml2.u1.L2, null);
                    df2.od odVar = (df2.od) U0(df2.od.class);
                    if (odVar != null) {
                        com.tencent.mm.plugin.finder.live.plugin.t3 t3Var = new com.tencent.mm.plugin.finder.live.plugin.t3(this);
                        com.tencent.mm.plugin.finder.live.widget.rx rxVar = odVar.f230954n;
                        if (rxVar != null) {
                            rxVar.h0(t3Var);
                        }
                    }
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.Long valueOf = java.lang.Long.valueOf(c01.id.c());
                    android.content.Context context = this.f113324f.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    g0Var.d(22748, 3, 1, valueOf, xy2.c.e(context));
                    textView.setVisibility(i17);
                }
            }
            i17 = 8;
            textView.setVisibility(i17);
        }
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.u3(this));
    }

    public final void P1(boolean z17) {
        df2.od odVar = (df2.od) U0(df2.od.class);
        boolean z18 = false;
        if (odVar != null && odVar.c7(r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_CREATE_NOTICE_COUNT)) {
            z18 = true;
        }
        if (!z17 || z18) {
            android.view.ViewGroup viewGroup = this.f113324f;
            java.lang.String string = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.mpo);
            android.widget.TextView textView = this.E;
            textView.setText(string);
            textView.setTextColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.f478554ao));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1(r45.hx0 hx0Var, yz5.p pVar) {
        ek2.r1 r1Var = new ek2.r1(((mm2.e1) P0(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) P0(mm2.e1.class)).f328983m, 0, hx0Var);
        android.content.Context context = this.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r1Var.t(context, null, 0L);
        pm0.v.T(r1Var.l(), new com.tencent.mm.plugin.finder.live.plugin.k1(this, pVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y1(r45.zf1 r27) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.v3.y1(r45.zf1):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        super.z0();
        df2.ud udVar = (df2.ud) U0(df2.ud.class);
        if (udVar == null || (liveMutableData = udVar.f231511n) == null) {
            return;
        }
        liveMutableData.f111660d = true;
        liveMutableData.observe(this, new com.tencent.mm.plugin.finder.live.plugin.o2(this));
    }
}
