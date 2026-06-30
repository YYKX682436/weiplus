package mp5;

/* loaded from: classes9.dex */
public class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f330479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mp5.g f330480e;

    public f(mp5.g gVar, int i17) {
        this.f330480e = gVar;
        this.f330479d = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        mp5.g gVar = this.f330480e;
        if (gVar.f330482e.B != null) {
            gVar.f330482e.B.h4(this.f330479d - ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
