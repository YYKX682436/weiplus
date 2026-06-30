package com.tencent.mm.plugin.finder.view;

/* loaded from: classes4.dex */
public final class pc extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f132825a;

    public pc(int i17, float f17, float f18, int i18, float f19) {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f132825a = paint;
        paint.setColor(i17);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setShadowLayer(f19, f17, f18, i18);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        float height = getBounds().height();
        float f17 = getBounds().left;
        float f18 = getBounds().top;
        float f19 = getBounds().right;
        float f27 = getBounds().bottom;
        float f28 = height / 2.0f;
        float f29 = f17 + f28;
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(f29, f18);
        path.arcTo(f17, f18, f17 + (2 * f28), f27, 90.0f, 180.0f, false);
        path.lineTo(f19, f18);
        path.lineTo(f19, f27);
        path.lineTo(f29, f27);
        path.close();
        canvas.drawPath(path, this.f132825a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f132825a.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f132825a.setColorFilter(colorFilter);
    }
}
