package ed5;

/* loaded from: classes5.dex */
public final class c extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ed5.b f251348a;

    /* renamed from: b, reason: collision with root package name */
    public float f251349b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f251350c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f251351d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Path f251352e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.RectF f251353f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.RectF f251354g;

    /* renamed from: h, reason: collision with root package name */
    public final float f251355h;

    public c(ed5.b mirror) {
        kotlin.jvm.internal.o.g(mirror, "mirror");
        this.f251348a = mirror;
        this.f251351d = new android.graphics.Paint(1);
        this.f251352e = new android.graphics.Path();
        this.f251353f = new android.graphics.RectF();
        this.f251354g = new android.graphics.RectF();
        this.f251355h = 0.4f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.graphics.RectF out = this.f251353f;
        ed5.b bVar = this.f251348a;
        bVar.getClass();
        kotlin.jvm.internal.o.g(out, "out");
        out.set(bVar.f251346j);
        if (out.width() <= 0.0f || out.height() <= 0.0f) {
            return;
        }
        setBounds((int) out.left, (int) out.top, (int) out.right, (int) out.bottom);
        float width = out.width();
        float height = out.height();
        canvas.save();
        android.graphics.Path path = this.f251352e;
        path.reset();
        android.graphics.RectF rectF = this.f251354g;
        rectF.set(out);
        path.addRect(rectF, android.graphics.Path.Direction.CW);
        canvas.clipPath(path);
        float sqrt = (float) java.lang.Math.sqrt((width * width) + (height * height));
        float f17 = this.f251355h * sqrt;
        float f18 = this.f251349b * (sqrt + f17);
        float f19 = f17 / 2.0f;
        float f27 = (f18 - f19) * 0.7071f;
        float f28 = out.left + f27;
        float f29 = out.top + f27;
        float f37 = f19 * 0.7071f;
        float f38 = f29 + f37;
        android.graphics.Paint paint = this.f251351d;
        paint.setShader(new android.graphics.LinearGradient(f28 - f37, f29 - f37, f28 + f37, f38, new int[]{16777215, 1728053247, 16777215}, new float[]{0.0f, 0.475f, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
