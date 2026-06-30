package sv4;

/* loaded from: classes12.dex */
public final class c extends jv4.e {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f413393g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f413394h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(su4.p0 config, java.lang.ref.WeakReference delegate) {
        super(config);
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f413393g = delegate;
        this.f413394h = jz5.h.b(new sv4.b(this));
    }

    @Override // jv4.e
    public jv4.h a() {
        return (sv4.i) ((jz5.n) this.f413394h).getValue();
    }

    @Override // jv4.e
    public void d() {
        sv4.i iVar = (sv4.i) ((jz5.n) this.f413394h).getValue();
        sv4.d dVar = (sv4.d) this.f413393g.get();
        iVar.f413401b = dVar != null ? ((qv4.r0) dVar).h() : null;
        jv4.i iVar2 = iVar.f413402c;
        if (iVar2 != null) {
            ((jv4.p) iVar2).y(false);
        }
    }
}
