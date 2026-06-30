package uj3;

/* loaded from: classes9.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.z f428344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f428345e;

    public s(uj3.z zVar, java.lang.String str) {
        this.f428344d = zVar;
        this.f428345e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator listener;
        uj3.z zVar = this.f428344d;
        com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView = zVar.f428396c;
        if (voIPRenderTextureView == null || (animate = voIPRenderTextureView.animate()) == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(300L)) == null || (listener = duration.setListener(new uj3.q(zVar, this.f428345e))) == null) {
            return;
        }
        listener.withStartAction(new uj3.r(zVar));
    }
}
