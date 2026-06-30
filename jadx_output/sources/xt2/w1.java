package xt2;

/* loaded from: classes3.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f457081a;

    /* renamed from: b, reason: collision with root package name */
    public final int f457082b;

    public w1(int i17, int i18) {
        this.f457081a = i17;
        this.f457082b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt2.w1)) {
            return false;
        }
        xt2.w1 w1Var = (xt2.w1) obj;
        return this.f457081a == w1Var.f457081a && this.f457082b == w1Var.f457082b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f457081a) * 31) + java.lang.Integer.hashCode(this.f457082b);
    }

    public java.lang.String toString() {
        return "MeasureCacheResult(measuredWidth=" + this.f457081a + ", measuredHeight=" + this.f457082b + ')';
    }
}
