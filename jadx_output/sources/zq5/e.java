package zq5;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final zq5.e f475060e = new zq5.e(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f475061a;

    /* renamed from: b, reason: collision with root package name */
    public final int f475062b;

    /* renamed from: c, reason: collision with root package name */
    public final int f475063c;

    /* renamed from: d, reason: collision with root package name */
    public final int f475064d;

    public e(int i17, int i18, int i19, int i27) {
        this.f475061a = i17;
        this.f475062b = i18;
        this.f475063c = i19;
        this.f475064d = i27;
    }

    public final boolean a() {
        return this.f475061a >= this.f475063c || this.f475062b >= this.f475064d;
    }

    public final boolean b(zq5.e other) {
        kotlin.jvm.internal.o.g(other, "other");
        return this.f475063c > other.f475061a && other.f475063c > this.f475061a && this.f475064d > other.f475062b && other.f475064d > this.f475062b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq5.e)) {
            return false;
        }
        zq5.e eVar = (zq5.e) obj;
        return this.f475061a == eVar.f475061a && this.f475062b == eVar.f475062b && this.f475063c == eVar.f475063c && this.f475064d == eVar.f475064d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f475061a) * 31) + java.lang.Integer.hashCode(this.f475062b)) * 31) + java.lang.Integer.hashCode(this.f475063c)) * 31) + java.lang.Integer.hashCode(this.f475064d);
    }

    public java.lang.String toString() {
        return "IntRectCompat.fromLTRB(" + this.f475061a + ", " + this.f475062b + ", " + this.f475063c + ", " + this.f475064d + ')';
    }
}
