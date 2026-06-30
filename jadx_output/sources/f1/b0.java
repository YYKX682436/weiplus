package f1;

/* loaded from: classes14.dex */
public final class b0 extends f1.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.lang.String name, int i17) {
        super(name, f1.c.f258467b, i17, null);
        kotlin.jvm.internal.o.g(name, "name");
        int i18 = f1.c.f258470e;
    }

    @Override // f1.d
    public float[] a(float[] v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        v17[0] = f(v17[0]);
        v17[1] = f(v17[1]);
        v17[2] = f(v17[2]);
        return v17;
    }

    @Override // f1.d
    public float b(int i17) {
        return 2.0f;
    }

    @Override // f1.d
    public float c(int i17) {
        return -2.0f;
    }

    @Override // f1.d
    public float[] e(float[] v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        v17[0] = f(v17[0]);
        v17[1] = f(v17[1]);
        v17[2] = f(v17[2]);
        return v17;
    }

    public final float f(float f17) {
        return e06.p.e(f17, -2.0f, 2.0f);
    }
}
