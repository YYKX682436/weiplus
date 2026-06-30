package f26;

/* loaded from: classes16.dex */
public final class c1 extends f26.x implements f26.a3 {

    /* renamed from: e, reason: collision with root package name */
    public final f26.z0 f259138e;

    /* renamed from: f, reason: collision with root package name */
    public final f26.o0 f259139f;

    public c1(f26.z0 delegate, f26.o0 enhancement) {
        kotlin.jvm.internal.o.g(delegate, "delegate");
        kotlin.jvm.internal.o.g(enhancement, "enhancement");
        this.f259138e = delegate;
        this.f259139f = enhancement;
    }

    @Override // f26.z0
    /* renamed from: D0 */
    public f26.z0 A0(boolean z17) {
        f26.c3 c17 = f26.b3.c(this.f259138e.A0(z17), this.f259139f.z0().A0(z17));
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (f26.z0) c17;
    }

    @Override // f26.z0
    /* renamed from: E0 */
    public f26.z0 C0(f26.r1 newAttributes) {
        kotlin.jvm.internal.o.g(newAttributes, "newAttributes");
        f26.c3 c17 = f26.b3.c(this.f259138e.C0(newAttributes), this.f259139f);
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (f26.z0) c17;
    }

    @Override // f26.x
    public f26.z0 F0() {
        return this.f259138e;
    }

    @Override // f26.x
    public f26.x H0(f26.z0 delegate) {
        kotlin.jvm.internal.o.g(delegate, "delegate");
        return new f26.c1(delegate, this.f259139f);
    }

    @Override // f26.x, f26.o0
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public f26.c1 y0(g26.l kotlinTypeRefiner) {
        kotlin.jvm.internal.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new f26.c1((f26.z0) kotlinTypeRefiner.a(this.f259138e), kotlinTypeRefiner.a(this.f259139f));
    }

    @Override // f26.a3
    public f26.c3 P() {
        return this.f259138e;
    }

    @Override // f26.a3
    public f26.o0 j0() {
        return this.f259139f;
    }

    @Override // f26.z0
    public java.lang.String toString() {
        return "[@EnhancedForWarnings(" + this.f259139f + ")] " + this.f259138e;
    }
}
