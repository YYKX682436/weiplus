package com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/vertical/fragment/LiveStreamTabFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/MMFinderFragment;", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class LiveStreamTabFragment extends com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment {

    /* renamed from: n, reason: collision with root package name */
    public final jq2.a f122084n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView f122085o;

    /* renamed from: p, reason: collision with root package name */
    public lq2.a f122086p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f122087q;

    public LiveStreamTabFragment(jq2.a params) {
        kotlin.jvm.internal.o.g(params, "params");
        this.f122084n = params;
        com.tencent.mars.xlog.Log.i("LiveThemeTagFragment", "LiveStreamTabFragment init id: " + params.f301096b + " pos: " + params.f301095a + " hashCode: " + hashCode());
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.o1.c(lq2.a.class);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveStreamTabFragment onCreate id: ");
        jq2.a aVar = this.f122084n;
        sb6.append(aVar.f301096b);
        sb6.append(" pos: ");
        sb6.append(aVar.f301095a);
        sb6.append(" hashCode: ");
        sb6.append(hashCode());
        com.tencent.mars.xlog.Log.i("LiveThemeTagFragment", sb6.toString());
        this.f122087q = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        java.lang.String str;
        gp2.l0 l0Var;
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.view.View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        lq2.a aVar = (lq2.a) pf5.z.f353948a.b(this).a(lq2.a.class);
        this.f122086p = aVar;
        java.lang.Object[] objArr = 0;
        if (aVar != null) {
            jq2.a params = this.f122084n;
            kotlin.jvm.internal.o.g(params, "params");
            android.app.Activity context = aVar.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            android.view.View rootView = aVar.getRootView();
            androidx.fragment.app.Fragment fragment = aVar.getFragment();
            kotlin.jvm.internal.o.e(fragment, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment");
            iq2.d0 d0Var = new iq2.d0((com.tencent.mm.ui.MMActivity) context, rootView, (com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment) fragment, params);
            aVar.f320455e = d0Var;
            java.lang.System.currentTimeMillis();
            android.view.View view = d0Var.f293718b;
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.nqo);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById;
            d0Var.f293728l = wxRecyclerView;
            jq2.a aVar2 = d0Var.f293719c;
            r45.dd2 dd2Var = aVar2.f301097c;
            int i17 = 0;
            if (dd2Var != null) {
                wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(wxRecyclerView.getContext(), 0, false));
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = d0Var.f293728l;
                if (wxRecyclerView2 == null) {
                    kotlin.jvm.internal.o.o("subTabLayout");
                    throw null;
                }
                kq2.c cVar = new kq2.c(dd2Var, d0Var);
                d0Var.f293731o = cVar;
                wxRecyclerView2.setAdapter(cVar);
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = d0Var.f293728l;
                if (wxRecyclerView3 == null) {
                    kotlin.jvm.internal.o.o("subTabLayout");
                    throw null;
                }
                wxRecyclerView3.setBackgroundColor(wxRecyclerView3.getContext().getResources().getColor(com.tencent.mm.R.color.f478512u));
                if (dd2Var.getList(6).isEmpty()) {
                    com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView4 = d0Var.f293728l;
                    if (wxRecyclerView4 == null) {
                        kotlin.jvm.internal.o.o("subTabLayout");
                        throw null;
                    }
                    wxRecyclerView4.setVisibility(8);
                } else {
                    com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView5 = d0Var.f293728l;
                    if (wxRecyclerView5 == null) {
                        kotlin.jvm.internal.o.o("subTabLayout");
                        throw null;
                    }
                    wxRecyclerView5.setVisibility(0);
                }
            }
            android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f486588lr5);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            d0Var.f293738v = (com.tencent.mm.ui.widget.MMProcessBar) findViewById2;
            android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.lqa);
            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
            com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView finderChildRecyclerView = (com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView) findViewById3;
            d0Var.f293726j = finderChildRecyclerView;
            d0Var.D = new zo2.e(finderChildRecyclerView, i17, 2, objArr == true ? 1 : 0);
            android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.m6e);
            kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
            d0Var.f293729m = (com.tencent.mm.view.refreshLayout.WxRefreshLayout) findViewById4;
            android.view.View findViewById5 = view.findViewById(com.tencent.mm.R.id.auj);
            kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
            d0Var.f293727k = findViewById5;
            com.tencent.mm.plugin.finder.view.refreshloader.FinderLoaderMoreFooter finderLoaderMoreFooter = findViewById5 instanceof com.tencent.mm.plugin.finder.view.refreshloader.FinderLoaderMoreFooter ? (com.tencent.mm.plugin.finder.view.refreshloader.FinderLoaderMoreFooter) findViewById5 : null;
            if (finderLoaderMoreFooter != null) {
                finderLoaderMoreFooter.setOnMoving(new iq2.j(d0Var));
            }
            com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView finderChildRecyclerView2 = d0Var.f293726j;
            if (finderChildRecyclerView2 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            com.tencent.mm.ui.MMActivity mMActivity = d0Var.f293717a;
            java.util.ArrayList arrayList = d0Var.f293732p;
            boolean z17 = !((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).mk();
            mn0.d0 d0Var2 = mn0.d0.f329722u;
            com.tencent.mm.ui.MMActivity activity = d0Var.f293717a;
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            if (nyVar == null || (str = java.lang.Integer.valueOf(nyVar.f135380n).toString()) == null) {
                str = "";
            }
            dq2.d dVar = new dq2.d(mMActivity, finderChildRecyclerView2, arrayList, false, 0, true, false, z17, null, d0Var2, 7, str, 0, new iq2.l(d0Var), 4352, null);
            dVar.f274258q = "Vertical_AutoPlayManager";
            dVar.G = new iq2.m(dVar, d0Var);
            d0Var.E = dVar;
            r45.dk2 g17 = ((gq2.j) aVar2.f301101g).f274564g.g();
            if (g17 != null && (l0Var = d0Var.E) != null) {
                l0Var.H(g17.getInteger(15));
            }
            gp2.l0 l0Var2 = d0Var.E;
            if (l0Var2 != null) {
                l0Var2.J(false);
            }
            gp2.l0 l0Var3 = d0Var.E;
            if (l0Var3 != null) {
                l0Var3.e(null);
            }
            com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView finderChildRecyclerView3 = d0Var.f293726j;
            if (finderChildRecyclerView3 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                finderChildRecyclerView3.i(new or2.s(activity.getClass().getSimpleName() + '#' + d0Var.f293720d));
            }
            iq2.n nVar = new iq2.n(d0Var);
            sp2.c4 c4Var = d0Var.B;
            dq2.f fVar = new dq2.f(arrayList, nVar, c4Var, new iq2.o(d0Var), new iq2.p(d0Var), 2);
            com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView finderChildRecyclerView4 = d0Var.f293726j;
            if (finderChildRecyclerView4 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            finderChildRecyclerView4.i(fVar);
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.NewEntranceItemConvertFactory newEntranceItemConvertFactory = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.NewEntranceItemConvertFactory(d0Var.f293717a, false, false, 0, d0Var.f293730n, new iq2.q(d0Var), c4Var);
            d0Var.f293735s = newEntranceItemConvertFactory;
            up2.h hVar = new up2.h(newEntranceItemConvertFactory, arrayList);
            hVar.f293105o = new iq2.r(d0Var);
            hVar.f293104n = new iq2.t(d0Var);
            d0Var.f293734r = hVar;
            com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView finderChildRecyclerView5 = d0Var.f293726j;
            if (finderChildRecyclerView5 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            finderChildRecyclerView5.N(new ar2.a(activity));
            com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView finderChildRecyclerView6 = d0Var.f293726j;
            if (finderChildRecyclerView6 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            finderChildRecyclerView6.setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager(2, 1));
            com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView finderChildRecyclerView7 = d0Var.f293726j;
            if (finderChildRecyclerView7 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            finderChildRecyclerView7.setAdapter(d0Var.f293734r);
            com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = d0Var.f293729m;
            if (wxRefreshLayout == null) {
                kotlin.jvm.internal.o.o("refreshLayout");
                throw null;
            }
            wxRefreshLayout.setOnSimpleAction(new iq2.g(d0Var));
            com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView finderChildRecyclerView8 = d0Var.f293726j;
            if (finderChildRecyclerView8 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            in5.o.b(finderChildRecyclerView8, new iq2.h(d0Var), iq2.i.f293748d);
            aVar.f320454d = "LiveStreamTabFragmentUIC_" + params.f301096b + '_' + params.f301095a;
        }
        this.f122085o = onCreateView != null ? (com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView) onCreateView.findViewById(com.tencent.mm.R.id.lqa) : null;
        return onCreateView;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveStreamTabFragment onDestroy id: ");
        jq2.a aVar = this.f122084n;
        sb6.append(aVar.f301096b);
        sb6.append(" pos: ");
        sb6.append(aVar.f301095a);
        sb6.append(" hashCode: ");
        sb6.append(hashCode());
        com.tencent.mars.xlog.Log.i("LiveThemeTagFragment", sb6.toString());
        this.f122087q = false;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveStreamTabFragment onResume id: ");
        jq2.a aVar = this.f122084n;
        sb6.append(aVar.f301096b);
        sb6.append(" pos: ");
        sb6.append(aVar.f301095a);
        sb6.append(" hashCode: ");
        sb6.append(hashCode());
        com.tencent.mars.xlog.Log.i("LiveThemeTagFragment", sb6.toString());
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getB() {
        return 0;
    }
}
