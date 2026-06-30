package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes.dex */
public class l3 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI f142899a;

    public l3(com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI iPCallRechargeUI) {
        this.f142899a = iPCallRechargeUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message.what != 1002) {
            com.tencent.mars.xlog.Log.w("MicroMsg.IPCallRechargeUI", "unknow message, cannt handle.");
            return;
        }
        com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI iPCallRechargeUI = this.f142899a;
        iPCallRechargeUI.f142663s.setVisibility(0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(iPCallRechargeUI.f142658n) || com.tencent.mm.sdk.platformtools.t8.K0(iPCallRechargeUI.f142659o)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRechargeUI", "showGotoExchangeRecordsAlert");
        db5.e1.C(iPCallRechargeUI, iPCallRechargeUI.f142659o, iPCallRechargeUI.f142658n, iPCallRechargeUI.getString(com.tencent.mm.R.string.g4c), iPCallRechargeUI.getString(com.tencent.mm.R.string.g4d), false, null, new com.tencent.mm.plugin.ipcall.ui.m3(iPCallRechargeUI));
    }
}
