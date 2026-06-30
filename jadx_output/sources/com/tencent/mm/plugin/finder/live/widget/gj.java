package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class gj extends com.tencent.mm.plugin.finder.live.widget.n8 implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final gk2.e f118447h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f118448i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f118449m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.LiveBottomSheetPanel f118450n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f118451o;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f118452p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f118453q;

    /* renamed from: r, reason: collision with root package name */
    public final bm2.g3 f118454r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.e3 f118455s;

    /* renamed from: t, reason: collision with root package name */
    public final yz5.l f118456t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(android.content.Context context, gk2.e buContext) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        this.f118447h = buContext;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.alp, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f118448i = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.dsu);
        this.f118449m = findViewById;
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = (com.tencent.mm.ui.widget.LiveBottomSheetPanel) inflate.findViewById(com.tencent.mm.R.id.dsw);
        this.f118450n = liveBottomSheetPanel;
        android.widget.TextView textView = (android.widget.TextView) liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.dsv);
        android.widget.TextView textView2 = (android.widget.TextView) liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.f484309dt1);
        this.f118451o = textView2;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.f484310dt2);
        this.f118452p = recyclerView;
        bm2.g3 g3Var = new bm2.g3(context);
        this.f118454r = g3Var;
        this.f118456t = new com.tencent.mm.plugin.finder.live.widget.bj(this);
        liveBottomSheetPanel.setOnVisibilityListener(new com.tencent.mm.plugin.finder.live.widget.cj(this));
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(inflate.getContext()));
        g3Var.f21912h = new com.tencent.mm.plugin.finder.live.widget.dj(this);
        recyclerView.setAdapter(g3Var);
        textView2.setEnabled(false);
        zl2.r4.f473950a.Y2(textView2, false, true);
        findViewById.setOnClickListener(this);
        liveBottomSheetPanel.setOnClickListener(this);
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
    }

    public final void b() {
        com.tencent.mm.plugin.finder.view.e3 e3Var = this.f118455s;
        if (e3Var != null) {
            e3Var.h();
        }
        this.f118455s = null;
        this.f118450n.setTranslationY(0.0f);
    }

    public final void c() {
        ol2.b a17 = ol2.b.f346142c.a(((mm2.u0) this.f118447h.a(mm2.u0.class)).f329448n);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList<ol2.c> arrayList2 = a17.f346143a;
        boolean z17 = false;
        if (arrayList2 != null) {
            for (ol2.c cVar : arrayList2) {
                java.lang.Integer num = cVar.f346146b;
                if (num != null && num.intValue() == 2) {
                    java.lang.String str = cVar.f346145a;
                    if (!(str == null || str.length() == 0)) {
                        java.lang.String str2 = cVar.f346145a;
                        kotlin.jvm.internal.o.d(str2);
                        arrayList.add(str2);
                    }
                }
            }
        }
        this.f118453q = !arrayList.isEmpty();
        bm2.g3 g3Var = this.f118454r;
        g3Var.getClass();
        java.util.ArrayList arrayList3 = g3Var.f21908d;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        for (int size = arrayList.size(); size < g3Var.f21909e; size++) {
            arrayList3.add("");
        }
        g3Var.notifyDataSetChanged();
        int itemCount = g3Var.getItemCount();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f118452p;
        if (itemCount <= 0) {
            recyclerView.setVisibility(8);
        } else {
            recyclerView.setVisibility(0);
            g3Var.notifyDataSetChanged();
        }
        android.view.View view = this.f118448i;
        com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(view.getContext());
        zl2.r4 r4Var = zl2.r4.f473950a;
        r4Var.Q2(view);
        e3Var.g(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
        e3Var.b();
        e3Var.i();
        this.f118455s = e3Var;
        if (r4Var.w1()) {
            mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
            if (c1Var != null && c1Var.a8()) {
                z17 = true;
            }
            if (z17) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).yj(ml2.z4.Q, "4", null);
                return;
            }
            ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
            ml2.c1 c1Var2 = ml2.c1.f327325e;
            j0Var.hj(27L, "4", null);
        }
    }

    public final gk2.e getBuContext() {
        return this.f118447h;
    }

    public final yz5.l getCanSendBtnEnable() {
        return this.f118456t;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFastCommentWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.dsu) {
            b();
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.dsv) {
            b();
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f484309dt1) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = this.f118454r.f21908d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String str = (java.lang.String) it.next();
                if (str.length() > 0) {
                    arrayList2.add(str);
                }
            }
            r45.hx0 a17 = ek2.r1.f253524u.a(arrayList2);
            gk2.e eVar = this.f118447h;
            if (((mm2.c1) eVar.a(mm2.c1.class)).a8()) {
                pq5.g l17 = new ek2.r1(((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) eVar.a(mm2.e1.class)).f328983m, 1, a17).l();
                l17.K(new com.tencent.mm.plugin.finder.live.widget.ej(this, jSONObject));
                if (getContext() instanceof com.tencent.mm.ui.MMActivity) {
                    android.content.Context context = getContext();
                    kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    l17.f((com.tencent.mm.ui.MMActivity) context);
                }
            } else {
                jSONObject.put("anchor_status", "1");
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.f328391y0, jSONObject.toString(), null, 4, null);
                ((mm2.u0) eVar.a(mm2.u0.class)).f329449o = arrayList2;
                boolean z17 = this.f118453q;
                android.view.View view2 = this.f118448i;
                if (z17) {
                    db5.t7.h(view2.getContext(), view2.getContext().getString(com.tencent.mm.R.string.f491436d32));
                } else {
                    db5.t7.h(view2.getContext(), view2.getContext().getString(com.tencent.mm.R.string.f491435d31));
                }
                b();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFastCommentWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
