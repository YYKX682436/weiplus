package com.tencent.youtu.ytagreflectlivecheck.ui;

/* loaded from: classes14.dex */
public class YTReflectLayout extends android.widget.RelativeLayout {
    private static java.lang.String TAG = "YTReflectLayout";
    private android.graphics.ColorMatrixColorFilter mColorMatrixColorFilter;
    private android.graphics.Paint mPaint;
    private android.graphics.Rect mRect;

    public YTReflectLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRect = new android.graphics.Rect();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.mPaint = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.mPaint.setColor(android.graphics.Color.argb(200, 0, 0, 0));
        this.mColorMatrixColorFilter = new android.graphics.ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        this.mPaint.setColorFilter(this.mColorMatrixColorFilter);
        this.mRect.set(0, 0, getWidth(), getHeight());
        canvas.drawRect(this.mRect, this.mPaint);
    }

    public void setColorMatrixColorFilter(android.graphics.ColorMatrixColorFilter colorMatrixColorFilter) {
        this.mColorMatrixColorFilter = colorMatrixColorFilter;
        invalidate();
    }
}
