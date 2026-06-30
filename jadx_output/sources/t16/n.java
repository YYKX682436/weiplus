package t16;

/* loaded from: classes15.dex */
public final class n extends t16.g {
    public n(float f17) {
        super(java.lang.Float.valueOf(f17));
    }

    @Override // t16.g
    public f26.o0 a(o06.v0 module) {
        kotlin.jvm.internal.o.g(module, "module");
        l06.o h17 = module.h();
        h17.getClass();
        f26.z0 t17 = h17.t(l06.r.f314901q);
        if (t17 != null) {
            return t17;
        }
        l06.o.a(61);
        throw null;
    }

    @Override // t16.g
    public java.lang.String toString() {
        return ((java.lang.Number) this.f414613a).floatValue() + ".toFloat()";
    }
}
