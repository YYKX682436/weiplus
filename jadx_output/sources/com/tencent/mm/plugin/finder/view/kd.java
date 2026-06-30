package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public class kd extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f132489h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f132490i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f132491m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f132492n;

    /* renamed from: o, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f132493o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.id f132494p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f132495q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f132496r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.l f132497s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(android.content.Context context) {
        super(context, false, null, false, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f132495q = "";
        this.f132496r = new java.util.ArrayList();
        this.f118384g.f444836c.b().setGravity(80);
        this.f118384g.f444836c.b().setWindowAnimations(com.tencent.mm.R.style.f494074dp);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.aw7;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return (this instanceof com.tencent.mm.plugin.finder.view.ld) ^ true ? 0 : 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View m(android.view.ViewGroup root, zl2.u4 uiMode) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(uiMode, "uiMode");
        zl2.w4 w4Var = zl2.w4.f474017a;
        android.content.Context context = this.f118381d;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        kotlin.jvm.internal.o.f(from, "from(...)");
        return w4Var.b(com.tencent.mm.R.layout.aw7, root, false, uiMode, context, from);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int n() {
        return (this instanceof com.tencent.mm.plugin.finder.view.ld) ^ true ? 0 : 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f132490i = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.qb9);
        this.f132491m = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.orf);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) rootView.findViewById(com.tencent.mm.R.id.f483758bz2);
        this.f132492n = weImageView;
        if (weImageView != null) {
            weImageView.setVisibility((this instanceof com.tencent.mm.plugin.finder.view.ld) ^ true ? 8 : 0);
        }
        this.f132493o = (androidx.recyclerview.widget.RecyclerView) rootView.findViewById(com.tencent.mm.R.id.q4c);
        android.content.Context context = this.f118381d;
        this.f132494p = new com.tencent.mm.plugin.finder.view.id(this, context);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f132493o;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f132493o;
        if (recyclerView2 == null) {
            return;
        }
        recyclerView2.setAdapter(this.f132494p);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public boolean r() {
        return !(this instanceof com.tencent.mm.plugin.finder.view.ld);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        super.t();
        yz5.a aVar = this.f132489h;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
