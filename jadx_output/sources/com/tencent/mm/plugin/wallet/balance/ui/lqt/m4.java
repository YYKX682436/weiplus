package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes.dex */
public class m4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f178270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI f178271e;

    public m4(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI walletLqtPlanDetailUI, java.util.List list) {
        this.f178271e = walletLqtPlanDetailUI;
        this.f178270d = list;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        java.util.Iterator it = this.f178270d.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            if (intValue != 1) {
                com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI walletLqtPlanDetailUI = this.f178271e;
                if (intValue == 2) {
                    g4Var.f(intValue, walletLqtPlanDetailUI.getString(com.tencent.mm.R.string.kqe));
                } else if (intValue == 3) {
                    g4Var.d(intValue, walletLqtPlanDetailUI.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), walletLqtPlanDetailUI.getString(com.tencent.mm.R.string.kqb));
                } else if (intValue == 4) {
                    g4Var.a(intValue, com.tencent.mm.R.string.kqc);
                }
            } else {
                g4Var.a(intValue, com.tencent.mm.R.string.kqd);
            }
        }
    }
}
