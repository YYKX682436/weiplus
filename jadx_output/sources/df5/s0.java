package df5;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f232203a;

    /* renamed from: b, reason: collision with root package name */
    public final int f232204b;

    public s0(int i17, int i18) {
        this.f232203a = i17;
        this.f232204b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df5.s0)) {
            return false;
        }
        df5.s0 s0Var = (df5.s0) obj;
        return this.f232203a == s0Var.f232203a && this.f232204b == s0Var.f232204b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f232203a) * 31) + java.lang.Integer.hashCode(this.f232204b);
    }

    public java.lang.String toString() {
        return "ListSegmentKey(level=" + this.f232203a + ", seq=" + this.f232204b + ')';
    }
}
