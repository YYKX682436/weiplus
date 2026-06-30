package px1;

/* loaded from: classes12.dex */
public class k implements android.text.style.LeadingMarginSpan, px1.h, px1.g {

    /* renamed from: h, reason: collision with root package name */
    public static float f358825h;

    /* renamed from: d, reason: collision with root package name */
    public final int f358826d;

    /* renamed from: e, reason: collision with root package name */
    public final int f358827e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f358828f;

    /* renamed from: g, reason: collision with root package name */
    public float f358829g;

    public k(int i17, int i18, boolean z17, boolean z18, boolean z19) {
        this.f358826d = i17;
        this.f358827e = i18;
        this.f358828f = z17 && z19 && !z18;
    }

    @Override // px1.g
    public px1.g a() {
        return new px1.k(this.f358826d, this.f358827e, this.f358828f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int i17, int i18, int i19, int i27, int i28, java.lang.CharSequence charSequence, int i29, int i37, boolean z17, android.text.Layout layout) {
        android.text.Spanned spanned = (android.text.Spanned) charSequence;
        if (this.f358828f || spanned.getSpanStart(this) != i29) {
            return;
        }
        android.graphics.Paint.Style style = paint.getStyle();
        float textSize = paint.getTextSize();
        paint.setStyle(android.graphics.Paint.Style.FILL);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i38 = this.f358826d;
        sb6.append(i38);
        sb6.append(".");
        this.f358829g = paint.measureText(sb6.toString());
        canvas.drawText(i38 + ".", i17, i27, paint);
        paint.setStyle(style);
        paint.setTextSize(textSize);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z17) {
        float f17 = this.f358829g;
        float f18 = f17 + 2.0f;
        float f19 = f358825h;
        if (f18 > f19) {
            f19 = f17 + 2.0f;
        }
        float max = java.lang.Math.max(java.lang.Math.round(f19), this.f358827e);
        f358825h = max;
        if (this.f358828f) {
            return 0;
        }
        return (int) max;
    }

    @Override // px1.h
    public java.lang.Object getValue() {
        return java.lang.Boolean.TRUE;
    }

    public k(int i17, int i18, boolean z17) {
        this.f358826d = i17;
        this.f358827e = i18;
        this.f358828f = z17;
    }
}
