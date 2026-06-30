package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class n5 implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.be4 f178287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178288b;

    public n5(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI, r45.be4 be4Var) {
        this.f178288b = walletLqtSaveFetchUI;
        this.f178287a = be4Var;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public void a(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "click balance limit wording");
        androidx.appcompat.app.AppCompatActivity context = this.f178288b.getContext();
        r45.be4 be4Var = this.f178287a;
        com.tencent.mm.wallet_core.ui.r1.W(context, be4Var.f370705p.f384100f, true, 1);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20216, 1, be4Var.f370705p.f384100f);
    }
}
