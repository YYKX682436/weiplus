package d0;

/* loaded from: classes14.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public float f225156a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f225157b;

    /* renamed from: c, reason: collision with root package name */
    public d0.p0 f225158c;

    public k2(float f17, boolean z17, d0.p0 p0Var, int i17, kotlin.jvm.internal.i iVar) {
        f17 = (i17 & 1) != 0 ? 0.0f : f17;
        z17 = (i17 & 2) != 0 ? true : z17;
        p0Var = (i17 & 4) != 0 ? null : p0Var;
        this.f225156a = f17;
        this.f225157b = z17;
        this.f225158c = p0Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0.k2)) {
            return false;
        }
        d0.k2 k2Var = (d0.k2) obj;
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f225156a), java.lang.Float.valueOf(k2Var.f225156a)) && this.f225157b == k2Var.f225157b && kotlin.jvm.internal.o.b(this.f225158c, k2Var.f225158c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = java.lang.Float.hashCode(this.f225156a) * 31;
        boolean z17 = this.f225157b;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        int i18 = (hashCode + i17) * 31;
        d0.p0 p0Var = this.f225158c;
        return i18 + (p0Var == null ? 0 : p0Var.hashCode());
    }

    public java.lang.String toString() {
        return "RowColumnParentData(weight=" + this.f225156a + ", fill=" + this.f225157b + ", crossAxisAlignment=" + this.f225158c + ')';
    }
}
