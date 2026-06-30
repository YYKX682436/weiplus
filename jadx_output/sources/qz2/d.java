package qz2;

/* loaded from: classes9.dex */
public class d implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI f367850d;

    public d(com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI) {
        this.f367850d = fingerPrintAuthTransparentUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        int i17 = com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI.f136994s;
        com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI = this.f367850d;
        fingerPrintAuthTransparentUI.c7();
        fingerPrintAuthTransparentUI.finish();
    }
}
