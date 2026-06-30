package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class j2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f177664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.w2 f177665b;

    public j2(com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var, java.lang.String str) {
        this.f177665b = w2Var;
        this.f177664a = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.an5 an5Var = (r45.an5) obj;
        com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var = this.f177665b;
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "%s doRedeemFund finish: %s", java.lang.Integer.valueOf(w2Var.hashCode()), an5Var);
        w2Var.f177732b.hideLoading();
        w2Var.d(this.f177664a);
        km5.b bVar = w2Var.f177742l;
        if (bVar == null) {
            return null;
        }
        bVar.c(an5Var);
        return null;
    }
}
