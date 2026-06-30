package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class a5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f123526d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC) {
        super(2);
        this.f123526d = finderProfileFeedUIC;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout rlLayout;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        rlLayout = this.f123526d.getRlLayout();
        androidx.recyclerview.widget.RecyclerView recyclerView = rlLayout.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.finder.profile.uic.z4(recyclerView, recyclerView, intValue, this.f123526d, intValue2));
        }
        return jz5.f0.f302826a;
    }
}
