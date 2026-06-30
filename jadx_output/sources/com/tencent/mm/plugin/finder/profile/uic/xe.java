package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class xe extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f124364d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC) {
        super(0);
        this.f124364d = finderProfileTabUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f124364d;
        if (!finderProfileTabUIC.y7(1)) {
            com.tencent.mm.plugin.finder.profile.uic.re reVar = new com.tencent.mm.plugin.finder.profile.uic.re(finderProfileTabUIC, 1);
            reVar.f477041b = 1;
            finderProfileTabUIC.w7(reVar, true);
        }
        return jz5.f0.f302826a;
    }
}
