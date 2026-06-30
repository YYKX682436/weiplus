package fx2;

/* loaded from: classes8.dex */
public final class f extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f267126a;

    /* renamed from: b, reason: collision with root package name */
    public final int f267127b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f267128c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f267129d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f267130e;

    /* renamed from: f, reason: collision with root package name */
    public int f267131f;

    /* renamed from: g, reason: collision with root package name */
    public mn2.f1 f267132g;

    public f(java.lang.String url, int i17, android.view.View view) {
        kotlin.jvm.internal.o.g(url, "url");
        this.f267126a = url;
        this.f267127b = i17;
        this.f267128c = "Finder.UrlBitmapDrawable";
        this.f267129d = new java.lang.ref.WeakReference(view);
        this.f267131f = 255;
        if (view != null) {
            view.setTag(i17, url);
        }
        this.f267132g = mn2.f1.f329965s;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.graphics.Bitmap bitmap = this.f267130e;
        java.lang.ref.WeakReference weakReference = this.f267129d;
        java.lang.String str = this.f267128c;
        java.lang.String str2 = this.f267126a;
        if (bitmap != null) {
            android.graphics.Rect bounds = getBounds();
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setAlpha(this.f267131f);
            canvas.drawBitmap(bitmap, (android.graphics.Rect) null, bounds, paint);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("draw, view:");
            android.view.View view = (android.view.View) weakReference.get();
            sb6.append(view != null ? java.lang.Integer.valueOf(view.hashCode()) : null);
            sb6.append(", drawableAlpha=");
            sb6.append(this.f267131f);
            sb6.append(" rect:");
            sb6.append(getBounds());
            sb6.append(", ");
            sb6.append(str2);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("start load, view:");
            android.view.View view2 = (android.view.View) weakReference.get();
            sb7.append(view2 != null ? java.lang.Integer.valueOf(view2.hashCode()) : null);
            sb7.append(", ");
            sb7.append(str2);
            com.tencent.mars.xlog.Log.i(str, sb7.toString());
            mn2.g1 g1Var = mn2.g1.f329975a;
            wo0.c b17 = g1Var.e().b(new mn2.q3(str2, com.tencent.mm.plugin.finder.storage.y90.f128355e), g1Var.h(this.f267132g));
            fx2.e eVar = new fx2.e(this, this);
            b17.getClass();
            b17.f447873d = eVar;
            b17.a();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
