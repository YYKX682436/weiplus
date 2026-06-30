package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class b5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f123553d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC) {
        super(2);
        this.f123553d = finderProfileFeedUIC;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader feedLoader;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader feedLoader2;
        r45.r03 item = (r45.r03) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC = this.f123553d;
        if (booleanValue) {
            feedLoader2 = finderProfileFeedUIC.getFeedLoader();
            feedLoader2.switchToTopic(item.getLong(1));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(21570, finderProfileFeedUIC.getUsername() + ",2," + pm0.v.u(item.getLong(1)));
        } else {
            feedLoader = finderProfileFeedUIC.getFeedLoader();
            feedLoader.switchToTopic(0L);
        }
        return jz5.f0.f302826a;
    }
}
