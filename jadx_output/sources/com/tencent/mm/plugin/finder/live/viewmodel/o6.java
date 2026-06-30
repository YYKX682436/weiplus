package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class o6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yl2.o f117302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b8 f117303e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(yl2.o oVar, com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var) {
        super(0);
        this.f117302d = oVar;
        this.f117303e = b8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yl2.o oVar = this.f117302d;
        boolean z17 = oVar instanceof yl2.n;
        com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var = this.f117303e;
        if (z17) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "collectAuthRequirementsAfterRefresh: all checks passed, starting live");
            b8Var.i7();
        } else if (oVar instanceof yl2.m) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "collectAuthRequirementsAfterRefresh: still need auth, continuing");
            com.tencent.mm.plugin.finder.live.viewmodel.b8.Q6(b8Var, (yl2.m) oVar);
        } else if (oVar instanceof yl2.l) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "collectAuthRequirementsAfterRefresh: blocked");
            b8Var.V6(((yl2.l) oVar).f463040a);
        }
        return jz5.f0.f302826a;
    }
}
