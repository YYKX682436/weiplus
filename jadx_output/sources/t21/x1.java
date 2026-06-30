package t21;

/* loaded from: classes5.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f415061a;

    /* renamed from: b, reason: collision with root package name */
    public int f415062b;

    public x1(boolean z17, int i17, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 1) != 0 ? false : z17;
        i17 = (i18 & 2) != 0 ? 2 : i17;
        this.f415061a = z17;
        this.f415062b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t21.x1)) {
            return false;
        }
        t21.x1 x1Var = (t21.x1) obj;
        return this.f415061a == x1Var.f415061a && this.f415062b == x1Var.f415062b;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f415061a) * 31) + java.lang.Integer.hashCode(this.f415062b);
    }

    public java.lang.String toString() {
        return "ParallelParam(enableParallel=" + this.f415061a + ", maxParallelSize=" + this.f415062b + ')';
    }
}
