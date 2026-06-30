package com.tencent.mm.plugin.game.widget;

/* loaded from: classes3.dex */
public class TextViewWithBorder extends androidx.appcompat.widget.AppCompatTextView {
    public TextViewWithBorder(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(getResources().getColor(com.tencent.mm.R.color.f479192sg));
        canvas.drawRoundRect(new android.graphics.RectF(2.0f, 2.0f, getWidth() - 2, getHeight() - 2), 5.0f, 5.0f, paint);
        super.onDraw(canvas);
    }
}
