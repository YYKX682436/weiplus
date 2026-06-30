package cv;

/* loaded from: classes7.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final m3.a f222513a;

    /* renamed from: b, reason: collision with root package name */
    public final int f222514b;

    public u0(m3.a aVar, int i17) {
        this.f222513a = aVar;
        this.f222514b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv.u0)) {
            return false;
        }
        cv.u0 u0Var = (cv.u0) obj;
        return kotlin.jvm.internal.o.b(this.f222513a, u0Var.f222513a) && this.f222514b == u0Var.f222514b;
    }

    public int hashCode() {
        m3.a aVar = this.f222513a;
        return ((aVar == null ? 0 : aVar.hashCode()) * 31) + java.lang.Integer.hashCode(this.f222514b);
    }

    public java.lang.String toString() {
        return "AudioRouteConsumer(consumer=" + this.f222513a + ", usage=" + this.f222514b + ')';
    }
}
