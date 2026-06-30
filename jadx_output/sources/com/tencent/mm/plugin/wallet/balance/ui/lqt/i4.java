package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class i4 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f178207a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI f178208b;

    public i4(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI walletLqtPlanDetailUI, android.app.Dialog dialog) {
        this.f178208b = walletLqtPlanDetailUI;
        this.f178207a = dialog;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        this.f178207a.dismiss();
        if (obj instanceof at4.j0) {
            ((at4.j0) obj).a(this.f178208b.getContext(), false);
        }
    }
}
