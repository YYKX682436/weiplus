package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class i3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI f179016a;

    public i3(com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI walletUniversalPayOrderUI) {
        this.f179016a = walletUniversalPayOrderUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUniversalPayOrderUI", "errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI walletUniversalPayOrderUI = this.f179016a;
        android.app.Dialog dialog = walletUniversalPayOrderUI.f178968q;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            com.tencent.mm.wallet_core.ui.r1.K(walletUniversalPayOrderUI.getContext(), "");
            return null;
        }
        r45.sh5 sh5Var = (r45.sh5) fVar.f70618d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUniversalPayOrderUI", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(sh5Var.f385736d), ((r45.sh5) fVar.f70618d).f385737e);
        if (sh5Var.f385736d != 0) {
            com.tencent.mm.wallet_core.ui.r1.L(sh5Var.f385737e);
            return null;
        }
        r45.rr6 rr6Var = sh5Var.f385738f;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(rr6Var.f385154d)) {
            walletUniversalPayOrderUI.f178962h.setText(rr6Var.f385154d);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(rr6Var.f385155e)) {
            walletUniversalPayOrderUI.f178963i.setText(rr6Var.f385155e);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(rr6Var.f385156f)) {
            walletUniversalPayOrderUI.f178964m.setText(rr6Var.f385156f);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(rr6Var.f385157g)) {
            walletUniversalPayOrderUI.f178966o.setText(rr6Var.f385157g);
        }
        walletUniversalPayOrderUI.f178965n.setCheck(rr6Var.f385160m == 1);
        walletUniversalPayOrderUI.f178965n.setSwitchListener(new com.tencent.mm.plugin.wallet.pwd.ui.d3(walletUniversalPayOrderUI, rr6Var));
        r45.b74 b74Var = rr6Var.f385158h;
        if (b74Var == null || com.tencent.mm.sdk.platformtools.t8.K0(b74Var.f370602d)) {
            walletUniversalPayOrderUI.f178967p.setVisibility(8);
        } else {
            com.tencent.mm.plugin.wallet_core.ui.d7 d7Var = new com.tencent.mm.plugin.wallet_core.ui.d7(2, new com.tencent.mm.plugin.wallet.pwd.ui.e3(walletUniversalPayOrderUI, rr6Var));
            android.text.SpannableString spannableString = new android.text.SpannableString(rr6Var.f385158h.f370602d);
            spannableString.setSpan(d7Var, 0, spannableString.length(), 18);
            walletUniversalPayOrderUI.f178967p.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(walletUniversalPayOrderUI.getContext()));
            walletUniversalPayOrderUI.f178967p.setClickable(true);
            walletUniversalPayOrderUI.f178967p.setText(spannableString);
            walletUniversalPayOrderUI.f178967p.setVisibility(0);
        }
        com.tencent.mm.plugin.wallet.pwd.ui.o3 o3Var = walletUniversalPayOrderUI.f178959e;
        o3Var.f179046e = rr6Var.f385159i;
        o3Var.notifyDataSetChanged();
        return null;
    }
}
