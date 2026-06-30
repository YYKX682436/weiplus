package hd1;

/* loaded from: classes7.dex */
public final class w {

    /* renamed from: c, reason: collision with root package name */
    public static final hd1.l f280435c = new hd1.l(null);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f280436d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final hd1.j f280437e = new hd1.k();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f280438a;

    /* renamed from: b, reason: collision with root package name */
    public final hd1.d f280439b;

    public w(java.lang.String appId, hd1.d nfcDiscoverable) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(nfcDiscoverable, "nfcDiscoverable");
        this.f280438a = appId;
        this.f280439b = nfcDiscoverable;
        com.tencent.mm.plugin.appbrand.x0.a(appId, new hd1.i(this));
    }

    public static final android.nfc.Tag a(hd1.w wVar) {
        return ((hd1.h) wVar.f280439b).f280402i;
    }

    public static final java.lang.Throwable b(hd1.w wVar, java.lang.Throwable th6) {
        wVar.getClass();
        if (!(th6 instanceof d56.c)) {
            return th6;
        }
        java.lang.Throwable cause = th6.getCause();
        if (cause != null) {
            return cause.getCause();
        }
        return null;
    }

    public final void c(java.util.ArrayList filters) {
        kotlin.jvm.internal.o.g(filters, "filters");
        hd1.h hVar = (hd1.h) this.f280439b;
        hVar.getClass();
        if (filters.size() == 0) {
            return;
        }
        hVar.f280400g = 0;
        java.util.Iterator it = filters.iterator();
        while (it.hasNext()) {
            id1.d dVar = (id1.d) it.next();
            if (dVar == id1.d.f290462n) {
                hVar.f280400g |= 1;
            } else if (dVar == id1.d.f290463o) {
                hVar.f280400g |= 2;
            } else if (dVar == id1.d.f290465q) {
                hVar.f280400g |= 4;
            } else if (dVar == id1.d.f290466r) {
                hVar.f280400g |= 8;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "setNFCFilters, unsupported %s", dVar.f290469d);
            }
        }
    }

    public final void d(android.nfc.NdefMessage message, yz5.l callback) {
        kotlin.jvm.internal.o.g(message, "message");
        kotlin.jvm.internal.o.g(callback, "callback");
        message.toString();
        ((ku5.t0) ku5.t0.f312615d).h(new hd1.v(this, callback, message), "NFC-IO");
    }
}
