package com.tencent.tencentmap.mapsdk.vector.compat.utils.a;

/* loaded from: classes4.dex */
public class l extends android.widget.TextView {

    /* renamed from: a, reason: collision with root package name */
    public int f215406a;

    /* renamed from: b, reason: collision with root package name */
    public int f215407b;

    public l(android.content.Context context) {
        super(context);
        this.f215406a = 0;
        this.f215407b = 0;
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        canvas.translate(this.f215407b / 2, this.f215406a / 2);
        super.draw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int max = java.lang.Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.f215406a = measuredWidth - measuredHeight;
            this.f215407b = 0;
        } else {
            this.f215406a = 0;
            this.f215407b = measuredHeight - measuredWidth;
        }
        setMeasuredDimension(max, max);
    }
}
