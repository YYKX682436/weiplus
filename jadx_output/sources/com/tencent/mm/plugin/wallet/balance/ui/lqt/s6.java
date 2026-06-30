package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class s6 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.u6 f178369a;

    public s6(com.tencent.mm.plugin.wallet.balance.ui.lqt.u6 u6Var) {
        this.f178369a = u6Var;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.u6 u6Var = this.f178369a;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = u6Var.f178399d;
        boolean z17 = false;
        walletLqtSaveFetchUI.f178074x1 = false;
        walletLqtSaveFetchUI.getClass();
        if (obj != null) {
            boolean z18 = obj instanceof r45.an5;
            if (z18) {
                r45.an5 an5Var = (r45.an5) obj;
                z17 = np5.t.a(u6Var.f178399d, null, 1000, an5Var.f370142d, an5Var.f370143e);
            }
            if (z17) {
                return;
            }
            db5.e1.t(u6Var.f178399d, obj instanceof java.lang.String ? obj.toString() : z18 ? ((r45.an5) obj).f370143e : u6Var.f178399d.getString(com.tencent.mm.R.string.kpu), "", new com.tencent.mm.plugin.wallet.balance.ui.lqt.r6(this));
        }
    }
}
