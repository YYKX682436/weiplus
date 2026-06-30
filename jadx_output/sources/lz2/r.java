package lz2;

/* loaded from: classes14.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog f322351d;

    public r(com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog walletFaceIdDialog) {
        this.f322351d = walletFaceIdDialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f322351d.f136987e.sendAccessibilityEvent(128);
    }
}
