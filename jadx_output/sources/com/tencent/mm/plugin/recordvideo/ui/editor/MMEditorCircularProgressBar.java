package com.tencent.mm.plugin.recordvideo.ui.editor;

/* loaded from: classes3.dex */
public class MMEditorCircularProgressBar extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f156020d;

    /* renamed from: e, reason: collision with root package name */
    public final int f156021e;

    /* renamed from: f, reason: collision with root package name */
    public final int f156022f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.RectF f156023g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Paint f156024h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Paint f156025i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Paint f156026m;

    /* renamed from: n, reason: collision with root package name */
    public float f156027n;

    /* renamed from: o, reason: collision with root package name */
    public float f156028o;

    /* renamed from: p, reason: collision with root package name */
    public int f156029p;

    /* renamed from: q, reason: collision with root package name */
    public float f156030q;

    /* renamed from: r, reason: collision with root package name */
    public float f156031r;

    /* renamed from: s, reason: collision with root package name */
    public final android.content.Context f156032s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f156033t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f156034u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f156035v;

    public MMEditorCircularProgressBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f156020d = android.graphics.Color.parseColor("#1AAD19");
        this.f156021e = android.graphics.Color.parseColor("#FFFFFF");
        this.f156022f = android.graphics.Color.parseColor("#FA5151");
        this.f156027n = 0.0f;
        this.f156028o = 0.0f;
        this.f156029p = com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS;
        this.f156030q = 0.0f;
        this.f156031r = 0.0f;
        this.f156033t = new java.util.ArrayList();
        new java.util.ArrayList();
        this.f156034u = false;
        this.f156035v = false;
        this.f156032s = context;
    }

    public int getDrawWidth() {
        return (int) this.f156023g.width();
    }

    public java.util.ArrayList<java.lang.Float> getSubProgress() {
        return this.f156033t;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        canvas.save();
        float f17 = this.f156028o;
        canvas.translate(f17, f17);
        android.graphics.RectF rectF = this.f156023g;
        canvas.rotate(180.0f, rectF.right / 2.0f, rectF.bottom / 2.0f);
        if (this.f156034u) {
            float f18 = 0.0f;
            int i17 = 0;
            while (true) {
                java.util.ArrayList arrayList = this.f156033t;
                if (i17 >= arrayList.size()) {
                    break;
                }
                canvas.drawArc(this.f156023g, ((f18 / this.f156031r) * 360.0f) + 90.0f, ((((java.lang.Float) arrayList.get(i17)).floatValue() - f18) / this.f156031r) * 360.0f, false, this.f156024h);
                float floatValue = ((java.lang.Float) arrayList.get(i17)).floatValue();
                android.graphics.RectF rectF2 = this.f156023g;
                float f19 = this.f156031r;
                canvas.drawArc(rectF2, (((floatValue - 0.85f) / f19) * 360.0f) + 90.0f, (0.85f / f19) * 360.0f, false, this.f156025i);
                i17++;
                f18 = floatValue;
            }
            android.graphics.RectF rectF3 = this.f156023g;
            float f27 = this.f156031r;
            canvas.drawArc(rectF3, ((f18 / f27) * 360.0f) + 90.0f, ((this.f156030q - f18) / f27) * 360.0f, false, this.f156024h);
        } else {
            canvas.drawArc(this.f156023g, 90.0f, (this.f156030q / this.f156031r) * 360.0f, false, this.f156024h);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.f156035v) {
            return;
        }
        this.f156035v = true;
        float width = getWidth();
        float dimensionPixelSize = this.f156032s.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480568a61);
        this.f156027n = dimensionPixelSize;
        this.f156028o = dimensionPixelSize / 2.0f;
        float f17 = this.f156028o;
        float f18 = width - f17;
        this.f156023g = new android.graphics.RectF(f17, f17, f18, f18);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f156024h = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.f156024h.setStrokeWidth(this.f156027n);
        this.f156024h.setColor(this.f156020d);
        this.f156024h.setAlpha(this.f156029p);
        this.f156024h.setAntiAlias(true);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f156025i = paint2;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        this.f156025i.setStrokeWidth(this.f156027n);
        this.f156025i.setColor(this.f156021e);
        this.f156025i.setAlpha(this.f156029p);
        this.f156025i.setAntiAlias(true);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f156026m = paint3;
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        this.f156026m.setStrokeWidth(this.f156027n);
        this.f156026m.setColor(this.f156022f);
        this.f156026m.setAntiAlias(true);
    }

    public void setCircularColor(int i17) {
        this.f156020d = i17;
        this.f156029p = 255;
        android.graphics.Paint paint = this.f156024h;
        if (paint == null || i17 == 0) {
            return;
        }
        paint.setColor(i17);
    }

    public void setCurrentProgress(float f17) {
        this.f156030q = f17;
        invalidate();
    }

    public void setDuration(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCircularProgressBar", "setDuration: %s", java.lang.Integer.valueOf(i17));
    }

    public void setEnableSubProgress(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCircularProgressBar", "setEnableSubProgress: %s", java.lang.Boolean.valueOf(z17));
        this.f156034u = z17;
    }

    public void setInitProgress(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCircularProgressBar", "setInitProgress: %s, isStart: %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.FALSE);
    }

    public void setMaxProgress(float f17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCircularProgressBar", "setMaxProgress: %s", java.lang.Float.valueOf(f17));
        this.f156031r = f17;
    }

    public void setProgressCallback(wu3.l1 l1Var) {
    }

    public MMEditorCircularProgressBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f156020d = android.graphics.Color.parseColor("#1AAD19");
        this.f156021e = android.graphics.Color.parseColor("#FFFFFF");
        this.f156022f = android.graphics.Color.parseColor("#FA5151");
        this.f156027n = 0.0f;
        this.f156028o = 0.0f;
        this.f156029p = com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS;
        this.f156030q = 0.0f;
        this.f156031r = 0.0f;
        this.f156033t = new java.util.ArrayList();
        new java.util.ArrayList();
        this.f156034u = false;
        this.f156035v = false;
        this.f156032s = context;
    }
}
