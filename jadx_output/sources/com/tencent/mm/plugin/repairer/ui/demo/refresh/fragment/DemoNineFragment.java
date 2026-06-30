package com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoNineFragment;", "Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/BaseFragment;", "<init>", "()V", "cx3/m", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class DemoNineFragment extends com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment {

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f158088f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.f2 f158089g;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.view.refreshLayout.horizontal.WxHRefreshLayout f158091i;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f158090h = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public boolean f158092m = true;

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cfb;
    }

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public void initData() {
        if (this.f158092m) {
            this.f158092m = false;
            com.tencent.mm.view.refreshLayout.horizontal.WxHRefreshLayout wxHRefreshLayout = this.f158091i;
            if (wxHRefreshLayout != null) {
                wxHRefreshLayout.c();
            } else {
                kotlin.jvm.internal.o.o("hRefreshLayout");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public void j0(int i17) {
        java.util.ArrayList arrayList = this.f158090h;
        arrayList.clear();
        arrayList.addAll(q0());
        o0();
    }

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public void n0(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.lq8);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f158088f = (androidx.recyclerview.widget.RecyclerView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f486583lr1);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f158091i = (com.tencent.mm.view.refreshLayout.horizontal.WxHRefreshLayout) findViewById2;
        this.f158089g = new cx3.n(this);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f158088f;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 0, false));
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f158088f;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.f2 f2Var = this.f158089g;
        if (f2Var == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        recyclerView2.setAdapter(f2Var);
        com.tencent.mm.view.refreshLayout.horizontal.WxHRefreshLayout wxHRefreshLayout = this.f158091i;
        if (wxHRefreshLayout != null) {
            wxHRefreshLayout.setOnSimpleAction(new cx3.q(this));
        } else {
            kotlin.jvm.internal.o.o("hRefreshLayout");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public void o0() {
        androidx.recyclerview.widget.f2 f2Var = this.f158089g;
        if (f2Var != null) {
            f2Var.notifyDataSetChanged();
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public void p0() {
        this.f158090h.addAll(q0());
        o0();
    }

    public final java.util.Collection q0() {
        java.util.List asList = java.util.Arrays.asList(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        kotlin.jvm.internal.o.f(asList, "asList(...)");
        return asList;
    }
}
