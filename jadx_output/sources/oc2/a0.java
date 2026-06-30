package oc2;

/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f344149a;

    /* renamed from: b, reason: collision with root package name */
    public final float f344150b;

    /* renamed from: c, reason: collision with root package name */
    public final float f344151c;

    public a0(int i17, float f17, float f18) {
        this.f344149a = i17;
        this.f344150b = f17;
        this.f344151c = f18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc2.a0)) {
            return false;
        }
        oc2.a0 a0Var = (oc2.a0) obj;
        return this.f344149a == a0Var.f344149a && java.lang.Float.compare(this.f344150b, a0Var.f344150b) == 0 && java.lang.Float.compare(this.f344151c, a0Var.f344151c) == 0;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f344149a) * 31) + java.lang.Float.hashCode(this.f344150b)) * 31) + java.lang.Float.hashCode(this.f344151c);
    }

    public java.lang.String toString() {
        return "BalanceFallbackTextResult(maxWidth=" + this.f344149a + ", line1Width=" + this.f344150b + ", line2Width=" + this.f344151c + ')';
    }
}
