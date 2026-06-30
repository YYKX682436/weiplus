package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class rt implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.et f114185d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f114186e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f114187f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f114188g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f114189h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f114190i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f114191m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f114192n;

    public rt(com.tencent.mm.plugin.finder.live.plugin.et plugin) {
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f114185d = plugin;
        this.f114186e = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.mt(this));
        this.f114187f = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.lt(this));
        this.f114188g = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.pt(this));
        this.f114189h = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.kt(this));
        this.f114191m = new java.util.ArrayList();
        this.f114192n = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.ot(this));
    }

    public final void a(java.lang.String source, java.lang.String clientMsgId, int i17, int i18) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(clientMsgId, "clientMsgId");
        if ((i17 != 0 && i17 != 4) || (i17 == 4 && (i18 == -200018 || i18 == -200014 || i18 == -200017 || i18 == -100075))) {
            com.tencent.mars.xlog.Log.w("FinderLiveInputPluginDanmaku", "afterPostMsg: don't consume coin, source=" + source + ", errType=" + i17 + ", errCode=" + i18 + ", clientMsgId=" + clientMsgId);
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveInputPluginDanmaku", "afterPostMsg: source=" + source + ", errType=" + i17 + ", errCode=" + i18 + ", clientMsgId=" + clientMsgId);
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.ft(this, source));
    }

    public final void b() {
        if2.d0 d0Var;
        android.view.ViewGroup viewGroup;
        if2.d0 d0Var2;
        android.view.ViewGroup viewGroup2;
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f114185d;
        boolean z17 = ((mm2.j2) etVar.P0(mm2.j2.class)).f329171s;
        com.tencent.mm.ui.tools.t4 t4Var = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2;
        androidx.recyclerview.widget.RecyclerView recyclerView = etVar.K;
        com.tencent.mm.ui.widget.MMEditText mMEditText = etVar.f112461y;
        if (!z17) {
            etVar.f112454t = 120;
            etVar.W1(120);
            ck5.f b17 = ck5.f.b(mMEditText);
            b17.f42561f = 1;
            b17.f42560e = 120;
            b17.f42562g = t4Var;
            b17.f42556a = true;
            b17.d(new com.tencent.mm.plugin.finder.live.plugin.jr(etVar, 120));
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView f17 = f();
            if (f17 != null) {
                f17.setVisibility(8);
            }
            if (this.f114190i) {
                com.tencent.mm.plugin.finder.live.plugin.mg c17 = c();
                if (c17 != null) {
                    c17.K0(0);
                }
                com.tencent.mm.plugin.finder.live.plugin.mg c18 = c();
                if (c18 != null && (viewGroup = c18.f365323d) != null) {
                    viewGroup.postDelayed(new com.tencent.mm.plugin.finder.live.plugin.jt(this), 200L);
                }
                this.f114190i = false;
            }
            df2.ug ugVar = (df2.ug) etVar.U0(df2.ug.class);
            if (ugVar == null || (d0Var = ugVar.f231525p) == null) {
                return;
            }
            d0Var.d(0);
            return;
        }
        etVar.f112454t = 30;
        etVar.W1(30);
        ck5.f b18 = ck5.f.b(mMEditText);
        b18.f42561f = 1;
        b18.f42560e = 30;
        b18.f42562g = t4Var;
        b18.f42556a = true;
        b18.d(new com.tencent.mm.plugin.finder.live.plugin.jr(etVar, 30));
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        if (f() != null) {
            f().setVisibility(0);
            if (f().getAdapter() == null) {
                com.tencent.mm.view.recyclerview.WxRecyclerView f18 = f();
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(f().getContext());
                linearLayoutManager.Q(0);
                f18.setLayoutManager(linearLayoutManager);
                com.tencent.mm.view.recyclerview.WxRecyclerView f19 = f();
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.live.plugin.FinderLiveInputPluginDanmaku$showSelectDanmakuRv$2
                    @Override // in5.s
                    public in5.r getItemConvert(int type) {
                        return new hk2.n(com.tencent.mm.plugin.finder.live.plugin.rt.this.f114185d.S0());
                    }
                }, this.f114191m, false);
                wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.live.plugin.qt(this);
                f19.setAdapter(wxRecyclerAdapter);
            }
            f().getLayoutParams().width = (int) (((java.lang.Number) ((jz5.n) this.f114192n).getValue()).intValue() / 0.7f);
            f().setPivotX(0.0f);
            f().setPivotY(i65.a.a(etVar.f365323d.getContext(), 114.0f));
            f().setScaleX(0.7f);
            f().setScaleY(0.7f);
        }
        com.tencent.mm.plugin.finder.live.plugin.mg c19 = c();
        this.f114190i = (c19 == null || (viewGroup2 = c19.f365323d) == null || viewGroup2.getVisibility() != 0) ? false : true;
        pm0.v.V(0L, new com.tencent.mm.plugin.finder.live.plugin.ht(this));
        df2.ug ugVar2 = (df2.ug) etVar.U0(df2.ug.class);
        if (ugVar2 == null || (d0Var2 = ugVar2.f231525p) == null) {
            return;
        }
        d0Var2.d(8);
    }

    public final com.tencent.mm.plugin.finder.live.plugin.mg c() {
        return (com.tencent.mm.plugin.finder.live.plugin.mg) ((jz5.n) this.f114189h).getValue();
    }

    public final android.widget.CheckBox d() {
        return (android.widget.CheckBox) ((jz5.n) this.f114187f).getValue();
    }

    public final android.view.View e() {
        return (android.view.View) ((jz5.n) this.f114186e).getValue();
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView f() {
        return (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) this.f114188g).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        df2.ug ugVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPluginDanmaku", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if ((view != null && view.getId() == com.tencent.mm.R.id.cq7) != false) {
            android.widget.CheckBox d17 = d();
            if ((d17 != null && d17.getVisibility() == 0) != false) {
                android.widget.CheckBox d18 = d();
                boolean z17 = !(d18 != null ? d18.isChecked() : false);
                android.widget.CheckBox d19 = d();
                if (d19 != null) {
                    d19.setChecked(z17);
                }
                ((ml2.r0) i95.n0.c(ml2.r0.class)).ak(2, 3, kz5.b1.e(new jz5.l("status", java.lang.String.valueOf(z17 ? 1 : 0))));
                com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f114185d;
                mm2.j2 j2Var = (mm2.j2) etVar.P0(mm2.j2.class);
                android.widget.CheckBox d27 = d();
                j2Var.f329171s = d27 != null ? d27.isChecked() : false;
                i95.m c17 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.r0.Bj((ml2.r0) c17, ml2.g5.f327498y, null, 2, 2, null);
                b();
                if (etVar.x0() && z17 && (ugVar = (df2.ug) etVar.U0(df2.ug.class)) != null) {
                    ugVar.W6(new com.tencent.mm.plugin.finder.live.plugin.nt(ugVar));
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPluginDanmaku", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
