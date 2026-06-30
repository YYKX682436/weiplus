package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class o4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f124042d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC) {
        super(0);
        this.f124042d = finderProfileFeedUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long fromFeedId;
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC = this.f124042d;
        fromFeedId = finderProfileFeedUIC.getFromFeedId();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("", "page_pull_up_refresh", com.tencent.mm.plugin.finder.report.d2.f124994a.b(finderProfileFeedUIC.getContextObj(), kz5.c1.k(new jz5.l("source_feedid", pm0.v.u(fromFeedId)), new jz5.l("author_finder_username", finderProfileFeedUIC.getUsername()))), 1, false);
        return jz5.f0.f302826a;
    }
}
