package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes3.dex */
public class StrokedImageView extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public int f159467d;

    public StrokedImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f159467d = context.getResources().getColor(com.tencent.mm.R.color.a3i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.graphics.Rect clipBounds = canvas.getClipBounds();
        clipBounds.left++;
        clipBounds.top++;
        clipBounds.bottom--;
        clipBounds.right--;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(this.f159467d);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(1.5f);
        canvas.drawRect(clipBounds, paint);
    }

    public void setStrokeColor(int i17) {
        this.f159467d = i17;
    }
}
