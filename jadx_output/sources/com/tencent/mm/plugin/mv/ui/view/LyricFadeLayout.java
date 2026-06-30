package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes2.dex */
public class LyricFadeLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f151614d;

    /* renamed from: e, reason: collision with root package name */
    public int f151615e;

    /* renamed from: f, reason: collision with root package name */
    public int f151616f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f151617g;

    public LyricFadeLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        if (!this.f151617g) {
            return super.drawChild(canvas, view, j17);
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        boolean drawChild = super.drawChild(canvas, view, j17);
        canvas.drawRect(0.0f, 0.0f, this.f151615e, this.f151616f, this.f151614d);
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f151614d.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, i18, new int[]{-1, 0, -1}, new float[]{0.0f, 0.4f, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
        this.f151615e = i17;
        this.f151616f = i18;
    }

    public void setFade(boolean z17) {
        this.f151617g = z17;
        invalidate();
    }

    public LyricFadeLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f151614d = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f151614d.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
    }
}
