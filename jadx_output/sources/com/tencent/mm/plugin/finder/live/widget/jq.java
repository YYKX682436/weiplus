package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class jq extends db5.h {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f118769g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nq f118770h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq(com.tencent.mm.plugin.finder.live.widget.nq nqVar) {
        super(nqVar.f118183e);
        this.f118770h = nqVar;
        this.f118769g = new java.util.LinkedHashMap();
    }

    @Override // db5.h
    public int a() {
        java.util.LinkedList list;
        r45.hv1 hv1Var = this.f118770h.N;
        if (hv1Var == null || (list = hv1Var.getList(4)) == null) {
            return 0;
        }
        return list.size();
    }

    @Override // db5.h
    public android.view.View b(android.view.View view, android.view.ViewGroup viewGroup, int i17) {
        java.util.LinkedList list;
        java.util.Map map = this.f118769g;
        android.view.View view2 = (android.view.View) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i17));
        android.content.Context context = this.f228355d;
        if (view2 == null) {
            view2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dsd, viewGroup, false);
            kotlin.jvm.internal.o.f(view2, "inflate(...)");
        }
        map.put(java.lang.Integer.valueOf(i17), view2);
        r45.hv1 hv1Var = this.f118770h.N;
        r45.a63 a63Var = (hv1Var == null || (list = hv1Var.getList(4)) == null) ? null : (r45.a63) kz5.n0.a0(list, i17);
        if (a63Var != null) {
            com.tencent.mm.plugin.finder.live.widget.nq nqVar = this.f118770h;
            androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) view2.findViewById(com.tencent.mm.R.id.lqa);
            com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = (com.tencent.mm.view.refreshLayout.WxRefreshLayout) view2.findViewById(com.tencent.mm.R.id.lr8);
            com.tencent.mm.plugin.finder.live.widget.fq fqVar = new com.tencent.mm.plugin.finder.live.widget.fq(this, a63Var);
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
            }
            if (recyclerView != null) {
                recyclerView.setAdapter(fqVar);
            }
            if (wxRefreshLayout != null) {
                wxRefreshLayout.D(new com.tencent.mm.plugin.finder.view.FinderLiveMultiNoticeListFooter(context, null));
            }
            if (wxRefreshLayout != null) {
                wxRefreshLayout.setOnSimpleAction(new com.tencent.mm.plugin.finder.live.widget.hq(nqVar, a63Var, wxRefreshLayout, this, fqVar));
            }
            if (recyclerView != null) {
                ym5.a1.g(recyclerView, new com.tencent.mm.plugin.finder.live.widget.iq());
            }
        }
        return view2;
    }

    @Override // db5.h
    public void c(android.view.View view, int i17) {
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        java.util.LinkedList list;
        r45.hv1 hv1Var = this.f118770h.N;
        if (hv1Var == null || (list = hv1Var.getList(4)) == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.CharSequence getPageTitle(int i17) {
        java.lang.String str;
        java.util.LinkedList list;
        r45.a63 a63Var;
        r45.hv1 hv1Var = this.f118770h.N;
        if (hv1Var == null || (list = hv1Var.getList(4)) == null || (a63Var = (r45.a63) kz5.n0.a0(list, i17)) == null || (str = a63Var.getString(1)) == null) {
            str = "";
        }
        return " " + str + ' ';
    }
}
