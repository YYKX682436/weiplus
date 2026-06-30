package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class k5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f123887d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC) {
        super(1);
        this.f123887d = finderProfileFeedUIC;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bq.z1 it = (bq.z1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC = this.f123887d;
        kotlinx.coroutines.y0 lifecycleScope = finderProfileFeedUIC.getLifecycleScope();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(lifecycleScope, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.profile.uic.j5(finderProfileFeedUIC, it, null), 2, null);
        return jz5.f0.f302826a;
    }
}
