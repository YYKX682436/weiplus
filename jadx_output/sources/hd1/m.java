package hd1;

/* loaded from: classes7.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd1.w f280404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f280405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280406f;

    public m(hd1.w wVar, yz5.l lVar, java.lang.String str) {
        this.f280404d = wVar;
        this.f280405e = lVar;
        this.f280406f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.nfc.tech.TagTechnology tagTechnology;
        java.lang.Object obj;
        hd1.w wVar = this.f280404d;
        android.nfc.Tag a17 = hd1.w.a(wVar);
        yz5.l lVar = this.f280405e;
        if (a17 == null) {
            lVar.invoke(new hd1.x(13013, "NFC tag has not been discovered"));
        }
        if (a17 == null) {
            return;
        }
        id1.d.f290459h.getClass();
        id1.d dVar = (id1.d) id1.d.f290460i.get(this.f280406f);
        if (dVar == null) {
            lVar.invoke(new hd1.x(13014, "invalid tech"));
        }
        if (dVar == null) {
            return;
        }
        hd1.d dVar2 = wVar.f280439b;
        if (!((hd1.b) dVar2).f280387c.contains(dVar)) {
            lVar.invoke(new hd1.x(13023, "Tech has not connected"));
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
            tagTechnology.close();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.NFCReadWriteManager", "close failed since " + e17);
        }
        ((hd1.b) dVar2).f280387c.remove(dVar);
        lVar.invoke(new hd1.y(jz5.f0.f302826a));
    }
}
