package x0;

/* loaded from: classes14.dex */
public final class k0 extends x0.a1 {

    /* renamed from: c, reason: collision with root package name */
    public p0.f f450901c;

    /* renamed from: d, reason: collision with root package name */
    public int f450902d;

    public k0(p0.f map) {
        kotlin.jvm.internal.o.g(map, "map");
        this.f450901c = map;
    }

    @Override // x0.a1
    public void a(x0.a1 value) {
        kotlin.jvm.internal.o.g(value, "value");
        x0.k0 k0Var = (x0.k0) value;
        synchronized (x0.m0.f450912a) {
            this.f450901c = k0Var.f450901c;
            this.f450902d = k0Var.f450902d;
        }
    }

    @Override // x0.a1
    public x0.a1 b() {
        return new x0.k0(this.f450901c);
    }

    public final void c(p0.f fVar) {
        kotlin.jvm.internal.o.g(fVar, "<set-?>");
        this.f450901c = fVar;
    }
}
