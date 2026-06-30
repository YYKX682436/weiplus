package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class p5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f124117d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC) {
        super(0);
        this.f124117d = finderProfileFeedUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout rlLayout;
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout rlLayout2;
        boolean v17;
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC = this.f124117d;
        z17 = finderProfileFeedUIC.f123445z;
        if (z17) {
            com.tencent.mars.xlog.Log.i("Finder.ProfileFeedUIC", "disablePreload with directJump");
        } else {
            rlLayout = finderProfileFeedUIC.getRlLayout();
            if (!rlLayout.getCValues().f330229v) {
                rlLayout2 = finderProfileFeedUIC.getRlLayout();
                v17 = rlLayout2.v();
                return java.lang.Boolean.valueOf(v17);
            }
        }
        v17 = false;
        return java.lang.Boolean.valueOf(v17);
    }
}
