package f26;

/* loaded from: classes16.dex */
public final class a1 extends f26.z0 {

    /* renamed from: e, reason: collision with root package name */
    public final f26.c2 f259123e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f259124f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f259125g;

    /* renamed from: h, reason: collision with root package name */
    public final y16.s f259126h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f259127i;

    public a1(f26.c2 constructor, java.util.List arguments, boolean z17, y16.s memberScope, yz5.l refinedTypeFactory) {
        kotlin.jvm.internal.o.g(constructor, "constructor");
        kotlin.jvm.internal.o.g(arguments, "arguments");
        kotlin.jvm.internal.o.g(memberScope, "memberScope");
        kotlin.jvm.internal.o.g(refinedTypeFactory, "refinedTypeFactory");
        this.f259123e = constructor;
        this.f259124f = arguments;
        this.f259125g = z17;
        this.f259126h = memberScope;
        this.f259127i = refinedTypeFactory;
        if (!(memberScope instanceof h26.h) || (memberScope instanceof h26.n)) {
            return;
        }
        throw new java.lang.IllegalStateException("SimpleTypeImpl should not be created for error type: " + memberScope + '\n' + constructor);
    }

    @Override // f26.c3
    /* renamed from: B0 */
    public f26.c3 y0(g26.l kotlinTypeRefiner) {
        kotlin.jvm.internal.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        f26.z0 z0Var = (f26.z0) this.f259127i.invoke(kotlinTypeRefiner);
        return z0Var == null ? this : z0Var;
    }

    @Override // f26.z0
    /* renamed from: D0 */
    public f26.z0 A0(boolean z17) {
        return z17 == this.f259125g ? this : z17 ? new f26.x0(this) : new f26.v0(this);
    }

    @Override // f26.z0
    /* renamed from: E0 */
    public f26.z0 C0(f26.r1 newAttributes) {
        kotlin.jvm.internal.o.g(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new f26.b1(this, newAttributes);
    }

    @Override // f26.o0
    public y16.s V() {
        return this.f259126h;
    }

    @Override // f26.o0
    public java.util.List u0() {
        return this.f259124f;
    }

    @Override // f26.o0
    public f26.r1 v0() {
        f26.r1.f259214e.getClass();
        return f26.r1.f259215f;
    }

    @Override // f26.o0
    public f26.c2 w0() {
        return this.f259123e;
    }

    @Override // f26.o0
    public boolean x0() {
        return this.f259125g;
    }

    @Override // f26.o0
    public f26.o0 y0(g26.l kotlinTypeRefiner) {
        kotlin.jvm.internal.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        f26.z0 z0Var = (f26.z0) this.f259127i.invoke(kotlinTypeRefiner);
        return z0Var == null ? this : z0Var;
    }
}
