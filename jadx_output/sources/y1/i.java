package y1;

/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f458718a;

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof y1.i) {
            return this.f458718a == ((y1.i) obj).f458718a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f458718a);
    }

    public java.lang.String toString() {
        int i17 = this.f458718a;
        if (i17 == 0) {
            return "Button";
        }
        if (i17 == 1) {
            return "Checkbox";
        }
        if (i17 == 2) {
            return "Switch";
        }
        if (i17 == 3) {
            return "RadioButton";
        }
        if (i17 == 4) {
            return "Tab";
        }
        return i17 == 5 ? "Image" : "Unknown";
    }
}
