package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class yb extends com.tencent.mm.plugin.finder.profile.uic.i6 {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f124388i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f124389m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f124390n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f124391o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f124392p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f124393q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f124388i = "Finder.FinderProfileNativeDramaUIC";
        this.f124389m = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.xb(this));
        this.f124390n = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.wb(this));
        this.f124391o = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.vb(this));
        this.f124392p = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.qb(this));
        this.f124393q = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.pb(this));
    }

    public final com.tencent.mm.plugin.finder.feed.model.FinderProfileNativeDramaLoader O6() {
        return (com.tencent.mm.plugin.finder.feed.model.FinderProfileNativeDramaLoader) ((jz5.n) this.f124392p).getValue();
    }

    public final vb2.y P6() {
        return (vb2.y) ((jz5.n) this.f124389m).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.di6;
    }

    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout getRlLayout() {
        return (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) ((jz5.n) this.f124390n).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.profile.uic.i6, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (com.tencent.mm.ui.bk.C()) {
            P6().f434777b.setBackgroundResource(com.tencent.mm.R.drawable.d4a);
        } else {
            P6().f434777b.setBackgroundResource(com.tencent.mm.R.drawable.abi);
        }
        P6().f434778c.setVisibility(8);
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(O6(), (com.tencent.mm.plugin.finder.view.mj) ((jz5.n) this.f124393q).getValue(), false, 2, null);
        getRlLayout().setOnSimpleAction(new com.tencent.mm.plugin.finder.profile.uic.rb(this));
        new tu2.b().f422131a = false;
        jz5.g gVar = this.f124391o;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue();
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = new com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager(2, 1);
        finderStaggeredGridLayoutManager.setItemPrefetchEnabled(true);
        recyclerView.setLayoutManager(finderStaggeredGridLayoutManager);
        ((androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue()).N(new com.tencent.mm.plugin.finder.storage.ij0());
        androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.profile.uic.FinderProfileNativeDramaUIC$onCreate$2
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == zb2.a.class.hashCode()) {
                    return new com.tencent.mm.plugin.finder.convert.pt();
                }
                hc2.l.a(pf5.o.TAG, type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        }, O6().getDataListJustForAdapter(), false);
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.profile.uic.sb(this);
        recyclerView2.setAdapter(wxRecyclerAdapter);
        O6().f107595e = new com.tencent.mm.plugin.finder.profile.uic.tb(this);
        O6().setRefreshEndCallback(new com.tencent.mm.plugin.finder.profile.uic.ub(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        O6().unregister((com.tencent.mm.plugin.finder.view.mj) ((jz5.n) this.f124393q).getValue());
    }
}
