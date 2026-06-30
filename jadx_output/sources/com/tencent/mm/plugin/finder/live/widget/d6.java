package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class d6 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f118059a;

    /* renamed from: b, reason: collision with root package name */
    public final qo0.c f118060b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f118061c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f118062d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f118063e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f118064f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f118065g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerAdapter f118066h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f118067i;

    /* renamed from: j, reason: collision with root package name */
    public r45.yq1 f118068j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.FrameLayout f118069k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f118070l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f118071m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f118072n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f118073o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.LiveBottomSheetPanel f118074p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f118075q;

    /* renamed from: r, reason: collision with root package name */
    public hq0.e0 f118076r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f118077s;

    public d6(android.content.Context context, android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f118059a = root;
        this.f118060b = statusMonitor;
        this.f118061c = basePlugin;
        this.f118062d = "Finder.FinderLiveAnchorGameWidget";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f118067i = arrayList;
        this.f118071m = true;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.ejr);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f118073o = findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.f483011u8);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById2;
        this.f118075q = recyclerView;
        recyclerView.setItemViewCacheSize(30);
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.f483006u3);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f118074p = (com.tencent.mm.ui.widget.LiveBottomSheetPanel) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.f483007u4);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f118077s = findViewById4;
        this.f118063e = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f483010u7);
        this.f118064f = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f483008u5);
        this.f118065g = (android.widget.FrameLayout) root.findViewById(com.tencent.mm.R.id.f483009u6);
        this.f118069k = (android.widget.FrameLayout) root.findViewById(com.tencent.mm.R.id.f483004u1);
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f118074p;
        if (liveBottomSheetPanel == null) {
            kotlin.jvm.internal.o.o("container");
            throw null;
        }
        liveBottomSheetPanel.setOnVisibilityListener(new com.tencent.mm.plugin.finder.live.widget.t5(this));
        android.view.View view = this.f118073o;
        if (view == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        view.post(new com.tencent.mm.plugin.finder.live.widget.u5(this));
        android.widget.TextView textView = this.f118063e;
        if (textView != null) {
            ym5.a1.h(textView, new com.tencent.mm.plugin.finder.live.widget.v5(this));
        }
        android.view.View view2 = this.f118073o;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        view2.setOnClickListener(com.tencent.mm.plugin.finder.live.widget.m5.f119041d);
        android.widget.FrameLayout frameLayout = this.f118069k;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.n5(this));
        }
        android.view.View view3 = this.f118077s;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("emptySpace");
            throw null;
        }
        view3.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.o5(this));
        android.widget.TextView textView2 = this.f118063e;
        if (textView2 != null) {
            textView2.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.p5(this, context));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget$5
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == 1) {
                    return new cm2.n();
                }
                if (type != 0 && type == 2) {
                    if (com.tencent.mm.plugin.finder.live.widget.d6.this.g()) {
                        r45.xq1 xq1Var = ((mm2.c1) com.tencent.mm.plugin.finder.live.widget.d6.this.f118061c.S0().a(mm2.c1.class)).C2;
                        i95.m c17 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        zy2.zb zbVar = (zy2.zb) c17;
                        ml2.z4 z4Var = ml2.z4.A1;
                        cl0.g gVar = new cl0.g();
                        com.tencent.mm.plugin.finder.live.widget.d6 d6Var = com.tencent.mm.plugin.finder.live.widget.d6.this;
                        gVar.o("result", 5);
                        gVar.h("appid", xq1Var != null ? xq1Var.getString(2) : null);
                        zl2.r4 r4Var = zl2.r4.f473950a;
                        r45.a83 a83Var = ((mm2.c1) d6Var.f118061c.P0(mm2.c1.class)).f328828j6;
                        gVar.o("game_type", r4Var.j3(a83Var != null ? a83Var.getInteger(2) : 0));
                        gVar.h("team_type", xq1Var != null ? java.lang.Integer.valueOf(xq1Var.getInteger(1)) : null);
                        zy2.zb.y6(zbVar, z4Var, gVar.toString(), null, 4, null);
                    } else {
                        r45.n73 n73Var = (r45.n73) ((kotlinx.coroutines.flow.h3) ((mm2.g1) com.tencent.mm.plugin.finder.live.widget.d6.this.f118061c.P0(mm2.g1.class)).f329071i).getValue();
                        r45.z53 z53Var = n73Var != null ? (r45.z53) n73Var.getCustom(1) : null;
                        com.tencent.mm.plugin.finder.assist.x2 x2Var = com.tencent.mm.plugin.finder.assist.x2.f102672a;
                        cl0.g gVar2 = new cl0.g();
                        gVar2.o("result", 5);
                        gVar2.h("appid", z53Var != null ? z53Var.getString(0) : null);
                        gVar2.o("game_type", 2 - (z53Var != null ? z53Var.getInteger(13) : 0));
                        gVar2.h("team_type", z53Var != null ? java.lang.Integer.valueOf(z53Var.getInteger(12)) : null);
                        x2Var.c(22, gVar2);
                    }
                    return new cm2.q();
                }
                return new cm2.o();
            }
        }, arrayList, false);
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.live.widget.q5(this);
        this.f118066h = wxRecyclerAdapter;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f118075q;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("gameTogetherRv");
            throw null;
        }
        recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f118075q;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("gameTogetherRv");
            throw null;
        }
        recyclerView3.setAdapter(wxRecyclerAdapter);
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f118075q;
        if (recyclerView4 != null) {
            recyclerView4.i(new com.tencent.mm.plugin.finder.live.widget.r5(this));
        } else {
            kotlin.jvm.internal.o.o("gameTogetherRv");
            throw null;
        }
    }

    public static final void a(com.tencent.mm.plugin.finder.live.widget.d6 d6Var) {
        r45.y63 y63Var;
        java.util.LinkedList list;
        java.lang.String str = d6Var.f118062d;
        com.tencent.mars.xlog.Log.i(str, "insertGameWidget");
        d6Var.i();
        r45.yq1 yq1Var = d6Var.f118068j;
        if (yq1Var == null || (y63Var = (r45.y63) yq1Var.getCustom(0)) == null || (list = y63Var.getList(0)) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                com.tencent.mars.xlog.Log.i(str, "insertGameWidget is null: false, size: " + arrayList.size() + ' ');
                boolean isEmpty = arrayList.isEmpty() ^ true;
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = d6Var.f118066h;
                java.util.ArrayList arrayList2 = d6Var.f118067i;
                if (isEmpty) {
                    int size = arrayList2.size();
                    arrayList2.addAll(arrayList);
                    if (wxRecyclerAdapter != null) {
                        wxRecyclerAdapter.notifyItemRangeInserted(size, arrayList.size());
                    }
                }
                if (d6Var.f118071m) {
                    return;
                }
                r45.yq1 yq1Var2 = d6Var.f118068j;
                arrayList2.add(new cm2.p(0, null, null, null, null, yq1Var2 != null ? yq1Var2.getString(3) : null, 30, null));
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyItemInserted(arrayList2.size());
                    return;
                }
                return;
            }
            r45.x63 x63Var = (r45.x63) it.next();
            hq0.e0 e0Var = d6Var.f118076r;
            if (e0Var == null) {
                kotlin.jvm.internal.o.o("gameDynamicCardFrameSetRoot");
                throw null;
            }
            arrayList.add(new cm2.p(1, x63Var, e0Var, null, null, null, 56, null));
        }
    }

    public static final void b(com.tencent.mm.plugin.finder.live.widget.d6 d6Var) {
        r45.xq1 xq1Var;
        java.util.ArrayList arrayList;
        android.widget.TextView textView;
        r45.y63 y63Var;
        java.util.LinkedList<r45.x63> list;
        java.lang.String str = d6Var.f118062d;
        com.tencent.mars.xlog.Log.i(str, "refreshWidget");
        java.util.ArrayList arrayList2 = d6Var.f118067i;
        int size = arrayList2.size();
        arrayList2.clear();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = d6Var.f118066h;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyItemRangeRemoved(0, size);
        }
        if (d6Var.g()) {
            xq1Var = ((mm2.c1) d6Var.f118061c.S0().a(mm2.c1.class)).C2;
        } else {
            r45.yq1 yq1Var = d6Var.f118068j;
            xq1Var = yq1Var != null ? (r45.xq1) yq1Var.getCustom(2) : null;
        }
        r45.yq1 yq1Var2 = d6Var.f118068j;
        if (yq1Var2 == null || (y63Var = (r45.y63) yq1Var2.getCustom(0)) == null || (list = y63Var.getList(0)) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (r45.x63 x63Var : list) {
                hq0.e0 e0Var = d6Var.f118076r;
                if (e0Var == null) {
                    kotlin.jvm.internal.o.o("gameDynamicCardFrameSetRoot");
                    throw null;
                }
                arrayList.add(new cm2.p(1, x63Var, e0Var, null, null, null, 56, null));
            }
        }
        d6Var.i();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isLiving: ");
        sb6.append(d6Var.g());
        sb6.append(", playTogetherInfo: ");
        sb6.append(d6Var.f118068j != null);
        sb6.append(", gameInfo: ");
        sb6.append(arrayList != null);
        sb6.append(", size: ");
        sb6.append(arrayList != null ? arrayList.size() : 0);
        sb6.append(" teamInfo is null : ");
        sb6.append(xq1Var == null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if ((arrayList != null ? arrayList.size() : 0) > 0 || d6Var.c()) {
            d6Var.d();
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
            }
            if (!d6Var.f118071m) {
                r45.yq1 yq1Var3 = d6Var.f118068j;
                arrayList2.add(new cm2.p(0, null, null, null, null, yq1Var3 != null ? yq1Var3.getString(3) : null, 30, null));
            }
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
            }
            if ((arrayList != null ? arrayList.size() : 0) == 0) {
                d6Var.l();
                return;
            }
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("wording: ");
        r45.yq1 yq1Var4 = d6Var.f118068j;
        sb7.append(yq1Var4 != null ? yq1Var4.getString(3) : null);
        com.tencent.mars.xlog.Log.i(str, sb7.toString());
        r45.yq1 yq1Var5 = d6Var.f118068j;
        java.lang.String string = yq1Var5 != null ? yq1Var5.getString(3) : null;
        if (((string == null || string.length() == 0) ? 1 : 0) == 0 && (textView = d6Var.f118064f) != null) {
            r45.yq1 yq1Var6 = d6Var.f118068j;
            textView.setText(yq1Var6 != null ? yq1Var6.getString(3) : null);
        }
        d6Var.k();
    }

    public static void h(com.tencent.mm.plugin.finder.live.widget.d6 d6Var, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        r45.z53 z53Var;
        boolean z19 = (i17 & 1) != 0 ? false : z17;
        boolean z27 = (i17 & 2) != 0 ? false : z18;
        d6Var.getClass();
        java.lang.String str = null;
        if (!z27) {
            d6Var.f118070l = null;
            d6Var.f118071m = true;
            d6Var.f118072n = false;
        }
        if (!z19 && !z27) {
            com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = d6Var.f118074p;
            if (liveBottomSheetPanel == null) {
                kotlin.jvm.internal.o.o("container");
                throw null;
            }
            if (!liveBottomSheetPanel.isShowing) {
                liveBottomSheetPanel.f();
            }
            android.widget.TextView textView = d6Var.f118064f;
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.widget.FrameLayout frameLayout = d6Var.f118065g;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            android.widget.TextView textView2 = d6Var.f118063e;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        d6Var.f118072n = true;
        boolean g17 = d6Var.g();
        android.view.ViewGroup viewGroup = d6Var.f118059a;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = d6Var.f118061c;
        if (g17) {
            pq5.g l17 = new ke2.u(((mm2.e1) lVar.P0(mm2.e1.class)).f328983m, ((mm2.e1) lVar.P0(mm2.e1.class)).f328988r.getLong(0), com.tencent.mm.protobuf.g.b(((mm2.e1) lVar.P0(mm2.e1.class)).f328985o), ((mm2.e1) lVar.P0(mm2.e1.class)).f328992v, 1, d6Var.f118070l, z27).l();
            l17.K(new com.tencent.mm.plugin.finder.live.widget.x5(d6Var, z27, z19));
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.tencent.mm.ui.MMActivity) context);
        } else {
            r45.n73 n73Var = (r45.n73) ((kotlinx.coroutines.flow.h3) ((mm2.g1) lVar.P0(mm2.g1.class)).f329071i).getValue();
            if (n73Var != null && (z53Var = (r45.z53) n73Var.getCustom(1)) != null) {
                str = z53Var.getString(0);
            }
            if (str == null) {
                str = "";
            }
            pq5.g l18 = new ke2.y(str, 0, true, d6Var.f118070l, z27, null, 32, null).l();
            l18.K(new com.tencent.mm.plugin.finder.live.widget.w5(d6Var, z27, z19));
            android.content.Context context2 = viewGroup.getContext();
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l18.f((com.tencent.mm.ui.MMActivity) context2);
        }
        if (!d6Var.g()) {
            com.tencent.mm.plugin.finder.assist.x2 x2Var = com.tencent.mm.plugin.finder.assist.x2.f102672a;
            cl0.g gVar = new cl0.g();
            gVar.o("result", 1);
            x2Var.c(22, gVar);
            return;
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.A1;
        cl0.g gVar2 = new cl0.g();
        gVar2.o("result", 1);
        zy2.zb.y6(zbVar, z4Var, gVar2.toString(), null, 4, null);
    }

    public final boolean c() {
        r45.xq1 xq1Var;
        java.util.LinkedList list;
        r45.t63 t63Var;
        java.util.LinkedList list2;
        if (g()) {
            xq1Var = ((mm2.c1) this.f118061c.S0().a(mm2.c1.class)).C2;
        } else {
            r45.yq1 yq1Var = this.f118068j;
            xq1Var = yq1Var != null ? (r45.xq1) yq1Var.getCustom(2) : null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canShowTeamWidget, isLiving: ");
        sb6.append(g());
        sb6.append(", notNull: ");
        sb6.append((xq1Var != null ? (r45.t63) xq1Var.getCustom(0) : null) != null);
        sb6.append(", size: ");
        sb6.append((xq1Var == null || (t63Var = (r45.t63) xq1Var.getCustom(0)) == null || (list2 = t63Var.getList(0)) == null) ? 0 : list2.size());
        sb6.append(", setting: ");
        sb6.append(xq1Var != null ? java.lang.Integer.valueOf(xq1Var.getInteger(1)) : null);
        com.tencent.mars.xlog.Log.i(this.f118062d, sb6.toString());
        if ((xq1Var != null ? (r45.t63) xq1Var.getCustom(0) : null) == null) {
            return false;
        }
        r45.t63 t63Var2 = (r45.t63) xq1Var.getCustom(0);
        return ((t63Var2 == null || (list = t63Var2.getList(0)) == null) ? 0 : list.size()) > 0 && xq1Var.getInteger(1) != 0;
    }

    public final void d() {
        r45.xq1 xq1Var;
        if (g()) {
            xq1Var = ((mm2.c1) this.f118061c.S0().a(mm2.c1.class)).C2;
        } else {
            r45.yq1 yq1Var = this.f118068j;
            xq1Var = yq1Var != null ? (r45.xq1) yq1Var.getCustom(2) : null;
        }
        r45.xq1 xq1Var2 = xq1Var;
        if (c()) {
            this.f118067i.add(0, new cm2.p(2, null, null, xq1Var2, null, null, 54, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if ((r1 == null || r1.length() == 0) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r4 = this;
            r45.yq1 r0 = r4.f118068j
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Ld
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r2)
            r45.en6 r0 = (r45.en6) r0
            goto Le
        Ld:
            r0 = r1
        Le:
            if (r0 == 0) goto L6c
            r45.yq1 r0 = r4.f118068j
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
            r45.yq1 r0 = r4.f118068j
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
            if (r0 != 0) goto L6c
        L46:
            android.widget.TextView r0 = r4.f118063e
            if (r0 != 0) goto L4b
            goto L4e
        L4b:
            r0.setVisibility(r3)
        L4e:
            android.widget.TextView r0 = r4.f118063e
            if (r0 != 0) goto L53
            goto L76
        L53:
            r45.yq1 r1 = r4.f118068j
            if (r1 == 0) goto L66
            com.tencent.mm.protobuf.f r1 = r1.getCustom(r2)
            r45.en6 r1 = (r45.en6) r1
            if (r1 == 0) goto L66
            java.lang.String r1 = r1.getString(r2)
            if (r1 == 0) goto L66
            goto L68
        L66:
            java.lang.String r1 = ""
        L68:
            r0.setText(r1)
            goto L76
        L6c:
            android.widget.TextView r0 = r4.f118063e
            if (r0 != 0) goto L71
            goto L76
        L71:
            r1 = 8
            r0.setVisibility(r1)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.d6.e():void");
    }

    public final int f(int i17, java.util.List list) {
        java.util.Iterator it = list.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            if (((r45.u24) it.next()).getInteger(1) == i17) {
                return i18;
            }
            i18++;
        }
        return -1;
    }

    public final boolean g() {
        return dk2.ef.f233372a.x();
    }

    public final void i() {
        r45.y63 y63Var;
        java.util.LinkedList list;
        r45.y63 y63Var2;
        java.util.LinkedList list2;
        r45.en6 en6Var;
        r45.xq1 xq1Var;
        r45.t63 t63Var;
        java.util.LinkedList list3;
        r45.xq1 xq1Var2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("teamInfo: isnull: ");
        r45.yq1 yq1Var = this.f118068j;
        int i17 = 0;
        sb6.append((yq1Var != null ? (r45.xq1) yq1Var.getCustom(2) : null) == null);
        sb6.append(", lastJoin: ");
        r45.yq1 yq1Var2 = this.f118068j;
        sb6.append((yq1Var2 == null || (xq1Var2 = (r45.xq1) yq1Var2.getCustom(2)) == null) ? null : java.lang.Integer.valueOf(xq1Var2.getInteger(1)));
        sb6.append(", size: ");
        r45.yq1 yq1Var3 = this.f118068j;
        sb6.append((yq1Var3 == null || (xq1Var = (r45.xq1) yq1Var3.getCustom(2)) == null || (t63Var = (r45.t63) xq1Var.getCustom(0)) == null || (list3 = t63Var.getList(0)) == null) ? null : java.lang.Integer.valueOf(list3.size()));
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f118062d;
        com.tencent.mars.xlog.Log.i(str, sb7);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("cornerInfo: wording");
        r45.yq1 yq1Var4 = this.f118068j;
        sb8.append((yq1Var4 == null || (en6Var = (r45.en6) yq1Var4.getCustom(1)) == null) ? null : en6Var.getString(1));
        com.tencent.mars.xlog.Log.i(str, sb8.toString());
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("bottomWording: ");
        r45.yq1 yq1Var5 = this.f118068j;
        sb9.append(yq1Var5 != null ? yq1Var5.getString(3) : null);
        com.tencent.mars.xlog.Log.i(str, sb9.toString());
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("playTogetherList: ");
        r45.yq1 yq1Var6 = this.f118068j;
        sb10.append((yq1Var6 != null ? (r45.y63) yq1Var6.getCustom(0) : null) == null);
        sb10.append(", itemList size: ");
        r45.yq1 yq1Var7 = this.f118068j;
        sb10.append((yq1Var7 == null || (y63Var2 = (r45.y63) yq1Var7.getCustom(0)) == null || (list2 = y63Var2.getList(0)) == null) ? null : java.lang.Integer.valueOf(list2.size()));
        com.tencent.mars.xlog.Log.i(str, sb10.toString());
        r45.yq1 yq1Var8 = this.f118068j;
        if (yq1Var8 == null || (y63Var = (r45.y63) yq1Var8.getCustom(0)) == null || (list = y63Var.getList(0)) == null) {
            return;
        }
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mars.xlog.Log.i(str, "index: " + i17 + ", item: " + ((r45.x63) obj).getString(2));
            i17 = i18;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j() {
        r45.xq1 xq1Var;
        java.util.ArrayList arrayList;
        android.widget.TextView textView;
        r45.y63 y63Var;
        java.util.LinkedList<r45.x63> list;
        java.lang.String str = this.f118062d;
        com.tencent.mars.xlog.Log.i(str, "resumeWidget");
        if (g()) {
            xq1Var = ((mm2.c1) this.f118061c.S0().a(mm2.c1.class)).C2;
        } else {
            r45.yq1 yq1Var = this.f118068j;
            xq1Var = yq1Var != null ? (r45.xq1) yq1Var.getCustom(2) : null;
        }
        r45.yq1 yq1Var2 = this.f118068j;
        if (yq1Var2 == null || (y63Var = (r45.y63) yq1Var2.getCustom(0)) == null || (list = y63Var.getList(0)) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (r45.x63 x63Var : list) {
                hq0.e0 e0Var = this.f118076r;
                if (e0Var == null) {
                    kotlin.jvm.internal.o.o("gameDynamicCardFrameSetRoot");
                    throw null;
                }
                arrayList.add(new cm2.p(1, x63Var, e0Var, null, null, null, 56, null));
            }
        }
        i();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isLiving: ");
        sb6.append(g());
        sb6.append(", playTogetherInfo: ");
        sb6.append(this.f118068j != null);
        sb6.append(", gameInfo: ");
        sb6.append(arrayList != null);
        sb6.append(", size: ");
        sb6.append(arrayList != null ? arrayList.size() : 0);
        sb6.append(" teamInfo is null : ");
        sb6.append(xq1Var == null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        int size = arrayList != null ? arrayList.size() : 0;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f118066h;
        java.util.ArrayList arrayList2 = this.f118067i;
        if (size <= 0 && !c()) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("wording: ");
            r45.yq1 yq1Var3 = this.f118068j;
            sb7.append(yq1Var3 != null ? yq1Var3.getString(3) : null);
            com.tencent.mars.xlog.Log.i(str, sb7.toString());
            r45.yq1 yq1Var4 = this.f118068j;
            java.lang.String string = yq1Var4 != null ? yq1Var4.getString(3) : null;
            if (((string == null || string.length() == 0) ? 1 : 0) == 0 && (textView = this.f118064f) != null) {
                r45.yq1 yq1Var5 = this.f118068j;
                textView.setText(yq1Var5 != null ? yq1Var5.getString(3) : null);
            }
            arrayList2.clear();
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
            }
            k();
            return;
        }
        boolean c17 = c();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList2) {
            if ((((cm2.p) obj).f43373d == 1) != false) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        if ((arrayList != null ? arrayList.size() : 0) != size2) {
            arrayList2.clear();
            d();
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
            }
            if (!this.f118071m) {
                r45.yq1 yq1Var6 = this.f118068j;
                arrayList2.add(new cm2.p(0, null, null, null, null, yq1Var6 != null ? yq1Var6.getString(3) : null, 30, null));
            }
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
            }
        } else {
            java.util.Iterator it = arrayList2.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else if ((((cm2.p) it.next()).f43373d == 1) == true) {
                    break;
                } else {
                    i17++;
                }
            }
            if (arrayList != null) {
                for (java.lang.Object obj2 : arrayList) {
                    int i18 = r5 + 1;
                    if (r5 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    cm2.p pVar = (cm2.p) obj2;
                    while (((cm2.p) arrayList2.get(i17)).f43373d != 1 && i17 < arrayList2.size() - 1) {
                        i17++;
                    }
                    arrayList2.set(i17, pVar);
                    i17++;
                    r5 = i18;
                }
            }
            if (size2 > 0 && wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyItemRangeChanged(c17 ? 1 : 0, size2, "checkDataChange");
            }
        }
        l();
    }

    public final void k() {
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f118074p;
        if (liveBottomSheetPanel == null) {
            kotlin.jvm.internal.o.o("container");
            throw null;
        }
        if (!liveBottomSheetPanel.isShowing) {
            if (liveBottomSheetPanel == null) {
                kotlin.jvm.internal.o.o("container");
                throw null;
            }
            liveBottomSheetPanel.f();
        }
        android.widget.TextView textView = this.f118064f;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.FrameLayout frameLayout = this.f118065g;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        e();
    }

    public final void l() {
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f118074p;
        if (liveBottomSheetPanel == null) {
            kotlin.jvm.internal.o.o("container");
            throw null;
        }
        if (!liveBottomSheetPanel.isShowing) {
            if (liveBottomSheetPanel == null) {
                kotlin.jvm.internal.o.o("container");
                throw null;
            }
            liveBottomSheetPanel.f();
        }
        android.widget.TextView textView = this.f118064f;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.FrameLayout frameLayout = this.f118065g;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        e();
    }
}
