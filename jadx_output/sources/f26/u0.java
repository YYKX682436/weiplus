package f26;

/* loaded from: classes16.dex */
public final class u0 extends f26.e3 {

    /* renamed from: e, reason: collision with root package name */
    public final e26.c0 f259220e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f259221f;

    /* renamed from: g, reason: collision with root package name */
    public final e26.x f259222g;

    public u0(e26.c0 storageManager, yz5.a computation) {
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        kotlin.jvm.internal.o.g(computation, "computation");
        this.f259220e = storageManager;
        this.f259221f = computation;
        this.f259222g = ((e26.u) storageManager).b(computation);
    }

    @Override // f26.e3
    public f26.o0 A0() {
        return (f26.o0) ((e26.o) this.f259222g).invoke();
    }

    @Override // f26.o0
    public f26.o0 y0(g26.l kotlinTypeRefiner) {
        kotlin.jvm.internal.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new f26.u0(this.f259220e, new f26.t0(kotlinTypeRefiner, this));
    }
}
