package px1;

/* loaded from: classes12.dex */
public class d implements android.text.style.LeadingMarginSpan, px1.h, px1.g {

    /* renamed from: f, reason: collision with root package name */
    public static android.graphics.Path f358820f;

    /* renamed from: d, reason: collision with root package name */
    public final int f358821d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f358822e;

    public d(int i17, boolean z17, boolean z18, boolean z19) {
        this.f358821d = i17;
        this.f358822e = z17 && z19 && !z18;
        if (f358820f == null) {
            f358820f = new android.graphics.Path();
        }
    }

    @Override // px1.g
    public px1.g a() {
        return new px1.d(this.f358821d, this.f358822e);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int i17, int i18, int i19, int i27, int i28, java.lang.CharSequence charSequence, int i29, int i37, boolean z17, android.text.Layout layout) {
        android.text.Spanned spanned = (android.text.Spanned) charSequence;
        if (this.f358822e || spanned.getSpanStart(this) != i29) {
            return;
        }
        android.graphics.Paint.Style style = paint.getStyle();
        paint.setStyle(android.graphics.Paint.Style.FILL);
        f358820f.reset();
        f358820f.addCircle(0.0f, 0.0f, 6, android.graphics.Path.Direction.CW);
        android.graphics.Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i38 = (((fontMetricsInt.descent + i27) + i27) + fontMetricsInt.ascent) / 2;
        canvas.save();
        canvas.translate(i17 + (i18 * 6), i38);
        canvas.drawPath(f358820f, paint);
        canvas.restore();
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z17) {
        if (this.f358822e) {
            return 0;
        }
        return this.f358821d;
    }

    @Override // px1.h
    public java.lang.Object getValue() {
        return java.lang.Boolean.TRUE;
    }

    public d(int i17, boolean z17) {
        this.f358821d = i17;
        this.f358822e = z17;
    }
}
