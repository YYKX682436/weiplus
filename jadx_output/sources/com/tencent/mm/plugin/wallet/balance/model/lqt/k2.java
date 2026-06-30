package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class k2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.w2 f177668b;

    public k2(com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var, int i17) {
        this.f177668b = w2Var;
        this.f177667a = i17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "CgiLqtOnClickPurchase end, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.plugin.wallet.balance.model.lqt.c3.c(((r45.ny4) fVar.f70618d).B);
            com.tencent.mm.plugin.wallet.balance.model.lqt.l0 l0Var = com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177669q;
            l0Var.e(((r45.ny4) fVar.f70618d).f381747f, true, false, "");
            l0Var.f((r45.ny4) fVar.f70618d, this.f177667a);
        }
        km5.b bVar = this.f177668b.f177742l;
        if (bVar == null) {
            return null;
        }
        bVar.resume();
        return null;
    }
}
