package s16;

/* loaded from: classes16.dex */
public final class a extends f26.z0 implements i26.d {

    /* renamed from: e, reason: collision with root package name */
    public final f26.l2 f402186e;

    /* renamed from: f, reason: collision with root package name */
    public final s16.b f402187f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f402188g;

    /* renamed from: h, reason: collision with root package name */
    public final f26.r1 f402189h;

    public a(f26.l2 typeProjection, s16.b constructor, boolean z17, f26.r1 attributes) {
        kotlin.jvm.internal.o.g(typeProjection, "typeProjection");
        kotlin.jvm.internal.o.g(constructor, "constructor");
        kotlin.jvm.internal.o.g(attributes, "attributes");
        this.f402186e = typeProjection;
        this.f402187f = constructor;
        this.f402188g = z17;
        this.f402189h = attributes;
    }

    @Override // f26.z0, f26.c3
    public f26.c3 A0(boolean z17) {
        if (z17 == this.f402188g) {
            return this;
        }
        return new s16.a(this.f402186e, this.f402187f, z17, this.f402189h);
    }

    @Override // f26.c3
    /* renamed from: B0 */
    public f26.c3 y0(g26.l kotlinTypeRefiner) {
        kotlin.jvm.internal.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        f26.l2 a17 = this.f402186e.a(kotlinTypeRefiner);
        kotlin.jvm.internal.o.f(a17, "refine(...)");
        return new s16.a(a17, this.f402187f, this.f402188g, this.f402189h);
    }

    @Override // f26.z0
    /* renamed from: D0 */
    public f26.z0 A0(boolean z17) {
        if (z17 == this.f402188g) {
            return this;
        }
        return new s16.a(this.f402186e, this.f402187f, z17, this.f402189h);
    }

    @Override // f26.z0
    /* renamed from: E0 */
    public f26.z0 C0(f26.r1 newAttributes) {
        kotlin.jvm.internal.o.g(newAttributes, "newAttributes");
        return new s16.a(this.f402186e, this.f402187f, this.f402188g, newAttributes);
    }

    @Override // f26.o0
    public y16.s V() {
        return h26.m.a(h26.i.f278336e, true, new java.lang.String[0]);
    }

    @Override // f26.z0
    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Captured(");
        sb6.append(this.f402186e);
        sb6.append(')');
        sb6.append(this.f402188g ? "?" : "");
        return sb6.toString();
    }

    @Override // f26.o0
    public java.util.List u0() {
        return kz5.p0.f313996d;
    }

    @Override // f26.o0
    public f26.r1 v0() {
        return this.f402189h;
    }

    @Override // f26.o0
    public f26.c2 w0() {
        return this.f402187f;
    }

    @Override // f26.o0
    public boolean x0() {
        return this.f402188g;
    }

    @Override // f26.o0
    public f26.o0 y0(g26.l kotlinTypeRefiner) {
        kotlin.jvm.internal.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        f26.l2 a17 = this.f402186e.a(kotlinTypeRefiner);
        kotlin.jvm.internal.o.f(a17, "refine(...)");
        return new s16.a(a17, this.f402187f, this.f402188g, this.f402189h);
    }
}
