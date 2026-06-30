package qz2;

/* loaded from: classes9.dex */
public class b0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f367842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI f367843e;

    public b0(com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI fingerPrintAuthUI, int i17) {
        this.f367843e = fingerPrintAuthUI;
        this.f367842d = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.wallet_core.a.c(this.f367843e, new android.os.Bundle(), this.f367842d);
    }
}
