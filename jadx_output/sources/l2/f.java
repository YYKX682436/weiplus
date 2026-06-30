package l2;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f315116a;

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof l2.f) {
            return this.f315116a == ((l2.f) obj).f315116a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f315116a);
    }

    public java.lang.String toString() {
        int i17 = this.f315116a;
        if (i17 == 1) {
            return "Left";
        }
        if (i17 == 2) {
            return "Right";
        }
        if (i17 == 3) {
            return "Center";
        }
        if (i17 == 4) {
            return "Justify";
        }
        if (i17 == 5) {
            return "Start";
        }
        return i17 == 6 ? "End" : "Invalid";
    }
}
