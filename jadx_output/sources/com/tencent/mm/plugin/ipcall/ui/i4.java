package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes4.dex */
public class i4 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI f142872d;

    public i4(com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI iPCallShareCouponCardUI) {
        this.f142872d = iPCallShareCouponCardUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        try {
            this.f142872d.finish();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallShareCouponCardUI", "loadFromSystemAddressBook error: %s", e17.getMessage());
        }
    }
}
