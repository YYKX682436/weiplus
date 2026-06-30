package com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoEightFragment;", "Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/BaseFragment;", "<init>", "()V", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class DemoEightFragment extends com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment {

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f158079f;

    /* renamed from: g, reason: collision with root package name */
    public bx3.c f158080g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f158081h = true;

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cf9;
    }

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public void initData() {
        if (this.f158081h) {
            this.f158081h = false;
            m0().c();
        }
    }

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public void n0(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.lq8);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f158079f = (androidx.recyclerview.widget.RecyclerView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f486583lr1);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f158078e = (com.tencent.mm.view.refreshLayout.WxRefreshLayout) findViewById2;
        java.util.List list = this.f158077d;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.d(context);
        this.f158080g = new bx3.c(list, context);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f158079f;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f158079f;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        bx3.c cVar = this.f158080g;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        recyclerView2.setAdapter(cVar);
        mn5.a aVar = new mn5.a();
        aVar.f330191a = 0.5f;
        aVar.f330192b = 300;
        aVar.f330193c = true;
        aVar.f330195e = true;
        aVar.f330196f = true;
        aVar.f330197g = true;
        aVar.f330198h = true;
        aVar.f330199i = false;
        aVar.f330200j = true;
        aVar.f330201k = true;
        aVar.f330202l = true;
        aVar.f330203m = true;
        aVar.f330204n = false;
        aVar.f330205o = true;
        aVar.f330206p = false;
        aVar.f330207q = false;
        m0().setCommonConfig(aVar);
        m0().setOnSimpleAction(new cx3.c(this));
        m0().setOnMultiAction(new cx3.d());
    }

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public void o0() {
        bx3.c cVar = this.f158080g;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }
}
