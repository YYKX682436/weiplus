package go2;

/* loaded from: classes2.dex */
public final class d1 extends com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC {

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f273963v;

    /* renamed from: w, reason: collision with root package name */
    public int f273964w;

    /* renamed from: x, reason: collision with root package name */
    public int f273965x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f273963v = "";
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider W6() {
        return new go2.c1(this);
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dcc;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        tw2.b bVar;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1000 && i18 == -1 && (bVar = this.f133661m) != null) {
            androidx.fragment.app.Fragment item = bVar.getItem(0);
            if (intent != null) {
                long longExtra = intent.getLongExtra("key_member_saerch_feed_id", 0L);
                com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.t7(this, 0, false, 2, null);
                com.tencent.mm.plugin.finder.member.question.t tVar = (com.tencent.mm.plugin.finder.member.question.t) pf5.z.f353948a.b(item).a(com.tencent.mm.plugin.finder.member.question.t.class);
                com.tencent.mm.plugin.finder.member.question.w wVar = tVar.f121357f;
                if (wVar == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                wVar.g();
                com.tencent.mm.plugin.finder.member.question.s sVar = tVar.f121356e;
                if (sVar == null) {
                    kotlin.jvm.internal.o.o("presenter");
                    throw null;
                }
                com.tencent.mm.plugin.finder.feed.model.FinderMemberQAFeedLoader finderMemberQAFeedLoader = sVar.f121346f;
                finderMemberQAFeedLoader.f107515g = longExtra;
                finderMemberQAFeedLoader.removeAll(0);
                finderMemberQAFeedLoader.requestRefresh();
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        androidx.fragment.app.Fragment fragment = getFragment();
        com.tencent.mm.plugin.finder.member.ui.FinderMemberQATabFragment finderMemberQATabFragment = fragment instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberQATabFragment ? (com.tencent.mm.plugin.finder.member.ui.FinderMemberQATabFragment) fragment : null;
        if (finderMemberQATabFragment == null || (str = finderMemberQATabFragment.f121384t) == null) {
            str = "";
        }
        this.f273963v = str;
        androidx.fragment.app.Fragment fragment2 = getFragment();
        com.tencent.mm.plugin.finder.member.ui.FinderMemberQATabFragment finderMemberQATabFragment2 = fragment2 instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberQATabFragment ? (com.tencent.mm.plugin.finder.member.ui.FinderMemberQATabFragment) fragment2 : null;
        if (finderMemberQATabFragment2 != null) {
            java.lang.String str2 = finderMemberQATabFragment2.f121386v;
        }
        androidx.fragment.app.Fragment fragment3 = getFragment();
        if (fragment3 instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberQATabFragment) {
        }
        androidx.fragment.app.Fragment fragment4 = getFragment();
        com.tencent.mm.plugin.finder.member.ui.FinderMemberQATabFragment finderMemberQATabFragment3 = fragment4 instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberQATabFragment ? (com.tencent.mm.plugin.finder.member.ui.FinderMemberQATabFragment) fragment4 : null;
        this.f273964w = finderMemberQATabFragment3 != null ? finderMemberQATabFragment3.f121387w : 0;
        androidx.fragment.app.Fragment fragment5 = getFragment();
        com.tencent.mm.plugin.finder.member.ui.FinderMemberQATabFragment finderMemberQATabFragment4 = fragment5 instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberQATabFragment ? (com.tencent.mm.plugin.finder.member.ui.FinderMemberQATabFragment) fragment5 : null;
        this.f273965x = finderMemberQATabFragment4 != null ? finderMemberQATabFragment4.f129265p : 0;
        ((com.tencent.mm.plugin.finder.view.FinderViewPager) findViewById(com.tencent.mm.R.id.q0q)).setEnableSrollHorizontally(false);
        java.util.ArrayList<com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment> arrayList = new java.util.ArrayList();
        if (this.f273965x == 2) {
            com.tencent.mm.plugin.finder.member.ui.FinderMemberQASubTabFragment finderMemberQASubTabFragment = new com.tencent.mm.plugin.finder.member.ui.FinderMemberQASubTabFragment();
            finderMemberQASubTabFragment.f121385u = 3;
            finderMemberQASubTabFragment.f129265p = 3;
            finderMemberQASubTabFragment.f129266q = getContext().getString(com.tencent.mm.R.string.lrf);
            finderMemberQASubTabFragment.y0(this.f273963v);
            finderMemberQASubTabFragment.f121387w = this.f273964w;
            finderMemberQASubTabFragment.f121401z = 5;
            arrayList.add(finderMemberQASubTabFragment);
            com.tencent.mm.plugin.finder.member.ui.FinderMemberQASubTabFragment finderMemberQASubTabFragment2 = new com.tencent.mm.plugin.finder.member.ui.FinderMemberQASubTabFragment();
            finderMemberQASubTabFragment2.f121385u = 4;
            finderMemberQASubTabFragment2.f129265p = 4;
            finderMemberQASubTabFragment2.f129266q = getContext().getString(com.tencent.mm.R.string.les);
            finderMemberQASubTabFragment2.y0(this.f273963v);
            finderMemberQASubTabFragment2.f121387w = this.f273964w;
            finderMemberQASubTabFragment2.f121401z = 6;
            arrayList.add(finderMemberQASubTabFragment2);
            if (!kotlin.jvm.internal.o.b(this.f273963v, xy2.c.e(getContext()))) {
                com.tencent.mm.plugin.finder.member.ui.FinderMemberQASubTabFragment finderMemberQASubTabFragment3 = new com.tencent.mm.plugin.finder.member.ui.FinderMemberQASubTabFragment();
                finderMemberQASubTabFragment3.f121385u = 5;
                finderMemberQASubTabFragment3.f129265p = 5;
                finderMemberQASubTabFragment3.f129266q = getContext().getString(com.tencent.mm.R.string.leu);
                finderMemberQASubTabFragment3.y0(this.f273963v);
                finderMemberQASubTabFragment3.f121387w = this.f273964w;
                finderMemberQASubTabFragment3.f121401z = 7;
                arrayList.add(finderMemberQASubTabFragment3);
            }
        }
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
            java.lang.String str3 = finderHomeTabFragment.f129266q;
            kotlin.jvm.internal.o.d(str3);
            eo2.l lVar = new eo2.l(context, -1, str3, false, finderHomeTabFragment.f129265p, 0, com.tencent.mm.R.layout.doc, true);
            lVar.f255586p = ym5.x.a(lVar.f255583m, 8.0f);
            com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.R6(this, lVar, finderHomeTabFragment, false, 4, null);
        }
    }
}
