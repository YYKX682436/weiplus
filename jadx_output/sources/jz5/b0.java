package jz5;

/* loaded from: classes12.dex */
public final class b0 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final short f302816d;

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(java.lang.Object obj) {
        return kotlin.jvm.internal.o.i(this.f302816d & 65535, ((jz5.b0) obj).f302816d & 65535);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof jz5.b0) {
            return this.f302816d == ((jz5.b0) obj).f302816d;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Short.hashCode(this.f302816d);
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(65535 & this.f302816d);
    }
}
