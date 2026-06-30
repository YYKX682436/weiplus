package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class MMSightCircularProgressBar extends android.view.View {
    public boolean A;
    public boolean B;
    public boolean C;

    /* renamed from: d, reason: collision with root package name */
    public int f149173d;

    /* renamed from: e, reason: collision with root package name */
    public final int f149174e;

    /* renamed from: f, reason: collision with root package name */
    public final int f149175f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.RectF f149176g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Paint f149177h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Paint f149178i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Paint f149179m;

    /* renamed from: n, reason: collision with root package name */
    public float f149180n;

    /* renamed from: o, reason: collision with root package name */
    public float f149181o;

    /* renamed from: p, reason: collision with root package name */
    public int f149182p;

    /* renamed from: q, reason: collision with root package name */
    public float f149183q;

    /* renamed from: r, reason: collision with root package name */
    public int f149184r;

    /* renamed from: s, reason: collision with root package name */
    public int f149185s;

    /* renamed from: t, reason: collision with root package name */
    public int f149186t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f149187u;

    /* renamed from: v, reason: collision with root package name */
    public final android.content.Context f149188v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.ui.e2 f149189w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.ui.x f149190x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f149191y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f149192z;

    public MMSightCircularProgressBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f149173d = android.graphics.Color.parseColor("#1AAD19");
        this.f149174e = android.graphics.Color.parseColor("#FFFFFF");
        this.f149175f = android.graphics.Color.parseColor("#FA5151");
        this.f149180n = 0.0f;
        this.f149181o = 0.0f;
        this.f149182p = com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS;
        this.f149183q = 0.0f;
        this.f149184r = 0;
        this.f149185s = 0;
        this.f149186t = 0;
        this.f149187u = false;
        this.f149191y = new java.util.ArrayList();
        this.f149192z = new java.util.ArrayList();
        this.A = false;
        this.B = false;
        this.C = false;
        this.f149188v = context;
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCircularProgressBar", "reset");
        this.f149190x = null;
        this.f149184r = 0;
        this.f149185s = 100;
        this.f149186t = 0;
        this.f149187u = false;
        this.f149191y.clear();
        this.f149183q = 0.0f;
        com.tencent.mm.plugin.mmsight.ui.e2 e2Var = this.f149189w;
        if (e2Var != null) {
            e2Var.f149319g = false;
            e2Var.f149316d = 0L;
            this.f149189w = null;
        }
        invalidate();
    }

    public int getDrawWidth() {
        return (int) this.f149176g.width();
    }

    public java.util.ArrayList<java.lang.Float> getSubProgress() {
        return this.f149191y;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        canvas.save();
        float f17 = this.f149181o;
        canvas.translate(f17, f17);
        android.graphics.RectF rectF = this.f149176g;
        canvas.rotate(180.0f, rectF.right / 2.0f, rectF.bottom / 2.0f);
        if (this.A) {
            float f18 = 0.0f;
            int i17 = 0;
            while (true) {
                java.util.ArrayList arrayList = this.f149191y;
                if (i17 >= arrayList.size()) {
                    break;
                }
                if (this.B && i17 == arrayList.size() - 1) {
                    canvas.drawArc(this.f149176g, ((f18 / this.f149185s) * 360.0f) + 90.0f, ((((java.lang.Float) arrayList.get(i17)).floatValue() - f18) / this.f149185s) * 360.0f, false, this.f149179m);
                } else {
                    canvas.drawArc(this.f149176g, ((f18 / this.f149185s) * 360.0f) + 90.0f, ((((java.lang.Float) arrayList.get(i17)).floatValue() - f18) / this.f149185s) * 360.0f, false, this.f149177h);
                }
                float floatValue = ((java.lang.Float) arrayList.get(i17)).floatValue();
                android.graphics.RectF rectF2 = this.f149176g;
                float f19 = this.f149185s;
                canvas.drawArc(rectF2, (((floatValue - 0.85f) / f19) * 360.0f) + 90.0f, (0.85f / f19) * 360.0f, false, this.f149178i);
                i17++;
                f18 = floatValue;
            }
            int i18 = this.f149185s;
            if (i18 > 0) {
                float f27 = i18;
                canvas.drawArc(this.f149176g, ((f18 / f27) * 360.0f) + 90.0f, ((this.f149183q - f18) / f27) * 360.0f, false, this.f149177h);
            }
        } else {
            canvas.drawArc(this.f149176g, 90.0f, (this.f149183q / this.f149185s) * 360.0f, false, this.f149177h);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.C) {
            return;
        }
        this.C = true;
        float width = getWidth();
        float dimensionPixelSize = this.f149188v.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480568a61);
        this.f149180n = dimensionPixelSize;
        this.f149181o = dimensionPixelSize / 2.0f;
        float f17 = this.f149181o;
        float f18 = width - f17;
        this.f149176g = new android.graphics.RectF(f17, f17, f18, f18);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f149177h = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.f149177h.setStrokeWidth(this.f149180n);
        this.f149177h.setColor(this.f149173d);
        this.f149177h.setAlpha(this.f149182p);
        this.f149177h.setAntiAlias(true);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f149178i = paint2;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        this.f149178i.setStrokeWidth(this.f149180n);
        this.f149178i.setColor(this.f149174e);
        this.f149178i.setAlpha(this.f149182p);
        this.f149178i.setAntiAlias(true);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f149179m = paint3;
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        this.f149179m.setStrokeWidth(this.f149180n);
        this.f149179m.setColor(this.f149175f);
        this.f149179m.setAntiAlias(true);
    }

    public void setCircularColor(int i17) {
        this.f149173d = i17;
        this.f149182p = 255;
        android.graphics.Paint paint = this.f149177h;
        if (paint == null || i17 == 0) {
            return;
        }
        paint.setColor(i17);
    }

    public void setDuration(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCircularProgressBar", "setDuration: %s", java.lang.Integer.valueOf(i17));
        this.f149186t = i17;
    }

    public void setEnableSubProgress(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCircularProgressBar", "setEnableSubProgress: %s", java.lang.Boolean.valueOf(z17));
        this.A = z17;
    }

    public void setInitProgress(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCircularProgressBar", "setInitProgress: %s, isStart: %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f149187u));
        if (this.f149187u) {
            return;
        }
        this.f149184r = i17;
    }

    public void setMaxProgress(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCircularProgressBar", "setMaxProgress: %s", java.lang.Integer.valueOf(i17));
        this.f149185s = i17;
    }

    public void setProgressCallback(com.tencent.mm.plugin.mmsight.ui.x xVar) {
        this.f149190x = xVar;
    }

    public MMSightCircularProgressBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f149173d = android.graphics.Color.parseColor("#1AAD19");
        this.f149174e = android.graphics.Color.parseColor("#FFFFFF");
        this.f149175f = android.graphics.Color.parseColor("#FA5151");
        this.f149180n = 0.0f;
        this.f149181o = 0.0f;
        this.f149182p = com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS;
        this.f149183q = 0.0f;
        this.f149184r = 0;
        this.f149185s = 0;
        this.f149186t = 0;
        this.f149187u = false;
        this.f149191y = new java.util.ArrayList();
        this.f149192z = new java.util.ArrayList();
        this.A = false;
        this.B = false;
        this.C = false;
        this.f149188v = context;
    }
}
