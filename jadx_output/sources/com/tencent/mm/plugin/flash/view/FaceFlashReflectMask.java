package com.tencent.mm.plugin.flash.view;

/* loaded from: classes14.dex */
public class FaceFlashReflectMask extends com.tencent.youtu.ytagreflectlivecheck.ui.YTReflectLayout {

    /* renamed from: q, reason: collision with root package name */
    public static float f137256q = 0.386f;

    /* renamed from: r, reason: collision with root package name */
    public static final int f137257r = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479646bl);

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f137258d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f137259e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.ColorMatrixColorFilter f137260f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.PorterDuffXfermode f137261g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f137262h;

    /* renamed from: i, reason: collision with root package name */
    public float f137263i;

    /* renamed from: m, reason: collision with root package name */
    public yz2.a f137264m;

    /* renamed from: n, reason: collision with root package name */
    public float f137265n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f137266o;

    /* renamed from: p, reason: collision with root package name */
    public float f137267p;

    public FaceFlashReflectMask(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f137262h = new android.graphics.Rect();
        this.f137263i = 0.0f;
        this.f137265n = 0.0f;
        this.f137267p = 0.0f;
        setLayerType(1, null);
        float Di = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.d0.clicfg_face_flash_preview_ratio, 0.386f);
        if (Di > 0.1d) {
            f137256q = Di;
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectMask", "FACE_FLASH_CIRCLE_RADIUS set value:%f", java.lang.Float.valueOf(Di));
        }
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f137258d = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f137259e = paint2;
        paint2.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.a9e));
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.f137266o = paint3;
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        paint3.setStrokeWidth(f137257r);
        paint3.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_8));
        setWillNotDraw(false);
        this.f137261g = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR);
    }

    public float getCircleMarginY() {
        return this.f137267p;
    }

    public float getCircleY() {
        return this.f137263i;
    }

    @Override // com.tencent.youtu.ytagreflectlivecheck.ui.YTReflectLayout, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        canvas.save();
        float min = java.lang.Math.min(getWidth(), getHeight()) * f137256q;
        float width = (float) (getWidth() * 0.5d);
        float f17 = this.f137267p;
        if (f17 != 0.0f) {
            this.f137263i = f17 + min;
        } else {
            this.f137263i = i65.a.h(getContext(), com.tencent.mm.R.dimen.f480396wr) + min;
        }
        android.graphics.Rect rect = this.f137262h;
        rect.left = 0;
        rect.right = getWidth();
        rect.top = 0;
        rect.bottom = getHeight();
        android.graphics.Paint paint = this.f137258d;
        paint.setColor(-1);
        android.graphics.ColorMatrixColorFilter colorMatrixColorFilter = this.f137260f;
        if (colorMatrixColorFilter != null) {
            paint.setColorFilter(colorMatrixColorFilter);
        }
        canvas.drawARGB(255, 0, 0, 0);
        canvas.drawRect(rect, paint);
        setAlpha(0.998f);
        android.graphics.Paint paint2 = this.f137259e;
        paint2.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint2.setXfermode(this.f137261g);
        canvas.drawCircle(width, this.f137263i, min, paint2);
        float f18 = this.f137265n * 360.0f;
        int i17 = f137257r;
        float f19 = this.f137263i;
        canvas.drawArc((width - min) + (i17 >> 1), (i17 >> 1) + (f19 - min), (width + min) - (i17 >> 1), (f19 + min) - (i17 >> 1), -90.0f, f18, false, this.f137266o);
        canvas.restore();
        yz2.a aVar = this.f137264m;
        if (aVar != null) {
            com.tencent.mm.plugin.flash.g gVar = (com.tencent.mm.plugin.flash.g) aVar;
            gVar.getClass();
            int i18 = com.tencent.mm.plugin.flash.FaceFlashPreviewLayout.P;
            gVar.f137219a.d();
            this.f137264m = null;
        }
    }

    public void setCallback(yz2.a aVar) {
        this.f137264m = aVar;
    }

    public void setCircleMarginY(float f17) {
        this.f137267p = f17;
    }

    @Override // com.tencent.youtu.ytagreflectlivecheck.ui.YTReflectLayout
    public void setColorMatrixColorFilter(android.graphics.ColorMatrixColorFilter colorMatrixColorFilter) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectMask", "setColorMatrixColorFilter");
        this.f137260f = colorMatrixColorFilter;
        postInvalidate();
    }

    public void setProgress(float f17) {
        if (f17 <= 0.0f) {
            this.f137265n = 0.0f;
        } else if (f17 <= 1.0f) {
            this.f137265n = f17;
        } else if (f17 > 1.05d) {
            return;
        } else {
            this.f137265n = 1.0f;
        }
        postInvalidate();
    }
}
