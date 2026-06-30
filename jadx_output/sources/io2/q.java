package io2;

/* loaded from: classes2.dex */
public final class q extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final io2.i f293498d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f293498d = new io2.i(new com.tencent.mm.plugin.finder.member.mine.FinderMemberCardListContract$FinderMemberCardListLoader());
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        io2.i iVar = this.f293498d;
        com.tencent.mm.plugin.finder.member.mine.FinderMemberCardListContract$FinderMemberCardListLoader finderMemberCardListContract$FinderMemberCardListLoader = iVar.f293477d;
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        finderMemberCardListContract$FinderMemberCardListLoader.setContextObj(nyVar != null ? nyVar.V6() : null);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        io2.p pVar = new io2.p((com.tencent.mm.ui.MMActivity) activity, iVar, getRootView());
        iVar.f293478e = pVar;
        in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.finder.member.mine.FinderMemberCardListContract$MemberCardListPresenter$onAttach$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == so2.j3.class.getName().hashCode()) {
                    return new com.tencent.mm.plugin.finder.convert.co();
                }
                hc2.l.a("Finder.FinderMemberCardListContract", type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        };
        com.tencent.mm.plugin.finder.member.mine.FinderMemberCardListContract$FinderMemberCardListLoader finderMemberCardListContract$FinderMemberCardListLoader2 = iVar.f293477d;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(sVar, finderMemberCardListContract$FinderMemberCardListLoader2.getDataListJustForAdapter(), false);
        wxRecyclerAdapter.f293105o = new io2.g(iVar);
        iVar.f293479f = wxRecyclerAdapter;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = pVar.f293494d;
        wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(wxRecyclerView.getRootView().getContext()));
        wxRecyclerView.setAdapter(pVar.f293491a.c());
        pVar.f293493c.setActionCallback(new io2.j(pVar));
        ym5.a1.h(wxRecyclerView, new io2.k());
        wxRecyclerView.N(new io2.l(pVar));
        ym5.a1.g(wxRecyclerView, new io2.m());
        pVar.a(true);
        pVar.f293492b.postDelayed(new io2.n(pVar), 300L);
        finderMemberCardListContract$FinderMemberCardListLoader2.f121158d = new io2.h(iVar);
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(finderMemberCardListContract$FinderMemberCardListLoader2, iVar.f().f293497g, false, 2, null);
        androidx.appcompat.app.AppCompatActivity context2 = getActivity();
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(getFragment(), iy1.c.FinderMemberCardListUI);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(getFragment(), 12, 27010);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        androidx.fragment.app.Fragment fragment = getFragment();
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("finder_tab_context_id", nyVar2 != null ? nyVar2.f135386r : null);
        lVarArr[1] = new jz5.l("finder_context_id", nyVar2 != null ? nyVar2.f135382p : null);
        lVarArr[2] = new jz5.l("behaviour_session_id", nyVar2 != null ? nyVar2.f135385q : null);
        lVarArr[3] = new jz5.l("tabtype", "会员专区");
        ((cy1.a) rVar).gk(fragment, kz5.c1.k(lVarArr));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f293498d.onDetach();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f293498d = new io2.i(new com.tencent.mm.plugin.finder.member.mine.FinderMemberCardListContract$FinderMemberCardListLoader());
    }
}
