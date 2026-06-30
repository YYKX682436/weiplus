package qz2;

/* loaded from: classes9.dex */
public class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI f367863d;

    public g(com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI) {
        this.f367863d = fingerPrintAuthTransparentUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI = this.f367863d;
        fingerPrintAuthTransparentUI.finish();
        com.tencent.mm.wallet_core.ui.r1.V(fingerPrintAuthTransparentUI, "https://kf.qq.com/touch/sappfaq/210406zmIFbI210406FFnEnI.html", true);
    }
}
