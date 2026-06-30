package f1;

/* loaded from: classes14.dex */
public final class j extends f1.k {

    /* renamed from: d, reason: collision with root package name */
    public final f1.y f258498d;

    /* renamed from: e, reason: collision with root package name */
    public final f1.y f258499e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f258500f;

    public j(f1.y yVar, f1.y yVar2, int i17, kotlin.jvm.internal.i iVar) {
        super(yVar, yVar2, yVar, yVar2, i17, null, null);
        float[] f17;
        this.f258498d = yVar;
        this.f258499e = yVar2;
        boolean c17 = f1.e.c(yVar.f258523d, yVar2.f258523d);
        float[] fArr = yVar.f258528i;
        float[] fArr2 = yVar2.f258529j;
        if (c17) {
            f17 = f1.e.f(fArr2, fArr);
        } else {
            f1.a0 a0Var = yVar.f258523d;
            float[] a17 = a0Var.a();
            f1.a0 a0Var2 = yVar2.f258523d;
            float[] a18 = a0Var2.a();
            f1.a0 a0Var3 = f1.l.f258505b;
            boolean c18 = f1.e.c(a0Var, a0Var3);
            float[] fArr3 = f1.l.f258508e;
            float[] fArr4 = f1.b.f258464b.f258465a;
            if (!c18) {
                float[] copyOf = java.util.Arrays.copyOf(fArr3, 3);
                kotlin.jvm.internal.o.f(copyOf, "copyOf(this, size)");
                fArr = f1.e.f(f1.e.b(fArr4, a17, copyOf), fArr);
            }
            if (!f1.e.c(a0Var2, a0Var3)) {
                float[] copyOf2 = java.util.Arrays.copyOf(fArr3, 3);
                kotlin.jvm.internal.o.f(copyOf2, "copyOf(this, size)");
                fArr2 = f1.e.e(f1.e.f(f1.e.b(fArr4, a18, copyOf2), yVar2.f258528i));
            }
            f17 = f1.e.f(fArr2, i17 == 3 ? f1.e.g(new float[]{a17[0] / a18[0], a17[1] / a18[1], a17[2] / a18[2]}, fArr) : fArr);
        }
        this.f258500f = f17;
    }

    @Override // f1.k
    public float[] a(float[] v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        f1.y yVar = this.f258498d;
        v17[0] = (float) ((java.lang.Number) ((f1.w) yVar.f258533n).invoke(java.lang.Double.valueOf(v17[0]))).doubleValue();
        v17[1] = (float) ((java.lang.Number) ((f1.w) yVar.f258533n).invoke(java.lang.Double.valueOf(v17[1]))).doubleValue();
        v17[2] = (float) ((java.lang.Number) ((f1.w) yVar.f258533n).invoke(java.lang.Double.valueOf(v17[2]))).doubleValue();
        f1.e.h(this.f258500f, v17);
        f1.y yVar2 = this.f258499e;
        v17[0] = (float) ((java.lang.Number) ((f1.x) yVar2.f258531l).invoke(java.lang.Double.valueOf(v17[0]))).doubleValue();
        v17[1] = (float) ((java.lang.Number) ((f1.x) yVar2.f258531l).invoke(java.lang.Double.valueOf(v17[1]))).doubleValue();
        v17[2] = (float) ((java.lang.Number) ((f1.x) yVar2.f258531l).invoke(java.lang.Double.valueOf(v17[2]))).doubleValue();
        return v17;
    }
}
