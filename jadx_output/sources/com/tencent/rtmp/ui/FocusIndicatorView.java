package com.tencent.rtmp.ui;

/* loaded from: classes3.dex */
public class FocusIndicatorView extends android.view.View {

    /* renamed from: a, reason: collision with root package name */
    final android.view.animation.ScaleAnimation f215277a;

    /* renamed from: b, reason: collision with root package name */
    private final android.graphics.Paint f215278b;

    /* renamed from: c, reason: collision with root package name */
    private final int f215279c;

    /* renamed from: d, reason: collision with root package name */
    private final android.graphics.Rect f215280d;

    public FocusIndicatorView(android.content.Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17 = this.f215279c / 2;
        android.graphics.Rect rect = this.f215280d;
        rect.left = i17;
        rect.top = i17;
        rect.right = getWidth() - i17;
        this.f215280d.bottom = getHeight() - i17;
        canvas.drawRect(this.f215280d, this.f215278b);
    }

    public FocusIndicatorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FocusIndicatorView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f215280d = new android.graphics.Rect();
        int i18 = (int) ((getResources().getDisplayMetrics().density * 1.0f) + 0.5f);
        this.f215279c = i18;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f215278b = paint;
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(i18);
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.3f, 1.0f, 1.3f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f215277a = scaleAnimation;
        scaleAnimation.setDuration(200L);
    }
}
