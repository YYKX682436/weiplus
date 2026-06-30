package f2;

/* loaded from: classes14.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f258816a;

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof f2.p) {
            return this.f258816a == ((f2.p) obj).f258816a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f258816a);
    }

    public java.lang.String toString() {
        int i17 = this.f258816a;
        if (i17 == 0) {
            return "Normal";
        }
        return i17 == 1 ? "Italic" : "Invalid";
    }
}
