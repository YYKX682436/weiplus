package qz2;

/* loaded from: classes9.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI f367872d;

    public i(com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI) {
        this.f367872d = fingerPrintAuthTransparentUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "try fingerprint auth again!");
        com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI = this.f367872d;
        com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI.W6(fingerPrintAuthTransparentUI);
        fingerPrintAuthTransparentUI.Z6();
        dialogInterface.dismiss();
    }
}
