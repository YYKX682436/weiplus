package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class z10 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f120492a;

    /* renamed from: b, reason: collision with root package name */
    public final qo0.c f120493b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f120494c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f120495d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f120496e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f120497f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f120498g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.LiveBottomSheetPanel f120499h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f120500i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f120501j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f120502k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.FrameLayout f120503l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f120504m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f120505n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f120506o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerAdapter f120507p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f120508q;

    /* renamed from: r, reason: collision with root package name */
    public r45.yq1 f120509r;

    /* renamed from: s, reason: collision with root package name */
    public r45.fr1 f120510s;

    /* renamed from: t, reason: collision with root package name */
    public hq0.e0 f120511t;

    public z10(android.content.Context context, android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f120492a = root;
        this.f120493b = statusMonitor;
        this.f120494c = basePlugin;
        this.f120495d = "Finder.FinderLiveVisitorGameWidget";
        this.f120505n = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f120508q = arrayList;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.fpd);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f120498g = findViewById;
        this.f120496e = (android.widget.FrameLayout) root.findViewById(com.tencent.mm.R.id.f487595p45);
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.p47);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById2;
        this.f120497f = recyclerView;
        recyclerView.setItemViewCacheSize(30);
        this.f120502k = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f487594p44);
        this.f120501j = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f487596p46);
        this.f120503l = (android.widget.FrameLayout) root.findViewById(com.tencent.mm.R.id.p3z);
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.f487591p41);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f120499h = (com.tencent.mm.ui.widget.LiveBottomSheetPanel) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.f487593p43);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f120500i = findViewById4;
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f120499h;
        if (liveBottomSheetPanel == null) {
            kotlin.jvm.internal.o.o("container");
            throw null;
        }
        liveBottomSheetPanel.setOnVisibilityListener(new com.tencent.mm.plugin.finder.live.widget.u10(this));
        android.view.View view = this.f120498g;
        if (view == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        view.post(new com.tencent.mm.plugin.finder.live.widget.v10(this));
        android.view.View view2 = this.f120498g;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        view2.setOnClickListener(com.tencent.mm.plugin.finder.live.widget.n10.f119148d);
        android.widget.FrameLayout frameLayout = this.f120503l;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.o10(this));
        }
        android.view.View view3 = this.f120500i;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("emptySpace");
            throw null;
        }
        view3.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.p10(this));
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorGameTogetherWidget$4
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                r45.h41 h41Var;
                if (type == 1) {
                    return new cm2.n();
                }
                if (type != 2) {
                    if (type == 0) {
                        return new cm2.o();
                    }
                    com.tencent.mm.plugin.finder.live.widget.z10 z10Var = com.tencent.mm.plugin.finder.live.widget.z10.this;
                    return new cm2.s(z10Var.f120494c, z10Var.f120493b);
                }
                i95.m c17 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.r0 r0Var = (ml2.r0) c17;
                ml2.b4 b4Var = ml2.b4.E;
                cl0.g gVar = new cl0.g();
                gVar.o("type", 32);
                java.lang.String gVar2 = gVar.toString();
                cl0.g gVar3 = new cl0.g();
                com.tencent.mm.plugin.finder.live.widget.z10 z10Var2 = com.tencent.mm.plugin.finder.live.widget.z10.this;
                gVar3.h("click_id", java.util.UUID.randomUUID().toString());
                zl2.r4 r4Var = zl2.r4.f473950a;
                r45.a83 a83Var = ((mm2.c1) z10Var2.f120494c.P0(mm2.c1.class)).f328828j6;
                gVar3.o("game_type", r4Var.j3(a83Var != null ? a83Var.getInteger(2) : 0));
                r45.fr1 fr1Var = z10Var2.f120510s;
                gVar3.h("appid", (fr1Var == null || (h41Var = (r45.h41) fr1Var.getCustom(21)) == null) ? null : h41Var.getString(0));
                ml2.r0.hj(r0Var, b4Var, gVar2, 0L, null, null, gVar3.toString(), null, null, 220, null);
                com.tencent.mm.plugin.finder.live.widget.z10 z10Var3 = com.tencent.mm.plugin.finder.live.widget.z10.this;
                return new cm2.s(z10Var3.f120494c, z10Var3.f120493b);
            }
        }, arrayList, false);
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.live.widget.q10(this);
        this.f120507p = wxRecyclerAdapter;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f120497f;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("gameTogetherRv");
            throw null;
        }
        recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f120497f;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("gameTogetherRv");
            throw null;
        }
        recyclerView3.setAdapter(wxRecyclerAdapter);
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f120497f;
        if (recyclerView4 != null) {
            recyclerView4.i(new com.tencent.mm.plugin.finder.live.widget.r10(this));
        } else {
            kotlin.jvm.internal.o.o("gameTogetherRv");
            throw null;
        }
    }

    public final boolean a() {
        int i17 = ((mm2.c1) this.f120494c.P0(mm2.c1.class)).H2;
        java.lang.String str = this.f120495d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canShowTeamWidget, teamInfo: ");
        sb6.append(this.f120510s != null);
        sb6.append(", upMode: ");
        sb6.append(i17);
        sb6.append(", isAssist: ");
        sb6.append(((mm2.c1) this.f120494c.P0(mm2.c1.class)).T);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (this.f120510s == null || i17 == 0 || i17 == 1 || ((mm2.c1) this.f120494c.P0(mm2.c1.class)).T) {
            return false;
        }
        return !(((mm2.n0) this.f120494c.P0(mm2.n0.class)).f329273r);
    }

    public final void b(boolean z17, yz5.a aVar) {
        this.f120506o = true;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f120494c;
        pq5.g l17 = new ke2.u(((mm2.e1) lVar.P0(mm2.e1.class)).f328983m, ((mm2.e1) lVar.P0(mm2.e1.class)).f328988r.getLong(0), com.tencent.mm.protobuf.g.b(((mm2.e1) lVar.P0(mm2.e1.class)).f328985o), ((mm2.e1) lVar.P0(mm2.e1.class)).f328992v, 0, this.f120504m, z17, 16, null).l();
        l17.K(new com.tencent.mm.plugin.finder.live.widget.s10(this, aVar));
        android.view.ViewGroup viewGroup = this.f120492a;
        if (viewGroup.getContext() instanceof com.tencent.mm.ui.MMActivity) {
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.tencent.mm.ui.MMActivity) context);
        }
    }

    public final void c() {
        r45.h41 h41Var;
        int i17 = ((mm2.c1) this.f120494c.P0(mm2.c1.class)).H2;
        if (!((this.f120510s == null || i17 == 0 || i17 == 1) ? false : true) || ((mm2.c1) this.f120494c.P0(mm2.c1.class)).T) {
            return;
        }
        if (((mm2.n0) this.f120494c.P0(mm2.n0.class)).f329273r) {
            return;
        }
        this.f120508q.add(0, new cm2.p(2, null, null, null, this.f120510s, null, 46, null));
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.E;
        cl0.g gVar = new cl0.g();
        gVar.o("type", 32);
        java.lang.String gVar2 = gVar.toString();
        cl0.g gVar3 = new cl0.g();
        gVar3.h("click_id", java.util.UUID.randomUUID().toString());
        zl2.r4 r4Var = zl2.r4.f473950a;
        r45.a83 a83Var = ((mm2.c1) this.f120494c.P0(mm2.c1.class)).f328828j6;
        gVar3.o("game_type", r4Var.j3(a83Var != null ? a83Var.getInteger(2) : 0));
        r45.fr1 fr1Var = this.f120510s;
        gVar3.h("appid", (fr1Var == null || (h41Var = (r45.h41) fr1Var.getCustom(21)) == null) ? null : h41Var.getString(0));
        ml2.r0.hj(r0Var, b4Var, gVar2, 0L, null, null, gVar3.toString(), null, null, 220, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if ((r1 == null || r1.length() == 0) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if ((((mm2.n0) r4.f120494c.P0(mm2.n0.class)).f329273r) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r4 = this;
            r45.yq1 r0 = r4.f120509r
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Ld
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r2)
            r45.en6 r0 = (r45.en6) r0
            goto Le
        Ld:
            r0 = r1
        Le:
            if (r0 == 0) goto L8d
            r45.yq1 r0 = r4.f120509r
            if (r0 == 0) goto L24
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r2)
            r45.en6 r0 = (r45.en6) r0
            if (r0 == 0) goto L24
            r3 = 2
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r3)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) r0
            goto L25
        L24:
            r0 = r1
        L25:
            r3 = 0
            if (r0 != 0) goto L46
            r45.yq1 r0 = r4.f120509r
            if (r0 == 0) goto L38
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r2)
            r45.en6 r0 = (r45.en6) r0
            if (r0 == 0) goto L38
            java.lang.String r1 = r0.getString(r3)
        L38:
            if (r1 == 0) goto L43
            int r0 = r1.length()
            if (r0 != 0) goto L41
            goto L43
        L41:
            r0 = r3
            goto L44
        L43:
            r0 = r2
        L44:
            if (r0 != 0) goto L8d
        L46:
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r4.f120494c
            java.lang.Class<mm2.c1> r1 = mm2.c1.class
            androidx.lifecycle.c1 r0 = r0.P0(r1)
            mm2.c1 r0 = (mm2.c1) r0
            boolean r0 = r0.T
            if (r0 != 0) goto L67
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r4.f120494c
            java.lang.Class<mm2.n0> r1 = mm2.n0.class
            androidx.lifecycle.c1 r0 = r0.P0(r1)
            mm2.n0 r0 = (mm2.n0) r0
            boolean r0 = r0.f329273r
            if (r0 != r2) goto L64
            r0 = r2
            goto L65
        L64:
            r0 = r3
        L65:
            if (r0 == 0) goto L8d
        L67:
            android.widget.TextView r0 = r4.f120501j
            if (r0 != 0) goto L6c
            goto L6f
        L6c:
            r0.setVisibility(r3)
        L6f:
            android.widget.TextView r0 = r4.f120501j
            if (r0 != 0) goto L74
            goto L97
        L74:
            r45.yq1 r1 = r4.f120509r
            if (r1 == 0) goto L87
            com.tencent.mm.protobuf.f r1 = r1.getCustom(r2)
            r45.en6 r1 = (r45.en6) r1
            if (r1 == 0) goto L87
            java.lang.String r1 = r1.getString(r2)
            if (r1 == 0) goto L87
            goto L89
        L87:
            java.lang.String r1 = ""
        L89:
            r0.setText(r1)
            goto L97
        L8d:
            android.widget.TextView r0 = r4.f120501j
            if (r0 != 0) goto L92
            goto L97
        L92:
            r1 = 8
            r0.setVisibility(r1)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.z10.d():void");
    }

    public final void e() {
        android.widget.TextView textView;
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f120499h;
        if (liveBottomSheetPanel == null) {
            kotlin.jvm.internal.o.o("container");
            throw null;
        }
        if (!liveBottomSheetPanel.isShowing) {
            android.view.View view = this.f120498g;
            if (view == null) {
                kotlin.jvm.internal.o.o("rootView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget", "showEmptyTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget", "showEmptyTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel2 = this.f120499h;
            if (liveBottomSheetPanel2 == null) {
                kotlin.jvm.internal.o.o("container");
                throw null;
            }
            liveBottomSheetPanel2.f();
        }
        r45.yq1 yq1Var = this.f120509r;
        java.lang.String string = yq1Var != null ? yq1Var.getString(3) : null;
        if (!(string == null || string.length() == 0) && (textView = this.f120502k) != null) {
            r45.yq1 yq1Var2 = this.f120509r;
            textView.setText(yq1Var2 != null ? yq1Var2.getString(3) : null);
        }
        d();
        android.widget.TextView textView2 = this.f120502k;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        android.widget.FrameLayout frameLayout = this.f120496e;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    public final void f() {
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f120499h;
        if (liveBottomSheetPanel == null) {
            kotlin.jvm.internal.o.o("container");
            throw null;
        }
        if (!liveBottomSheetPanel.isShowing) {
            android.view.View view = this.f120498g;
            if (view == null) {
                kotlin.jvm.internal.o.o("rootView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget", "showRv", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget", "showRv", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel2 = this.f120499h;
            if (liveBottomSheetPanel2 == null) {
                kotlin.jvm.internal.o.o("container");
                throw null;
            }
            liveBottomSheetPanel2.f();
        }
        d();
        android.widget.TextView textView = this.f120502k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.FrameLayout frameLayout = this.f120496e;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    public final void g(boolean z17) {
        r45.h41 h41Var;
        java.lang.String str = null;
        if (!z17) {
            com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f120499h;
            if (liveBottomSheetPanel == null) {
                kotlin.jvm.internal.o.o("container");
                throw null;
            }
            if (!liveBottomSheetPanel.isShowing) {
                android.view.View view = this.f120498g;
                if (view == null) {
                    kotlin.jvm.internal.o.o("rootView");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel2 = this.f120499h;
                if (liveBottomSheetPanel2 == null) {
                    kotlin.jvm.internal.o.o("container");
                    throw null;
                }
                liveBottomSheetPanel2.f();
            }
            android.widget.TextView textView = this.f120502k;
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.widget.FrameLayout frameLayout = this.f120496e;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        }
        this.f120504m = null;
        this.f120505n = true;
        this.f120506o = false;
        b(false, new com.tencent.mm.plugin.finder.live.widget.x10(this, z17));
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.E;
        cl0.g gVar = new cl0.g();
        gVar.o("type", 31);
        java.lang.String gVar2 = gVar.toString();
        cl0.g gVar3 = new cl0.g();
        gVar3.h("click_id", java.util.UUID.randomUUID().toString());
        zl2.r4 r4Var = zl2.r4.f473950a;
        r45.a83 a83Var = ((mm2.c1) this.f120494c.P0(mm2.c1.class)).f328828j6;
        gVar3.o("game_type", r4Var.j3(a83Var != null ? a83Var.getInteger(2) : 0));
        r45.fr1 fr1Var = this.f120510s;
        if (fr1Var != null && (h41Var = (r45.h41) fr1Var.getCustom(21)) != null) {
            str = h41Var.getString(0);
        }
        gVar3.h("appid", str);
        ml2.r0.hj(r0Var, b4Var, gVar2, 0L, null, null, gVar3.toString(), null, null, 220, null);
    }
}
