package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes4.dex */
public class HighlightRectSideView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f159290d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Rect f159291e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f159292f;

    /* renamed from: g, reason: collision with root package name */
    public final int f159293g;

    /* renamed from: h, reason: collision with root package name */
    public final int f159294h;

    /* renamed from: i, reason: collision with root package name */
    public final int f159295i;

    /* renamed from: m, reason: collision with root package name */
    public int f159296m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f159297n;

    public HighlightRectSideView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f159296m = 0;
        this.f159297n = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.scanner.ui.o(this), true);
        android.graphics.Bitmap decodeResource = bp.b.decodeResource(getResources(), com.tencent.mm.R.drawable.ceu, null);
        int width = decodeResource.getWidth();
        this.f159293g = width;
        int height = decodeResource.getHeight();
        this.f159294h = height;
        if (height != width) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HighlightRectSideView", "width is not same as height");
        }
        int i17 = (width * 6) / 24;
        this.f159295i = i17;
        this.f159290d = new boolean[4];
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f159292f = paint;
        paint.setColor(6676738);
        paint.setAlpha(255);
        paint.setStrokeWidth(i17);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f159297n.c(300L, 300L);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f159297n;
        if (b4Var != null) {
            b4Var.d();
            this.f159297n = null;
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        boolean[] zArr;
        boolean z17;
        super.onDraw(canvas);
        int i17 = 0;
        while (true) {
            zArr = this.f159290d;
            if (i17 >= 4) {
                z17 = true;
                break;
            } else {
                if (!zArr[i17]) {
                    z17 = false;
                    break;
                }
                i17++;
            }
        }
        int i18 = this.f159295i / 2;
        boolean z18 = zArr[0];
        int i19 = this.f159294h;
        android.graphics.Paint paint = this.f159292f;
        if (z18 && (true == z17 || this.f159296m % 2 == 0)) {
            int i27 = this.f159291e.left;
            canvas.drawLine(i27 + i18, r0.top + i19, i27 + i18, r0.bottom - i19, paint);
        }
        if (zArr[1] && (true == z17 || this.f159296m % 2 == 0)) {
            int i28 = this.f159291e.right;
            canvas.drawLine(i28 - i18, r0.top + i19, i28 - i18, r0.bottom - i19, paint);
        }
        boolean z19 = zArr[2];
        int i29 = this.f159293g;
        if (z19 && (true == z17 || this.f159296m % 3 == 0)) {
            android.graphics.Rect rect = this.f159291e;
            float f17 = rect.left + i29;
            int i37 = rect.top;
            canvas.drawLine(f17, i37 + i18, rect.right - i29, i37 + i18, paint);
        }
        if (zArr[3]) {
            if (true == z17 || this.f159296m % 3 == 0) {
                android.graphics.Rect rect2 = this.f159291e;
                float f18 = rect2.left + i29;
                int i38 = rect2.bottom;
                canvas.drawLine(f18, i38 - i18, rect2.right - i29, i38 - i18, paint);
            }
        }
    }

    public void setMaskRect(android.graphics.Rect rect) {
        this.f159291e = rect;
    }

    public void setShowRectEdges(boolean[] zArr) {
        if (zArr == null || 4 != zArr.length) {
            return;
        }
        boolean z17 = zArr[0];
        boolean z18 = zArr[1];
        boolean z19 = zArr[2];
        boolean z27 = zArr[3];
        for (int i17 = 0; i17 < 4; i17++) {
            this.f159290d[i17] = zArr[i17];
        }
        invalidate();
    }
}
