package qz2;

/* loaded from: classes9.dex */
public class a0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f367836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI f367837e;

    public a0(com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI fingerPrintAuthUI, int i17) {
        this.f367837e = fingerPrintAuthUI;
        this.f367836d = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.os.Bundle bundle = new android.os.Bundle();
        int i18 = this.f367836d;
        com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI fingerPrintAuthUI = this.f367837e;
        com.tencent.mm.wallet_core.a.c(fingerPrintAuthUI, bundle, i18);
        com.tencent.mm.wallet_core.ui.r1.V(fingerPrintAuthUI, "https://kf.qq.com/touch/sappfaq/210406zmIFbI210406FFnEnI.html", true);
    }
}
