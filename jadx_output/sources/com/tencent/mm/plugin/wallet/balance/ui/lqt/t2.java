package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class t2 implements com.tencent.mm.wallet_core.model.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f178372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f178373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI f178374c;

    public t2(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI, boolean z17, android.app.Dialog dialog) {
        this.f178374c = walletLqtPlanAddUI;
        this.f178372a = z17;
        this.f178373b = dialog;
    }

    @Override // com.tencent.mm.wallet_core.model.d
    public void a(java.lang.Object obj) {
        r45.hb5 hb5Var = (r45.hb5) obj;
        if (hb5Var != null) {
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.X6(this.f178374c, hb5Var, this.f178372a);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.d
    public void b(java.lang.Object obj, int i17, int i18) {
        r45.hb5 hb5Var = (r45.hb5) obj;
        android.app.Dialog dialog = this.f178373b;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI = this.f178374c;
        if (hb5Var == null) {
            at4.j0.b(0, 0).a(walletLqtPlanAddUI.getContext(), true);
            return;
        }
        int i19 = hb5Var.f376007d;
        if (i19 == 0) {
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.X6(walletLqtPlanAddUI, hb5Var, this.f178372a);
        } else {
            at4.j0.c(i19, hb5Var.f376008e).a(walletLqtPlanAddUI.getContext(), true);
        }
    }
}
