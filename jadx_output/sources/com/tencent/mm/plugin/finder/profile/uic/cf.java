package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class cf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f123595d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC) {
        super(0);
        this.f123595d = finderProfileTabUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f123595d;
        if (!finderProfileTabUIC.y7(2)) {
            com.tencent.mm.plugin.finder.profile.uic.re reVar = new com.tencent.mm.plugin.finder.profile.uic.re(finderProfileTabUIC, 2);
            reVar.f477041b = 10;
            com.tencent.mm.plugin.finder.profile.FinderProfileFeedFragment finderProfileFeedFragment = new com.tencent.mm.plugin.finder.profile.FinderProfileFeedFragment();
            int size = finderProfileTabUIC.f7().size();
            finderProfileFeedFragment.f129265p = reVar.f124186k;
            finderProfileTabUIC.P6(size, reVar, finderProfileFeedFragment, false);
        }
        return jz5.f0.f302826a;
    }
}
