package sl1;

/* loaded from: classes5.dex */
public class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.music.MusicSeekBar f409230d;

    public b(com.tencent.mm.plugin.appbrand.widget.music.MusicSeekBar musicSeekBar) {
        this.f409230d = musicSeekBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.tencent.mm.plugin.appbrand.widget.music.MusicSeekBar musicSeekBar = this.f409230d;
        sl1.d dVar = musicSeekBar.f91763m;
        dVar.f409234d = floatValue;
        dVar.invalidateSelf();
        musicSeekBar.f91759f.setThumb(musicSeekBar.f91763m);
    }
}
