package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ho extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListPresenter f134643d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134643d = new com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListPresenter(new com.tencent.mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader(true));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.axy;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        android.view.View rootView = getRootView();
        com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListPresenter purchaseListPresenter = this.f134643d;
        purchaseListPresenter.h(new com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback((com.tencent.mm.ui.MMActivity) activity, purchaseListPresenter, rootView));
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(getFragment(), iy1.c.FinderMemberCardListUI);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(getFragment(), 12, 27010);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        androidx.fragment.app.Fragment fragment = getFragment();
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("finder_tab_context_id", nyVar != null ? nyVar.f135386r : null);
        lVarArr[1] = new jz5.l("finder_context_id", nyVar != null ? nyVar.f135382p : null);
        lVarArr[2] = new jz5.l("behaviour_session_id", nyVar != null ? nyVar.f135385q : null);
        lVarArr[3] = new jz5.l("tabtype", "付费直播");
        ((cy1.a) rVar).gk(fragment, kz5.c1.k(lVarArr));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f134643d.onDetach();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f134643d = new com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListPresenter(new com.tencent.mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader(true));
    }
}
