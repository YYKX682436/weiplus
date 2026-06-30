package u4;

/* loaded from: classes3.dex */
public class k1 implements android.animation.TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f424508a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f424509b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Matrix f424510c = new android.graphics.Matrix();

    @Override // android.animation.TypeEvaluator
    public java.lang.Object evaluate(float f17, java.lang.Object obj, java.lang.Object obj2) {
        float[] fArr = this.f424508a;
        ((android.graphics.Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f424509b;
        ((android.graphics.Matrix) obj2).getValues(fArr2);
        for (int i17 = 0; i17 < 9; i17++) {
            float f18 = fArr2[i17];
            float f19 = fArr[i17];
            fArr2[i17] = f19 + ((f18 - f19) * f17);
        }
        android.graphics.Matrix matrix = this.f424510c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
