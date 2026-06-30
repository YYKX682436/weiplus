package hd1;

/* loaded from: classes7.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd1.w f280424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f280425e;

    public s(hd1.w wVar, yz5.l lVar) {
        this.f280424d = wVar;
        this.f280425e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hd1.c cVar;
        hd1.b bVar = (hd1.b) this.f280424d.f280439b;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = bVar.f280388d;
        if (atomicBoolean.get()) {
            cVar = hd1.c.f280395f;
        } else {
            try {
                hd1.h hVar = (hd1.h) bVar;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "enableReaderMode");
                android.app.Activity a17 = ((com.tencent.mm.plugin.appbrand.utils.k3) hVar.f280385a).a();
                if (a17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "enableReaderMode, activity is null");
                } else {
                    android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    kotlin.jvm.internal.o.d(defaultAdapter);
                    defaultAdapter.enableReaderMode(a17, hVar.f280401h, hVar.f280400g, null);
                }
                atomicBoolean.set(true);
                cVar = hd1.c.f280393d;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AbsNFCDiscoverable", "startDiscovery failed since " + e17);
                cVar = hd1.c.f280394e;
            }
        }
        int ordinal = cVar.ordinal();
        yz5.l lVar = this.f280425e;
        if (ordinal == 0) {
            lVar.invoke(new hd1.y(jz5.f0.f302826a));
        } else if (ordinal != 2) {
            lVar.invoke(new hd1.x(13017, "system internal error"));
        } else {
            lVar.invoke(new hd1.x(13021, "NFC discovery already started"));
        }
    }
}
