package fx2;

/* loaded from: classes8.dex */
public final class c extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f267116a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f267117b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Bitmap f267118c;

    /* renamed from: d, reason: collision with root package name */
    public final int f267119d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.ColorFilter f267120e;

    /* renamed from: f, reason: collision with root package name */
    public final mn2.f1 f267121f;

    public c(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        this.f267116a = url;
        this.f267117b = "Finder.UrlBitmapDrawable";
        this.f267119d = 255;
        this.f267121f = mn2.f1.f329965s;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.graphics.Bitmap bitmap = this.f267118c;
        java.lang.String str = this.f267117b;
        jz5.f0 f0Var = null;
        java.lang.String str2 = this.f267116a;
        if (bitmap != null) {
            android.graphics.Rect bounds = getBounds();
            android.graphics.Paint paint = new android.graphics.Paint();
            int i17 = this.f267119d;
            paint.setAlpha(i17);
            android.graphics.ColorFilter colorFilter = this.f267120e;
            if (colorFilter != null) {
                paint.setColorFilter(colorFilter);
            }
            canvas.drawBitmap(bitmap, (android.graphics.Rect) null, bounds, paint);
            com.tencent.mars.xlog.Log.i(str, "draw, drawableAlpha=" + i17 + " rect:" + getBounds() + ", " + str2);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i(str, "start load, " + str2);
            mn2.g1 g1Var = mn2.g1.f329975a;
            wo0.c b17 = g1Var.e().b(new mn2.q3(str2, com.tencent.mm.plugin.finder.storage.y90.f128355e), g1Var.h(this.f267121f));
            fx2.b bVar = new fx2.b(this, this);
            b17.getClass();
            b17.f447873d = bVar;
            b17.a();
        }
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof fx2.c) && kotlin.jvm.internal.o.b(((fx2.c) obj).f267116a, this.f267116a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    public int hashCode() {
        return this.f267116a.hashCode();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f267120e = colorFilter;
        invalidateSelf();
    }
}
