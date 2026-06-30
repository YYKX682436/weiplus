package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC$baseFeedLoader$1 f124245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f124246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC f124247f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC$baseFeedLoader$1 finderProfileAllLayoutUIC$baseFeedLoader$1, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC finderProfileAllLayoutUIC) {
        super(0);
        this.f124245d = finderProfileAllLayoutUIC$baseFeedLoader$1;
        this.f124246e = baseFinderFeed;
        this.f124247f = finderProfileAllLayoutUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC$baseFeedLoader$1 finderProfileAllLayoutUIC$baseFeedLoader$1 = this.f124245d;
        if (finderProfileAllLayoutUIC$baseFeedLoader$1.getDataList().size() > 0) {
            java.util.AbstractList dataList = finderProfileAllLayoutUIC$baseFeedLoader$1.getDataList();
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f124246e;
            dataList.add(1, baseFinderFeed);
            finderProfileAllLayoutUIC$baseFeedLoader$1.getDispatcher().d(1, 1);
            com.tencent.mm.plugin.finder.profile.uic.dk V6 = this.f124247f.V6();
            if (V6 != null) {
                V6.getFeedLoader().getDataList().add(0, baseFinderFeed);
                V6.Q6(true);
            }
        }
        return jz5.f0.f302826a;
    }
}
