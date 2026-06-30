package df5;

/* loaded from: classes11.dex */
public final class t0 implements android.text.style.LeadingMarginSpan {

    /* renamed from: d, reason: collision with root package name */
    public final int f232213d;

    /* renamed from: e, reason: collision with root package name */
    public final int f232214e;

    /* renamed from: f, reason: collision with root package name */
    public final int f232215f;

    public t0(int i17, int i18, int i19, int i27) {
        this.f232213d = i17;
        this.f232214e = i18;
        this.f232215f = i17 + i19;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int i17, int i18, int i19, int i27, int i28, java.lang.CharSequence text, int i29, int i37, boolean z17, android.text.Layout layout) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        kotlin.jvm.internal.o.g(text, "text");
        int color = paint.getColor();
        android.graphics.Paint.Style style = paint.getStyle();
        paint.setColor(this.f232214e);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        int i38 = (this.f232213d * i18) + (((this.f232215f * 0) + i17) * i18);
        canvas.drawRect(java.lang.Math.min(r5, i38), i19, java.lang.Math.max(r5, i38), i28, paint);
        paint.setColor(color);
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z17) {
        return this.f232215f * 1;
    }
}
