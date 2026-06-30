package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class x4 implements com.tencent.mm.wallet_core.model.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f178436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI f178437b;

    public x4(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI walletLqtPlanHomeUI, boolean z17) {
        this.f178437b = walletLqtPlanHomeUI;
        this.f178436a = z17;
    }

    @Override // com.tencent.mm.wallet_core.model.d
    public void a(java.lang.Object obj) {
        r45.m85 m85Var = (r45.m85) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanHomeUI", "on index cache callback");
        if (m85Var == null || !this.f178436a) {
            return;
        }
        int i17 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI.f178023s;
        this.f178437b.X6(m85Var);
    }

    @Override // com.tencent.mm.wallet_core.model.d
    public void b(java.lang.Object obj, int i17, int i18) {
        r45.m85 m85Var = (r45.m85) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanHomeUI", "on index response callback");
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI walletLqtPlanHomeUI = this.f178437b;
        if (m85Var == null) {
            at4.j0.b(-1, -1).a(walletLqtPlanHomeUI.getContext(), true);
            return;
        }
        int i19 = m85Var.f380238d;
        if (i19 != 0) {
            at4.j0.c(i19, m85Var.f380239e).a(walletLqtPlanHomeUI.getContext(), true);
        } else {
            int i27 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI.f178023s;
            walletLqtPlanHomeUI.X6(m85Var);
        }
    }
}
