package e1;

/* loaded from: classes14.dex */
public final class e1 extends e1.r {

    /* renamed from: b, reason: collision with root package name */
    public final long f246251b;

    public e1(long j17, kotlin.jvm.internal.i iVar) {
        super(null);
        this.f246251b = j17;
    }

    @Override // e1.r
    public void a(long j17, e1.n0 p17, float f17) {
        long j18;
        kotlin.jvm.internal.o.g(p17, "p");
        e1.g gVar = (e1.g) p17;
        gVar.c(1.0f);
        if (f17 == 1.0f) {
            j18 = this.f246251b;
        } else {
            long j19 = this.f246251b;
            j18 = e1.y.b(j19, e1.y.d(j19) * f17, 0.0f, 0.0f, 0.0f, 14, null);
        }
        gVar.e(j18);
        if (gVar.f246256c != null) {
            gVar.h(null);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e1.e1) {
            return e1.y.c(this.f246251b, ((e1.e1) obj).f246251b);
        }
        return false;
    }

    public int hashCode() {
        int i17 = e1.y.f246321l;
        return java.lang.Long.hashCode(this.f246251b);
    }

    public java.lang.String toString() {
        return "SolidColor(value=" + ((java.lang.Object) e1.y.i(this.f246251b)) + ')';
    }
}
