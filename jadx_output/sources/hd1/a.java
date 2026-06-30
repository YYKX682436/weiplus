package hd1;

/* loaded from: classes7.dex */
public final class a extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd1.b f280383d;

    public a(hd1.b bVar) {
        this.f280383d = bVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        android.content.Context applicationContext;
        hd1.b bVar = this.f280383d;
        android.app.Activity a17 = ((com.tencent.mm.plugin.appbrand.utils.k3) bVar.f280385a).a();
        if (a17 != null && (applicationContext = a17.getApplicationContext()) != null) {
            applicationContext.unregisterReceiver(bVar.f280390f);
        }
        bVar.getClass();
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void e(com.tencent.mm.plugin.appbrand.w0 w0Var) {
        android.nfc.NfcAdapter defaultAdapter;
        super.e(w0Var);
        hd1.h hVar = (hd1.h) this.f280383d;
        if (hVar.f280388d.getAndSet(false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "onPause, isNFCDiscovering");
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "disableReaderMode");
                android.app.Activity a17 = ((com.tencent.mm.plugin.appbrand.utils.k3) hVar.f280385a).a();
                if (a17 != null && (defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(com.tencent.mm.sdk.platformtools.x2.f193071a)) != null) {
                    defaultAdapter.disableReaderMode(a17);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "disableReaderMode failed since " + e17);
            }
            hVar.f280389e = true;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void g() {
        android.nfc.NfcAdapter defaultAdapter;
        super.g();
        hd1.h hVar = (hd1.h) this.f280383d;
        if (hVar.f280389e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "onResume, isNFCDiscoverySticky");
            android.nfc.NfcAdapter defaultAdapter2 = android.nfc.NfcAdapter.getDefaultAdapter(com.tencent.mm.sdk.platformtools.x2.f193071a);
            if (!(defaultAdapter2 != null && true == defaultAdapter2.isEnabled())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "onResume, nfc is not enabled");
                return;
            }
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "enableReaderMode");
                android.app.Activity a17 = ((com.tencent.mm.plugin.appbrand.utils.k3) hVar.f280385a).a();
                if (a17 != null && (defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(com.tencent.mm.sdk.platformtools.x2.f193071a)) != null) {
                    defaultAdapter.enableReaderMode(a17, hVar.f280401h, hVar.f280400g, null);
                }
                hVar.f280388d.set(true);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "enableReaderMode failed since " + e17);
            }
            hVar.f280389e = false;
        }
    }
}
