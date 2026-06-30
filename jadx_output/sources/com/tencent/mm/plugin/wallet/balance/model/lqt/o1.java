package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes8.dex */
public class o1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f177699a;

    public o1(com.tencent.mm.plugin.wallet.balance.model.lqt.q1 q1Var, km5.b bVar) {
        this.f177699a = bVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtPlanAddInteractor", "errCode: %s, errType: %s, resp: %s", java.lang.Integer.valueOf(fVar.f70616b), java.lang.Integer.valueOf(fVar.f70615a), fVar.f70618d);
        int i17 = fVar.f70615a;
        km5.b bVar = this.f177699a;
        if (i17 != 0 || fVar.f70616b != 0) {
            bVar.a(at4.j0.b(fVar.f70616b, i17));
            return null;
        }
        r45.up4 up4Var = (r45.up4) fVar.f70618d;
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtPlanAddInteractor", "retCode: %s, retMsg: %s", java.lang.Integer.valueOf(up4Var.f387547d), up4Var.f387548e);
        int i18 = up4Var.f387547d;
        if (i18 == 0) {
            bVar.c(up4Var);
            return null;
        }
        bVar.a(at4.j0.c(i18, up4Var.f387548e));
        return null;
    }
}
