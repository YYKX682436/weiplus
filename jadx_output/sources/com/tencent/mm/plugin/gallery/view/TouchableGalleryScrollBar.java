package com.tencent.mm.plugin.gallery.view;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-B#\b\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\u0006\u0010.\u001a\u00020\t¢\u0006\u0004\b,\u0010/J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0011\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001b\u0010\u0015\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\u001b\u0010\u001b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\rR\u001b\u0010\u001e\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\u0014R\u001d\u0010\"\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u000b\u001a\u0004\b%\u0010&¨\u00060"}, d2 = {"Lcom/tencent/mm/plugin/gallery/view/TouchableGalleryScrollBar;", "Landroid/view/View;", "Lk33/d;", "Lcom/tencent/mm/ui/q2;", "getCurrentMode", "Landroid/graphics/Bitmap;", "getIndicatorBitmap", "", "getScrollMinOffset", "", "g", "Ljz5/g;", "getNormalWidth", "()I", "normalWidth", "h", "getNormalHeight", "normalHeight", "i", "getNormalRadius", "()F", "normalRadius", "m", "getFocusWidth", "focusWidth", "n", "getFocusHeight", "focusHeight", "o", "getFocusingRadius", "focusingRadius", "s", "getNormalIndicatorBitmap", "()Landroid/graphics/Bitmap;", "normalIndicatorBitmap", "Landroid/graphics/Paint;", "u", "getBitmapPainter", "()Landroid/graphics/Paint;", "bitmapPainter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TouchableGalleryScrollBar extends android.view.View implements k33.d {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f138671d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.q2 f138672e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f138673f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g normalWidth;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g normalHeight;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final jz5.g normalRadius;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final jz5.g focusWidth;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final jz5.g focusHeight;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final jz5.g focusingRadius;

    /* renamed from: p, reason: collision with root package name */
    public float f138680p;

    /* renamed from: q, reason: collision with root package name */
    public float f138681q;

    /* renamed from: r, reason: collision with root package name */
    public final int f138682r;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final jz5.g normalIndicatorBitmap;

    /* renamed from: t, reason: collision with root package name */
    public final int f138684t;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final jz5.g bitmapPainter;

    /* renamed from: v, reason: collision with root package name */
    public boolean f138686v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchableGalleryScrollBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f138671d = "MicroMsg.Gallery.TouchableScrollBar-[" + hashCode() + ']';
        this.f138672e = com.tencent.mm.ui.q2.NORMAL;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f138673f = paint;
        this.normalWidth = jz5.h.b(new k33.z(this));
        this.normalHeight = jz5.h.b(new k33.w(this));
        this.normalRadius = jz5.h.b(new k33.y(this));
        this.focusWidth = jz5.h.b(new k33.u(this));
        this.focusHeight = jz5.h.b(new k33.t(this));
        this.focusingRadius = jz5.h.b(new k33.v(this));
        this.f138680p = getNormalWidth();
        this.f138681q = getNormalHeight();
        int d17 = i65.a.d(getContext(), com.tencent.mm.R.color.UN_BW_97);
        this.f138682r = i65.a.d(getContext(), com.tencent.mm.R.color.UN_BW_0_Alpha_0_9);
        this.normalIndicatorBitmap = jz5.h.b(new k33.x(this));
        this.f138684t = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479671c8);
        this.bitmapPainter = jz5.h.b(new k33.p(this));
        paint.setColor(d17);
        paint.setStyle(android.graphics.Paint.Style.FILL);
    }

    private final android.graphics.Paint getBitmapPainter() {
        return (android.graphics.Paint) this.bitmapPainter.getValue();
    }

    private final int getFocusHeight() {
        return ((java.lang.Number) this.focusHeight.getValue()).intValue();
    }

    private final int getFocusWidth() {
        return ((java.lang.Number) this.focusWidth.getValue()).intValue();
    }

    private final float getFocusingRadius() {
        return ((java.lang.Number) this.focusingRadius.getValue()).floatValue();
    }

    private final int getNormalHeight() {
        return ((java.lang.Number) this.normalHeight.getValue()).intValue();
    }

    private final android.graphics.Bitmap getNormalIndicatorBitmap() {
        return (android.graphics.Bitmap) this.normalIndicatorBitmap.getValue();
    }

    private final float getNormalRadius() {
        return ((java.lang.Number) this.normalRadius.getValue()).floatValue();
    }

    private final int getNormalWidth() {
        return ((java.lang.Number) this.normalWidth.getValue()).intValue();
    }

    public void b(com.tencent.mm.ui.q2 targetMode, long j17, yz5.l lVar, yz5.a aVar) {
        kotlin.jvm.internal.o.g(targetMode, "targetMode");
        com.tencent.mm.ui.q2 q2Var = this.f138672e;
        java.lang.String str = this.f138671d;
        if (q2Var == targetMode) {
            com.tencent.mars.xlog.Log.i(str, "enterTargetModeWithAnim: skip");
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "enterTargetModeWithAnim: curMode=" + this.f138672e.name() + ", newMode=" + targetMode.name());
        android.util.Size d17 = d(this.f138672e);
        android.util.Size d18 = d(targetMode);
        this.f138672e = targetMode;
        this.f138686v = true;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j17);
        ofFloat.addUpdateListener(new k33.q(d17, d18, this, lVar));
        ofFloat.addListener(new k33.s(aVar, this));
        ofFloat.start();
    }

    public float c(int i17, com.tencent.mm.ui.q2 mode) {
        kotlin.jvm.internal.o.g(mode, "mode");
        return i17 - (mode == com.tencent.mm.ui.q2.NORMAL ? getNormalHeight() : getFocusHeight());
    }

    public android.util.Size d(com.tencent.mm.ui.q2 mode) {
        kotlin.jvm.internal.o.g(mode, "mode");
        return mode == com.tencent.mm.ui.q2.NORMAL ? new android.util.Size(getNormalWidth(), getNormalHeight()) : new android.util.Size(getFocusWidth(), getFocusHeight());
    }

    @Override // k33.d
    /* renamed from: getCurrentMode, reason: from getter */
    public com.tencent.mm.ui.q2 getF138672e() {
        return this.f138672e;
    }

    public final android.graphics.Bitmap getIndicatorBitmap() {
        android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.slide_indicator, this.f138682r);
        kotlin.jvm.internal.o.d(e17);
        int intrinsicWidth = e17.getIntrinsicWidth();
        int intrinsicHeight = e17.getIntrinsicHeight();
        android.graphics.Bitmap.Config config = e17.getOpacity() != -1 ? android.graphics.Bitmap.Config.ARGB_8888 : android.graphics.Bitmap.Config.RGB_565;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(intrinsicHeight));
        arrayList.add(java.lang.Integer.valueOf(intrinsicWidth));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/gallery/view/TouchableGalleryScrollBar", "drawable2Bitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/gallery/view/TouchableGalleryScrollBar", "drawable2Bitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        e17.setBounds(0, 0, e17.getIntrinsicWidth(), e17.getIntrinsicHeight());
        e17.draw(canvas);
        int height = createBitmap.getHeight();
        int i17 = this.f138684t;
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(createBitmap, i17, (height * i17) / createBitmap.getWidth(), true);
        kotlin.jvm.internal.o.f(createScaledBitmap, "createScaledBitmap(...)");
        createBitmap.recycle();
        return createScaledBitmap;
    }

    @Override // k33.d
    public float getScrollMinOffset() {
        return 0.0f;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Bitmap normalIndicatorBitmap;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        this.f138672e.name();
        com.tencent.mm.ui.q2 q2Var = this.f138672e;
        if (q2Var != com.tencent.mm.ui.q2.NORMAL) {
            if (q2Var == com.tencent.mm.ui.q2.FULL_SCREEN_FOCUS) {
                float f17 = this.f138680p;
                if (f17 == 0.0f) {
                    return;
                }
                float f18 = this.f138681q;
                if (f18 == 0.0f) {
                    return;
                }
                canvas.drawRoundRect(0.0f, 0.0f, f17, f18, getFocusingRadius(), getFocusingRadius(), this.f138673f);
                return;
            }
            return;
        }
        float f19 = this.f138680p;
        if (!(f19 == 0.0f)) {
            float f27 = this.f138681q;
            if (!(f27 == 0.0f)) {
                canvas.drawRoundRect(0.0f, 0.0f, f19, f27, getNormalRadius(), getNormalRadius(), this.f138673f);
            }
        }
        if (this.f138686v || (normalIndicatorBitmap = getNormalIndicatorBitmap()) == null) {
            return;
        }
        float f28 = 2;
        canvas.drawBitmap(normalIndicatorBitmap, (this.f138680p - normalIndicatorBitmap.getWidth()) / f28, (this.f138681q - normalIndicatorBitmap.getHeight()) / f28, getBitmapPainter());
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchableGalleryScrollBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f138671d = "MicroMsg.Gallery.TouchableScrollBar-[" + hashCode() + ']';
        this.f138672e = com.tencent.mm.ui.q2.NORMAL;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f138673f = paint;
        this.normalWidth = jz5.h.b(new k33.z(this));
        this.normalHeight = jz5.h.b(new k33.w(this));
        this.normalRadius = jz5.h.b(new k33.y(this));
        this.focusWidth = jz5.h.b(new k33.u(this));
        this.focusHeight = jz5.h.b(new k33.t(this));
        this.focusingRadius = jz5.h.b(new k33.v(this));
        this.f138680p = getNormalWidth();
        this.f138681q = getNormalHeight();
        int d17 = i65.a.d(getContext(), com.tencent.mm.R.color.UN_BW_97);
        this.f138682r = i65.a.d(getContext(), com.tencent.mm.R.color.UN_BW_0_Alpha_0_9);
        this.normalIndicatorBitmap = jz5.h.b(new k33.x(this));
        this.f138684t = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479671c8);
        this.bitmapPainter = jz5.h.b(new k33.p(this));
        paint.setColor(d17);
        paint.setStyle(android.graphics.Paint.Style.FILL);
    }
}
