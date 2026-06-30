package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class y2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f179123b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI f179124c;

    public y2(com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI walletUniversalPayOrderUI, int i17, int i18) {
        this.f179124c = walletUniversalPayOrderUI;
        this.f179122a = i17;
        this.f179123b = i18;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUniversalPayOrderUI", "errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI walletUniversalPayOrderUI = this.f179124c;
        android.app.Dialog dialog = walletUniversalPayOrderUI.f178968q;
        if (dialog != null) {
            dialog.dismiss();
        }
        int i17 = fVar.f70615a;
        int i18 = this.f179123b;
        int i19 = this.f179122a;
        if (i17 != 0 || fVar.f70616b != 0) {
            com.tencent.mm.wallet_core.ui.r1.K(walletUniversalPayOrderUI.getContext(), "");
            walletUniversalPayOrderUI.f178959e.a(i19, i18);
            walletUniversalPayOrderUI.f178959e.notifyDataSetChanged();
            return null;
        }
        r45.xs6 xs6Var = (r45.xs6) fVar.f70618d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUniversalPayOrderUI", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(xs6Var.f390382d), ((r45.xs6) fVar.f70618d).f390383e);
        if (xs6Var.f390382d == 0) {
            walletUniversalPayOrderUI.setResult(-1);
            return null;
        }
        com.tencent.mm.wallet_core.ui.r1.L(xs6Var.f390383e);
        walletUniversalPayOrderUI.f178959e.a(i19, i18);
        walletUniversalPayOrderUI.f178959e.notifyDataSetChanged();
        return null;
    }
}
