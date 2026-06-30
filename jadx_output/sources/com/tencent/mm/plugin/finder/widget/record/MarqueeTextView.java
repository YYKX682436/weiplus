package com.tencent.mm.plugin.finder.widget.record;

/* loaded from: classes5.dex */
public class MarqueeTextView extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Scroller f136968d;

    /* renamed from: e, reason: collision with root package name */
    public int f136969e;

    /* renamed from: f, reason: collision with root package name */
    public int f136970f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f136971g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f136972h;

    /* renamed from: i, reason: collision with root package name */
    public int f136973i;

    /* renamed from: m, reason: collision with root package name */
    public int f136974m;

    public MarqueeTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.TextView, android.view.View
    public void computeScroll() {
        super.computeScroll();
        android.widget.Scroller scroller = this.f136968d;
        if (scroller == null || !scroller.isFinished() || this.f136971g) {
            return;
        }
        if (this.f136973i == 101) {
            android.widget.Scroller scroller2 = this.f136968d;
            if (scroller2 == null) {
                return;
            }
            this.f136970f = 0;
            this.f136971g = true;
            this.f136972h = true;
            scroller2.startScroll(0, 0, 0, 0, 0);
            invalidate();
            return;
        }
        this.f136971g = true;
        this.f136970f = getWidth() * (-1);
        this.f136972h = false;
        if (this.f136971g) {
            setHorizontallyScrolling(true);
            if (this.f136968d == null) {
                android.widget.Scroller scroller3 = new android.widget.Scroller(getContext(), new android.view.animation.LinearInterpolator());
                this.f136968d = scroller3;
                setScroller(scroller3);
            }
            android.text.TextPaint paint = getPaint();
            android.graphics.Rect rect = new android.graphics.Rect();
            java.lang.String charSequence = getText().toString();
            paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
            int width = rect.width();
            int i17 = width - this.f136970f;
            int intValue = java.lang.Double.valueOf(((this.f136969e * i17) * 1.0d) / width).intValue();
            if (this.f136972h) {
                new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new uy2.a(this, i17, intValue), this.f136974m);
                return;
            }
            this.f136968d.startScroll(this.f136970f, 0, i17, 0, intValue);
            invalidate();
            this.f136971g = false;
        }
    }

    public int getRndDuration() {
        return this.f136969e;
    }

    public int getScrollFirstDelay() {
        return this.f136974m;
    }

    public int getScrollMode() {
        return this.f136973i;
    }

    public void setRndDuration(int i17) {
        this.f136969e = i17;
    }

    public void setScrollFirstDelay(int i17) {
        this.f136974m = i17;
    }

    public void setScrollMode(int i17) {
        this.f136973i = i17;
    }

    public MarqueeTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f136970f = 0;
        this.f136971g = true;
        this.f136972h = true;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b92.w2.f18555l);
        this.f136969e = obtainStyledAttributes.getInt(1, 10000);
        this.f136973i = obtainStyledAttributes.getInt(2, 100);
        this.f136974m = obtainStyledAttributes.getInt(0, 1000);
        obtainStyledAttributes.recycle();
        setSingleLine();
        setEllipsize(null);
    }
}
