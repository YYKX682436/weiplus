package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class x2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI f143069d;

    public x2(com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI iPCallPackageUI) {
        this.f143069d = iPCallPackageUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI iPCallPackageUI = this.f143069d;
        try {
            if (iPCallPackageUI.f142647i != null) {
                c01.d9.e().d(iPCallPackageUI.f142647i);
            }
            iPCallPackageUI.finish();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallPackageUI", "cancel getPackageProductListNetScene error: %s", e17.getMessage());
        }
    }
}
