package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\u001b\u0010\u0015\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveMarqueeTextView;", "Landroid/widget/TextView;", "", "e", "I", "getRndDuration", "()I", "setRndDuration", "(I)V", "rndDuration", "i", "getScrollMode", "setScrollMode", "scrollMode", "m", "getScrollFirstDelay", "setScrollFirstDelay", "scrollFirstDelay", "o", "Ljz5/g;", "getTextEdge", "textEdge", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FinderLiveMarqueeTextView extends android.widget.TextView {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f116022q = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Scroller f116023d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int rndDuration;

    /* renamed from: f, reason: collision with root package name */
    public int f116025f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f116026g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f116027h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int scrollMode;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public int scrollFirstDelay;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f116030n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final jz5.g textEdge;

    /* renamed from: p, reason: collision with root package name */
    public int f116032p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveMarqueeTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final int getTextEdge() {
        return ((java.lang.Number) ((jz5.n) this.textEdge).getValue()).intValue();
    }

    public final int a(java.lang.String str) {
        android.text.TextPaint paint = getPaint();
        android.graphics.Rect rect = new android.graphics.Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.width();
    }

    public final void b() {
        android.widget.Scroller scroller = this.f116023d;
        if (scroller == null || this.f116026g) {
            return;
        }
        this.f116026g = true;
        kotlin.jvm.internal.o.d(scroller);
        this.f116025f = scroller.getCurrX();
        android.widget.Scroller scroller2 = this.f116023d;
        kotlin.jvm.internal.o.d(scroller2);
        scroller2.abortAnimation();
    }

    public final void c() {
        int i17;
        if (this.f116026g) {
            setHorizontallyScrolling(true);
            if (this.f116023d == null) {
                android.widget.Scroller scroller = new android.widget.Scroller(getContext(), new android.view.animation.LinearInterpolator());
                this.f116023d = scroller;
                setScroller(scroller);
            }
            if (this.f116027h || this.f116025f > 0) {
                i17 = this.f116025f;
            } else {
                i17 = this.f116032p - getWidth();
                if (i17 < 0) {
                    i17 = 0;
                }
            }
            int i18 = i17;
            int a17 = a(getText().toString()) - getWidth();
            int i19 = a17 - i18;
            int i27 = (int) (((this.rndDuration * i19) * 1.0d) / a17);
            if (this.f116027h) {
                new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new com.tencent.mm.plugin.finder.live.view.f6(this, i18, i19, i27), this.scrollFirstDelay);
                return;
            }
            android.widget.Scroller scroller2 = this.f116023d;
            kotlin.jvm.internal.o.d(scroller2);
            scroller2.startScroll(i18, 0, i19, 0, i27);
            invalidate();
            this.f116026g = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void computeScroll() {
        super.computeScroll();
        android.widget.Scroller scroller = this.f116023d;
        if (scroller == null) {
            return;
        }
        kotlin.jvm.internal.o.d(scroller);
        if (!scroller.isFinished() || this.f116026g) {
            return;
        }
        if (this.scrollMode == 101) {
            e();
            return;
        }
        this.f116026g = true;
        this.f116025f = getWidth() * (-1);
        this.f116027h = false;
        c();
    }

    public final void d(java.lang.String str, boolean z17) {
        kotlin.jvm.internal.o.g(str, "str");
        int width = getWidth();
        int a17 = a(str) + getTextEdge();
        int i17 = a17 <= width ? z17 ? 1 + ((int) (width / a17)) : 0 : 1;
        if (i17 <= 0) {
            this.f116032p = 0;
            setText(str);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i18 = 0; i18 < i17; i18++) {
            sb6.append(str);
            sb6.append(this.f116030n);
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        this.f116032p = a(sb7);
        sb6.append(sb6.toString());
        setText(sb6.toString());
    }

    public final void e() {
        android.widget.Scroller scroller = this.f116023d;
        if (scroller == null) {
            return;
        }
        this.f116026g = true;
        kotlin.jvm.internal.o.d(scroller);
        scroller.startScroll(0, 0, 0, 0, 0);
    }

    public final int getRndDuration() {
        return this.rndDuration;
    }

    public final int getScrollFirstDelay() {
        return this.scrollFirstDelay;
    }

    public final int getScrollMode() {
        return this.scrollMode;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    public final void setRndDuration(int i17) {
        this.rndDuration = i17;
    }

    public final void setScrollFirstDelay(int i17) {
        this.scrollFirstDelay = i17;
    }

    public final void setScrollMode(int i17) {
        this.scrollMode = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveMarqueeTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f116026g = true;
        this.f116027h = true;
        this.f116030n = "  ";
        this.textEdge = jz5.h.b(new com.tencent.mm.plugin.finder.live.view.g6(this));
        this.rndDuration = 6000;
        this.scrollMode = 100;
        this.scrollFirstDelay = 1000;
        setSingleLine();
        setEllipsize(null);
    }
}
