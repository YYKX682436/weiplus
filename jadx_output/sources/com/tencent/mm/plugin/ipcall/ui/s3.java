package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes15.dex */
public class s3 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI f143005a;

    public s3(com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI iPCallRechargeUI) {
        this.f143005a = iPCallRechargeUI;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRechargeUI", "start restore");
        com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI iPCallRechargeUI = this.f143005a;
        iPCallRechargeUI.f142662r.d();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(257L, 14L, 1L, true);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_action_type", 200002);
        intent.putExtra("key_force_google", true);
        j45.l.n(iPCallRechargeUI, "wallet_index", ".ui.WalletIapUI", intent, 2002);
        if (iPCallRechargeUI.isFinishing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRechargeUI", "[showLoadingDialog] acitivity is finished.");
        } else {
            iPCallRechargeUI.f142666v = db5.e1.Q(iPCallRechargeUI.getContext(), iPCallRechargeUI.getString(com.tencent.mm.R.string.f490573yv), iPCallRechargeUI.getString(com.tencent.mm.R.string.g3z), true, false, null);
        }
    }
}
