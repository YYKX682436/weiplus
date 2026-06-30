package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class x2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f178433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI f178434b;

    public x2(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI, android.app.Dialog dialog) {
        this.f178434b = walletLqtPlanAddUI;
        this.f178433a = dialog;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        this.f178433a.dismiss();
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI = this.f178434b;
        walletLqtPlanAddUI.setResult(-1);
        walletLqtPlanAddUI.finish();
        return null;
    }
}
