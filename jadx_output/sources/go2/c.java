package go2;

/* loaded from: classes2.dex */
public final class c extends com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC {

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f273956v;

    /* renamed from: w, reason: collision with root package name */
    public int f273957w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f273956v = "";
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider W6() {
        return new go2.b(this);
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dcc;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        androidx.fragment.app.Fragment fragment = getFragment();
        com.tencent.mm.plugin.finder.member.ui.FinderMemberAllTabFragment finderMemberAllTabFragment = fragment instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberAllTabFragment ? (com.tencent.mm.plugin.finder.member.ui.FinderMemberAllTabFragment) fragment : null;
        if (finderMemberAllTabFragment == null || (str = finderMemberAllTabFragment.f121384t) == null) {
            str = "";
        }
        this.f273956v = str;
        androidx.fragment.app.Fragment fragment2 = getFragment();
        if (fragment2 instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberAllTabFragment) {
        }
        androidx.fragment.app.Fragment fragment3 = getFragment();
        com.tencent.mm.plugin.finder.member.ui.FinderMemberAllTabFragment finderMemberAllTabFragment2 = fragment3 instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberAllTabFragment ? (com.tencent.mm.plugin.finder.member.ui.FinderMemberAllTabFragment) fragment3 : null;
        this.f273957w = finderMemberAllTabFragment2 != null ? finderMemberAllTabFragment2.f121387w : 0;
        ((com.tencent.mm.plugin.finder.view.FinderViewPager) findViewById(com.tencent.mm.R.id.q0q)).setEnableSrollHorizontally(false);
        java.util.ArrayList<com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment> arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.member.ui.FinderMemberAllSubTabFragment finderMemberAllSubTabFragment = new com.tencent.mm.plugin.finder.member.ui.FinderMemberAllSubTabFragment();
        finderMemberAllSubTabFragment.f121385u = 9;
        finderMemberAllSubTabFragment.f129265p = 9;
        finderMemberAllSubTabFragment.f129266q = getContext().getString(com.tencent.mm.R.string.lrf);
        finderMemberAllSubTabFragment.y0(this.f273956v);
        finderMemberAllSubTabFragment.f121387w = this.f273957w;
        arrayList.add(finderMemberAllSubTabFragment);
        com.tencent.mm.plugin.finder.member.ui.FinderMemberAllSubTabFragment finderMemberAllSubTabFragment2 = new com.tencent.mm.plugin.finder.member.ui.FinderMemberAllSubTabFragment();
        finderMemberAllSubTabFragment2.f121385u = 10;
        finderMemberAllSubTabFragment2.f129265p = 10;
        finderMemberAllSubTabFragment2.f129266q = getContext().getString(com.tencent.mm.R.string.les);
        finderMemberAllSubTabFragment2.y0(this.f273956v);
        finderMemberAllSubTabFragment2.f121387w = this.f273957w;
        arrayList.add(finderMemberAllSubTabFragment2);
        com.google.android.material.tabs.TabLayout tabLayout = this.f133658g;
        if (tabLayout != null) {
            tabLayout.setTabRippleColor(null);
            android.view.ViewGroup.LayoutParams layoutParams = tabLayout.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = tabLayout.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.bottomMargin = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
            }
        }
        for (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment : arrayList) {
            android.app.Activity context = getContext();
            java.lang.String str2 = finderHomeTabFragment.f129266q;
            kotlin.jvm.internal.o.d(str2);
            eo2.l lVar = new eo2.l(context, -1, str2, false, finderHomeTabFragment.f129265p, 0, com.tencent.mm.R.layout.doc, true);
            lVar.f255586p = ym5.x.a(lVar.f255583m, 8.0f);
            com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.R6(this, lVar, finderHomeTabFragment, false, 4, null);
        }
    }
}
