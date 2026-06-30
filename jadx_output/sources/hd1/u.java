package hd1;

/* loaded from: classes7.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd1.w f280428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f280429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280430f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f280431g;

    public u(hd1.w wVar, yz5.l lVar, java.lang.String str, byte[] bArr) {
        this.f280428d = wVar;
        this.f280429e = lVar;
        this.f280430f = str;
        this.f280431g = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.nfc.tech.TagTechnology tagTechnology;
        java.lang.Object obj;
        hd1.w wVar = this.f280428d;
        android.nfc.Tag a17 = hd1.w.a(wVar);
        yz5.l lVar = this.f280429e;
        if (a17 == null) {
            lVar.invoke(new hd1.x(13013, "NFC tag has not been discovered"));
        }
        if (a17 == null) {
            return;
        }
        id1.d.f290459h.getClass();
        id1.d dVar = (id1.d) id1.d.f290460i.get(this.f280430f);
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
            byte[] bArr = (byte[]) d56.b.h(tagTechnology).b("transceive", this.f280431g).f226632b;
            if (bArr != null) {
                kotlin.jvm.internal.o.f(java.util.Arrays.toString(bArr), "toString(...)");
            }
            kotlin.jvm.internal.o.d(bArr);
            lVar.invoke(new hd1.y(bArr));
        } catch (java.lang.Exception e17) {
            java.lang.Throwable b17 = hd1.w.b(wVar, e17);
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.NFCReadWriteManager", "transceive failed since " + b17);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("system internal error: ");
            sb6.append(b17 != null ? b17.getMessage() : null);
            lVar.invoke(new hd1.x(13017, sb6.toString()));
        }
    }
}
