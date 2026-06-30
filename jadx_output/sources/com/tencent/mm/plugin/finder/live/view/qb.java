package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class qb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f116610d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        super(1);
        this.f116610d = k0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f116610d.handleRecvLuckyMoneyErr(((java.lang.Number) obj).intValue());
        return jz5.f0.f302826a;
    }
}
