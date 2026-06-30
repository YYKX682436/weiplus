package com.tencent.mm.ui.tools;

/* loaded from: classes4.dex */
public class td extends android.graphics.drawable.Drawable {

    /* renamed from: h, reason: collision with root package name */
    public static int f210781h;

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f210782a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f210783b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f210784c;

    /* renamed from: d, reason: collision with root package name */
    public final float f210785d;

    /* renamed from: e, reason: collision with root package name */
    public final float f210786e;

    /* renamed from: f, reason: collision with root package name */
    public float f210787f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.RectF f210788g;

    public td(android.content.Context context, java.lang.String str, android.graphics.Paint paint) {
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f210782a = paint2;
        paint2.setColor(-7829368);
        this.f210783b = paint;
        int d17 = com.tencent.mm.sdk.platformtools.j.d(context, 2.0f);
        f210781h = d17;
        float f17 = d17;
        this.f210785d = f17;
        this.f210786e = f17;
        this.f210784c = str;
        this.f210787f = paint.measureText(str);
        android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float ceil = (float) java.lang.Math.ceil(fontMetrics.bottom - fontMetrics.top);
        float f18 = this.f210787f;
        float f19 = f210781h * 2;
        setBounds(0, 0, (int) (f18 + f19 + f19), (int) ceil);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextDrawable", "setText(%s).", str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        canvas.drawRoundRect(this.f210788g, this.f210785d, this.f210786e, this.f210782a);
        android.graphics.Rect bounds = getBounds();
        float f17 = bounds.right - bounds.left;
        android.graphics.RectF rectF = this.f210788g;
        int i17 = (int) (((f17 - (rectF.right - rectF.left)) + (f210781h * 2)) / 2.0f);
        android.graphics.Paint paint = this.f210783b;
        android.graphics.Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i18 = (bounds.bottom - bounds.top) - fontMetricsInt.bottom;
        int i19 = fontMetricsInt.top;
        canvas.drawText(this.f210784c, i17, (r4 + ((i18 + i19) / 2)) - i19, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f210782a.getAlpha() < 255 ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        android.graphics.Paint paint = this.f210782a;
        if (i17 != paint.getAlpha()) {
            paint.setAlpha(i17);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i17, int i18, int i19, int i27) {
        super.setBounds(i17, i18, i19, i27);
        android.graphics.Paint.FontMetrics fontMetrics = this.f210783b.getFontMetrics();
        int i28 = f210781h;
        this.f210788g = new android.graphics.RectF(i17 + i28, i18 + (fontMetrics.ascent - fontMetrics.top), i19 - i28, i27);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f210782a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
