package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class k3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI f179024a;

    public k3(com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI walletUniversalPayOrderUI) {
        this.f179024a = walletUniversalPayOrderUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUniversalPayOrderUI", "errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI walletUniversalPayOrderUI = this.f179024a;
        android.app.Dialog dialog = walletUniversalPayOrderUI.f178968q;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            com.tencent.mm.wallet_core.ui.r1.K(walletUniversalPayOrderUI.getContext(), "");
            walletUniversalPayOrderUI.f178965n.setCheck(false);
            return null;
        }
        r45.z15 z15Var = (r45.z15) fVar.f70618d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUniversalPayOrderUI", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(z15Var.f391607d), ((r45.z15) fVar.f70618d).f391608e);
        if (z15Var.f391607d != 0) {
            com.tencent.mm.wallet_core.ui.r1.L(z15Var.f391608e);
            walletUniversalPayOrderUI.f178965n.setCheck(false);
            return null;
        }
        com.tencent.mm.plugin.wallet.pwd.ui.o3 o3Var = walletUniversalPayOrderUI.f178959e;
        o3Var.f179046e = z15Var.f391609f;
        o3Var.notifyDataSetChanged();
        walletUniversalPayOrderUI.setResult(-1);
        return null;
    }
}
