package gk1;

/* loaded from: classes7.dex */
public final class e extends gk1.f {

    /* renamed from: a, reason: collision with root package name */
    public final int f272462a;

    public e(int i17) {
        super(null);
        this.f272462a = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gk1.e) && this.f272462a == ((gk1.e) obj).f272462a;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f272462a);
    }

    public java.lang.String toString() {
        return "LESS(version=" + this.f272462a + ')';
    }
}
