package p2;

/* loaded from: classes5.dex */
public final class h implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final float f351380d;

    public static final boolean a(float f17, float f18) {
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
    }

    public static java.lang.String b(float f17) {
        if (java.lang.Float.isNaN(f17)) {
            return "Dp.Unspecified";
        }
        return f17 + ".dp";
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return java.lang.Float.compare(this.f351380d, ((p2.h) obj).f351380d);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p2.h) {
            return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f351380d), java.lang.Float.valueOf(((p2.h) obj).f351380d));
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Float.hashCode(this.f351380d);
    }

    public java.lang.String toString() {
        return b(this.f351380d);
    }
}
