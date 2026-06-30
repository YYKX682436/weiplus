package rp1;

/* loaded from: classes10.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.animation.ObjectAnimator f398370a;

    public d0(com.tencent.mm.plugin.ball.view.FloatBallAudioWaveView floatBallAudioWaveView, boolean z17) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "percent", 0.1f, 1.0f);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.setDuration(floatBallAudioWaveView.f93451g);
        ofFloat.addListener(new rp1.c0(floatBallAudioWaveView, this));
        this.f398370a = ofFloat;
        if (z17) {
            ofFloat.start();
        }
    }
}
