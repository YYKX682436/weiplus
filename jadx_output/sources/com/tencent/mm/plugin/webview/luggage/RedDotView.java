package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes3.dex */
public class RedDotView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f182139d;

    public RedDotView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f182139d = new android.graphics.Paint();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.graphics.Paint paint = this.f182139d;
        paint.setColor(-65536);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, getWidth() / 2, paint);
    }
}
