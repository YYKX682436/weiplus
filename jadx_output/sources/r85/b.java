package r85;

/* loaded from: classes5.dex */
public class b extends android.text.style.ReplacementSpan {

    /* renamed from: d, reason: collision with root package name */
    public final int f393334d;

    public b(int i17) {
        this.f393334d = i17;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        java.lang.CharSequence subSequence = charSequence.subSequence(i17, i18);
        android.text.TextPaint textPaint = new android.text.TextPaint(paint);
        textPaint.setTextSize(this.f393334d);
        android.graphics.Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        canvas.drawText(subSequence.toString(), f17, i27 - (((((fontMetricsInt.descent + i27) + i27) + fontMetricsInt.ascent) / 2) - ((i28 + i19) / 2)), textPaint);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        java.lang.CharSequence subSequence = charSequence.subSequence(i17, i18);
        android.text.TextPaint textPaint = new android.text.TextPaint(paint);
        textPaint.setTextSize(this.f393334d);
        return (int) textPaint.measureText(subSequence.toString());
    }
}
