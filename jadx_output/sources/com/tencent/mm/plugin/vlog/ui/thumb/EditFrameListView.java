package com.tencent.mm.plugin.vlog.ui.thumb;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"B\u001b\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b!\u0010#R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u0011\u0010\u001b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006¨\u0006$"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/thumb/EditFrameListView;", "Landroid/view/View;", "", "z", "I", "getMinWidth", "()I", "setMinWidth", "(I)V", "minWidth", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getShowWidth", "setShowWidth", "showWidth", "B", "getTotalWidth", "setTotalWidth", "totalWidth", "C", "getFrameWidth", "setFrameWidth", "frameWidth", "D", "getTotalFrameWidth", "setTotalFrameWidth", "totalFrameWidth", "getValidWidth", "validWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class EditFrameListView extends android.view.View {

    /* renamed from: A, reason: from kotlin metadata */
    public int showWidth;

    /* renamed from: B, reason: from kotlin metadata */
    public int totalWidth;

    /* renamed from: C, reason: from kotlin metadata */
    public int frameWidth;

    /* renamed from: D, reason: from kotlin metadata */
    public int totalFrameWidth;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f175981d;

    /* renamed from: e, reason: collision with root package name */
    public kp4.c1 f175982e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f175983f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f175984g;

    /* renamed from: h, reason: collision with root package name */
    public float f175985h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f175986i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.RectF f175987m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f175988n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f175989o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f175990p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f175991q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Path f175992r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.RectF f175993s;

    /* renamed from: t, reason: collision with root package name */
    public final float f175994t;

    /* renamed from: u, reason: collision with root package name */
    public final float f175995u;

    /* renamed from: v, reason: collision with root package name */
    public rm5.k f175996v;

    /* renamed from: w, reason: collision with root package name */
    public final long f175997w;

    /* renamed from: x, reason: collision with root package name */
    public int f175998x;

    /* renamed from: y, reason: collision with root package name */
    public int f175999y;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public int minWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditFrameListView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f175981d = paint;
        this.f175983f = new java.util.LinkedList();
        this.f175985h = 1.0f;
        this.f175986i = new android.graphics.Rect();
        this.f175987m = new android.graphics.RectF();
        this.f175992r = new android.graphics.Path();
        this.f175993s = new android.graphics.RectF();
        this.f175994t = i65.a.b(context, 4);
        this.f175995u = i65.a.b(context, 4);
        this.f175997w = 3000L;
        paint.setColor(-65536);
        paint.setAntiAlias(true);
    }

    public final void a(kp4.c1 info, int i17, boolean z17, boolean z18) {
        float f17;
        long d17;
        java.util.LinkedList<kp4.m> linkedList;
        kotlin.jvm.internal.o.g(info, "info");
        this.f175982e = info;
        java.util.LinkedList linkedList2 = this.f175983f;
        linkedList2.clear();
        kp4.c1 c1Var = this.f175982e;
        if (c1Var != null && (linkedList = c1Var.f311077g) != null) {
            for (kp4.m mVar : linkedList) {
                linkedList2.add(null);
            }
        }
        int i18 = info.f311071a;
        android.graphics.Rect rect = this.f175986i;
        rect.right = i18;
        int i19 = info.f311072b;
        rect.bottom = i19;
        float f18 = i17;
        float f19 = (1.0f * f18) / i19;
        this.f175985h = f19;
        android.graphics.RectF rectF = this.f175987m;
        rectF.bottom = f18;
        float f27 = f19 * i18;
        rectF.right = f27;
        this.totalFrameWidth = (int) (f27 * info.f311076f);
        float d18 = ((float) this.f175997w) / ((float) info.d());
        int i27 = this.totalFrameWidth;
        this.minWidth = (int) (d18 * i27);
        if (info.f311083m) {
            f17 = i27 * ((float) info.f311075e);
            d17 = info.d();
        } else if (info.f311082l) {
            f17 = i27 * ((float) (info.d() - info.f311074d));
            d17 = info.d();
        } else {
            f17 = i27 * ((float) (info.f311075e - info.f311074d));
            d17 = info.d();
        }
        this.frameWidth = (int) (f17 / ((float) d17));
        this.f175998x = z17 ? i65.a.b(getContext(), 8) : i65.a.b(getContext(), 4);
        int b17 = z18 ? i65.a.b(getContext(), 8) : i65.a.b(getContext(), 4);
        this.f175999y = b17;
        int i28 = this.frameWidth;
        int i29 = this.f175998x;
        this.showWidth = i28 + i29 + b17;
        this.totalWidth = this.totalFrameWidth + i29 + b17;
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new kp4.l(this, null), 2, null);
    }

    public final int getFrameWidth() {
        return this.frameWidth;
    }

    public final int getMinWidth() {
        return this.minWidth;
    }

    public final int getShowWidth() {
        return this.showWidth;
    }

    public final int getTotalFrameWidth() {
        return this.totalFrameWidth;
    }

    public final int getTotalWidth() {
        return this.totalWidth;
    }

    public final int getValidWidth() {
        float f17 = this.totalFrameWidth;
        kp4.c1 c1Var = this.f175982e;
        kotlin.jvm.internal.o.d(c1Var);
        float f18 = f17 * ((float) (c1Var.f311075e - c1Var.f311074d));
        kp4.c1 c1Var2 = this.f175982e;
        kotlin.jvm.internal.o.d(c1Var2);
        return ((int) (f18 / ((float) c1Var2.d()))) + this.f175998x + this.f175999y;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditFrameListView", "onDraw: " + this + ", width:" + getWidth() + ", showWidth:" + this.showWidth + ", track:" + this.f175982e);
        canvas.translate((float) this.f175998x, 0.0f);
        canvas.save();
        canvas.clipPath(this.f175992r);
        kp4.c1 c1Var = this.f175982e;
        if (c1Var != null && !c1Var.f311083m) {
            canvas.translate(((-((float) c1Var.f311074d)) / ((float) c1Var.d())) * this.totalFrameWidth, 0.0f);
        }
        for (android.graphics.Bitmap bitmap : this.f175983f) {
            android.graphics.Paint paint = this.f175981d;
            android.graphics.Rect rect = this.f175986i;
            android.graphics.RectF rectF = this.f175987m;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, rect, rectF, paint);
            } else {
                android.graphics.Bitmap bitmap2 = this.f175984g;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, rect, rectF, paint);
                }
            }
            canvas.translate(rectF.right, 0.0f);
        }
        canvas.restore();
        android.graphics.drawable.Drawable background = getBackground();
        if (background != null) {
            android.graphics.RectF rectF2 = this.f175993s;
            background.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            background.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int defaultSize = android.view.View.getDefaultSize(getSuggestedMinimumHeight(), i18);
        boolean z17 = this.f175988n;
        float f17 = this.f175995u;
        android.graphics.RectF rectF = this.f175993s;
        if (z17) {
            rectF.left = 0.0f;
        } else {
            rectF.left = f17;
        }
        if (this.f175989o) {
            rectF.right = this.frameWidth;
        } else {
            rectF.right = this.frameWidth - f17;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMeasure: ");
        sb6.append(this.f175988n);
        sb6.append(' ');
        sb6.append(this.f175989o);
        sb6.append(", ");
        sb6.append(getWidth());
        sb6.append(' ');
        sb6.append(defaultSize);
        sb6.append(", thumbScale:");
        sb6.append(this.f175985h);
        sb6.append(", trackInfo.width:");
        kp4.c1 c1Var = this.f175982e;
        sb6.append(c1Var != null ? java.lang.Integer.valueOf(c1Var.f311071a) : null);
        sb6.append(", thumbDrawRect.right:");
        sb6.append(this.f175987m.right);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditFrameListView", sb6.toString());
        rectF.bottom = defaultSize;
        android.graphics.Path path = this.f175992r;
        path.reset();
        boolean z18 = this.f175990p;
        float f18 = this.f175994t;
        float f19 = z18 ? 0.0f : f18;
        float f27 = this.f175991q ? 0.0f : f18;
        path.addRoundRect(rectF, new float[]{f19, f19, f27, f27, f27, f27, f19, f19}, android.graphics.Path.Direction.CW);
        super.onMeasure(i17, i18);
    }

    public final void setFrameWidth(int i17) {
        this.frameWidth = i17;
    }

    public final void setMinWidth(int i17) {
        this.minWidth = i17;
    }

    public final void setShowWidth(int i17) {
        this.showWidth = i17;
    }

    public final void setTotalFrameWidth(int i17) {
        this.totalFrameWidth = i17;
    }

    public final void setTotalWidth(int i17) {
        this.totalWidth = i17;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EditFrameListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
