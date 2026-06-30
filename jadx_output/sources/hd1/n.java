package hd1;

/* loaded from: classes7.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd1.w f280407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f280408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280409f;

    public n(hd1.w wVar, yz5.l lVar, java.lang.String str) {
        this.f280407d = wVar;
        this.f280408e = lVar;
        this.f280409f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.nfc.tech.TagTechnology tagTechnology;
        java.lang.Object obj;
        hd1.w wVar = this.f280407d;
        android.nfc.Tag a17 = hd1.w.a(wVar);
        yz5.l lVar = this.f280408e;
        if (a17 == null) {
            lVar.invoke(new hd1.x(13013, "NFC tag has not been discovered"));
        }
        if (a17 == null) {
            return;
        }
        id1.d.f290459h.getClass();
        id1.d dVar = (id1.d) id1.d.f290460i.get(this.f280409f);
        if (dVar == null) {
            lVar.invoke(new hd1.x(13014, "invalid tech"));
        }
        if (dVar == null) {
            return;
        }
        hd1.d dVar2 = wVar.f280439b;
        if (((hd1.b) dVar2).f280387c.contains(dVar)) {
            lVar.invoke(new hd1.x(13022, "Tech already connected"));
            return;
        }
        try {
            obj = d56.b.i(dVar.f290470e).b("get", a17).f226632b;
        } catch (java.lang.Exception unused) {
            lVar.invoke(new hd1.x(13015, "unavailable tech"));
            tagTechnology = null;
        }
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
        tagTechnology = (android.nfc.tech.TagTechnology) obj;
        if (tagTechnology == null) {
            return;
        }
        try {
            tagTechnology.connect();
            ((hd1.b) dVar2).f280387c.add(dVar);
            lVar.invoke(new hd1.y(jz5.f0.f302826a));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.NFCReadWriteManager", "connect failed since " + e17);
            lVar.invoke(new hd1.x(13017, "system internal error: " + e17.getMessage()));
        }
    }
}
