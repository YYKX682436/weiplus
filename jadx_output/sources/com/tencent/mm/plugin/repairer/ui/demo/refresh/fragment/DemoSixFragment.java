package com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoSixFragment;", "Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/BaseFragment;", "<init>", "()V", "cx3/y", "cx3/z", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class DemoSixFragment extends com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment {

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f158099f;

    /* renamed from: g, reason: collision with root package name */
    public cx3.z f158100g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f158101h = true;

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cfe;
    }

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public void initData() {
        if (this.f158101h) {
            this.f158101h = false;
            m0().c();
        }
    }

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public void n0(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f486583lr1);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f158078e = (com.tencent.mm.view.refreshLayout.WxRefreshLayout) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.lq8);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f158099f = (androidx.recyclerview.widget.RecyclerView) findViewById2;
        this.f158100g = new cx3.z(this);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f158099f;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f158099f;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        cx3.z zVar = this.f158100g;
        if (zVar == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        recyclerView2.setAdapter(zVar);
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f158099f;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView3.setHasFixedSize(true);
        androidx.recyclerview.widget.y1 y1Var = new androidx.recyclerview.widget.y1();
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f158099f;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        y1Var.b(recyclerView4);
        m0().setOnSimpleAction(new cx3.c0(this));
    }

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public void o0() {
        cx3.z zVar = this.f158100g;
        if (zVar != null) {
            zVar.notifyDataSetChanged();
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }
}
