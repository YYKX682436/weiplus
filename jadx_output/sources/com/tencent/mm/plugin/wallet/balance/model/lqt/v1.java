package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes8.dex */
public class v1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f177728a;

    public v1(com.tencent.mm.plugin.wallet.balance.model.lqt.w1 w1Var, km5.b bVar) {
        this.f177728a = bVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtPlanHomeInteractor", "errCode: %s, errType: %s, resp: %s", java.lang.Integer.valueOf(fVar.f70616b), java.lang.Integer.valueOf(fVar.f70615a), fVar.f70618d);
        int i17 = fVar.f70615a;
        km5.b bVar = this.f177728a;
        if (i17 != 0 || fVar.f70616b != 0) {
            bVar.a(at4.j0.b(fVar.f70616b, i17));
            return null;
        }
        r45.hi4 hi4Var = (r45.hi4) fVar.f70618d;
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtPlanHomeInteractor", "retCode: %s, retMsg: %s", java.lang.Integer.valueOf(hi4Var.f376203d), hi4Var.f376204e);
        int i18 = hi4Var.f376203d;
        if (i18 == 0) {
            bVar.c(hi4Var);
            return null;
        }
        bVar.a(at4.j0.c(i18, hi4Var.f376204e));
        return null;
    }
}
