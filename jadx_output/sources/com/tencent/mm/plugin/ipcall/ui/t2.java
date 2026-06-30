package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes.dex */
public class t2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallMyGiftCardUI f143011d;

    public t2(com.tencent.mm.plugin.ipcall.ui.IPCallMyGiftCardUI iPCallMyGiftCardUI) {
        this.f143011d = iPCallMyGiftCardUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.ipcall.ui.IPCallMyGiftCardUI iPCallMyGiftCardUI = this.f143011d;
        try {
            if (iPCallMyGiftCardUI.f142641h != null) {
                c01.d9.e().d(iPCallMyGiftCardUI.f142641h);
            }
            iPCallMyGiftCardUI.finish();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallMyGiftCardUI", "cancel getProductListScene error: %s", e17.getMessage());
        }
    }
}
