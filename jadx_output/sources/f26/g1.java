package f26;

/* loaded from: classes16.dex */
public final class g1 extends f26.m2 {

    /* renamed from: a, reason: collision with root package name */
    public final o06.e2 f259165a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f259166b;

    public g1(o06.e2 typeParameter) {
        kotlin.jvm.internal.o.g(typeParameter, "typeParameter");
        this.f259165a = typeParameter;
        this.f259166b = jz5.h.a(jz5.i.f302830e, new f26.f1(this));
    }

    @Override // f26.l2
    public f26.l2 a(g26.l kotlinTypeRefiner) {
        kotlin.jvm.internal.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // f26.l2
    public boolean b() {
        return true;
    }

    @Override // f26.l2
    public f26.d3 c() {
        return f26.d3.f259145h;
    }

    @Override // f26.l2
    public f26.o0 getType() {
        return (f26.o0) this.f259166b.getValue();
    }
}
