package lc3;

/* loaded from: classes7.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f317944a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f317945b;

    public z(int i17, java.lang.String str) {
        this.f317944a = i17;
        this.f317945b = str;
    }

    public final java.lang.String a() {
        return this.f317945b;
    }

    public final int b() {
        return this.f317944a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && kotlin.jvm.internal.o.b(lc3.z.class, obj.getClass()) && this.f317944a == ((lc3.z) obj).f317944a;
    }

    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.f317944a));
    }

    public java.lang.String toString() {
        return "MBErrorInfo{errno=" + this.f317944a + ", errMsg='" + this.f317945b + "'}";
    }
}
