package l0;

/* loaded from: classes14.dex */
public final class x implements l0.b3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f314587a;

    /* renamed from: b, reason: collision with root package name */
    public final long f314588b;

    /* renamed from: c, reason: collision with root package name */
    public final long f314589c;

    /* renamed from: d, reason: collision with root package name */
    public final long f314590d;

    /* renamed from: e, reason: collision with root package name */
    public final long f314591e;

    /* renamed from: f, reason: collision with root package name */
    public final long f314592f;

    /* renamed from: g, reason: collision with root package name */
    public final long f314593g;

    /* renamed from: h, reason: collision with root package name */
    public final long f314594h;

    public x(long j17, long j18, long j19, long j27, long j28, long j29, long j37, long j38, kotlin.jvm.internal.i iVar) {
        this.f314587a = j17;
        this.f314588b = j18;
        this.f314589c = j19;
        this.f314590d = j27;
        this.f314591e = j28;
        this.f314592f = j29;
        this.f314593g = j37;
        this.f314594h = j38;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.o.b(kotlin.jvm.internal.i0.a(l0.x.class), kotlin.jvm.internal.i0.a(obj.getClass()))) {
            return false;
        }
        l0.x xVar = (l0.x) obj;
        return e1.y.c(this.f314587a, xVar.f314587a) && e1.y.c(this.f314588b, xVar.f314588b) && e1.y.c(this.f314589c, xVar.f314589c) && e1.y.c(this.f314590d, xVar.f314590d) && e1.y.c(this.f314591e, xVar.f314591e) && e1.y.c(this.f314592f, xVar.f314592f) && e1.y.c(this.f314593g, xVar.f314593g) && e1.y.c(this.f314594h, xVar.f314594h);
    }

    public int hashCode() {
        int i17 = e1.y.f246321l;
        return (((((((((((((java.lang.Long.hashCode(this.f314587a) * 31) + java.lang.Long.hashCode(this.f314588b)) * 31) + java.lang.Long.hashCode(this.f314589c)) * 31) + java.lang.Long.hashCode(this.f314590d)) * 31) + java.lang.Long.hashCode(this.f314591e)) * 31) + java.lang.Long.hashCode(this.f314592f)) * 31) + java.lang.Long.hashCode(this.f314593g)) * 31) + java.lang.Long.hashCode(this.f314594h);
    }
}
