package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes2.dex */
public final class bd extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.u2 f116215a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f116216b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Paint f116217c;

    public bd(com.tencent.mm.plugin.finder.live.util.u2 gradientOrientation, int[] colorArray) {
        kotlin.jvm.internal.o.g(gradientOrientation, "gradientOrientation");
        kotlin.jvm.internal.o.g(colorArray, "colorArray");
        this.f116215a = gradientOrientation;
        this.f116216b = colorArray;
        this.f116217c = new android.graphics.Paint();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        float f17;
        float f18;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        int width = getBounds().width();
        int height = getBounds().height();
        int ordinal = this.f116215a.ordinal();
        if (ordinal != 0) {
            f18 = 0.0f;
            if (ordinal == 1) {
                f17 = width;
            } else if (ordinal != 2) {
                f17 = 0.0f;
            } else {
                f17 = 0.0f;
                f18 = height;
            }
        } else {
            f17 = width;
            f18 = height;
        }
        android.graphics.Paint paint = this.f116217c;
        paint.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, f17, f18, this.f116216b, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
        canvas.drawRect(new android.graphics.Rect(0, 0, getBounds().width(), getBounds().height()), paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
