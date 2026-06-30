package u4;

/* loaded from: classes13.dex */
public class x implements android.animation.TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f424577a;

    public x(float[] fArr) {
        this.f424577a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    public java.lang.Object evaluate(float f17, java.lang.Object obj, java.lang.Object obj2) {
        float[] fArr = (float[]) obj;
        float[] fArr2 = (float[]) obj2;
        float[] fArr3 = this.f424577a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i17 = 0; i17 < fArr3.length; i17++) {
            float f18 = fArr[i17];
            fArr3[i17] = f18 + ((fArr2[i17] - f18) * f17);
        }
        return fArr3;
    }
}
