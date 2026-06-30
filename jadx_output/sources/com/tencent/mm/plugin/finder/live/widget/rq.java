package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes9.dex */
public final class rq extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public final jz5.g H;
    public final jz5.g I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq(android.content.Context context) {
        super(context, false, null, 0.75f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.H = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.pq(context));
        this.I = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.oq(context));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.ajv;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public java.lang.String L() {
        java.lang.String string = this.f118183e.getString(com.tencent.mm.R.string.kei);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        jz5.g gVar = this.I;
        com.tencent.mm.plugin.finder.live.viewmodel.s1 s1Var = (com.tencent.mm.plugin.finder.live.viewmodel.s1) ((jz5.n) gVar).getValue();
        if (s1Var != null) {
            android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.iim);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            s1Var.f117376h = (android.widget.LinearLayout) findViewById;
            android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.llz);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            s1Var.f117377i = (androidx.recyclerview.widget.RecyclerView) findViewById2;
            android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.eyq);
            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
            s1Var.f117378m = (android.widget.EditText) findViewById3;
            androidx.recyclerview.widget.RecyclerView recyclerView = s1Var.f117377i;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(s1Var.f117372d, 4));
            androidx.recyclerview.widget.RecyclerView recyclerView2 = s1Var.f117377i;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            bm2.c cVar = s1Var.f117381p;
            recyclerView2.setAdapter(cVar);
            cVar.f21804e = new com.tencent.mm.plugin.finder.live.viewmodel.o1(s1Var);
            androidx.recyclerview.widget.RecyclerView recyclerView3 = s1Var.f117377i;
            if (recyclerView3 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            recyclerView3.N(new com.tencent.mm.plugin.finder.live.viewmodel.p1(s1Var));
            androidx.recyclerview.widget.RecyclerView recyclerView4 = s1Var.f117377i;
            if (recyclerView4 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            ym5.a1.g(recyclerView4, new com.tencent.mm.plugin.finder.live.viewmodel.q1());
        }
        com.tencent.mm.plugin.finder.live.viewmodel.s1 s1Var2 = (com.tencent.mm.plugin.finder.live.viewmodel.s1) ((jz5.n) gVar).getValue();
        jz5.g gVar2 = this.H;
        if (s1Var2 != null) {
            s1Var2.f117382q = (com.tencent.mm.plugin.finder.live.viewmodel.e2) ((jz5.n) gVar2).getValue();
        }
        com.tencent.mm.plugin.finder.live.viewmodel.e2 e2Var = (com.tencent.mm.plugin.finder.live.viewmodel.e2) ((jz5.n) gVar2).getValue();
        if (e2Var != null) {
            e2Var.f117057e = rootView.findViewById(com.tencent.mm.R.id.goo);
            e2Var.f117058f = rootView.findViewById(com.tencent.mm.R.id.gor);
            e2Var.f117059g = (com.tencent.mm.view.refreshLayout.WxRefreshLayout) rootView.findViewById(com.tencent.mm.R.id.m6e);
            e2Var.f117060h = (androidx.recyclerview.widget.RecyclerView) rootView.findViewById(com.tencent.mm.R.id.eyw);
            e2Var.f117062m = rootView.findViewById(com.tencent.mm.R.id.eyo);
            e2Var.f117063n = (android.widget.EditText) rootView.findViewById(com.tencent.mm.R.id.eyq);
            e2Var.f117064o = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.eyr);
            e2Var.f117065p = rootView.findViewById(com.tencent.mm.R.id.eyv);
            android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.pni);
            e2Var.f117061i = findViewById4;
            if (findViewById4 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC", "initView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC", "initView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view = e2Var.f117058f;
            if (view != null) {
                view.post(new com.tencent.mm.plugin.finder.live.viewmodel.u1(e2Var));
            }
            android.view.View view2 = e2Var.f117058f;
            if (view2 != null) {
                view2.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.v1(e2Var));
            }
            com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = e2Var.f117059g;
            if (wxRefreshLayout != null) {
                wxRefreshLayout.setOnSimpleAction(new com.tencent.mm.plugin.finder.live.viewmodel.w1(e2Var));
            }
            androidx.recyclerview.widget.RecyclerView recyclerView5 = e2Var.f117060h;
            if (recyclerView5 != null) {
                recyclerView5.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(e2Var.f117056d));
            }
            androidx.recyclerview.widget.RecyclerView recyclerView6 = e2Var.f117060h;
            bm2.f fVar = e2Var.f117071v;
            if (recyclerView6 != null) {
                recyclerView6.setAdapter(fVar);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView7 = e2Var.f117060h;
            if (recyclerView7 != null) {
                ym5.a1.g(recyclerView7, new com.tencent.mm.plugin.finder.live.viewmodel.x1());
            }
            android.widget.EditText editText = e2Var.f117063n;
            if (editText != null) {
                editText.addTextChangedListener(new com.tencent.mm.plugin.finder.live.viewmodel.y1(e2Var));
            }
            android.widget.EditText editText2 = e2Var.f117063n;
            if (editText2 != null) {
                editText2.postDelayed(new com.tencent.mm.plugin.finder.live.viewmodel.z1(e2Var), 128L);
            }
            android.widget.EditText editText3 = e2Var.f117063n;
            if (editText3 != null) {
                editText3.setOnClickListener(com.tencent.mm.plugin.finder.live.viewmodel.a2.f116891d);
            }
            android.view.View view3 = e2Var.f117062m;
            if (view3 != null) {
                view3.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.b2(e2Var));
            }
            fVar.f21876e = new com.tencent.mm.plugin.finder.live.viewmodel.c2(e2Var);
        }
        com.tencent.mm.plugin.finder.live.viewmodel.e2 e2Var2 = (com.tencent.mm.plugin.finder.live.viewmodel.e2) ((jz5.n) gVar2).getValue();
        if (e2Var2 != null) {
            e2Var2.f117072w = (com.tencent.mm.plugin.finder.live.viewmodel.s1) ((jz5.n) gVar).getValue();
        }
        com.tencent.mm.plugin.finder.live.viewmodel.e2 e2Var3 = (com.tencent.mm.plugin.finder.live.viewmodel.e2) ((jz5.n) gVar2).getValue();
        if (e2Var3 != null) {
            e2Var3.f117073x = new com.tencent.mm.plugin.finder.live.widget.qq(this);
        }
        a0(this.f118183e.getDrawable(com.tencent.mm.R.drawable.clh));
        d0();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View u() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(this.f118183e);
        weImageView.setIconColor(weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9));
        weImageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(i65.a.b(weImageView.getContext(), 12), i65.a.b(weImageView.getContext(), 24)));
        weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_back);
        return weImageView;
    }
}
