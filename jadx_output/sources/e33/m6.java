package e33;

/* loaded from: classes10.dex */
public final class m6 extends android.graphics.drawable.Drawable {

    /* renamed from: o, reason: collision with root package name */
    public static final android.graphics.Paint f247363o;

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.ImageView f247364a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.Bitmap f247365b;

    /* renamed from: c, reason: collision with root package name */
    public f60.a f247366c;

    /* renamed from: f, reason: collision with root package name */
    public long f247369f;

    /* renamed from: g, reason: collision with root package name */
    public int f247370g;

    /* renamed from: h, reason: collision with root package name */
    public int f247371h;

    /* renamed from: i, reason: collision with root package name */
    public t23.j2 f247372i;

    /* renamed from: j, reason: collision with root package name */
    public long f247373j;

    /* renamed from: k, reason: collision with root package name */
    public final android.graphics.Rect f247374k = new android.graphics.Rect();

    /* renamed from: l, reason: collision with root package name */
    public boolean f247375l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f247376m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f247377n = false;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f247367d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f247368e = "";

    static {
        android.graphics.Paint paint = new android.graphics.Paint();
        f247363o = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
    }

    public m6(android.widget.ImageView imageView) {
        this.f247364a = imageView;
    }

    public static void a(android.widget.ImageView imageView, int i17, java.lang.String str, java.lang.String str2, long j17, int i18, long j18) {
        c(imageView, i17, str, str2, j17, i18, null, null, j18);
    }

    public static void b(android.widget.ImageView imageView, int i17, java.lang.String str, java.lang.String str2, long j17, int i18, f60.a aVar, long j18) {
        c(imageView, i17, str, str2, j17, i18, aVar, null, j18);
    }

    public static void c(android.widget.ImageView imageView, int i17, java.lang.String str, java.lang.String str2, long j17, int i18, f60.a aVar, t23.j2 j2Var, long j18) {
        android.widget.ImageView imageView2;
        android.graphics.Bitmap bitmap;
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        e33.m6 m6Var = drawable instanceof e33.m6 ? (e33.m6) drawable : new e33.m6(imageView);
        if (j2Var == null) {
            m6Var.f247372i = null;
            m6Var.f247375l = false;
        } else if (!j2Var.equals(m6Var.f247372i)) {
            m6Var.f247375l = true;
            m6Var.f247372i = j2Var;
        }
        if (m6Var.f247371h != i18) {
            m6Var.f247376m = true;
            m6Var.f247371h = i18;
        }
        if (m6Var.f247373j != j18) {
            m6Var.f247377n = true;
            m6Var.f247373j = j18;
        }
        m6Var.f247366c = aVar;
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.t8.K0(str) ? str2 : str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ThumbDrawable", "filepath is null or nil");
        } else if (!m6Var.f247367d.equals(str3) || (bitmap = m6Var.f247365b) == null || bitmap.isRecycled() || m6Var.f247375l || m6Var.f247376m || m6Var.f247377n) {
            t23.j2 j2Var2 = m6Var.f247372i;
            if (j2Var2 != null) {
                j2Var2.toString();
            }
            if (m6Var.f247375l) {
                m6Var.f247375l = false;
            }
            m6Var.f247367d.equals(str3);
            if (m6Var.f247376m) {
                m6Var.f247376m = false;
            }
            if (m6Var.f247377n) {
                m6Var.f247377n = false;
            }
            m6Var.f247367d = str3;
            m6Var.f247368e = str2;
            m6Var.f247369f = j17;
            m6Var.f247370g = i17;
            android.graphics.Bitmap g17 = t23.p0.h().g(m6Var.f247367d, m6Var.f247368e, m6Var.f247369f, m6Var.f247372i, m6Var.f247373j);
            m6Var.f247365b = g17;
            if (g17 != null) {
                g17.isRecycled();
            }
            android.graphics.Bitmap bitmap2 = m6Var.f247365b;
            android.widget.ImageView imageView3 = m6Var.f247364a;
            if (bitmap2 == null || bitmap2.isRecycled()) {
                t23.p0.h().a(new e33.l6(imageView3, j33.d0.d(m6Var.f247367d, m6Var.f247372i, m6Var.f247371h)));
                imageView2 = imageView3;
                android.graphics.Bitmap f17 = t23.p0.h().f(m6Var.f247367d, i17, str2, j17, m6Var.f247372i, m6Var.f247371h, m6Var.f247373j);
                m6Var.f247365b = f17;
                if (f17 != null) {
                    f17.isRecycled();
                }
            } else {
                android.graphics.Bitmap bitmap3 = m6Var.f247365b;
                if (bitmap3 != null) {
                    bitmap3.isRecycled();
                }
                imageView2 = imageView3;
            }
            android.graphics.Bitmap bitmap4 = m6Var.f247365b;
            if (bitmap4 != null && !bitmap4.isRecycled()) {
                imageView2.invalidate();
            }
        } else {
            android.graphics.Bitmap bitmap5 = m6Var.f247365b;
            if (bitmap5 != null) {
                bitmap5.isRecycled();
            }
        }
        imageView.setImageDrawable(m6Var);
    }

    public static void d(android.widget.ImageView imageView, int i17, java.lang.String str, java.lang.String str2, long j17, f60.a aVar, long j18) {
        c(imageView, i17, str, str2, j17, -1, aVar, null, j18);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmap = this.f247365b;
        if (bitmap == null || bitmap.isRecycled()) {
            t23.p0.h().a(new e33.l6(this.f247364a, j33.d0.d(this.f247367d, this.f247372i, this.f247371h)));
            android.graphics.Bitmap f17 = t23.p0.h().f(this.f247367d, this.f247370g, this.f247368e, this.f247369f, this.f247372i, this.f247371h, this.f247373j);
            this.f247365b = f17;
            if (f17 != null) {
                f17.isRecycled();
            }
        }
        android.graphics.Bitmap bitmap2 = this.f247365b;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        f60.a aVar = this.f247366c;
        if (aVar != null) {
            aVar.a();
            this.f247366c = null;
        }
        android.graphics.Bitmap bitmap3 = this.f247365b;
        int width = bitmap3.getWidth();
        int height = bitmap3.getHeight();
        android.graphics.Rect rect = this.f247374k;
        if (width > height) {
            rect.top = 0;
            rect.bottom = bitmap3.getHeight();
            int width2 = (bitmap3.getWidth() - bitmap3.getHeight()) >> 1;
            rect.left = width2;
            rect.right = width2 + bitmap3.getHeight();
        } else {
            rect.left = 0;
            rect.right = bitmap3.getWidth();
            int height2 = (bitmap3.getHeight() - bitmap3.getWidth()) >> 1;
            rect.top = height2;
            rect.bottom = height2 + bitmap3.getWidth();
        }
        canvas.drawBitmap(this.f247365b, rect, getBounds(), f247363o);
        getBounds().toString();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return 400;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return 400;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i17, int i18, int i19, int i27) {
        super.setBounds(i17, i18, i19, i27);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(android.graphics.Rect rect) {
        rect.toString();
        super.setBounds(rect);
    }
}
