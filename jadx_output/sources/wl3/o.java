package wl3;

/* loaded from: classes15.dex */
public class o implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.view.MusicPlayerLyricView f447076d;

    public o(com.tencent.mm.plugin.music.ui.view.MusicPlayerLyricView musicPlayerLyricView) {
        this.f447076d = musicPlayerLyricView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.tencent.mm.plugin.music.ui.view.MusicPlayerLyricView musicPlayerLyricView = this.f447076d;
        musicPlayerLyricView.D = floatValue;
        musicPlayerLyricView.invalidate();
    }
}
