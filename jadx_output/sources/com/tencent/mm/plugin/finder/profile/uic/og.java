package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class og extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC f124095d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC finderProfileTemplateUIC) {
        super(0);
        this.f124095d = finderProfileTemplateUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC finderProfileTemplateUIC = this.f124095d;
        com.tencent.mm.view.RefreshLoadMoreLayout Q6 = finderProfileTemplateUIC.Q6();
        kotlin.jvm.internal.o.f(Q6, "access$getRlLayout(...)");
        return new com.tencent.mm.plugin.finder.profile.uic.ng(finderProfileTemplateUIC, Q6);
    }
}
