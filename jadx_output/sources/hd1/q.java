package hd1;

/* loaded from: classes7.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd1.w f280417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f280418e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280419f;

    public q(hd1.w wVar, yz5.l lVar, java.lang.String str) {
        this.f280417d = wVar;
        this.f280418e = lVar;
        this.f280419f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.nfc.tech.TagTechnology tagTechnology;
        java.lang.Object obj;
        android.nfc.Tag a17 = hd1.w.a(this.f280417d);
        yz5.l lVar = this.f280418e;
        if (a17 == null) {
            lVar.invoke(new hd1.x(13013, "NFC tag has not been discovered"));
        }
        if (a17 == null) {
            return;
        }
        id1.d.f290459h.getClass();
        id1.d dVar = (id1.d) id1.d.f290460i.get(this.f280419f);
        if (dVar == null) {
            lVar.invoke(new hd1.x(13014, "invalid tech"));
        }
        if (dVar == null) {
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
            lVar.invoke(new hd1.y(java.lang.Boolean.valueOf(tagTechnology.isConnected())));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.NFCReadWriteManager", "check isConnected failed since " + e17);
            lVar.invoke(new hd1.x(13017, "system internal error: " + e17.getMessage()));
        }
    }
}
