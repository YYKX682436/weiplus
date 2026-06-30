package t16;

/* loaded from: classes15.dex */
public final class j extends t16.g {
    public j(double d17) {
        super(java.lang.Double.valueOf(d17));
    }

    @Override // t16.g
    public f26.o0 a(o06.v0 module) {
        kotlin.jvm.internal.o.g(module, "module");
        l06.o h17 = module.h();
        h17.getClass();
        f26.z0 t17 = h17.t(l06.r.f314903s);
        if (t17 != null) {
            return t17;
        }
        l06.o.a(62);
        throw null;
    }

    @Override // t16.g
    public java.lang.String toString() {
        return ((java.lang.Number) this.f414613a).doubleValue() + ".toDouble()";
    }
}
