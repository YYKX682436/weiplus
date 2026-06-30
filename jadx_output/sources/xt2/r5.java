package xt2;

/* loaded from: classes3.dex */
public final class r5 extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public final gk2.e f456992h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f456993i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f456994m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f456995n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f456996o;

    /* renamed from: p, reason: collision with root package name */
    public cm2.m0 f456997p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f456998q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.a f456999r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f457000s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(android.content.Context context, gk2.e buContext, int i17) {
        super(context, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        this.f456992h = buContext;
        this.f456996o = new java.util.ArrayList();
    }

    public static final java.lang.Object y(xt2.r5 r5Var, kotlin.coroutines.Continuation continuation) {
        android.content.Context context = r5Var.f118381d;
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null) {
            dk2.q4 q4Var = dk2.q4.f233938a;
            gk2.e eVar = r5Var.f456992h;
            java.lang.Object g17 = q4Var.g(mMActivity, eVar, false, ((mm2.f6) eVar.a(mm2.f6.class)).f329033g, ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) eVar.a(mm2.e1.class)).f328983m, ((mm2.e1) eVar.a(mm2.e1.class)).f328984n, ((mm2.c1) eVar.a(mm2.c1.class)).f328852o, ((mm2.e1) eVar.a(mm2.e1.class)).f328985o, ((mm2.c1) eVar.a(mm2.c1.class)).P3, null, 3, ((mm2.c1) eVar.a(mm2.c1.class)).f328844m5, java.lang.Boolean.FALSE, continuation);
            if (g17 == pz5.a.f359186d) {
                return g17;
            }
        }
        return jz5.f0.f302826a;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.f488985dt2;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.aa8);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f456993i = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.rcc);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f456994m = findViewById2;
        android.view.View view = this.f456993i;
        if (view == null) {
            kotlin.jvm.internal.o.o("backBtn");
            throw null;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.f6b);
        android.content.Context context = this.f118381d;
        weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f478716f7));
        android.view.View view2 = this.f456993i;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("backBtn");
            throw null;
        }
        android.graphics.drawable.Drawable background = view2.getBackground();
        android.graphics.drawable.GradientDrawable gradientDrawable = background instanceof android.graphics.drawable.GradientDrawable ? (android.graphics.drawable.GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(context.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_0_5));
        }
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.ilp);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f457000s = findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.s1_);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById4;
        recyclerView.setAdapter(new xt2.l5(this));
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        kotlin.jvm.internal.o.f(findViewById4, "also(...)");
        this.f456995n = (androidx.recyclerview.widget.RecyclerView) findViewById4;
        android.view.View view3 = this.f456993i;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("backBtn");
            throw null;
        }
        view3.setOnClickListener(new xt2.n5(this));
        android.view.View view4 = this.f456994m;
        if (view4 != null) {
            view4.setOnClickListener(new xt2.o5(this));
        } else {
            kotlin.jvm.internal.o.o("noProductBtn");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        yz5.a aVar = this.f456999r;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void z() {
        java.util.List list = this.f456996o;
        ((java.util.ArrayList) list).clear();
        java.util.List b17 = ((mm2.f6) this.f456992h.a(mm2.f6.class)).f329039o.b(xt2.m5.f456893d);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
        java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
        while (it.hasNext()) {
            so2.j5 j5Var = (so2.j5) it.next();
            kotlin.jvm.internal.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowShelfProductItem");
            arrayList.add((cm2.m0) j5Var);
        }
        ((java.util.ArrayList) list).addAll(arrayList);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f456995n;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("productList");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
