package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class y1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.z0 f178532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f178533b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI f178534c;

    public y1(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI, com.tencent.mm.plugin.wallet.balance.model.lqt.z0 z0Var, android.app.Dialog dialog) {
        this.f178534c = walletBalanceSaveUI;
        this.f178532a = z0Var;
        this.f178533b = dialog;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.zg5 zg5Var = (r45.zg5) obj;
        if (zg5Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceSaveUI", "fetch detail failed");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceSaveUI", "fetch detail success, account_type: %s, is_hide_close_account_btn: %s", java.lang.Integer.valueOf(zg5Var.C), java.lang.Boolean.valueOf(zg5Var.B));
        this.f178532a.f177758e.b(zg5Var.C, 8);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceSaveUI", "goWalletLqtSaveFetchUI()");
        android.app.Dialog dialog = this.f178533b;
        if (dialog != null) {
            dialog.dismiss();
        }
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.LinkedList linkedList = zg5Var.f392022q;
        if (linkedList != null && linkedList.size() > 0) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.if0 if0Var = (r45.if0) it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(if0Var.f376981d) && !com.tencent.mm.sdk.platformtools.t8.K0(if0Var.f376983f)) {
                    arrayList.add(java.lang.String.format("%s||%s", if0Var.f376981d, if0Var.f376983f));
                }
            }
        }
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI = this.f178534c;
        android.content.Intent intent = new android.content.Intent(walletBalanceSaveUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.class);
        intent.putExtra("lqt_save_fund_code", zg5Var.f392023r);
        intent.putExtra("lqt_account_type", zg5Var.C);
        intent.putExtra("lqt_fund_spid", zg5Var.D);
        intent.putExtra("lqt_save_fetch_mode", 1);
        intent.putExtra("lqt_is_show_protocol", zg5Var.f392018o == 1);
        intent.putExtra("lqt_is_agree_protocol", zg5Var.f392019p == 1);
        intent.putExtra("operate_id", walletBalanceSaveUI.f177842r.f412100e);
        intent.putStringArrayListExtra("lqt_protocol_list", arrayList);
        intent.putExtra("lqt_profile_wording", zg5Var.f392035z);
        intent.putExtra("entrance_type", 8);
        intent.putExtra("fill_money", walletBalanceSaveUI.f177835h.getText());
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = walletBalanceSaveUI.f177833f;
        if (bankcard != null) {
            intent.putExtra("card_serial", bankcard.field_bindSerial);
        }
        if (((h45.q) i95.n0.c(h45.q.class)).startLqtSaveUseCase(walletBalanceSaveUI.getContext(), intent, new com.tencent.mm.plugin.wallet.balance.ui.x1(this))) {
            return null;
        }
        walletBalanceSaveUI.startActivityForResult(intent, 3);
        return null;
    }
}
