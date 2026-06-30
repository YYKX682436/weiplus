package com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoFiveFragment;", "Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/BaseFragment;", "<init>", "()V", "cx3/e", "cx3/f", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class DemoFiveFragment extends com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment {

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f158082f;

    /* renamed from: g, reason: collision with root package name */
    public cx3.f f158083g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f158084h = true;

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cf_;
    }

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public void initData() {
        if (this.f158084h) {
            this.f158084h = false;
            m0().c();
        }
    }

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public void n0(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.lq8);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f158082f = (androidx.recyclerview.widget.RecyclerView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f486583lr1);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f158078e = (com.tencent.mm.view.refreshLayout.WxRefreshLayout) findViewById2;
        cx3.f fVar = new cx3.f(this);
        this.f158083g = fVar;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f158082f;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView.setAdapter(fVar);
        m0().setOnSimpleAction(new cx3.i(this));
    }

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public void o0() {
        cx3.f fVar = this.f158083g;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }
}
