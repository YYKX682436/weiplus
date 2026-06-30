package j0;

/* loaded from: classes14.dex */
public final class x1 implements s1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final j0.u4 f296633d;

    /* renamed from: e, reason: collision with root package name */
    public final int f296634e;

    /* renamed from: f, reason: collision with root package name */
    public final g2.r0 f296635f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f296636g;

    public x1(j0.u4 scrollerPosition, int i17, g2.r0 transformedText, yz5.a textLayoutResultProvider) {
        kotlin.jvm.internal.o.g(scrollerPosition, "scrollerPosition");
        kotlin.jvm.internal.o.g(transformedText, "transformedText");
        kotlin.jvm.internal.o.g(textLayoutResultProvider, "textLayoutResultProvider");
        this.f296633d = scrollerPosition;
        this.f296634e = i17;
        this.f296635f = transformedText;
        this.f296636g = textLayoutResultProvider;
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
        if (!(obj instanceof j0.x1)) {
            return false;
        }
        j0.x1 x1Var = (j0.x1) obj;
        return kotlin.jvm.internal.o.b(this.f296633d, x1Var.f296633d) && this.f296634e == x1Var.f296634e && kotlin.jvm.internal.o.b(this.f296635f, x1Var.f296635f) && kotlin.jvm.internal.o.b(this.f296636g, x1Var.f296636g);
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        kotlin.jvm.internal.o.g(measure, "$this$measure");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        s1.o1 m17 = measurable.m(measurable.l(p2.c.g(j17)) < p2.c.h(j17) ? j17 : p2.c.a(j17, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        int min = java.lang.Math.min(m17.f402050d, p2.c.h(j17));
        return s1.v0.b(measure, min, m17.f402051e, null, new j0.w1(measure, this, m17, min), 4, null);
    }

    public int hashCode() {
        return (((((this.f296633d.hashCode() * 31) + java.lang.Integer.hashCode(this.f296634e)) * 31) + this.f296635f.hashCode()) * 31) + this.f296636g.hashCode();
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
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f296633d + ", cursorOffset=" + this.f296634e + ", transformedText=" + this.f296635f + ", textLayoutResultProvider=" + this.f296636g + ')';
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
