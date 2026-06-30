package com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoOneFragment;", "Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/BaseFragment;", "<init>", "()V", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class DemoOneFragment extends com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment {

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f158093f;

    /* renamed from: g, reason: collision with root package name */
    public bx3.c f158094g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f158095h = true;

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cfc;
    }

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public void initData() {
        if (this.f158095h) {
            this.f158095h = false;
            m0().c();
        }
    }

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public void n0(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.lq8);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f158093f = (androidx.recyclerview.widget.RecyclerView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f486583lr1);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f158078e = (com.tencent.mm.view.refreshLayout.WxRefreshLayout) findViewById2;
        java.util.List list = this.f158077d;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.d(context);
        this.f158094g = new bx3.c(list, context);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f158093f;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f158093f;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        bx3.c cVar = this.f158094g;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        recyclerView2.setAdapter(cVar);
        m0().setOnSimpleAction(new cx3.t(this));
        m0().setOverScrollCallback(new cx3.u());
    }

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public void o0() {
        bx3.c cVar = this.f158094g;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }
}
