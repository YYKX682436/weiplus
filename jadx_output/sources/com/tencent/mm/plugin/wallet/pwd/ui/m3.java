package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class m3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI f179036a;

    public m3(com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI walletUniversalPayOrderUI) {
        this.f179036a = walletUniversalPayOrderUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUniversalPayOrderUI", "errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI walletUniversalPayOrderUI = this.f179036a;
        android.app.Dialog dialog = walletUniversalPayOrderUI.f178968q;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            com.tencent.mm.wallet_core.ui.r1.K(walletUniversalPayOrderUI.getContext(), "");
            walletUniversalPayOrderUI.f178965n.setCheck(true);
            return null;
        }
        r45.y40 y40Var = (r45.y40) fVar.f70618d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUniversalPayOrderUI", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(y40Var.f390773d), ((r45.y40) fVar.f70618d).f390774e);
        if (y40Var.f390773d != 0) {
            com.tencent.mm.wallet_core.ui.r1.L(y40Var.f390774e);
            walletUniversalPayOrderUI.f178965n.setCheck(true);
            return null;
        }
        java.util.List list = walletUniversalPayOrderUI.f178959e.f179046e;
        if (list != null) {
            list.clear();
        }
        walletUniversalPayOrderUI.f178959e.notifyDataSetChanged();
        walletUniversalPayOrderUI.setResult(-1);
        return null;
    }
}
