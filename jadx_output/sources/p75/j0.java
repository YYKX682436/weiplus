package p75;

/* loaded from: classes4.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f352667a;

    /* renamed from: b, reason: collision with root package name */
    public final int f352668b;

    public j0(int i17, int i18) {
        this.f352667a = i17;
        this.f352668b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p75.j0)) {
            return false;
        }
        p75.j0 j0Var = (p75.j0) obj;
        return this.f352667a == j0Var.f352667a && this.f352668b == j0Var.f352668b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f352667a) * 31) + java.lang.Integer.hashCode(this.f352668b);
    }

    public java.lang.String toString() {
        return "Limit(limit=" + this.f352667a + ", offset=" + this.f352668b + ')';
    }
}
