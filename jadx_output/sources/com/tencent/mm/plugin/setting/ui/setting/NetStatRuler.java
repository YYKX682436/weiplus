package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes10.dex */
class NetStatRuler extends android.view.View {
    public NetStatRuler(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setDither(true);
        textPaint.setTextSize(getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479936ji));
        android.graphics.Rect rect = new android.graphics.Rect();
        getDrawingRect(rect);
        float height = rect.height();
        float paddingLeft = rect.left + getPaddingLeft();
        int i17 = rect.top;
        textPaint.setColor(-7829368);
        canvas.drawText(com.tencent.mm.sdk.platformtools.t8.h0((com.tencent.mm.plugin.setting.ui.setting.NetStatUnit.f160153f * 2) / 3), paddingLeft, i17 + (height / 3.0f), textPaint);
        canvas.drawText(com.tencent.mm.sdk.platformtools.t8.h0(com.tencent.mm.plugin.setting.ui.setting.NetStatUnit.f160153f / 3), paddingLeft, i17 + ((2.0f * height) / 3.0f), textPaint);
        canvas.drawText(com.tencent.mm.sdk.platformtools.t8.h0(0L), paddingLeft, i17 + height, textPaint);
    }

    public NetStatRuler(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
