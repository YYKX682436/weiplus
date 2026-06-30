package qn0;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f364910a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f364911b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public boolean f364912c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f364913d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f364914e = false;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.PointF f364915f = new android.graphics.PointF();

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.PointF f364916g = new android.graphics.PointF();

    /* renamed from: h, reason: collision with root package name */
    public int f364917h;

    /* renamed from: i, reason: collision with root package name */
    public float f364918i;

    /* renamed from: j, reason: collision with root package name */
    public float f364919j;

    /* renamed from: k, reason: collision with root package name */
    public float f364920k;

    /* renamed from: l, reason: collision with root package name */
    public float f364921l;

    /* renamed from: m, reason: collision with root package name */
    public float f364922m;

    /* renamed from: n, reason: collision with root package name */
    public float f364923n;

    /* renamed from: o, reason: collision with root package name */
    public float f364924o;

    /* renamed from: p, reason: collision with root package name */
    public float f364925p;

    /* renamed from: q, reason: collision with root package name */
    public float f364926q;

    /* renamed from: r, reason: collision with root package name */
    public int f364927r;

    /* renamed from: s, reason: collision with root package name */
    public int f364928s;

    public d() {
        this.f364910a = false;
        b();
        this.f364910a = true;
    }

    public final float a(float f17, float f18) {
        float f19 = this.f364911b[0];
        if (f19 * f18 < 1.0d) {
            return 0.0f;
        }
        float f27 = f19 - 1.0f;
        float f28 = f27 * f18;
        if (f17 > f28) {
            return f28;
        }
        float f29 = f27 * (-f18);
        return f17 < f29 ? f29 : f17;
    }

    public void b() {
        this.f364921l = 0.0f;
        this.f364922m = 0.0f;
        this.f364923n = 0.0f;
        this.f364924o = 0.0f;
        this.f364920k = 1.0f;
        this.f364925p = 1.0f;
        this.f364926q = 1.0f;
        this.f364918i = -1.0f;
        this.f364919j = -1.0f;
        this.f364915f.set(-1.0f, -1.0f);
        this.f364916g.set(-1.0f, -1.0f);
        android.opengl.Matrix.setIdentityM(this.f364911b, 0);
        this.f364912c = false;
        this.f364913d = false;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    public final void c() {
        int i17;
        int i18 = this.f364927r;
        float[] fArr = this.f364911b;
        if (i18 <= 0 || (i17 = this.f364928s) <= 0) {
            android.opengl.Matrix.setIdentityM(fArr, 0);
            return;
        }
        float[] fArr2 = new float[16];
        float f17 = (this.f364921l / i18) * 2.0f;
        float f18 = ((-this.f364922m) / i17) * 2.0f;
        android.opengl.Matrix.setIdentityM(fArr2, 0);
        android.opengl.Matrix.translateM(fArr2, 0, f17, f18, 0.0f);
        float[] fArr3 = this.f364911b;
        android.opengl.Matrix.multiplyMM(fArr3, 0, fArr2, 0, fArr3, 0);
        android.opengl.Matrix.setIdentityM(fArr2, 0);
        float f19 = this.f364920k;
        android.opengl.Matrix.scaleM(fArr2, 0, f19, f19, 0.0f);
        float[] fArr4 = this.f364911b;
        android.opengl.Matrix.multiplyMM(fArr4, 0, fArr2, 0, fArr4, 0);
        float f27 = (this.f364923n / this.f364927r) * 2.0f;
        float f28 = ((-this.f364924o) / this.f364928s) * 2.0f;
        android.opengl.Matrix.setIdentityM(fArr2, 0);
        android.opengl.Matrix.translateM(fArr2, 0, f27, f28, 0.0f);
        float[] fArr5 = this.f364911b;
        android.opengl.Matrix.multiplyMM(fArr5, 0, fArr2, 0, fArr5, 0);
        fArr[12] = a(fArr[12], this.f364925p);
        fArr[13] = a(fArr[13], this.f364926q);
        this.f364920k = 1.0f;
        this.f364921l = 0.0f;
        this.f364922m = 0.0f;
        this.f364923n = 0.0f;
        this.f364924o = 0.0f;
    }
}
