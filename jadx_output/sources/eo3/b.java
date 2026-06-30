package eo3;

/* loaded from: classes.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255590d;

    public b(com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI nfcWebViewUI, java.lang.String str) {
        this.f255590d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12794, this.f255590d, 0);
    }
}
