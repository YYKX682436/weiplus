package com.tencent.mm.ui.tools;

/* loaded from: classes4.dex */
public class s extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f210684a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f210685b;

    /* renamed from: c, reason: collision with root package name */
    public final int f210686c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.RectF f210687d;

    public s(com.tencent.mm.ui.tools.ActionBarSearchView actionBarSearchView, android.widget.EditText editText, java.lang.String str) {
        int d17 = com.tencent.mm.sdk.platformtools.j.d(com.tencent.mm.sdk.platformtools.x2.f193071a, 2.0f);
        this.f210686c = d17;
        android.graphics.Paint paint = new android.graphics.Paint(editText.getPaint());
        this.f210684a = paint;
        this.f210685b = str;
        paint.setColor(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f478734fp));
        float measureText = paint.measureText(str);
        android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f17 = d17 * 2;
        setBounds(0, 0, (int) (measureText + f17 + f17 + 2.0f), (int) java.lang.Math.ceil(fontMetrics.bottom - fontMetrics.top));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint = this.f210684a;
        android.graphics.Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        android.graphics.Rect bounds = getBounds();
        int i17 = bounds.right;
        int i18 = bounds.left;
        android.graphics.RectF rectF = this.f210687d;
        float f17 = rectF.right;
        float f18 = rectF.left;
        int i19 = (bounds.bottom - bounds.top) - fontMetricsInt.bottom;
        int i27 = fontMetricsInt.top;
        canvas.drawText(this.f210685b, i18 + 2, (r4 + ((i19 + i27) / 2)) - i27, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i17, int i18, int i19, int i27) {
        super.setBounds(i17, i18, i19, i27);
        android.graphics.Paint.FontMetrics fontMetrics = this.f210684a.getFontMetrics();
        int i28 = this.f210686c;
        this.f210687d = new android.graphics.RectF(i17 + i28, i18 + (fontMetrics.ascent - fontMetrics.top), i19 - i28, i27);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
