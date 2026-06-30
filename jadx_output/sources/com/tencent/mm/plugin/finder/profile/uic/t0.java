package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC f124219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC$baseFeedLoader$1 f124220e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC finderProfileAllLayoutUIC, com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC$baseFeedLoader$1 finderProfileAllLayoutUIC$baseFeedLoader$1) {
        super(0);
        this.f124219d = finderProfileAllLayoutUIC;
        this.f124220e = finderProfileAllLayoutUIC$baseFeedLoader$1;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f124219d.f123418h - 1;
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC$baseFeedLoader$1 finderProfileAllLayoutUIC$baseFeedLoader$1 = this.f124220e;
        if (i17 < finderProfileAllLayoutUIC$baseFeedLoader$1.getDataList().size() && i17 >= 0) {
            finderProfileAllLayoutUIC$baseFeedLoader$1.getDataList().remove(i17);
            finderProfileAllLayoutUIC$baseFeedLoader$1.getDispatcher().e(i17, 1);
        }
        return jz5.f0.f302826a;
    }
}
