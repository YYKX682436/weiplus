package com.tencent.mm.plugin.finder.profile.filter;

/* loaded from: classes2.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView f123378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.FlowLayoutManager f123379e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f123380f;

    public n(com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView finderTopicFilterView, com.tencent.mm.plugin.finder.profile.FlowLayoutManager flowLayoutManager, boolean z17) {
        this.f123378d = finderTopicFilterView;
        this.f123379e = flowLayoutManager;
        this.f123380f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f123379e.f123302m;
        com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView finderTopicFilterView = this.f123378d;
        finderTopicFilterView.setFoldHeight(i17 + i65.a.b(finderTopicFilterView.getContext(), 8));
        if (this.f123380f) {
            finderTopicFilterView.e(0, finderTopicFilterView.foldHeight, 0.0f, 1.0f);
        } else {
            finderTopicFilterView.e(finderTopicFilterView.foldHeight, 0, 1.0f, 0.0f);
        }
    }
}
