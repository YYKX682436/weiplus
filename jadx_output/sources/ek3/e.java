package ek3;

/* loaded from: classes10.dex */
public final class e extends android.view.View {

    /* renamed from: u, reason: collision with root package name */
    public static final int f253609u = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f253610d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f253611e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f253612f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Paint f253613g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Path f253614h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Rect f253615i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Rect f253616m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.RectF f253617n;

    /* renamed from: o, reason: collision with root package name */
    public int f253618o;

    /* renamed from: p, reason: collision with root package name */
    public int f253619p;

    /* renamed from: q, reason: collision with root package name */
    public int f253620q;

    /* renamed from: r, reason: collision with root package name */
    public float f253621r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f253622s;

    /* renamed from: t, reason: collision with root package name */
    public final float[] f253623t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context, android.graphics.Bitmap contentBitmap) {
        super(context);
        kotlin.jvm.internal.o.g(contentBitmap, "contentBitmap");
        this.f253622s = true;
        int i17 = f253609u;
        this.f253623t = new float[]{0.0f, 0.0f, 0.0f, 0.0f, i17, i17, i17, i17};
        this.f253612f = new android.graphics.Paint();
        this.f253614h = new android.graphics.Path();
        this.f253613g = new android.graphics.Paint();
        android.graphics.PorterDuffXfermode porterDuffXfermode = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN);
        android.graphics.Paint paint = this.f253613g;
        if (paint == null) {
            kotlin.jvm.internal.o.o("mMaskPaint");
            throw null;
        }
        paint.setXfermode(porterDuffXfermode);
        this.f253610d = contentBitmap;
        this.f253618o = (int) (contentBitmap.getWidth() * 1.0f);
        this.f253619p = (int) (contentBitmap.getHeight() * 1.0f);
        this.f253615i = new android.graphics.Rect(0, 0, contentBitmap.getWidth(), contentBitmap.getHeight());
        this.f253616m = new android.graphics.Rect(0, 0, this.f253618o, this.f253619p);
        android.graphics.RectF rectF = new android.graphics.RectF();
        this.f253617n = rectF;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = this.f253618o;
        rectF.bottom = this.f253619p;
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{android.graphics.Color.argb(230, 0, 0, 0), android.graphics.Color.argb(76, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0)});
        this.f253611e = gradientDrawable;
        gradientDrawable.setGradientType(0);
        android.graphics.drawable.GradientDrawable gradientDrawable2 = this.f253611e;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setGradientCenter(0.5f, 0.4f);
        }
        android.graphics.drawable.GradientDrawable gradientDrawable3 = this.f253611e;
        if (gradientDrawable3 != null) {
            android.graphics.Rect rect = this.f253616m;
            if (rect == null) {
                kotlin.jvm.internal.o.o("mDstRect");
                throw null;
            }
            gradientDrawable3.setBounds(rect);
        }
        java.lang.String format = java.lang.String.format("default init: mWidth:%d mHeight:%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(this.f253618o), java.lang.Integer.valueOf(this.f253619p)}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.TransformSwipeBackToMultiTaskView", format);
    }

    public final void a(float f17, float f18, float f19, float f27) {
        android.graphics.RectF rectF = this.f253617n;
        if (rectF != null) {
            rectF.set(f17, f18, f19, f27);
        } else {
            kotlin.jvm.internal.o.o("mMaskRect");
            throw null;
        }
    }

    public final void b(float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38) {
        float[] fArr = this.f253623t;
        fArr[0] = f17;
        fArr[1] = f18;
        fArr[2] = f19;
        fArr[3] = f27;
        fArr[4] = f28;
        fArr[5] = f29;
        fArr[6] = f37;
        fArr[7] = f38;
    }

    public final android.graphics.Bitmap getContentBitmap() {
        return this.f253610d;
    }

    public final android.graphics.drawable.GradientDrawable getGradientDrawable() {
        return this.f253611e;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.graphics.drawable.GradientDrawable gradientDrawable;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.graphics.Path path = this.f253614h;
        if (path == null) {
            kotlin.jvm.internal.o.o("mClipPath");
            throw null;
        }
        path.reset();
        android.graphics.Path path2 = this.f253614h;
        if (path2 == null) {
            kotlin.jvm.internal.o.o("mClipPath");
            throw null;
        }
        android.graphics.RectF rectF = this.f253617n;
        if (rectF == null) {
            kotlin.jvm.internal.o.o("mMaskRect");
            throw null;
        }
        path2.addRoundRect(rectF, this.f253623t, android.graphics.Path.Direction.CW);
        android.graphics.Path path3 = this.f253614h;
        if (path3 == null) {
            kotlin.jvm.internal.o.o("mClipPath");
            throw null;
        }
        canvas.clipPath(path3);
        android.graphics.Bitmap bitmap = this.f253610d;
        if (bitmap != null) {
            int save = canvas.save();
            float f17 = this.f253621r;
            android.graphics.RectF rectF2 = this.f253617n;
            if (rectF2 == null) {
                kotlin.jvm.internal.o.o("mMaskRect");
                throw null;
            }
            float centerX = rectF2.centerX();
            android.graphics.RectF rectF3 = this.f253617n;
            if (rectF3 == null) {
                kotlin.jvm.internal.o.o("mMaskRect");
                throw null;
            }
            canvas.rotate(f17, centerX, rectF3.centerY());
            android.graphics.Rect rect = this.f253615i;
            if (rect == null) {
                kotlin.jvm.internal.o.o("mDrawRect");
                throw null;
            }
            android.graphics.Rect rect2 = this.f253616m;
            if (rect2 == null) {
                kotlin.jvm.internal.o.o("mDstRect");
                throw null;
            }
            android.graphics.Paint paint = this.f253612f;
            if (paint == null) {
                kotlin.jvm.internal.o.o("mPaint");
                throw null;
            }
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            if (this.f253622s && (gradientDrawable = this.f253611e) != null) {
                gradientDrawable.setAlpha(this.f253620q);
                gradientDrawable.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(this.f253618o, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.f253619p, 1073741824));
    }

    public final void setGradientOrientation(android.graphics.drawable.GradientDrawable.Orientation orientation) {
        kotlin.jvm.internal.o.g(orientation, "orientation");
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f253611e;
        if (gradientDrawable == null) {
            return;
        }
        gradientDrawable.setOrientation(orientation);
    }

    public final void setMaskAlpha(int i17) {
        this.f253620q = i17;
    }

    public final void setRotate(float f17) {
        this.f253621r = f17;
    }
}
