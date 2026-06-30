package o06;

/* loaded from: classes16.dex */
public final class e implements o06.e2 {

    /* renamed from: d, reason: collision with root package name */
    public final o06.e2 f341938d;

    /* renamed from: e, reason: collision with root package name */
    public final o06.m f341939e;

    /* renamed from: f, reason: collision with root package name */
    public final int f341940f;

    public e(o06.e2 originalDescriptor, o06.m declarationDescriptor, int i17) {
        kotlin.jvm.internal.o.g(originalDescriptor, "originalDescriptor");
        kotlin.jvm.internal.o.g(declarationDescriptor, "declarationDescriptor");
        this.f341938d = originalDescriptor;
        this.f341939e = declarationDescriptor;
        this.f341940f = i17;
    }

    @Override // o06.e2
    public e26.c0 a0() {
        return this.f341938d.a0();
    }

    @Override // o06.m
    public o06.m e() {
        return this.f341939e;
    }

    @Override // o06.e2, o06.j
    public f26.c2 g() {
        return this.f341938d.g();
    }

    @Override // p06.a
    public p06.k getAnnotations() {
        return this.f341938d.getAnnotations();
    }

    @Override // o06.e2
    public int getIndex() {
        return this.f341940f + this.f341938d.getIndex();
    }

    @Override // o06.x0
    public n16.g getName() {
        return this.f341938d.getName();
    }

    @Override // o06.p
    public o06.x1 getSource() {
        return this.f341938d.getSource();
    }

    @Override // o06.e2
    public java.util.List getUpperBounds() {
        return this.f341938d.getUpperBounds();
    }

    @Override // o06.j
    public f26.z0 k() {
        return this.f341938d.k();
    }

    @Override // o06.e2
    public boolean o() {
        return this.f341938d.o();
    }

    @Override // o06.e2
    public f26.d3 q() {
        return this.f341938d.q();
    }

    public java.lang.String toString() {
        return this.f341938d + "[inner-copy]";
    }

    @Override // o06.m
    public java.lang.Object w(o06.o oVar, java.lang.Object obj) {
        return this.f341938d.w(oVar, obj);
    }

    @Override // o06.e2
    public boolean y() {
        return true;
    }

    @Override // o06.m
    public o06.e2 a() {
        o06.e2 a17 = this.f341938d.a();
        kotlin.jvm.internal.o.f(a17, "getOriginal(...)");
        return a17;
    }
}
