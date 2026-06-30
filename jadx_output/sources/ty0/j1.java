package ty0;

/* loaded from: classes8.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f422856a;

    /* renamed from: b, reason: collision with root package name */
    public final int f422857b;

    public j1(int i17, int i18) {
        this.f422856a = i17;
        this.f422857b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty0.j1)) {
            return false;
        }
        ty0.j1 j1Var = (ty0.j1) obj;
        return this.f422856a == j1Var.f422856a && this.f422857b == j1Var.f422857b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f422856a) * 31) + java.lang.Integer.hashCode(this.f422857b);
    }

    public java.lang.String toString() {
        return "TextLayoutInfo(textWidth=" + this.f422856a + ", containerWidth=" + this.f422857b + ')';
    }
}
