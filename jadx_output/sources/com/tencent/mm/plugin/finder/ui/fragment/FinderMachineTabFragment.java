package com.tencent.mm.plugin.finder.ui.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/FinderMachineTabFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderMachineTabFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment {
    public FinderMachineTabFragment() {
        super(com.tencent.mm.R.string.f6h, 4);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        boolean z17 = false;
        java.util.HashSet d17 = kz5.p1.d(com.tencent.mm.plugin.finder.viewmodel.component.t80.class, com.tencent.mm.plugin.finder.viewmodel.component.d1.class, com.tencent.mm.plugin.finder.viewmodel.component.c70.class, ni3.n.class, cs2.k.class, com.tencent.mm.plugin.finder.viewmodel.component.pv.class, com.tencent.mm.plugin.finder.viewmodel.component.ye.class);
        d17.add(com.tencent.mm.plugin.finder.viewmodel.component.th.class);
        d17.add(qt2.u.class);
        d17.add(qt2.e.class);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.V6).getValue()).r()).intValue() == 1) {
            d17.add(com.tencent.mm.plugin.finder.viewmodel.component.nc.class);
        }
        r45.hk2 hk2Var = new r45.hk2();
        try {
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_NEGATIVE_FEED_BACK_CONF_STRING_SYNC, "");
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
            hk2Var.parseFrom(com.tencent.mm.sdk.platformtools.t8.h((java.lang.String) m17));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get FinderNegativeFeedbackConfig=");
            java.lang.Object obj = (r45.dt4) hk2Var.getCustom(0);
            if (obj == null) {
                obj = "";
            }
            sb6.append(pm0.b0.g(obj));
            com.tencent.mars.xlog.Log.i("MicroMsg.UIComponentFragment", sb6.toString());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.UIComponentFragment", e17, "", new java.lang.Object[0]);
        }
        r45.dt4 dt4Var = (r45.dt4) hk2Var.getCustom(0);
        if (dt4Var != null && dt4Var.getInteger(0) == 1) {
            r45.dt4 dt4Var2 = (r45.dt4) hk2Var.getCustom(0);
            if ((dt4Var2 != null ? dt4Var2.getInteger(1) : 0) > 0) {
                z17 = true;
            }
        }
        if (z17) {
            d17.add(com.tencent.mm.plugin.finder.viewmodel.component.jq.class);
        }
        return d17;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        super.o0();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this, "special_enter_source", java.lang.Integer.valueOf(((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Bi()));
        n30.q qVar = (n30.q) i95.n0.c(n30.q.class);
        java.lang.String valueOf = java.lang.String.valueOf(20);
        ((m30.m) qVar).getClass();
        a52.a.d(valueOf);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderMachineTabFragment);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.Finder);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, "FinderMachineTabFragment");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ck(this, true);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 40, 24184);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, wu2.z.f449711a);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this, "special_enter_source", java.lang.Integer.valueOf(((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Bi()));
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getB() {
        return 20;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment
    public void s0() {
        ((com.tencent.mm.plugin.finder.viewmodel.component.t80) j0(com.tencent.mm.plugin.finder.viewmodel.component.t80.class)).X6(true);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment
    public void u0(rn5.a extInfo) {
        boolean z17;
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        com.tencent.mm.plugin.finder.viewmodel.component.t80 t80Var = (com.tencent.mm.plugin.finder.viewmodel.component.t80) j0(com.tencent.mm.plugin.finder.viewmodel.component.t80.class);
        com.tencent.mm.plugin.finder.feed.ct ctVar = t80Var.f135995e;
        if (ctVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView().getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int w17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w();
        com.tencent.mm.plugin.finder.feed.ct ctVar2 = t80Var.f135995e;
        if (ctVar2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = ((com.tencent.mm.plugin.finder.feed.v00) ctVar2).getRecyclerView().getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager2 instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager2 : null;
        if (linearLayoutManager != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            z17 = false;
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderTimelineUIC", "onRequest", "(Lcom/tencent/mm/view/refreshLayout/model/LoaderExtInfo;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/viewmodel/component/FinderTimelineUIC", "onRequest", "(Lcom/tencent/mm/view/refreshLayout/model/LoaderExtInfo;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        } else {
            z17 = false;
        }
        if (w17 <= -1) {
            com.tencent.mm.plugin.finder.feed.ct ctVar3 = t80Var.f135995e;
            if (ctVar3 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            ((com.tencent.mm.plugin.finder.feed.v00) ctVar3).getRecyclerView().post(new com.tencent.mm.plugin.finder.viewmodel.component.p80(linearLayoutManager));
        }
        com.tencent.mm.plugin.finder.feed.ct ctVar4 = t80Var.f135995e;
        if (ctVar4 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.v00 v00Var = (com.tencent.mm.plugin.finder.feed.v00) ctVar4;
        v00Var.l().postDelayed(new com.tencent.mm.plugin.finder.feed.j00(v00Var, z17, true, extInfo), 150L);
    }
}
