package f2;

/* loaded from: classes14.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f258817a;

    public static java.lang.String a(int i17) {
        if (i17 == 0) {
            return "None";
        }
        if (i17 == 1) {
            return "All";
        }
        if (i17 == 2) {
            return "Weight";
        }
        return i17 == 3 ? "Style" : "Invalid";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof f2.q) {
            return this.f258817a == ((f2.q) obj).f258817a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f258817a);
    }

    public java.lang.String toString() {
        return a(this.f258817a);
    }
}
