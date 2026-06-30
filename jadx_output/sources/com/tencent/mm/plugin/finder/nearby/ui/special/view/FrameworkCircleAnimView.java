package com.tencent.mm.plugin.finder.nearby.ui.special.view;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(B#\b\u0016\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010)\u001a\u00020\u0013¢\u0006\u0004\b'\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001a\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\u0016R\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010!¨\u0006+"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/ui/special/view/FrameworkCircleAnimView;", "Landroid/view/View;", "Landroid/graphics/Bitmap;", "getCircleBitmap", "", "centerY", "Ljz5/f0;", "setCenterY", "Landroid/graphics/PorterDuffXfermode;", "e", "Ljz5/g;", "getSrcInXfermode", "()Landroid/graphics/PorterDuffXfermode;", "srcInXfermode", "Landroid/graphics/Canvas;", "f", "getTmpCanvas", "()Landroid/graphics/Canvas;", "tmpCanvas", "", "n", "getCircleColorLight", "()I", "circleColorLight", "o", "getCircleColorMedium", "circleColorMedium", "p", "getCircleColorFinal", "circleColorFinal", "Landroid/graphics/BlurMaskFilter;", "u", "getBlurMaskFilter", "()Landroid/graphics/BlurMaskFilter;", "blurMaskFilter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FrameworkCircleAnimView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f122116d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g srcInXfermode;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g tmpCanvas;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f122119g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.RadialGradient f122120h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f122121i;

    /* renamed from: m, reason: collision with root package name */
    public float f122122m;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final jz5.g circleColorLight;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final jz5.g circleColorMedium;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final jz5.g circleColorFinal;

    /* renamed from: q, reason: collision with root package name */
    public float f122126q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f122127r;

    /* renamed from: s, reason: collision with root package name */
    public final android.animation.ValueAnimator f122128s;

    /* renamed from: t, reason: collision with root package name */
    public final android.animation.ValueAnimator f122129t;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final jz5.g blurMaskFilter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameworkCircleAnimView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        setLayerType(1, null);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        this.f122116d = paint;
        this.srcInXfermode = jz5.h.b(gr2.i.f274775d);
        this.tmpCanvas = jz5.h.b(gr2.j.f274778d);
        this.f122121i = new java.util.ArrayList();
        this.circleColorLight = jz5.h.b(new gr2.d(this));
        this.circleColorMedium = jz5.h.b(new gr2.e(this));
        this.circleColorFinal = jz5.h.b(new gr2.c(this));
        this.f122128s = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f122129t = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.blurMaskFilter = jz5.h.b(gr2.b.f274752d);
    }

    private final android.graphics.BlurMaskFilter getBlurMaskFilter() {
        return (android.graphics.BlurMaskFilter) this.blurMaskFilter.getValue();
    }

    private final android.graphics.Bitmap getCircleBitmap() {
        android.graphics.Bitmap bitmap = this.f122119g;
        if (bitmap == null) {
            int width = getWidth();
            int height = getHeight();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/ui/special/view/FrameworkCircleAnimView", "getCircleBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/nearby/ui/special/view/FrameworkCircleAnimView", "getCircleBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
            bitmap = createBitmap;
        }
        this.f122119g = bitmap;
        return bitmap;
    }

    private final int getCircleColorFinal() {
        return ((java.lang.Number) this.circleColorFinal.getValue()).intValue();
    }

    private final int getCircleColorLight() {
        return ((java.lang.Number) this.circleColorLight.getValue()).intValue();
    }

    private final int getCircleColorMedium() {
        return ((java.lang.Number) this.circleColorMedium.getValue()).intValue();
    }

    private final android.graphics.PorterDuffXfermode getSrcInXfermode() {
        return (android.graphics.PorterDuffXfermode) this.srcInXfermode.getValue();
    }

    private final android.graphics.Canvas getTmpCanvas() {
        return (android.graphics.Canvas) this.tmpCanvas.getValue();
    }

    public final void a() {
        if (isAttachedToWindow() && this.f122127r) {
            android.animation.ValueAnimator valueAnimator = this.f122128s;
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            android.animation.ValueAnimator valueAnimator2 = this.f122129t;
            valueAnimator2.cancel();
            valueAnimator2.removeAllUpdateListeners();
            valueAnimator2.removeAllListeners();
            setAlpha(1.0f);
            valueAnimator.setDuration(750L);
            valueAnimator.addUpdateListener(new gr2.f(this));
            valueAnimator.start();
            valueAnimator2.setDuration(350L);
            valueAnimator2.addUpdateListener(new gr2.g(this));
            valueAnimator2.addListener(new gr2.h(this));
            valueAnimator2.setStartDelay(750L);
            valueAnimator2.start();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f122119g = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r15) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.nearby.ui.special.view.FrameworkCircleAnimView.onDraw(android.graphics.Canvas):void");
    }

    public final void setCenterY(float f17) {
        boolean z17 = !(f17 == this.f122122m);
        this.f122122m = f17;
        if (z17) {
            java.util.ArrayList arrayList = this.f122121i;
            arrayList.clear();
            arrayList.add(new android.graphics.RadialGradient(0.0f, this.f122122m, (getHeight() - this.f122122m) / 3.0f, new int[]{getCircleColorLight(), 0}, new float[]{0.0f, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
            arrayList.add(new android.graphics.RadialGradient(0.0f, this.f122122m, ((getHeight() - this.f122122m) / 3.0f) * 2.0f, new int[]{getCircleColorMedium(), 0}, new float[]{0.0f, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
            arrayList.add(new android.graphics.RadialGradient(0.0f, this.f122122m, getHeight() - this.f122122m, new int[]{getCircleColorFinal(), 0}, new float[]{0.0f, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
            this.f122120h = (android.graphics.RadialGradient) kz5.n0.a0(arrayList, 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameworkCircleAnimView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        setLayerType(1, null);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        this.f122116d = paint;
        this.srcInXfermode = jz5.h.b(gr2.i.f274775d);
        this.tmpCanvas = jz5.h.b(gr2.j.f274778d);
        this.f122121i = new java.util.ArrayList();
        this.circleColorLight = jz5.h.b(new gr2.d(this));
        this.circleColorMedium = jz5.h.b(new gr2.e(this));
        this.circleColorFinal = jz5.h.b(new gr2.c(this));
        this.f122128s = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f122129t = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.blurMaskFilter = jz5.h.b(gr2.b.f274752d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameworkCircleAnimView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        setLayerType(1, null);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        this.f122116d = paint;
        this.srcInXfermode = jz5.h.b(gr2.i.f274775d);
        this.tmpCanvas = jz5.h.b(gr2.j.f274778d);
        this.f122121i = new java.util.ArrayList();
        this.circleColorLight = jz5.h.b(new gr2.d(this));
        this.circleColorMedium = jz5.h.b(new gr2.e(this));
        this.circleColorFinal = jz5.h.b(new gr2.c(this));
        this.f122128s = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f122129t = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.blurMaskFilter = jz5.h.b(gr2.b.f274752d);
    }
}
