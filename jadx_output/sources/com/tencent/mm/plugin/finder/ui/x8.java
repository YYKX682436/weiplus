package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes15.dex */
public final class x8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f130007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI f130008e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f130009f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(int i17, com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI, java.lang.String str) {
        super(1);
        this.f130007d = i17;
        this.f130008e = finderLivePostHelperUI;
        this.f130009f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            boolean z17 = true;
            int i17 = this.f130007d;
            if (i17 != 1 && i17 != 4 && i17 != 5) {
                z17 = false;
            }
            java.lang.String str = this.f130009f;
            com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI = this.f130008e;
            if (z17 && com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.d7(finderLivePostHelperUI)) {
                com.tencent.mm.sdk.coroutines.LifecycleScope uICScope = finderLivePostHelperUI.getUICScope();
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(uICScope, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.ui.j9(finderLivePostHelperUI, i17, str, null), 2, null);
            } else {
                int i18 = com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.C;
                finderLivePostHelperUI.r7(str, i17);
            }
        } else {
            com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.o7(this.f130008e, false, 0, null, 6, null);
        }
        return jz5.f0.f302826a;
    }
}
