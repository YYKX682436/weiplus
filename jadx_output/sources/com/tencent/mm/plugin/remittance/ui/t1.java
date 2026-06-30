package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI f157946d;

    public t1(com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI remittanceBusiResultUI) {
        this.f157946d = remittanceBusiResultUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI remittanceBusiResultUI = this.f157946d;
        if (remittanceBusiResultUI.F == 65) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBusiResultUI", "mPayScene == WalletConstantsProtocal.MMPAY_PAY_SCENE_PERSONAL_PAYMENT_PROCESS,do not doNetSceneBusiF2fSucpage");
            return;
        }
        int i17 = remittanceBusiResultUI.N + 1;
        remittanceBusiResultUI.N = i17;
        remittanceBusiResultUI.doSceneProgress(new com.tencent.mm.plugin.remittance.model.r(remittanceBusiResultUI.U, remittanceBusiResultUI.G, remittanceBusiResultUI.M.f388402d, i17 - 1, java.lang.System.currentTimeMillis()));
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBusiResultUI", "retryFetchData() mRetryTime:%s mBusiF2FFaultConfig.succpage_retry_waiting_ms", java.lang.Integer.valueOf(remittanceBusiResultUI.N), java.lang.Integer.valueOf(remittanceBusiResultUI.M.f388405g));
        if (remittanceBusiResultUI.M.f388404f <= remittanceBusiResultUI.N) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.i(remittanceBusiResultUI.T, r1.f388405g);
    }
}
