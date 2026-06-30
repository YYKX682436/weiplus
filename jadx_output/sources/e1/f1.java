package e1;

/* loaded from: classes13.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f246253a;

    public static java.lang.String a(int i17) {
        if (i17 == 0) {
            return "Butt";
        }
        if (i17 == 1) {
            return "Round";
        }
        return i17 == 2 ? "Square" : "Unknown";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof e1.f1) {
            return this.f246253a == ((e1.f1) obj).f246253a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f246253a);
    }

    public java.lang.String toString() {
        return a(this.f246253a);
    }
}
