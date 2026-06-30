package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class y4 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f178452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI f178453b;

    public y4(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI walletLqtPlanHomeUI, android.app.Dialog dialog) {
        this.f178453b = walletLqtPlanHomeUI;
        this.f178452a = dialog;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        this.f178452a.dismiss();
        if (obj instanceof at4.j0) {
            ((at4.j0) obj).a(this.f178453b.getContext(), false);
        }
    }
}
