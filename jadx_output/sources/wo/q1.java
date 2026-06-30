package wo;

/* loaded from: classes3.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f447790a;

    /* renamed from: b, reason: collision with root package name */
    public final int f447791b;

    public q1(int i17, int i18) {
        this.f447790a = i17;
        this.f447791b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo.q1)) {
            return false;
        }
        wo.q1 q1Var = (wo.q1) obj;
        return this.f447790a == q1Var.f447790a && this.f447791b == q1Var.f447791b;
    }

    public int hashCode() {
        int i17 = this.f447790a;
        return ((i17 >>> 16) | (i17 << 16)) ^ this.f447791b;
    }

    public java.lang.String toString() {
        return this.f447790a + "x" + this.f447791b;
    }
}
