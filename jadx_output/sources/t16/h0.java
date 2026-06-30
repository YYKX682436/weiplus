package t16;

/* loaded from: classes15.dex */
public final class h0 extends t16.i0 {
    public h0(short s17) {
        super(java.lang.Short.valueOf(s17));
    }

    @Override // t16.g
    public f26.o0 a(o06.v0 module) {
        kotlin.jvm.internal.o.g(module, "module");
        o06.g a17 = o06.l0.a(module, l06.w.T);
        f26.z0 k17 = a17 != null ? a17.k() : null;
        return k17 == null ? h26.m.c(h26.l.F, "UShort") : k17;
    }

    @Override // t16.g
    public java.lang.String toString() {
        return ((java.lang.Number) this.f414613a).intValue() + ".toUShort()";
    }
}
