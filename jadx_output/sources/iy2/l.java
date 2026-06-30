package iy2;

/* loaded from: classes13.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayoutImpl f295899d;

    public l(com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayoutImpl finderLiveVoiceInputLayoutImpl) {
        this.f295899d = finderLiveVoiceInputLayoutImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iy2.b bVar = this.f295899d.C;
        if (bVar != null) {
            bVar.f295880s = 4;
            android.animation.ValueAnimator valueAnimator = bVar.f295881t;
            valueAnimator.cancel();
            valueAnimator.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            valueAnimator.setDuration(1000L);
            valueAnimator.setRepeatCount(-1);
            valueAnimator.start();
        }
    }
}
