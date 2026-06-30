package qz2;

/* loaded from: classes9.dex */
public class e implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI f367854d;

    public e(com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI) {
        this.f367854d = fingerPrintAuthTransparentUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "showSuccessAlert, finish ui!");
        this.f367854d.finish();
    }
}
