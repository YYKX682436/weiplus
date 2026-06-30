package u4;

/* loaded from: classes13.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Matrix f424542a = new android.graphics.Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f424543b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f424544c;

    /* renamed from: d, reason: collision with root package name */
    public float f424545d;

    /* renamed from: e, reason: collision with root package name */
    public float f424546e;

    public s(android.view.View view, float[] fArr) {
        this.f424543b = view;
        float[] fArr2 = (float[]) fArr.clone();
        this.f424544c = fArr2;
        this.f424545d = fArr2[2];
        this.f424546e = fArr2[5];
        a();
    }

    public final void a() {
        float f17 = this.f424545d;
        float[] fArr = this.f424544c;
        fArr[2] = f17;
        fArr[5] = this.f424546e;
        android.graphics.Matrix matrix = this.f424542a;
        matrix.setValues(fArr);
        u4.w1.a(this.f424543b, matrix);
    }
}
