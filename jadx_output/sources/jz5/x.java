package jz5;

/* loaded from: classes10.dex */
public final class x implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final long f302852d;

    public static java.lang.String a(long j17) {
        return jz5.h0.b(j17, 10);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return kotlin.jvm.internal.o.j(this.f302852d ^ Long.MIN_VALUE, ((jz5.x) obj).f302852d ^ Long.MIN_VALUE);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof jz5.x) {
            return this.f302852d == ((jz5.x) obj).f302852d;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f302852d);
    }

    public java.lang.String toString() {
        return a(this.f302852d);
    }
}
