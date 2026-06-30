package f26;

/* loaded from: classes16.dex */
public final class g0 extends f26.e0 implements f26.a3 {

    /* renamed from: g, reason: collision with root package name */
    public final f26.e0 f259163g;

    /* renamed from: h, reason: collision with root package name */
    public final f26.o0 f259164h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(f26.e0 origin, f26.o0 enhancement) {
        super(origin.f259153e, origin.f259154f);
        kotlin.jvm.internal.o.g(origin, "origin");
        kotlin.jvm.internal.o.g(enhancement, "enhancement");
        this.f259163g = origin;
        this.f259164h = enhancement;
    }

    @Override // f26.c3
    public f26.c3 A0(boolean z17) {
        return f26.b3.c(this.f259163g.A0(z17), this.f259164h.z0().A0(z17));
    }

    @Override // f26.c3
    /* renamed from: B0 */
    public f26.c3 y0(g26.l kotlinTypeRefiner) {
        kotlin.jvm.internal.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new f26.g0((f26.e0) kotlinTypeRefiner.a(this.f259163g), kotlinTypeRefiner.a(this.f259164h));
    }

    @Override // f26.c3
    public f26.c3 C0(f26.r1 newAttributes) {
        kotlin.jvm.internal.o.g(newAttributes, "newAttributes");
        return f26.b3.c(this.f259163g.C0(newAttributes), this.f259164h);
    }

    @Override // f26.e0
    public f26.z0 D0() {
        return this.f259163g.D0();
    }

    @Override // f26.e0
    public java.lang.String E0(q16.s renderer, q16.c0 options) {
        kotlin.jvm.internal.o.g(renderer, "renderer");
        kotlin.jvm.internal.o.g(options, "options");
        return options.a() ? renderer.v(this.f259164h) : this.f259163g.E0(renderer, options);
    }

    @Override // f26.a3
    public f26.c3 P() {
        return this.f259163g;
    }

    @Override // f26.a3
    public f26.o0 j0() {
        return this.f259164h;
    }

    @Override // f26.e0
    public java.lang.String toString() {
        return "[@EnhancedForWarnings(" + this.f259164h + ")] " + this.f259163g;
    }

    @Override // f26.o0
    public f26.o0 y0(g26.l kotlinTypeRefiner) {
        kotlin.jvm.internal.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new f26.g0((f26.e0) kotlinTypeRefiner.a(this.f259163g), kotlinTypeRefiner.a(this.f259164h));
    }
}
