package cw3;

/* loaded from: classes10.dex */
public final class a extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final float f224149a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f224150b;

    /* renamed from: c, reason: collision with root package name */
    public final float f224151c;

    /* renamed from: d, reason: collision with root package name */
    public final float f224152d;

    public a(android.content.res.Resources resources) {
        kotlin.jvm.internal.o.g(resources, "resources");
        this.f224149a = 2.0f;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f224150b = paint;
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(resources.getDimension(com.tencent.mm.R.dimen.f480334uv));
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f224151c = resources.getDimension(com.tencent.mm.R.dimen.f480334uv);
        this.f224152d = resources.getDimension(com.tencent.mm.R.dimen.f480332ut);
        resources.getDimension(com.tencent.mm.R.dimen.f480333uu);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        float f17 = getBounds().left;
        float f18 = this.f224152d;
        float f19 = this.f224149a;
        float f27 = f17 - (f18 / f19);
        float f28 = getBounds().top - (f18 / f19);
        float f29 = getBounds().right + (f18 / f19);
        float f37 = getBounds().bottom + (f18 / f19);
        android.graphics.Paint paint = this.f224150b;
        paint.setStrokeWidth(this.f224151c / f19);
        paint.setAntiAlias(true);
        canvas.drawLines(new float[]{f27, f28, f29, f28, f29, f28, f29, f37, f29, f37, f27, f37, f27, f37, f27, f28}, paint);
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
