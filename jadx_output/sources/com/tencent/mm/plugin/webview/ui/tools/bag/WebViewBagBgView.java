package com.tencent.mm.plugin.webview.ui.tools.bag;

/* loaded from: classes5.dex */
public class WebViewBagBgView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f183983d;

    /* renamed from: e, reason: collision with root package name */
    public int f183984e;

    /* renamed from: f, reason: collision with root package name */
    public float f183985f;

    /* renamed from: g, reason: collision with root package name */
    public int f183986g;

    /* renamed from: h, reason: collision with root package name */
    public int f183987h;

    /* renamed from: i, reason: collision with root package name */
    public long f183988i;

    /* renamed from: m, reason: collision with root package name */
    public float f183989m;

    /* renamed from: n, reason: collision with root package name */
    public float f183990n;

    /* renamed from: o, reason: collision with root package name */
    public int f183991o;

    /* renamed from: p, reason: collision with root package name */
    public int f183992p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f183993q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Paint f183994r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.RectF f183995s;

    public WebViewBagBgView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f183983d = -7829368;
        this.f183984e = -65536;
        this.f183985f = 0.0f;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f183994r = paint;
        paint.setAntiAlias(true);
        this.f183992p = -1;
    }

    public final void a(long j17) {
        int i17 = this.f183992p;
        if (i17 < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBagBgView", "doUpdateAngryInfo not measured, mDiameter:%d", java.lang.Integer.valueOf(i17));
            return;
        }
        float f17 = (i17 * 2) / (this.f183987h / this.f183986g);
        this.f183985f = f17;
        if (j17 - this.f183988i <= 0) {
            this.f183989m = i17;
        } else {
            float f18 = i17 - ((((int) (((float) (j17 - r4)) / r3)) + 1) * f17);
            this.f183989m = f18;
            int i18 = this.f183991o;
            if (f18 < (-i18)) {
                f18 = -i18;
            }
            this.f183989m = f18;
        }
        float f19 = this.f183989m;
        float f27 = i17 - f19;
        int i19 = this.f183991o;
        this.f183990n = f27 < ((float) i19) ? i17 : i19 + f19;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        float f17 = this.f183990n;
        float f18 = this.f183989m;
        if (f17 == f18) {
            this.f183989m = f18 - 0.001f;
        }
        this.f183994r.setShader(new android.graphics.LinearGradient(0.0f, this.f183989m, 0.0f, this.f183990n, new int[]{this.f183983d, this.f183984e}, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
        canvas.drawOval(this.f183995s, this.f183994r);
        if (!this.f183993q || this.f183990n <= 0.0f) {
            return;
        }
        float f19 = this.f183989m - this.f183985f;
        this.f183989m = f19;
        int i17 = this.f183991o;
        if (f19 < (-i17)) {
            f19 = -i17;
        }
        this.f183989m = f19;
        int i18 = this.f183992p;
        this.f183990n = ((float) i18) - f19 < ((float) i17) ? i18 : f19 + i17;
        postInvalidateDelayed(this.f183986g);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.f183992p = android.view.View.MeasureSpec.getSize(i17);
        int i19 = this.f183992p;
        this.f183995s = new android.graphics.RectF(0.0f, 0.0f, i19, i19);
        this.f183991o = this.f183992p / 2;
        a(java.lang.System.currentTimeMillis());
    }

    public void setAngryColor(int i17) {
        this.f183984e = i17;
    }

    public void setStartColor(int i17) {
        this.f183983d = i17;
    }
}
