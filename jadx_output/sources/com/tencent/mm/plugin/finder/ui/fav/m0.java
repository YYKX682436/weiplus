package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public final class m0 extends com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC {

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f129188v;

    /* renamed from: w, reason: collision with root package name */
    public int f129189w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.l f129190x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f129188v = "Finder.MixFavTabUIC";
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider W6() {
        return new com.tencent.mm.plugin.finder.ui.fav.i0(this);
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i(this.f129188v, "onCreate");
        super.onCreate(bundle);
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.R6(this, new com.tencent.mm.plugin.finder.ui.fav.k0(getString(com.tencent.mm.R.string.nxh)), new com.tencent.mm.plugin.finder.ui.fav.FinderGlobalMixFavFeedFragment(getString(com.tencent.mm.R.string.nxh), 1), false, 4, null);
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.R6(this, new com.tencent.mm.plugin.finder.ui.fav.k0(getString(com.tencent.mm.R.string.nxg)), new com.tencent.mm.plugin.finder.ui.fav.FinderGlobalMixFavFeedFragment(getString(com.tencent.mm.R.string.nxg), 2), false, 4, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mars.xlog.Log.i(this.f129188v, "onResume");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        com.tencent.mars.xlog.Log.i(this.f129188v, "onStop");
        super.onStop();
    }
}
