package e1;

/* loaded from: classes8.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f246286a;

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof e1.r0) {
            return this.f246286a == ((e1.r0) obj).f246286a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f246286a);
    }

    public java.lang.String toString() {
        int i17 = this.f246286a;
        if (i17 == 0) {
            return "NonZero";
        }
        return i17 == 1 ? "EvenOdd" : "Unknown";
    }
}
