package cw2;

/* loaded from: classes5.dex */
public final class c6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f223617a;

    /* renamed from: b, reason: collision with root package name */
    public final long f223618b;

    public c6(int i17, long j17) {
        this.f223617a = i17;
        this.f223618b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw2.c6)) {
            return false;
        }
        cw2.c6 c6Var = (cw2.c6) obj;
        return this.f223617a == c6Var.f223617a && this.f223618b == c6Var.f223618b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f223617a) * 31) + java.lang.Long.hashCode(this.f223618b);
    }

    public java.lang.String toString() {
        return "StrategyPostProcessorHolder(strategy=" + this.f223617a + ", postProcessor=" + this.f223618b + ')';
    }
}
