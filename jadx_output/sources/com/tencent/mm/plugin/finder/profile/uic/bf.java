package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class bf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f123569d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC) {
        super(0);
        this.f123569d = finderProfileTabUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f123569d;
        if (!finderProfileTabUIC.y7(7)) {
            boolean z17 = 8 == finderProfileTabUIC.getActivity().getIntent().getIntExtra("key_enter_profile_tab", 0);
            com.tencent.mm.plugin.finder.profile.uic.re reVar = new com.tencent.mm.plugin.finder.profile.uic.re(finderProfileTabUIC, 7);
            reVar.f477041b = 67;
            finderProfileTabUIC.w7(reVar, z17);
        }
        return jz5.f0.f302826a;
    }
}
