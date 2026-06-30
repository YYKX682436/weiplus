package jm3;

/* loaded from: classes3.dex */
public final class n extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvMakerUI f300336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f300337e;

    public n(com.tencent.mm.plugin.mv.ui.MusicMvMakerUI musicMvMakerUI, yz5.a aVar) {
        this.f300336d = musicMvMakerUI;
        this.f300337e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        int i17 = com.tencent.mm.plugin.mv.ui.MusicMvMakerUI.f150868u;
        com.tencent.mm.plugin.mv.ui.MusicMvMakerUI musicMvMakerUI = this.f300336d;
        musicMvMakerUI.Y6().animate().alpha(0.0f).setDuration(200L).withEndAction(new jm3.m(musicMvMakerUI)).start();
        yz5.a aVar = this.f300337e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
