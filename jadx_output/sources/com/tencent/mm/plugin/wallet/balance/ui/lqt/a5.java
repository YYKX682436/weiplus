package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class a5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f178091a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI f178092b;

    public a5(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI walletLqtPlanHomeUI, android.app.Dialog dialog) {
        this.f178092b = walletLqtPlanHomeUI;
        this.f178091a = dialog;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        int i17 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI.f178023s;
        this.f178092b.U6(false);
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.wallet.balance.ui.lqt.z4(this), 800L);
        return null;
    }
}
