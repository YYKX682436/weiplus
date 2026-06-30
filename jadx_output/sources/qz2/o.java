package qz2;

/* loaded from: classes9.dex */
public class o implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI f367894d;

    public o(com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI) {
        this.f367894d = fingerPrintAuthTransparentUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI.V6(this.f367894d, false);
    }
}
