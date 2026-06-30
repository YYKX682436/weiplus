package f4;

/* loaded from: classes15.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f259379a;

    /* renamed from: b, reason: collision with root package name */
    public final long f259380b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f259381c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f259382d;

    public d(long j17, long j18, boolean z17, java.util.List states) {
        kotlin.jvm.internal.o.g(states, "states");
        this.f259379a = j17;
        this.f259380b = j18;
        this.f259381c = z17;
        this.f259382d = states;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type androidx.metrics.performance.FrameData");
        f4.d dVar = (f4.d) obj;
        return this.f259379a == dVar.f259379a && this.f259380b == dVar.f259380b && this.f259381c == dVar.f259381c && kotlin.jvm.internal.o.b(this.f259382d, dVar.f259382d);
    }

    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.f259379a) * 31) + java.lang.Long.hashCode(this.f259380b)) * 31) + java.lang.Boolean.hashCode(this.f259381c)) * 31) + this.f259382d.hashCode();
    }
}
