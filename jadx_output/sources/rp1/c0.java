package rp1;

/* loaded from: classes10.dex */
public final class c0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.FloatBallAudioWaveView f398363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rp1.d0 f398364e;

    public c0(com.tencent.mm.plugin.ball.view.FloatBallAudioWaveView floatBallAudioWaveView, rp1.d0 d0Var) {
        this.f398363d = floatBallAudioWaveView;
        this.f398364e = d0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.ball.view.FloatBallAudioWaveView floatBallAudioWaveView = this.f398363d;
        if (floatBallAudioWaveView.f93452h) {
            ((java.util.ArrayList) floatBallAudioWaveView.f93453i).remove(this.f398364e);
        }
    }
}
