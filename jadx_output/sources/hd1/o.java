package hd1;

/* loaded from: classes7.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd1.w f280410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f280411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280412f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280413g;

    public o(hd1.w wVar, yz5.l lVar, java.lang.String str, java.lang.String str2, id1.a aVar) {
        this.f280410d = wVar;
        this.f280411e = lVar;
        this.f280412f = str;
        this.f280413g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.nfc.Tag a17 = hd1.w.a(this.f280410d);
        yz5.l lVar = this.f280411e;
        if (a17 == null) {
            lVar.invoke(new hd1.x(13013, "NFC tag has not been discovered"));
        }
        if (a17 == null) {
            return;
        }
        id1.d.f290459h.getClass();
        id1.d dVar = (id1.d) id1.d.f290460i.get(this.f280412f);
        if (dVar == null) {
            lVar.invoke(new hd1.x(13014, "invalid tech"));
        }
        if (dVar == null) {
            return;
        }
        hd1.e eVar = dVar.f290471f;
        if (eVar == null) {
            lVar.invoke(new hd1.x(13024, "function not support"));
        } else {
            eVar.a(a17, this.f280413g, null, lVar);
        }
    }
}
