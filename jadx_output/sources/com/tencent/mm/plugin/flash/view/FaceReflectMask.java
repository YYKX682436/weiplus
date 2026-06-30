package com.tencent.mm.plugin.flash.view;

/* loaded from: classes14.dex */
public class FaceReflectMask extends com.tencent.youtu.ytagreflectlivecheck.ui.YTReflectLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final int f137276q = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479646bl);

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f137277d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f137278e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.ColorMatrixColorFilter f137279f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.PorterDuffXfermode f137280g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f137281h;

    /* renamed from: i, reason: collision with root package name */
    public float f137282i;

    /* renamed from: m, reason: collision with root package name */
    public yz2.d f137283m;

    /* renamed from: n, reason: collision with root package name */
    public float f137284n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f137285o;

    /* renamed from: p, reason: collision with root package name */
    public float f137286p;

    public FaceReflectMask(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f137281h = new android.graphics.Rect();
        this.f137282i = 0.0f;
        this.f137284n = 0.0f;
        this.f137286p = 0.0f;
        setLayerType(1, null);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f137277d = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f137278e = paint2;
        paint2.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.a9e));
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.f137285o = paint3;
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        paint3.setStrokeWidth(f137276q);
        paint3.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_8));
        setWillNotDraw(false);
        this.f137280g = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR);
    }

    public float getCircleMarginY() {
        return this.f137286p;
    }

    public float getCircleY() {
        return this.f137282i;
    }

    @Override // com.tencent.youtu.ytagreflectlivecheck.ui.YTReflectLayout, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        canvas.save();
        float min = java.lang.Math.min(getWidth(), getHeight()) * 0.27f;
        float width = (float) (getWidth() * 0.5d);
        float f17 = this.f137286p;
        if (f17 != 0.0f) {
            this.f137282i = f17 + min;
        } else {
            this.f137282i = i65.a.h(getContext(), com.tencent.mm.R.dimen.f480396wr) + min;
        }
        android.graphics.Rect rect = this.f137281h;
        rect.left = 0;
        rect.right = getWidth();
        rect.top = 0;
        rect.bottom = getHeight();
        android.graphics.Paint paint = this.f137277d;
        paint.setColor(-1);
        android.graphics.ColorMatrixColorFilter colorMatrixColorFilter = this.f137279f;
        if (colorMatrixColorFilter != null) {
            paint.setColorFilter(colorMatrixColorFilter);
        }
        canvas.drawARGB(255, 0, 0, 0);
        canvas.drawRect(rect, paint);
        setAlpha(0.998f);
        android.graphics.Paint paint2 = this.f137278e;
        paint2.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint2.setXfermode(this.f137280g);
        canvas.drawCircle(width, this.f137282i, min, paint2);
        float f18 = this.f137284n * 360.0f;
        int i17 = f137276q;
        float f19 = this.f137282i;
        canvas.drawArc((width - min) + (i17 >> 1), (i17 >> 1) + (f19 - min), (width + min) - (i17 >> 1), (f19 + min) - (i17 >> 1), -90.0f, f18, false, this.f137285o);
        canvas.restore();
        yz2.d dVar = this.f137283m;
        if (dVar != null) {
            com.tencent.mm.plugin.flash.action.t tVar = (com.tencent.mm.plugin.flash.action.t) dVar;
            tVar.getClass();
            int i18 = com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout.f137063l1;
            tVar.f137181a.e();
            this.f137283m = null;
        }
    }

    public void setCallback(yz2.d dVar) {
        this.f137283m = dVar;
    }

    public void setCircleMarginY(float f17) {
        this.f137286p = f17;
    }

    @Override // com.tencent.youtu.ytagreflectlivecheck.ui.YTReflectLayout
    public void setColorMatrixColorFilter(android.graphics.ColorMatrixColorFilter colorMatrixColorFilter) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectMask", "setColorMatrixColorFilter");
        this.f137279f = colorMatrixColorFilter;
        postInvalidate();
    }

    public void setProgress(float f17) {
        if (f17 <= 0.0f) {
            this.f137284n = 0.0f;
        } else if (f17 <= 1.0f) {
            this.f137284n = f17;
        } else if (f17 > 1.05d) {
            return;
        } else {
            this.f137284n = 1.0f;
        }
        postInvalidate();
    }
}
