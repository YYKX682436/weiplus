package g2;

/* loaded from: classes14.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f267714a;

    public static java.lang.String a(int i17) {
        if (i17 == 0) {
            return "None";
        }
        if (i17 == 1) {
            return "Default";
        }
        if (i17 == 2) {
            return "Go";
        }
        if (i17 == 3) {
            return "Search";
        }
        if (i17 == 4) {
            return "Send";
        }
        if (i17 == 5) {
            return "Previous";
        }
        if (i17 == 6) {
            return "Next";
        }
        return i17 == 7 ? "Done" : "Invalid";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof g2.k) {
            return this.f267714a == ((g2.k) obj).f267714a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f267714a);
    }

    public java.lang.String toString() {
        return a(this.f267714a);
    }
}
