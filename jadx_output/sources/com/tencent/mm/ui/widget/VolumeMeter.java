package com.tencent.mm.ui.widget;

/* loaded from: classes3.dex */
public class VolumeMeter extends android.widget.ImageView implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f211477d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f211478e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f211479f;

    /* renamed from: g, reason: collision with root package name */
    public int f211480g;

    /* renamed from: h, reason: collision with root package name */
    public int f211481h;

    /* renamed from: i, reason: collision with root package name */
    public final int f211482i;

    /* renamed from: m, reason: collision with root package name */
    public final int f211483m;

    /* renamed from: n, reason: collision with root package name */
    public float f211484n;

    /* renamed from: o, reason: collision with root package name */
    public float f211485o;

    public VolumeMeter(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f211480g = -1;
        this.f211481h = -1;
        this.f211482i = -6751336;
        this.f211483m = 70;
        this.f211478e = context;
        this.f211477d = new android.graphics.Paint();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        getWidth();
        getHeight();
        android.view.View view = this.f211479f;
        android.content.Context context = this.f211478e;
        if (view != null && view.getVisibility() != 4) {
            int[] iArr = new int[2];
            this.f211479f.getLocationInWindow(iArr);
            if (iArr[0] != 0 && iArr[1] != 0) {
                int width = this.f211479f.getWidth();
                int height = this.f211479f.getHeight();
                if (width != 0 && height != 0) {
                    int d17 = com.tencent.mm.sdk.platformtools.j.d(context, 50.0f);
                    int i17 = width / 2;
                    this.f211480g = iArr[0] + i17;
                    this.f211481h = (iArr[1] + (height / 2)) - (d17 / 2);
                    float f17 = i17;
                    this.f211485o = f17;
                    this.f211484n = f17 * 2.0f;
                }
            }
        }
        if (this.f211480g < 0 || this.f211481h < 0) {
            return;
        }
        this.f211477d.setColor(this.f211482i);
        this.f211477d.setAlpha(this.f211483m);
        float d18 = com.tencent.mm.sdk.platformtools.j.d(context, 0.0f);
        float f18 = this.f211484n;
        if (d18 > f18) {
            d18 = f18;
        }
        float f19 = this.f211485o;
        if (d18 < f19) {
            d18 = f19;
        }
        canvas.drawCircle(this.f211480g, this.f211481h, d18, this.f211477d);
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    public void setArchView(android.view.View view) {
        this.f211479f = view;
    }

    public void setVolume(float f17) {
    }

    public VolumeMeter(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f211480g = -1;
        this.f211481h = -1;
        this.f211482i = -6751336;
        this.f211483m = 70;
        this.f211478e = context;
        this.f211477d = new android.graphics.Paint();
    }
}
