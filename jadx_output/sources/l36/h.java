package l36;

/* loaded from: classes16.dex */
public class h extends l36.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final n36.j f315498d;

    /* renamed from: e, reason: collision with root package name */
    public final x36.m f315499e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f315500f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f315501g;

    public h(n36.j jVar, java.lang.String str, java.lang.String str2) {
        this.f315498d = jVar;
        this.f315500f = str;
        this.f315501g = str2;
        this.f315499e = x36.v.b(new l36.g(this, jVar.f334833f[1], jVar));
    }

    @Override // l36.c1
    public long a() {
        try {
            java.lang.String str = this.f315501g;
            if (str != null) {
                return java.lang.Long.parseLong(str);
            }
            return -1L;
        } catch (java.lang.NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // l36.c1
    public l36.n0 b() {
        java.lang.String str = this.f315500f;
        if (str == null) {
            return null;
        }
        try {
            return l36.n0.a(str);
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // l36.c1
    public x36.m c() {
        return this.f315499e;
    }
}
