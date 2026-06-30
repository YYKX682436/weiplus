package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class mn implements android.view.View.OnClickListener, com.tencent.mm.modelbase.u0 {
    public java.lang.String A;
    public java.lang.String B;
    public final java.util.Map C;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f119083d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f119084e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.x7 f119085f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f119086g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f119087h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f119088i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f119089m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.EditText f119090n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f119091o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f119092p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f119093q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.ViewGroup f119094r;

    /* renamed from: s, reason: collision with root package name */
    public final bm2.i4 f119095s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.pp f119096t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashMap f119097u;

    /* renamed from: v, reason: collision with root package name */
    public int f119098v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.ArrayList f119099w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f119100x;

    /* renamed from: y, reason: collision with root package name */
    public int f119101y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f119102z;

    public mn(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.x7 basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f119083d = root;
        this.f119084e = statusMonitor;
        this.f119085f = basePlugin;
        bm2.i4 i4Var = new bm2.i4();
        this.f119095s = i4Var;
        gk2.e S0 = basePlugin.S0();
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f484682f51);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f119096t = new com.tencent.mm.plugin.finder.live.widget.pp(S0, (android.view.ViewGroup) findViewById, this);
        this.f119097u = new java.util.HashMap();
        this.f119098v = 0;
        this.f119099w = new java.util.ArrayList();
        this.f119100x = "";
        this.A = "";
        this.C = new java.util.LinkedHashMap();
        root.setTranslationX(com.tencent.mm.ui.bl.b(root.getContext()).x);
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.f4z);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.f58);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f119086g = findViewById3;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.f57);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f119087h = findViewById4;
        android.view.View findViewById5 = root.findViewById(com.tencent.mm.R.id.f484686f55);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById5;
        this.f119088i = textView;
        android.view.View findViewById6 = root.findViewById(com.tencent.mm.R.id.f4y);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById6;
        this.f119089m = weImageView2;
        android.view.View findViewById7 = root.findViewById(com.tencent.mm.R.id.f59);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        android.view.View findViewById8 = root.findViewById(com.tencent.mm.R.id.f484687f56);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        android.widget.EditText editText = (android.widget.EditText) findViewById8;
        this.f119090n = editText;
        android.view.View findViewById9 = root.findViewById(com.tencent.mm.R.id.f484681f50);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f119091o = (android.widget.TextView) findViewById9;
        android.view.View findViewById10 = root.findViewById(com.tencent.mm.R.id.f484685f54);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f119092p = findViewById10;
        android.view.View findViewById11 = root.findViewById(com.tencent.mm.R.id.f5d);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById11;
        this.f119093q = recyclerView;
        android.view.View findViewById12 = root.findViewById(com.tencent.mm.R.id.f5c);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f119094r = (android.view.ViewGroup) findViewById12;
        android.widget.TextView textView2 = (android.widget.TextView) com.tencent.mm.ui.id.b(root.getContext()).inflate(com.tencent.mm.R.layout.f489227bs5, (android.view.ViewGroup) null).findViewById(com.tencent.mm.R.id.ili);
        if (textView2 != null) {
            textView2.setTextColor(root.getContext().getResources().getColor(com.tencent.mm.R.color.f479222ta));
        }
        root.getLayoutParams().height = (((com.tencent.mm.ui.bl.b(root.getContext()).y * 2) / 3) - com.tencent.mm.ui.bl.c(root.getContext())) + com.tencent.mm.ui.zk.a(root.getContext(), 80);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(root.getContext()));
        recyclerView.setAdapter(i4Var);
        recyclerView.O(new com.tencent.mm.plugin.finder.live.widget.an(this));
        i4Var.f21976h = new com.tencent.mm.plugin.finder.live.widget.bn(this);
        editText.addTextChangedListener(new com.tencent.mm.plugin.finder.live.widget.cn(this));
        editText.setOnEditorActionListener(new com.tencent.mm.plugin.finder.live.widget.dn(this));
        textView.setOnClickListener(this);
        weImageView2.setOnClickListener(this);
        weImageView.setOnClickListener(this);
        root.setOnClickListener(this);
    }

    public final void a() {
        fj2.s sVar;
        com.tencent.mm.sdk.platformtools.t8.t0(this.f119090n);
        c();
        com.tencent.mm.plugin.finder.live.widget.pp ppVar = this.f119096t;
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) ppVar.f119404j;
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            sVar = fj2.s.f263183a;
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            sVar.d(ml2.q2.I, ppVar.f119403i, (hi2.a) entry.getValue());
        }
        linkedHashMap.clear();
        ppVar.f119400f.clear();
        androidx.recyclerview.widget.f2 adapter = ppVar.f119398d.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) this.C;
        for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
            sVar.d(ml2.q2.f327829p1, this.B, (hi2.a) entry2.getValue());
        }
        linkedHashMap2.clear();
        android.view.ViewGroup viewGroup = this.f119083d;
        float f17 = com.tencent.mm.ui.bl.b(viewGroup.getContext()).x;
        viewGroup.animate().translationX(f17).setListener(new com.tencent.mm.plugin.finder.live.widget.en(this, f17)).start();
    }

    public final boolean b() {
        return this.f119083d.getVisibility() == 0;
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", "switchToNormalMode");
        this.f119098v = 0;
        android.view.View view = this.f119092p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget", "switchToNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget", "switchToNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f119088i.setVisibility(4);
        this.f119089m.setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams = this.f119087h.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(((android.view.ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd(), 0);
        ofInt.setDuration(200L);
        ofInt.addUpdateListener(new com.tencent.mm.plugin.finder.live.widget.gn(this));
        ofInt.start();
        android.widget.EditText editText = this.f119090n;
        editText.setText((java.lang.CharSequence) null);
        java.lang.String str = this.B;
        com.tencent.mm.plugin.finder.live.widget.pp ppVar = this.f119096t;
        ppVar.f119403i = str;
        int size = ppVar.f119400f.size();
        android.view.ViewGroup viewGroup = ppVar.f119396b;
        if (size > 0) {
            viewGroup.setVisibility(0);
        } else {
            viewGroup.setVisibility(8);
        }
        this.f119094r.setVisibility(8);
        this.f119091o.setVisibility(8);
        com.tencent.mm.sdk.platformtools.t8.t0(editText);
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", "switchToSearchMode");
        this.f119098v = 1;
        this.f119096t.f119396b.setVisibility(8);
        java.util.ArrayList arrayList = this.f119099w;
        arrayList.clear();
        bm2.i4 i4Var = this.f119095s;
        i4Var.x(arrayList);
        this.f119094r.setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams = this.f119087h.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int marginEnd = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        android.widget.TextView textView = this.f119088i;
        int measuredWidth = textView.getMeasuredWidth();
        android.view.ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(marginEnd, measuredWidth + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart());
        ofInt.setDuration(200L);
        ofInt.addUpdateListener(new com.tencent.mm.plugin.finder.live.widget.hn(this));
        ofInt.addListener(new com.tencent.mm.plugin.finder.live.widget.in(this));
        ofInt.start();
        this.f119090n.post(new com.tencent.mm.plugin.finder.live.widget.jn(this));
        this.f119093q.setAdapter(i4Var);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f4z) {
            a();
        } else {
            android.widget.EditText editText = this.f119090n;
            if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f4y) {
                editText.setText("");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                bm2.i4 i4Var = this.f119095s;
                i4Var.x(arrayList2);
                this.f119094r.setVisibility(8);
                i4Var.notifyDataSetChanged();
            } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f484686f55) {
                com.tencent.mm.sdk.platformtools.t8.t0(editText);
                c();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof db2.d5) {
            gm0.j1.d().q(3820, this);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", "onSceneEnd NetSceneFinderSearch errType:" + i17 + " errCode:" + i18 + " query:" + this.f119100x);
            if (i17 == 0 && i18 == 0) {
                r45.tu2 tu2Var = ((db2.y5) ((db2.d5) m1Var)).f228254r;
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", "updateSearchData showMode:" + this.f119098v);
                if (this.f119098v == 1) {
                    kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
                    java.util.ArrayList arrayList = this.f119099w;
                    f0Var.f310116d = arrayList.size();
                    kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
                    f0Var2.f310116d = arrayList.size();
                    arrayList.addAll(tu2Var.getList(1));
                    this.f119101y = tu2Var.getInteger(2);
                    tu2Var.getInteger(3);
                    this.f119102z = tu2Var.getByteString(5);
                    f0Var2.f310116d = arrayList.size();
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", "searchContactList size:" + arrayList.size() + " offset:" + tu2Var.getInteger(2) + " continueFlag:" + tu2Var.getInteger(3) + " lastBuff: " + this.f119102z);
                    pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.ln(this, f0Var, f0Var2));
                }
            }
        }
    }
}
