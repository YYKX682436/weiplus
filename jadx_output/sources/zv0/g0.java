package zv0;

/* loaded from: classes5.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f476177a;

    /* renamed from: b, reason: collision with root package name */
    public final int f476178b;

    public g0(int i17, int i18) {
        this.f476177a = i17;
        this.f476178b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv0.g0)) {
            return false;
        }
        zv0.g0 g0Var = (zv0.g0) obj;
        return this.f476177a == g0Var.f476177a && this.f476178b == g0Var.f476178b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f476177a) * 31) + java.lang.Integer.hashCode(this.f476178b);
    }

    public java.lang.String toString() {
        return "TransitionSelectedPack(preIndex=" + this.f476177a + ", selectedIndex=" + this.f476178b + ')';
    }
}
