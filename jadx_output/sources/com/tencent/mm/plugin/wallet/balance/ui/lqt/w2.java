package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class w2 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f178418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI f178419b;

    public w2(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI, android.app.Dialog dialog) {
        this.f178419b = walletLqtPlanAddUI;
        this.f178418a = dialog;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        this.f178418a.dismiss();
        if (obj instanceof at4.j0) {
            ((at4.j0) obj).a(this.f178419b.getContext(), false);
        }
    }
}
