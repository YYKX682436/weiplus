package com.tencent.mm.plugin.location.ui;

/* loaded from: classes14.dex */
public class VolumeMeter extends android.widget.ImageView implements java.lang.Runnable {
    public final float A;
    public final java.lang.Runnable B;

    /* renamed from: d, reason: collision with root package name */
    public boolean f144673d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f144674e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f144675f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f144676g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f144677h;

    /* renamed from: i, reason: collision with root package name */
    public int f144678i;

    /* renamed from: m, reason: collision with root package name */
    public int f144679m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f144680n;

    /* renamed from: o, reason: collision with root package name */
    public float f144681o;

    /* renamed from: p, reason: collision with root package name */
    public float f144682p;

    /* renamed from: q, reason: collision with root package name */
    public float f144683q;

    /* renamed from: r, reason: collision with root package name */
    public final int f144684r;

    /* renamed from: s, reason: collision with root package name */
    public final int f144685s;

    /* renamed from: t, reason: collision with root package name */
    public final float f144686t;

    /* renamed from: u, reason: collision with root package name */
    public final float f144687u;

    /* renamed from: v, reason: collision with root package name */
    public final int f144688v;

    /* renamed from: w, reason: collision with root package name */
    public float f144689w;

    /* renamed from: x, reason: collision with root package name */
    public float f144690x;

    /* renamed from: y, reason: collision with root package name */
    public float f144691y;

    /* renamed from: z, reason: collision with root package name */
    public final float f144692z;

    public VolumeMeter(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f144673d = false;
        this.f144674e = false;
        this.f144678i = -1;
        this.f144679m = -1;
        this.f144680n = null;
        this.f144684r = -6751336;
        this.f144685s = 70;
        this.f144686t = 0.5f;
        this.f144687u = 0.001f;
        this.f144688v = 20;
        this.f144691y = 0.0f;
        this.f144692z = 40.0f;
        this.A = 30.0f;
        this.B = new za3.k1(this);
        this.f144676g = context;
        this.f144675f = new android.graphics.Paint();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        getWidth();
        getHeight();
        android.view.View view = this.f144677h;
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            if (iArr[0] != 0 && iArr[1] != 0) {
                int width = this.f144677h.getWidth();
                int height = this.f144677h.getHeight();
                if (width != 0 && height != 0) {
                    int i17 = width / 2;
                    this.f144678i = iArr[0] + i17;
                    this.f144679m = iArr[1] + (height / 2);
                    float f17 = i17;
                    this.f144690x = f17;
                    this.f144689w = f17 * 2.0f;
                }
            }
        }
        if (this.f144678i < 0 || this.f144679m < 0) {
            return;
        }
        this.f144675f.setColor(this.f144684r);
        this.f144675f.setAlpha(this.f144685s);
        float d17 = com.tencent.mm.sdk.platformtools.j.d(this.f144676g, this.f144691y);
        float f18 = this.f144689w;
        if (d17 > f18) {
            d17 = f18;
        }
        float f19 = this.f144690x;
        if (d17 < f19) {
            d17 = f19;
        }
        canvas.drawCircle(this.f144678i, this.f144679m, d17, this.f144675f);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f144673d) {
            float f17 = this.f144683q;
            float f18 = this.f144682p;
            float f19 = this.f144681o;
            float f27 = this.f144687u;
            float f28 = this.f144686t;
            if (f18 > f19) {
                float f29 = (f18 - f19) / this.A;
                if (f29 > f28) {
                    f27 = f28;
                } else if (f29 >= f27) {
                    f27 = f29;
                }
                f17 += f27;
            } else if (f18 <= f19) {
                float f37 = (f19 - f18) / this.f144692z;
                if (f37 > f28) {
                    f27 = f28;
                } else if (f37 >= f27) {
                    f27 = f37;
                }
                f17 -= f27;
            }
            this.f144683q = f17;
            this.f144691y = ((float) ((java.lang.Math.sqrt(f17) * 260.0d) - (this.f144683q * 130.0f))) / 1.5f;
            postInvalidate();
            this.f144680n.postDelayed(this, this.f144688v);
        }
    }

    public void setArchView(android.view.View view) {
        this.f144677h = view;
    }

    public void setVolume(float f17) {
        this.f144681o = this.f144682p;
        this.f144682p = f17;
    }

    public VolumeMeter(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f144673d = false;
        this.f144674e = false;
        this.f144678i = -1;
        this.f144679m = -1;
        this.f144680n = null;
        this.f144684r = -6751336;
        this.f144685s = 70;
        this.f144686t = 0.5f;
        this.f144687u = 0.001f;
        this.f144688v = 20;
        this.f144691y = 0.0f;
        this.f144692z = 40.0f;
        this.A = 30.0f;
        this.B = new za3.k1(this);
        this.f144676g = context;
        this.f144675f = new android.graphics.Paint();
    }
}
