package com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoThreeFragment;", "Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/BaseFragment;", "<init>", "()V", "cx3/d0", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class DemoThreeFragment extends com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment {

    /* renamed from: f, reason: collision with root package name */
    public androidx.viewpager.widget.ViewPager f158102f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.android.material.tabs.TabLayout f158103g;

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cff;
    }

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public void initData() {
    }

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public void n0(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f158102f = (androidx.viewpager.widget.ViewPager) view.findViewById(com.tencent.mm.R.id.f487570p16);
        this.f158103g = (com.google.android.material.tabs.TabLayout) view.findViewById(com.tencent.mm.R.id.nup);
        androidx.fragment.app.FragmentActivity activity = getActivity();
        cx3.d0 d0Var = new cx3.d0(this, activity != null ? activity.getSupportFragmentManager() : null);
        androidx.viewpager.widget.ViewPager viewPager = this.f158102f;
        if (viewPager != null) {
            viewPager.setAdapter(d0Var);
        }
        com.google.android.material.tabs.TabLayout tabLayout = this.f158103g;
        if (tabLayout != null) {
            tabLayout.setupWithViewPager(this.f158102f);
        }
    }
}
