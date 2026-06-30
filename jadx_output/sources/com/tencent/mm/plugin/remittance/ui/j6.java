package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class j6 implements y60.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI f157785d;

    public j6(com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI) {
        this.f157785d = remittanceF2fDynamicCodeUI;
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI;
        java.lang.String str2;
        if (str == null || (str2 = (remittanceF2fDynamicCodeUI = this.f157785d).f157401q) == null || !str.equals(str2)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceF2fDynamicCodeUI", "cdnImageDownloadListener mchPhoto = %s notifyKey = %s", remittanceF2fDynamicCodeUI.f157401q, str);
        remittanceF2fDynamicCodeUI.runOnUiThread(new com.tencent.mm.plugin.remittance.ui.h6(this));
    }
}
