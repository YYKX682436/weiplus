package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class jg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f123860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f123861e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC, boolean z17) {
        super(0);
        this.f123860d = finderProfileTabUIC;
        this.f123861e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f123860d;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.p7(finderProfileTabUIC, 6, 0, 2, null);
        if (this.f123861e) {
            bu2.e0.f24498a.a(27, android.text.TextUtils.isEmpty(finderProfileTabUIC.F7()) ? xy2.c.e(finderProfileTabUIC.getContext()) : finderProfileTabUIC.F7(), new java.util.LinkedList());
        }
        return jz5.f0.f302826a;
    }
}
