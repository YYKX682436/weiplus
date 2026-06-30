package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class q2 implements com.tencent.kinda.gen.UseCaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.ff5 f177708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Bankcard f177709b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.w2 f177710c;

    public q2(com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var, r45.ff5 ff5Var, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        this.f177710c = w2Var;
        this.f177708a = ff5Var;
        this.f177709b = bankcard;
    }

    @Override // com.tencent.kinda.gen.UseCaseCallback
    public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        if (iTransmitKvData == null || !iTransmitKvData.getString("result").equals("ok")) {
            return;
        }
        boolean bool = iTransmitKvData.getBool("use_joint_channel");
        java.lang.String string = iTransmitKvData.getString(ya.b.TRANSACTION_ID);
        com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var = this.f177710c;
        w2Var.f177734d = string;
        java.lang.String str = (java.lang.String) ((java.util.HashMap) w2Var.f177743m).get(this.f177708a.f374282f);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            w2Var.f177733c = str;
        }
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = w2Var.f177732b;
        if (walletBaseUI instanceof com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI) {
            ((com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI) walletBaseUI).f178074x1 = true;
            ((com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI) walletBaseUI).j7();
        }
        w2Var.b(this.f177709b.field_bindSerial, bool ? 1 : 0);
    }
}
