package jz5;

/* loaded from: classes8.dex */
public final class u implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f302848d;

    public static java.lang.String a(int i17) {
        return java.lang.String.valueOf(i17 & io.flutter.embedding.android.KeyboardMap.kValueMask);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return kotlin.jvm.internal.o.i(this.f302848d ^ Integer.MIN_VALUE, ((jz5.u) obj).f302848d ^ Integer.MIN_VALUE);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof jz5.u) {
            return this.f302848d == ((jz5.u) obj).f302848d;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f302848d);
    }

    public java.lang.String toString() {
        return a(this.f302848d);
    }
}
