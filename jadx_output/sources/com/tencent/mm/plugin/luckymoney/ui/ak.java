package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ak extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI f146716d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI) {
        super(false);
        this.f146716d = luckyMoneyNotHookReceiveUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI = this.f146716d;
        android.os.ResultReceiver resultReceiver = luckyMoneyNotHookReceiveUI.f146490y1;
        if (resultReceiver != null) {
            resultReceiver.send(0, null);
        }
        luckyMoneyNotHookReceiveUI.finish();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        long j17 = luckyMoneyNotHookReceiveUI.B1;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        g0Var.d(22105, 4, java.lang.Long.valueOf((android.os.SystemClock.elapsedRealtime() - j17) / 1000));
    }
}
