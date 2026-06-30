package com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoTwoFragment;", "Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/BaseFragment;", "<init>", "()V", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class DemoTwoFragment extends com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment {
    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cfg;
    }

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public void initData() {
    }

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public void n0(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f486583lr1);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f158078e = (com.tencent.mm.view.refreshLayout.WxRefreshLayout) findViewById;
        m0().setOnSimpleAction(new cx3.g0(this));
    }
}
