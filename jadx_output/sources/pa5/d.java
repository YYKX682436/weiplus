package pa5;

/* loaded from: classes3.dex */
public final class d extends u3.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f353097a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float[] f353098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float[] f353099c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float[] f353100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f353101e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kotlin.jvm.internal.e0 e0Var, float[] fArr, float[] fArr2, float[] fArr3, yz5.p pVar) {
        super("matrixProgress");
        this.f353097a = e0Var;
        this.f353098b = fArr;
        this.f353099c = fArr2;
        this.f353100d = fArr3;
        this.f353101e = pVar;
    }

    @Override // u3.t
    public float a(java.lang.Object obj) {
        android.graphics.Matrix matrix = (android.graphics.Matrix) obj;
        kotlin.jvm.internal.o.g(matrix, "matrix");
        return this.f353097a.f310115d;
    }

    @Override // u3.t
    public void b(java.lang.Object obj, float f17) {
        float[] fArr;
        android.graphics.Matrix matrix = (android.graphics.Matrix) obj;
        kotlin.jvm.internal.o.g(matrix, "matrix");
        float e17 = e06.p.e(f17, 0.0f, 1.0f);
        kotlin.jvm.internal.e0 e0Var = this.f353097a;
        e0Var.f310115d = e17;
        int i17 = 0;
        while (true) {
            fArr = this.f353098b;
            if (i17 >= 9) {
                break;
            }
            float f18 = this.f353099c[i17];
            fArr[i17] = f18 + ((this.f353100d[i17] - f18) * e0Var.f310115d);
            i17++;
        }
        matrix.setValues(fArr);
        yz5.p pVar = this.f353101e;
        if (pVar != null) {
            pVar.invoke(java.lang.Float.valueOf(f17), matrix);
        }
    }
}
