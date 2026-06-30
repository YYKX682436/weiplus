package com.tencent.mm.plugin.finder.nearby.ui.special.fragment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/ui/special/fragment/LiveThemeTagFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/MMFinderFragment;", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class LiveThemeTagFragment extends com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment {

    /* renamed from: n, reason: collision with root package name */
    public final er2.a f122114n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f122115o;

    public LiveThemeTagFragment(er2.a params) {
        kotlin.jvm.internal.o.g(params, "params");
        this.f122114n = params;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.ny.class, cr2.y.class});
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        android.content.Intent intent;
        super.o0();
        this.f122115o = true;
        androidx.fragment.app.FragmentActivity activity = getActivity();
        int i17 = 0;
        if (activity != null && (intent = activity.getIntent()) != null) {
            i17 = intent.getIntExtra("KEY_SHARE_TYPE", 0);
        }
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        java.lang.String valueOf = java.lang.String.valueOf(hashCode());
        java.lang.String valueOf2 = java.lang.String.valueOf(getB());
        java.lang.String valueOf3 = java.lang.String.valueOf(getB());
        cl0.g gVar = new cl0.g();
        er2.a aVar = this.f122114n;
        gVar.s("topic_id", aVar.f256009b);
        gVar.s("topic_title", aVar.f256011d);
        gVar.s("tag_id", aVar.f256010c);
        if (i17 > 0) {
            gVar.o("share_type", i17);
        }
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        a4Var.c(valueOf, valueOf2, valueOf3, gVar2);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.view.View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        cr2.y yVar = (cr2.y) pf5.z.f353948a.b(this).a(cr2.y.class);
        yVar.getClass();
        er2.a params = this.f122114n;
        kotlin.jvm.internal.o.g(params, "params");
        android.app.Activity context = yVar.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        android.view.View rootView = yVar.getRootView();
        androidx.fragment.app.Fragment fragment = yVar.getFragment();
        kotlin.jvm.internal.o.e(fragment, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment");
        cr2.x xVar = new cr2.x((com.tencent.mm.ui.MMActivity) context, rootView, (com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment) fragment, params);
        yVar.f221921d = xVar;
        android.view.View view = xVar.f221896b;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.lqa);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById;
        xVar.f221907m = wxRecyclerView;
        int i17 = xVar.f221902h;
        xVar.f221920z = new zo2.e(wxRecyclerView, (i17 == 11 || i17 == 4) ? 2 : 1);
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        xVar.f221908n = (com.tencent.mm.view.refreshLayout.WxRefreshLayout) findViewById2;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = xVar.f221907m;
        if (wxRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        int i18 = android.os.Build.VERSION.SDK_INT;
        com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment fragment2 = xVar.f221897c;
        com.tencent.mm.ui.MMActivity activity = xVar.f221895a;
        if (i18 >= 26) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(activity.getClass().getSimpleName());
            sb6.append('#');
            kotlin.jvm.internal.o.g(fragment2, "fragment");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            sb6.append(nyVar != null ? java.lang.Integer.valueOf(nyVar.f135380n) : null);
            wxRecyclerView2.i(new or2.s(sb6.toString()));
        }
        java.util.ArrayList arrayList = xVar.f221911q;
        dq2.f fVar = new dq2.f(arrayList, new cr2.g(xVar), xVar.f221917w, new cr2.h(xVar), new cr2.i(xVar), (i17 == 11 || i17 == 4) ? 2 : 1);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = xVar.f221907m;
        if (wxRecyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        wxRecyclerView3.i(fVar);
        xVar.f221918x = fVar;
        er2.a aVar = xVar.f221898d;
        if (i17 == 11 || i17 == 4) {
            xVar.f221913s = new com.tencent.mm.plugin.finder.nearby.ui.special.factory.ThemeSmallLivingItemConvertFactory(xVar.f221895a, fragment2.getB(), 0.0f, 4, null);
            xVar.f221909o = new com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager(2, 1);
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView4 = xVar.f221907m;
            if (wxRecyclerView4 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            ar2.a aVar2 = new ar2.a(activity);
            if (aVar.f256016i == 1) {
                aVar2.f13382f = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
            }
            wxRecyclerView4.N(aVar2);
        } else {
            xVar.f221913s = new com.tencent.mm.plugin.finder.nearby.ui.special.factory.ThemeLargeLivingItemConvertFactory(activity, fragment2.getB(), xVar.B);
            xVar.f221909o = new com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager(1, 1);
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView5 = xVar.f221907m;
            if (wxRecyclerView5 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            wxRecyclerView5.N(new ar2.b(activity));
        }
        com.tencent.mm.plugin.finder.nearby.ui.special.factory.ThemeLivingItemConvertFactory themeLivingItemConvertFactory = xVar.f221913s;
        kotlin.jvm.internal.o.d(themeLivingItemConvertFactory);
        cr2.a aVar3 = new cr2.a(themeLivingItemConvertFactory, arrayList);
        aVar3.f293105o = new cr2.j(xVar);
        aVar3.f293104n = new cr2.l(xVar);
        xVar.f221912r = aVar3;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView6 = xVar.f221907m;
        if (wxRecyclerView6 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = xVar.f221909o;
        if (layoutManager == null) {
            kotlin.jvm.internal.o.o("recyclerViewLayoutManager");
            throw null;
        }
        wxRecyclerView6.setLayoutManager(layoutManager);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView7 = xVar.f221907m;
        if (wxRecyclerView7 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        wxRecyclerView7.setAdapter(xVar.f221912r);
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = xVar.f221908n;
        if (wxRefreshLayout == null) {
            kotlin.jvm.internal.o.o("refreshLayout");
            throw null;
        }
        wxRefreshLayout.setOnSimpleAction(new cr2.m(xVar));
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView8 = xVar.f221907m;
        if (wxRecyclerView8 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        in5.o.b(wxRecyclerView8, new cr2.n(xVar), cr2.d.f221855d);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView9 = xVar.f221907m;
        if (wxRecyclerView9 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        com.tencent.mm.ui.MMActivity mMActivity = xVar.f221895a;
        boolean z17 = !((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).mk();
        int i19 = aVar.f256016i;
        mn0.d0 d0Var = i19 == 1 ? mn0.d0.f329727z : mn0.d0.f329722u;
        int i27 = i19 == 1 ? 7 : 20;
        kotlin.jvm.internal.o.g(fragment2, "fragment");
        pf5.z zVar = pf5.z.f353948a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.b(fragment2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar2 == null || (str = java.lang.Integer.valueOf(nyVar2.f135380n).toString()) == null) {
            str = "";
        }
        gp2.l0 l0Var = new gp2.l0(mMActivity, wxRecyclerView9, arrayList, false, 0, true, false, z17, null, d0Var, i27, str, (i17 == 11 || i17 == 4) ? 2 : 1, false, null, null, 57600, null);
        l0Var.f274258q = "Theme_AutoPlayManager";
        l0Var.G = new cr2.e(xVar);
        xVar.A = l0Var;
        l0Var.e(null);
        if (xVar.f221907m == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        cr2.a aVar4 = xVar.f221912r;
        if (aVar4 != null) {
            kotlin.jvm.internal.o.g(activity, "activity");
            sp2.x3 x3Var = (sp2.x3) zVar.a(activity).a(sp2.x3.class);
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView10 = xVar.f221907m;
            if (wxRecyclerView10 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            x3Var.R6(wxRecyclerView10, aVar4);
        }
        kotlin.jvm.internal.o.g(activity, "activity");
        fr2.p pVar = (fr2.p) zVar.a(activity).e(fr2.p.class);
        if (pVar != null) {
            android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.ilk);
            if (findViewById3 != null) {
                findViewById3.setPadding(findViewById3.getPaddingLeft(), findViewById3.getPaddingTop(), findViewById3.getPaddingRight(), activity.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479656bt));
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView11 = xVar.f221907m;
            if (wxRecyclerView11 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            wxRecyclerView11.i(new cr2.f(pVar));
        }
        if (onCreateView != null) {
        }
        return onCreateView;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.f122115o) {
            java.lang.String hashCode = java.lang.String.valueOf(hashCode());
            kotlin.jvm.internal.o.g(hashCode, "hashCode");
            ml2.b1.a(ml2.b1.f327211a, hashCode, null, 2, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        android.content.Intent intent;
        super.onResume();
        if (this.f122115o) {
            androidx.fragment.app.FragmentActivity activity = getActivity();
            int i17 = 0;
            if (activity != null && (intent = activity.getIntent()) != null) {
                i17 = intent.getIntExtra("KEY_SHARE_TYPE", 0);
            }
            com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
            java.lang.String valueOf = java.lang.String.valueOf(hashCode());
            java.lang.String valueOf2 = java.lang.String.valueOf(getB());
            java.lang.String valueOf3 = java.lang.String.valueOf(getB());
            cl0.g gVar = new cl0.g();
            er2.a aVar = this.f122114n;
            gVar.s("topic_id", aVar.f256009b);
            gVar.s("topic_title", aVar.f256011d);
            gVar.s("tag_id", aVar.f256010c);
            if (i17 > 0) {
                gVar.o("share_type", i17);
            }
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            a4Var.c(valueOf, valueOf2, valueOf3, gVar2);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void p0() {
        super.p0();
        this.f122115o = false;
        java.lang.String hashCode = java.lang.String.valueOf(hashCode());
        kotlin.jvm.internal.o.g(hashCode, "hashCode");
        ml2.b1.a(ml2.b1.f327211a, hashCode, null, 2, null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getB() {
        er2.a aVar = this.f122114n;
        if (aVar.f256017j == 2) {
            return 329;
        }
        int i17 = aVar.f256012e;
        if (i17 == 4 || i17 == 11) {
            return 261;
        }
        return i17 == 10 ? 260 : 0;
    }
}
