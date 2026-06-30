package com.tencent.mm.plugin.finder.ui.at;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.at.l f128884d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.finder.ui.at.l lVar) {
        super(0);
        this.f128884d = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.ui.at.l lVar = this.f128884d;
        ym3.a N = lVar.N();
        ym3.b O = lVar.O();
        xm3.n0 n0Var = new xm3.n0();
        n0Var.f455359d = Integer.MAX_VALUE;
        return new com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneLiveList(N, O, n0Var, lVar);
    }
}
