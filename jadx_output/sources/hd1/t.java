package hd1;

/* loaded from: classes7.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd1.w f280426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f280427e;

    public t(hd1.w wVar, yz5.l lVar) {
        this.f280426d = wVar;
        this.f280427e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hd1.c cVar;
        hd1.b bVar = (hd1.b) this.f280426d.f280439b;
        bVar.f280389e = false;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = bVar.f280388d;
        if (atomicBoolean.get()) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "disableReaderMode");
                android.app.Activity a17 = ((com.tencent.mm.plugin.appbrand.utils.k3) ((hd1.h) bVar).f280385a).a();
                if (a17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "disableReaderMode, activity is null");
                } else {
                    android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    kotlin.jvm.internal.o.d(defaultAdapter);
                    defaultAdapter.disableReaderMode(a17);
                }
                atomicBoolean.set(false);
                cVar = hd1.c.f280393d;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AbsNFCDiscoverable", "stopDiscovery failed since " + e17);
                cVar = hd1.c.f280394e;
            }
        } else {
            cVar = hd1.c.f280396g;
        }
        int ordinal = cVar.ordinal();
        yz5.l lVar = this.f280427e;
        if (ordinal == 0) {
            lVar.invoke(new hd1.y(jz5.f0.f302826a));
        } else if (ordinal != 3) {
            lVar.invoke(new hd1.x(13017, "system internal error"));
        } else {
            lVar.invoke(new hd1.x(13018, "NFC discovery has not started"));
        }
    }
}
