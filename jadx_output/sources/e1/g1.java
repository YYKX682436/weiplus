package e1;

/* loaded from: classes13.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f246259a;

    public static java.lang.String a(int i17) {
        if (i17 == 0) {
            return "Miter";
        }
        if (i17 == 1) {
            return "Round";
        }
        return i17 == 2 ? "Bevel" : "Unknown";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof e1.g1) {
            return this.f246259a == ((e1.g1) obj).f246259a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f246259a);
    }

    public java.lang.String toString() {
        return a(this.f246259a);
    }
}
