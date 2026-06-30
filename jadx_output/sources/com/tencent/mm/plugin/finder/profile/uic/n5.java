package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class n5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f124000d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC) {
        super(1);
        this.f124000d = finderProfileFeedUIC;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout rlLayout;
        ((java.lang.Number) obj).intValue();
        rlLayout = this.f124000d.getRlLayout();
        rlLayout.e(true);
        return jz5.f0.f302826a;
    }
}
