package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class a0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI f178087a;

    public a0(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI) {
        this.f178087a = walletLqtBalanceAutoTransferUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "qry back: %s, %s, %s", java.lang.Integer.valueOf(fVar.f70616b), java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70615a));
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI = this.f178087a;
        if (i17 != 0 || fVar.f70616b != 0) {
            com.tencent.mm.wallet_core.ui.r1.K(walletLqtBalanceAutoTransferUI.getContext(), fVar.f70617c);
            return null;
        }
        com.tencent.mm.plugin.wallet.balance.model.lqt.c3.c(((r45.xg5) fVar.f70618d).f390084o);
        r45.xg5 xg5Var = (r45.xg5) fVar.f70618d;
        if (xg5Var.f390076d != 0) {
            com.tencent.mm.wallet_core.ui.r1.M(walletLqtBalanceAutoTransferUI.getContext(), ((r45.xg5) fVar.f70618d).f390077e);
            return null;
        }
        walletLqtBalanceAutoTransferUI.f177943q = xg5Var.f390082m;
        walletLqtBalanceAutoTransferUI.f177944r = xg5Var.f390083n;
        walletLqtBalanceAutoTransferUI.f177937h.setText(xg5Var.f390078f);
        walletLqtBalanceAutoTransferUI.f177938i.setText(xg5Var.f390079g);
        r45.e1 e1Var = xg5Var.f390080h;
        if (e1Var != null) {
            walletLqtBalanceAutoTransferUI.f177934e.setText(e1Var.f372897d);
            int i18 = xg5Var.f390080h.f372898e;
            if (i18 == 0) {
                walletLqtBalanceAutoTransferUI.X6();
            } else if (i18 == 1) {
                walletLqtBalanceAutoTransferUI.W6();
            } else if (i18 == 2) {
                walletLqtBalanceAutoTransferUI.f177933d.setCheck(false);
                walletLqtBalanceAutoTransferUI.f177933d.setEnabled(false);
                android.view.View view = walletLqtBalanceAutoTransferUI.f177945s;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "setAcctountDisabled", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "setAcctountDisabled", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                walletLqtBalanceAutoTransferUI.U6();
            }
        }
        r45.bm6 bm6Var = xg5Var.f390081i;
        if (bm6Var == null) {
            return null;
        }
        walletLqtBalanceAutoTransferUI.f177935f.setText(bm6Var.f370875d);
        r45.dm6 dm6Var = xg5Var.f390081i.f370876e;
        if (dm6Var == null) {
            return null;
        }
        walletLqtBalanceAutoTransferUI.getClass();
        walletLqtBalanceAutoTransferUI.f177941o = dm6Var.f372578d / 60;
        walletLqtBalanceAutoTransferUI.f177936g.setText(walletLqtBalanceAutoTransferUI.V6(dm6Var, com.tencent.mm.R.string.kop));
        return null;
    }
}
