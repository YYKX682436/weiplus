package m95;

/* loaded from: classes13.dex */
public abstract class b extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final int f325078a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f325079b = new android.graphics.Rect();

    /* renamed from: c, reason: collision with root package name */
    public boolean f325080c = false;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f325081d = new android.graphics.Paint();

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.ColorFilter f325082e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f325083f;

    /* renamed from: g, reason: collision with root package name */
    public final int f325084g;

    /* renamed from: h, reason: collision with root package name */
    public final int f325085h;

    public b(int i17, int i18, float f17, int i19) {
        this.f325078a = 0;
        this.f325084g = 0;
        this.f325085h = 0;
        this.f325084g = i17;
        this.f325085h = i18;
        setLevel(10000);
        this.f325078a = i19;
    }

    public void a(android.graphics.Canvas canvas) {
        if (n95.b.f335929d) {
            int height = this.f325079b.height() / 3;
            canvas.save();
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setColor(-12303292);
            paint.setAlpha(127);
            float f17 = height;
            paint.setTextSize(f17);
            paint.setStrokeWidth(1.0f);
            canvas.translate(r0.width() - paint.measureText("SVG"), (r0.height() * 2) / 3);
            canvas.drawText("SVG", 0.0f, f17, paint);
            canvas.restore();
        }
    }

    public synchronized android.view.View b() {
        java.lang.ref.WeakReference weakReference = this.f325083f;
        if (weakReference == null) {
            return null;
        }
        return (android.view.View) weakReference.get();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f325085h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f325084g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        android.view.View b17 = b();
        if (b17 != null && b17.getAlpha() < 1.0f) {
            return -3;
        }
        android.graphics.Paint paint = this.f325081d;
        return (paint == null || paint.getAlpha() >= 255) ? 0 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        this.f325080c = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i17) {
        android.view.View b17 = m95.a.b(this);
        synchronized (this) {
            this.f325083f = new java.lang.ref.WeakReference(b17);
        }
        if (b17 != null) {
            android.graphics.ColorFilter colorFilter = this.f325082e;
            if (colorFilter != null) {
                setColorFilter(colorFilter);
            }
            m95.a.h(b17, this.f325081d);
        }
        return super.onLevelChange(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        android.graphics.Paint paint = this.f325081d;
        paint.setAlpha(i17);
        android.view.View b17 = b();
        if (b17 != null) {
            try {
                b17.setLayerPaint(paint);
            } catch (java.lang.NoSuchMethodError e17) {
                n95.d.c("MicroMsg.SVGDrawable", e17, "samsung", new java.lang.Object[0]);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        android.graphics.Paint paint = this.f325081d;
        paint.setColorFilter(colorFilter);
        android.view.View b17 = b();
        if (b17 == null) {
            if (b17 == null) {
                this.f325082e = colorFilter;
            }
        } else {
            try {
                b17.setLayerPaint(paint);
            } catch (java.lang.NoSuchMethodError e17) {
                n95.d.c("MicroMsg.SVGDrawable", e17, "samsung", new java.lang.Object[0]);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z17, boolean z18) {
        android.view.View b17 = m95.a.b(this);
        synchronized (this) {
            this.f325083f = new java.lang.ref.WeakReference(b17);
        }
        if (b17 != null) {
            android.graphics.ColorFilter colorFilter = this.f325082e;
            if (colorFilter != null) {
                setColorFilter(colorFilter);
            }
            m95.a.h(b17, this.f325081d);
        }
        return super.setVisible(z17, z18);
    }
}
