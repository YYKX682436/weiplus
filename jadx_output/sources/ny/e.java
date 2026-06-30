package ny;

/* loaded from: classes3.dex */
public final class e extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ny.g f341373d;

    public e(ny.g gVar) {
        this.f341373d = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        ny.g gVar = this.f341373d;
        com.tencent.mars.xlog.Log.i("MicroMsg.BubbleFlyAnimationHelper", "Lift animation ended: animView.x=%.1f y=%.1f scaleX=%.2f scaleY=%.2f translationX=%.1f translationY=%.1f", java.lang.Float.valueOf(gVar.getX()), java.lang.Float.valueOf(gVar.getY()), java.lang.Float.valueOf(gVar.getScaleX()), java.lang.Float.valueOf(gVar.getScaleY()), java.lang.Float.valueOf(gVar.getTranslationX()), java.lang.Float.valueOf(gVar.getTranslationY()));
    }
}
