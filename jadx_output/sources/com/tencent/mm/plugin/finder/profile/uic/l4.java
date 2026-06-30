package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class l4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f123939d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC) {
        super(0);
        this.f123939d = finderProfileFeedUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout rlLayout;
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC = this.f123939d;
        rlLayout = finderProfileFeedUIC.getRlLayout();
        kotlin.jvm.internal.o.f(rlLayout, "access$getRlLayout(...)");
        return new com.tencent.mm.plugin.finder.profile.uic.k4(finderProfileFeedUIC, rlLayout);
    }
}
