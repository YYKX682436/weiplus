package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ic extends com.tencent.mm.plugin.finder.profile.uic.i6 {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f123795i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f123796m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f123797n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f123798o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f123799p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f123800q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f123795i = "Finder.FinderProfilePaidCollectionUIC";
        this.f123796m = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.hc(this));
        this.f123797n = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.gc(this));
        this.f123798o = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.fc(this));
        this.f123799p = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.ac(this));
        this.f123800q = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.zb(this));
    }

    public final com.tencent.mm.plugin.finder.feed.model.FinderProfilePaidCollectionLoader O6() {
        return (com.tencent.mm.plugin.finder.feed.model.FinderProfilePaidCollectionLoader) ((jz5.n) this.f123799p).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.di6;
    }

    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout getRlLayout() {
        return (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) ((jz5.n) this.f123797n).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.profile.uic.i6, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String str2;
        super.onCreate(bundle);
        ((vb2.y) ((jz5.n) this.f123796m).getValue()).f434778c.setVisibility(8);
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(O6(), (com.tencent.mm.plugin.finder.view.mj) ((jz5.n) this.f123800q).getValue(), false, 2, null);
        getRlLayout().setOnSimpleAction(new com.tencent.mm.plugin.finder.profile.uic.bc(this));
        jz5.g gVar = this.f123798o;
        ((androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue()).setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(getActivity()));
        ((androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue()).N(new com.tencent.mm.plugin.finder.member.preview.a(getContext(), -1, 0, true));
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.profile.uic.FinderProfilePaidCollectionUIC$onCreate$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == nr2.m.class.hashCode()) {
                    return new com.tencent.mm.plugin.finder.convert.st(false, null, 2, 0 == true ? 1 : 0);
                }
                hc2.l.a(pf5.o.TAG, type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        }, O6().getDataListJustForAdapter(), false);
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.profile.uic.cc(this);
        recyclerView.setAdapter(wxRecyclerAdapter);
        O6().f107599e = new com.tencent.mm.plugin.finder.profile.uic.dc(this);
        O6().setRefreshEndCallback(new com.tencent.mm.plugin.finder.profile.uic.ec(this));
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(O6(), false, 1, null);
        O6().requestRefresh();
        com.tencent.mm.plugin.finder.profile.uic.i6.handleLoadState$default(this, com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader.State.LOADING, null, 2, null);
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(getRlLayout(), "paid_collection_tab_module");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(getRlLayout(), 40, 25496);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout rlLayout = getRlLayout();
        jz5.l[] lVarArr = new jz5.l[4];
        java.lang.String str3 = "";
        if (nyVar == null || (str = nyVar.f135386r) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str);
        if (nyVar != null && (str2 = nyVar.f135382p) != null) {
            str3 = str2;
        }
        lVarArr[1] = new jz5.l("finder_context_id", str3);
        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(nyVar != null ? nyVar.f135380n : 0));
        lVarArr[3] = new jz5.l("author_finder_username", getUsername());
        ((cy1.a) rVar).gk(rlLayout, kz5.c1.k(lVarArr));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        O6().unregister((com.tencent.mm.plugin.finder.view.mj) ((jz5.n) this.f123800q).getValue());
    }
}
