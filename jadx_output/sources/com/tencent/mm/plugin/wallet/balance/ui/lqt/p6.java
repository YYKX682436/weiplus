package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class p6 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.u6 f178327a;

    public p6(com.tencent.mm.plugin.wallet.balance.ui.lqt.u6 u6Var) {
        this.f178327a = u6Var;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "save failed: %s", obj);
        com.tencent.mm.plugin.wallet.balance.ui.lqt.u6 u6Var = this.f178327a;
        u6Var.f178399d.getClass();
        if (obj != null) {
            db5.e1.t(u6Var.f178399d, obj instanceof java.lang.String ? obj.toString() : u6Var.f178399d.getString(com.tencent.mm.R.string.kpu), "", new com.tencent.mm.plugin.wallet.balance.ui.lqt.o6(this));
        }
    }
}
