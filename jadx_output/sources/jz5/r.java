package jz5;

/* loaded from: classes7.dex */
public final class r implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final byte f302844d;

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(java.lang.Object obj) {
        return kotlin.jvm.internal.o.i(this.f302844d & 255, ((jz5.r) obj).f302844d & 255);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof jz5.r) {
            return this.f302844d == ((jz5.r) obj).f302844d;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Byte.hashCode(this.f302844d);
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(this.f302844d & 255);
    }
}
