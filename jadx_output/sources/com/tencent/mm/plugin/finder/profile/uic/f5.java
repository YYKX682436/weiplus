package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class f5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f123703d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC) {
        super(2);
        this.f123703d = finderProfileFeedUIC;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout rlLayout;
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout rlLayout2;
        com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView;
        in5.w wVar;
        in5.w wVar2;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Number) obj2).intValue();
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC = this.f123703d;
        rlLayout = finderProfileFeedUIC.getRlLayout();
        rlLayout.getCommonConfig().f330193c = booleanValue;
        rlLayout2 = finderProfileFeedUIC.getRlLayout();
        rlLayout2.setNotDispatchToParent(booleanValue);
        finderProfileFeedUIC.f123445z = true;
        recyclerView = finderProfileFeedUIC.getRecyclerView();
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter != null) {
            if (booleanValue) {
                wVar2 = finderProfileFeedUIC.G;
                if (wVar2 != null && wxRecyclerAdapter.W(wVar2)) {
                    in5.n0.j0(wxRecyclerAdapter, wVar2.getItemId(), false, 2, null);
                }
                android.app.Activity context = finderProfileFeedUIC.getContext();
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.class)).x7();
            } else {
                wVar = finderProfileFeedUIC.G;
                if (wVar != null) {
                    in5.n0.S(wxRecyclerAdapter, wVar, false, 2, null);
                }
                android.app.Activity context2 = finderProfileFeedUIC.getContext();
                kotlin.jvm.internal.o.g(context2, "context");
                pf5.z zVar2 = pf5.z.f353948a;
                if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = (com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.class);
                androidx.viewpager.widget.ViewPager viewPager = finderProfileTabUIC.f133659h;
                if (viewPager instanceof com.tencent.mm.plugin.finder.view.FinderViewPager) {
                    ((com.tencent.mm.plugin.finder.view.FinderViewPager) viewPager).setEnableSrollHorizontally(true);
                }
                finderProfileTabUIC.V6();
            }
        }
        return jz5.f0.f302826a;
    }
}
