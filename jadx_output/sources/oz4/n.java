package oz4;

/* loaded from: classes12.dex */
public class n implements android.text.style.LeadingMarginSpan, oz4.h, oz4.g {

    /* renamed from: h, reason: collision with root package name */
    public static float f350288h;

    /* renamed from: d, reason: collision with root package name */
    public final int f350289d;

    /* renamed from: e, reason: collision with root package name */
    public final int f350290e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f350291f;

    /* renamed from: g, reason: collision with root package name */
    public float f350292g;

    public n(int i17, int i18, boolean z17, boolean z18, boolean z19) {
        this.f350289d = i17;
        this.f350290e = i18;
        this.f350291f = z17 && z19 && !z18;
    }

    @Override // oz4.g
    public oz4.g a() {
        return new oz4.n(this.f350289d, this.f350290e, this.f350291f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int i17, int i18, int i19, int i27, int i28, java.lang.CharSequence charSequence, int i29, int i37, boolean z17, android.text.Layout layout) {
        android.text.Spanned spanned = (android.text.Spanned) charSequence;
        if (this.f350291f || spanned.getSpanStart(this) != i29) {
            return;
        }
        android.graphics.Paint.Style style = paint.getStyle();
        float textSize = paint.getTextSize();
        paint.setStyle(android.graphics.Paint.Style.FILL);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i38 = this.f350289d;
        sb6.append(i38);
        sb6.append(".");
        this.f350292g = paint.measureText(sb6.toString());
        canvas.drawText(i38 + ".", i17, i27, paint);
        paint.setStyle(style);
        paint.setTextSize(textSize);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z17) {
        float f17 = this.f350292g;
        float f18 = f17 + 2.0f;
        float f19 = f350288h;
        if (f18 > f19) {
            f19 = f17 + 2.0f;
        }
        float max = java.lang.Math.max(java.lang.Math.round(f19), this.f350290e);
        f350288h = max;
        if (this.f350291f) {
            return 0;
        }
        return (int) max;
    }

    @Override // oz4.h
    public java.lang.Object getValue() {
        return java.lang.Boolean.TRUE;
    }

    public n(int i17, int i18, boolean z17) {
        this.f350289d = i17;
        this.f350290e = i18;
        this.f350291f = z17;
    }
}
