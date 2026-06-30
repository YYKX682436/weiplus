package hd1;

/* loaded from: classes7.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd1.w f280432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f280433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.nfc.NdefMessage f280434f;

    public v(hd1.w wVar, yz5.l lVar, android.nfc.NdefMessage ndefMessage) {
        this.f280432d = wVar;
        this.f280433e = lVar;
        this.f280434f = ndefMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.nfc.Tag a17 = hd1.w.a(this.f280432d);
        yz5.l lVar = this.f280433e;
        if (a17 == null) {
            lVar.invoke(new hd1.x(13013, "NFC tag has not been discovered"));
        }
        if (a17 == null) {
            return;
        }
        android.nfc.tech.Ndef ndef = android.nfc.tech.Ndef.get(a17);
        if (ndef == null) {
            lVar.invoke(new hd1.x(13015, "unavailable tech"));
            return;
        }
        try {
            ndef.writeNdefMessage(this.f280434f);
            lVar.invoke(new hd1.y(jz5.f0.f302826a));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.NFCReadWriteManager", "writeNdefMessage failed since " + e17);
            lVar.invoke(new hd1.x(13017, "system internal error: " + e17.getMessage()));
        }
    }
}
