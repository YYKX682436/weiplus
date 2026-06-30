package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class l2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.w2 f177689a;

    public l2(com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var) {
        this.f177689a = w2Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "CgiLqtOnClickRedeem end, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.plugin.wallet.balance.model.lqt.c3.c(((r45.ry4) fVar.f70618d).C);
            com.tencent.mm.plugin.wallet.balance.model.lqt.m1.b().c((r45.ry4) fVar.f70618d);
            com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177669q.e(((r45.ry4) fVar.f70618d).f385290m, false, false, "");
        }
        km5.b bVar = this.f177689a.f177742l;
        if (bVar == null) {
            return null;
        }
        bVar.resume();
        return null;
    }
}
