package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes2.dex */
public class y7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.z7 f178460a;

    public y7(com.tencent.mm.plugin.wallet.balance.ui.lqt.z7 z7Var) {
        this.f178460a = z7Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "on get distribute preview finish, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            return null;
        }
        r45.ie3 ie3Var = (r45.ie3) fVar.f70618d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "on get distribute preview finish, retcode: %s, retmsg: %s url:%s", java.lang.Integer.valueOf(ie3Var.f376965d), ie3Var.f376966e, ie3Var.f376967f);
        if (ie3Var.f376965d != 0) {
            return null;
        }
        com.tencent.mm.plugin.wallet.balance.model.lqt.c3.c(ie3Var.f376968g);
        com.tencent.mm.wallet_core.ui.r1.V(this.f178460a.f178475c.getContext(), ie3Var.f376967f, true);
        return null;
    }
}
