package f1;

/* loaded from: classes14.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f258471a;

    /* renamed from: b, reason: collision with root package name */
    public final long f258472b;

    /* renamed from: c, reason: collision with root package name */
    public final int f258473c;

    public d(java.lang.String str, long j17, int i17, kotlin.jvm.internal.i iVar) {
        this.f258471a = str;
        this.f258472b = j17;
        this.f258473c = i17;
        if (str.length() == 0) {
            throw new java.lang.IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i17 < -1 || i17 > 63) {
            throw new java.lang.IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float[] a(float[] fArr);

    public abstract float b(int i17);

    public abstract float c(int i17);

    public boolean d() {
        return false;
    }

    public abstract float[] e(float[] fArr);

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.o.b(kotlin.jvm.internal.i0.a(getClass()), kotlin.jvm.internal.i0.a(obj.getClass()))) {
            return false;
        }
        f1.d dVar = (f1.d) obj;
        if (this.f258473c == dVar.f258473c && kotlin.jvm.internal.o.b(this.f258471a, dVar.f258471a)) {
            return f1.c.a(this.f258472b, dVar.f258472b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f258471a.hashCode() * 31;
        int i17 = f1.c.f258470e;
        return ((hashCode + java.lang.Long.hashCode(this.f258472b)) * 31) + this.f258473c;
    }

    public java.lang.String toString() {
        return this.f258471a + " (id=" + this.f258473c + ", model=" + ((java.lang.Object) f1.c.b(this.f258472b)) + ')';
    }
}
