package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class b1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.d1 f177616a;

    public b1(com.tencent.mm.plugin.wallet.balance.model.lqt.e1 e1Var, com.tencent.mm.plugin.wallet.balance.model.lqt.d1 d1Var) {
        this.f177616a = d1Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.zg5 zg5Var = (r45.zg5) obj;
        com.tencent.mm.plugin.wallet.balance.model.lqt.d1 d1Var = this.f177616a;
        if (d1Var == null) {
            return null;
        }
        d1Var.call(zg5Var);
        return null;
    }
}
