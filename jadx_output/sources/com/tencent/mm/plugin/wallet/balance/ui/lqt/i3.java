package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class i3 implements com.tencent.mm.ui.widget.picker.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f178205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI f178206b;

    public i3(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI, com.tencent.mm.ui.widget.picker.c0 c0Var) {
        this.f178206b = walletLqtPlanAddUI;
        this.f178205a = c0Var;
    }

    @Override // com.tencent.mm.ui.widget.picker.a0
    public void onResult(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.widget.picker.c0 c0Var = this.f178205a;
        c0Var.d();
        if (z17) {
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI = this.f178206b;
            walletLqtPlanAddUI.I.f381163d = c0Var.b() + 1;
            walletLqtPlanAddUI.g7();
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.Z6(walletLqtPlanAddUI);
        }
    }
}
