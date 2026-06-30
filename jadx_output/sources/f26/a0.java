package f26;

/* loaded from: classes16.dex */
public final class a0 extends f26.q2 {

    /* renamed from: b, reason: collision with root package name */
    public final f26.q2 f259121b;

    /* renamed from: c, reason: collision with root package name */
    public final f26.q2 f259122c;

    public a0(f26.q2 q2Var, f26.q2 q2Var2, kotlin.jvm.internal.i iVar) {
        this.f259121b = q2Var;
        this.f259122c = q2Var2;
    }

    @Override // f26.q2
    public boolean a() {
        return this.f259121b.a() || this.f259122c.a();
    }

    @Override // f26.q2
    public boolean b() {
        return this.f259121b.b() || this.f259122c.b();
    }

    @Override // f26.q2
    public p06.k c(p06.k annotations) {
        kotlin.jvm.internal.o.g(annotations, "annotations");
        return this.f259122c.c(this.f259121b.c(annotations));
    }

    @Override // f26.q2
    public f26.l2 d(f26.o0 key) {
        kotlin.jvm.internal.o.g(key, "key");
        f26.l2 d17 = this.f259121b.d(key);
        return d17 == null ? this.f259122c.d(key) : d17;
    }

    @Override // f26.q2
    public f26.o0 f(f26.o0 topLevelType, f26.d3 position) {
        kotlin.jvm.internal.o.g(topLevelType, "topLevelType");
        kotlin.jvm.internal.o.g(position, "position");
        return this.f259122c.f(this.f259121b.f(topLevelType, position), position);
    }
}
