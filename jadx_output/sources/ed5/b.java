package ed5;

/* loaded from: classes5.dex */
public final class b extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f251337a;

    /* renamed from: b, reason: collision with root package name */
    public final int f251338b;

    /* renamed from: c, reason: collision with root package name */
    public final int f251339c;

    /* renamed from: d, reason: collision with root package name */
    public final int f251340d;

    /* renamed from: e, reason: collision with root package name */
    public final int f251341e;

    /* renamed from: f, reason: collision with root package name */
    public final float f251342f;

    /* renamed from: g, reason: collision with root package name */
    public final float f251343g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f251344h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f251345i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.RectF f251346j;

    /* renamed from: k, reason: collision with root package name */
    public float f251347k;

    public b(android.graphics.Bitmap bitmap, int i17, int i18, int i19, int i27, float f17, float f18) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        this.f251337a = bitmap;
        this.f251338b = i17;
        this.f251339c = i18;
        this.f251340d = i19;
        this.f251341e = i27;
        this.f251342f = f17;
        this.f251343g = f18;
        this.f251344h = new android.graphics.Paint(3);
        this.f251345i = new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        this.f251346j = new android.graphics.RectF();
        this.f251347k = 1.0f;
        a();
    }

    public final void a() {
        int i17 = this.f251340d;
        float f17 = this.f251347k;
        float f18 = i17 * f17;
        int i18 = this.f251341e;
        float f19 = i18 * f17;
        float f27 = this.f251338b;
        float f28 = this.f251342f;
        float f29 = f27 + (i17 * f28);
        float f37 = this.f251339c;
        float f38 = this.f251343g;
        float f39 = f29 - (f28 * f18);
        float f47 = (f37 + (i18 * f38)) - (f38 * f19);
        float f48 = f18 + f39;
        float f49 = f19 + f47;
        this.f251346j.set(f39, f47, f48, f49);
        setBounds((int) f39, (int) f47, (int) f48, (int) f49);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.graphics.Bitmap bitmap = this.f251337a;
        if (bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(bitmap, this.f251345i, this.f251346j, this.f251344h);
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
