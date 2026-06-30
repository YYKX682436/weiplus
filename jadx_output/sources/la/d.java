package la;

/* loaded from: classes15.dex */
public class d extends la.f {

    /* renamed from: h, reason: collision with root package name */
    public static final android.graphics.RectF f317442h = new android.graphics.RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f317443b;

    /* renamed from: c, reason: collision with root package name */
    public final float f317444c;

    /* renamed from: d, reason: collision with root package name */
    public final float f317445d;

    /* renamed from: e, reason: collision with root package name */
    public final float f317446e;

    /* renamed from: f, reason: collision with root package name */
    public float f317447f;

    /* renamed from: g, reason: collision with root package name */
    public float f317448g;

    public d(float f17, float f18, float f19, float f27) {
        this.f317443b = f17;
        this.f317444c = f18;
        this.f317445d = f19;
        this.f317446e = f27;
    }

    @Override // la.f
    public void a(android.graphics.Matrix matrix, android.graphics.Path path) {
        android.graphics.Matrix matrix2 = this.f317451a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        android.graphics.RectF rectF = f317442h;
        rectF.set(this.f317443b, this.f317444c, this.f317445d, this.f317446e);
        path.arcTo(rectF, this.f317447f, this.f317448g, false);
        path.transform(matrix);
    }
}
