package ny;

/* loaded from: classes3.dex */
public final class g extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f341376d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f341377e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f341378f;

    /* renamed from: g, reason: collision with root package name */
    public float f341379g;

    /* renamed from: h, reason: collision with root package name */
    public final float f341380h;

    /* renamed from: i, reason: collision with root package name */
    public final float f341381i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, android.graphics.Bitmap bitmap) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f341376d = bitmap;
        this.f341377e = new android.graphics.Paint(3);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(-16777216);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f341378f = paint;
        this.f341380h = 8.0f;
        this.f341381i = 16.0f;
    }

    private final float getShadowBlurRadius() {
        return i65.a.b(getContext(), (int) this.f341381i);
    }

    private final float getShadowOffset() {
        return i65.a.b(getContext(), (int) this.f341380h);
    }

    public final float getShadowAlpha() {
        return this.f341379g;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Bitmap bitmap = this.f341376d;
        if (bitmap == null) {
            return;
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f341377e);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        android.graphics.Bitmap bitmap = this.f341376d;
        if (bitmap == null || bitmap.isRecycled()) {
            super.onMeasure(i17, i18);
        } else {
            setMeasuredDimension(bitmap.getWidth(), bitmap.getHeight());
        }
    }

    public final void setShadowAlpha(float f17) {
        float e17 = e06.p.e(f17, 0.0f, 1.0f);
        this.f341379g = e17;
        this.f341378f.setAlpha((int) (e17 * 40));
        invalidate();
    }
}
