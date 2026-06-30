package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes.dex */
public class r3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI f142995d;

    public r3(com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI iPCallRechargeUI) {
        this.f142995d = iPCallRechargeUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI iPCallRechargeUI = this.f142995d;
        try {
            if (iPCallRechargeUI.f142667w != null) {
                c01.d9.e().d(iPCallRechargeUI.f142667w);
            }
            iPCallRechargeUI.finish();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallRechargeUI", "cancel getProductListScene error: %s", e17.getMessage());
        }
    }
}
