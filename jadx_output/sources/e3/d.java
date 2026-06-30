package e3;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final e3.d f247043e = new e3.d(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f247044a;

    /* renamed from: b, reason: collision with root package name */
    public final int f247045b;

    /* renamed from: c, reason: collision with root package name */
    public final int f247046c;

    /* renamed from: d, reason: collision with root package name */
    public final int f247047d;

    public d(int i17, int i18, int i19, int i27) {
        this.f247044a = i17;
        this.f247045b = i18;
        this.f247046c = i19;
        this.f247047d = i27;
    }

    public static e3.d a(e3.d dVar, e3.d dVar2) {
        return b(java.lang.Math.max(dVar.f247044a, dVar2.f247044a), java.lang.Math.max(dVar.f247045b, dVar2.f247045b), java.lang.Math.max(dVar.f247046c, dVar2.f247046c), java.lang.Math.max(dVar.f247047d, dVar2.f247047d));
    }

    public static e3.d b(int i17, int i18, int i19, int i27) {
        return (i17 == 0 && i18 == 0 && i19 == 0 && i27 == 0) ? f247043e : new e3.d(i17, i18, i19, i27);
    }

    public static e3.d c(e3.d dVar, e3.d dVar2) {
        return b(dVar.f247044a - dVar2.f247044a, dVar.f247045b - dVar2.f247045b, dVar.f247046c - dVar2.f247046c, dVar.f247047d - dVar2.f247047d);
    }

    public static e3.d d(android.graphics.Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public android.graphics.Insets e() {
        return e3.c.a(this.f247044a, this.f247045b, this.f247046c, this.f247047d);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e3.d.class != obj.getClass()) {
            return false;
        }
        e3.d dVar = (e3.d) obj;
        return this.f247047d == dVar.f247047d && this.f247044a == dVar.f247044a && this.f247046c == dVar.f247046c && this.f247045b == dVar.f247045b;
    }

    public int hashCode() {
        return (((((this.f247044a * 31) + this.f247045b) * 31) + this.f247046c) * 31) + this.f247047d;
    }

    public java.lang.String toString() {
        return "Insets{left=" + this.f247044a + ", top=" + this.f247045b + ", right=" + this.f247046c + ", bottom=" + this.f247047d + '}';
    }
}
