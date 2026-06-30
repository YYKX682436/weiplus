package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes15.dex */
public final class d9 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI f129061d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI) {
        super(2);
        this.f129061d = finderLivePostHelperUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String verifyUrl = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(verifyUrl, "verifyUrl");
        com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI = this.f129061d;
        finderLivePostHelperUI.f128610z = intValue;
        if (intValue != 1) {
            if (intValue != 4) {
                if (intValue != 5) {
                    finderLivePostHelperUI.s7(verifyUrl, 10001);
                } else if (com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.d7(finderLivePostHelperUI)) {
                    com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.j7(finderLivePostHelperUI, intValue, verifyUrl);
                } else {
                    com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.k7(finderLivePostHelperUI, verifyUrl);
                }
            } else if (com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.d7(finderLivePostHelperUI)) {
                com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.j7(finderLivePostHelperUI, intValue, verifyUrl);
            } else {
                com.tencent.mm.sdk.coroutines.LifecycleScope uICScope = finderLivePostHelperUI.getUICScope();
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(uICScope, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.ui.o8(finderLivePostHelperUI, null), 2, null);
            }
        } else if (com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.d7(finderLivePostHelperUI)) {
            com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.j7(finderLivePostHelperUI, intValue, verifyUrl);
        } else {
            com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.g7(finderLivePostHelperUI);
        }
        return jz5.f0.f302826a;
    }
}
