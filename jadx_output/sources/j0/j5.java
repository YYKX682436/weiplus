package j0;

/* loaded from: classes14.dex */
public final class j5 implements s1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final j0.u4 f296393d;

    /* renamed from: e, reason: collision with root package name */
    public final int f296394e;

    /* renamed from: f, reason: collision with root package name */
    public final g2.r0 f296395f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f296396g;

    public j5(j0.u4 scrollerPosition, int i17, g2.r0 transformedText, yz5.a textLayoutResultProvider) {
        kotlin.jvm.internal.o.g(scrollerPosition, "scrollerPosition");
        kotlin.jvm.internal.o.g(transformedText, "transformedText");
        kotlin.jvm.internal.o.g(textLayoutResultProvider, "textLayoutResultProvider");
        this.f296393d = scrollerPosition;
        this.f296394e = i17;
        this.f296395f = transformedText;
        this.f296396g = textLayoutResultProvider;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // s1.i0
    public int O(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.d(this, uVar, tVar, i17);
    }

    @Override // s1.i0
    public int Q(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.a(this, uVar, tVar, i17);
    }

    @Override // s1.i0
    public int S(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.c(this, uVar, tVar, i17);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0.j5)) {
            return false;
        }
        j0.j5 j5Var = (j0.j5) obj;
        return kotlin.jvm.internal.o.b(this.f296393d, j5Var.f296393d) && this.f296394e == j5Var.f296394e && kotlin.jvm.internal.o.b(this.f296395f, j5Var.f296395f) && kotlin.jvm.internal.o.b(this.f296396g, j5Var.f296396g);
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        kotlin.jvm.internal.o.g(measure, "$this$measure");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        s1.o1 m17 = measurable.m(p2.c.a(j17, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        int min = java.lang.Math.min(m17.f402051e, p2.c.g(j17));
        return s1.v0.b(measure, m17.f402050d, min, null, new j0.i5(measure, this, m17, min), 4, null);
    }

    public int hashCode() {
        return (((((this.f296393d.hashCode() * 31) + java.lang.Integer.hashCode(this.f296394e)) * 31) + this.f296395f.hashCode()) * 31) + this.f296396g.hashCode();
    }

    @Override // z0.t
    public z0.t k(z0.t other) {
        kotlin.jvm.internal.o.g(other, "other");
        return z0.q.a(this, other);
    }

    @Override // z0.t
    public java.lang.Object m(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(this, obj);
    }

    public java.lang.String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f296393d + ", cursorOffset=" + this.f296394e + ", transformedText=" + this.f296395f + ", textLayoutResultProvider=" + this.f296396g + ')';
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // s1.i0
    public int x(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.b(this, uVar, tVar, i17);
    }
}
