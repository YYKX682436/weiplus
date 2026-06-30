package df5;

/* loaded from: classes11.dex */
public final class w0 implements android.text.style.LeadingMarginSpan {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f232247d;

    /* renamed from: e, reason: collision with root package name */
    public final int f232248e;

    /* renamed from: f, reason: collision with root package name */
    public final int f232249f;

    /* renamed from: g, reason: collision with root package name */
    public final int f232250g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f232251h;

    /* renamed from: i, reason: collision with root package name */
    public final int f232252i;

    public w0(java.lang.String prefix, int i17, int i18, int i19, int i27, boolean z17, int i28) {
        kotlin.jvm.internal.o.g(prefix, "prefix");
        this.f232247d = prefix;
        this.f232248e = i17;
        this.f232249f = i19;
        this.f232250g = i27;
        this.f232251h = z17;
        this.f232252i = i28;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int i17, int i18, int i19, int i27, int i28, java.lang.CharSequence text, int i29, int i37, boolean z17, android.text.Layout layout) {
        float f17;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        kotlin.jvm.internal.o.g(text, "text");
        if (z17) {
            int color = paint.getColor();
            android.graphics.Typeface typeface = paint.getTypeface();
            paint.setColor(this.f232248e);
            boolean z18 = this.f232251h;
            if (z18) {
                paint.setTypeface(android.graphics.Typeface.MONOSPACE);
            }
            java.lang.String str = this.f232247d;
            float measureText = paint.measureText(str);
            int i38 = this.f232250g;
            int i39 = this.f232249f;
            if (z18) {
                f17 = ((i17 + i39) - i38) - measureText;
            } else {
                f17 = (((i17 + i39) - i38) - r8) + ((this.f232252i - measureText) / 2.0f);
            }
            canvas.drawText(str, f17 * i18, i27, paint);
            paint.setColor(color);
            paint.setTypeface(typeface);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z17) {
        return this.f232249f;
    }
}
