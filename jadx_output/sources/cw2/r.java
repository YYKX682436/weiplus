package cw2;

/* loaded from: classes10.dex */
public final class r implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderAudioVolumeController f223960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f223961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f223962f;

    public r(com.tencent.mm.plugin.finder.video.FinderAudioVolumeController finderAudioVolumeController, float f17, android.content.Context context) {
        this.f223960d = finderAudioVolumeController;
        this.f223961e = f17;
        this.f223962f = context;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.plugin.finder.video.FinderAudioVolumeController finderAudioVolumeController = this.f223960d;
        finderAudioVolumeController.f130499m = floatValue;
        float f17 = finderAudioVolumeController.f130499m;
        float f18 = finderAudioVolumeController.f130505s;
        float f19 = (f17 - f18) / (1.0f - f18);
        float f27 = this.f223961e;
        finderAudioVolumeController.f130498i = (float) (f27 * java.lang.Math.pow(1.0d / f27, f19));
        float f28 = finderAudioVolumeController.f130502p;
        finderAudioVolumeController.f130500n = java.lang.String.valueOf(finderAudioVolumeController.U6(f28 + ((finderAudioVolumeController.f130504r - f28) * f19)));
        finderAudioVolumeController.V6(finderAudioVolumeController.f130500n, finderAudioVolumeController.f130504r);
        com.tencent.mars.xlog.Log.i("FinderAudioVolumeController", "animateChangeVolume curVolumeUpdateValue:" + finderAudioVolumeController.f130499m + " updatePercent:" + f19 + " curPlayerGainPercent:" + finderAudioVolumeController.f130498i + " curScaleGainStr:" + finderAudioVolumeController.f130500n + ' ');
        cw2.da S6 = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) ((com.tencent.mm.plugin.finder.viewmodel.component.nb0) pf5.u.f353936a.e(zy2.b6.class).c(com.tencent.mm.plugin.finder.viewmodel.component.nb0.class))).S6(this.f223962f);
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = S6 instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) S6 : null;
        if (finderThumbPlayerProxy != null) {
            finderThumbPlayerProxy.setVolume(finderAudioVolumeController.f130498i);
        }
    }
}
