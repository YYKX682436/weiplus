package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class p4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f124116d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC) {
        super(0);
        this.f124116d = finderProfileFeedUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.internal.m0 m0Var = com.tencent.mm.plugin.finder.feed.model.internal.m0.f108024q;
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC = this.f124116d;
        java.lang.String username = finderProfileFeedUIC.getUsername();
        kotlin.jvm.internal.o.d(username);
        return new com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader(m0Var, username, finderProfileFeedUIC.getContextObj(), false, false, 0, new com.tencent.mm.plugin.finder.profile.uic.o4(finderProfileFeedUIC), false, 0L, null, 0, null, null, 8088, null);
    }
}
