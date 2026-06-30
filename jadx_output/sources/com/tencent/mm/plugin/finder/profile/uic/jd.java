package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class jd extends com.tencent.mm.plugin.finder.profile.uic.i6 {

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f123851i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f123852m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f123853n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f123854o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f123855p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f123856q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f123857r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f123851i = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.id(this));
        this.f123852m = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.zc(this, fragment));
        this.f123853n = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.ed(fragment));
        this.f123854o = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.yc(this));
        this.f123855p = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.fd(this));
        this.f123856q = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.hd(this));
        this.f123857r = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.gd(this));
    }

    public final com.tencent.mm.plugin.finder.feed.model.FinderProfileProductLoader O6() {
        return (com.tencent.mm.plugin.finder.feed.model.FinderProfileProductLoader) ((jz5.n) this.f123852m).getValue();
    }

    public final vb2.b0 P6() {
        return (vb2.b0) ((jz5.n) this.f123851i).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.profile.uic.i6
    public void doRefreshRequest() {
        super.doRefreshRequest();
        com.tencent.mm.plugin.finder.profile.uic.i6.handleLoadState$default(this, com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader.State.LOADING, null, 2, null);
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(O6(), false, 1, null);
        O6().requestRefresh();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.edu;
    }

    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout getRlLayout() {
        return (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) ((jz5.n) this.f123856q).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.profile.uic.i6, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        boolean C = com.tencent.mm.ui.bk.C();
        jz5.g gVar = this.f123855p;
        if (C) {
            ((android.widget.FrameLayout) ((jz5.n) gVar).getValue()).setBackground(null);
        } else {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) gVar).getValue();
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i65.a.d(getContext(), com.tencent.mm.R.color.f478553an), i65.a.d(getContext(), com.tencent.mm.R.color.f478542ad)});
            gradientDrawable.setShape(0);
            frameLayout.setBackground(gradientDrawable);
        }
        P6().f434519c.setVisibility(8);
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(O6(), (com.tencent.mm.plugin.finder.view.mj) ((jz5.n) this.f123854o).getValue(), false, 2, null);
        getRlLayout().setOnSimpleAction(new com.tencent.mm.plugin.finder.profile.uic.ad(this));
        com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter finderProfileLoaderMoreFooter = new com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter(getActivity(), null);
        finderProfileLoaderMoreFooter.j(com.tencent.mm.R.layout.bsd);
        getRlLayout().D(finderProfileLoaderMoreFooter);
        O6().f107604f = new com.tencent.mm.plugin.finder.profile.uic.bd(this);
        O6().setRefreshEndCallback(new com.tencent.mm.plugin.finder.profile.uic.cd(this));
        jz5.g gVar2 = this.f123857r;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar2).getValue();
        jz5.g gVar3 = this.f123853n;
        wxRecyclerView.setLayoutManager(((com.tencent.mm.plugin.finder.profile.widget.b) ((jz5.n) gVar3).getValue()).d(getActivity()));
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar2).getValue();
        ((com.tencent.mm.plugin.finder.profile.widget.b) ((jz5.n) gVar3).getValue()).getClass();
        wxRecyclerView2.N(new com.tencent.mm.plugin.finder.profile.widget.a());
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar2).getValue();
        com.tencent.mm.plugin.finder.profile.widget.b bVar = (com.tencent.mm.plugin.finder.profile.widget.b) ((jz5.n) gVar3).getValue();
        bVar.getClass();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new com.tencent.mm.plugin.finder.profile.widget.FinderProfileProductConfig$getItemConvertFactory$1(bVar), O6().getDataListJustForAdapter(), false);
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.profile.uic.dd(this);
        wxRecyclerView3.setAdapter(wxRecyclerAdapter);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        O6().unregister((com.tencent.mm.plugin.finder.view.mj) ((jz5.n) this.f123854o).getValue());
    }
}
