package t6;

/* loaded from: classes13.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final t6.j f415968e = new t6.i();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f415969a;

    /* renamed from: b, reason: collision with root package name */
    public final t6.j f415970b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f415971c;

    /* renamed from: d, reason: collision with root package name */
    public volatile byte[] f415972d;

    public k(java.lang.String str, java.lang.Object obj, t6.j jVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Must not be null or empty");
        }
        this.f415971c = str;
        this.f415969a = obj;
        q7.n.b(jVar);
        this.f415970b = jVar;
    }

    public static t6.k a(java.lang.String str, java.lang.Object obj) {
        return new t6.k(str, obj, f415968e);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof t6.k) {
            return this.f415971c.equals(((t6.k) obj).f415971c);
        }
        return false;
    }

    public int hashCode() {
        return this.f415971c.hashCode();
    }

    public java.lang.String toString() {
        return "Option{key='" + this.f415971c + "'}";
    }
}
