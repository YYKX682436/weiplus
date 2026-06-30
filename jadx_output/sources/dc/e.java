package dc;

/* loaded from: classes16.dex */
public class e extends dc.j implements java.lang.Comparable {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f228606h;

    /* renamed from: i, reason: collision with root package name */
    public final long f228607i;

    /* renamed from: m, reason: collision with root package name */
    public long f228608m;

    /* renamed from: n, reason: collision with root package name */
    public dc.f[] f228609n;

    /* renamed from: o, reason: collision with root package name */
    public dc.f[] f228610o;

    /* renamed from: p, reason: collision with root package name */
    public int f228611p;

    /* renamed from: q, reason: collision with root package name */
    public final fc.n f228612q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Set f228613r;

    public e(long j17, dc.o oVar, java.lang.String str, long j18) {
        super(j17, oVar);
        this.f228612q = new fc.n();
        this.f228613r = new java.util.HashSet();
        this.f228606h = str;
        this.f228607i = j18;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof dc.e) && compareTo((dc.e) obj) == 0;
    }

    public int hashCode() {
        return this.f228606h.hashCode();
    }

    @Override // java.lang.Comparable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final int compareTo(dc.e eVar) {
        long j17 = eVar.f228631d;
        long j18 = this.f228631d;
        if (j18 == j17) {
            return 0;
        }
        int compareTo = this.f228606h.compareTo(eVar.f228606h);
        return compareTo != 0 ? compareTo : j18 - eVar.f228631d > 0 ? 1 : -1;
    }

    public java.util.Map n() {
        java.util.HashMap hashMap = new java.util.HashMap();
        ((ec.b) h()).f250928d = this.f228607i;
        int f17 = ((ec.b) h()).f() & 65535;
        for (int i17 = 0; i17 < f17; i17++) {
            dc.f fVar = this.f228610o[i17];
            k();
            ((ec.b) h()).c();
            hashMap.put(fVar, l(fVar.f228614a));
        }
        return hashMap;
    }

    public dc.e o() {
        return this.f228633f.f228625i.b(this.f228608m);
    }

    public final java.lang.String toString() {
        return this.f228606h.replace('/', '.');
    }
}
