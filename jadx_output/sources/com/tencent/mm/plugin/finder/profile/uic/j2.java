package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class j2 extends com.tencent.mm.plugin.finder.profile.uic.i6 {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f123824i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f123825m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f123826n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f123827o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f123828p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f123829q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f123824i = "Finder.FinderProfileCourseUIC";
        this.f123825m = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.i2(this));
        this.f123826n = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.h2(this));
        this.f123827o = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.g2(this));
        this.f123828p = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.c2(this));
        this.f123829q = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.b2(this));
    }

    public final com.tencent.mm.plugin.finder.feed.model.FinderProfileCourseLoader O6() {
        return (com.tencent.mm.plugin.finder.feed.model.FinderProfileCourseLoader) ((jz5.n) this.f123828p).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.di6;
    }

    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout getRlLayout() {
        return (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) ((jz5.n) this.f123826n).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.profile.uic.i6, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((vb2.y) ((jz5.n) this.f123825m).getValue()).f434778c.setVisibility(8);
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(O6(), (com.tencent.mm.plugin.finder.view.mj) ((jz5.n) this.f123829q).getValue(), false, 2, null);
        com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter finderProfileLoaderMoreFooter = new com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter(getActivity(), null);
        finderProfileLoaderMoreFooter.j(com.tencent.mm.R.layout.bsd);
        getRlLayout().D(finderProfileLoaderMoreFooter);
        getRlLayout().setOnSimpleAction(new com.tencent.mm.plugin.finder.profile.uic.d2(this));
        jz5.g gVar = this.f123827o;
        ((androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue()).setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(getActivity()));
        ((androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue()).N(new com.tencent.mm.plugin.finder.member.preview.a(getContext(), -1, 0, true));
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.profile.uic.FinderProfileCourseUIC$onCreate$2
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
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.profile.uic.e2(this);
        recyclerView.setAdapter(wxRecyclerAdapter);
        O6().f107576e = new com.tencent.mm.plugin.finder.profile.uic.f2(this);
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(O6(), false, 1, null);
        O6().requestRefresh();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        O6().unregister((com.tencent.mm.plugin.finder.view.mj) ((jz5.n) this.f123829q).getValue());
    }
}
