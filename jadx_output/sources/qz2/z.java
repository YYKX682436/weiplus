package qz2;

/* loaded from: classes9.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f367929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI f367930f;

    public z(com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI fingerPrintAuthUI, java.lang.String str, int i17) {
        this.f367930f = fingerPrintAuthUI;
        this.f367928d = str;
        this.f367929e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f367928d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = this.f367930f.getString(com.tencent.mm.R.string.f_k);
        }
        com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI fingerPrintAuthUI = this.f367930f;
        db5.e1.E(fingerPrintAuthUI, str, "", fingerPrintAuthUI.getString(com.tencent.mm.R.string.kmf), false, new qz2.y(this));
    }
}
