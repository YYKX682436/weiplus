package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes13.dex */
public class ScanRectDecorView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.animation.ValueAnimator f159910d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f159911e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.view.RectView f159912f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Rect f159913g;

    /* renamed from: h, reason: collision with root package name */
    public int f159914h;

    /* renamed from: i, reason: collision with root package name */
    public int f159915i;

    /* renamed from: m, reason: collision with root package name */
    public float f159916m;

    public ScanRectDecorView(android.content.Context context) {
        super(context);
        this.f159916m = 0.0f;
        a();
    }

    public final void a() {
        this.f159914h = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a99);
        this.f159915i = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a98);
        com.tencent.mm.plugin.scanner.view.RectView rectView = new com.tencent.mm.plugin.scanner.view.RectView(getContext());
        this.f159912f = rectView;
        addView(rectView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        b();
        setWillNotDraw(false);
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        this.f159911e = imageView;
        addView(imageView, new android.widget.FrameLayout.LayoutParams(this.f159914h, -2));
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f159911e.getLayoutParams();
        layoutParams.gravity = 1;
        this.f159911e.setLayoutParams(layoutParams);
        this.f159911e.setBackgroundResource(com.tencent.mm.R.drawable.cdk);
        this.f159911e.setVisibility(8);
        this.f159916m = 0.15384616f;
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1300L);
        this.f159910d = duration;
        duration.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        this.f159910d.addListener(new com.tencent.mm.plugin.scanner.view.u0(this));
        this.f159910d.addUpdateListener(new com.tencent.mm.plugin.scanner.view.v0(this));
        this.f159910d.setRepeatMode(1);
        this.f159910d.setRepeatCount(-1);
    }

    public final void b() {
        android.graphics.Point point = new android.graphics.Point();
        ((android.app.Activity) getContext()).getWindowManager().getDefaultDisplay().getSize(point);
        int i17 = (point.x / 2) - (this.f159914h / 2);
        int i18 = (point.y / 2) - (this.f159915i / 2);
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, this.f159914h + i17, this.f159915i + i18);
        this.f159913g = rect;
        this.f159912f.setRect(rect);
    }

    public void c(int i17, int i18) {
        this.f159914h = i17;
        this.f159915i = i18;
        b();
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f159911e.getLayoutParams();
        layoutParams.width = i17;
        this.f159911e.setLayoutParams(layoutParams);
    }

    public android.graphics.Rect getDecorRect() {
        return this.f159913g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.ValueAnimator valueAnimator = this.f159910d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void setDecorRect(android.graphics.Rect rect) {
        if (rect != null) {
            this.f159914h = rect.width();
            this.f159915i = rect.height();
            this.f159913g = new android.graphics.Rect(rect);
        }
        this.f159912f.setRect(this.f159913g);
        this.f159912f.postInvalidate();
    }

    public ScanRectDecorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f159916m = 0.0f;
        a();
    }

    public ScanRectDecorView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f159916m = 0.0f;
        a();
    }
}
