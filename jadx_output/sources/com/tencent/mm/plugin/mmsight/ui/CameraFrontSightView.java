package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class CameraFrontSightView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f149118d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f149119e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f149120f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f149121g;

    /* renamed from: h, reason: collision with root package name */
    public long f149122h;

    /* renamed from: i, reason: collision with root package name */
    public int f149123i;

    /* renamed from: m, reason: collision with root package name */
    public int f149124m;

    /* renamed from: n, reason: collision with root package name */
    public int f149125n;

    /* renamed from: o, reason: collision with root package name */
    public int f149126o;

    /* renamed from: p, reason: collision with root package name */
    public int f149127p;

    public CameraFrontSightView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f149118d = new android.graphics.Paint();
        this.f149119e = false;
        this.f149120f = false;
        this.f149121g = false;
        this.f149122h = 0L;
    }

    public void a(float f17, float f18) {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CameraFrontSightView", "LayoutParams is not MarginLayoutParams! use doAimation()");
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = ((int) f17) - (this.f149123i / 2);
        marginLayoutParams.topMargin = ((int) f18) - (this.f149124m / 2);
        setLayoutParams(marginLayoutParams);
        setVisibility(0);
        this.f149119e = true;
        this.f149120f = false;
        this.f149121g = false;
        this.f149122h = java.lang.System.currentTimeMillis();
        invalidate();
    }

    public void b(int i17, int i18) {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i17;
            layoutParams.height = i18;
        }
        this.f149123i = i17;
        this.f149124m = i18;
        this.f149125n = i17 / 2;
        this.f149126o = i18 / 2;
        this.f149127p = i65.a.b(getContext(), 1);
        android.graphics.Paint paint = this.f149118d;
        paint.setColor(-12206054);
        paint.setStrokeWidth(this.f149127p);
        setLayerType(1, null);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        canvas.translate(this.f149125n / 2, this.f149126o / 2);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f149122h;
        if (currentTimeMillis > 200) {
            this.f149119e = false;
            this.f149120f = true;
        }
        if (currentTimeMillis > 800) {
            this.f149120f = false;
        }
        if (currentTimeMillis > 1100) {
            this.f149121g = true;
        }
        if (currentTimeMillis > 1300) {
            this.f149121g = false;
            canvas.drawColor(0);
            return;
        }
        boolean z17 = this.f149119e;
        android.graphics.Paint paint = this.f149118d;
        if (z17) {
            float f17 = (((float) (200 - currentTimeMillis)) / 200.0f) + 1.0f;
            canvas.scale(f17, f17, this.f149125n / 2, this.f149126o / 2);
            paint.setAlpha((int) ((2.0f - f17) * 255.0f));
        } else {
            canvas.scale(1.0f, 1.0f);
        }
        if (this.f149120f) {
            float f18 = (((float) ((currentTimeMillis - 200) % 200)) / 200.0f) * 2.0f;
            paint.setAlpha((int) (((f18 > 1.0f ? f18 - 1.0f : 1.0f - f18) * 128.0f) + 127.0f));
        } else {
            paint.setAlpha(255);
        }
        if (this.f149121g) {
            paint.setAlpha((int) ((1.0f - (((float) (currentTimeMillis - 1100)) / 200.0f)) * 255.0f));
        }
        canvas.drawLine(0.0f, 0.0f, this.f149125n, 0.0f, paint);
        canvas.drawLine(0.0f, 0.0f, 0.0f, this.f149126o, paint);
        int i17 = this.f149125n;
        canvas.drawLine(i17, 0.0f, i17, this.f149126o, paint);
        int i18 = this.f149126o;
        canvas.drawLine(0.0f, i18, this.f149125n, i18, paint);
        int i19 = this.f149126o;
        canvas.drawLine(0.0f, i19 / 2, this.f149125n / 10, i19 / 2, paint);
        int i27 = this.f149125n;
        int i28 = this.f149126o;
        canvas.drawLine(i27, i28 / 2, (i27 * 9) / 10, i28 / 2, paint);
        int i29 = this.f149125n;
        canvas.drawLine(i29 / 2, 0.0f, i29 / 2, this.f149126o / 10, paint);
        int i37 = this.f149125n;
        canvas.drawLine(i37 / 2, this.f149126o, i37 / 2, (r3 * 9) / 10, paint);
        invalidate();
    }

    public void setFocusColor(int i17) {
        if (i17 != 0) {
            this.f149118d.setColor(i17);
        }
    }

    public CameraFrontSightView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f149118d = new android.graphics.Paint();
        this.f149119e = false;
        this.f149120f = false;
        this.f149121g = false;
        this.f149122h = 0L;
    }
}
