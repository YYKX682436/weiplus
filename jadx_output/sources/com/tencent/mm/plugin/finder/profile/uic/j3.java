package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class j3 extends com.tencent.mm.plugin.finder.profile.uic.i6 {

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f123830i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f123831m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.FrameLayout f123832n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f123833o;

    /* renamed from: p, reason: collision with root package name */
    public rl5.r f123834p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f123835q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f123836r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f123837s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f123830i = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.i3(this));
        this.f123831m = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.e3(this));
        this.f123833o = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.d3(this));
        this.f123836r = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.s2(this));
        this.f123837s = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.t2(this));
    }

    public final com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader O6() {
        return (com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader) ((jz5.n) this.f123837s).getValue();
    }

    public final com.tencent.mm.view.RefreshLoadMoreLayout P6() {
        return (com.tencent.mm.view.RefreshLoadMoreLayout) ((jz5.n) this.f123831m).getValue();
    }

    public final void Q6() {
        android.view.View f213435x = P6().getF213435x();
        if (f213435x != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(f213435x, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "showFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f213435x.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(f213435x, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "showFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f213435x.setBackgroundColor(f213435x.getResources().getColor(com.tencent.mm.R.color.aaw));
            android.view.View findViewById = f213435x.findViewById(com.tencent.mm.R.id.ili);
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "showFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "showFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.d4d);
            if (textView != null) {
                textView.setText(f213435x.getResources().getString(com.tencent.mm.R.string.ctm));
            }
            android.view.View findViewById2 = f213435x.findViewById(com.tencent.mm.R.id.ilg);
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "showFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "showFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b6x;
    }

    @Override // com.tencent.mm.plugin.finder.profile.uic.i6, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(O6(), (com.tencent.mm.plugin.finder.profile.uic.r2) ((jz5.n) this.f123836r).getValue(), false, 2, null);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.l9h);
        this.f123832n = frameLayout;
        if (frameLayout != null) {
            frameLayout.setBackgroundResource(com.tencent.mm.R.drawable.abi);
        }
        android.widget.FrameLayout frameLayout2 = this.f123832n;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        this.f123834p = new rl5.r(getActivity());
        P6().setSuperNestedScroll(true);
        P6().setEnableRefresh(false);
        P6().setEnableLoadMore(false);
        P6().setActionCallback(new com.tencent.mm.plugin.finder.profile.uic.x2(this));
        androidx.fragment.app.Fragment fragment = getFragment();
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftFragment finderProfileDraftFragment = fragment instanceof com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftFragment ? (com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftFragment) fragment : null;
        final boolean z17 = finderProfileDraftFragment != null ? finderProfileDraftFragment.f123430t : false;
        com.tencent.mm.view.RefreshLoadMoreLayout P6 = P6();
        android.view.View inflate = com.tencent.mm.ui.id.b(getActivity()).inflate(com.tencent.mm.R.layout.ag7, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        P6.setLoadMoreFooter(inflate);
        jz5.g gVar = this.f123833o;
        ((androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue()).setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getActivity()));
        this.f123835q = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftUIC$onCreate$2
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return type == 7 ? new com.tencent.mm.plugin.finder.convert.n() : new com.tencent.mm.plugin.finder.convert.d2(z17);
            }
        }, O6().getDataListJustForAdapter(), true);
        ((androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue()).setAdapter(this.f123835q);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f123835q;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.profile.uic.z2(this, z17);
        }
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.f293104n = new com.tencent.mm.plugin.finder.profile.uic.a3(this);
        }
        O6().f107583g = new com.tencent.mm.plugin.finder.profile.uic.c3(this);
        O6().requestInit(false);
        O6().requestRefresh();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        O6().unregister((com.tencent.mm.plugin.finder.profile.uic.r2) ((jz5.n) this.f123836r).getValue());
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
    }
}
