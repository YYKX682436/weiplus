package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class w3 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f178420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI f178421b;

    public w3(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f178421b = walletLqtPlanAddUI;
        this.f178420a = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "click agree ");
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI = this.f178421b;
        if (walletLqtPlanAddUI.C == 1) {
            walletLqtPlanAddUI.d7(0);
        } else {
            walletLqtPlanAddUI.d7(4);
        }
        this.f178420a.B();
    }
}
