package qn0;

/* loaded from: classes14.dex */
public class c {

    /* renamed from: u, reason: collision with root package name */
    public static final float f364889u = android.content.res.Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f364892c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f364893d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f364894e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f364895f;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.GestureDetector f364897h;

    /* renamed from: l, reason: collision with root package name */
    public android.hardware.SensorEventListener f364901l;

    /* renamed from: q, reason: collision with root package name */
    public int f364906q;

    /* renamed from: r, reason: collision with root package name */
    public int f364907r;

    /* renamed from: a, reason: collision with root package name */
    public final float[] f364890a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f364891b = new float[16];

    /* renamed from: g, reason: collision with root package name */
    public boolean f364896g = false;

    /* renamed from: i, reason: collision with root package name */
    public float f364898i = 35.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f364899j = 35.0f;

    /* renamed from: k, reason: collision with root package name */
    public boolean f364900k = false;

    /* renamed from: m, reason: collision with root package name */
    public float f364902m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    public float f364903n = 0.0f;

    /* renamed from: o, reason: collision with root package name */
    public float f364904o = 1.0f;

    /* renamed from: p, reason: collision with root package name */
    public float f364905p = -1.0f;

    /* renamed from: s, reason: collision with root package name */
    public float f364908s = 0.0f;

    /* renamed from: t, reason: collision with root package name */
    public float f364909t = 0.0f;

    public c(android.content.Context context) {
        float[] fArr = new float[16];
        this.f364892c = fArr;
        float[] fArr2 = new float[16];
        this.f364893d = fArr2;
        float[] fArr3 = new float[16];
        this.f364894e = fArr3;
        float[] fArr4 = new float[16];
        this.f364895f = fArr4;
        this.f364897h = null;
        android.opengl.Matrix.setIdentityM(fArr4, 0);
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        android.opengl.Matrix.frustumM(fArr3, 0, -1.0f, 1.0f, -1.0f, 1.0f, 1.4f, 500.0f);
        this.f364897h = new android.view.GestureDetector(context, new qn0.a(this));
    }

    public static float a(float f17, float f18, float f19, float f27) {
        return (float) java.lang.Math.sqrt(java.lang.Math.pow(f17 - f19, 2.0d) + java.lang.Math.pow(f18 - f27, 2.0d));
    }
}
