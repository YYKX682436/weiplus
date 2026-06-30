package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes3.dex */
public class LoadingMoreView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f152259d;

    public LoadingMoreView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bpu, (android.view.ViewGroup) this, true);
        this.f152259d = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.i17);
        ((android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.im9)).setVisibility(0);
        android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(1000L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
        this.f152259d.startAnimation(rotateAnimation);
    }
}
