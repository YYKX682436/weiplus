package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class a4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI f178090d;

    public a4(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI) {
        this.f178090d = walletLqtPlanAddUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.f177980y0;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI = this.f178090d;
        walletLqtPlanAddUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "show bankcard menu");
        if (walletLqtPlanAddUI.f177998w.isShown()) {
            walletLqtPlanAddUI.hideWcKb();
        }
        hs4.d dVar = walletLqtPlanAddUI.Z;
        if (dVar == null || !dVar.a()) {
            walletLqtPlanAddUI.Z = new hs4.d(walletLqtPlanAddUI);
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_payment_select_remove_confirm_button_android, false);
            java.util.List list = walletLqtPlanAddUI.G;
            if (list == null) {
                list = new java.util.LinkedList();
            }
            int size = list.size();
            com.tencent.mm.plugin.wallet_core.model.Bankcard c76 = walletLqtPlanAddUI.c7(walletLqtPlanAddUI.I.f381167h);
            if (c76 != null && !com.tencent.mm.sdk.platformtools.t8.K0(c76.field_bindSerial)) {
                for (int i18 = 0; i18 < list.size(); i18++) {
                    if (c76.field_bindSerial.equals(((com.tencent.mm.plugin.wallet_core.model.Bankcard) list.get(i18)).field_bindSerial)) {
                        size = i18;
                    }
                }
            }
            if (c76 == null) {
                size = -1;
            }
            walletLqtPlanAddUI.Z.f284618c = new com.tencent.mm.plugin.wallet.balance.ui.lqt.b3(walletLqtPlanAddUI, list);
            db5.g4 g4Var = new db5.g4(walletLqtPlanAddUI);
            g4Var.r(0, walletLqtPlanAddUI.getString(com.tencent.mm.R.string.kpz), null, walletLqtPlanAddUI.getResources().getDrawable(com.tencent.mm.R.raw.icons_outlined_pay_cards), walletLqtPlanAddUI.getResources().getColor(com.tencent.mm.R.color.FG_2), false);
            if (fj6) {
                g4Var.t(1, "", true);
            }
            hs4.d dVar2 = walletLqtPlanAddUI.Z;
            com.tencent.mm.plugin.wallet.balance.ui.lqt.c3 c3Var = new com.tencent.mm.plugin.wallet.balance.ui.lqt.c3(walletLqtPlanAddUI);
            dVar2.f284622g = g4Var;
            dVar2.f284620e = c3Var;
            if (fj6) {
                dVar2.f284619d = new com.tencent.mm.plugin.wallet.balance.ui.lqt.d3(walletLqtPlanAddUI, list);
            } else {
                dVar2.f284616a.F = new com.tencent.mm.plugin.wallet.balance.ui.lqt.e3(walletLqtPlanAddUI, list);
            }
            android.view.View inflate = android.view.View.inflate(walletLqtPlanAddUI, com.tencent.mm.R.layout.btw, null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ixu);
            textView.setText(com.tencent.mm.R.string.kpx);
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.cx_);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI", "showBankcardListMenu", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI", "showBankcardListMenu", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.findViewById(com.tencent.mm.R.id.iwt).setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.g3(walletLqtPlanAddUI));
            inflate.findViewById(com.tencent.mm.R.id.iwt).setContentDescription(walletLqtPlanAddUI.getString(com.tencent.mm.R.string.kdv));
            hs4.d dVar3 = walletLqtPlanAddUI.Z;
            dVar3.f284616a.t(inflate);
            dVar3.f284625j = inflate;
            hs4.d dVar4 = walletLqtPlanAddUI.Z;
            dVar4.f284628m = size;
            dVar4.f284627l = true;
            if (fj6) {
                dVar4.f284626k = false;
            } else {
                dVar4.f284626k = true;
            }
            dVar4.f284616a.y(walletLqtPlanAddUI.getResources().getString(com.tencent.mm.R.string.kl_));
            walletLqtPlanAddUI.Z.d();
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.wallet.balance.ui.lqt.h3(walletLqtPlanAddUI, textView), 500L);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "mmBottomSheet != null && mmBottomSheet.isShowing(),dont show bottomSheet");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
