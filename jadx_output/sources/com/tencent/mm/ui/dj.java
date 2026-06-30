package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class dj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.SplashWelcomeView f208343d;

    public dj(com.tencent.mm.ui.SplashWelcomeView splashWelcomeView) {
        this.f208343d = splashWelcomeView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.SplashWelcomeView splashWelcomeView = this.f208343d;
        android.widget.ImageView imageView = new android.widget.ImageView(splashWelcomeView.getContext());
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        imageView.setImageBitmap(splashWelcomeView.f197094g);
        imageView.setAlpha(0.0f);
        splashWelcomeView.addView(imageView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
        duration.addUpdateListener(new com.tencent.mm.ui.cj(this, imageView));
        duration.start();
        com.tencent.mars.xlog.Log.i("SplashWelcomeView", "start play animation");
    }
}
