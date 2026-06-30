package com.tencent.mm.ui.tools;

/* loaded from: classes4.dex */
public class MaskImageButton extends com.tencent.mm.view.x2c.X2CImageView {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f210085f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f210086g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.RectF f210087h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f210088i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Paint f210089m;

    /* renamed from: n, reason: collision with root package name */
    public final int f210090n;

    /* renamed from: o, reason: collision with root package name */
    public int f210091o;

    /* renamed from: p, reason: collision with root package name */
    public int f210092p;

    public MaskImageButton(android.content.Context context) {
        super(context);
        this.f210087h = new android.graphics.RectF();
        this.f210089m = null;
        this.f210090n = 90;
        this.f210091o = 0;
        this.f210092p = 0;
        n();
    }

    public final void n() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f210089m = paint;
        paint.setColor(android.graphics.Color.argb(this.f210090n, 0, 0, 0));
        this.f210085f = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f210086g = new com.tencent.mm.ui.tools.b7(this);
        super.setOnTouchListener(new com.tencent.mm.ui.tools.c7(this));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (isPressed()) {
            float paddingLeft = getPaddingLeft() + 0;
            float paddingTop = getPaddingTop() + 0;
            float paddingRight = this.f210091o - getPaddingRight();
            float paddingBottom = this.f210092p - getPaddingBottom();
            android.graphics.RectF rectF = this.f210087h;
            rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
            canvas.drawRoundRect(rectF, getMeasuredHeight() / 10, getMeasuredHeight() / 10, this.f210089m);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.f210091o = getMeasuredWidth();
        this.f210092p = getMeasuredHeight();
    }

    public MaskImageButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210087h = new android.graphics.RectF();
        this.f210089m = null;
        this.f210090n = 90;
        this.f210091o = 0;
        this.f210092p = 0;
        n();
    }
}
