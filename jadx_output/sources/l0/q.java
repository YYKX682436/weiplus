package l0;

/* loaded from: classes14.dex */
public final class q implements l0.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f314459a;

    /* renamed from: b, reason: collision with root package name */
    public final long f314460b;

    /* renamed from: c, reason: collision with root package name */
    public final long f314461c;

    /* renamed from: d, reason: collision with root package name */
    public final long f314462d;

    public q(long j17, long j18, long j19, long j27, kotlin.jvm.internal.i iVar) {
        this.f314459a = j17;
        this.f314460b = j18;
        this.f314461c = j19;
        this.f314462d = j27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.o.b(kotlin.jvm.internal.i0.a(l0.q.class), kotlin.jvm.internal.i0.a(obj.getClass()))) {
            return false;
        }
        l0.q qVar = (l0.q) obj;
        return e1.y.c(this.f314459a, qVar.f314459a) && e1.y.c(this.f314460b, qVar.f314460b) && e1.y.c(this.f314461c, qVar.f314461c) && e1.y.c(this.f314462d, qVar.f314462d);
    }

    public int hashCode() {
        int i17 = e1.y.f246321l;
        return (((((java.lang.Long.hashCode(this.f314459a) * 31) + java.lang.Long.hashCode(this.f314460b)) * 31) + java.lang.Long.hashCode(this.f314461c)) * 31) + java.lang.Long.hashCode(this.f314462d);
    }
}
