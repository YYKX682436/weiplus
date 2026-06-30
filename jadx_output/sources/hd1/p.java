package hd1;

/* loaded from: classes7.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd1.w f280414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f280415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280416f;

    public p(hd1.w wVar, yz5.l lVar, java.lang.String str) {
        this.f280414d = wVar;
        this.f280415e = lVar;
        this.f280416f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.nfc.tech.TagTechnology tagTechnology;
        java.lang.Object obj;
        hd1.w wVar = this.f280414d;
        android.nfc.Tag a17 = hd1.w.a(wVar);
        yz5.l lVar = this.f280415e;
        if (a17 == null) {
            lVar.invoke(new hd1.x(13013, "NFC tag has not been discovered"));
        }
        if (a17 == null) {
            return;
        }
        id1.d.f290459h.getClass();
        id1.d dVar = (id1.d) id1.d.f290460i.get(this.f280416f);
        if (dVar == null) {
            lVar.invoke(new hd1.x(13014, "invalid tech"));
        }
        if (dVar == null) {
            return;
        }
        if (id1.d.f290467s == dVar) {
            lVar.invoke(new hd1.x(13024, "function not support"));
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
            java.lang.Integer num = (java.lang.Integer) d56.b.h(tagTechnology).b("getMaxTransceiveLength", new java.lang.Object[0]).f226632b;
            kotlin.jvm.internal.o.d(num);
            lVar.invoke(new hd1.y(num));
        } catch (java.lang.Exception e17) {
            java.lang.Throwable b17 = hd1.w.b(wVar, e17);
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.NFCReadWriteManager", "getMaxTransceiveLength failed since " + b17);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("system internal error: ");
            sb6.append(b17 != null ? b17.getMessage() : null);
            lVar.invoke(new hd1.x(13017, sb6.toString()));
        }
    }
}
