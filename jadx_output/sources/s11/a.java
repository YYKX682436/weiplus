package s11;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f402100d;

    /* renamed from: e, reason: collision with root package name */
    public final o11.g f402101e;

    /* renamed from: f, reason: collision with root package name */
    public final p11.d f402102f;

    /* renamed from: g, reason: collision with root package name */
    public final p11.c f402103g;

    /* renamed from: h, reason: collision with root package name */
    public final p11.b f402104h;

    public a(java.lang.String str, o11.g gVar, n11.b bVar, p11.d dVar) {
        this.f402100d = str;
        o11.d dVar2 = bVar.f334051a;
        if (gVar == null) {
            this.f402101e = dVar2.f342067e;
        } else {
            this.f402101e = gVar;
        }
        this.f402102f = dVar;
        p11.c cVar = this.f402101e.f342128z;
        if (cVar != null) {
            this.f402103g = cVar;
        } else {
            this.f402103g = dVar2.f342070h;
        }
        this.f402104h = dVar2.f342069g;
    }

    @Override // java.lang.Runnable
    public void run() {
        p11.c cVar = this.f402103g;
        java.lang.String str = this.f402100d;
        q11.b b17 = cVar.b(str);
        p11.d dVar = this.f402102f;
        o11.g gVar = this.f402101e;
        if (b17 == null) {
            if (dVar != null) {
                dVar.a(false, gVar.D);
                return;
            }
            return;
        }
        byte[] bArr = b17.f359533c;
        if (com.tencent.mm.sdk.platformtools.x.I(bArr, 10, 10, null) == null) {
            gVar.getClass();
        } else if (((com.tencent.mm.modelimage.loader.impr.a) this.f402104h).d(str, bArr, gVar)) {
            if (dVar != null) {
                dVar.a(true, gVar.D);
                return;
            }
            return;
        }
        if (dVar != null) {
            dVar.a(false, gVar.D);
        }
    }
}
