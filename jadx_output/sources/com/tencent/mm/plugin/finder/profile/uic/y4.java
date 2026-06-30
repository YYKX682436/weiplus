package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class y4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader f124379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f124380e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader finderProfileFeedLoader, com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC) {
        super(2);
        this.f124379d = finderProfileFeedLoader;
        this.f124380e = finderProfileFeedUIC;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        ((java.lang.Number) obj2).longValue();
        com.tencent.mars.xlog.Log.i(this.f124379d.getF123427d(), "profileScroll cgiBack");
        androidx.fragment.app.Fragment fragment = this.f124380e.getFragment();
        kotlin.jvm.internal.o.d(fragment);
        ((com.tencent.mm.plugin.finder.profile.uic.f4) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.profile.uic.f4.class)).P6(intValue, com.tencent.mm.R.id.rlc);
        return jz5.f0.f302826a;
    }
}
