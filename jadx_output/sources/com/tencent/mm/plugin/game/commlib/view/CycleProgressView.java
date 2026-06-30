package com.tencent.mm.plugin.game.commlib.view;

/* loaded from: classes3.dex */
public class CycleProgressView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f139421d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f139422e;

    /* renamed from: f, reason: collision with root package name */
    public float f139423f;

    public CycleProgressView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f139421d = 0;
        this.f139422e = new android.graphics.Paint();
    }

    public int getProgress() {
        return this.f139421d;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        if (this.f139423f == 0.0f) {
            this.f139423f = (int) ((getWidth() / 2) * 0.167d);
        }
        float f17 = width;
        float f18 = this.f139423f;
        int i17 = (int) (f17 - (f18 / 2.0f));
        this.f139422e.setStrokeWidth(f18);
        this.f139422e.setColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.BW_0_Alpha_0_1));
        this.f139422e.setAntiAlias(true);
        this.f139422e.setStyle(android.graphics.Paint.Style.STROKE);
        canvas.drawCircle(f17, f17, i17, this.f139422e);
        this.f139422e.setStrokeWidth(this.f139423f);
        this.f139422e.setColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.aaw));
        float f19 = width - i17;
        float f27 = width + i17;
        canvas.drawArc(new android.graphics.RectF(f19, f19, f27, f27), -90.0f, (this.f139421d * com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) / 100, false, this.f139422e);
        this.f139422e.setStrokeWidth(0.0f);
        this.f139422e.setStyle(android.graphics.Paint.Style.FILL);
    }

    public void setProgress(int i17) {
        this.f139421d = java.lang.Math.max(0, i17);
        this.f139421d = java.lang.Math.min(i17, 100);
        invalidate();
    }

    public CycleProgressView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f139421d = 0;
        this.f139422e = new android.graphics.Paint();
    }
}
