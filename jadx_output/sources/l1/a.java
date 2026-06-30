package l1;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f314969a;

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof l1.a) {
            return this.f314969a == ((l1.a) obj).f314969a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f314969a);
    }

    public java.lang.String toString() {
        int i17 = this.f314969a;
        if (i17 == 1) {
            return "Touch";
        }
        return i17 == 2 ? "Keyboard" : "Error";
    }
}
