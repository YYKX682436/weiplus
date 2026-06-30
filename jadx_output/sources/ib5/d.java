package ib5;

/* loaded from: classes13.dex */
public class d implements ib5.f {

    /* renamed from: d, reason: collision with root package name */
    public ib5.e f290251d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Canvas f290252e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f290253f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f290254g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f290255h;

    /* renamed from: l, reason: collision with root package name */
    public boolean f290259l;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.drawable.Drawable f290262o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f290264q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Paint f290265r;

    /* renamed from: s, reason: collision with root package name */
    public int f290266s;

    /* renamed from: a, reason: collision with root package name */
    public float f290248a = 16.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f290249b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f290250c = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f290256i = new android.graphics.Rect();

    /* renamed from: j, reason: collision with root package name */
    public final int[] f290257j = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnPreDrawListener f290258k = new ib5.a(this);

    /* renamed from: m, reason: collision with root package name */
    public boolean f290260m = true;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f290261n = new ib5.b(this);

    /* renamed from: p, reason: collision with root package name */
    public boolean f290263p = true;

    public d(android.view.View view, android.view.ViewGroup viewGroup) {
        boolean z17 = true;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f290265r = paint;
        this.f290255h = viewGroup;
        this.f290254g = view;
        this.f290251d = new ib5.i();
        paint.setFilterBitmap(true);
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (((int) java.lang.Math.ceil(measuredHeight / 8.0f)) != 0 && ((int) java.lang.Math.ceil(measuredWidth / 8.0f)) != 0) {
            z17 = false;
        }
        if (z17) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ib5.c(this));
        } else {
            l(measuredWidth, measuredHeight);
        }
    }

    @Override // ib5.f
    public void a(android.graphics.Canvas canvas) {
        this.f290259l = true;
        if (this.f290260m) {
            android.graphics.drawable.Drawable drawable = this.f290262o;
            if (drawable == null) {
                this.f290253f.eraseColor(0);
            } else {
                drawable.draw(this.f290252e);
            }
            boolean z17 = this.f290264q;
            android.view.ViewGroup viewGroup = this.f290255h;
            if (z17) {
                viewGroup.draw(this.f290252e);
            } else {
                this.f290252e.save();
                m();
                viewGroup.draw(this.f290252e);
                this.f290252e.restore();
            }
            this.f290253f = this.f290251d.b(this.f290253f, this.f290248a);
            canvas.save();
            canvas.scale(this.f290249b * 8.0f, this.f290250c * 8.0f);
            canvas.drawBitmap(this.f290253f, 0.0f, 0.0f, this.f290265r);
            canvas.restore();
        }
    }

    @Override // ib5.f
    public void b(android.graphics.Canvas canvas) {
        this.f290254g.post(this.f290261n);
    }

    @Override // ib5.f
    public void c(ib5.e eVar) {
        this.f290251d = eVar;
    }

    @Override // ib5.f
    public void d(boolean z17) {
        this.f290260m = z17;
        i(z17);
        this.f290254g.invalidate();
    }

    @Override // ib5.f
    public void destroy() {
        i(false);
        this.f290251d.destroy();
        android.graphics.Bitmap bitmap = this.f290253f;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    @Override // ib5.f
    public void e(boolean z17) {
        this.f290263p = z17;
    }

    @Override // ib5.f
    public void f(int i17) {
        this.f290266s = i17;
    }

    @Override // ib5.f
    public void g() {
        android.view.View view = this.f290254g;
        l(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // ib5.f
    public void h(float f17) {
        this.f290248a = f17;
    }

    @Override // ib5.f
    public void i(boolean z17) {
        android.view.View view = this.f290254g;
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        android.view.ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f290258k;
        viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        if (z17) {
            view.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
        }
    }

    @Override // ib5.f
    public void j(android.graphics.drawable.Drawable drawable) {
        this.f290262o = drawable;
    }

    @Override // ib5.f
    public void k(boolean z17) {
        this.f290264q = z17;
    }

    public void l(int i17, int i18) {
        double d17 = i18 / 8.0f;
        boolean z17 = ((int) java.lang.Math.ceil(d17)) == 0 || ((int) java.lang.Math.ceil((double) (((float) i17) / 8.0f))) == 0;
        android.view.View view = this.f290254g;
        if (z17) {
            this.f290260m = false;
            view.setWillNotDraw(true);
            i(false);
            return;
        }
        this.f290260m = true;
        view.setWillNotDraw(false);
        int ceil = (int) java.lang.Math.ceil(i17 / 8.0f);
        int ceil2 = (int) java.lang.Math.ceil(d17);
        int i19 = ceil % 16;
        int i27 = i19 == 0 ? ceil : (ceil - i19) + 16;
        int i28 = ceil2 % 16;
        int i29 = i28 == 0 ? ceil2 : (ceil2 - i28) + 16;
        this.f290250c = ceil2 / i29;
        this.f290249b = ceil / i27;
        android.graphics.Bitmap.Config a17 = this.f290251d.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(a17);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i29));
        arrayList.add(java.lang.Integer.valueOf(i27));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/blur/BlockingBlurController", "allocateBitmap", "(II)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/blur/BlockingBlurController", "allocateBitmap", "(II)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        this.f290253f = createBitmap;
        this.f290252e = new android.graphics.Canvas(this.f290253f);
        i(true);
        if (this.f290264q) {
            m();
        }
    }

    public final void m() {
        android.view.View view = this.f290254g;
        android.graphics.Rect rect = this.f290256i;
        view.getDrawingRect(rect);
        if (this.f290263p) {
            try {
                this.f290255h.offsetDescendantRectToMyCoords(view, rect);
            } catch (java.lang.IllegalArgumentException unused) {
                this.f290263p = false;
            }
        } else {
            int[] iArr = this.f290257j;
            view.getLocationInWindow(iArr);
            rect.offset(iArr[0], iArr[1]);
        }
        rect.offset(0, this.f290266s);
        float f17 = this.f290249b * 8.0f;
        float f18 = this.f290250c * 8.0f;
        this.f290252e.translate(((-rect.left) / f17) - (view.getTranslationX() / f17), ((-rect.top) / f18) - (view.getTranslationY() / f18));
        this.f290252e.scale(1.0f / f17, 1.0f / f18);
    }
}
