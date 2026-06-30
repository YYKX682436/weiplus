package w6;

/* loaded from: classes13.dex */
public final class b1 implements t6.h {

    /* renamed from: j, reason: collision with root package name */
    public static final q7.k f443065j = new q7.k(50);

    /* renamed from: b, reason: collision with root package name */
    public final x6.b f443066b;

    /* renamed from: c, reason: collision with root package name */
    public final t6.h f443067c;

    /* renamed from: d, reason: collision with root package name */
    public final t6.h f443068d;

    /* renamed from: e, reason: collision with root package name */
    public final int f443069e;

    /* renamed from: f, reason: collision with root package name */
    public final int f443070f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Class f443071g;

    /* renamed from: h, reason: collision with root package name */
    public final t6.l f443072h;

    /* renamed from: i, reason: collision with root package name */
    public final t6.p f443073i;

    public b1(x6.b bVar, t6.h hVar, t6.h hVar2, int i17, int i18, t6.p pVar, java.lang.Class cls, t6.l lVar) {
        this.f443066b = bVar;
        this.f443067c = hVar;
        this.f443068d = hVar2;
        this.f443069e = i17;
        this.f443070f = i18;
        this.f443073i = pVar;
        this.f443071g = cls;
        this.f443072h = lVar;
    }

    @Override // t6.h
    public void b(java.security.MessageDigest messageDigest) {
        java.lang.Object e17;
        java.lang.Object obj;
        x6.l lVar = (x6.l) this.f443066b;
        synchronized (lVar) {
            x6.j jVar = (x6.j) lVar.f452158b.b();
            jVar.f452155b = 8;
            jVar.f452156c = byte[].class;
            e17 = lVar.e(jVar, byte[].class);
        }
        byte[] bArr = (byte[]) e17;
        java.nio.ByteBuffer.wrap(bArr).putInt(this.f443069e).putInt(this.f443070f).array();
        this.f443068d.b(messageDigest);
        this.f443067c.b(messageDigest);
        messageDigest.update(bArr);
        t6.p pVar = this.f443073i;
        if (pVar != null) {
            pVar.b(messageDigest);
        }
        this.f443072h.b(messageDigest);
        q7.k kVar = f443065j;
        java.lang.Class cls = this.f443071g;
        synchronized (kVar) {
            obj = ((java.util.LinkedHashMap) kVar.f360302a).get(cls);
        }
        byte[] bArr2 = (byte[]) obj;
        if (bArr2 == null) {
            bArr2 = cls.getName().getBytes(t6.h.f415967a);
            kVar.c(cls, bArr2);
        }
        messageDigest.update(bArr2);
        ((x6.l) this.f443066b).g(bArr);
    }

    @Override // t6.h
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof w6.b1)) {
            return false;
        }
        w6.b1 b1Var = (w6.b1) obj;
        return this.f443070f == b1Var.f443070f && this.f443069e == b1Var.f443069e && q7.p.a(this.f443073i, b1Var.f443073i) && this.f443071g.equals(b1Var.f443071g) && this.f443067c.equals(b1Var.f443067c) && this.f443068d.equals(b1Var.f443068d) && this.f443072h.equals(b1Var.f443072h);
    }

    @Override // t6.h
    public int hashCode() {
        int hashCode = (((((this.f443067c.hashCode() * 31) + this.f443068d.hashCode()) * 31) + this.f443069e) * 31) + this.f443070f;
        t6.p pVar = this.f443073i;
        if (pVar != null) {
            hashCode = (hashCode * 31) + pVar.hashCode();
        }
        return (((hashCode * 31) + this.f443071g.hashCode()) * 31) + this.f443072h.hashCode();
    }

    public java.lang.String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f443067c + ", signature=" + this.f443068d + ", width=" + this.f443069e + ", height=" + this.f443070f + ", decodedResourceClass=" + this.f443071g + ", transformation='" + this.f443073i + "', options=" + this.f443072h + '}';
    }
}
