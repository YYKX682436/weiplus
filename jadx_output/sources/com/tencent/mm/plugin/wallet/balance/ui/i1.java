package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class i1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI f177903d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI) {
        super(false);
        this.f177903d = walletBalanceSaveUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI = this.f177903d;
        walletBalanceSaveUI.f177850z.clear();
        hs4.d dVar = walletBalanceSaveUI.f177844t;
        if (dVar != null && dVar.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceSaveUI", "mmBottomSheet != null && mmBottomSheet.isShowing(),dont show bottomSheet");
            return;
        }
        walletBalanceSaveUI.f177844t = new hs4.d(walletBalanceSaveUI);
        java.util.List list = walletBalanceSaveUI.f177832e;
        if (list == null) {
            list = new java.util.LinkedList();
        }
        int size = list.size();
        for (int i17 = 0; i17 < list.size(); i17++) {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) list.get(i17);
            if (walletBalanceSaveUI.f177833f != null && !com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_bindSerial) && walletBalanceSaveUI.f177833f.field_bindSerial.equals(bankcard.field_bindSerial)) {
                size = i17;
            }
        }
        if (walletBalanceSaveUI.f177833f == null) {
            size = -1;
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_payment_select_remove_confirm_button_android, false);
        walletBalanceSaveUI.f177844t.f284618c = new com.tencent.mm.plugin.wallet.balance.ui.n1(walletBalanceSaveUI, list);
        db5.g4 g4Var = new db5.g4(walletBalanceSaveUI);
        g4Var.r(0, walletBalanceSaveUI.getString(com.tencent.mm.R.string.kfk), null, walletBalanceSaveUI.getResources().getDrawable(com.tencent.mm.R.raw.icons_outlined_pay_cards), walletBalanceSaveUI.getResources().getColor(com.tencent.mm.R.color.FG_2), false);
        if (fj6) {
            g4Var.t(1, "", true);
        }
        hs4.d dVar2 = walletBalanceSaveUI.f177844t;
        com.tencent.mm.plugin.wallet.balance.ui.o1 o1Var = new com.tencent.mm.plugin.wallet.balance.ui.o1(walletBalanceSaveUI);
        dVar2.f284622g = g4Var;
        dVar2.f284620e = o1Var;
        if (fj6) {
            dVar2.f284619d = new com.tencent.mm.plugin.wallet.balance.ui.p1(walletBalanceSaveUI, list);
        } else {
            dVar2.f284616a.F = new com.tencent.mm.plugin.wallet.balance.ui.q1(walletBalanceSaveUI, list);
        }
        android.view.View inflate = android.view.View.inflate(walletBalanceSaveUI, com.tencent.mm.R.layout.btw, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ixu);
        textView.setText(com.tencent.mm.R.string.kef);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.cx_);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceSaveUI", "showBankcardList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceSaveUI", "showBankcardList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.findViewById(com.tencent.mm.R.id.iwt).setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.r1(walletBalanceSaveUI));
        inflate.findViewById(com.tencent.mm.R.id.iwt).setContentDescription(walletBalanceSaveUI.getString(com.tencent.mm.R.string.kdv));
        hs4.d dVar3 = walletBalanceSaveUI.f177844t;
        dVar3.f284616a.t(inflate);
        dVar3.f284625j = inflate;
        hs4.d dVar4 = walletBalanceSaveUI.f177844t;
        dVar4.f284628m = size;
        dVar4.f284627l = true;
        if (fj6) {
            dVar4.f284626k = false;
        } else {
            dVar4.f284626k = true;
        }
        dVar4.f284616a.y(walletBalanceSaveUI.getResources().getString(com.tencent.mm.R.string.kl_));
        walletBalanceSaveUI.f177844t.d();
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.wallet.balance.ui.s1(walletBalanceSaveUI, textView), 500L);
        walletBalanceSaveUI.showCircleStWcKb();
    }
}
