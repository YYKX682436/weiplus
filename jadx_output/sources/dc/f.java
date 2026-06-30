package dc;

/* loaded from: classes16.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final dc.q f228614a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f228615b;

    public f(dc.q qVar, java.lang.String str) {
        this.f228614a = qVar;
        this.f228615b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc.f)) {
            return false;
        }
        dc.f fVar = (dc.f) obj;
        return this.f228614a == fVar.f228614a && this.f228615b.equals(fVar.f228615b);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f228614a, this.f228615b});
    }
}
