package uj3;

/* loaded from: classes9.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.z f428351d;

    public u(uj3.z zVar) {
        this.f428351d = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        uj3.z zVar = this.f428351d;
        com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView = zVar.f428396c;
        if (voIPRenderTextureView != null) {
            voIPRenderTextureView.setAlpha(0.0f);
        }
        com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView2 = zVar.f428396c;
        if (voIPRenderTextureView2 == null || (animate = voIPRenderTextureView2.animate()) == null || (alpha = animate.alpha(1.0f)) == null || (duration = alpha.setDuration(300L)) == null) {
            return;
        }
        duration.start();
    }
}
