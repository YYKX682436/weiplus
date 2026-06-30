package hc2;

/* loaded from: classes3.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f280325a;

    /* renamed from: b, reason: collision with root package name */
    public final int f280326b;

    public g1(int i17, int i18) {
        this.f280325a = i17;
        this.f280326b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc2.g1)) {
            return false;
        }
        hc2.g1 g1Var = (hc2.g1) obj;
        return this.f280325a == g1Var.f280325a && this.f280326b == g1Var.f280326b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f280325a) * 31) + java.lang.Integer.hashCode(this.f280326b);
    }

    public java.lang.String toString() {
        return "SmileySpanInfo(start=" + this.f280325a + ", count=" + this.f280326b + ')';
    }
}
